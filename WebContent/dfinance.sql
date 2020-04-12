/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : dfinance

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-04-12 17:45:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `adminname` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '廖志华', '123456');

-- ----------------------------
-- Table structure for budget
-- ----------------------------
DROP TABLE IF EXISTS `budget`;
CREATE TABLE `budget` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `wtime` varchar(20) DEFAULT NULL,
  `wnum` int(10) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of budget
-- ----------------------------
INSERT INTO `budget` VALUES ('1', '2020-02-08', '12', '2');
INSERT INTO `budget` VALUES ('2', '2020-04', '122', '2');
INSERT INTO `budget` VALUES ('3', '2020-04', '12000', '1');

-- ----------------------------
-- Table structure for daycount
-- ----------------------------
DROP TABLE IF EXISTS `daycount`;
CREATE TABLE `daycount` (
  `dayname` int(10) DEFAULT NULL,
  `moneyname` int(10) DEFAULT NULL,
  `categoryname` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of daycount
-- ----------------------------

-- ----------------------------
-- Table structure for memorandum
-- ----------------------------
DROP TABLE IF EXISTS `memorandum`;
CREATE TABLE `memorandum` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `recordtime` varchar(10) DEFAULT NULL,
  `thingpath` varchar(255) DEFAULT NULL,
  `topfont` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of memorandum
-- ----------------------------
INSERT INTO `memorandum` VALUES ('1', '2020-04-09', '/3/13/b90aaf9b-60d6-416d-963d-af3835b85807.txt', 'f dgfds \r\n', '2');
INSERT INTO `memorandum` VALUES ('2', '2020-04-09', '/3/0/fb3c69ee-60f9-4ed2-b6e4-b07ca2b65616.txt', 'dsf \r\n', '2');
INSERT INTO `memorandum` VALUES ('3', '2020-04-09', '/5/6/bc1c530b-fcfd-452d-81c1-5e68790f912a.txt', 'fsdfdsfgdsfg\r\n', '2');
INSERT INTO `memorandum` VALUES ('5', '2020-04-09', '/4/12/2101ca4d-999c-4c71-999a-2add15d0e7e3.txt', 'sf \r\n', '1');

-- ----------------------------
-- Table structure for monthanalysis
-- ----------------------------
DROP TABLE IF EXISTS `monthanalysis`;
CREATE TABLE `monthanalysis` (
  `incomerecordcount` int(10) DEFAULT NULL,
  `spendsrecordcount` int(10) DEFAULT NULL,
  `incomemoney` int(10) DEFAULT NULL,
  `spendmoney` int(10) DEFAULT NULL,
  `allmoney` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of monthanalysis
-- ----------------------------

-- ----------------------------
-- Table structure for monthcount
-- ----------------------------
DROP TABLE IF EXISTS `monthcount`;
CREATE TABLE `monthcount` (
  `monthname` int(10) DEFAULT NULL,
  `moneyname` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of monthcount
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `nid` int(11) NOT NULL AUTO_INCREMENT,
  `ntitle` varchar(50) DEFAULT NULL,
  `author` varchar(10) DEFAULT NULL,
  `keyword` varchar(255) DEFAULT NULL,
  `visitcount` int(11) DEFAULT NULL,
  `recordtime` date DEFAULT NULL,
  `ncontent` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '发生', '发生', '发顺丰', '0', '2020-04-09', '/upload/news/4/6/c2e40866-9932-4163-a9f1-84a0c5728fcc.txt');
INSERT INTO `news` VALUES ('2', 'd发士大夫释放', '范德萨发', '发顺丰', '0', '2020-04-10', '/upload/news/10/2/f7bda32b-e764-4c5c-81a4-cae158ed738d.txt');

-- ----------------------------
-- Table structure for pagebean
-- ----------------------------
DROP TABLE IF EXISTS `pagebean`;
CREATE TABLE `pagebean` (
  `startposition` int(10) DEFAULT NULL,
  `currentpage` int(10) DEFAULT NULL,
  `allpage` int(10) DEFAULT NULL,
  `pagerecord` int(10) DEFAULT NULL,
  `allrecord` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pagebean
-- ----------------------------

-- ----------------------------
-- Table structure for shouzhirecordqueryvo
-- ----------------------------
DROP TABLE IF EXISTS `shouzhirecordqueryvo`;
CREATE TABLE `shouzhirecordqueryvo` (
  `uid` int(11) NOT NULL,
  `startposition` int(10) DEFAULT NULL,
  `pagerecord` int(10) DEFAULT NULL,
  `srz_date` varchar(25) DEFAULT NULL,
  `srz_comment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shouzhirecordqueryvo
-- ----------------------------

-- ----------------------------
-- Table structure for shouzhi_category
-- ----------------------------
DROP TABLE IF EXISTS `shouzhi_category`;
CREATE TABLE `shouzhi_category` (
  `szcid` int(11) NOT NULL AUTO_INCREMENT,
  `parent_category` varchar(20) DEFAULT NULL,
  `son_category` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`szcid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shouzhi_category
-- ----------------------------
INSERT INTO `shouzhi_category` VALUES ('1', '收入', 'fsf');
INSERT INTO `shouzhi_category` VALUES ('2', '收入', 'fs fs ');
INSERT INTO `shouzhi_category` VALUES ('3', '收入', 'fs fs ');
INSERT INTO `shouzhi_category` VALUES ('4', '收入', 'fs fs f');
INSERT INTO `shouzhi_category` VALUES ('5', '收入', 'fs fs f');
INSERT INTO `shouzhi_category` VALUES ('6', '收入', 'fds ');
INSERT INTO `shouzhi_category` VALUES ('7', '收入', 'fds ');
INSERT INTO `shouzhi_category` VALUES ('8', '支出', '反对');

-- ----------------------------
-- Table structure for shouzhi_record
-- ----------------------------
DROP TABLE IF EXISTS `shouzhi_record`;
CREATE TABLE `shouzhi_record` (
  `szrid` int(11) NOT NULL AUTO_INCREMENT,
  `szr_num` int(10) DEFAULT NULL,
  `szr_date` date DEFAULT NULL,
  `szr_comment` varchar(255) DEFAULT NULL,
  `shouzhi_category_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`szrid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shouzhi_record
-- ----------------------------
INSERT INTO `shouzhi_record` VALUES ('1', '12', '2020-04-09', 'fsdf', '4', '1');
INSERT INTO `shouzhi_record` VALUES ('2', '12', '2020-04-09', 'fsdf', '1', '1');
INSERT INTO `shouzhi_record` VALUES ('4', '12', '2020-04-10', '发生', '1', '2');
INSERT INTO `shouzhi_record` VALUES ('5', '-12', '2020-04-10', '东方', '8', '2');
INSERT INTO `shouzhi_record` VALUES ('6', '12', '2020-04-10', '反对', '1', '2');
INSERT INTO `shouzhi_record` VALUES ('7', '12', '2020-04-11', 'fdf', '1', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(120) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '廖志华', '123456', '男', '2424753284@qq.com', '18773412613');
INSERT INTO `user` VALUES ('2', 'John', '123456', '男', '2629615164@qq.com', '1877');
INSERT INTO `user` VALUES ('3', 'test', '123456', '男', '2629615164@qq.com', '18773412613');
INSERT INTO `user` VALUES ('4', '廖志', '123456', '男', '2629615164@qq.com', '18773412613');

-- ----------------------------
-- Table structure for wishlist
-- ----------------------------
DROP TABLE IF EXISTS `wishlist`;
CREATE TABLE `wishlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wid` varchar(20) DEFAULT NULL,
  `wish` varchar(255) DEFAULT NULL,
  `wnum` int(11) DEFAULT NULL,
  `wdate` varchar(20) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wishlist
-- ----------------------------
INSERT INTO `wishlist` VALUES ('1', '1', '发顺丰', '12', '2020-8-8', '发顺丰', '1');
