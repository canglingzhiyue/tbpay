package com.alibaba.triver.triver_shop.container.shopLoft;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.e;
import com.alibaba.triver.triver_shop.container.shopLoft.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import org.android.agoo.common.AgooConstants;
import tb.ceg;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class ShopLoftComponent$requestListData$1 extends Lambda implements rul<JSONObject, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponent$requestListData$1(e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        e.a b;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        e eVar = this.this$0;
        boolean z2 = e.$ipChange;
        e.a(this.this$0, false);
        if (jSONObject == null || jSONObject.isEmpty()) {
            if (z2) {
                e eVar2 = this.this$0;
                if (!e.$ipChange && (b = this.this$0.b()) != null) {
                    b.a(z2);
                }
            }
            ceg.Companion.b("shop loft request no data");
            return;
        }
        e.a(this.this$0, e.$ipChange + 1);
        e eVar3 = this.this$0;
        if (e.$ipChange) {
            JSONObject jSONObject3 = new JSONObject();
            Object obj = jSONObject.get("data");
            if (!(obj instanceof JSONObject)) {
                obj = jSONObject3;
            }
            JSONObject jSONObject4 = new JSONObject();
            Object obj2 = ((JSONObject) obj).get("data");
            if (!(obj2 instanceof JSONObject)) {
                obj2 = jSONObject4;
            }
            jSONObject2 = (JSONObject) obj2;
        } else {
            JSONObject jSONObject5 = new JSONObject();
            Object obj3 = jSONObject.get("data");
            if (!(obj3 instanceof JSONObject)) {
                obj3 = jSONObject5;
            }
            jSONObject2 = (JSONObject) obj3;
        }
        e.b(this.this$0, q.a((Object) "true", (Object) jSONObject2.getString("hasNext")));
        JSONArray jSONArray = new JSONArray();
        Object obj4 = jSONObject2.get("list");
        if (obj4 instanceof JSONArray) {
            jSONArray = obj4;
        }
        JSONArray jSONArray2 = jSONArray;
        e eVar4 = this.this$0;
        JSONObject jSONObject6 = jSONObject2.getJSONObject("commonData");
        e.a(eVar4, jSONObject6 == null ? null : jSONObject6.getString("pvUuid"));
        e eVar5 = this.this$0;
        JSONObject jSONObject7 = jSONObject2.getJSONObject("commonData");
        eVar5.a(jSONObject7 == null ? null : jSONObject7.getJSONObject("shareParams"));
        JSONObject jSONObject8 = jSONObject2.getJSONObject("commonData");
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        if (jSONArray2.isEmpty()) {
            e eVar6 = this.this$0;
            if (!e.$ipChange) {
                e.a b2 = this.this$0.b();
                if (b2 != null) {
                    b2.a(z2);
                }
                ceg.Companion.b("shop loft request list is empty");
                return;
            }
        }
        Iterator<Object> it = jSONArray2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                ((Map) next).put("commonData", jSONObject8);
                JSONObject jSONObject9 = (JSONObject) next;
                e eVar7 = this.this$0;
                jSONObject9.put("entryUtParam", (Object) e.$ipChange);
                e eVar8 = this.this$0;
                jSONObject9.put("clickid", (Object) e.$ipChange);
                e eVar9 = this.this$0;
                String str = e.$ipChange;
                if (str != null) {
                    jSONObject9.put("pvUuid", (Object) str);
                }
                if (i == 0) {
                    e eVar10 = this.this$0;
                    if (!e.$ipChange) {
                        e eVar11 = this.this$0;
                        JSONObject jSONObject10 = e.$ipChange;
                        if (jSONObject10 != null) {
                            jSONObject9.putAll(jSONObject10);
                        }
                        e.c(this.this$0, true);
                    }
                }
                e eVar12 = this.this$0;
                if (e.$ipChange) {
                    String string = jSONObject9.getString("id");
                    e eVar13 = this.this$0;
                    JSONObject jSONObject11 = e.$ipChange;
                    if (q.a((Object) string, (Object) (jSONObject11 == null ? null : jSONObject11.getString("id")))) {
                        i++;
                        e eVar14 = this.this$0;
                        JSONObject jSONObject12 = e.$ipChange;
                        if (jSONObject12 != null) {
                            jSONObject12.put("spmParams", jSONObject9.get("spmParams"));
                        }
                        e eVar15 = this.this$0;
                        JSONObject jSONObject13 = e.$ipChange;
                        if (jSONObject13 != null) {
                            jSONObject13.put("transitionCard", jSONObject9.get("transitionCard"));
                        }
                        z = true;
                    }
                }
                e eVar16 = this.this$0;
                jSONObject9.put("source", (Object) e.$ipChange);
                arrayList.add(next);
            }
            i++;
        }
        if (z) {
            f.a a2 = e.n(this.this$0).a();
            JSONObject c = a2 == null ? null : a2.c();
            e eVar17 = this.this$0;
            if (c == e.$ipChange) {
                ceg.Companion.b("needRefreshFirstPageTransitionCard");
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass3(a2));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        e.a b3 = this.this$0.b();
        if (b3 != null) {
            b3.a(arrayList);
        }
        JSONObject jSONObject14 = arrayList.get(arrayList.size() - 1);
        q.b(jSONObject14, "newData[newData.size - 1]");
        JSONObject jSONObject15 = jSONObject14;
        String string2 = jSONObject15.getString("sceneId");
        boolean a3 = q.a((Object) AgooConstants.ACK_FLAG_NULL, (Object) jSONObject15.getString("contentType"));
        if (ShopLoftViewManager.isMarketType(string2) && a3) {
            ShopLoftComponentView o = e.o(this.this$0);
            if (o == null) {
                q.b("componentView");
                throw null;
            }
            o.setLastItemIsLiveCard(true);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass4(this.this$0, arrayList));
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f.a $currentHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(f.a aVar) {
            super(0);
            this.$currentHolder = aVar;
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
            f.a aVar = this.$currentHolder;
            if (aVar == null) {
                return;
            }
            aVar.e();
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ArrayList<JSONObject> $newData;
        public final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(e eVar, ArrayList<JSONObject> arrayList) {
            super(0);
            this.this$0 = eVar;
            this.$newData = arrayList;
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
            List<JSONObject> b = e.n(this.this$0).b();
            int size = b == null ? 0 : b.size();
            if (size - 1 < 0) {
                size = 0;
            }
            List<JSONObject> b2 = e.n(this.this$0).b();
            if (b2 != null) {
                b2.addAll(this.$newData);
            }
            e.n(this.this$0).notifyItemInserted(size);
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new AnonymousClass1(this.this$0));
        }

        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent$requestListData$1$4$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements ruk<t> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ e this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(e eVar) {
                super(0);
                this.this$0 = eVar;
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
                ShopLoftComponentView o = e.o(this.this$0);
                if (o != null) {
                    o.onLoadNewData();
                } else {
                    q.b("componentView");
                    throw null;
                }
            }
        }
    }
}
