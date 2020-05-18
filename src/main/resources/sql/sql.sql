/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50707
Source Host           : 127.0.0.1:3306
Source Database       : sql

Target Server Type    : MYSQL
Target Server Version : 50707
File Encoding         : 65001

Date: 2020-05-18 09:39:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `name` varchar(50) NOT NULL COMMENT '管理员名字',
  `password` varchar(50) NOT NULL COMMENT '管理员密码',
  `sex` varchar(50) NOT NULL COMMENT '管理员性别',
  `age` int(11) NOT NULL COMMENT '管理员年龄',
  `tel` varchar(50) DEFAULT NULL COMMENT '管理员固定电话',
  `phone` varchar(50) DEFAULT NULL COMMENT '管理员手机号码',
  `addr` varchar(50) NOT NULL COMMENT '管理员地址',
  `memo` varchar(100) DEFAULT NULL COMMENT '管理员备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'MTIzNDU2Nzg=', '男', '24', '7878990', '134338868', '广州增城', '111');
INSERT INTO `admin` VALUES ('2', 'Adminstor', 'MTIzNDU2', '男', '25', '8788184', '13596285942', '物业', '111');
INSERT INTO `admin` VALUES ('3', 'admin2', 'MTIzNDU2', '男', '22', '8788184', '13596285932', '物业', '111');

-- ----------------------------
-- Table structure for `custom_account`
-- ----------------------------
DROP TABLE IF EXISTS `custom_account`;
CREATE TABLE `custom_account` (
  `accountid` int(32) NOT NULL AUTO_INCREMENT COMMENT '业户账户id',
  `username` varchar(50) NOT NULL COMMENT '业户账户用户名',
  `password` varchar(50) NOT NULL COMMENT '业户账户密码',
  `ownerid` varchar(50) NOT NULL COMMENT '业户账户中业主编码',
  `carid` varchar(50) DEFAULT NULL COMMENT '业户账户中业主的车牌号',
  PRIMARY KEY (`accountid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custom_account
-- ----------------------------
INSERT INTO `custom_account` VALUES ('1', '陈胜', 'MTIzNDU2', '100001', '粤D·89985');
INSERT INTO `custom_account` VALUES ('2', '王五', 'MTIzNDU2', '100002', '');

-- ----------------------------
-- Table structure for `house`
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '房产id',
  `num` varchar(50) NOT NULL COMMENT '房产门牌号',
  `dep` varchar(50) NOT NULL COMMENT '房产表楼号',
  `type` varchar(50) NOT NULL COMMENT '房产表类型',
  `area` varchar(50) NOT NULL COMMENT '房产表地区',
  `sell` varchar(50) NOT NULL COMMENT '房产表出售状况',
  `unit` varchar(50) NOT NULL COMMENT '房产表单元',
  `floor` varchar(50) NOT NULL COMMENT '房产表楼层',
  `direction` varchar(50) NOT NULL COMMENT '房产表朝向',
  `memo` varchar(100) DEFAULT NULL COMMENT '房产表备注',
  `ownerid` varchar(32) DEFAULT NULL COMMENT '房产表业主编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '106', 'A3', '独栋', '广州增城', '待售', 'B6', '1楼', '南', '', '');
INSERT INTO `house` VALUES ('2', '308', 'A栋', '多层', 'A区', '已售', '1单元', '3', '南', '111', '100002');

-- ----------------------------
-- Table structure for `inspection`
-- ----------------------------
DROP TABLE IF EXISTS `inspection`;
CREATE TABLE `inspection` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '巡查人id',
  `person` varchar(50) NOT NULL COMMENT '巡查人姓名',
  `type` varchar(50) NOT NULL COMMENT '巡查类别',
  `itime` date NOT NULL COMMENT '巡查时间',
  `conductor` varchar(32) NOT NULL COMMENT '巡查处理人',
  `party` varchar(50) NOT NULL COMMENT '巡查当事人',
  `result` varchar(50) NOT NULL COMMENT '巡查结果',
  `memo` varchar(100) DEFAULT NULL COMMENT '巡查情况备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inspection
-- ----------------------------
INSERT INTO `inspection` VALUES ('1', '陈小', '保安', '2020-03-06', '物业', '陈小', '一切安全，无意外发生', '无');

-- ----------------------------
-- Table structure for `maintain`
-- ----------------------------
DROP TABLE IF EXISTS `maintain`;
CREATE TABLE `maintain` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '保修单ID',
  `thing` varchar(50) NOT NULL COMMENT '保修物品',
  `status` varchar(50) NOT NULL COMMENT '报修单状态',
  `homesnumber` varchar(50) NOT NULL COMMENT '保修房门号',
  `sdate` date NOT NULL COMMENT '保修时间',
  `rdate` date DEFAULT NULL COMMENT '维修时间',
  `tcost` double(11,0) NOT NULL COMMENT '保修预计花费',
  `scost` double(11,0) DEFAULT NULL COMMENT '实际花费',
  `maintainer` varchar(32) NOT NULL COMMENT '报修人',
  `smemo` varchar(100) DEFAULT NULL COMMENT '保修详情',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of maintain
-- ----------------------------
INSERT INTO `maintain` VALUES ('1', '电灯', '等待处理', '808', '2020-03-06', '2020-03-07', '25', '20', '陈力', '只是普通的电灯更换');
INSERT INTO `maintain` VALUES ('2', '电灯', '已完成', 'A309', '2020-03-26', '2020-03-26', '25', '25', '王五', '');
INSERT INTO `maintain` VALUES ('3', '电灯', '已完成', 'A309', '2020-03-26', '2020-03-26', '20', '20', '王五', '');
INSERT INTO `maintain` VALUES ('4', '电灯', '已完成', 'A309', '2020-03-26', '2020-03-25', '20', '15', '王五', '电路老旧，维护');
INSERT INTO `maintain` VALUES ('6', '空调', '等待处理', 'A309', '2020-03-26', null, '890', '0', '王五', '');

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '公告表id',
  `content` varchar(300) NOT NULL COMMENT '公告内容',
  `ndate` date NOT NULL COMMENT '公告发布日期',
  `title` varchar(50) NOT NULL COMMENT '公告题目',
  `uper` varchar(32) NOT NULL COMMENT '公告发布者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '要时刻待在家里不能出门，出门一定要带上口罩，进出小区需要进行额头温度测量，否则不得进入小区。', '2020-03-06', '新型冠状病毒', '物业');
INSERT INTO `notice` VALUES ('2', '疫情尚未完全解除，请勿躁动', '2020-03-26', '新冠状病毒', 'admin');
