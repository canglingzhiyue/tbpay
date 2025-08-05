package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.avplayer.TBPlayerConst;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.rrv;
import tb.ruk;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        super(0);
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
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = j.a(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, "shopHomepageCard");
        pairArr[1] = j.a("pageSize", "10");
        pairArr[2] = j.a(rrv.PAGE_NUMBER, "1");
        pairArr[3] = j.a("sellerId", this.$shopData.U());
        JSONObject aS = this.$shopData.aS();
        String str = null;
        if (aS != null && (jSONObject = aS.getJSONObject("bizParams")) != null) {
            str = jSONObject.toString();
        }
        pairArr[4] = j.a("bizParams", str);
        a.a(this.$shopData.am(), "mtop.taobao.minishop.material.feeds.list", "1.0", ai.b(pairArr), new AnonymousClass1(this.$shopData), AnonymousClass2.INSTANCE, false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
    }

    /* renamed from: com.alibaba.triver.triver_shop.ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements ruw<Integer, String, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
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
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("request2022FrameworkSwipeBigCardListData failed : " + i + ' ' + ((Object) str));
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements rul<JSONObject, t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            super(1);
            this.$shopData = dVar;
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
                return;
            }
            String str = null;
            this.$shopData.a(jSONObject == null ? null : jSONObject.getJSONObject("data"));
            ceg.a aVar = ceg.Companion;
            if (jSONObject != null) {
                str = jSONObject.toString();
            }
            aVar.b(q.a("request2022FrameworkSwipeBigCardListData success : ", (Object) str));
        }
    }
}
