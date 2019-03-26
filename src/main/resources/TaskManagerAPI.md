FORMAT: 1A
HOST: localhost:8080/TaskManager/api/

# Task Manager RESTful API

Task Manager API is a simple API allowing users to create and keep track of upcoming tasks, finished tasks along with its priorities.

# Group Tasks

Resources related to tasks in the API.

## Tasks Collection [/tasks]

### List All Task Entities [GET]

Lists all Tasks available in the system with GET method for resource /tasks.

+ Response 200 (application/json)

        [
            {
				 "statusCode": 200,
				 "message": "Tasks retrieved!!",
				 "response": [
					 {
						"taskId": 1001,
						"taskName": "Task 1",
						"priority": 10,
						"startDate": "2018-12-01",
						"endDate": "2018-12-31",
						"active": "Y",
						 "parentTask": {
							  "parentTaskId": 1001,
							  "ParentTaskName": "Parent Task 1"
						 }
					 }
				 ]
			 }
        ]

### Creates a New Task Entity [POST]

You may create a new Task details. It takes a JSON object containing task details and returns a JSON response.

+ Request (application/json)

        {
			"taskName": "Task 1",
			"priority": 10,
			"startDate": "2018-12-01",
			"endDate": "2018-12-31",
			"parentTask": {
				"ParentTaskName": "Parent Task 1"
			}
		}

+ Response 201 (application/json)

    + Headers

            Location: /tasks/1001

    + Body

			{
				"statusCode": 201,
				"message": "Task Created!!",
				"response": {
					"taskName": "Task 1",
					"priority": 10,
					"startDate": "2018-12-01",
					"endDate": "2018-12-31",
					"active": "Y",
					"parentTask": {
						"parentTaskId": 1001
						"ParentTaskName": "Parent Task 1"
					}
				  
				}
			}

## Single Task [/tasks/{taskId}]

+ Parameters
    + taskId (number) - Id of the Task in the form of a Long data type.

### View a Task Entity [GET]

Lists a Task available in the system with {taskId} path variable.

+ Request

    + Headers

            Location: /tasks/1001
            
+ Response 200 (application/json)

		{
			"statusCode": 200,
	 		"message": "Task Retrieved!!",
	 		"response": {
				 "taskId": 1001,
				 "taskName": "Task 1",
				 "priority": 15,
				 "startDate": "2018-12-01",
				 "endDate": "2018-12-31",
				 "active": "Y",
				 "parentTask": {
					"parentTaskId": 1001,
					"ParentTaskName": "Parent Task 1"
				 }
			}
		}

### Update an Existing Task Entity [PUT]

You may update an existing Task details. It takes a JSON object containing task details and a path variable value {taskId} to update the particular entity.

+ Request (application/json)

    + Headers

            Location: /tasks/1001
            
    + Body

            {
				"taskName": "Task 1",
				"priority": 15,
				"startDate": "2018-12-01",
				"endDate": "2018-12-31",
				"parentTask": {
					"ParentTaskName": "Parent Task 1"
				}
			}

+ Response 201 (application/json)

    + Headers

            Location: /tasks/1001

    + Body

		{
			"statusCode": 201,
	 		"message": "Task Updated!!",
	 		"response": {
				 "taskId": 1001,
				 "taskName": "Task 1",
				 "priority": 15,
				 "startDate": "2018-12-01",
				 "endDate": "2018-12-31",
				 "active": "Y",
				 "parentTask": {
					"parentTaskId": 1001,
					"ParentTaskName": "Parent Task 1"
				 }
			}
		}
        
### Delete an Existing Task Entity [DELETE]

You may delete an existing Task details. It takes a path variable value for {taskId} to be deleted.

+ Request

    + Headers

            Location: /tasks/1001
            
+ Response 204

