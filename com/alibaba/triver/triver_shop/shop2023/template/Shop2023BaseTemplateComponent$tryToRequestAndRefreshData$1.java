package com.alibaba.triver.triver_shop.shop2023.template;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject $it;
        public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.template.a this$0;

        /* renamed from: com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$a */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.template.a f4131a;
            public final /* synthetic */ JSONObject b;

            public a(com.alibaba.triver.triver_shop.shop2023.template.a aVar, JSONObject jSONObject) {
                this.f4131a = aVar;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.alibaba.triver.triver_shop.shop2023.template.a aVar = this.f4131a;
                JSONObject jSONObject = this.b;
                aVar.a("asyncData", jSONObject == null ? null : jSONObject.getJSONObject("data"));
                com.alibaba.triver.triver_shop.newShop.ext.b.d(new Shop2023BaseTemplateComponent$tryToRequestAndRefreshData$1$1$action$1$1(this.f4131a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.alibaba.triver.triver_shop.shop2023.template.a aVar, JSONObject jSONObject) {
            super(0);
            this.this$0 = aVar;
            this.$it = jSONObject;
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
            a aVar = new a(this.this$0, this.$it);
            if (!this.this$0.h()) {
                this.this$0.a(aVar);
            } else {
                aVar.run();
            }
        }
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, jSONObject));
        }
    }
}
