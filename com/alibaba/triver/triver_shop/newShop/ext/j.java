package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1487039265);
    }

    public static /* synthetic */ void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, int i, int i2, String str, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ed489c", new Object[]{dVar, new Integer(i), new Integer(i2), str, new Integer(i3), obj});
            return;
        }
        if ((i3 & 8) != 0) {
            str = "click";
        }
        a(dVar, i, i2, str);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13763ea3", new Object[]{shopDataParser, new Integer(i), new Integer(i2), str});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        try {
            Result.a aVar = Result.Companion;
            HashMap hashMap = new HashMap();
            hashMap.put("idx", String.valueOf(i));
            hashMap.put("actionType", str);
            m.a(shopDataParser, q.a("Page_Shop_", (Object) shopDataParser.c(i, i2)), hashMap, null, 8, null);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43048f2a", new Object[]{shopDataParser, new Integer(i)});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        HashMap hashMap = new HashMap();
        hashMap.put("idx", String.valueOf(i));
        m.a(shopDataParser, q.a("Page_Shop_", (Object) shopDataParser.g(i)), hashMap, null, 8, null);
    }

    public static final void a(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Page_Shop_Button-More", null, null, 8, null);
    }

    public static final void b(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5cdd58", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Button-More_Share", null, null, 8, null);
    }

    public static final void c(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93577b7", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Page_Shop_Button-Search", null, null, 8, null);
    }

    public static final void d(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f70e1216", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_AttentionWeiTao_Button-Attention", null, null, 8, null);
    }

    public static final void e(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e6ac75", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_AttentionWeiTao_Button-CancelAttention", null, null, 8, null);
    }

    public static final void f(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bf46d4", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Page_Shop_Button-ShopInfo", null, null, 8, null);
    }

    public static final void g(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8097e133", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop-2Fmain_click", null, null, 8, null);
    }

    public static final void h(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae707b92", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop-2Fother_click", null, null, 8, null);
    }

    public static final void i(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4915f1", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_shoplist_Click", null, null, 8, null);
    }

    public static final void j(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21b050", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "shoptag_click_new", null, null, 8, null);
    }

    public static final void k(com.alibaba.triver.triver_shop.newShop.data.d shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37fa4aaf", new Object[]{shopDataParser});
            return;
        }
        q.d(shopDataParser, "shopDataParser");
        m.a(shopDataParser, "Page_Shop_Button-Return", null, null, 8, null);
    }
}
