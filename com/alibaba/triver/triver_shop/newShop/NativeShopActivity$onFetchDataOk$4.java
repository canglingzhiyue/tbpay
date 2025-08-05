package com.alibaba.triver.triver_shop.newShop;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.ext.b;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$onFetchDataOk$4 extends Lambda implements rul<View, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$onFetchDataOk$4(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(View view) {
        invoke2(view);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        NativeShopActivity.d(this.this$0, it);
        NativeShopActivity nativeShopActivity = this.this$0;
        NativeShopActivity.$ipChange.addView(it);
        b.d(new AnonymousClass1(this.this$0));
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$onFetchDataOk$4$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity) {
            super(0);
            this.this$0 = nativeShopActivity;
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
            NativeShopActivity nativeShopActivity = this.this$0;
            if (!NativeShopActivity.$ipChange || !NativeShopActivity.y(this.this$0)) {
                return;
            }
            NativeShopActivity.f(this.this$0, true);
        }
    }
}
