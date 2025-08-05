package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBSoundPlayer;
import tb.kge;

/* loaded from: classes5.dex */
public class w implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1461669902);
        kge.a(1183700275);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.q
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            TBSoundPlayer.getInstance().playScene(i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.q
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            TBSoundPlayer.getInstance().play(str);
        }
    }
}
