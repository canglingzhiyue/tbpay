package com.taobao.taolive.sdk.ui.media.mute;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper;
import com.taobao.taolive.sdk.utils.m;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements VolumeChangeHelper.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_BY_USER = 100002;
    public static final int REASON_UPDATE_GLOBAL = 100003;
    public static final int REASON_VOLUME_CHANGE = 100001;

    /* renamed from: a  reason: collision with root package name */
    private VolumeChangeHelper f21942a;
    private IMediaPlayer e;
    private boolean f;
    private boolean g;
    private boolean b = true;
    private boolean c = false;
    private boolean d = false;
    private List<InterfaceC0912a> h = new ArrayList();

    /* renamed from: com.taobao.taolive.sdk.ui.media.mute.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0912a {
        void a(boolean z, int i);
    }

    static {
        kge.a(-799617576);
        kge.a(533419569);
    }

    public void a(InterfaceC0912a interfaceC0912a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc00b52", new Object[]{this, interfaceC0912a});
        } else if (this.h.contains(interfaceC0912a)) {
        } else {
            this.h.add(interfaceC0912a);
        }
    }

    public void b(InterfaceC0912a interfaceC0912a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33a3193", new Object[]{this, interfaceC0912a});
        } else {
            this.h.remove(interfaceC0912a);
        }
    }

    public void a(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105dadde", new Object[]{this, iMediaPlayer});
            return;
        }
        a("setMediaPlayer");
        this.e = iMediaPlayer;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!f() || this.f) {
        } else {
            a("init");
            this.f = true;
            if (!this.b) {
                return;
            }
            this.f21942a = new VolumeChangeHelper();
            h();
            this.f21942a.a(this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!f() || !this.f) {
        } else {
            a("unInit");
            this.f = false;
            if (!this.b) {
                return;
            }
            this.f21942a.c();
        }
    }

    public void a(boolean z) {
        IMediaPlayer iMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a("setOnlyVideo onlyVideo = " + z);
        this.c = z;
        if (!z || (iMediaPlayer = this.e) == null) {
            return;
        }
        iMediaPlayer.a(true);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        a("setOutControlGlobalMute outControlGlobalMute = " + z);
        this.d = z;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!f()) {
        } else {
            a("onStartPlay");
            g();
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!f()) {
            IMediaPlayer iMediaPlayer = this.e;
            if (iMediaPlayer == null) {
                return;
            }
            iMediaPlayer.a(z);
        } else {
            this.g = z;
            if (!this.f) {
                return;
            }
            g();
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            a(z, 100003);
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.e;
        if (iMediaPlayer == null) {
            return false;
        }
        return iMediaPlayer.x();
    }

    @Override // com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!f()) {
        } else {
            a("onVolumeChanged");
            a(false, 100001);
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b.a(null) && !this.d && !this.c;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a("updatePlayerMute isGlobalMuteOpen = " + b.b(null) + " isSingleSceneMute = " + this.g);
        if (!b.b(null) && !this.g) {
            IMediaPlayer iMediaPlayer = this.e;
            if (iMediaPlayer == null) {
                return;
            }
            iMediaPlayer.a(false);
            return;
        }
        IMediaPlayer iMediaPlayer2 = this.e;
        if (iMediaPlayer2 == null) {
            return;
        }
        iMediaPlayer2.a(true);
    }

    private void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (!f()) {
            IMediaPlayer iMediaPlayer = this.e;
            if (iMediaPlayer == null) {
                return;
            }
            iMediaPlayer.a(z);
        } else {
            b.a(null, z);
            b(z, i);
            if (!this.f) {
                return;
            }
            g();
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        m.a("MuteHandler", str + " hash = " + this);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        int a2 = this.f21942a.a();
        int b = this.f21942a.b();
        a("adjustVolume volume = " + a2 + " maxVolume = " + b);
        if (a2 != b || b <= 0) {
            return;
        }
        this.f21942a.a(a2 - 1);
    }

    private void b(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff4858", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        for (InterfaceC0912a interfaceC0912a : this.h) {
            interfaceC0912a.a(z, i);
        }
    }
}
