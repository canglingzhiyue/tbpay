package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1642452005);
    }

    public static final void n(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18419cc", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(shopDataParser.J());
        t tVar = t.INSTANCE;
        m.a(shopDataParser, "Page_Shop_Frame_Expose", linkedHashMap);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_IndexFrame", (Map<String, String>) null);
    }

    public static final void b(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5cdd58", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Button-Search", (Map<String, String>) null);
    }

    public static final void c(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93577b7", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Button-Return", (Map<String, String>) null);
    }

    public static final void d(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70e1216", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Page_Shop_Button-More", (Map<String, String>) null);
    }

    public static final void e(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e6ac75", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Page_Shop_Button-Search", ai.c(kotlin.j.a("version", "2.0")));
    }

    public static final void f(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bf46d4", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_2Fmain_expose", (Map<String, String>) null);
    }

    public static final void g(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8097e133", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_2Fother_expose", (Map<String, String>) null);
    }

    public static final void h(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae707b92", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Impression_Pi_Widget_Show", (Map<String, String>) null);
    }

    public static final void i(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4915f1", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_shoplist_Show", (Map<String, String>) null);
    }

    public static final void j(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21b050", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "shoptag_exposure_new", (Map<String, String>) null);
    }

    public static final void k(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37fa4aaf", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        Iterator<Object> it = shopDataParser.I().iterator();
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.p.b();
            }
            m.a(shopDataParser, shopDataParser.g(i), (Map<String, String>) null);
            i = i2;
        }
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8dc919", new Object[]{shopDataParser, new Integer(i), new Integer(i2)});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, shopDataParser.c(i, i2), ai.c(kotlin.j.a("version", "2.0"), kotlin.j.a("position", "header")));
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43048f2a", new Object[]{shopDataParser, new Integer(i)});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        b.a("shopExposeBottomAllSubTab", new ShopUTExposeEventKt$shopExposeBottomAllSubTab$1(shopDataParser, i));
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430483e7", new Object[]{shopDataParser, new Float(f)});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_2Flivecard_exposure", ai.c(kotlin.j.a("cardSize", String.valueOf(f))));
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360083", new Object[]{shopDataParser, str});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_shop_report_monitor_error", ai.c(kotlin.j.a("errorMsg", str)));
    }
}
