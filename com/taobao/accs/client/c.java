package com.taobao.accs.client;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IProcessName;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f8209a;
    public static boolean b;

    static {
        kge.a(-302473121);
        f8209a = false;
        b = true;
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            Message.CONTROL_MAX_RETRY_TIMES = i;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a.d = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        a.e = str;
        try {
            GlobalClientInfo.getContext().getSharedPreferences(Constants.SP_FILE_NAME, 4).edit().putBoolean(Constants.SP_KEY_ASP_ENABLE, false).apply();
        } catch (Exception e) {
            ALog.e("GlobalConfig", "setChannelProcessName err", e, new Object[0]);
        }
    }

    public static void a(IProcessName iProcessName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc2865c", new Object[]{iProcessName});
        } else {
            a.f = iProcessName;
        }
    }
}
