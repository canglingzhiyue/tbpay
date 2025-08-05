package com.taobao.tao.shop;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bpp;
import tb.kge;

/* loaded from: classes8.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f21092a;

    static {
        kge.a(1634737108);
        f21092a = bpp.a();
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            f21092a.logError("page_shop", "shop_router", str, null, str2, str3, null, a.a(str4));
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            f21092a.commitSuccess(str, str2, "1.0", "page_shop", "shop_router", map);
        }
    }

    public static void a(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fae8b1d", new Object[]{str, str2, map, str3, str4});
        } else {
            f21092a.commitFailure(str, str2, "1.0", "page_shop", "shop_router", map, str3, str4);
        }
    }
}
