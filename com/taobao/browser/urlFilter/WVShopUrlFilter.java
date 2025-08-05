package com.taobao.browser.urlFilter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.pha.tb.tabcontainer.TabFrameActivity;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.shop.common.ShopUrlFilter;
import com.taobao.tao.shop.common.b;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public class WVShopUrlFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-474597744);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String shopFilter(java.lang.String r4, android.content.Intent r5, android.os.Handler r6, final android.content.Context r7, java.util.HashMap<java.lang.String, java.lang.String> r8) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.browser.urlFilter.WVShopUrlFilter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L24
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            r4 = 4
            r1[r4] = r7
            r4 = 5
            r1[r4] = r8
            java.lang.String r4 = "8b140089"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L24:
            android.os.Bundle r6 = r5.getExtras()     // Catch: java.lang.Exception -> L35
            if (r6 == 0) goto L35
            android.os.Bundle r5 = r5.getExtras()     // Catch: java.lang.Exception -> L35
            java.lang.String r6 = "AppLinkISOnNewIntent"
            boolean r5 = r5.getBoolean(r6)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r5 = 0
        L36:
            if (r5 != 0) goto L56
            com.taobao.tao.shop.common.ShopUrlFilter r5 = new com.taobao.tao.shop.common.ShopUrlFilter
            r5.<init>()
            boolean r5 = r5.a(r4, r7)
            if (r5 == 0) goto L55
            tb.alj r5 = tb.alj.a()
            java.lang.String r6 = "afc"
            r5.a(r6, r8)
            boolean r5 = r7 instanceof android.app.Activity
            if (r5 == 0) goto L55
            android.app.Activity r7 = (android.app.Activity) r7
            r7.finish()
        L55:
            return r4
        L56:
            com.taobao.tao.shop.common.ShopUrlFilter r5 = new com.taobao.tao.shop.common.ShopUrlFilter
            r5.<init>()
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r2)
            com.taobao.browser.urlFilter.WVShopUrlFilter$1 r8 = new com.taobao.browser.urlFilter.WVShopUrlFilter$1
            r8.<init>()
            boolean r5 = r5.a(r4, r7, r8)
            r6.set(r5)
            boolean r5 = r6.get()
            if (r5 == 0) goto L74
            java.lang.String r4 = "about:blank"
        L74:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.urlFilter.WVShopUrlFilter.shopFilter(java.lang.String, android.content.Intent, android.os.Handler, android.content.Context, java.util.HashMap):java.lang.String");
    }

    public boolean urlHitWithCallback(String str, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f280d8c", new Object[]{this, str, context})).booleanValue();
        }
        ShopUrlFilter shopUrlFilter = new ShopUrlFilter();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicBoolean.set(shopUrlFilter.a(str, context, new b() { // from class: com.taobao.browser.urlFilter.WVShopUrlFilter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.shop.common.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!atomicBoolean.get()) {
                } else {
                    Context context2 = context;
                    if (context2 instanceof BrowserActivity) {
                        ((BrowserActivity) context2).finish(true);
                    } else if (!(context2 instanceof TabFrameActivity)) {
                    } else {
                        ((BaseActivity) context2).finish(true);
                    }
                }
            }
        }));
        return atomicBoolean.get();
    }
}
