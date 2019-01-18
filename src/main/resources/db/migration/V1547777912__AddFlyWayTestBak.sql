CREATE TABLE `flyway_test_bak` (
  `id`    int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `name`  varchar(32)  NOT NULL DEFAULT '' COMMENT '名称',
  `age`   tinyint(3) NOT NULL COMMENT '年龄',
  `email` varchar(128) NOT NULL DEFAULT '' COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='flyway测试表备份';
