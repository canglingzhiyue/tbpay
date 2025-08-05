package com.taobao.tao.welcome.fragments;

import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(542896616);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            TLog.loge("Welcome", "TFragmentState", str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            Log.e("TFragmentState", str);
        }
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        a(str);
        b(str);
    }

    public static void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        c("try to clear fragments");
        if (bundle != null) {
            String string = bundle.getString("taobao:state:source", "unknown");
            c("saved state is from " + string);
            if (bundle.containsKey("android:support:fragments")) {
                c("saved state is not belong to Welcome, key: android:support:fragments, remove it");
                bundle.remove("android:support:fragments");
            }
        }
        c("clear finished");
    }
}
