<template>
    <div>
        <el-button type="primary" @click="drawerFormVisible=true">修改学生信息</el-button>
        <!-- 抽屉start -->
        <el-drawer 
            title="我是标题" 
            :visible.sync="drawerFormVisible"
            direction="rtl"
            :before-close="handleClose">
            <el-form :model="student" label-width="80px">
                <el-form-item label="姓名">
                    <el-input v-model="student.sname" autocomplete="off"></el-input>
                </el-form-item>
                <el-form-item label="班级">
                    <el-select v-model="student.cid" placeholder="请选择班级">
                        <el-option label="Java12班" value="c001"></el-option>
                        <el-option label="Java34班" value="c002"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="drawerFormVisible=false">确定</el-button>
                    <el-button @click="drawerFormVisible=false">取消</el-button>
                </el-form-item>
            </el-form>
        </el-drawer>
        <!-- 抽屉end -->
    </div>
</template>

<script>
    export default {
        data() {
            return {
                drawerFormVisible:false,
                student:{
                    cid:"",
                    cname:""
                }
            }
        },
        methods:{
            handleClose(done) {
            this.$confirm('确认关闭？')
                .then(() => {
                    //确定按钮
                    done();   //结束回调
                    })
                .catch(() => {
                    //取消
                    });
            }
        }
    }
</script>