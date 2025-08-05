package com.taobao.android.detail.core.detail.content;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, c> f9448a;

    static {
        kge.a(1946804601);
        f9448a = new HashMap();
        emu.a("com.taobao.android.detail.core.detail.content.ContentDataManager");
    }

    public static void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210d6dbb", new Object[]{str, cVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.d("ContentDataManager", "add data, key is " + str);
        f9448a.put(str, cVar);
    }

    public static c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1c6d894f", new Object[]{str}) : f9448a.get(str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        com.taobao.android.detail.core.utils.i.d("ContentDataManager", "remove data, key is " + str);
        f9448a.remove(str);
    }
}
