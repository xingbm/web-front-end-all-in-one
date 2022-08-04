import Vue from 'vue';
import Router from 'vue-router';
import ComponentButton from '../views/ComponentButton.vue';
import ComponentMessage from '../views/ComponentMessage.vue';
import ComponentMessageBox from '../views/ComponentMessageBox.vue';
import ComponentDialog from '../views/ComponentDialog.vue';
import ComponentDrawer from '../views/ComponentDrawer.vue';
import ComponentTabs from '../views/ComponentTabs.vue';
import ComponentCarousel from '../views/ComponentCarousel.vue';

//vue引入路由插件
Vue.use(Router);

// 设置具体的路由
export default new Router({
    mode:"history",
    base:process.env.BASE_URL,
    routes:[
        {
            path:"/component_button",
            title:"按钮",
            component:ComponentButton
        },
        {
            path:"/component_message",
            title:"按钮",
            component:ComponentMessage
        },
        {
            path:"/component_messagebox",
            title:"消息提示MessageBox",
            component:ComponentMessageBox
        },
        {
            path:"/component_dialog",
            title:"Dialog对话框",
            component:ComponentDialog
        },
        {
            path:"/component_drawer",
            title:"Drawer 抽屉",
            component:ComponentDrawer
        },
        {
            path:"/component_tabs",
            title:"Tabs 标签页",
            component:ComponentTabs
        },
        {
            path:"/component_carousel",
            title:"轮播图",
            component:ComponentCarousel
        }
    ]
});