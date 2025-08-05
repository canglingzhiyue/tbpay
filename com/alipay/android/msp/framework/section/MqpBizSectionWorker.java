package com.alipay.android.msp.framework.section;

import com.alipay.android.msp.plugin.engine.IMqpBizSectionEngine;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MqpBizSectionWorker implements IMqpBizSectionEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IMqpBizSectionEngine
    public void callSection(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e4bad0", new Object[]{this, jSONObject});
        }
    }
}
