package com.wisdom;

/**
 * @author HanXueFeng
 * @ProjectName project： FrameProject
 * @class package：com.wisdom
 * @class describe：
 * @time 2018/12/20 11:32
 * @change
 */
public class ConstantString {
    public static Boolean LOGIN_STATE = true;
    //token过期后返回的code
    public static final int CODE_TOKEN_ILLEGAL = 20013;
    public static final int CODE_NO_FILE = 20013;
    public static final int CODE_NO_DATA = 30001;
    public static final String FILE_NO_CONTENT_CODE = "20402";
    //本地存储sp文件的名称
    public static final String SHARE_PER_INFO = "nahe_oa_sp";//本地sp文件的存储名称
    //sp文件存储用户名
    public static final String USER_NAME = "userName";
    //sp文件存储密码
    public static final String PASS_WORD = "psw";
    //sp文件存储用户信息的key
    public static final String USER_INFO = "userInfo";
    //sp文件存储用户权限信息的key
    public static final String USER_PERMISSION = "userPermission";
    //用来唤起的Activity名字的key
    public static final String CALL_TO_ACTIVITY = "callToActivity";//
    public static final String FORM_NOTICE_OPEN = "fromNoticOpen";//
    public static final String FORM_NOTICE_OPEN_DATA = "formNoticeOpenData";//

}
