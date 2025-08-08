package com.tmall.android.dai.internal.config;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.model.DAIModelTriggerType;
import com.tmall.android.dai.model.h;
import com.tmall.android.dai.model.i;
import tb.kge;
import tb.rkt;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1360491826);
    }

    private static com.tmall.android.dai.model.c b(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("421219c6", new Object[]{modelTrigger});
        }
        com.tmall.android.dai.model.d dVar = new com.tmall.android.dai.model.d(modelTrigger.dataCep);
        com.tmall.android.dai.model.c cVar = new com.tmall.android.dai.model.c();
        cVar.a(DAIModelTriggerType.CEP);
        cVar.a(dVar);
        cVar.a(modelTrigger.triId);
        return cVar;
    }

    private static com.tmall.android.dai.model.c c(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("11d24d65", new Object[]{modelTrigger});
        }
        com.tmall.android.dai.model.f fVar = new com.tmall.android.dai.model.f(modelTrigger.dataCep);
        com.tmall.android.dai.model.c cVar = new com.tmall.android.dai.model.c();
        cVar.a(DAIModelTriggerType.Stream);
        cVar.a(fVar);
        cVar.a(modelTrigger.triId);
        return cVar;
    }

    private static com.tmall.android.dai.model.c d(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("e1928104", new Object[]{modelTrigger});
        }
        rkt rktVar = new rkt(modelTrigger.data);
        com.tmall.android.dai.model.c cVar = new com.tmall.android.dai.model.c();
        cVar.a(DAIModelTriggerType.Timing);
        cVar.a(rktVar);
        return cVar;
    }

    private static com.tmall.android.dai.model.c e(Config.ModelTrigger modelTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("b152b4a3", new Object[]{modelTrigger});
        }
        h hVar = new h(modelTrigger.data);
        int i = hVar.f23723a;
        if (i <= 0 && i != -19999) {
            com.taobao.mrt.utils.a.c("TriggerConvert", "Event Id is null or invalid.");
            return null;
        }
        com.tmall.android.dai.model.c cVar = new com.tmall.android.dai.model.c();
        cVar.a(DAIModelTriggerType.Ut);
        cVar.a(hVar);
        return cVar;
    }

    private static com.tmall.android.dai.model.c a(Config.ModelTrigger modelTrigger, Config.ModelTriggerMatchRuleForUT modelTriggerMatchRuleForUT, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("42bb7b97", new Object[]{modelTrigger, modelTriggerMatchRuleForUT, str});
        }
        int i = modelTriggerMatchRuleForUT.eventId;
        if (i <= 0 && i != -19999) {
            com.taobao.mrt.utils.a.c("TriggerConvert", "Event Id is null or invalid.");
            return null;
        }
        com.tmall.android.dai.model.c cVar = new com.tmall.android.dai.model.c();
        cVar.a(DAIModelTriggerType.Ut);
        i iVar = new i(modelTriggerMatchRuleForUT);
        iVar.a(str);
        iVar.c = modelTriggerMatchRuleForUT.batch;
        iVar.b = modelTriggerMatchRuleForUT.ownerId;
        cVar.a(iVar);
        return cVar;
    }

    public static com.tmall.android.dai.model.c a(Config.ModelTrigger modelTrigger) {
        com.tmall.android.dai.model.c e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.c) ipChange.ipc$dispatch("7251e627", new Object[]{modelTrigger});
        }
        if (StringUtils.equals(BHRTaskConfigBase.TYPE_CONFIG_UT, modelTrigger.type)) {
            if (modelTrigger.dataExtend != null) {
                com.tmall.android.dai.model.c a2 = a(modelTrigger, modelTrigger.dataExtend, modelTrigger.triId);
                if (a2 == null) {
                    return null;
                }
                if (modelTrigger.triId != null) {
                    a2.a(modelTrigger.triId);
                }
                return a2;
            } else if (modelTrigger.data == null || modelTrigger.data.isEmpty() || (e = e(modelTrigger)) == null) {
                return null;
            } else {
                if (modelTrigger.triId != null) {
                    e.a(modelTrigger.triId);
                }
                return e;
            }
        } else if (StringUtils.equals("timing", modelTrigger.type)) {
            com.tmall.android.dai.model.c d = d(modelTrigger);
            if (modelTrigger.triId != null) {
                d.a(modelTrigger.triId);
            }
            return d;
        } else if (StringUtils.equals("cep", modelTrigger.type)) {
            return b(modelTrigger);
        } else {
            if (!StringUtils.equals("stream", modelTrigger.type)) {
                return null;
            }
            return c(modelTrigger);
        }
    }
}
