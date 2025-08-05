package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nuf implements irz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private irz f31770a = new nuq();

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(390538442);
        }
    }

    static {
        kge.a(-1952599809);
        kge.a(2013495334);
    }

    @Override // tb.irz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31770a.a();
        }
    }

    @Override // tb.irz
    public void b(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb89da38", new Object[]{this, irwVar, new Integer(i)});
        } else {
            this.f31770a.b(irwVar, i);
        }
    }

    @Override // tb.irz
    public void c(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d67a3d7", new Object[]{this, irwVar, new Integer(i)});
        } else {
            this.f31770a.c(irwVar, i);
        }
    }

    @Override // tb.irz
    public void d(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f456d76", new Object[]{this, irwVar, new Integer(i)});
        } else {
            this.f31770a.d(irwVar, i);
        }
    }

    @Override // tb.irz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f31770a.c();
        }
    }

    @Override // tb.irz
    public void e(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61233715", new Object[]{this, irwVar, new Integer(i)});
        } else {
            this.f31770a.e(irwVar, i);
        }
    }

    @Override // tb.irz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f31770a.d();
        }
    }

    @Override // tb.irz
    public void a(iry videoList, irw currentPlayable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe6bc99", new Object[]{this, videoList, currentPlayable, new Integer(i)});
            return;
        }
        q.c(videoList, "videoList");
        q.c(currentPlayable, "currentPlayable");
        this.f31770a.a(videoList, currentPlayable, i);
    }

    @Override // tb.irz
    public void a(iry videoList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee404068", new Object[]{this, videoList});
            return;
        }
        q.c(videoList, "videoList");
        this.f31770a.a(videoList);
    }

    @Override // tb.irz
    public void a(boolean z, iry videoList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b0636c", new Object[]{this, new Boolean(z), videoList});
            return;
        }
        q.c(videoList, "videoList");
        this.f31770a.a(z, videoList);
    }

    @Override // tb.irz
    public void b(boolean z, iry videoList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78e2d0b", new Object[]{this, new Boolean(z), videoList});
            return;
        }
        q.c(videoList, "videoList");
        this.f31770a.b(z, videoList);
    }
}
