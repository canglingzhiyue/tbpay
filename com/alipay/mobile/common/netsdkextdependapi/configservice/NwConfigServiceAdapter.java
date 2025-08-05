package com.alipay.mobile.common.netsdkextdependapi.configservice;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class NwConfigServiceAdapter implements NwConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigService
    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        InnerMiscUtil.log(Level.WARNING, "[NwConfigServiceUtil#getConfig] default return empty");
        return "";
    }
}
