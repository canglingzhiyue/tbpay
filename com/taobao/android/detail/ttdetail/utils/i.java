package com.taobao.android.detail.ttdetail.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-172804514);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(com.taobao.android.detail.ttdetail.d.TAG, str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (str == null) {
            str = "NULL";
        }
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = "TTDetail_" + str;
        Log.e(str3, str2);
        AliLogInterface a2 = com.taobao.android.n.a();
        if (a2 == null) {
            return;
        }
        a2.d(str3, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        if (str == null) {
            str = "NULL";
        }
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = "TTDetail_" + str;
        Log.e(str3, str2, th);
        AliLogInterface a2 = com.taobao.android.n.a();
        if (a2 == null) {
            return;
        }
        a2.a(str3, str2, th);
    }
}
