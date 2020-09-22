-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `nick_name` varchar(60) NULL COMMENT '用户昵称',
  `account_no` varchar(60) NOT NULL COMMENT '登录账号',
  `password` varchar(60) NOT NULL COMMENT '密码',
  `status` tinyint(1) NOT NULL COMMENT '状态（1、启用；2、禁用）',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` varchar(60) NULL COMMENT '创建人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_user` varchar(60) NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='系统用户表';

INSERT INTO `t_user` VALUES (1, '管理员', 'admin', '111111', 1, '2020-09-17 15:15:17', NULL, '2020-09-17 15:15:17', NULL);