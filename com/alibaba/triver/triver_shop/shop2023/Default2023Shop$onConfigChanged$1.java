package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Default2023Shop$onConfigChanged$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$onConfigChanged$1(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.Default2023Shop$onConfigChanged$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(0);
            this.this$0 = aVar;
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
            a.z(this.this$0);
            a aVar = this.this$0;
            a aVar2 = this.this$0;
            a aVar3 = this.this$0;
            a aVar4 = this.this$0;
            h.a(a.$ipChange, a.$ipChange, a.$ipChange, a.$ipChange, a.p(this.this$0));
        }
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
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new AnonymousClass1(this.this$0), 100L);
        }
    }
}
