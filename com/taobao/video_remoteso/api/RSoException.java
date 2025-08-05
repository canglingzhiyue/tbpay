package com.taobao.video_remoteso.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class RSoException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-448702100);
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : "unknown";
    }
}
