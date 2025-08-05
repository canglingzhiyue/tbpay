package com.taobao.taolive.sdk.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.ipz;
import tb.kge;
import tb.phq;

/* loaded from: classes8.dex */
public class e extends phq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long D;
    public boolean E;
    private com.taobao.taolive.sdk.playcontrol.a s;
    public com.taobao.taolive.sdk.controller.e t;
    private com.taobao.taolive.sdk.playcontrol.observe.a v;
    private VideoInfo w;
    private boolean x = false;
    private ipz y;

    static {
        kge.a(-1115356850);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public /* synthetic */ g z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5477abf2", new Object[]{this}) : y();
    }

    public VideoInfo x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("e972fa3c", new Object[]{this}) : this.w;
    }

    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else {
            this.w = videoInfo;
        }
    }

    public void a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
        } else {
            this.t = eVar;
        }
    }

    public ipz J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ipz) ipChange.ipc$dispatch("5e1037c2", new Object[]{this}) : this.y;
    }

    public void a(ipz ipzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2485c5", new Object[]{this, ipzVar});
        } else {
            this.y = ipzVar;
        }
    }

    public com.taobao.taolive.sdk.controller.e y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("59d1d16", new Object[]{this}) : this.t;
    }

    public com.taobao.taolive.sdk.playcontrol.a A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.playcontrol.a) ipChange.ipc$dispatch("7dd569ab", new Object[]{this}) : this.s;
    }

    public void a(com.taobao.taolive.sdk.playcontrol.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be31345", new Object[]{this, aVar});
        } else {
            this.s = aVar;
        }
    }

    public com.taobao.taolive.sdk.playcontrol.observe.a B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.playcontrol.observe.a) ipChange.ipc$dispatch("2a5fc89d", new Object[]{this}) : this.v;
    }

    public void a(com.taobao.taolive.sdk.playcontrol.observe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5edf8658", new Object[]{this, aVar});
        } else {
            this.v = aVar;
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.x;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }
}
