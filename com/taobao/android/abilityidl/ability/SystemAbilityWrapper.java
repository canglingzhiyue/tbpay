package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.cq;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class SystemAbilityWrapper extends AbsAbilityWrapper<AbsSystemAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1585465746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemAbilityWrapper(AbsSystemAbility impl) {
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
            case -1582326245:
                if (api.equals("isVoiceOverOn")) {
                    com.alibaba.ability.result.g<Boolean, ErrorResult> isVoiceOverOn = getAbilityImpl().isVoiceOverOn(context);
                    ErrorResult b = isVoiceOverOn.b();
                    if (b != null) {
                        return b;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isVoiceOverOn.a()))), null, 2, null);
                }
                break;
            case -821636766:
                if (api.equals("openLocationSettings")) {
                    getAbilityImpl().openLocationSettings(context, new ify(callback));
                    break;
                }
                break;
            case -45886082:
                if (api.equals(com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_OPENBROWSER)) {
                    try {
                        getAbilityImpl().openBrowser(context, new eg(params), new ify(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case 20734173:
                if (api.equals("checkLocation")) {
                    com.alibaba.ability.result.g<String, ErrorResult> checkLocation = getAbilityImpl().checkLocation(context);
                    ErrorResult b2 = checkLocation.b();
                    if (b2 != null) {
                        return b2;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", checkLocation.a()))), null, 2, null);
                }
                break;
            case 193924596:
                if (api.equals("checkAppInstallStatus")) {
                    try {
                        com.alibaba.ability.result.g<String, ErrorResult> checkAppInstallStatus = getAbilityImpl().checkAppInstallStatus(context, new ef(params));
                        ErrorResult b3 = checkAppInstallStatus.b();
                        if (b3 != null) {
                            return b3;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", checkAppInstallStatus.a()))), null, 2, null);
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 339335005:
                if (api.equals("requestNotificationSettings")) {
                    getAbilityImpl().requestNotificationSettings(context, new a(callback));
                    break;
                }
                break;
            case 347240634:
                if (api.equals("openAppSettings")) {
                    getAbilityImpl().openAppSettings(context, new ify(callback));
                    break;
                }
                break;
            case 354860483:
                if (api.equals("isNFCReadingSupported")) {
                    com.alibaba.ability.result.g<Boolean, ErrorResult> isNFCReadingSupported = getAbilityImpl().isNFCReadingSupported(context);
                    ErrorResult b4 = isNFCReadingSupported.b();
                    if (b4 != null) {
                        return b4;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isNFCReadingSupported.a()))), null, 2, null);
                }
                break;
            case 457367448:
                if (api.equals("openNotificationSettings")) {
                    getAbilityImpl().openNotificationSettings(context, new ify(callback));
                    break;
                }
                break;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class a implements cq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f8739a;

        public a(aln alnVar) {
            this.f8739a = alnVar;
        }

        @Override // com.taobao.android.abilityidl.ability.cq
        public void a(SystemNotificationStatusResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38e8e774", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            Object json = JSONObject.toJSON(result);
            if (!(json instanceof JSONObject)) {
                json = null;
            }
            this.f8739a.a(new FinishResult((JSONObject) json, "onResult"));
        }

        @Override // tb.gml
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            cq.a.a(this, result);
            this.f8739a.a(result);
        }
    }
}
