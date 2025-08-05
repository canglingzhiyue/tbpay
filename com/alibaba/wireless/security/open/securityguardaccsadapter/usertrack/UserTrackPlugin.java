package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.module.plugin.a;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class UserTrackPlugin extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "UserTrackPlugin";
    private final IUserTrackPlugin mUserTrackPlugin;

    static {
        kge.a(-1598711469);
    }

    public UserTrackPlugin(IUserTrackPlugin iUserTrackPlugin) {
        this.mUserTrackPlugin = iUserTrackPlugin;
    }

    @Override // com.ut.mini.module.plugin.a
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this}) : this.mUserTrackPlugin.getAttentionEventIds();
    }

    @Override // com.ut.mini.module.plugin.a
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("63572670", new Object[]{this, str, new Integer(i), str2, str3, str4}) : this.mUserTrackPlugin.onEventDispatch(str, i, str2, str3, str4);
    }

    @Override // com.ut.mini.module.plugin.a
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map}) : this.mUserTrackPlugin.onEventDispatchExt(str, i, str2, str3, str4, map);
    }

    @Override // com.ut.mini.module.plugin.a
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : this.mUserTrackPlugin.getPluginName();
    }
}
