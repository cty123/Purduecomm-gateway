CREATE TABLE `auth_user` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `access_token` varchar(100) NOT NULL,
    `biz_user_id` varchar(100) NOT NULL,
    `biz_type` tinyint(2) NOT NULL,
    `created_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `last_modified_date` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY auth_user_biz_type_biz_user_id(`biz_user_id`, `biz_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
