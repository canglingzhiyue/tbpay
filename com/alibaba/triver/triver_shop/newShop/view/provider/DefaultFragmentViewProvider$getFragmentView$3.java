package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class DefaultFragmentViewProvider$getFragmentView$3 extends Lambda implements ruk<com.alibaba.triver.triver_shop.newShop.view.h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Fragment $outerFragment;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFragmentViewProvider$getFragmentView$3(a aVar, Context context, Fragment fragment) {
        super(0);
        this.this$0 = aVar;
        this.$context = context;
        this.$outerFragment = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final com.alibaba.triver.triver_shop.newShop.view.h mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.view.h) ipChange.ipc$dispatch("5716c71", new Object[]{this});
        }
        a aVar = this.this$0;
        com.alibaba.triver.triver_shop.newShop.data.g gVar = a.$ipChange;
        Context context = this.$context;
        Fragment fragment = this.$outerFragment;
        return a.$ipChange;
    }
}
