-- role
INSERT INTO `caseModule4`.`role` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `caseModule4`.`role` (`id`, `name`) VALUES ('2', 'ROLE_USER');

-- status
INSERT INTO `caseModule4`.`status` (`id`, `status`) VALUES ('1', 'online');
INSERT INTO `caseModule4`.`status` (`id`, `status`) VALUES ('2', 'offline');
INSERT INTO `caseModule4`.`status` (`id`, `status`) VALUES ('3', 'away');

-- video
INSERT INTO `caseModule4`.`video` (`id`, `url`) VALUES ('1', 'video');
INSERT INTO `caseModule4`.`video` (`id`, `url`) VALUES ('2', 'videos');

-- image
INSERT INTO `caseModule4`.`image` (`id`, `url`) VALUES ('1', 'image');
INSERT INTO `caseModule4`.`image` (`id`, `url`) VALUES ('2', 'image2');

-- account
INSERT INTO `caseModule4`.`account` (`id`, `about_me`, `avatar`, `birthday`, 
`country`, `cover_photo`, `created_at`, `email`, `gender`, `password`, `phone`, 
`username`, `role_id`, `status_account_id`, `status_chat_id`, `status_profile_id`)
 VALUES ('1', 'Giới thiệu', 'urlAvatar', '2000/02/02', 'Việt Nam', '???', '2020/02/02',
 'NguyenVanA@gmail.com', 'Male', '123', '0901234567', 'nguyenVanA', '1', '1', '1', '1');
INSERT INTO `caseModule4`.`account` (`id`, `about_me`, `avatar`, `birthday`, `country`, 
`cover_photo`, `created_at`, `email`, `gender`, `password`, `phone`, `username`, `role_id`, 
`status_account_id`, `status_chat_id`, `status_profile_id`) VALUES ('2', 'Giới thiệu2', 
'urlAvatar2', '2000/02/02', 'Việt Nam', '???', '2020/02/02', 'NguyenVanB@gmail.com', 
'Female', '123', NULL, 'NguyenVanB', '2', '2', '2', '2');

-- post
INSERT INTO `caseModule4`.`post` (`content`, `create_at`, `account_id`, `privacy_id`) VALUES ('content1', '2002/2/2', '1', '1');
INSERT INTO `caseModule4`.`post` (`content`, `create_at`, `account_id`) VALUES ('content2', '2002/2/2', '2');

-- massage
INSERT INTO `caseModule4`.`message` (`content`, `create_at`, `receiver_id`, `sender_id`) VALUES ('content1', '2002/2/2', '1', '1');
INSERT INTO `caseModule4`.`message` (`content`, `create_at`, `receiver_id`) VALUES ('content2', '2003/2/2', '2');

-- notification
INSERT INTO `caseModule4`.`notification` (`content`, `create_at`, `account_id`) VALUES ('content1', '2002/2/2', '1');
INSERT INTO `caseModule4`.`notification` (`content`, `create_at`) VALUES ('content2', '2003/3/3');

-- friendship
INSERT INTO `caseModule4`.`friendship` (`create_at`, `friend_id`, `status_id`, `user_id`) VALUES ('2002/2/2', '1', '1', '1');
INSERT INTO `caseModule4`.`friendship` (`create_at`, `friend_id`, `status_id`) VALUES ('2020/2/2', '2', '2');

-- comment
INSERT INTO `caseModule4`.`comment` (`id`, `content`, `created_at`, `account_id`, `post_id`) VALUES ('1', 'content1', '2002/2/2', '1', '1');
INSERT INTO `caseModule4`.`comment` (`content`, `created_at`, `account_id`, `post_id`) VALUES ('content2', '2002/3/3', '2', '2');

-- friend_request
INSERT INTO `caseModule4`.`friend_request` (`created_at`, `receiver_id`, `sender_id`, `status_id`) VALUES ('2002/2/2', '1', '1', '1');
INSERT INTO `caseModule4`.`friend_request` (`created_at`, `receiver_id`, `sender_id`) VALUES ('2003/3/2', '2', '2');

-- post_video_list
INSERT INTO `caseModule4`.`post_video_list` (`post_id`, `video_list_id`) VALUES ('1', '1');
INSERT INTO `caseModule4`.`post_video_list` (`post_id`, `video_list_id`) VALUES ('2', '2');

-- post_image_list
INSERT INTO `caseModule4`.`post_image_list` (`post_id`, `image_list_id`) VALUES ('1', '1');
INSERT INTO `caseModule4`.`post_image_list` (`post_id`, `image_list_id`) VALUES ('2', '2');