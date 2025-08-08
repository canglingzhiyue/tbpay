package com.alibaba.security.ccrc.service.build;

import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.wukong.model.AlgoResultSample;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1252u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3330a = "AlgoDispatcher";
    public final Ta b;
    public final N c = new N();

    public C1252u(Ta ta) {
        this.b = ta;
    }

    public void a(U u, CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd442c9", new Object[]{this, u, cCRCRiskSample, config, new Boolean(z)});
            return;
        }
        if (cCRCRiskSample instanceof AlgoResultSample) {
            AlgoResultSample algoResultSample = (AlgoResultSample) cCRCRiskSample;
            if (algoResultSample.isTriggerHeart()) {
                this.b.a(algoResultSample.getCode());
            }
            if (algoResultSample.isInferDirect()) {
                a(config.getPid(), this.b.b(algoResultSample.getCode()), algoResultSample.getInferResult());
                return;
            }
        }
        if (this.b.k()) {
            Logging.w(f3330a, "algo config list is empty");
            a(config.getPid(), (String) null, a(cCRCRiskSample, "algo config list is empty"));
            return;
        }
        if (cCRCRiskSample instanceof BitmapImageSample) {
            C1268za a2 = this.c.a(((BitmapImageSample) cCRCRiskSample).getBitmap());
            if (!a2.b()) {
                StringBuilder a3 = Yb.a("riskSample check fail:");
                a3.append(a2.f3339a);
                Logging.e(f3330a, a3.toString());
                a(config.getPid(), (String) null, a(cCRCRiskSample, a2.f3339a));
                return;
            }
        }
        a(cCRCRiskSample, u.a(), z);
        a(cCRCRiskSample, config, z);
    }

    private void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            this.b.a(str, str2, map);
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, CcrcService.Config config, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f6a750", new Object[]{this, cCRCRiskSample, config, new Boolean(z)});
        } else if (this.b.m()) {
            a(config.getPid(), (String) null, a(cCRCRiskSample, "low device and mnn not support low device"));
        } else {
            this.b.a(cCRCRiskSample, config, z);
        }
    }

    private void a(CCRCRiskSample cCRCRiskSample, Collection<BaseWuKongContentRiskPlugin> collection, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5bb0e2", new Object[]{this, cCRCRiskSample, collection, new Boolean(z)});
            return;
        }
        for (BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin : collection) {
            baseWuKongContentRiskPlugin.detect(cCRCRiskSample);
        }
    }

    private Map<String, Object> a(CCRCRiskSample cCRCRiskSample, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b0f61fc0", new Object[]{this, cCRCRiskSample, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BaseConfigKey.KEY_SAMPLE_DATA, SampleData.transform(cCRCRiskSample));
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("_errorMsg", str);
        }
        return hashMap;
    }
}
