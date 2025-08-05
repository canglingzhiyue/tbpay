package com.alibaba.triver.triver_shop.newShop.view.component;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class BaseContentComponent$initComponent$5 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FragmentActivity $context;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$initComponent$5(FragmentActivity fragmentActivity, com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        super(0);
        this.$context = fragmentActivity;
        this.$shopData = dVar;
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
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        FragmentActivity fragmentActivity = this.$context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Intent intent = fragmentActivity.getIntent();
        String str = null;
        if (intent != null && (data = intent.getData()) != null) {
            str = data.toString();
        }
        h.a(fragmentActivity2, str, this.$shopData);
    }
}
