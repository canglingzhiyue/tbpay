package com.alibaba.security.client.smart.core.core;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class WuKongNativeTraceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WuKongNativeTraceImpl";
    public String mCcrcCode;
    public String mPid;

    public WuKongNativeTraceImpl(String str, String str2) {
        this.mPid = str;
        this.mCcrcCode = str2;
    }

    public void trace(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a05bad", new Object[]{this, str, str2, new Integer(i), str3});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(this.mPid).setCcrcCode(this.mCcrcCode).setPhase(str).setOperation(str2).setStatus(i).setParams((Map) JsonUtils.parseObject(str3, (Class<Object>) Map.class)).build());
        }
    }
}
