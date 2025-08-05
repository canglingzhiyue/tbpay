package com.taobao.login4android.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes.dex */
public class LoginSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_LOGIN = "login4android";
    public static final String SGCOOKIE = "sgcookie";
    public static final String SWITCH_VALUE_FALSE = "false";
    public static final String SWITCH_VALUE_TRUE = "true";
    public static final String TAG = "loginsession.LoginSwitch";

    static {
        kge.a(65824705);
    }

    public static boolean getSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7f2a49", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("login4android", str, str2);
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Boolean.parseBoolean(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static int getSwitch(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c25e11b", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            String config = orangeConfig.getConfig("login4android", str, i + "");
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Integer.parseInt(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }
}
