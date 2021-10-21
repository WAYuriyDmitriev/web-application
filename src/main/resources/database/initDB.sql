CREATE SEQUENCE IF NOT EXISTS employee_schema.employee_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS employee_schema.department_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS employee_schema.position_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS employee_schema.position_history_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS employee_schema.list_equipment_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS employee_schema.equipment_state_seq increment by 50;

drop table if exists equipment_state;
drop table if exists list_equipment;
drop table if exists position_history;
drop table if exists employee;
drop table if exists position_t;
drop table if exists department;

CREATE TABLE IF NOT EXISTS employee_schema.department
(
    ID        INT         not null default nextval('employee_schema.department_seq') PRIMARY KEY,
    NAME      varchar(20) not null,
    DIRECTION varchar(20) not null
);

CREATE TABLE IF NOT EXISTS employee_schema.position_t
(
    ID              INT         not null default nextval('employee_schema.position_seq') PRIMARY KEY,
    CODE_DEPARTMENT INT         not null,
    NAME            varchar(40) not null,
    BASE_SALARY     float8      not null,
    ALLOWANCE       float8      not null,
    REWARD          float8      not null,
    FOREIGN KEY (CODE_DEPARTMENT) REFERENCES employee_schema.department (ID)
);

CREATE TABLE IF NOT EXISTS employee_schema.employee
(
    ID               INT         not null default nextval('employee_schema.employee_seq') PRIMARY KEY,
    POSITION_ID      INT         NOT NULL,
    DATE_RECEIPT     date        not null,
    DATE_DISMISSAL   date,
    ORDER_ENROLLMENT varchar(20) not null,
    ORDER_DISMISSAL  varchar(20),
    FIO              varchar(40) not null,
    BIRTHDAY         date        not null,
    SEX              varchar(8)  not null,
    AGE              int         not null,
    NUMBER           varchar(20),
    PASSPORT         varchar(10) not null,
    INN              varchar(10) not null,
    FOREIGN KEY (POSITION_ID) references employee_schema.position_t (ID)
);

CREATE TABLE IF NOT EXISTS employee_schema.position_history
(
    ID            INT  not null default nextval('employee_schema.position_history_seq') PRIMARY KEY,
    CODE_EMPLOYEE INT  not null,
    CODE_POSITION INT  not null,
    START_DATE    date not null,
    END_DATE      date,
    FOREIGN KEY (CODE_EMPLOYEE) references employee_schema.employee (ID),
    FOREIGN KEY (CODE_POSITION) references employee_schema.position_t (ID)
);

CREATE TABLE IF NOT EXISTS employee_schema.list_equipment
(
    ID       INT         not null default nextval('employee_schema.list_equipment_seq') PRIMARY KEY,
    NAME     varchar(20) not null,
    DATE_BUY date        not null,
    COST     float8      not null
);

CREATE TABLE IF NOT EXISTS employee_schema.equipment_state
(
    ID             INT  not null default nextval('employee_schema.equipment_state_seq') PRIMARY KEY,
    CODE_EMPLOYEE  INT  not null,
    CODE_EQUIPMENT INT  not null,
    DATE_GET       date not null,
    DATE_RETURN    date,
    FOREIGN KEY (CODE_EMPLOYEE) REFERENCES employee_schema.employee (ID),
    FOREIGN KEY (CODE_EQUIPMENT) REFERENCES employee_schema.list_equipment (ID)
);