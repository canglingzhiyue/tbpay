package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopExtKt$sendShopRouteRequest$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isStoreBizType;
    public final /* synthetic */ boolean $match3Rules;
    public final /* synthetic */ Ref.ObjectRef<String> $renderStyleSaver;
    public final /* synthetic */ long $routeStart;
    public final /* synthetic */ String $shopUrl;
    public final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShopRouteRequest$1(String str, Ref.ObjectRef<String> objectRef, boolean z, boolean z2, Context context, long j, long j2) {
        super(1);
        this.$shopUrl = str;
        this.$renderStyleSaver = objectRef;
        this.$match3Rules = z;
        this.$isStoreBizType = z2;
        this.$context = context;
        this.$startTime = j;
        this.$routeStart = j2;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(com.alibaba.fastjson.JSONObject r25) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendShopRouteRequest$1.invoke2(com.alibaba.fastjson.JSONObject):void");
    }
}
