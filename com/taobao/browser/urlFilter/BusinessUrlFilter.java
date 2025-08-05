package com.taobao.browser.urlFilter;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.urlFilter.UrlFilter;
import tb.kge;

/* loaded from: classes6.dex */
public class BusinessUrlFilter implements UrlFilter.URLFilterinterface {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BusinessUrlFilter";
    private Handler mhandler;

    static {
        kge.a(-1463134715);
        kge.a(33568401);
    }

    public BusinessUrlFilter(Handler handler) {
        this.mhandler = handler;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // com.taobao.browser.urlFilter.UrlFilter.URLFilterinterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean doFilter(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.browser.urlFilter.BusinessUrlFilter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "ebc59a6c"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1f:
            java.lang.String r0 = "m.taobao.com/ww/"
            int r0 = r6.indexOf(r0)
            if (r0 < 0) goto L2e
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r5 = com.taobao.browser.urlFilter.WXUtilsProxy.parseWwURl(r5, r6)
            return r5
        L2e:
            com.taobao.tao.shop.common.a r0 = new com.taobao.tao.shop.common.a
            r0.<init>()
            boolean r0 = r0.a(r6, r5)
            if (r0 == 0) goto L3a
            return r2
        L3a:
            boolean r0 = r5 instanceof android.app.Activity     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L60
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L60
            android.content.Intent r1 = r0.getIntent()     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L60
            android.content.Intent r1 = r0.getIntent()     // Catch: java.lang.Exception -> L60
            android.os.Bundle r1 = r1.getExtras()     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L60
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Exception -> L60
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "AppLinkISOnNewIntent"
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Exception -> L60
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 == 0) goto L6a
            com.taobao.browser.config.b r0 = com.taobao.browser.config.a.commonConfig
            boolean r0 = r0.k
            if (r0 == 0) goto L6a
            return r3
        L6a:
            com.taobao.tao.shop.common.ShopUrlFilter r0 = new com.taobao.tao.shop.common.ShopUrlFilter
            r0.<init>()
            boolean r0 = r0.a(r6, r5)
            if (r0 == 0) goto L76
            return r2
        L76:
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.taobao.taobao.R.string.settings_url_keyword
            java.lang.String r5 = r5.getString(r0)
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L90
            android.os.Handler r5 = r4.mhandler
            r6 = 1102(0x44e, float:1.544E-42)
            r0 = 800(0x320, double:3.953E-321)
            r5.sendEmptyMessageDelayed(r6, r0)
            return r2
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.urlFilter.BusinessUrlFilter.doFilter(android.content.Context, java.lang.String):boolean");
    }
}
