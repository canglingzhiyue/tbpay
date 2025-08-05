package com.taobao.tbugc.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBSoundPlayer;
import tb.jmv;
import tb.kge;

/* loaded from: classes9.dex */
public class d implements jmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1124173805);
        kge.a(-1796258696);
    }

    @Override // tb.jmv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            TBSoundPlayer.getInstance().playScene(7);
        }
    }
}
