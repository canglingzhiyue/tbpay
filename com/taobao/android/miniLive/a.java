package com.taobao.android.miniLive;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.c;
import com.taobao.android.miniLive.services.e;
import com.taobao.android.miniLive.state.MiniLiveState;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.android.miniLive.ui.d;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.o;
import java.util.HashMap;
import java.util.Map;
import tb.htw;
import tb.htx;
import tb.hub;
import tb.huc;
import tb.hud;
import tb.hue;
import tb.huf;
import tb.ipz;
import tb.kge;
import tb.pmb;
import tb.pmd;
import tb.poy;
import tb.pqq;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";

    /* renamed from: a  reason: collision with root package name */
    private static a f14319a;
    private TBMiniLiveFloatController c;
    private Handler d;
    private boolean b = false;
    private MiniLiveState e = MiniLiveState.LiveStatusClosed;

    static {
        kge.a(1234538562);
    }

    public static /* synthetic */ MiniLiveState a(a aVar, MiniLiveState miniLiveState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniLiveState) ipChange.ipc$dispatch("e182a753", new Object[]{aVar, miniLiveState});
        }
        aVar.e = miniLiveState;
        return miniLiveState;
    }

    public static /* synthetic */ TBMiniLiveFloatController a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMiniLiveFloatController) ipChange.ipc$dispatch("8e53ff0f", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ TBMiniLiveFloatController a(a aVar, TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMiniLiveFloatController) ipChange.ipc$dispatch("4f9a1e25", new Object[]{aVar, tBMiniLiveFloatController});
        }
        aVar.c = tBMiniLiveFloatController;
        return tBMiniLiveFloatController;
    }

    public static /* synthetic */ void a(a aVar, Context context, String str, Map map, View.OnClickListener onClickListener, com.taobao.android.miniLive.ui.a aVar2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1bf4f2", new Object[]{aVar, context, str, map, onClickListener, aVar2, dVar});
        } else {
            aVar.c(context, str, map, onClickListener, aVar2, dVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45c0f9b", new Object[]{aVar, context})).booleanValue() : aVar.a(context);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f85ff3a7", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.b = z;
        return z;
    }

    public static /* synthetic */ void b(a aVar, Context context, String str, Map map, View.OnClickListener onClickListener, com.taobao.android.miniLive.ui.a aVar2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b47473", new Object[]{aVar, context, str, map, onClickListener, aVar2, dVar});
        } else {
            aVar.d(context, str, map, onClickListener, aVar2, dVar);
        }
    }

    public static /* synthetic */ void c(a aVar, Context context, String str, Map map, View.OnClickListener onClickListener, com.taobao.android.miniLive.ui.a aVar2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234cf3f4", new Object[]{aVar, context, str, map, onClickListener, aVar2, dVar});
        } else {
            aVar.b(context, str, map, onClickListener, aVar2, dVar);
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4abd82d1", new Object[0]);
        }
        if (f14319a == null) {
            synchronized (a.class) {
                if (f14319a == null) {
                    f14319a = new a();
                }
            }
        }
        return f14319a;
    }

    private a() {
        Globals.getApplication().registerActivityLifecycleCallbacks(new htw());
    }

    public void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{this, context, str, map});
        } else {
            a(context, str, map, null);
        }
    }

    public void a(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be16e63e", new Object[]{this, context, str, map, onClickListener});
        } else {
            a(context, str, map, onClickListener, null);
        }
    }

    public void a(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, com.taobao.android.miniLive.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4864caee", new Object[]{this, context, str, map, onClickListener, aVar});
        } else {
            a(context, str, map, onClickListener, aVar, (d) null);
        }
    }

    public void a(final Context context, final String str, final Map<String, String> map, final View.OnClickListener onClickListener, final com.taobao.android.miniLive.ui.a aVar, final d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3ee0bb", new Object[]{this, context, str, map, onClickListener, aVar, dVar});
        } else if (this.e == MiniLiveState.LiveStatusGlobalWindow || this.e == MiniLiveState.LiveStatusZoomWindow) {
        } else {
            if ((hud.y() && pmb.c) || !pmb.d) {
                return;
            }
            if (pmb.b || pmb.f32756a || !hud.c()) {
                z = false;
            }
            if (!z) {
                return;
            }
            hue.a("TBLiveService", "startMiniLive init");
            if (this.d == null) {
                this.d = new Handler(Looper.getMainLooper());
            }
            this.d.removeCallbacksAndMessages(null);
            com.taobao.android.miniLive.services.d.a().a(new Runnable() { // from class: com.taobao.android.miniLive.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Context context2;
                    String str2;
                    a aVar2;
                    String str3;
                    Map map2;
                    View.OnClickListener onClickListener2;
                    com.taobao.android.miniLive.ui.a aVar3;
                    d dVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!hud.s()) {
                            context2 = Build.VERSION.SDK_INT >= 19 ? hub.a() : hub.d(context);
                            hue.a("TBLiveService", "startMiniLive activity == " + context2);
                            if (context2 == null) {
                                context2 = context;
                                str2 = "startMiniLive context == null ";
                            } else if (context2 != null) {
                                str2 = "startMiniLive context is not root";
                            } else {
                                context2 = context;
                                str2 = "startMiniLive context is activity";
                            }
                        } else {
                            context2 = context;
                            str2 = "startMiniLive context is application";
                        }
                        hue.a("TBLiveService", str2);
                        Context context3 = context2;
                        hue.a("TBLiveService", "threadPool thread " + Thread.currentThread().getName());
                        if (!hud.b(context3)) {
                            return;
                        }
                        if (!hud.s() && !(context3 instanceof Application)) {
                            a.b(a.this, context3, str, map, onClickListener, aVar, dVar);
                            return;
                        }
                        if (!hud.r() || a.a(a.this, context3)) {
                            aVar2 = a.this;
                            str3 = str;
                            map2 = map;
                            onClickListener2 = onClickListener;
                            aVar3 = aVar;
                            dVar2 = dVar;
                        } else {
                            hue.a("TBLiveService", "enablePreCheckPermission preCheckPermission ");
                            long b = hub.b(context3);
                            if (b > 0 && !hub.a(hud.t(), b)) {
                                return;
                            }
                            aVar2 = a.this;
                            str3 = str;
                            map2 = map;
                            onClickListener2 = onClickListener;
                            aVar3 = aVar;
                            dVar2 = dVar;
                        }
                        a.a(aVar2, context3, str3, map2, onClickListener2, aVar3, dVar2);
                    } catch (Exception e) {
                        hue.a("TBLiveService", "threadPool thread e " + e.getLocalizedMessage());
                    }
                }
            });
        }
    }

    public void a(Context context, IMediaPlayer iMediaPlayer, VideoInfo videoInfo, String str, boolean z, boolean z2, Map<String, String> map, ipz ipzVar) {
        Context context2 = context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2aee41", new Object[]{this, context2, iMediaPlayer, videoInfo, str, new Boolean(z), new Boolean(z2), map, ipzVar});
            return;
        }
        hue.a("TBLiveService", "startMiniLive init");
        if (this.e == MiniLiveState.LiveStatusZoomWindow) {
            return;
        }
        if (o.m() && poy.g(n.a()) && poy.h(n.a())) {
            hue.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
        } else if ((iMediaPlayer instanceof com.taobao.taolive.sdk.ui.media.d) && ((com.taobao.taolive.sdk.ui.media.d) iMediaPlayer).F()) {
            hue.a("TBLiveService", "initMiniLiveView isRemoteSoError");
        } else {
            this.e = MiniLiveState.LiveStatusGlobalWindow;
            if ((context2 instanceof Activity) && z2) {
                context2 = context.getApplicationContext();
            }
            Context context3 = context2;
            String str2 = "unknown";
            String str3 = (map == null || map.get(pqq.KEY_LIVE_SOURCE) == null) ? str2 : map.get(pqq.KEY_LIVE_SOURCE);
            if (map != null && map.get("entryLiveSource") != null) {
                str2 = map.get("entryLiveSource");
            }
            if (map != null && map.get("spm") != null) {
                str2 = map.get("spm");
            }
            if (map != null && map.get("trackInfo") != null) {
                str2 = map.get("trackInfo");
            }
            com.taobao.android.miniLive.services.b.a().a(context3, iMediaPlayer, videoInfo, str, null, str3, str2, "unknown", "unknown", (map == null || map.get(aw.PARAM_IS_LIVE_MUTE) == null) ? false : l.d(map.get(aw.PARAM_IS_LIVE_MUTE)), new c() { // from class: com.taobao.android.miniLive.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.miniLive.sdk.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.a(a.this, true);
                    }
                }

                @Override // com.taobao.android.miniLive.sdk.c
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a.a(a.this, false);
                    pmb.f32756a = false;
                    a.a(a.this, MiniLiveState.LiveStatusClosed);
                }

                @Override // com.taobao.android.miniLive.sdk.c
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                        return;
                    }
                    a.a(a.this, false);
                    pmb.f32756a = false;
                    a.a(a.this, MiniLiveState.LiveStatusClosed);
                }
            }, ipzVar);
        }
    }

    public void a(Context context, VideoInfo videoInfo, String str, String str2, Map<String, String> map, ipz ipzVar) {
        Context context2 = context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9541c1", new Object[]{this, context2, videoInfo, str, str2, map, ipzVar});
            return;
        }
        hue.a("TBLiveService", "startMiniLive init");
        if (videoInfo == null) {
            return;
        }
        this.e = MiniLiveState.LiveStatusZoomWindow;
        if (context2 instanceof Activity) {
            context2 = context.getApplicationContext();
        }
        Context context3 = context2;
        htx a2 = e.a().a(context3, videoInfo, str, 1, map);
        a2.a(new IMediaPlayer.d() { // from class: com.taobao.android.miniLive.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                    return;
                }
                if (a.a(a.this) != null) {
                    a.a(a.this).d();
                }
                a.a(a.this, (TBMiniLiveFloatController) null);
                a.a(a.this, MiniLiveState.LiveStatusClosed);
                pmb.f32756a = false;
                a.a(a.this, false);
            }
        });
        a2.a(new IMediaPlayer.e() { // from class: com.taobao.android.miniLive.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (a.a(a.this) != null) {
                    a.a(a.this).a(i);
                }
                if (a.a(a.this) != null) {
                    a.a(a.this).d();
                }
                a.a(a.this, (TBMiniLiveFloatController) null);
                a.a(a.this, MiniLiveState.LiveStatusClosed);
                pmb.f32756a = false;
                a.a(a.this, false);
                return false;
            }
        });
        a2.a(new IMediaPlayer.g() { // from class: com.taobao.android.miniLive.a.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && a.a(a.this) != null) {
                    a.a(a.this).m();
                }
                return false;
            }
        });
        String str3 = (map == null || map.get("triggerMode") == null) ? "ZoomBtn" : map.get("triggerMode");
        String str4 = "unknown";
        String str5 = (map == null || map.get(pqq.KEY_LIVE_SOURCE) == null) ? str4 : map.get(pqq.KEY_LIVE_SOURCE);
        if (map != null && map.get("entryLiveSource") != null) {
            str4 = map.get("entryLiveSource");
        }
        if (map != null && map.get("spm") != null) {
            str4 = map.get("spm");
        }
        if (map != null && map.get("trackInfo") != null) {
            str4 = map.get("trackInfo");
        }
        com.taobao.android.miniLive.services.b.a().a(context3, a2, videoInfo, str, str2, str3, str5, str4, "unknown", "unknown", (map == null || map.get(aw.PARAM_IS_LIVE_MUTE) == null) ? false : l.d(map.get(aw.PARAM_IS_LIVE_MUTE)), new c() { // from class: com.taobao.android.miniLive.a.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.miniLive.sdk.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    a.a(a.this, true);
                }
            }

            @Override // com.taobao.android.miniLive.sdk.c
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                a.a(a.this, false);
                pmb.f32756a = false;
                a.a(a.this, MiniLiveState.LiveStatusClosed);
            }

            @Override // com.taobao.android.miniLive.sdk.c
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                a.a(a.this, false);
                pmb.f32756a = false;
                a.a(a.this, MiniLiveState.LiveStatusClosed);
            }
        }, ipzVar);
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            return tBMiniLiveFloatController.b();
        }
        return com.taobao.android.miniLive.services.b.a().e();
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.a(onClickListener);
        }
        com.taobao.android.miniLive.services.b.a().a(onClickListener);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69a3b5", new Object[]{this, dVar});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.a(dVar);
        }
        com.taobao.android.miniLive.services.b.a().a(dVar);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        hue.a("TBLiveService", "addMiniWindow miniLiveState = " + this.e + " miniLiveFloatController = " + this.c);
        if (this.e == MiniLiveState.LiveStatusZoomWindow) {
            return false;
        }
        pmb.f32756a = true;
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            return tBMiniLiveFloatController.f();
        }
        com.taobao.android.miniLive.services.b.a().b();
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.e == MiniLiveState.LiveStatusZoomWindow) {
            return false;
        }
        com.taobao.android.miniLive.services.b.a().c();
        pmb.f32756a = false;
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController == null) {
            return false;
        }
        return tBMiniLiveFloatController.g();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.e == MiniLiveState.LiveStatusZoomWindow) {
        } else {
            com.taobao.android.miniLive.services.b.a().c();
            this.e = MiniLiveState.LiveStatusClosed;
            this.b = false;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.e == MiniLiveState.LiveStatusGlobalWindow || this.e == MiniLiveState.LiveStatusZoomWindow) {
        } else {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.d();
            }
            com.taobao.android.miniLive.services.b.a().d();
            this.b = false;
            this.e = MiniLiveState.LiveStatusClosed;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        hue.a("TBLiveService", "scrollHideMiniLive init");
        if (this.e == MiniLiveState.LiveStatusGlobalWindow || this.e == MiniLiveState.LiveStatusZoomWindow) {
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.d();
            this.c = null;
        }
        com.taobao.android.miniLive.services.b.a().d();
        this.b = false;
        hue.a("TBLiveService", "scrollHideMiniLive finish");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        hue.a("TBLiveService", "destroyMiniLive init");
        if (this.e == MiniLiveState.LiveStatusGlobalWindow || this.e == MiniLiveState.LiveStatusZoomWindow) {
            return;
        }
        Handler handler = this.d;
        if (handler != null && this.c != null) {
            handler.post(new Runnable() { // from class: com.taobao.android.miniLive.a.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null) {
                    } else {
                        a.a(a.this).d();
                        a.a(a.this, (TBMiniLiveFloatController) null);
                    }
                }
            });
        }
        com.taobao.android.miniLive.services.b.a().d();
        this.e = MiniLiveState.LiveStatusClosed;
        this.b = false;
        hue.a("TBLiveService", "destroyMiniLive finish");
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        hue.a("TBLiveService", "hideMiniLive init");
        if (this.e == MiniLiveState.LiveStatusGlobalWindow || this.e == MiniLiveState.LiveStatusZoomWindow) {
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.d();
            this.c = null;
        }
        com.taobao.android.miniLive.services.b.a().d();
        this.b = false;
        hue.a("TBLiveService", "hideMiniLive finish");
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        hue.a("TBLiveService", "hideAllMiniLive init");
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController != null) {
            tBMiniLiveFloatController.d();
            this.c = null;
        }
        com.taobao.android.miniLive.services.b.a().d();
        this.b = false;
        hue.a("TBLiveService", "hideAllMiniLive finish");
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        hue.a("TBLiveService", "destroyGlobalMiniWindow init");
        if (pmb.f32756a || this.b) {
            TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
            if (tBMiniLiveFloatController != null) {
                tBMiniLiveFloatController.d();
            }
            com.taobao.android.miniLive.services.b.a().d();
            this.c = null;
            this.e = MiniLiveState.LiveStatusClosed;
        }
        this.b = false;
        pmb.f32756a = false;
        hue.a("TBLiveService", "destroyGlobalMiniWindow finish");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            int intValue = StringUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue();
            if (!StringUtils.isEmpty(str2)) {
                i = Integer.valueOf(str2).intValue();
            }
            this.c.a(intValue, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        return tBMiniLiveFloatController != null && tBMiniLiveFloatController.h();
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        return tBMiniLiveFloatController == null ? "" : tBMiniLiveFloatController.i();
    }

    private void b(final Context context, final String str, final Map<String, String> map, final View.OnClickListener onClickListener, final com.taobao.android.miniLive.ui.a aVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce688d5a", new Object[]{this, context, str, map, onClickListener, aVar, dVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                if (Settings.canDrawOverlays(context)) {
                    d(context, str, map, onClickListener, aVar, dVar);
                    return;
                }
                final String a2 = huc.a(map, "bizCode");
                com.taobao.taolive.sdk.permisson.a.b(context, new a.InterfaceC0910a() { // from class: com.taobao.android.miniLive.a.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        a.b(a.this, context, str, map, onClickListener, aVar, dVar);
                        HashMap hashMap = new HashMap();
                        if (pmd.a().q() != null) {
                            hashMap.put("userId", pmd.a().q().a());
                        }
                        huf.a(a2, "Grant_Permission", hashMap);
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            hub.b(context, a2);
                        }
                    }
                });
                return;
            }
            d(context, str, map, onClickListener, aVar, dVar);
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        return Settings.canDrawOverlays(context);
    }

    private void c(final Context context, final String str, final Map<String, String> map, final View.OnClickListener onClickListener, final com.taobao.android.miniLive.ui.a aVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9239f9", new Object[]{this, context, str, map, onClickListener, aVar, dVar});
            return;
        }
        Handler handler = this.d;
        if (handler == null || context == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.taobao.android.miniLive.a.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.c(a.this, context, str, map, onClickListener, aVar, dVar);
                hue.a("TBLiveService", "doCheckPermission liveId = " + str);
            }
        });
    }

    private boolean a(String str) {
        TBMiniLiveFloatController tBMiniLiveFloatController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (hud.i() && (tBMiniLiveFloatController = this.c) != null) {
            TBMiniLiveFloatController.ControllerStatus j = tBMiniLiveFloatController.j();
            if (j != TBMiniLiveFloatController.ControllerStatus.error && j != TBMiniLiveFloatController.ControllerStatus.destroy) {
                return true;
            }
            i();
        }
        return false;
    }

    private void d(Context context, String str, Map<String, String> map, View.OnClickListener onClickListener, com.taobao.android.miniLive.ui.a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbbe698", new Object[]{this, context, str, map, onClickListener, aVar, dVar});
        } else if (this.b || map == null || StringUtils.isEmpty(str)) {
            hue.a("TBLiveService", "internalStartMiniLive condition was not satisfied");
        } else {
            hue.a("TBLiveService", "isShowFloatWindow = " + this.b);
            String a2 = huc.a(map, "bizCode");
            String a3 = huc.a(map, "algParams");
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            if (a(str)) {
                hue.a("TBLiveService", "internalStartMiniLive checkMiniLiveFloatControllerStatus return");
                return;
            }
            if (this.c == null) {
                this.e = MiniLiveState.LiveStatusSmallWindow;
                this.c = new TBMiniLiveFloatController(context, str, a2, a3, com.taobao.android.weex_framework.util.a.ATOM_EXT_window, map);
                this.c.a(new c() { // from class: com.taobao.android.miniLive.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.miniLive.sdk.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        a.a(a.this, true);
                        a.a(a.this, MiniLiveState.LiveStatusSmallWindow);
                    }

                    @Override // com.taobao.android.miniLive.sdk.c
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            return;
                        }
                        a.a(a.this, false);
                        a.a(a.this, MiniLiveState.LiveStatusHidden);
                    }

                    @Override // com.taobao.android.miniLive.sdk.c
                    public void c() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                            return;
                        }
                        a.a(a.this, false);
                        a.a(a.this, MiniLiveState.LiveStatusSmallWindow);
                    }
                });
                hue.a("TBLiveService", "internalStartMiniLive");
            } else {
                if (this.e == MiniLiveState.LiveStatusClosed) {
                    this.c.a(context, str, a2, a3, com.taobao.android.weex_framework.util.a.ATOM_EXT_window, map);
                } else if (this.e == MiniLiveState.LiveStatusSmallWindow) {
                    this.c.a(context, str, a2, a3, com.taobao.android.weex_framework.util.a.ATOM_EXT_window, map);
                }
                hue.a("TBLiveService", "internalStartMiniLive  miniLiveState = " + this.e);
            }
            a(context, map, onClickListener);
            a(aVar);
            b(dVar);
        }
    }

    private void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976a9af6", new Object[]{this, dVar});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController == null) {
            return;
        }
        tBMiniLiveFloatController.a(dVar);
    }

    private void a(com.taobao.android.miniLive.ui.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce684698", new Object[]{this, aVar});
            return;
        }
        TBMiniLiveFloatController tBMiniLiveFloatController = this.c;
        if (tBMiniLiveFloatController == null) {
            return;
        }
        tBMiniLiveFloatController.a(aVar);
    }

    private void a(Context context, Map<String, String> map, View.OnClickListener onClickListener) {
        TBMiniLiveFloatController tBMiniLiveFloatController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316edaf4", new Object[]{this, context, map, onClickListener});
        } else if (!hud.D() || (tBMiniLiveFloatController = this.c) == null) {
        } else {
            tBMiniLiveFloatController.a(onClickListener);
        }
    }
}
