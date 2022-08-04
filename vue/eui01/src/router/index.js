import Vue from 'vue';
import Router from 'vue-router';
import XiyangHome from '../views/XiyangHome.vue';

//vue引入路由插件
Vue.use(Router);

// 设置具体的路由
export default new Router({
    mode:"history",
    base:process.env.BASE_URL,
    routes:[
        {
            path:"/",
            title:"首页",
            component:XiyangHome
        }
    ]
});