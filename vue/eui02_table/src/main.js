import Vue from 'vue'
import App from './App.vue'
import router from './router/router.js'

/**
 * 导入element-ui样式
 */
import 'element-ui/lib/theme-chalk/index.css'

/**
 * 导入element-ui组件
 */
import ElementUI from 'element-ui'

import './plugins/element.js'
/**
 * 并将element ui 注册给vue
 */
Vue.use(ElementUI);

Vue.config.productionTip = false

new Vue({
    router,
    render: h => h(App),
}).$mount('#app')
