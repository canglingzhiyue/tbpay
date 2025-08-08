package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.taolive.uikit.homepage.d;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class psg implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static psg f32858a;
    private static Rect l;
    private prz b;
    private psh c;
    private int d;
    private Rect e;
    private long f;
    private int h;
    private int i;
    private pqy g = new pqy(this);
    private int j = -1;
    private boolean k = true;

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ pqy a(psg psgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("b13132da", new Object[]{psgVar}) : psgVar.g;
    }

    public static /* synthetic */ psh b(psg psgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psh) ipChange.ipc$dispatch("98d30eac", new Object[]{psgVar}) : psgVar.c;
    }

    public static /* synthetic */ int c(psg psgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d73e2289", new Object[]{psgVar})).intValue() : psgVar.d;
    }

    private psg(Context context) {
        b(context);
    }

    public static psg a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psg) ipChange.ipc$dispatch("34c7ebe2", new Object[]{context});
        }
        if (f32858a == null) {
            f32858a = new psg(context);
        }
        return f32858a;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        psg psgVar = f32858a;
        if (psgVar != null) {
            psgVar.c();
        }
        f32858a = null;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.f = 0L;
        this.b = new prz((Activity) context, MediaConstant.LBLIVE_SOURCE);
        this.b.a(false, 2, 0, 0, 0);
        this.b.a(this.k);
        this.b.b(prr.n());
        this.b.c(prr.o());
        IMediaPlayer.OnInfoListener onInfoListener = new IMediaPlayer.OnInfoListener() { // from class: tb.psg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && psg.a(psg.this) != null) {
                    psg.a(psg.this).post(new Runnable() { // from class: tb.psg.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (psg.b(psg.this) == null || psg.b(psg.this).f32862a == null) {
                            } else {
                                psg.b(psg.this).f32862a.onVideoStart();
                            }
                        }
                    });
                    psg.a(psg.this).postDelayed(new Runnable() { // from class: tb.psg.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (psg.b(psg.this) == null) {
                            } else {
                                if (2 != psg.b(psg.this).e) {
                                    psg.this.b();
                                } else if (psg.b(psg.this).j) {
                                } else {
                                    psg.this.b();
                                }
                            }
                        }
                    }, psg.c(psg.this) * 1000);
                }
                return false;
            }
        };
        this.i = prc.f(context);
        this.h = prc.g(context);
        this.b.a(onInfoListener);
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        if (-1 == this.j) {
            this.j = 0;
            int a2 = prq.a();
            if (a2 == 0 || -1 == a2) {
                this.j = prr.h();
            } else if (1 == a2) {
                this.j = prr.i();
            } else if (2 == a2) {
                this.j = prr.j();
            }
        }
        return this.j;
    }

    public boolean a(psh pshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3889f7", new Object[]{this, pshVar})).booleanValue();
        }
        if (!prc.a() || pshVar == null) {
            return false;
        }
        int e = e();
        if (e != 0) {
            if (0 == this.f) {
                this.f = SystemClock.uptimeMillis();
                return false;
            } else if (SystemClock.uptimeMillis() - this.f < e * 1000) {
                return false;
            }
        }
        psh pshVar2 = this.c;
        if (pshVar2 == null) {
            return b(pshVar);
        }
        if (pshVar2.f32862a == pshVar.f32862a) {
            return true;
        }
        if (pshVar.f < this.c.f || !pshVar.k.intersect(f())) {
            return false;
        }
        b();
        return b(pshVar);
    }

    static {
        kge.a(1727575713);
        kge.a(-1317704444);
        l = null;
    }

    private Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dcdd376", new Object[]{this});
        }
        if (l == null) {
            l = new Rect();
            int i = this.h;
            int i2 = (int) (i * 0.4d);
            l.set(0, i2, this.i, ((int) (i * 0.5d)) + i2);
        }
        return l;
    }

    private boolean b(psh pshVar) {
        prz przVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb9078", new Object[]{this, pshVar})).booleanValue();
        }
        if (pshVar == null) {
            return false;
        }
        if (pshVar.f32862a != null) {
            pshVar.f32862a.onVideoRequestAccept();
        }
        pqy pqyVar = this.g;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        this.b.d();
        this.c = pshVar;
        this.b.a(pshVar.d);
        this.b.a(pshVar.e);
        this.b.b(pshVar.h);
        if (2 == pshVar.e) {
            this.b.d(pshVar.j);
        } else {
            this.b.d(false);
        }
        if (this.k == pshVar.i) {
            this.k = !pshVar.i;
            this.b.a(this.k);
        }
        if (this.b == null || this.c.c <= 0) {
            return false;
        }
        if (this.c.l == null) {
            if (StringUtils.isEmpty(this.c.b)) {
                return false;
            }
            this.b.a(null, this.c.b);
        } else {
            this.b.a(this.c.l, null);
        }
        this.b.a(pro.f(pshVar.m));
        this.b.a();
        this.b.b();
        this.d = this.c.c;
        if (!this.c.g.equals(this.e)) {
            this.e = this.c.g;
            if (Build.VERSION.SDK_INT >= 21 && (przVar = this.b) != null && przVar.f() != null) {
                this.b.f().setOutlineProvider(new d(this.e));
                this.b.f().setClipToOutline(true);
            }
        }
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b != null) {
            if (prr.c()) {
                this.b.d();
            } else {
                this.b.c();
            }
            psh pshVar = this.c;
            if (pshVar != null && pshVar.f32862a != null) {
                this.c.f32862a.onVideoStop();
            }
        }
        this.c = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b();
        pqy pqyVar = this.g;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        prz przVar = this.b;
        if (przVar != null) {
            przVar.d();
            this.b.e();
        }
        f32858a = null;
    }

    public prz d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (prz) ipChange.ipc$dispatch("261e3983", new Object[]{this}) : this.b;
    }
}
