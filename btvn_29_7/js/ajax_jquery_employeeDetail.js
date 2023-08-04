

function findEmployeeById(){
    let  id = localStorage.getItem('idEmployee');
    ids = JSON.parse(id);
    $.ajax({
        type: "GET",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url: "http://localhost:8080/employees/detail/" + id,
        data: JSON.stringify(id),
        success: function (employee) {
            employeeDetail(employee) ;
        },
        error: function (err) {
            console.log(err);
        }
    })
}
function employeeDetail(employee){
    let str = "";

    str +=`  <tr>
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
                    <a href="/index.html">  Back to list </a>
                </td>
            </tr>`
    // document.getElementById("#employeeDetail").innerHTML = str;
    $("#employeeDetail").html(str);
}
