DELETE
FROM employee_schema.equipment_state;
DELETE
FROM employee_schema.list_equipment;
DELETE
FROM employee_schema.position_history;
DELETE
FROM employee_schema.employee;
DELETE
FROM employee_schema.position_t;
DELETE
FROM employee_schema.department;

INSERT INTO employee_schema.department
values (1, 'Программист', 'Разработка'),
       (2, 'Тестировщик', 'Тестирование'),
       (3, 'ДевоПЁС', 'Развёртывание'),
       (4, 'Управленец', 'Управление');

ALTER SEQUENCE employee_schema.department_seq restart with 5;

INSERT INTO employee_schema.position_t
values (1, 1, 'Инженер-программист', 50000.00, 10000.00, 25000.00),
       (2, 2, 'Инженер по тестированию', 60000.00, 20000.00, 26000.00),
       (3, 3, 'Системный Администратор', 70000.00, 30000.00, 27000.00),
       (4, 4, 'Проджект менеджер', 80000.00, 40000.00, 35000.00),
       (5, 1, 'Ведущий-инженер', 90000.00, 60000.00, 45000.00),
       (6, 2, 'Ведущий инженер по тестированию', 99000.00, 70000.00, 55000.00);

ALTER SEQUENCE employee_schema.position_seq restart with 7;

INSERT INTO employee_schema.employee
values (1, 1, date '10-12-2015', null, '№12121431A', null, 'Макаров Велорий Платонович', date '10-10-2010',
        'Мужской', 25, '+7(495)007-74-95', '5623485485', '1234567890'),
       (2, 2, date '10-10-2010', null, '№12121431B', null, 'Шашков Мартин Сергеевич', date '10-10-2010',
        'Мужской', 22, '+7(495)445-95-58', '5623485482', '1234567809'),
       (3, 3, date '10-10-2010', date '10-10-2010', '№12121431C', '№12121431A_D', 'Копылов Панкрат Кимович',
        date '10-10-2010', 'Мужской', 32, '+7(495)402-03-19',
        '5623485481', '1574823694'),
       (4, 4, date '10-10-2010', null, '№12121431D', null, 'Суворова Надежда Глебовна', date '10-10-2010',
        'Женский',
        42, '+7(495)208-29-27', '5623485481', '1582478963'),
       (5, 5, date '10-10-2010', date '10-10-2010', '№12121431E', '№12121431A_D', 'Дорофеева Анисья Якововна',
        date '10-10-2010', 'Женский', 55, '+7(495)208-29-22',
        '562123123', '1485789674'),
       (6, 6, date '10-10-2010', null, '№12121431F', null, 'Афанасьева Тала Якуновна', date '10-10-2010',
        'Женский',
        25, '+7(495)208-29-21', '5623485124', '7418529630');

ALTER SEQUENCE employee_schema.employee_seq restart with 7;

INSERT INTO employee_schema.position_history
values (nextval('employee_schema.position_history_seq'), 1, 1, date '10-10-2010', null),
       (nextval('employee_schema.position_history_seq'), 2, 2, date '10-10-2010', null),
       (nextval('employee_schema.position_history_seq'), 3, 3, date '10-10-2010', date '10-10-2010'),
       (nextval('employee_schema.position_history_seq'), 4, 4, date '10-10-2010', null),
       (nextval('employee_schema.position_history_seq'), 5, 5, date '10-10-2010', date '10-10-2010'),
       (nextval('employee_schema.position_history_seq'), 6, 6, date '10-10-2010', null);

INSERT INTO employee_schema.list_equipment
values (1, 'Ноутбук LENOVO', date '10-10-2010', 100000.00),
       (2, 'Ноутбук DELL', date '10-10-2010', 100000.00),
       (3, 'Ноутбук MAC', date '10-10-2010', 100000.00),
       (4, 'Ноутбук MAC PRO', date '10-10-2010', 100000.00),
       (5, 'Ноутбук ASUS', date '10-10-2010', 100000.00),
       (6, 'Ноутбук HP', date '10-10-2010', 100000.00);

ALTER
sequence employee_schema.list_equipment_seq restart with 7;

INSERT into employee_schema.equipment_state
values (nextval('employee_schema.equipment_state_seq'), 1, 1, date '10-10-2010', null),
       (nextval('employee_schema.equipment_state_seq'), 2, 2, date '10-10-2010', null),
       (nextval('employee_schema.equipment_state_seq'), 3, 3, date '10-10-2010', date '10-10-2010'),
       (nextval('employee_schema.equipment_state_seq'), 4, 4, date '10-10-2010', null),
       (nextval('employee_schema.equipment_state_seq'), 5, 5, date '10-10-2010', date '10-10-2010'),
       (nextval('employee_schema.equipment_state_seq'), 6, 6, date '10-10-2010', null);