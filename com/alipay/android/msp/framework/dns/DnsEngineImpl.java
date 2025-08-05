package com.alipay.android.msp.framework.dns;

import android.content.Context;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.network.APNetSwitchUtil;
import com.alipay.android.msp.plugin.engine.IDnsEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public class DnsEngineImpl implements IDnsEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IDnsEngine
    public void inscLoopCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d88f9d", new Object[]{this});
        } else {
            ConnManager.inscLoopCount();
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IDnsEngine
    public boolean isClientConnDegrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79865060", new Object[]{this})).booleanValue() : ConnManager.isClientConnDegrade();
    }

    @Override // com.alipay.android.msp.plugin.engine.IDnsEngine
    public void updateDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e3e827", new Object[]{this});
            return;
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null && APNetSwitchUtil.shouldIUseAPHttpDns(context) && APNetSwitchUtil.shouldIUseAPNetwork(context)) {
            return;
        }
        DnsManager.updateDns();
    }

    @Override // com.alipay.android.msp.plugin.engine.IDnsEngine
    public InetAddress[] getInetAddresses(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetAddress[]) ipChange.ipc$dispatch("549a6e1c", new Object[]{this, str}) : DnsManager.getInetAddresses(str);
    }
}
