/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : mybatistest

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 06/06/2022 09:39:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `isState` tinyint(255) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `explain` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `points` int(255) NULL DEFAULT NULL,
  `currentNum` int(255) NULL DEFAULT NULL,
  `maxNum` int(255) NULL DEFAULT NULL,
  `stateTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('298958', 'https://img1.baidu.com/it/u=902830885,4052311299&fm=253&fmt=auto&app=120&f=JPEG?w=889&h=500', 1, '131231', '1', 1, 1, 1, '1');
INSERT INTO `commodity` VALUES ('51057', 'https://img1.baidu.com/it/u=902830885,4052311299&fm=253&fmt=auto&app=120&f=JPEG?w=889&h=500', 1, '1', '1', 1, 1, 1, '1');
INSERT INTO `commodity` VALUES ('542584', 'https://img1.baidu.com/it/u=902830885,4052311299&fm=253&fmt=auto&app=120&f=JPEG?w=889&h=500', 1, '你好', '1', 1, 1, 1, '1');

SET FOREIGN_KEY_CHECKS = 1;
