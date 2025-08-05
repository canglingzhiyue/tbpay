package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.multi.MultiModelRiskSample;
import com.alibaba.security.wukong.model.protocol.RiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class Vb<T extends MultiModelRiskSample> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3282a = "BaseSamplePre";
    public boolean b = true;

    public void a(T t, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b86125", new Object[]{this, t, cCRCRiskSample});
        } else if (cCRCRiskSample == null) {
        } else {
            cCRCRiskSample.getExtras().put(RiskSample.REAL_SAMPLE_ID, t.getSampleId());
            cCRCRiskSample.getExtras().put(RiskSample.REAL_SAMPLE_TYPE, t.type());
            Map<String, Object> extras = t.getExtras();
            if (extras == null) {
                return;
            }
            cCRCRiskSample.getExtras().putAll(extras);
        }
    }

    public void a(CcrcService ccrcService, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41760ad", new Object[]{this, ccrcService, str, t});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(ccrcService.getPid()).setCcrcCode(ccrcService.getCcrcCode()).setPhase("error").setOperation(Ba.a.n).addParam("sampleType", t.type()).addParam("errorMsg", str).build());
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void a(CcrcService ccrcService, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ba6c98", new Object[]{this, ccrcService, cCRCRiskSample});
        } else {
            ccrcService.detect(cCRCRiskSample, this.b);
        }
    }
}
