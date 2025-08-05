package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cn;
import com.taobao.android.abilityidl.ability.co;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class ScreenAbilityWrapper extends AbsAbilityWrapper<AbsScreenAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1926141681);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenAbilityWrapper(AbsScreenAbility impl) {
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
            case -2079769446:
                if (api.equals("getOrientation")) {
                    com.alibaba.ability.result.g<String, ErrorResult> orientation = getAbilityImpl().getOrientation(context);
                    ErrorResult b2 = orientation.b();
                    if (b2 != null) {
                        return b2;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", orientation.a()))), null, 2, null);
                }
                break;
            case -2003857565:
                if (api.equals("setCaptureEnabledForAndroid")) {
                    try {
                        getAbilityImpl().setCaptureEnabledForAndroid(context, new dz(params), new ify(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -1135253436:
                if (api.equals("keepOn")) {
                    try {
                        getAbilityImpl().keepOn(context, new ea(params), new ify(callback));
                        break;
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case -449556206:
                if (api.equals(WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT)) {
                    com.alibaba.ability.result.g<Integer, ErrorResult> statusBarHeight = getAbilityImpl().getStatusBarHeight(context);
                    ErrorResult b3 = statusBarHeight.b();
                    if (b3 != null) {
                        return b3;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", statusBarHeight.a()))), null, 2, null);
                }
                break;
            case -297880232:
                if (api.equals("setCaptureListener")) {
                    getAbilityImpl().setCaptureListener(context, new b(callback));
                    break;
                }
                break;
            case -277154275:
                if (api.equals("setCaptureEnabled")) {
                    try {
                        getAbilityImpl().setCaptureEnabled(context, new dz(params), new ify(callback));
                        break;
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case -75444956:
                if (api.equals("getInfo")) {
                    com.alibaba.ability.result.g<ScreenInfoResult, ErrorResult> info = getAbilityImpl().getInfo(context);
                    ErrorResult b4 = info.b();
                    if (b4 != null) {
                        return b4;
                    }
                    Object json = JSONObject.toJSON(info.a());
                    if (!(json instanceof JSONObject)) {
                        json = null;
                    }
                    return new FinishResult((JSONObject) json, null, 2, null);
                }
                break;
            case 350413895:
                if (api.equals("getBrightness")) {
                    com.alibaba.ability.result.g<Integer, ErrorResult> brightness = getAbilityImpl().getBrightness(context);
                    ErrorResult b5 = brightness.b();
                    if (b5 != null) {
                        return b5;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", brightness.a()))), null, 2, null);
                }
                break;
            case 443461646:
                if (api.equals("setOrientation")) {
                    try {
                        getAbilityImpl().setOrientation(context, new eb(params), new ify(callback));
                        break;
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
            case 711700401:
                if (api.equals("unsetCaptureListener")) {
                    getAbilityImpl().unsetCaptureListener(context, new ify(callback));
                    break;
                }
                break;
            case 1124545107:
                if (api.equals("setBrightness")) {
                    try {
                        getAbilityImpl().setBrightness(context, new ScreenSetBrightnessParams(params), new ify(callback));
                        break;
                    } catch (Throwable th5) {
                        return a$a.Companion.b(th5.getMessage());
                    }
                }
                break;
            case 1912362048:
                if (api.equals("requestBrightness")) {
                    getAbilityImpl().requestBrightness(context, new a(callback));
                    break;
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements cn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8731a;

        public a(aln alnVar) {
            this.f8731a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cn
        public void a(ScreenSetBrightnessParams result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("104e7f06", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8731a.a(new FinishResult((JSONObject) json, "onData"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cn.a.a(this, result);
            this.f8731a.a(result);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements co {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8732a;

        public b(aln alnVar) {
            this.f8732a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.co
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f8732a.a(new FinishResult(null, "onCapture"));
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
            co.a.a(this, result);
            this.f8732a.a(result);
        }
    }
}
