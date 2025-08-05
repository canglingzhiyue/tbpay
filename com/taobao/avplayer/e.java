package com.taobao.avplayer;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements com.taobao.avplayer.common.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-334716882);
        kge.a(-676381143);
    }

    @Override // com.taobao.avplayer.common.d
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context}) : UTDevice.getUtdid(context);
    }
}
