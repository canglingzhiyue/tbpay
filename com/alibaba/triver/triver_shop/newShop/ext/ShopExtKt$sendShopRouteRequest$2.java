package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.a;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopExtKt$sendShopRouteRequest$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isStoreBizType;
    public final /* synthetic */ String $shopUrl;
    public final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShopRouteRequest$2(boolean z, Context context, String str, long j) {
        super(2);
        this.$isStoreBizType = z;
        this.$context = context;
        this.$shopUrl = str;
        this.$startTime = j;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str});
        }
        invoke(num.intValue(), str);
        return t.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("routeRequestError : " + i + ',' + ((Object) str));
        if (!this.$isStoreBizType) {
            h.d(this.$context, this.$shopUrl);
        }
        Intent intent = new Intent();
        long j = this.$startTime;
        boolean z = this.$isStoreBizType;
        Bundle bundle = new Bundle();
        bundle.putLong(g.KEY_APP_START, j);
        bundle.putBoolean(a.C0430a.SHOW_ERROR, z);
        t tVar = t.INSTANCE;
        intent.putExtras(bundle);
        h.a(intent);
    }
}
