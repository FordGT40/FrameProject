package com.wisdom.util.http_util.callback;

import java.io.Serializable;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：16/9/28
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class SimpleResponse implements Serializable {

//    private static final long serialVersionUID = -1477609349345966116L;

    public int error_code;
    public String error_msg;

    public BaseModel toBaseModel() {
        BaseModel baseModel = new BaseModel();
        baseModel.error_code = error_code;
        baseModel.error_msg = error_msg;
        return baseModel;
    }
}