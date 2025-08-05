package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ArtcSpeakerHandle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1156258230);
    }

    public void onActiveSpeakers(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5fb7df", new Object[]{this, strArr});
        }
    }
}
