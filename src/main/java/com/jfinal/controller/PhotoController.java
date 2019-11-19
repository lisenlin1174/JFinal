package com.jfinal.controller;

import com.jfinal.core.Controller;

public class PhotoController extends Controller {

    public void index(){
        renderHtml("PhotoController index");
    }

    public void view(){
        renderHtml("查看照片");
    }

    public void upload(){
        renderHtml("上传照片");
    }

    public void download(){
        renderHtml("下载照片");
    }

    public void delete(){
        renderHtml("删除照片");
    }
}
