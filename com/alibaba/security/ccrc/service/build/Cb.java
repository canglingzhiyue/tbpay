package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import com.alibaba.security.wukong.config.Algo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Cb extends Bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Cb(Context context, Algo algo, InterfaceC1260wb interfaceC1260wb) {
        super(context, algo, interfaceC1260wb);
    }

    @Override // com.alibaba.security.ccrc.service.build.Bb
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return null;
    }
}
