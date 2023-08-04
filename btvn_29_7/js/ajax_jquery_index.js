function getAllEmployees() {
    $.ajax({
        type: "GET",
        headers: {
            'Accept': 'application/json'
        },
        url: "http://localhost:8080/employees",
        success: function (employees) {
            showEmployee(employees)
        },
        error: function (err) {
            console.log(err)
        }
    })
}

let idEmployee;

function showEmployee(employees) {
    let str = "";
    str += `<tr>
                    <th>Mã nhân viên </th>
                    <th>Tên nhân viên </th>
                    <th>Tuổi </th>
                    <th>Lương </th>
                    <th>Phòng ban </th>
                    <th colspan="2">Chức năng</th>
                </tr>`

    for (const employee of employees) {
        let objs = JSON.stringify(employee);
        str += `<tr>
                    <td>${employee.employeeCode} </td>
                    <td><button onclick="findEmployeeById(${employee.id})">${employee.name}</button></td>
                    <td>${employee.age} </td>
                    <td>${employee.salary} </td>
                    <td>${employee.branch.name} </td>
                    <td> </td>
                    <td> <button onclick='edit(${objs})'>Sửa</button>
                        <button  onclick="del(${employee.id})">Xóa</button>
                    </td>
                  </tr>`
        document.getElementById("employees").innerHTML = str;
        document.getElementById("employees").style.display = "block";
        document.getElementById("employeeDetail").style.display = "none";
        // $("#employees").html(str);
    }
}


    function getAllBranchCreate() {
        $.ajax({
            type: "GET",
            headers: {
                'Accept': 'application/json'
            },
            url: "http://localhost:8080/branch",
            success: function (branch) {
                let str = "";
                for (const b of branch) {
                    str += `<option value="${b.id}">${b.name}</option>`
                }
                $("#branch").html(str);
            },
            error: function (err) {
                console.log(err)
            }
        })
    }


    function save() {
        let id = $("#idEmployee").val();
        let code = $("#code").val();
        let name = $("#name").val();
        let age = $("#age").val();
        let salary = $("#salary").val();
        let branch = $("#branch").val();

        let employee = {
            id: id,
            employeeCode: code,
            name: name,
            age: age,
            salary: salary,
            branch: {
                id: branch
            }
        }
        $.ajax({
            type: "POST",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            url: "http://localhost:8080/employees",
            data: JSON.stringify(employee),
            success: function (employees) {
                getAllEmployees();
            },
            error: function (err) {
                console.log(err);
            }
        })
        resetModal();
    }


    function edit(obj) {
        $("#myModal").modal("show");
        $("#idEmployee").val(obj.id);
        $("#code").val(obj.employeeCode);
        $("#name").val(obj.name);
        $("#age").val(obj.age);
        $("#salary").val(obj.salary);
        $("#branchOld").val(obj.branch.branch);
    }

    function resetModal() {

        $("#idEmployee").val("");
        $("#code").val("");
        $("#name").val("");
        $("#age").val("");
        $("#salary").val("");
        $("#branch").val("");
    }


    function del(id) {
        let ids = id;
        $.ajax({
            type: "GET",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            url: "http://localhost:8080/employees/delete/" + ids,


            success: function (mess) {
                getAllEmployees();
            },
            error: function (err) {
                console.log(err);
            }
        })
    }


    function findEmployeeById(id) {
        // window.location.href = "../employeeDetail.html"
        $.ajax({
            type: "GET",
            url: `http://localhost:8080/employees/${id}`,
            data: JSON.stringify(id),
            success: function (employee) {
                console.log(id)
                employeeDetail(employee);
            },
            error: function (err) {
                console.log(err);
            }
        })
    }

    function employeeDetail(employee) {
        let str = `        <h2>Employee Detail</h2>

            <table border="1px" style=" height: 300px">

      <tr>
                <td style="width: 130px">Mã nhân viên :</td>
                <td>${employee.employeeCode}</td>
            </tr>
            <tr >
                <td style="width: 130px">Tên nhân viên :</td>
                <td>${employee.name}</td>

            </tr>
            <tr>
                <td style="width: 130px">Lương nhân viên :</td>
                <td>${employee.salary}</td>

            </tr>
            <tr>
                <td style="width: 130px">Tuổi :</td>
                <td>${employee.age}</td>

            </tr>
            <tr>
                <td style="width: 130px">Phòng ban :</td>
                <td>${employee.branch.name}</td>

            </tr>
            <tr>
                <td style="width: 130px" colspan="2">
                    <a onclick="getAllEmployees()">  Back to list </a>
                </td>
            </tr>
            </table>`

        $("#employeeDetail").html(str);
        document.getElementById("employeeDetail").style.display = "block";
        document.getElementById("employees").style.display = "none";

    }


