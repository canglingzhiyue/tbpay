package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ac implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-368990266);
        kge.a(-123403623);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }
}
