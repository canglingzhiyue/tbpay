package anet.channel.util;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ErrorConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_ACCS_CUSTOM_FRAME_CB_NULL = -105;
    public static final int ERROR_AUTH_EXCEPTION = -302;
    public static final int ERROR_BG_NOT_SOCKET_PERMISSION_1 = -2611;
    public static final int ERROR_BG_NOT_SOCKET_PERMISSION_2 = -2301;
    public static final int ERROR_CONNECT_EXCEPTION = -406;
    public static final int ERROR_CONN_TIME_OUT = -400;
    public static final int ERROR_DATA_LENGTH_NOT_MATCH = -206;
    public static final int ERROR_DATA_TOO_LARGE = -303;
    public static final int ERROR_EXCEPTION = -101;
    public static final int ERROR_FRAGMENTATION_PARTIAL_FINISH = -207;
    public static final int ERROR_GET_PROCESS_NULL = -108;
    public static final int ERROR_GET_PUBLIC_KEY = -3530;
    public static final int ERROR_HOST_NOT_VERIFY_ERROR = -403;
    public static final int ERROR_IO_EXCEPTION = -404;
    public static final int ERROR_MD5_EXCEPTION = -208;
    public static final int ERROR_NO_NETWORK = -200;
    public static final int ERROR_NO_STRATEGY = -203;
    public static final int ERROR_OKHTTP_ON_FAILURE = -500;
    public static final int ERROR_OKHTTP_RESPONSE_ERROR = -501;
    @Deprecated
    public static final int ERROR_OPEN_CONNECTION_NULL = -407;
    public static final int ERROR_PARAM_ILLEGAL = -102;
    public static final int ERROR_REMOTE_CALL_FAIL = -103;
    public static final int ERROR_REQUEST_CANCEL = -204;
    public static final int ERROR_REQUEST_FAIL = -201;
    public static final int ERROR_REQUEST_FORBIDDEN_IN_BG = -205;
    public static final int ERROR_REQUEST_SOCKET_NOT_PERMISSION_IN_BG = -212;
    public static final int ERROR_REQUEST_TIME_OUT = -202;
    public static final int ERROR_SESSION_INVALID = -301;
    public static final int ERROR_SOCKET_TIME_OUT = -401;
    public static final int ERROR_SSL_ERROR = -402;
    public static final int ERROR_TNET_EXCEPTION = -300;
    public static final int ERROR_TNET_REQUEST_FAIL = -304;
    public static final int ERROR_UNKNOWN = -100;
    public static final int ERROR_UNKNOWN_HOST_EXCEPTION = -405;
    public static final int ERROR_ZSTD_STREAM_CATCH_EXCEPTION = -211;
    public static final int ERROR_ZSTD_STREAM_EXCEPTION = -210;
    public static final int SC_OK = 200;
    private static SparseArray<String> errorMsgMap;

    static {
        kge.a(1372361534);
        SparseArray<String> sparseArray = new SparseArray<>();
        errorMsgMap = sparseArray;
        sparseArray.put(200, "请求成功");
        errorMsgMap.put(-100, "未知错误");
        errorMsgMap.put(-101, "发生异常");
        errorMsgMap.put(-102, "非法参数");
        errorMsgMap.put(-103, "远程调用失败");
        errorMsgMap.put(-105, "ACCS自定义帧回调为空");
        errorMsgMap.put(ERROR_GET_PROCESS_NULL, "获取Process失败");
        errorMsgMap.put(-200, mtopsdk.mtop.util.ErrorConstant.ERRMSG_NO_NETWORK);
        errorMsgMap.put(ERROR_NO_STRATEGY, "无策略");
        errorMsgMap.put(-202, "请求超时");
        errorMsgMap.put(ERROR_REQUEST_CANCEL, "请求被取消");
        errorMsgMap.put(-205, "请求后台被禁止");
        errorMsgMap.put(ERROR_REQUEST_SOCKET_NOT_PERMISSION_IN_BG, "请求后台Socket权限被回收");
        errorMsgMap.put(ERROR_DATA_LENGTH_NOT_MATCH, "请求收到的数据长度与Content-Length不匹配");
        errorMsgMap.put(-300, "Tnet层抛出异常");
        errorMsgMap.put(-301, "Session不可用");
        errorMsgMap.put(ERROR_AUTH_EXCEPTION, "鉴权异常");
        errorMsgMap.put(ERROR_DATA_TOO_LARGE, "自定义帧数据过大");
        errorMsgMap.put(ERROR_TNET_REQUEST_FAIL, "Tnet请求失败");
        errorMsgMap.put(-400, "连接超时");
        errorMsgMap.put(ERROR_SOCKET_TIME_OUT, "Socket超时");
        errorMsgMap.put(ERROR_SSL_ERROR, "SSL失败");
        errorMsgMap.put(ERROR_HOST_NOT_VERIFY_ERROR, "域名未认证");
        errorMsgMap.put(ERROR_IO_EXCEPTION, "IO异常");
        errorMsgMap.put(ERROR_UNKNOWN_HOST_EXCEPTION, "域名不能解析");
        errorMsgMap.put(ERROR_CONNECT_EXCEPTION, "连接异常");
        errorMsgMap.put(-500, "okhttp调用异常");
        errorMsgMap.put(ERROR_OKHTTP_RESPONSE_ERROR, "okhttp响应处理异常");
    }

    public static String getErrMsg(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebfbe216", new Object[]{new Integer(i)}) : StringUtils.stringNull2Empty(errorMsgMap.get(i));
    }

    public static String formatMsg(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72388944", new Object[]{new Integer(i), str}) : StringUtils.concatString(getErrMsg(i), ":", str);
    }
}
