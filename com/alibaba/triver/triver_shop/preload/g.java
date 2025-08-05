package com.alibaba.triver.triver_shop.preload;

import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<Class<? extends Object>> f4031a;

    static {
        kge.a(1919096130);
        Companion = new a(null);
        f4031a = p.d(ShopActivity.class, com.alibaba.triver.triver_shop.newShop.manager.e.class, com.alibaba.triver.triver_shop.newShop.view.component.d.class, com.alibaba.triver.triver_shop.shop2023.a.class, f.class, com.alibaba.triver.triver_shop.newShop.data.d.class, b.class, ShopWrapWebView.class, ShopBaseWebView.class);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1244473846);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.b.a("preloadAllItemsClass", ShopClassPreloader$Companion$preloadAllItemsClass$1.INSTANCE);
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.b.a("preloadShopSelfClass", ShopClassPreloader$Companion$preloadShopClass$1.INSTANCE);
            }
        }
    }
}
