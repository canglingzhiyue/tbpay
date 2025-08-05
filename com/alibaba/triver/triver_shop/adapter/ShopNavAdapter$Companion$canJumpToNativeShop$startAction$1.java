package com.alibaba.triver.triver_shop.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $bundleId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $disableShopAnimation;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ Intent $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1(Intent intent, Context context, Intent intent2, boolean z, long j) {
        super(0);
        this.$source = intent;
        this.$context = context;
        this.$intent = intent2;
        this.$disableShopAnimation = z;
        this.$bundleId = j;
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
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Intent intent = this.$source;
        if (intent != null && (extras = intent.getExtras()) != null) {
            com.alibaba.triver.triver_shop.newShop.data.e.INSTANCE.a(this.$bundleId, extras);
        }
        if (!(this.$context instanceof Activity)) {
            this.$intent.setFlags(268435456);
            if (this.$disableShopAnimation) {
                this.$intent.addFlags(65536);
            }
        }
        this.$context.startActivity(this.$intent);
    }
}
