package com.taobao.tao.infoflow.multitab;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ldk;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f20644a;

    static {
        kge.a(-843686248);
        f20644a = new HashMap();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        ldf.d("MultiInfoRecord", str + "->" + str2);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        ldf.a("MultiInfoRecord", str + "->" + str2, th);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        if (map != null) {
            map.put("deviceLevel", com.taobao.tao.homepage.launcher.g.b());
        }
        ldf.d("MultiInfoRecord", "commitState -> " + str + ",transition:" + str2);
        ldk.a(str, "", "1.0", "Page_Home_MultiTab", str2, map);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        ldf.d("MultiInfoRecord", "commitError -> " + str + ",id:" + str2);
        ldk.a(str, "", "1.0", "Page_Home_MultiTab", str3, map);
    }
}
