package com.taobao.media;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.ddc;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaConfigAdapter implements ddc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1768910457);
        kge.a(893314682);
    }

    @Override // tb.ddc
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return OrangeConfig.getInstance().getConfig("DWInteractive", str2, str3);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
