package com.taobao.android.home.component.view.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.media.MediaConstant;
import com.taobao.taolive.uikit.homepage.d;
import tb.kge;
import tb.pqu;
import tb.pqy;
import tb.prc;
import tb.psh;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class b implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f12750a;
    private static Rect k;
    private a b;
    private psh c;
    private int d;
    private Rect e;
    private long f;
    private int h;
    private int i;
    private pqy g = new pqy(this);
    private boolean j = true;

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ pqy a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("63d7c22f", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ psh b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psh) ipChange.ipc$dispatch("748d9463", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ int c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e73e2090", new Object[]{bVar})).intValue() : bVar.d;
    }

    static {
        kge.a(1873604780);
        kge.a(-1317704444);
        k = null;
    }

    private b(Context context) {
        b(context);
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("79c25cd7", new Object[]{context});
        }
        if (f12750a == null) {
            f12750a = new b(context);
        }
        return f12750a;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        e.e("HTBLiveVideoManager", "release");
        b bVar = f12750a;
        if (bVar != null) {
            bVar.c();
        }
        f12750a = null;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d603e", new Object[]{this, cVar});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(cVar);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.f = 0L;
        this.b = new a((Activity) context, MediaConstant.LBLIVE_SOURCE);
        this.b.a(false, 2, 0, 0, 0);
        this.b.a(this.j);
        this.b.b(j.a("enableUseBfrtc", true));
        this.b.c(j.a("enableUseRtcLive", true));
        IMediaPlayer.OnInfoListener onInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.android.home.component.view.live.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && b.a(b.this) != null) {
                    b.a(b.this).post(new Runnable() { // from class: com.taobao.android.home.component.view.live.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (b.b(b.this) == null || b.b(b.this).f32862a == null) {
                            } else {
                                b.b(b.this).f32862a.onVideoStart();
                            }
                        }
                    });
                    b.a(b.this).postDelayed(new Runnable() { // from class: com.taobao.android.home.component.view.live.b.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (b.b(b.this) == null) {
                            } else {
                                if (2 != b.b(b.this).e) {
                                    b.this.b();
                                } else if (b.b(b.this).j) {
                                } else {
                                    b.this.b();
                                }
                            }
                        }
                    }, b.c(b.this) * 1000);
                }
                return false;
            }
        };
        this.i = prc.f(context);
        this.h = prc.g(context);
        this.b.a(onInfoListener);
    }

    public boolean a(psh pshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa3889f7", new Object[]{this, pshVar})).booleanValue();
        }
        if (!prc.a() || pshVar == null) {
            return false;
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

    private Rect f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dcdd376", new Object[]{this});
        }
        if (k == null) {
            k = new Rect();
            int i = this.h;
            int i2 = (int) (i * 0.4d);
            k.set(0, i2, this.i, ((int) (i * 0.5d)) + i2);
        }
        return k;
    }

    private boolean b(psh pshVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb9078", new Object[]{this, pshVar})).booleanValue();
        }
        if (pshVar == null) {
            return false;
        }
        pqy pqyVar = this.g;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        this.b.a(pshVar.d);
        this.b.a(pshVar.e);
        this.b.b(pshVar.h);
        if (2 == pshVar.e) {
            this.b.d(pshVar.j);
        } else {
            this.b.d(false);
        }
        if (this.j == pshVar.i) {
            this.j = !pshVar.i;
            this.b.a(this.j);
        }
        if (this.b == null || pshVar.c <= 0) {
            return false;
        }
        this.c = pshVar;
        if (this.c.l == null) {
            if (!TextUtils.isEmpty(this.c.b)) {
                this.b.a(null, this.c.b);
            } else {
                this.c = null;
                return false;
            }
        } else {
            this.b.a(this.c.l, null);
        }
        if (pshVar.f32862a != null) {
            pshVar.f32862a.onVideoRequestAccept();
        }
        this.b.a();
        this.b.b();
        this.d = this.c.c;
        if (!this.c.g.equals(this.e)) {
            this.e = this.c.g;
            if (Build.VERSION.SDK_INT >= 21 && (aVar = this.b) != null && aVar.e() != null) {
                this.b.e().setOutlineProvider(new d(this.e));
                this.b.e().setClipToOutline(true);
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
        a aVar = this.b;
        if (aVar != null) {
            aVar.c();
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
        a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
        f12750a = null;
    }

    public a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b675f003", new Object[]{this}) : this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c != null;
    }
}
