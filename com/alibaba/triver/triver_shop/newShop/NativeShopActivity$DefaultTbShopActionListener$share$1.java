package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cen;
import tb.rul;

/* loaded from: classes3.dex */
public final class NativeShopActivity$DefaultTbShopActionListener$share$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ App $homePageApp;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$DefaultTbShopActionListener$share$1(NativeShopActivity nativeShopActivity, App app) {
        super(1);
        this.this$0 = nativeShopActivity;
        this.$homePageApp = app;
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
        if (cen.Companion.W()) {
            d dVar = d.INSTANCE;
            NativeShopActivity nativeShopActivity = this.this$0;
            NativeShopActivity nativeShopActivity2 = nativeShopActivity;
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(nativeShopActivity);
            if (b != null) {
                dVar.a(nativeShopActivity2, b.U(), new AnonymousClass1(this.this$0, a2, this.$homePageApp));
                return;
            } else {
                q.b("shopDataParser");
                throw null;
            }
        }
        com.alibaba.triver.triver_shop.newShop.data.d b2 = NativeShopActivity.b(this.this$0);
        if (b2 == null) {
            q.b("shopDataParser");
            throw null;
        }
        NativeShopActivity nativeShopActivity3 = this.this$0;
        d.INSTANCE.a(this.this$0, b2, NativeShopActivity.$ipChange, this.this$0.a(), null, Boolean.valueOf(a2), this.$homePageApp);
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$DefaultTbShopActionListener$share$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements rul<JSONObject, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ App $homePageApp;
        public final /* synthetic */ boolean $shopStarStatus;
        public final /* synthetic */ NativeShopActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeShopActivity nativeShopActivity, boolean z, App app) {
            super(1);
            this.this$0 = nativeShopActivity;
            this.$shopStarStatus = z;
            this.$homePageApp = app;
        }

        @Override // tb.rul
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return t.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject jSONObject) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
                return;
            }
            Boolean bool = null;
            if (jSONObject == null) {
                string = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                Object obj = jSONObject.get("data");
                if (obj instanceof JSONObject) {
                    jSONObject2 = obj;
                }
                string = jSONObject2.getString("value");
            }
            boolean a2 = q.a((Object) "true", (Object) string);
            com.alibaba.triver.triver_shop.newShop.data.d b = NativeShopActivity.b(this.this$0);
            if (b == null) {
                q.b("shopDataParser");
                throw null;
            }
            NativeShopActivity nativeShopActivity = this.this$0;
            String str = NativeShopActivity.$ipChange;
            String a3 = this.this$0.a();
            if (jSONObject != null) {
                bool = Boolean.valueOf(a2);
            }
            d.INSTANCE.a(this.this$0, b, str, a3, bool, Boolean.valueOf(this.$shopStarStatus), this.$homePageApp);
        }
    }
}
