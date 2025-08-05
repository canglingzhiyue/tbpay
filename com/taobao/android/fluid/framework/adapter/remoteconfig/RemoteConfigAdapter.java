package com.taobao.android.fluid.framework.adapter.remoteconfig;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;
import tb.kge;
import tb.oeb;
import tb.oec;

/* loaded from: classes5.dex */
public class RemoteConfigAdapter implements IRemoteConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RemoteConfigAdapter";

    static {
        kge.a(-2106183863);
        kge.a(-206180505);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IRemoteConfigAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public boolean getABTestBooleanConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7686466", new Object[]{this, str, new Boolean(z)})).booleanValue() : oec.a(getABTestObjectConfig(str, Boolean.valueOf(z)), z);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public Object getABTestObjectConfig(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5438f4bb", new Object[]{this, str, obj}) : oeb.a(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public String getABTestStringConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("feace2e9", new Object[]{this, str, str2}) : oeb.b(str, str2);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public boolean getOrangeBooleanConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83d28ce1", new Object[]{this, str, new Boolean(z)})).booleanValue() : oeb.a(appendKey(str), z);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public int getOrangeIntConfig(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4e1ac98", new Object[]{this, str, new Integer(i)})).intValue() : oeb.a(appendKey(str), i);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public long getOrangeLongConfig(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1479f6e5", new Object[]{this, str, new Long(j)})).longValue() : oeb.a(appendKey(str), j);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter
    public String getOrangeStringConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c6af5ce", new Object[]{this, str, str2}) : oeb.a(appendKey(str), str2);
    }

    private String appendKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ab0bdaa", new Object[]{this, str});
        }
        if (str == null || str.contains(".")) {
            return str;
        }
        return "ShortVideo." + str;
    }
}
