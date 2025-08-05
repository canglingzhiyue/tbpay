package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import java.util.Map;

/* loaded from: classes3.dex */
public interface IUserTrackPlugin {
    int[] getAttentionEventIds();

    String getPluginName();

    Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4);

    Map<String, String> onEventDispatchExt(String str, int i, String str2, String str3, String str4, Map<String, String> map);
}
