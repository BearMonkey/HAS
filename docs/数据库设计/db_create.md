#创建数据库has_db
CREATE DATABASE IF NOT EXISTS `has_db` DEFAULT CHARSET utf8 COLLATE utf8_bin;

CREATE USER app_has@'%' IDENTIFIED BY 'has_db';
