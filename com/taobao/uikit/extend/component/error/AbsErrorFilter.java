package com.taobao.uikit.extend.component.error;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class AbsErrorFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ERRORVIEW_LIMIT_ERROR_SUBTITLE = "errorview_limit_error_subtitle";
    public static final String KEY_ERRORVIEW_LIMIT_ERROR_TITLE = "errorview_limit_error_title";
    public static final String KEY_ERRORVIEW_NETWORKERROR_SUBTITLE = "errorview_networkerror_subtitle";
    public static final String KEY_ERRORVIEW_NETWORKERROR_TITLE = "errorview_networkerror_title";
    public static final String KEY_ERRORVIEW_SYS_ERROR_SUBTITLE = "errorview_sys_error_subtitle";
    public static final String KEY_ERRORVIEW_SYS_ERROR_TITLE = "errorview_sys_error_title";

    static {
        kge.a(-1782690404);
    }

    public abstract int filterIcon(Error error);

    public abstract String filterSubTitle(Error error, CharSequence charSequence);

    public abstract String filterTitle(Error error, CharSequence charSequence);

    public boolean isHttpError(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f23414ca", new Object[]{this, new Integer(i)})).booleanValue() : i == 204 || i == 302 || i == 400 || i == 401 || i == 403 || i == 404 || i == 502 || i == 503 || i == 504 || i == 500 || i == 499 || i == 599;
    }

    public boolean isNetworkError(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35bab659", new Object[]{this, str})).booleanValue() : str.equals(ErrorConstant.ERRCODE_NO_NETWORK) || str.equals("ANDROID_SYS_NETWORK_ERROR");
    }

    public boolean isSysError(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2570205", new Object[]{this, new Integer(i), str})).booleanValue() : str.startsWith("FAIL_SYS") || str.equals("FAIL") || str.equals("UNKNOWN_ERROR") || str.equals(ErrorConstant.ERRCODE_SYSTEM_ERROR) || str.equals("UNKNOWN_FAIL_CODE") || str.startsWith("ANDROID_SYS") || isHttpError(i);
    }

    public boolean isLimitError(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31597873", new Object[]{this, new Integer(i), str})).booleanValue() : i == 419 || i == 420 || isLimitErrorByRetCode(str);
    }

    private boolean isLimitErrorByRetCode(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("137b2a55", new Object[]{this, str})).booleanValue() : "ANDROID_SYS_API_FLOW_LIMIT_LOCKED".equals(str);
    }
}
