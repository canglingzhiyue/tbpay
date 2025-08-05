package com.taobao.android.detail.ttdetail.content;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, a> f10583a;

    static {
        kge.a(1217842739);
        f10583a = new HashMap();
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2fc0289", new Object[]{str, aVar});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("ContentDataManager", "add data, key is " + str);
        f10583a.put(str, aVar);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b0c4227b", new Object[]{str}) : f10583a.get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("ContentDataManager", "remove data, key is " + str);
        f10583a.remove(str);
    }
}
