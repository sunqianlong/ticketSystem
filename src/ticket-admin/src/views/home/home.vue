<style lang="less">
    @import "./home.less";
    @import "../../styles/common.less";
</style>
<template>
    <div class="home-main">

    </div>
</template>

<script>

export default {
    name: 'home',
    components: {
    },
    data () {
        return {
            toDoList: [
                {
                    title: '去iView官网学习完整的iView组件'
                },
                {
                    title: '去iView官网学习完整的iView组件'
                },
                {
                    title: '去iView官网学习完整的iView组件'
                },
                {
                    title: '去iView官网学习完整的iView组件'
                },
                {
                    title: '去iView官网学习完整的iView组件'
                }
            ],
            count: {
                createUser: 496,
                visit: 3264,
                collection: 24389305,
                transfer: 39503498
            },
            showAddNewTodo: false,
            newToDoItemValue: ''
        };
    },
    computed: {
        avatorPath () {
            return localStorage.avatorImgPath;
        }
    },
    methods: {
        addNewToDoItem () {
            this.showAddNewTodo = true;
        },
        addNew () {
            if (this.newToDoItemValue.length !== 0) {
                this.toDoList.unshift({
                    title: this.newToDoItemValue
                });
                setTimeout(() => {
                    this.newToDoItemValue = '';
                }, 200);
                this.showAddNewTodo = false;
            } else {
                this.$Message.error('请输入待办事项内容');
            }
        },
        cancelAdd () {
            this.showAddNewTodo = false;
            this.newToDoItemValue = '';
        }
    }
};
</script>
