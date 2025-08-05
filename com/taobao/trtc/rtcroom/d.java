package com.taobao.trtc.rtcroom;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.rtcroom.a;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23167a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public a.C0992a j;

    static {
        kge.a(467838624);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "{ serviceName: " + this.f23167a + ", appKey: " + this.b + ", userId: " + this.d + ", roomId: " + this.c + ", bizId: " + this.e + ", fps: " + this.f + ", resulution: " + this.g + ", enableCamera: " + this.h + ", mute: " + this.i + " }";
    }
}
