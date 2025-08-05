package com.taobao.taolive.sdk.ui.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.g;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public h k;
    public boolean l;
    private boolean m = true;
    private final a n = new a();

    static {
        kge.a(-2045580452);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1245144988) {
            super.i(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode != 96532846) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.g();
            return null;
        }
    }

    public f(h hVar) {
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "MediaPlayController3");
        this.k = hVar;
        this.f21925a = new Handler(Looper.getMainLooper());
    }

    @Override // com.taobao.taolive.sdk.ui.media.e
    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.e
    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this});
        }
        h hVar = this.k;
        if (hVar == null) {
            return null;
        }
        return hVar.f21934a;
    }

    @Override // com.taobao.taolive.sdk.ui.media.e, com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "createInstance");
        this.f21925a.removeCallbacks(this.n);
        this.d = context;
        this.b = new FrameLayout(context);
        g.a a2 = g.a().a(context, this.k, !this.l, this.m);
        if (a2 != null) {
            this.c = a2.f21932a;
            if (this.c != null) {
                this.f.a(this.c);
            }
            a(a2);
        }
        if (this.c != null) {
            this.l = true;
        }
        M();
        if (this.c == null) {
            return;
        }
        this.c.a(this);
    }

    @Override // com.taobao.taolive.sdk.ui.media.e, com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f21925a.removeCallbacks(this.n);
        super.g();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f21925a.removeCallbacks(this.n);
        super.i(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.e, com.taobao.taolive.sdk.ui.media.d
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "releaseByToken");
        this.f21925a.removeCallbacks(this.n);
        if (this.k != null) {
            if (this.l) {
                g.a().a(this.c);
                this.l = false;
            }
        } else if (this.c != null) {
            this.c.o();
        }
        s();
    }

    @Override // com.taobao.taolive.sdk.ui.media.e, com.taobao.taolive.sdk.ui.media.d
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "releaseAndDestroy");
        this.f21925a.removeCallbacks(this.n);
        if (this.k != null) {
            if (this.l) {
                g.a().b(this.c);
                this.l = false;
            }
        } else if (this.c != null) {
            this.c.o();
            this.c.c();
        }
        E();
    }

    @Override // com.taobao.taolive.sdk.ui.media.e, com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "destroy");
        this.f21925a.removeCallbacks(this.n);
        if (this.c != null) {
            this.c.c();
        }
        if (this.k != null) {
            g.a().c(this.c);
        }
        E();
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else {
            a(com.taobao.taolive.sdk.utils.o.k(), false);
        }
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "tryDelayedDestroy");
        if (this.k != null) {
            this.n.a(z);
            this.f21925a.postDelayed(this.n, j);
        } else if (this.c != null) {
            this.c.o();
            this.c.c();
        }
        E();
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;

        static {
            kge.a(-1875747771);
            kge.a(-1390502639);
        }

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.taolive.sdk.utils.m.a("MediaPlayController", "mDelayedDestroyTask run hasRef = " + f.this.l);
            if (!f.this.l) {
                return;
            }
            g.a().b(f.this.c);
            if (this.b && f.this.b != null) {
                f.this.b.removeAllViews();
                f.this.b.setBackground(null);
            }
            f.this.l = false;
        }
    }
}
