package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$DefaultTbShopActionListener$follow$2 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$DefaultTbShopActionListener$follow$2(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        boolean a2 = q.a((Object) ((jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) ? null : jSONObject2.getString("result")), (Object) "BIND");
        NativeShopActivity nativeShopActivity = this.this$0;
        NativeShopActivity nativeShopActivity2 = nativeShopActivity;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(nativeShopActivity, a2);
        d b = NativeShopActivity.b(this.this$0);
        if (b != null) {
            h.a(nativeShopActivity2, a2, anonymousClass1, b, new AnonymousClass2(this.this$0));
        } else {
            q.b("shopDataParser");
            throw null;
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$follow$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean $shopStarStatus;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity, boolean z) {
            super(0);
            this.this$0 = nativeShopActivity;
            this.$shopStarStatus = z;
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
            com.alibaba.triver.triver_shop.d dVar = com.alibaba.triver.triver_shop.d.INSTANCE;
            NativeShopActivity nativeShopActivity = this.this$0;
            NativeShopActivity nativeShopActivity2 = nativeShopActivity;
            d b = NativeShopActivity.b(nativeShopActivity);
            if (b == null) {
                q.b("shopDataParser");
                throw null;
            }
            String U = b.U();
            boolean z = this.$shopStarStatus;
            d b2 = NativeShopActivity.b(this.this$0);
            if (b2 != null) {
                dVar.a(nativeShopActivity2, U, z, b2);
            } else {
                q.b("shopDataParser");
                throw null;
            }
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$follow$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeShopActivity nativeShopActivity) {
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
            } else {
                NativeShopActivity.I(this.this$0);
            }
        }
    }
}
