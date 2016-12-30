package com.myself.mykotlin.db.entity;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "putao_wd_store_template".
 */
@Entity(nameInDb = "putao_wd_store_template")
public class TemplateDB {

    @Id
    private String template_id;
    private String title;
    private String template_content;

    @Generated
    public TemplateDB() {
    }

    public TemplateDB(String template_id) {
        this.template_id = template_id;
    }

    @Generated
    public TemplateDB(String template_id, String title, String template_content) {
        this.template_id = template_id;
        this.title = title;
        this.template_content = template_content;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTemplate_content() {
        return template_content;
    }

    public void setTemplate_content(String template_content) {
        this.template_content = template_content;
    }

}