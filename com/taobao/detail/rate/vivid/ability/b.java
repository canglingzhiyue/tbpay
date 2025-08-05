package com.taobao.detail.rate.vivid.ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\r"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/DxPostEventAbility;", "Lcom/taobao/android/abilitykit/AKBaseAbility;", "Lcom/taobao/android/dinamicx/eventchain/DXUIAbilityRuntimeContext;", "()V", "onExecuteWithData", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "abilityData", "Lcom/taobao/android/abilitykit/AKBaseAbilityData;", "runtimeContext", "p2", "Lcom/taobao/android/abilitykit/AKIAbilityCallback;", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class b extends dlg<com.taobao.android.dinamicx.eventchain.l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0655b Companion = new C0655b(null);

    /* renamed from: a  reason: collision with root package name */
    private static final long f17040a = 3396478488960647823L;
    private static final int b = -10009;

    public static final /* synthetic */ long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : f17040a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/DxPostEventAbility$Companion;", "", "()V", "ABILITY_ERROR_DX_POST", "", "DXPOSTEVENT", "", "getDXPOSTEVENT", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.detail.rate.vivid.ability.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0655b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0655b() {
        }

        public /* synthetic */ C0655b(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : b.d();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, com.taobao.android.dinamicx.eventchain.l lVar, dll dllVar) {
        DXWidgetNode j;
        DXWidgetNode j2;
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXWidgetNode dXWidgetNode = null;
        Object f = dlhVar != null ? dlhVar.f("eventId") : null;
        if (!(f instanceof String)) {
            f = null;
        }
        String str = (String) f;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return new dkw(new dkv(b, "error info = eventId is null"), true);
        }
        Object f2 = dlhVar != null ? dlhVar.f(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID) : null;
        if (!(f2 instanceof String)) {
            f2 = null;
        }
        String str3 = (String) f2;
        DXEvent dXEvent = new DXEvent(Long.parseLong(str));
        if (lVar != null && (j2 = lVar.j()) != null && (queryRootWidgetNode = j2.queryRootWidgetNode()) != null) {
            dXWidgetNode = queryRootWidgetNode.queryWidgetNodeByUserId(str3);
        }
        if (dXWidgetNode != null) {
            dXWidgetNode.postEvent(dXEvent);
        } else if (lVar != null && (j = lVar.j()) != null) {
            j.postEvent(dXEvent);
        }
        return new dla();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/ability/DxPostEventAbility$Builder;", "Lcom/taobao/android/abilitykit/AKIBuilderAbility;", "", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/detail/rate/vivid/ability/DxPostEventAbility;", "p0", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements dln<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public b a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("22fd1f99", new Object[]{this, obj}) : new b();
        }
    }
}
