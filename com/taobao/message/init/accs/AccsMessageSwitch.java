package com.taobao.message.init.accs;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class AccsMessageSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1076039952);
    }

    public static String degrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8c9a08c3", new Object[0]) : ConfigUtil.getValue("mpm_data_switch", "msgChannelReceiverDegradeV2", "0");
    }
}
