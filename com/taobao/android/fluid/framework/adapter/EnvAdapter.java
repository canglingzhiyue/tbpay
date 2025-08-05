package com.taobao.android.fluid.framework.adapter;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class EnvAdapter implements IEnvAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1238981739);
        kge.a(-848550590);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IEnvAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IEnvAdapter
    public boolean isPre() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca587524", new Object[]{this})).booleanValue() : EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.PRE.getValue();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IEnvAdapter
    public boolean isOnline() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6971d628", new Object[]{this})).booleanValue() : EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue();
    }
}
