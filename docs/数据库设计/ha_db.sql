/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : has_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-06-28 15:10:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ha`
-- ----------------------------
DROP TABLE IF EXISTS `ha`;
CREATE TABLE `ha` (
`id`  int(8) NOT NULL ,
`model`  char(16) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '电器型号' ,
`price`  decimal(10,2) NULL DEFAULT NULL COMMENT '价格' ,
`inventory`  int(11) NULL DEFAULT NULL COMMENT '库存' ,
`brands_id`  int(8) NULL DEFAULT NULL COMMENT '品牌编号' ,
`type_id`  int(8) NULL DEFAULT NULL COMMENT '类型编号' ,
`creator_id`  int(8) NULL DEFAULT NULL COMMENT '创建者编号' ,
`create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '记录状态y/n' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_bin
COMMENT='家电表'

;

-- ----------------------------
-- Records of ha
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `ha_brands`
-- ----------------------------
DROP TABLE IF EXISTS `ha_brands`;
CREATE TABLE `ha_brands` (
`id`  int(8) NOT NULL COMMENT '自增主键' ,
`brands_no`  char(8) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户自定义品牌编号' ,
`brands_name`  varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '品牌名称' ,
`creator_id`  int(8) NULL DEFAULT NULL COMMENT '创建人id' ,
`create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '记录状态 y: 使用中, n:冻结' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_bin
COMMENT='家电品牌表'

;

-- ----------------------------
-- Records of ha_brands
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `ha_type`
-- ----------------------------
DROP TABLE IF EXISTS `ha_type`;
CREATE TABLE `ha_type` (
`id`  int(8) NOT NULL COMMENT '自增主键' ,
`type_no`  char(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户自定义编号' ,
`type_name`  varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '家电名称' ,
`creator_id`  int(8) NULL DEFAULT NULL COMMENT '创建人id' ,
`create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '使用状态 y:使用中，n:冻结' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_bin
COMMENT='家电类型表'

;

-- ----------------------------
-- Records of ha_type
-- ----------------------------
BEGIN;
COMMIT;
