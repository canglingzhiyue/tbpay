package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSOrangeImpl;", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter;", "()V", "getConfigByGroupAndName", "", "groupName", OConstant.DIMEN_CONFIG_NAME, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getConfigByGroupAndNameFromLocal", "getConfigs", "", "getCustomConfig", "registerListener", "", "configListener", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter$ConfigListener;", "unregisterListener", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSOrangeImpl implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1672148085);
        kge.a(1479634272);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str}) : TMSOrangeProxy.INSTANCE.getConfigs(str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndName(String groupName, String configName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea1109", new Object[]{this, groupName, configName, str});
        }
        q.d(groupName, "groupName");
        q.d(configName, "configName");
        return TMSOrangeProxy.INSTANCE.getConfigByGroupAndName(groupName, configName, str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndNameFromLocal(String groupName, String configName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac4d0e8c", new Object[]{this, groupName, configName, str});
        }
        q.d(groupName, "groupName");
        q.d(configName, "configName");
        return TMSOrangeProxy.INSTANCE.getConfigByGroupAndNameFromLocal(groupName, configName, str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void registerListener(String groupName, IConfigAdapter.a configListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4df7c", new Object[]{this, groupName, configListener});
            return;
        }
        q.d(groupName, "groupName");
        q.d(configListener, "configListener");
        TMSOrangeProxy.INSTANCE.registerListener(groupName, configListener);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void unregisterListener(String groupName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, groupName});
            return;
        }
        q.d(groupName, "groupName");
        TMSOrangeProxy.INSTANCE.unregisterListener(groupName);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfig(String groupName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, groupName, str});
        }
        q.d(groupName, "groupName");
        return TMSOrangeProxy.INSTANCE.getCustomConfig(groupName, str);
    }
}
