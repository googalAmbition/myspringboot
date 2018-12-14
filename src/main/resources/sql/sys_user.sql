/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : world

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-12-14 14:04:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '登录名',
  `parent_id` varchar(32) DEFAULT NULL COMMENT '父id',
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FKl6y9o1vwawvu2w5o3pgioj3yd` (`parent_id`),
  CONSTRAINT `FKl6y9o1vwawvu2w5o3pgioj3yd` FOREIGN KEY (`parent_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('0', '0', null, '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('10', '10', '0', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('1001', '1001', '10', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('100101', '100101', '1001', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('10010101', '10010101', '100101', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('1001010101', '1001010101', '10010101', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('10010102', '10010102', '100101', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('100102', '100102', '1001', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('1002', '1002', '10', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('20', '20', '0', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('2001', '2001', '20', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('200101', '200101', '2001', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('20010101', '20010101', '200101', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('20010102', '20010102', '200101', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('200102', '200102', '2001', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('2002', '2002', '20', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('2003', '2003', '20', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('30', '30', '0', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('3001', '3001', '30', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('3002', '3002', '30', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('300201', '300201', '3002', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('300202', '300202', '3002', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('300203', '300203', '3002', '2018-12-03 13:19:46');
INSERT INTO `sys_user` VALUES ('30020301', '30020301', '300203', '2018-12-03 13:19:46');
