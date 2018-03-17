/*==============================================================*/
/* DBMS name:      MySQL 4.0                                    */
/* Created on:     2018/3/17 13:44:34                           */
/*==============================================================*/


drop table if exists fd_seat;

drop table if exists fd_stand_info;

drop table if exists fd_venue;

drop table if exists fl_city;

drop table if exists fl_company;

drop table if exists fl_dictionary;

drop table if exists fl_function;

drop table if exists fl_log;

drop table if exists fl_privilege;

drop table if exists fl_province;

drop table if exists fl_role;

drop table if exists fl_user;

drop table if exists pj_order;

drop table if exists pj_perform;

drop table if exists pj_project;

drop table if exists pj_ticket;

/*==============================================================*/
/* Table: fd_seat                                               */
/*==============================================================*/
create table fd_seat
(
   id                             bigint                         not null AUTO_INCREMENT,
   row_no                         tinyint                        not null,
   col_no                         tinyint                        not null,
   floor                          tinyint                        not null default 1,
   entrance                       varchar(50)                    default NULL,
   status                         tinyint                        not null default 1,
   create_date                    datetime                       not null,
   modify_date                    datetime                       not null,
   venue_id                       bigint                         not null,
   primary key (id)
);

/*==============================================================*/
/* Table: fd_stand_info                                         */
/*==============================================================*/
create table fd_stand_info
(
   id                             bigint                         not null AUTO_INCREMENT,
   venue_id                       bigint                         not null,
   stand_name                     nvarchar(128)                  not null,
   capability                     nvarchar(64)                   not null,
   remark                         nvarchar(512)                  not null,
   primary key (id)
)comment = '定义了演出场所的看台信息,包括包,看台在演出场所的座位范围等。';

/*==============================================================*/
/* Table: fd_venue                                              */
/*==============================================================*/
create table fd_venue
(
   id                             bigint(20)                     not null AUTO_INCREMENT,
   venue_name                     varchar(255)                   not null,
   city_id                        bigint(20)                     not null,
   venue_address                  varchar(100)                   default NULL,
   create_date                    datetime                       not null,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_city                                               */
/*==============================================================*/
create table fl_city
(
   id                             bigint                         not null AUTO_INCREMENT,
   city_name                      varchar(100)                   not null,
   province_id                    bigint(20)                     not null,
   seq                            bigint                         default 0,
   create_date                    datetime                       not null,
   modify_date                    datetime                       not null,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_company                                            */
/*==============================================================*/
create table fl_company
(
   Id                             bigint(20)                     not null AUTO_INCREMENT,
   city_id                        bigint(20)                     default NULL,
   name                           varchar(200)                   not null,
   parent_id                      bigint(20)                     default 0,
   tel                            varchar(100)                   default NULL,
   address                        varchar(200)                   default NULL,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (Id)
);

/*==============================================================*/
/* Table: fl_dictionary                                         */
/*==============================================================*/
create table fl_dictionary
(
   id                             bigint                         not null AUTO_INCREMENT,
   dic_no                         varchar(100),
   name                           varchar(200),
   value                          varchar(100),
   create_date                    datetime,
   modify_date                    datetime,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_function                                           */
/*==============================================================*/
create table fl_function
(
   id                             bigint                         not null AUTO_INCREMENT,
   function_name                  varchar(100)                   default NULL,
   code                           varchar(150)                   default NULL,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_log                                                */
/*==============================================================*/
create table fl_log
(
   id                             bigint                         not null AUTO_INCREMENT,
   user_id                        bigint                         not null,
   log                            varchar(500)                   not null,
   create_date                    datetime                       not null,
   modify_date                    datetime                       not null,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_privilege                                          */
/*==============================================================*/
create table fl_privilege
(
   id                             bigint                         not null AUTO_INCREMENT,
   role_id                        bigint                         not null,
   function_id                    bigint                         not null,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_province                                           */
/*==============================================================*/
create table fl_province
(
   id                             bigint                         not null AUTO_INCREMENT,
   province_name                  varchar(100)                   not null,
   seq                            bigint                         default 0,
   create_date                    datetime                       not null,
   modify_date                    datetime                       not null,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_role                                               */
/*==============================================================*/
create table fl_role
(
   id                             bigint                         not null AUTO_INCREMENT,
   role_name                      varchar(100)                   default NULL,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: fl_user                                               */
/*==============================================================*/
create table fl_user
(
   id                             bigint                         not null AUTO_INCREMENT,
   user_name                      varchar(100)                   default NULL,
   login_no                       varchar(50)                    not null,
   role_id                        bigint(20)                     not null,
   create_date                    datetime                       not null,
   modify_date                    datetime                       not null,
   user_pwd                       char(32)                       not null,
   tel                            varchar(50)                    not null,
   address                        varchar(300)                   default NULL,
   email                          varchar(200)                   default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: pj_order                                              */
/*==============================================================*/
create table pj_order
(
   id                             bigint                         not null AUTO_INCREMENT,
   order_no                       char(6)                        default NULL,
   user_id                        bigint(20)                     default NULL,
   order_status                   tinyint(4)                     default 1,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: pj_perform                                            */
/*==============================================================*/
create table pj_perform
(
   id                             bigint                         not null AUTO_INCREMENT,
   perform_name                   varchar(100)                   default NULL,
   project_id                     datetime                       default NULL,
   venue_id                       bigint(20)                     default NULL,
   perform_date                   datetime                       default NULL,
   create_date                    datetime                       default NULL,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: pj_project                                            */
/*==============================================================*/
create table pj_project
(
   id                             bigint                         not null AUTO_INCREMENT,
   project_name                   varchar(100)                   not null,
   company_id                     bigint(20)                     not null,
   start_date                     datetime                       not null,
   end_date                       datetime                       not null,
   create_date                    datetime                       not null,
   modify_date                    datetime                       default NULL,
   primary key (id)
);

/*==============================================================*/
/* Table: pj_ticket                                             */
/*==============================================================*/
create table pj_ticket
(
   id                             bigint                         not null AUTO_INCREMENT,
   price                          decimal(10,0)                  default NULL,
   row                            tinyint                        default 0,
   col                            tinyint                        default 0,
   floor                          tinyint                        default 1,
   order_no                       varchar(100),
   order_detail_no                varchar(100),
   seat_no                        varchar(20),
   status                         tinyint                        default 1,
   entrance                       varchar(100)                   default "",
   primary key (id)
);

