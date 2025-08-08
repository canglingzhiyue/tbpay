package com.taobao.android.external;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import tb.kge;

/* loaded from: classes.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1452225218);
        kge.a(-1993606391);
    }

    @Override // com.taobao.android.external.a
    public void a(UCPReachViewState uCPReachViewState) {
        NativeBroadcast.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe4b5af", new Object[]{this, uCPReachViewState});
        } else if (uCPReachViewState == null || StringUtils.isEmpty(uCPReachViewState.key) || StringUtils.isEmpty(uCPReachViewState.group) || uCPReachViewState.trackInfo == null || (callback = (NativeBroadcast.Callback) uCPReachViewState.trackInfo.get("callback")) == null) {
        } else {
            callback.callback((JSONObject) JSON.toJSON(uCPReachViewState), null);
            if (!com.taobao.homepage.pop.ucp.b.KEY_TERMINAL.equals(uCPReachViewState.key) && !"Error".equals(uCPReachViewState.key)) {
                return;
            }
            callback.close();
        }
    }
}
