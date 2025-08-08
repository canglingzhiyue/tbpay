package com.taobao.taolive.uikit.homepage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveInfo;
import tb.ddc;
import tb.ddh;
import tb.kge;
import tb.pqu;
import tb.pqy;
import tb.prc;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class c implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f22027a;
    private static boolean b;
    private k c;
    private pqy e = new pqy(this);
    private Rect f = null;
    private b d = null;

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ b a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("36124e65", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ pqy b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("ff6313b9", new Object[]{cVar}) : cVar.e;
    }

    static {
        kge.a(-1666905385);
        kge.a(-1317704444);
        f22027a = null;
        b = false;
    }

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("78a2d96e", new Object[]{context});
        }
        if (f22027a == null) {
            f22027a = new c(context);
            b = false;
        }
        return f22027a;
    }

    private c(Context context) {
        b(context);
    }

    public void a(b bVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bfcb91", new Object[]{this, bVar, context});
        } else if (!prc.a() || bVar == null) {
        } else {
            b bVar2 = this.d;
            if (bVar2 == null) {
                if (!bVar.d.intersect(c(context))) {
                    return;
                }
                a(bVar);
            } else if (bVar2.f22026a == bVar.f22026a || !bVar.d.intersect(c(context))) {
            } else {
                b();
                a(bVar);
            }
        }
    }

    public k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("c8451c", new Object[]{this}) : this.c;
    }

    private void b(Context context) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.c = new k(context, false, MediaConstant.LBLIVE_SOURCE);
        com.taobao.taolive.uikit.livecard.d dVar = new com.taobao.taolive.uikit.livecard.d();
        this.c.a((ddc) dVar);
        this.c.a((ddh) dVar);
        this.c.a(false, 2, 0, 0, 0);
        this.c.e(true);
        if (Build.VERSION.SDK_INT >= 21 && (kVar = this.c) != null && kVar.q() != null) {
            this.c.q().setOutlineProvider(new d(6));
            this.c.q().setClipToOutline(true);
        }
        this.c.a(new IMediaPlayer.OnErrorListener() { // from class: com.taobao.taolive.uikit.homepage.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                c.this.b();
                return false;
            }
        });
        this.c.a(new IMediaPlayer.OnInfoListener() { // from class: com.taobao.taolive.uikit.homepage.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (((int) j) == 3) {
                    if (c.a(c.this) != null && c.a(c.this).f22026a != null) {
                        c.a(c.this).f22026a.onVideoStart();
                    }
                    if (c.b(c.this) != null && c.a(c.this) != null) {
                        c.b(c.this).postDelayed(new Runnable() { // from class: com.taobao.taolive.uikit.homepage.c.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    c.this.b();
                                }
                            }
                        }, c.a(c.this).b * 1000);
                    }
                }
                return false;
            }
        });
    }

    private Rect c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("fa83e267", new Object[]{this, context});
        }
        if (this.f == null) {
            this.f = new Rect();
            int f = prc.f(context);
            double g = prc.g(context);
            int i = (int) (0.52d * g);
            this.f.set(0, i, f, ((int) (g * 0.01d)) + i);
        }
        return this.f;
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f243817", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (bVar.f22026a != null) {
                bVar.f22026a.onVideoRequestAccept();
            }
            pqy pqyVar = this.e;
            if (pqyVar != null) {
                pqyVar.removeCallbacksAndMessages(null);
            }
            this.c.c(bVar.g);
            this.c.a(0);
            this.c.e(bVar.e);
            k kVar = this.c;
            if (kVar == null || kVar.q() == null || StringUtils.isEmpty(bVar.c) || bVar.b <= 0) {
                return;
            }
            this.c.q().setVisibility(0);
            if (bVar.f == null) {
                this.c.a((MediaLiveInfo) null, bVar.c);
            } else {
                this.c.a(bVar.f, (String) null);
            }
            this.c.p();
            this.c.f();
            this.d = bVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        k kVar = this.c;
        if (kVar != null && kVar.q() != null) {
            this.c.l();
            this.c.q().setVisibility(8);
            b bVar = this.d;
            if (bVar != null && bVar.f22026a != null) {
                this.d.f22026a.onVideoStop();
            }
        }
        this.d = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b();
        k kVar = this.c;
        if (kVar != null) {
            kVar.s();
        }
        pqy pqyVar = this.e;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        f22027a = null;
        b = true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : b;
    }
}
