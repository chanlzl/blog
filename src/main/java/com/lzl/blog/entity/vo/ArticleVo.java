package com.lzl.blog.entity.vo;

import org.springframework.data.relational.core.sql.In;

import java.util.Date;

public class ArticleVo {
        /**
         * 文章主键
         */
        private Integer id;

        private String content;

        /**
         * 文章主题
         */
        private String title;

        /**
         * 作者id
         */
        private String userId;

        /**
        * 作者
        */
        private String userName;

        /**
         * 创建时间
         */
        private Date createTime;

        /**
         * 修改时间
         */
        private Date updateTime;

        /**
         * 文章概要
         */
        private String summary;

        /**
         * 阅读数
         */
        private Integer readCount;

        /**
         * 分类id
         */
        private Integer classId;

        /**
         * 分类名称
         */
        private String className;

        /**
         * 是否精华
         */
        private Boolean isEssence;

        /**
         * 是否置顶
         */
        private Integer isTop;

        /**
         * 是否删除，1:删除
         */
        private Integer isDelete;

        /**
         * 文章主键
         * @return id 文章主键
         */
        public Integer getId() {
            return id;
        }

        /**
         * 文章主键
         * @param id 文章主键
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * 文章主题
         * @return title 文章主题
         */
        public String getTitle() {
            return title;
        }

        /**
         * 文章主题
         * @param title 文章主题
         */
        public void setTitle(String title) {
            this.title = title == null ? null : title.trim();
        }

        /**
         * 作者id
         * @return user_id 作者id
         */
        public String getUserId() {
            return userId;
        }

        /**
         * 作者id
         * @param userId 作者id
         */
        public void setUserId(String userId) {
            this.userId = userId;
        }

        /**
         * 创建时间
         * @return create_time 创建时间
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 创建时间
         * @param createTime 创建时间
         */
        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        /**
         * 修改时间
         * @return update_time 修改时间
         */
        public Date getUpdateTime() {
            return updateTime;
        }

        /**
         * 修改时间
         * @param updateTime 修改时间
         */
        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        /**
         * 文章概要
         * @return summary 文章概要
         */
        public String getSummary() {
            return summary;
        }

        /**
         * 文章概要
         * @param summary 文章概要
         */
        public void setSummary(String summary) {
            this.summary = summary == null ? null : summary.trim();
        }

        /**
         * 阅读数
         * @return read_count 阅读数
         */
        public Integer getReadCount() {
            return readCount;
        }

        /**
         * 阅读数
         * @param readCount 阅读数
         */
        public void setReadCount(Integer readCount) {
            this.readCount = readCount;
        }

        /**
         * 分类id
         * @return class_id 分类id
         */
        public Integer getClassId() {
            return classId;
        }

        /**
         * 分类id
         * @param classId 分类id
         */
        public void setClassId(Integer classId) {
            this.classId = classId;
        }

        /**
         * 是否精华
         * @return is_essence 是否精华
         */
        public Boolean getIsEssence() {
            return isEssence;
        }

        /**
         * 是否精华
         * @param isEssence 是否精华
         */
        public void setIsEssence(Boolean isEssence) {
            this.isEssence = isEssence;
        }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Boolean getEssence() {
        return isEssence;
    }

    public void setEssence(Boolean essence) {
        isEssence = essence;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", summary='" + summary + '\'' +
                ", readCount=" + readCount +
                ", classId=" + classId +
                ", className=" + className +
                ", isEssence=" + isEssence +
                ", isTop=" + isTop +
                ", isDelete=" + isDelete +
                '}';
    }
}
