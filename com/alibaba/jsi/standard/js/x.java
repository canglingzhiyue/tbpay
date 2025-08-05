package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes2.dex */
public class x implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f3144a;

    static {
        kge.a(-904380255);
        kge.a(1203844208);
    }

    public x(Long l) {
        this.f3144a = l.longValue();
        if (this.f3144a != 0) {
            com.alibaba.jsi.standard.f.a(this);
        }
    }

    @Override // com.alibaba.jsi.standard.js.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.f3144a;
        if (j == 0) {
            return;
        }
        Bridge.cmd((com.alibaba.jsi.standard.d) null, (int) IMediaPlayer.MEDIA_INFO_RTC_AUDIO_FIRST_PACKET_TIME, j);
        this.f3144a = 0L;
        com.alibaba.jsi.standard.f.b(this);
    }

    public w a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("9a011fd3", new Object[]{this, dVar});
        }
        Object cmd = Bridge.cmd(dVar, (int) IMediaPlayer.MEDIA_INFO_RTC_VIDEO_FIRST_FRAME_TIME, this.f3144a);
        if (!(cmd instanceof w)) {
            return null;
        }
        return (w) cmd;
    }
}
