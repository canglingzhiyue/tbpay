package com.taobao.artc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcException;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-32023647);
    }

    public static void a(String str, boolean z) throws ArtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else if (!z) {
            throw new ArtcException(str);
        }
    }
}
