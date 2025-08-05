package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cb;
import com.taobao.android.abilityidl.ability.cc;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class NavBarAbilityWrapper extends AbsAbilityWrapper<AbsNavBarAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1474811283);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarAbilityWrapper(AbsNavBarAbility impl) {
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
            case -1821121633:
                if (!api.equals("hideStatusBar")) {
                    return null;
                }
                getAbilityImpl().hideStatusBar(context, new ify(callback));
                return null;
            case -1617961863:
                if (!api.equals("setImmersive")) {
                    return null;
                }
                try {
                    getAbilityImpl().setImmersive(context, new dg(params), new ify(callback));
                    return null;
                } catch (Throwable th) {
                    return a$a.Companion.b(th.getMessage());
                }
            case -1526161572:
                if (!api.equals("setBgColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setBgColor(context, new df(params), new ify(callback));
                    return null;
                } catch (Throwable th2) {
                    return a$a.Companion.b(th2.getMessage());
                }
            case -1322984979:
                if (!api.equals("setTitleColor")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitleColor(context, new df(params), new ify(callback));
                    return null;
                } catch (Throwable th3) {
                    return a$a.Companion.b(th3.getMessage());
                }
            case -1320333267:
                if (!api.equals("hideRightItem")) {
                    return null;
                }
                getAbilityImpl().hideRightItem(context, new ify(callback));
                return null;
            case -1317514267:
                if (!api.equals("setTitleImage")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitleImage(context, new dl(params), new ify(callback));
                    return null;
                } catch (Throwable th4) {
                    return a$a.Companion.b(th4.getMessage());
                }
            case -794464810:
                if (!api.equals("showBackButton")) {
                    return null;
                }
                getAbilityImpl().showBackButton(context, new ify(callback));
                return null;
            case -30051059:
                if (!api.equals("setRightItem")) {
                    return null;
                }
                try {
                    getAbilityImpl().setRightItem(context, new dh(params), new b(callback));
                    return null;
                } catch (Throwable th5) {
                    return a$a.Companion.b(th5.getMessage());
                }
            case 3202370:
                if (!api.equals("hide")) {
                    return null;
                }
                try {
                    getAbilityImpl().hide(context, new dm(params), new ify(callback));
                    return null;
                } catch (Throwable th6) {
                    return a$a.Companion.b(th6.getMessage());
                }
            case 3529469:
                if (!api.equals("show")) {
                    return null;
                }
                try {
                    getAbilityImpl().show(context, new dm(params), new ify(callback));
                    return null;
                } catch (Throwable th7) {
                    return a$a.Companion.b(th7.getMessage());
                }
            case 1038753243:
                if (!api.equals("hideBackButton")) {
                    return null;
                }
                getAbilityImpl().hideBackButton(context, new ify(callback));
                return null;
            case 1405040263:
                if (!api.equals("setTheme")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTheme(context, new dj(params), new ify(callback));
                    return null;
                } catch (Throwable th8) {
                    return a$a.Companion.b(th8.getMessage());
                }
            case 1405084438:
                if (!api.equals("setTitle")) {
                    return null;
                }
                try {
                    getAbilityImpl().setTitle(context, new dk(params), new ify(callback));
                    return null;
                } catch (Throwable th9) {
                    return a$a.Companion.b(th9.getMessage());
                }
            case 1484510783:
                if (!api.equals("setShareConfig")) {
                    return null;
                }
                try {
                    getAbilityImpl().setShareConfig(context, new di(params), new a(callback));
                    return null;
                } catch (Throwable th10) {
                    return a$a.Companion.b(th10.getMessage());
                }
            case 1583425604:
                if (!api.equals(DxContainerActivity.PARAMS_SHOW_STATUS_BAR)) {
                    return null;
                }
                getAbilityImpl().showStatusBar(context, new ify(callback));
                return null;
            default:
                return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements cc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8701a;

        public a(aln alnVar) {
            this.f8701a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cc
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f8701a.a(new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", Boolean.valueOf(z)))), "onResult"));
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
            cc.a.a(this, result);
            this.f8701a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements cb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8702a;

        public b(aln alnVar) {
            this.f8702a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8702a.a(new FinishResult(null, "onClick"));
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
            cb.a.a(this, result);
            this.f8702a.a(result);
        }
    }
}
