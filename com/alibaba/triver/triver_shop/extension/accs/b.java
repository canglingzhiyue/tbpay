package com.alibaba.triver.triver_shop.extension.accs;

import com.alibaba.triver.triver_shop.extension.accs.a;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0131a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f3765a;

    static {
        kge.a(463364875);
        kge.a(1575284265);
    }

    public b(d shopDataParser) {
        q.d(shopDataParser, "shopDataParser");
        this.f3765a = shopDataParser;
    }

    public final d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("820aec79", new Object[]{this}) : this.f3765a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.alibaba.triver.triver_shop.extension.accs.a.InterfaceC0131a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.extension.accs.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "f3a64c32"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            java.lang.String r0 = "data"
            kotlin.jvm.internal.q.d(r5, r0)
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L87
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "shopId"
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L87
            r2 = 0
            if (r1 != 0) goto L2c
            r1 = r2
            goto L30
        L2c:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
        L30:
            com.alibaba.triver.triver_shop.newShop.data.d r3 = r4.a()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = r3.T()     // Catch: java.lang.Throwable -> L87
            boolean r1 = kotlin.jvm.internal.q.a(r1, r3)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L78
            java.lang.String r1 = "sellerId"
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L87
            if (r1 != 0) goto L48
            goto L4c
        L48:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L87
        L4c:
            com.alibaba.triver.triver_shop.newShop.data.d r1 = r4.a()     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.U()     // Catch: java.lang.Throwable -> L87
            boolean r1 = kotlin.jvm.internal.q.a(r2, r1)     // Catch: java.lang.Throwable -> L87
            if (r1 != 0) goto L5b
            goto L78
        L5b:
            com.alibaba.fastjson.JSONObject r0 = r5.getJSONObject(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L80
            java.lang.String r1 = "eventType"
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = "shop.behavior.sequence"
            boolean r5 = kotlin.jvm.internal.q.a(r5, r1)     // Catch: java.lang.Throwable -> L87
            if (r5 == 0) goto L80
            com.alibaba.triver.triver_shop.newShop.data.d r5 = r4.a()     // Catch: java.lang.Throwable -> L87
            com.alibaba.triver.triver_shop.newShop.ext.h.a(r5, r0)     // Catch: java.lang.Throwable -> L87
            goto L80
        L78:
            tb.ceg$a r5 = tb.ceg.Companion     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = "incompatible shopId or sellerId, return"
            r5.a(r0)     // Catch: java.lang.Throwable -> L87
        L80:
            kotlin.t r5 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L87
            java.lang.Object r5 = kotlin.Result.m2371constructorimpl(r5)     // Catch: java.lang.Throwable -> L87
            goto L92
        L87:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.i.a(r5)
            java.lang.Object r5 = kotlin.Result.m2371constructorimpl(r5)
        L92:
            java.lang.Throwable r5 = kotlin.Result.m2374exceptionOrNullimpl(r5)
            if (r5 == 0) goto L9f
            tb.ceg$a r0 = tb.ceg.Companion
            java.lang.String r1 = "catching block has error"
            r0.a(r1, r5)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.extension.accs.b.a(java.lang.String):void");
    }
}
