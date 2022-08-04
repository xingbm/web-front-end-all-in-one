<template>
    <div>
        <!-- 单选 -->
        <el-table 
            ref="singleTable"
            :data="studentList" 
            highlight-current-row 
            @current-change="handleCurrentChange">
            <el-table-column prop="sid" label="编号" width="150"></el-table-column>
            <el-table-column prop="sname" label="姓名" width="150"></el-table-column>
            <el-table-column prop="gender" label="性别" width="150"></el-table-column>
            <el-table-column prop="age" label="年龄" width="150"></el-table-column>
        </el-table>
        <div style="margin-top: 20px">
            <el-button @click="setCurrent(studentList[1])">选中第2行</el-button>
            <el-button @click="setCurrent()">取消选择</el-button>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                studentList:[
                    {
                        sid:'s001',
                        sname:'张三',
                        gender:'男',
                        age:18
                    },{
                        sid:'s002',
                        sname:'李四',
                        gender:'女',
                        age:22
                    }
                ]
            }
        },
        methods: {
            setCurrent(row) {
                this.$refs.singleTable.setCurrentRow(row);
            },
            handleCurrentChange(val) {
                this.currentRow = val;
            }
    }
    }
</script>

<style>
    
</style>