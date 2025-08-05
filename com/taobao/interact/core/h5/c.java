package com.taobao.interact.core.h5;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(928256864);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        q.a("WVInteractsdkCamera", (Class<? extends e>) WVInteractsdkCamera.class, true);
        q.a("WVCamera", "takePhotoInteract", "WVInteractsdkCamera", "takePhotoInteract");
        q.a("WVInteractsdkUpload", (Class<? extends e>) WVInteractsdkUpload.class, true);
        q.a("WVInteractsdkAudio", (Class<? extends e>) WVInteractsdkAudio.class, true);
        com.taobao.android.ugc.h5.a.a();
    }
}
