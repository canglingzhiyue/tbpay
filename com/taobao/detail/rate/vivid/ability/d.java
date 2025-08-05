package com.taobao.detail.rate.vivid.ability;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.detail.rate.RateFeedsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kjo;
import tb.kqa;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\f\rB\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000e"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility;", "Lcom/taobao/android/abilitykit/AKBaseAbility;", "Lcom/taobao/android/dinamicx/eventchain/DXUIAbilityRuntimeContext;", "()V", "onExecuteWithData", "Lcom/taobao/android/abilitykit/AKAbilityFinishedResult;", "jsonData", "Lcom/taobao/android/abilitykit/AKBaseAbilityData;", "akAbilityRuntimeContext", "akiAbilityCallback", "Lcom/taobao/android/abilitykit/AKIAbilityCallback;", "Builder", "Companion", "SelectListener", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class d extends dlg<com.taobao.android.dinamicx.eventchain.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long SHOWRATESKUPOP = -5031338029650904963L;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$Companion;", "", "()V", "SHOWRATESKUPOP", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$SelectListener;", "", "onSelect", "", "obj", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public interface c {
        void a(Object obj);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$onExecuteWithData$1$1", "Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$SelectListener;", "onSelect", "", "obj", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.detail.rate.vivid.ability.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0656d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dlh f17043a;
        public final /* synthetic */ dll b;
        public final /* synthetic */ com.taobao.android.dinamicx.eventchain.l c;

        public C0656d(dlh dlhVar, com.taobao.android.dinamicx.eventchain.l lVar, dll dllVar) {
            this.f17043a = dlhVar;
            this.c = lVar;
            this.b = dllVar;
        }

        @Override // com.taobao.detail.rate.vivid.ability.d.c
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "selectSku", (String) obj);
            if (obj instanceof JSONObject) {
                String string = ((JSONObject) obj).getString("name");
                jSONObject2.put((JSONObject) "selectSkuName", string != null ? n.a(string, "#", ";", false, 4, (Object) null) : null);
            }
            this.b.callback("onSubmit", new dla(jSONObject));
        }
    }

    @Override // tb.dlg
    public dla a(dlh jsonData, com.taobao.android.dinamicx.eventchain.l akAbilityRuntimeContext, dll akiAbilityCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dla) ipChange.ipc$dispatch("a81bf7d1", new Object[]{this, jsonData, akAbilityRuntimeContext, akiAbilityCallback});
        }
        q.d(jsonData, "jsonData");
        q.d(akAbilityRuntimeContext, "akAbilityRuntimeContext");
        q.d(akiAbilityCallback, "akiAbilityCallback");
        Context a2 = akAbilityRuntimeContext.a();
        if (!(a2 instanceof FragmentActivity)) {
            a2 = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) a2;
        if (fragmentActivity != null) {
            JSONObject a3 = jsonData.a("selectSku");
            JSONArray b2 = jsonData.b("defaultSkuData");
            JSONArray jSONArray = jsonData.a("skuFilterData").getJSONArray("skuInfo");
            JSONObject a4 = jsonData.a("itemInfo");
            RateFeedsFragment a5 = kqa.INSTANCE.a(fragmentActivity, akAbilityRuntimeContext.e());
            if (a5 == null) {
                return null;
            }
            new kjo().a(a5, jSONArray, a3, b2, a4, new C0656d(jsonData, akAbilityRuntimeContext, akiAbilityCallback));
        }
        return new dla();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$Builder;", "Lcom/taobao/android/abilitykit/AKIBuilderAbility;", "", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility;", "p0", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements dln<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public d a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("22fd1fd7", new Object[]{this, obj}) : new d();
        }
    }
}
