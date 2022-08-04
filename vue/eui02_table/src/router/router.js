import Vue from 'vue';
import Router from 'vue-router';
import StudentList_base from '../views/StudentList_base.vue';
import StudentList_decorate from '../views/StudentList_decorate.vue';
import StudentList_singleSelection from '../views/StudentList_singleSelection.vue';
import StudentList_multipleSelection from '../views/StudentList_multipleSelection.vue';
import StudentList_template from '../views/StudentList_template.vue';
import StudentList_Query_Conditions from '../views/StudentList_Query_Conditions.vue';
import StudentList_Pagination from '../views/StudentList_Pagination.vue';

//vue引入路由插件
Vue.use(Router);

// 设置具体的路由
export default new Router({
    mode:"history",
    base:process.env.BASE_URL,
    routes:[
        {
            path:"/studentList_base",
            title:"学生列表-基本表格",
            component:StudentList_base
        },
        {
            path:"/studentList_decorate",
            title:"学生列表-表格修饰",
            component:StudentList_decorate
        },
        {
            path:"/studentList_singleSelection",
            title:"学生列表-单选",
            component:StudentList_singleSelection
        },
        {
            path:"/studentList_multipleSelection",
            title:"学生列表-多选",
            component:StudentList_multipleSelection
        },
        {
            path:"/studentList_template",
            title:"学生列表-自定义模板",
            component:StudentList_template
        },
        {
            path:"/studentList_Query_Conditions",
            title:"学生列表-条件查询",
            component:StudentList_Query_Conditions
        },
        {
            path:"/studentList_Pagination",
            title:"学生列表-分页",
            component:StudentList_Pagination
        }
    ]
});