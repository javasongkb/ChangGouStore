package com.javasongkb.changgou.pojo;

/**
 * ClassName:StatusCode
 * Package:com.javasongkb.changgou.pojo
 * Description:
 *  返回码
 * @date:2021/1/5 15:25
 * @outhor:宋凯标
 */
public class StatusCode {
    public static final int OK=200;
    public static final int ERROR=400;
    public static final int LOGIN_ERROR=202; //用户名或密码错误
    public static final int ACCESS_ERROR=203; //权限不足
    public static final int REMOTE_ERROR=204; //远程调用失败
    public static final int REP_ERROR=205; //重复操作
    public static final int DATABASE_ERROR=206; //数据库操作失败
}
