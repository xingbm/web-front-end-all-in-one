<template>
    <div>
        <!-- 条件查询 -->
        <!--条件表单 start-->
        <el-form :inline="true" :model="studentVo" size="mini" class="demo-form-inline">
            <el-form-item label="班级">
                <el-select v-model="studentVo.cid" placeholder="请选择班级">
                    <el-option label="Java12班" value="c001"></el-option>
                    <el-option label="Java34班" value="c002"></el-option>
                </el-select>
            </el-form-item>
            <el-form-item>
                <el-input 
                    v-model="studentVo.name" 
                    placeholder="请输入姓名">
                </el-input>
            </el-form-item>
            <el-form-item label="年龄">
                <el-col :span="11">
                    <el-input v-model="studentVo.startAge" placeholder="请输入开始年龄"></el-input>
                </el-col>
                <el-col class="line" :span="1">&nbsp;-</el-col>
                <el-col :span="11">
                    <el-input v-model="studentVo.endAge" placeholder="请输入结束年龄"></el-input>
                </el-col>
            </el-form-item>
            <el-form-item>
                <el-button type="primary" @click="onSubmit">查询</el-button>
            </el-form-item>
        </el-form>
        <!--条件表单 end-->
        <el-table 
            :data="studentList"
            stripe
            border
            @selection-change="handleSelectionChange">
            <el-table-column type="selection" width="55"></el-table-column>
            <el-table-column prop="sid" label="编号" width="150"></el-table-column>
            <el-table-column prop="sname" label="姓名" width="150"></el-table-column>
            <el-table-column prop="gender" label="性别" width="150"></el-table-column>
            <el-table-column prop="age" label="年龄" width="150"></el-table-column>
            <el-table-column label="爱好" >
                <template slot-scope="scope">
                <el-tag type="warning" v-for="(hobby,index) in scope.row.hobbies" :key="index">{{hobby}}</el-tag>
                </template>
            </el-table-column>
            <el-table-column label="操作">
                <template slot-scope="scope">
                <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
        <!-- 分页 -->
        <el-pagination
            layout="total,sizes,prev,pager,next,jumper"
            :page-sizes="[1,5,15,20,50]"
            :page-size="pageInfo.pageNumber"
            :current-page="pageInfo.pageSize"
            :total="pageInfo.total"
            >
            
        </el-pagination>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                multipleSelection: [],  //多选，选中的数据
                studentList:[
                    {
                        sid:'s001',
                        sname:'张三',
                        gender:'男',
                        age:18,
                        hobbies: ['抽烟','喝酒','烫头']
                    },{
                        sid:'s002',
                        sname:'李四',
                        gender:'女',
                        age:22,
                        hobbies: ['抽烟','烫头']
                    }
                ],
                // 搜索表单
                studentVo: {
                    cid:null,
                    name:null,
                    startAge:null,
                    endAge:null
                },
                pageInfo: {
                    pageNumber:15,
                    pageSize:20,
                    total:1000
                }
            }
        },
        methods: {
            handleSelectionChange(val) {
            this.multipleSelection = val;  //保存选中的数据
            },
            handleEdit(index, row) {
                console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        }
    }
</script>

<style>
    .el-tag + .el-tag {
        margin-left: 10px;
    }
</style>
