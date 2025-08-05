package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsListener;
import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetLocalSetActivatingParamsListener implements AmnetSetActivatingParamsListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetLocalSetActivatingParamsListener f5684a;

    public static final AmnetLocalSetActivatingParamsListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalSetActivatingParamsListener) ipChange.ipc$dispatch("4fc3ad6", new Object[0]);
        }
        AmnetLocalSetActivatingParamsListener amnetLocalSetActivatingParamsListener = f5684a;
        if (amnetLocalSetActivatingParamsListener != null) {
            return amnetLocalSetActivatingParamsListener;
        }
        synchronized (AmnetLocalSetActivatingParamsListener.class) {
            if (f5684a != null) {
                return f5684a;
            }
            f5684a = new AmnetLocalSetActivatingParamsListener();
            return f5684a;
        }
    }

    private AmnetLocalSetActivatingParamsListener() {
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsListener
    public void onAfterSetActivatingParamsEvent(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade096fe", new Object[]{this, activatingParams});
        } else if (activatingParams == null) {
            LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] activatingParams is null.");
        } else if (activatingParams.activating == null) {
            LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] activating is null.");
        } else {
            activatingParams.activating.addExtParam(Baggage.Amnet.KEY_SUB_TARGET_TYPE, "1");
            LogCatUtil.info("AmnetLocalSetActivatingParamsListener", "[onAfterSetActivatingParamsEvent] Set finished.");
        }
    }
}
