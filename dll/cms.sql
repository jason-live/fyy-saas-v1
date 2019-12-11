-- ----------------------------
--  Table structure for `cms_category`
--  品类表
-- ----------------------------
CREATE TABLE cms_category (
  `id` bigint UNSIGNED NOT NULL COMMENT '主键ID',
  `pid` bigint UNSIGNED NOT NULL COMMENT '父ID, 0-表示第一层级',
  `name` varchar(64) comment '名称',
  `first_letter` varchar(64) comment '中文首字母',
  `nav_status` int(1) comment '是否显示在导航栏：0->不显示；1->显示',
  `show_status` int(1) comment '显示状态：0->不显示；1->显示',
  `sort` int comment '排序',
  `icon` varchar(255) comment '图标',
  `keywords` varchar(255) comment '关键字',
  `description` text comment '描述',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  `sub_create` bigint NOT NULL DEFAULT 0 COMMENT '记录创建人',
  `sub_modified` bigint NOT NULL DEFAULT 0 COMMENT '记录修改人',
  `is_delete` tinyint(2) NOT NULL DEFAULT 0 COMMENT '类型: 0-未删除 1-删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `uk_title_pid` (`name`, `pid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='品类表';