package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Map<String, String> $params;
    public final /* synthetic */ rul<Map<String, String>, t> $showSubScribePopCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1(Context context, rul<? super Map<String, String>, t> rulVar, Map<String, String> map) {
        super(0);
        this.$context = context;
        this.$showSubScribePopCallback = rulVar;
        this.$params = map;
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
        rul<Map<String, String>, t> rulVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (b.c(this.$context) || (rulVar = this.$showSubScribePopCallback) == null) {
        } else {
            rulVar.mo2421invoke(this.$params);
        }
    }
}
