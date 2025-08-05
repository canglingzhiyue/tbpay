package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.triver.triver_shop.newShop.ext.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class WVShopApiBridge$allItemCategoryTips$1$1$1$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ rul<Boolean, Boolean> $it;
    public final /* synthetic */ String $visibleData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WVShopApiBridge$allItemCategoryTips$1$1$1$1$1(rul<? super Boolean, Boolean> rulVar, String str, WVCallBackContext wVCallBackContext) {
        super(0);
        this.$it = rulVar;
        this.$visibleData = str;
        this.$callback = wVCallBackContext;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        boolean booleanValue = this.$it.mo2421invoke(Boolean.valueOf(q.a((Object) this.$visibleData, (Object) "true"))).booleanValue();
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(d.a(j.a("success", Boolean.valueOf(booleanValue))).toJSONString());
    }
}
