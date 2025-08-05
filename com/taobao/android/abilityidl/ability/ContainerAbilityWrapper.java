package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bj;
import com.taobao.android.abilityidl.ability.bk;
import com.taobao.android.abilityidl.ability.bl;
import com.taobao.android.abilityidl.ability.bm;
import com.taobao.android.abilityidl.ability.bn;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class ContainerAbilityWrapper extends AbsAbilityWrapper<AbsContainerAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1399404336);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerAbilityWrapper(AbsContainerAbility impl) {
        super(impl);
        kotlin.jvm.internal.q.d(impl, "impl");
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        switch (api.hashCode()) {
            case -2119262196:
                if (!api.equals("slideTo")) {
                    return null;
                }
                try {
                    getAbilityImpl().slideTo(context, new ae(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -1896221285:
                if (!api.equals("removePageResizeListener")) {
                    return null;
                }
                getAbilityImpl().removePageResizeListener(context, new ify(callback));
                return null;
            case -1707869230:
                if (!api.equals("registerPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().registerPage(context, new y(params), new ify(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case -1568433273:
                if (!api.equals("hideSwiperHeader")) {
                    return null;
                }
                getAbilityImpl().hideSwiperHeader(context, new ify(callback));
                return null;
            case -1238336753:
                if (!api.equals("disableInterceptPageClose")) {
                    return null;
                }
                getAbilityImpl().disableInterceptPageClose(context, new ify(callback));
                return null;
            case -844402364:
                if (!api.equals("removeSwiperSwitchListener")) {
                    return null;
                }
                getAbilityImpl().removeSwiperSwitchListener(context, new ify(callback));
                return null;
            case -746243005:
                if (!api.equals("setTabBarBadge")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarBadge(context, new aj(params), new ify(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case -604604703:
                if (!api.equals("removeTabBarBadge")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeTabBarBadge(context, new ai(params), new ify(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            case -358441180:
                if (!api.equals("removeTabItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeTabItem(context, new aa(params), new ify(callback));
                    return null;
                } catch (Throwable th5) {
                    return a$a.Companion.b(th5.getMessage());
                }
            case -311904710:
                if (!api.equals("showErrorPage")) {
                    return null;
                }
                getAbilityImpl().showErrorPage(context, new ify(callback));
                return null;
            case -160055071:
                if (!api.equals("addSwiperSwitchListener")) {
                    return null;
                }
                getAbilityImpl().addSwiperSwitchListener(context, new e(callback));
                return null;
            case -76116900:
                if (!api.equals("addTabSwitchListener")) {
                    return null;
                }
                getAbilityImpl().addTabSwitchListener(context, new c(callback));
                return null;
            case 39684216:
                if (!api.equals("addPageResizeListener")) {
                    return null;
                }
                getAbilityImpl().addPageResizeListener(context, new a(callback));
                return null;
            case 149252304:
                if (!api.equals("reportSubPagePreRenderStatus")) {
                    return null;
                }
                try {
                    getAbilityImpl().reportSubPagePreRenderStatus(context, new af(params), new ify(callback));
                    return null;
                } catch (Throwable th6) {
                    return a$a.Companion.b(th6.getMessage());
                }
            case 253249139:
                if (!api.equals("setTabBarItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarItem(context, new ac(params), new ify(callback));
                    return null;
                } catch (Throwable th7) {
                    return a$a.Companion.b(th7.getMessage());
                }
            case 253363459:
                if (!api.equals("setTabBarMode")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTabBarMode(context, new ak(params), new ify(callback));
                    return null;
                } catch (Throwable th8) {
                    return a$a.Companion.b(th8.getMessage());
                }
            case 354301031:
                if (!api.equals("addTabItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().addTabItem(context, new t(params), new ify(callback));
                    return null;
                } catch (Throwable th9) {
                    return a$a.Companion.b(th9.getMessage());
                }
            case 443461646:
                if (!api.equals("setOrientation")) {
                    return null;
                }
                try {
                    getAbilityImpl().setOrientation(context, new er(params), new ify(callback));
                    return null;
                } catch (Throwable th10) {
                    return a$a.Companion.b(th10.getMessage());
                }
            case 483875628:
                if (!api.equals("addSwiperItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().addSwiperItem(context, new s(params), new ify(callback));
                    return null;
                } catch (Throwable th11) {
                    return a$a.Companion.b(th11.getMessage());
                }
            case 511694541:
                if (!api.equals("setPageBgColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setPageBgColor(context, new u(params), new ify(callback));
                    return null;
                } catch (Throwable th12) {
                    return a$a.Companion.b(th12.getMessage());
                }
            case 578515349:
                if (!api.equals("hideErrorPage")) {
                    return null;
                }
                getAbilityImpl().hideErrorPage(context, new ify(callback));
                return null;
            case 832406984:
                if (!api.equals("interceptTabBarClick")) {
                    return null;
                }
                getAbilityImpl().interceptTabBarClick(context, new d(callback));
                return null;
            case 912607987:
                if (!api.equals("hideTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().hideTab(context, new ah(params), new ify(callback));
                    return null;
                } catch (Throwable th13) {
                    return a$a.Companion.b(th13.getMessage());
                }
            case 1290438151:
                if (!api.equals("interceptPageClose")) {
                    return null;
                }
                getAbilityImpl().interceptPageClose(context, new b(callback));
                return null;
            case 1345414647:
                if (!api.equals("swizzleTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().swizzleTab(context, new ag(params), new ify(callback));
                    return null;
                } catch (Throwable th14) {
                    return a$a.Companion.b(th14.getMessage());
                }
            case 1488915869:
                if (!api.equals("setSwiperEnable")) {
                    return null;
                }
                try {
                    getAbilityImpl().setSwiperEnable(context, new ab(params), new ify(callback));
                    return null;
                } catch (Throwable th15) {
                    return a$a.Companion.b(th15.getMessage());
                }
            case 1498979151:
                if (!api.equals("removeSwiperItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().removeSwiperItem(context, new z(params), new ify(callback));
                    return null;
                } catch (Throwable th16) {
                    return a$a.Companion.b(th16.getMessage());
                }
            case 1524002521:
                if (!api.equals("removeTabSwitchListener")) {
                    return null;
                }
                getAbilityImpl().removeTabSwitchListener(context, new ify(callback));
                return null;
            case 1529287830:
                if (!api.equals("preRenderSubPage")) {
                    return null;
                }
                try {
                    getAbilityImpl().preRenderSubPage(context, new w(params), new ify(callback));
                    return null;
                } catch (Throwable th17) {
                    return a$a.Companion.b(th17.getMessage());
                }
            case 1651364801:
                if (!api.equals("switchTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().switchTab(context, new al(params), new ify(callback));
                    return null;
                } catch (Throwable th18) {
                    return a$a.Companion.b(th18.getMessage());
                }
            case 1940576450:
                if (!api.equals("showSwiperHeader")) {
                    return null;
                }
                try {
                    getAbilityImpl().showSwiperHeader(context, new ad(params), new ify(callback));
                    return null;
                } catch (Throwable th19) {
                    return a$a.Companion.b(th19.getMessage());
                }
            case 2067279704:
                if (!api.equals("showTab")) {
                    return null;
                }
                try {
                    getAbilityImpl().showTab(context, new ah(params), new ify(callback));
                    return null;
                } catch (Throwable th20) {
                    return a$a.Companion.b(th20.getMessage());
                }
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements bk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8640a;

        public a(aln alnVar) {
            this.f8640a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bk
        public void a(ContainerWindowSize result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b413a361", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8640a.a(new FinishResult((JSONObject) json, "onResize"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bk.a.a(this, result);
            this.f8640a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements bj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8641a;

        public b(aln alnVar) {
            this.f8641a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bj
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8641a.a(new FinishResult(null, "onClose"));
            }
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bj.a.a(this, result);
            this.f8641a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements bn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8642a;

        public c(aln alnVar) {
            this.f8642a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bn
        public void a(ContainerTabSwitchDetail result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b48bba4", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8642a.a(new FinishResult((JSONObject) json, "onSwitch"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bn.a.a(this, result);
            this.f8642a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements bm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8643a;

        public d(aln alnVar) {
            this.f8643a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bm
        public void a(ContainerTabSwitchDetail result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b48bba4", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8643a.a(new FinishResult((JSONObject) json, "onClick"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bm.a.a(this, result);
            this.f8643a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements bl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8644a;

        public e(aln alnVar) {
            this.f8644a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.bl
        public void a(ContainerSwiperSwitchDetail result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59a9c4b5", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8644a.a(new FinishResult((JSONObject) json, "onSwitch"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            bl.a.a(this, result);
            this.f8644a.a(result);
        }
    }
}
