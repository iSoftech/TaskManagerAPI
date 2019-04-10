(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/add-task/add-task.component.css":
/*!*************************************************!*\
  !*** ./src/app/add-task/add-task.component.css ***!
  \*************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".slider {\r\n\t-webkit-appearance: none;\r\n\twidth: 100%;\r\n\theight: 15px;\r\n\tborder-radius: 5px;   \r\n\tbackground: #d3d3d3;\r\n\toutline: none;\r\n\topacity: 0.7;\r\n\ttransition: opacity .2s;\r\n  }\r\n  \r\n  .slider::-webkit-slider-thumb {\r\n\t-webkit-appearance: none;\r\n\tappearance: none;\r\n\twidth: 30px;\r\n\theight: 30px;\r\n\tborder-radius: 50%; \r\n\tbackground: #007bff;\r\n\tcursor: pointer;\r\n  }\r\n  \r\n  .slider::-moz-range-thumb {\r\n\twidth: 30px;\r\n\theight: 30px;\r\n\tborder-radius: 50%;\r\n\tbackground: #007bff;\r\n\tcursor: pointer;\r\n  }\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYWRkLXRhc2svYWRkLXRhc2suY29tcG9uZW50LmNzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtDQUNDLHlCQUF5QjtDQUN6QixZQUFZO0NBQ1osYUFBYTtDQUNiLG1CQUFtQjtDQUNuQixvQkFBb0I7Q0FDcEIsY0FBYztDQUNkLGFBQWE7Q0FFYix3QkFBd0I7R0FDdEI7O0VBRUQ7Q0FDRCx5QkFBeUI7Q0FDekIsaUJBQWlCO0NBQ2pCLFlBQVk7Q0FDWixhQUFhO0NBQ2IsbUJBQW1CO0NBQ25CLG9CQUFvQjtDQUNwQixnQkFBZ0I7R0FDZDs7RUFFRDtDQUNELFlBQVk7Q0FDWixhQUFhO0NBQ2IsbUJBQW1CO0NBQ25CLG9CQUFvQjtDQUNwQixnQkFBZ0I7R0FDZCIsImZpbGUiOiJzcmMvYXBwL2FkZC10YXNrL2FkZC10YXNrLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuc2xpZGVyIHtcclxuXHQtd2Via2l0LWFwcGVhcmFuY2U6IG5vbmU7XHJcblx0d2lkdGg6IDEwMCU7XHJcblx0aGVpZ2h0OiAxNXB4O1xyXG5cdGJvcmRlci1yYWRpdXM6IDVweDsgICBcclxuXHRiYWNrZ3JvdW5kOiAjZDNkM2QzO1xyXG5cdG91dGxpbmU6IG5vbmU7XHJcblx0b3BhY2l0eTogMC43O1xyXG5cdC13ZWJraXQtdHJhbnNpdGlvbjogLjJzO1xyXG5cdHRyYW5zaXRpb246IG9wYWNpdHkgLjJzO1xyXG4gIH1cclxuICBcclxuICAuc2xpZGVyOjotd2Via2l0LXNsaWRlci10aHVtYiB7XHJcblx0LXdlYmtpdC1hcHBlYXJhbmNlOiBub25lO1xyXG5cdGFwcGVhcmFuY2U6IG5vbmU7XHJcblx0d2lkdGg6IDMwcHg7XHJcblx0aGVpZ2h0OiAzMHB4O1xyXG5cdGJvcmRlci1yYWRpdXM6IDUwJTsgXHJcblx0YmFja2dyb3VuZDogIzAwN2JmZjtcclxuXHRjdXJzb3I6IHBvaW50ZXI7XHJcbiAgfVxyXG4gIFxyXG4gIC5zbGlkZXI6Oi1tb3otcmFuZ2UtdGh1bWIge1xyXG5cdHdpZHRoOiAzMHB4O1xyXG5cdGhlaWdodDogMzBweDtcclxuXHRib3JkZXItcmFkaXVzOiA1MCU7XHJcblx0YmFja2dyb3VuZDogIzAwN2JmZjtcclxuXHRjdXJzb3I6IHBvaW50ZXI7XHJcbiAgfSJdfQ== */"

/***/ }),

/***/ "./src/app/add-task/add-task.component.html":
/*!**************************************************!*\
  !*** ./src/app/add-task/add-task.component.html ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav-bar></nav-bar>\r\n<br/>\r\n<div class=\"container-fluid\">\r\n    <h3 style=\"padding-left: 10px;\">Add Task</h3>\r\n    <form *ngIf=\"addTaskForm\" [formGroup]=\"addTaskForm\" (ngSubmit)=\"onSubmit()\">\r\n        <table border=\"0\" cellspacing=\"0\" cellpadding=\"10\" style=\"width: 60%\">\r\n            <tr class=\"form-group\">\r\n                <td width=\"20%\">\r\n                    <label>Task</label>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"70%\">\r\n                    <input type=\"text\" class=\"form-control\" id=\"taskName\" formControlName=\"taskName\" placeholder=\"Task Name\" autofocus/>\r\n                </td>\r\n            </tr>\r\n            <tr class=\"form-group\">\r\n                <td width=\"20%\">\r\n                    <label>Priority</label>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"70%\">\r\n                    <input type=\"range\" class=\"form-control slider\" min=\"0\" max=\"30\" id=\"priority\" formControlName=\"priority\" [(ngModel)]=\"rangeValue\" title=\"{{rangeValue}}\" />\r\n                </td>\r\n            </tr>\r\n            <tr class=\"form-group\">\r\n                <td width=\"20%\">\r\n                    <label>Parent Task</label>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"70%\">\r\n                    <div formGroupName=\"parentTask\" novalidate>\r\n                        <input type=\"text\" class=\"form-control\" id=\"parentTaskName\" formControlName=\"parentTaskName\" placeholder=\"Parent Task Name\"/>\r\n                    </div>\r\n                </td>\r\n            </tr>\r\n            <tr class=\"form-group\">\r\n                <td width=\"20%\">\r\n                    <label>Start Date</label>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"70%\">\r\n                    <input type=\"date\" class=\"form-control\" id=\"startDate\" formControlName=\"startDate\"/>\r\n                </td>\r\n            </tr>\r\n            <tr class=\"form-group\">\r\n                <td width=\"20%\">\r\n                    <label>End Date</label>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"70%\">\r\n                    <input type=\"date\" class=\"form-control\" id=\"endDate\" formControlName=\"endDate\"/>\r\n                </td>\r\n            </tr>            \r\n        </table>\r\n        <br>\r\n        <table border=\"0\" cellspacing=\"0\" cellpading=\"0\">\r\n            <tr>\r\n                <td width=\"45%\">\r\n                    <button type=\"submit\" class=\"btn btn-success\" [disabled]=\"!addTaskForm.valid\" style=\"width: 100px; cursor: pointer;\">Add Task</button>\r\n                </td>\r\n                <td width=\"10%\"></td>\r\n                <td width=\"45%\">\r\n                    <button type=\"button\" class=\"btn btn-primary\" (click)=\"reset()\" style=\"width: 100px; cursor: pointer;\">Reset</button>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    </form>\r\n</div>"

/***/ }),

/***/ "./src/app/add-task/add-task.component.ts":
/*!************************************************!*\
  !*** ./src/app/add-task/add-task.component.ts ***!
  \************************************************/
/*! exports provided: AddTaskComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AddTaskComponent", function() { return AddTaskComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _api_service_task_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../api-service/task.service */ "./src/app/api-service/task.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var AddTaskComponent = /** @class */ (function () {
    function AddTaskComponent(formBuilder, taskService, router) {
        this.formBuilder = formBuilder;
        this.taskService = taskService;
        this.router = router;
        this.addTaskForm = this.initializeFormGroup();
    }
    AddTaskComponent.prototype.initializeFormGroup = function () {
        return this.formBuilder.group({
            taskId: [''],
            taskName: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            parentTask: this.formBuilder.group({
                parentTaskId: [''],
                parentTaskName: ['']
            }),
            priority: ['15', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].compose([_angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].min(0), _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].max(30)])],
            startDate: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            endDate: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            active: ['Y']
        });
    };
    AddTaskComponent.prototype.addTask = function () {
        var _this = this;
        var newTask = Object.assign({}, this.addTaskForm.value);
        newTask.parentTask = Object.assign({}, newTask.parentTask);
        this.taskService.addTask(newTask)
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["first"])())
            .subscribe(function (data) {
            if (data.statusCode == 201) {
                alert("You've successfully added a new Task!");
                _this.router.navigate(['view-tasks']);
            }
            else {
                alert(data.message);
            }
        }, function (error) {
            alert("Sorry! Something went wrong, new task cannot be added at the moment. Please try again.");
        });
    };
    AddTaskComponent.prototype.onSubmit = function () {
        this.addTask();
    };
    AddTaskComponent.prototype.reset = function () {
        this.addTaskForm.reset({
            taskId: '',
            taskName: '',
            parentTask: ({
                parentTaskId: '',
                parentTaskName: ''
            }),
            priority: '15',
            startDate: '',
            endDate: '',
            active: 'Y'
        });
    };
    AddTaskComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'add-task',
            template: __webpack_require__(/*! ./add-task.component.html */ "./src/app/add-task/add-task.component.html"),
            styles: [__webpack_require__(/*! ./add-task.component.css */ "./src/app/add-task/add-task.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"], _api_service_task_service__WEBPACK_IMPORTED_MODULE_2__["TaskService"], _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"]])
    ], AddTaskComponent);
    return AddTaskComponent;
}());



/***/ }),

/***/ "./src/app/api-service/task.service.ts":
/*!*********************************************!*\
  !*** ./src/app/api-service/task.service.ts ***!
  \*********************************************/
/*! exports provided: TaskService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TaskService", function() { return TaskService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var httpOptions = {
    headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpHeaders"]({
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        'Access-Control-Allow-Origin': '*'
    })
};
var TaskService = /** @class */ (function () {
    function TaskService(http) {
        this.http = http;
        this.baseUrl = '/tasks/';
    }
    TaskService.prototype.getAllTasks = function () {
        return this.http.get(this.baseUrl, httpOptions);
    };
    TaskService.prototype.getTask = function (id) {
        return this.http.get(this.baseUrl + id, httpOptions);
    };
    TaskService.prototype.addTask = function (task) {
        return this.http.post(this.baseUrl, task, httpOptions);
    };
    TaskService.prototype.updateTask = function (task) {
        return this.http.put(this.baseUrl + task.taskId, task, httpOptions);
    };
    TaskService.prototype.deleteTask = function (id) {
        return this.http.delete(this.baseUrl + id);
    };
    TaskService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({ providedIn: 'root' }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], TaskService);
    return TaskService;
}());



/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _add_task_add_task_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./add-task/add-task.component */ "./src/app/add-task/add-task.component.ts");
/* harmony import */ var _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./view-task/view-task.component */ "./src/app/view-task/view-task.component.ts");
/* harmony import */ var _edit_task_edit_task_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./edit-task/edit-task.component */ "./src/app/edit-task/edit-task.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};





var routes = [
    { path: '', redirectTo: 'view-tasks', pathMatch: 'full' },
    { path: 'view-tasks', component: _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_3__["ViewTaskComponent"] },
    { path: 'add-task', component: _add_task_add_task_component__WEBPACK_IMPORTED_MODULE_2__["AddTaskComponent"] },
    { path: 'edit-task', component: _edit_task_edit_task_component__WEBPACK_IMPORTED_MODULE_4__["EditTaskComponent"] },
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<br>\n<div style=\"text-align:center\">\n  <h1>\n    {{ title }}\n  </h1>\n</div>\n<br/>\n<div id=\"app-description\">\n    <span style=\"text-align: center\">\n      <h6>Task Manager App is a simple application allowing users to create and keep track of upcoming tasks, finished tasks and its priorities.</h6>\n    </span>\n</div>\n<br/>\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'Task Manager';
        this.selection_add = '';
        this.selection_view = 'active';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _nav_bar_navbar_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./nav-bar/navbar.component */ "./src/app/nav-bar/navbar.component.ts");
/* harmony import */ var _add_task_add_task_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./add-task/add-task.component */ "./src/app/add-task/add-task.component.ts");
/* harmony import */ var _edit_task_edit_task_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./edit-task/edit-task.component */ "./src/app/edit-task/edit-task.component.ts");
/* harmony import */ var _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./view-task/view-task.component */ "./src/app/view-task/view-task.component.ts");
/* harmony import */ var _api_service_task_service__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./api-service/task.service */ "./src/app/api-service/task.service.ts");
/* harmony import */ var _sort_filter_order_by_task_name_pipe__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./sort-filter/order-by-task-name.pipe */ "./src/app/sort-filter/order-by-task-name.pipe.ts");
/* harmony import */ var _sort_filter_filter_pipe__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./sort-filter/filter.pipe */ "./src/app/sort-filter/filter.pipe.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};














var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"],
                _nav_bar_navbar_component__WEBPACK_IMPORTED_MODULE_6__["NavbarComponent"],
                _add_task_add_task_component__WEBPACK_IMPORTED_MODULE_7__["AddTaskComponent"],
                _edit_task_edit_task_component__WEBPACK_IMPORTED_MODULE_8__["EditTaskComponent"],
                _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_9__["ViewTaskComponent"],
                _sort_filter_order_by_task_name_pipe__WEBPACK_IMPORTED_MODULE_11__["OrderByTaskNamePipe"],
                _sort_filter_filter_pipe__WEBPACK_IMPORTED_MODULE_12__["FilterPipe"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_4__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["ReactiveFormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_3__["HttpClientModule"]
            ],
            providers: [_api_service_task_service__WEBPACK_IMPORTED_MODULE_10__["TaskService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/edit-task/edit-task.component.css":
/*!***************************************************!*\
  !*** ./src/app/edit-task/edit-task.component.css ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".slider {\r\n\t-webkit-appearance: none;\r\n\twidth: 100%;\r\n\theight: 15px;\r\n\tborder-radius: 5px;   \r\n\tbackground: #d3d3d3;\r\n\toutline: none;\r\n\topacity: 0.7;\r\n\ttransition: opacity .2s;\r\n  }\r\n  \r\n  .slider::-webkit-slider-thumb {\r\n\t-webkit-appearance: none;\r\n\tappearance: none;\r\n\twidth: 30px;\r\n\theight: 30px;\r\n\tborder-radius: 50%; \r\n\tbackground: #007bff;\r\n\tcursor: pointer;\r\n  }\r\n  \r\n  .slider::-moz-range-thumb {\r\n\twidth: 30px;\r\n\theight: 30px;\r\n\tborder-radius: 50%;\r\n\tbackground: #007bff;\r\n\tcursor: pointer;\r\n  }\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvZWRpdC10YXNrL2VkaXQtdGFzay5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0NBQ0MseUJBQXlCO0NBQ3pCLFlBQVk7Q0FDWixhQUFhO0NBQ2IsbUJBQW1CO0NBQ25CLG9CQUFvQjtDQUNwQixjQUFjO0NBQ2QsYUFBYTtDQUViLHdCQUF3QjtHQUN0Qjs7RUFFRDtDQUNELHlCQUF5QjtDQUN6QixpQkFBaUI7Q0FDakIsWUFBWTtDQUNaLGFBQWE7Q0FDYixtQkFBbUI7Q0FDbkIsb0JBQW9CO0NBQ3BCLGdCQUFnQjtHQUNkOztFQUVEO0NBQ0QsWUFBWTtDQUNaLGFBQWE7Q0FDYixtQkFBbUI7Q0FDbkIsb0JBQW9CO0NBQ3BCLGdCQUFnQjtHQUNkIiwiZmlsZSI6InNyYy9hcHAvZWRpdC10YXNrL2VkaXQtdGFzay5jb21wb25lbnQuY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLnNsaWRlciB7XHJcblx0LXdlYmtpdC1hcHBlYXJhbmNlOiBub25lO1xyXG5cdHdpZHRoOiAxMDAlO1xyXG5cdGhlaWdodDogMTVweDtcclxuXHRib3JkZXItcmFkaXVzOiA1cHg7ICAgXHJcblx0YmFja2dyb3VuZDogI2QzZDNkMztcclxuXHRvdXRsaW5lOiBub25lO1xyXG5cdG9wYWNpdHk6IDAuNztcclxuXHQtd2Via2l0LXRyYW5zaXRpb246IC4ycztcclxuXHR0cmFuc2l0aW9uOiBvcGFjaXR5IC4ycztcclxuICB9XHJcbiAgXHJcbiAgLnNsaWRlcjo6LXdlYmtpdC1zbGlkZXItdGh1bWIge1xyXG5cdC13ZWJraXQtYXBwZWFyYW5jZTogbm9uZTtcclxuXHRhcHBlYXJhbmNlOiBub25lO1xyXG5cdHdpZHRoOiAzMHB4O1xyXG5cdGhlaWdodDogMzBweDtcclxuXHRib3JkZXItcmFkaXVzOiA1MCU7IFxyXG5cdGJhY2tncm91bmQ6ICMwMDdiZmY7XHJcblx0Y3Vyc29yOiBwb2ludGVyO1xyXG4gIH1cclxuICBcclxuICAuc2xpZGVyOjotbW96LXJhbmdlLXRodW1iIHtcclxuXHR3aWR0aDogMzBweDtcclxuXHRoZWlnaHQ6IDMwcHg7XHJcblx0Ym9yZGVyLXJhZGl1czogNTAlO1xyXG5cdGJhY2tncm91bmQ6ICMwMDdiZmY7XHJcblx0Y3Vyc29yOiBwb2ludGVyO1xyXG4gIH0iXX0= */"

/***/ }),

/***/ "./src/app/edit-task/edit-task.component.html":
/*!****************************************************!*\
  !*** ./src/app/edit-task/edit-task.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<br/>\n<div class=\"container-fluid\">\n    <h3 style=\"padding-left: 10px;\">Edit Task</h3>\n    <form *ngIf=\"editTaskForm\" [formGroup]=\"editTaskForm\" (ngSubmit)=\"onSubmit()\">\n        <div class=\"hidden\">\n            <input type=\"hidden\" class=\"form-control\" id=\"taskId\" formControlName=\"taskId\"/>\n        </div>\n        <table border=\"0\" cellspacing=\"0\" cellpadding=\"10\" style=\"width: 60%\">\n          <thead>\n            <th width=\"20%\"></th>\n            <th width=\"10%\"></th>\n            <th width=\"70%\"></th>\n          </thead>\n          <tbody>\n            <tr class=\"form-group\">\n                <td>\n                    <label>Task</label>\n                </td>\n                <td></td>\n                <td>\n                    <input type=\"text\" class=\"form-control\" id=\"taskName\" formControlName=\"taskName\" autofocus/>\n                </td>\n            </tr>\n            <tr class=\"form-group\">\n                <td>\n                    <label>Priority</label>\n                </td>\n                <td></td>\n                <td>\n                    <input type=\"range\" class=\"form-control slider\" min=\"0\" max=\"30\" id=\"priority\" formControlName=\"priority\" [(ngModel)]=\"rangeValue\" title=\"{{rangeValue}}\" />\n                </td>\n            </tr>\n            <tr class=\"form-group\">\n                <td>\n                    <label>Parent Task</label>\n                </td>\n                <td></td>\n                <td>\n                    <div formGroupName=\"parentTask\" novalidate>\n                        <div class=\"hidden\">\n                            <input type=\"hidden\" class=\"form-control\" id=\"parentTaskId\" formControlName=\"parentTaskId\"/>\n                        </div>\n                        <input type=\"text\" class=\"form-control\" id=\"parentTaskName\" formControlName=\"parentTaskName\"/>\n                    </div>\n                </td>\n            </tr>\n            <tr class=\"form-group\">\n                <td>\n                    <label>Start Date</label>\n                </td>\n                <td></td>\n                <td>\n                    <input type=\"date\" class=\"form-control\" id=\"startDate\" formControlName=\"startDate\"/>\n                </td>\n            </tr>\n            <tr class=\"form-group\">\n                <td>\n                    <label>End Date</label>\n                </td>\n                <td></td>\n                <td>\n                    <input type=\"date\" class=\"form-control\" id=\"endDate\" formControlName=\"endDate\"/>\n                </td>\n            </tr>\n          </tbody>            \n        </table>\n        <br>\n        <div class=\"text-center\">\n        <table border=\"0\" cellspacing=\"0\" cellpading=\"10\">\n            <tr>\n                <td width=\"45%\">\n                    <button type=\"submit\" [disabled]=\"!editTaskForm.valid\" class=\"btn btn-success\" style=\"width: 120px; cursor: pointer;\">Update Task</button>\n                </td>\n                <td width=\"10%\"></td>\n                <td width=\"45%\">\n                    <button type=\"button\" class=\"btn btn-primary\" style=\"width: 120px; cursor: pointer;\" (click)=\"cancelEdit()\">Cancel</button>\n                </td>\n            </tr>\n        </table>\n      </div>\n    </form>\n</div>\n"

/***/ }),

/***/ "./src/app/edit-task/edit-task.component.ts":
/*!**************************************************!*\
  !*** ./src/app/edit-task/edit-task.component.ts ***!
  \**************************************************/
/*! exports provided: EditTaskComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditTaskComponent", function() { return EditTaskComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _api_service_task_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../api-service/task.service */ "./src/app/api-service/task.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var EditTaskComponent = /** @class */ (function () {
    function EditTaskComponent(formBuilder, taskService, router) {
        this.formBuilder = formBuilder;
        this.taskService = taskService;
        this.router = router;
    }
    EditTaskComponent.prototype.ngOnInit = function () {
        var selectedTaskId = window.localStorage.getItem("selectedTaskId");
        if (selectedTaskId) {
            this.editTaskForm = this.initializeFormGroup(this.formBuilder);
            this.getTask(selectedTaskId);
        }
    };
    EditTaskComponent.prototype.initializeFormGroup = function (formBuilder) {
        return formBuilder.group({
            taskId: [''],
            taskName: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            parentTask: formBuilder.group({
                parentTaskId: [''],
                parentTaskName: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required]
            }),
            priority: ['15', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].compose([_angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].min(0), _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].max(30)])],
            startDate: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            endDate: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            active: ['Y']
        });
    };
    EditTaskComponent.prototype.getTask = function (taskId) {
        var _this = this;
        this.taskService.getTask(taskId).subscribe(function (data) {
            _this.editTaskForm.setValue(data.response);
        });
    };
    EditTaskComponent.prototype.updateTask = function () {
        var _this = this;
        var editedTask = Object.assign({}, this.editTaskForm.value);
        editedTask.parentTask = Object.assign({}, editedTask.parentTask);
        this.taskService.updateTask(editedTask)
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["first"])())
            .subscribe(function (data) {
            if (data.statusCode == 201) {
                alert("You've successfully updated the Task!");
                _this.router.navigate(['view-tasks']);
            }
            else {
                alert(data.message);
            }
        }, function (error) {
            alert("Sorry! Something went wrong, update cannot be possible at the moment. Please try again.");
        });
    };
    EditTaskComponent.prototype.onSubmit = function () {
        this.updateTask();
    };
    EditTaskComponent.prototype.cancelEdit = function () {
        this.router.navigate(['view-tasks']);
    };
    EditTaskComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'edit-task',
            template: __webpack_require__(/*! ./edit-task.component.html */ "./src/app/edit-task/edit-task.component.html"),
            styles: [__webpack_require__(/*! ./edit-task.component.css */ "./src/app/edit-task/edit-task.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"], _api_service_task_service__WEBPACK_IMPORTED_MODULE_2__["TaskService"], _angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"]])
    ], EditTaskComponent);
    return EditTaskComponent;
}());



/***/ }),

/***/ "./src/app/nav-bar/navbar.component.html":
/*!***********************************************!*\
  !*** ./src/app/nav-bar/navbar.component.html ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"card\">\r\n    <div class=\"card-header\">\r\n        <nav>\r\n            <div class=\"nav nav-pills\" id=\"nav-tab\" role=\"tablist\">\r\n                <a class=\"nav-item nav-link\" id=\"nav-add-tab\" data-target=\"_self\" aria-selected=\"false\" routerLink=\"/add-task\" routerLinkActive=\"active show\" style=\"cursor: pointer;\">Add Task</a>\r\n                <a class=\"nav-item nav-link\" id=\"nav-view-tab\" data-target=\"_self\" aria-selected=\"true\" routerLink=\"/view-tasks\" routerLinkActive=\"active show\" style=\"cursor: pointer;\">View Task</a>\r\n            </div>\r\n        </nav>\r\n    </div>\r\n</div>\r\n<router-outlet></router-outlet>"

/***/ }),

/***/ "./src/app/nav-bar/navbar.component.ts":
/*!*********************************************!*\
  !*** ./src/app/nav-bar/navbar.component.ts ***!
  \*********************************************/
/*! exports provided: NavbarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NavbarComponent", function() { return NavbarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var NavbarComponent = /** @class */ (function () {
    function NavbarComponent(router) {
        this.router = router;
    }
    NavbarComponent.prototype.addTask = function () {
        this.router.navigate(['add-task']);
    };
    NavbarComponent.prototype.viewTasks = function () {
        this.router.navigate(['view-tasks']);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], NavbarComponent.prototype, "addTaskSelected", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], NavbarComponent.prototype, "viewTasksSelected", void 0);
    NavbarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'nav-bar',
            template: __webpack_require__(/*! ./navbar.component.html */ "./src/app/nav-bar/navbar.component.html")
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], NavbarComponent);
    return NavbarComponent;
}());



/***/ }),

/***/ "./src/app/sort-filter/filter.pipe.ts":
/*!********************************************!*\
  !*** ./src/app/sort-filter/filter.pipe.ts ***!
  \********************************************/
/*! exports provided: FilterPipe */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FilterPipe", function() { return FilterPipe; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../view-task/view-task.component */ "./src/app/view-task/view-task.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var FilterPipe = /** @class */ (function () {
    function FilterPipe(viewTaskComponent) {
        this.viewTaskComponent = viewTaskComponent;
    }
    FilterPipe.prototype.transform = function (tasks, taskName, parentTaskName, priority, startDate, endDate) {
        if ((undefined === taskName || '' == taskName)
            && (undefined === parentTaskName || '' == parentTaskName)
            && (undefined === priority || '' == priority.toString())
            && (undefined === startDate || '' == startDate)
            && (undefined === endDate || '' == endDate)) {
            return tasks;
        }
        return tasks.filter(function (task) {
            if (taskName && task.taskName) {
                return task.taskName.toLowerCase().includes(taskName.toLowerCase());
            }
            if (parentTaskName && task.parentTask) {
                return task.parentTask.parentTaskName.toLowerCase().includes(parentTaskName.toLowerCase());
            }
            if (priority && task.priority) {
                return task.priority == priority;
            }
            if (startDate && task.startDate) {
                return Date.parse(task.startDate) >= Date.parse(startDate);
            }
            if (endDate && task.endDate) {
                return Date.parse(task.endDate) <= Date.parse(endDate);
            }
        });
    };
    FilterPipe = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Pipe"])({
            name: 'filter'
        }),
        __metadata("design:paramtypes", [_view_task_view_task_component__WEBPACK_IMPORTED_MODULE_1__["ViewTaskComponent"]])
    ], FilterPipe);
    return FilterPipe;
}());



/***/ }),

/***/ "./src/app/sort-filter/order-by-task-name.pipe.ts":
/*!********************************************************!*\
  !*** ./src/app/sort-filter/order-by-task-name.pipe.ts ***!
  \********************************************************/
/*! exports provided: OrderByTaskNamePipe */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "OrderByTaskNamePipe", function() { return OrderByTaskNamePipe; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _view_task_view_task_component__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../view-task/view-task.component */ "./src/app/view-task/view-task.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var OrderByTaskNamePipe = /** @class */ (function () {
    function OrderByTaskNamePipe(viewTaskComponent) {
        this.viewTaskComponent = viewTaskComponent;
    }
    OrderByTaskNamePipe.prototype.transform = function (tasks) {
        this.viewTaskComponent.sort();
        return this.viewTaskComponent.tasks;
    };
    OrderByTaskNamePipe = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Pipe"])({
            name: 'orderByTaskName',
            pure: false
        }),
        __metadata("design:paramtypes", [_view_task_view_task_component__WEBPACK_IMPORTED_MODULE_1__["ViewTaskComponent"]])
    ], OrderByTaskNamePipe);
    return OrderByTaskNamePipe;
}());



/***/ }),

/***/ "./src/app/view-task/view-task.component.css":
/*!***************************************************!*\
  !*** ./src/app/view-task/view-task.component.css ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".table-hover tr:hover {\r\n    background-color: #e5f4ff;\r\n}\r\n.align-left {\r\n    text-align: left;\r\n}\r\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvdmlldy10YXNrL3ZpZXctdGFzay5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksMEJBQTBCO0NBQzdCO0FBQ0Q7SUFDSSxpQkFBaUI7Q0FDcEIiLCJmaWxlIjoic3JjL2FwcC92aWV3LXRhc2svdmlldy10YXNrLmNvbXBvbmVudC5jc3MiLCJzb3VyY2VzQ29udGVudCI6WyIudGFibGUtaG92ZXIgdHI6aG92ZXIge1xyXG4gICAgYmFja2dyb3VuZC1jb2xvcjogI2U1ZjRmZjtcclxufVxyXG4uYWxpZ24tbGVmdCB7XHJcbiAgICB0ZXh0LWFsaWduOiBsZWZ0O1xyXG59Il19 */"

/***/ }),

/***/ "./src/app/view-task/view-task.component.html":
/*!****************************************************!*\
  !*** ./src/app/view-task/view-task.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav-bar></nav-bar>\n<br/>\n<div class=\"container-fluid\">\n  <h3 style=\"padding-left: 10px;\">View Tasks</h3>\n  <div class=\"table-responsive\">\n    <table cellspacing=\"0\" cellpadding=\"10\" style=\"width: 60%\" class=\"table table-bordred table-striped table-hover text-center\">\n      <thead>\n        <th style=\"width: 20%\" title=\"Task\">\n          <label>Task</label>\n          <input type=\"text\" class=\"form-control\" id=\"taskName\" [(ngModel)]=\"taskName\" />\n        </th>\n        <th style=\"width: 20%\" title=\"Parent Task\">\n          <label>Parent Task</label>\n          <input type=\"text\" class=\"form-control\" id=\"parentTaskName\" [(ngModel)]=\"parentTaskName\" />\n        </th>\n        <th style=\"width: 10%\" title=\"Priority\">\n          <label>Priority</label>\n          <input type=\"text\" class=\"form-control\" id=\"priority\" [(ngModel)]=\"priority\" />\n        </th>\n        <th style=\"width: 15%\" title=\"Start Date\">\n          <label>Start Date</label>\n          <input type=\"date\" class=\"form-control\" id=\"startDate\" [(ngModel)]=\"startDate\" style=\"width: 170px\" />\n        </th>\n        <th style=\"width: 15%\" title=\"End Date\">\n          <label>End Date</label>\n          <input type=\"date\" class=\"form-control\" id=\"endDate\" [(ngModel)]=\"endDate\" style=\"width: 170px\" />\n        </th>\n        <th style=\"width: 10%\" title=\"Edit\">Edit</th>\n        <th style=\"width: 10%\" title=\"End\">End</th>\n      </thead>\n      <tbody>\n        <tr *ngFor=\"let task of (tasks | filter: taskName:parentTaskName:priority:startDate:endDate)\">\n            <td>\n                <label>{{task.taskName}}</label>\n              </td>\n              <td>\n                <label>{{task.parentTask.parentTaskName}}</label>\n              </td>\n              <td>\n                <label>{{task.priority}}</label>\n              </td>\n              <td>\n                <label>{{task.startDate}}</label>\n              </td>\n              <td>\n                <label>{{task.endDate}}</label>\n              </td>\n              <td><button class=\"btn btn-primary btn-xs\" title=\"Edit Task\" [disabled]=\"task.active == 'N'\" (click)=\"editTask(task)\" style=\"cursor: pointer;\"><span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\">&#x270E;</span></button></td>\n              <td><p data-placement=\"top\" data-toggle=\"tooltip\" title=\"End Task\"><button class=\"btn btn-danger btn-xs\" [disabled]=\"task.active == 'N'\" style=\"cursor: pointer;\" (click)=\"prepareEndTask(task)\" data-title=\"End Task\" data-toggle=\"modal\" data-target=\"#end\"><span class=\"glyphicon glyphicon-stop\" aria-hidden=\"true\">&#xe017;</span></button></p></td>\n        </tr>\n      </tbody>\n    </table>\n  </div>\n</div>\n<!-- Dialog for End Task confirmation -->\n<div class=\"modal fade\" id=\"end\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"end\" aria-hidden=\"true\">\n  <div class=\"modal-dialog\">\n    <div class=\"modal-content\">\n      <div class=\"modal-header\">\n        <h4 class=\"modal-title\" id=\"Heading\">End Task</h4>\n        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\">&#x2715;</span></button>\n      </div>\n      <!-- /.model-header -->\n      <div class=\"modal-body\">\n        <div class=\"alert alert-danger\"><span class=\"glyphicon glyphicon-warning-sign\"></span> Are you sure, you want to end this Task?</div>\n      </div>\n      <!-- /.model-body -->\n      <div class=\"modal-footer \">\n        <button type=\"button\" class=\"btn btn-success\" style=\"cursor: pointer;\" data-dismiss=\"modal\" (click)=\"endTask()\"><span class=\"glyphicon glyphicon-ok-sign\">&#x2714;</span> Yes</button>\n        <button type=\"button\" class=\"btn btn-primary\" style=\"cursor: pointer;\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\">&#x2716;</span> No</button>\n      </div>\n      <!-- /.model-footer -->\n    </div>\n    <!-- /.modal-content --> \n  </div>\n  <!-- /.modal-dialog --> \n</div>"

/***/ }),

/***/ "./src/app/view-task/view-task.component.ts":
/*!**************************************************!*\
  !*** ./src/app/view-task/view-task.component.ts ***!
  \**************************************************/
/*! exports provided: ViewTaskComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ViewTaskComponent", function() { return ViewTaskComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _api_service_task_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../api-service/task.service */ "./src/app/api-service/task.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var ViewTaskComponent = /** @class */ (function () {
    function ViewTaskComponent(taskService, router) {
        this.taskService = taskService;
        this.router = router;
    }
    ViewTaskComponent.prototype.ngOnInit = function () {
        this.viewTasks();
    };
    ViewTaskComponent.prototype.viewTasks = function () {
        var _this = this;
        this.taskService.getAllTasks().subscribe(function (data) {
            _this.tasks = data.response;
            _this.sort();
        });
    };
    ViewTaskComponent.prototype.editTask = function (task) {
        window.localStorage.removeItem('selectedTaskId');
        window.localStorage.setItem('selectedTaskId', task.taskId.toString());
        this.router.navigate(['edit-task']);
    };
    ViewTaskComponent.prototype.prepareEndTask = function (task) {
        window.localStorage.removeItem('selectedTaskId');
        window.localStorage.setItem('selectedTaskId', task.taskId.toString());
    };
    ViewTaskComponent.prototype.endTask = function () {
        var _this = this;
        var selectedTaskId = window.localStorage.getItem('selectedTaskId');
        if (selectedTaskId) {
            var selectedTask_1;
            this.taskService.getTask(selectedTaskId).subscribe(function (data) {
                selectedTask_1 = data.response;
                selectedTask_1.active = 'N';
                _this.taskService.updateTask(selectedTask_1).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["first"])())
                    .subscribe(function (data) {
                    if (data.statusCode == 201) {
                        setTimeout("2000");
                        alert("You've successfully completed a Task!");
                        _this.ngOnInit();
                    }
                    else {
                        alert(data.message);
                    }
                }, function (error) {
                    alert("Sorry! Something went wrong, update cannot be possible at the moment. Please try again.");
                });
            });
        }
    };
    ViewTaskComponent.prototype.sort = function () {
        this.tasks.sort(function (t1, t2) {
            var num = t1.taskName.localeCompare(t2.taskName);
            if (num < 0) {
                return -1;
            }
            else if (num > 0) {
                return 1;
            }
            else {
                return 0;
            }
        });
    };
    ViewTaskComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'view-task',
            template: __webpack_require__(/*! ./view-task.component.html */ "./src/app/view-task/view-task.component.html"),
            styles: [__webpack_require__(/*! ./view-task.component.css */ "./src/app/view-task/view-task.component.css")]
        }),
        __metadata("design:paramtypes", [_api_service_task_service__WEBPACK_IMPORTED_MODULE_1__["TaskService"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], ViewTaskComponent);
    return ViewTaskComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\Mohamed\git\TaskManager-Web\task-manager-app\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map