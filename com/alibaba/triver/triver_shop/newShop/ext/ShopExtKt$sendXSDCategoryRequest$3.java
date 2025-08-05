package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopExtKt$sendXSDCategoryRequest$3 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $startToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendXSDCategoryRequest$3(long j) {
        super(2);
        this.$startToken = j;
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendXSDCategoryRequest$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long $startToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(0);
            this.$startToken = j;
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
                com.alibaba.triver.triver_shop.preload.d.INSTANCE.a(this.$startToken, d.a(kotlin.j.a("success", false)));
            }
        }
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
        } else {
            b.b(new AnonymousClass1(this.$startToken));
        }
    }
}
