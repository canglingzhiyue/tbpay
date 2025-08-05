package com.alipay.android.app.render.birdnest.provider;

import com.alipay.android.app.cctemplate.TemplateValue;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.List;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierTemplateTransport implements BirdNestEngine.TemplateTransport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.birdnest.api.BirdNestEngine.TemplateTransport
    public List<String> fetchTemplates(Map<String, String> map) {
        try {
            return ((ITplTransport) Class.forName("com.alipay.android.app.ctemplate.api.TemplateTransportForSdk").newInstance()).fetchTemplates(map);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", TemplateValue.EC_TPL_RPC_INIT_TRANS_EX, th);
            return null;
        }
    }
}
