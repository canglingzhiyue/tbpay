package com.taobao.tao;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;

/* loaded from: classes.dex */
public class TaoApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean sInit = false;
    public static String sPackageName;
    public static String sProcessName;
    private String TAG = "TaoApplication";

    public static /* synthetic */ Object ipc$super(TaoApplication taoApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (sInit) {
        } else {
            super.onCreate();
            sProcessName = getProcessName(Globals.getApplication());
            sPackageName = getPackageName(Globals.getApplication());
            sInit = true;
        }
    }

    public void onCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{this, context});
        } else {
            onCreate();
        }
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]) : TaoPackageInfo.getVersion();
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]) : TaobaoApplication.getTTID();
    }

    public static final String getTTIDNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c591c44", new Object[0]) : TaoPackageInfo.getTTIDNum();
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!StringUtils.isEmpty(sProcessName)) {
            return sProcessName;
        }
        return TaobaoApplication.getProcessName(context);
    }

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        if (!StringUtils.isEmpty(sPackageName)) {
            return sPackageName;
        }
        return TaobaoApplication.getPackageName(context);
    }
}
