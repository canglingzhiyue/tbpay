package com.alibaba.triver.triver_shop.preload;

import android.content.Context;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static ShopWrapWebView f4025a;

    static {
        kge.a(-1142163394);
        INSTANCE = new b();
    }

    private b() {
    }

    public static final /* synthetic */ void a(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c2f90a", new Object[]{shopWrapWebView});
        } else {
            f4025a = shopWrapWebView;
        }
    }

    public final ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("641fdd50", new Object[]{this});
        }
        ShopWrapWebView shopWrapWebView = f4025a;
        f4025a = null;
        return shopWrapWebView;
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        q.d(context, "context");
        if (!cen.Companion.Q()) {
            return;
        }
        b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r3 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.content.Context r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.preload.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "9eca0fff"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = com.alibaba.triver.triver_shop.preload.b.f4025a
            r1 = 0
            if (r0 != 0) goto L1c
            r0 = r1
            goto L20
        L1c:
            com.alibaba.triver.triver_shop.newShop.data.d r0 = r0.getShopData()
        L20:
            if (r0 != 0) goto L30
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = com.alibaba.triver.triver_shop.preload.b.f4025a
            if (r0 != 0) goto L27
            goto L2e
        L27:
            boolean r0 = r0.getAlreadyInjectOnNShopPreloadResume()
            if (r0 != r2) goto L2e
            r3 = 1
        L2e:
            if (r3 == 0) goto L62
        L30:
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = com.alibaba.triver.triver_shop.preload.b.f4025a
            com.alibaba.triver.triver_shop.preload.b.f4025a = r1
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L3b
            r0.destroyWebView()     // Catch: java.lang.Throwable -> L42
        L3b:
            kotlin.t r0 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = kotlin.Result.m2371constructorimpl(r0)     // Catch: java.lang.Throwable -> L42
            goto L4d
        L42:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.i.a(r0)
            java.lang.Object r0 = kotlin.Result.m2371constructorimpl(r0)
        L4d:
            java.lang.Throwable r0 = kotlin.Result.m2374exceptionOrNullimpl(r0)
            if (r0 == 0) goto L5a
            tb.ceg$a r1 = tb.ceg.Companion
            java.lang.String r2 = "catching block has error"
            r1.a(r2, r0)
        L5a:
            tb.ceg$a r0 = tb.ceg.Companion
            java.lang.String r1 = "release used preload shop index webView"
            r0.b(r1)
        L62:
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r0 = com.alibaba.triver.triver_shop.preload.b.f4025a
            if (r0 == 0) goto L6e
            tb.ceg$a r5 = tb.ceg.Companion
            java.lang.String r0 = "already have preload shop index webView"
            r5.b(r0)
            return
        L6e:
            com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1 r0 = new com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1
            r0.<init>(r5)
            tb.ruk r0 = (tb.ruk) r0
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r5 = kotlin.jvm.internal.q.a(r5, r1)
            if (r5 == 0) goto L87
            r0.mo2427invoke()
            return
        L87:
            com.alibaba.triver.triver_shop.newShop.ext.b.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.preload.b.b(android.content.Context):void");
    }
}
