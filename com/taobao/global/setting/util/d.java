package com.taobao.global.setting.util;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]);
        }
        Application application = Globals.getApplication();
        return application.getSharedPreferences(a(application.getPackageName()), 0);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String userId = Login.getUserId();
        return StringUtils.isEmpty(userId) ? str.concat("_NotLogin") : str.concat("_").concat(userId);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : !StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2);
    }

    public static void a(com.taobao.global.setting.data.c cVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd2c4c", new Object[]{cVar, new Integer(i), str});
        } else if (cVar == null) {
        } else {
            cVar.a(i, str);
        }
    }

    public static <T> void a(com.taobao.global.setting.data.c cVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8701bd", new Object[]{cVar, t});
        } else if (cVar == null) {
        } else {
            cVar.a(t);
        }
    }
}
