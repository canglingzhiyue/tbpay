package com.taobao.android.detail.wrapper.ext.preload;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1449521197);
        emu.a("com.taobao.android.detail.wrapper.ext.preload.DetailResponseConverter");
    }

    public static String a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{mtopResponse});
        }
        if (mtopResponse != null && mtopResponse.getBytedata() != null) {
            return new String(mtopResponse.getBytedata());
        }
        return null;
    }
}
