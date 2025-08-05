package com.alibaba.ability.impl.device;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class DeviceAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2089827524);
    }

    @Deprecated(message = "请使用requestMediaVolume")
    public abstract ExecuteResult a(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult b(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult c(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult d(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult e(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult setMediaVolumeListener(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    public abstract ExecuteResult unsetMediaVolumeListener(als alsVar, Map<String, ? extends Object> map, aln alnVar);

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        ErrorResult a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        try {
            switch (api.hashCode()) {
                case -896332056:
                    if (api.equals("getMediaVolume")) {
                        a2 = a(context, params, callback);
                        break;
                    }
                    a$a.a aVar = a$a.Companion;
                    a2 = aVar.a("api " + api + " not found");
                    break;
                case -715102788:
                    if (api.equals("getScreenType")) {
                        a2 = d(context, params, callback);
                        break;
                    }
                    a$a.a aVar2 = a$a.Companion;
                    a2 = aVar2.a("api " + api + " not found");
                    break;
                case -75444956:
                    if (api.equals("getInfo")) {
                        a2 = c(context, params, callback);
                        break;
                    }
                    a$a.a aVar22 = a$a.Companion;
                    a2 = aVar22.a("api " + api + " not found");
                    break;
                case -75106384:
                    if (api.equals(NetworkAbility.API_GET_TYPE)) {
                        a2 = e(context, params, callback);
                        break;
                    }
                    a$a.a aVar222 = a$a.Companion;
                    a2 = aVar222.a("api " + api + " not found");
                    break;
                case 279420431:
                    if (api.equals("requestMediaVolume")) {
                        a2 = b(context, params, callback);
                        break;
                    }
                    a$a.a aVar2222 = a$a.Companion;
                    a2 = aVar2222.a("api " + api + " not found");
                    break;
                case 1174769456:
                    if (api.equals("setMediaVolumeListener")) {
                        a2 = setMediaVolumeListener(context, params, callback);
                        break;
                    }
                    a$a.a aVar22222 = a$a.Companion;
                    a2 = aVar22222.a("api " + api + " not found");
                    break;
                case 1410053385:
                    if (api.equals("unsetMediaVolumeListener")) {
                        a2 = unsetMediaVolumeListener(context, params, callback);
                        break;
                    }
                    a$a.a aVar222222 = a$a.Companion;
                    a2 = aVar222222.a("api " + api + " not found");
                    break;
                default:
                    a$a.a aVar2222222 = a$a.Companion;
                    a2 = aVar2222222.a("api " + api + " not found");
                    break;
            }
            return a2;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ErrorResult("500", message, (Map) null, 4, (o) null);
        }
    }
}
