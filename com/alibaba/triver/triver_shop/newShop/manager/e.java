package com.alibaba.triver.triver_shop.newShop.manager;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAR_SHOP = "tmallcar";
    public static final String C_BRAND_CLOTH_SHOP = "brandShopClothC";
    public static final a Companion;
    public static final String DEFAULT_2023 = "commonC2023";
    public static final String DEFAULT_SHOP = "defaultShop";
    public static final String DEFAULT_SHOP_V2 = "defaultShopV2";
    public static final String FLAG_SHIP_SHOP = "brandFlagshipShop";
    public static final String FLAG_SHIP_SHOP_V2 = "brandFlagshipShopV2";
    public static final String OVERSEA_SHOP = "overseaShop";
    public static final String VIDEO_SHOP = "videoShop";
    public static final String VIDEO_SHOP_2 = "videoShopV2";
    public static final String XSD_SHOP = "xsdStore";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends com.alibaba.triver.triver_shop.newShop.view.component.a>> f3875a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1765250632);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final com.alibaba.triver.triver_shop.newShop.view.component.a a(String type) {
            q.d(type, "type");
            Class cls = (Class) e.a().get(type);
            if (cls == null) {
                return null;
            }
            return (com.alibaba.triver.triver_shop.newShop.view.component.a) cls.newInstance();
        }
    }

    public static final /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f3875a;
    }

    static {
        kge.a(1839123056);
        Companion = new a(null);
        f3875a = ai.a(j.a(FLAG_SHIP_SHOP, com.alibaba.triver.triver_shop.newShop.view.component.d.class), j.a(FLAG_SHIP_SHOP_V2, com.alibaba.triver.triver_shop.newShop.view.component.d.class), j.a(C_BRAND_CLOTH_SHOP, com.alibaba.triver.triver_shop.newShop.view.component.c.class), j.a(VIDEO_SHOP_2, com.alibaba.triver.triver_shop.newShop.view.component.b.class), j.a(DEFAULT_SHOP_V2, com.alibaba.triver.triver_shop.newShop.view.component.c.class), j.a(DEFAULT_SHOP, com.alibaba.triver.triver_shop.newShop.view.component.c.class), j.a(DEFAULT_2023, com.alibaba.triver.triver_shop.shop2023.a.class), j.a(XSD_SHOP, com.alibaba.triver.triver_shop.shop2023.c.class), j.a(OVERSEA_SHOP, com.alibaba.triver.triver_shop.newShop.view.component.e.class), j.a("farmshop_c", com.alibaba.triver.triver_shop.shop2023.d.class), j.a("farmshop_x", com.alibaba.triver.triver_shop.shop2023.d.class), j.a("farmshop_z", com.alibaba.triver.triver_shop.shop2023.d.class));
    }
}
