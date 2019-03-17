-- Parent Task 1 Details for Task Manager
INSERT INTO APP_T_PARENT_TASK (PARENT_TASK_ID, PARENT_TASK_NAME) 
VALUES (APP_SQ_PARENT_TASK_ID.nextval, 'Parent Task 1');

-- Task Details 1 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 1', 10, to_date('2018-12-01', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);

-- Task Details 2 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 2', 20, to_date('2018-12-11', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);

-- Task Details 3 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 3', 30, to_date('2018-12-21', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);


-- Parent Task 2 Details for Task Manager
INSERT INTO APP_T_PARENT_TASK (PARENT_TASK_ID, PARENT_TASK_NAME) 
VALUES (APP_SQ_PARENT_TASK_ID.nextval, 'Parent Task 2');

-- Task Details 1 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 4', 10, to_date('2018-12-01', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);

-- Task Details 2 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 5', 20, to_date('2018-12-11', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);

-- Task Details 3 for Task Manager
INSERT INTO APP_T_TASK (TASK_ID, TASK_NAME, PRIORITY, START_DATE, END_DATE, ACTIVE, PARENT_TASK_ID) 
VALUES (APP_SQ_TASK_ID.nextval, 'Task 6', 30, to_date('2018-12-21', 'yyyy-mm-dd'), to_date('2018-12-31', 'yyyy-mm-dd'), 'Y', APP_SQ_PARENT_TASK_ID.currval);