package com.ali.user.mobile.app;

import android.os.Build;
import android.text.TextUtils;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean NEED_ACCS_LOGIN;
    public static CommonDataCallback alipayHkCallback;
    public static CommonCallback callback;
    public static int launchTime;
    public static String loginUIType;
    public static String mFrom;
    public static LoginParam sCurrentLoginParam;
    public static long sLoginRpcStartTime;
    public static long sSSOAuthCodeStartTime;
    public static long sSingleLoginStartTime;
    public static volatile Map<String, String> times;
    public static String traceid;
    public static RpcResponse uninstallResponse;
    public static int uninstallType;

    static {
        kge.a(356396156);
        NEED_ACCS_LOGIN = false;
        launchTime = -1;
        times = Collections.synchronizedMap(new HashMap());
        sCurrentLoginParam = null;
    }

    public static String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[0]);
        }
        if (TextUtils.isEmpty(traceid)) {
            traceid = AppInfo.getInstance().getUtdid() + "_" + (System.currentTimeMillis() / 1000) + "_" + Build.BRAND;
        }
        return traceid;
    }

    public static int getLaunchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff14c017", new Object[0])).intValue();
        }
        if (launchTime == -1) {
            launchTime = FileUtil.getLaunchTimes();
        }
        return launchTime;
    }
}
