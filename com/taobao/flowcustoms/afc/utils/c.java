package com.taobao.flowcustoms.afc.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17187a;
    private static boolean b;

    static {
        kge.a(-1625555224);
        f17187a = true;
        try {
            if (!f17187a) {
                return;
            }
            b = new File("/data/local/tmp/", "tao_link_log_open").exists();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f17187a = z;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f17187a) {
        } else {
            if (b) {
                Log.e(str, str2);
            } else {
                TLog.logd("linkManager", str, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!f17187a) {
        } else {
            if (b) {
                Log.e(str, str2);
            } else {
                TLog.loge("linkManager", str, str2);
            }
        }
    }
}
