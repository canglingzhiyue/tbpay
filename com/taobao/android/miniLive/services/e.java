package com.taobao.android.miniLive.services;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.f;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.l;
import com.uc.webview.export.media.CommandID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.htx;
import tb.hue;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pnk;
import tb.ppr;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14353a;
    private static e b;
    private WindowManager.LayoutParams c;
    private htx d;
    private String e;
    private TelephonyManager i;
    private PhoneStateListener n;
    private boolean f = false;
    private ArrayList<ppr> g = new ArrayList<>();
    private boolean h = false;
    private boolean j = false;
    private VideoStatus k = VideoStatus.VIDEO_NORMAL_STATUS;
    private boolean l = false;
    private int m = -2;

    public static /* synthetic */ htx a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htx) ipChange.ipc$dispatch("97493bd0", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5539d00e", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.j = z;
        return z;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bd4268f", new Object[]{eVar})).booleanValue() : eVar.j;
    }

    public static /* synthetic */ ArrayList c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("fccee6", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f14353a;
    }

    static {
        kge.a(1995587587);
        f14353a = e.class.getSimpleName();
    }

    private e() {
        Application b2 = f.a().b();
        if (b2 == null) {
            return;
        }
        this.i = (TelephonyManager) b2.getSystemService("phone");
        this.n = new PhoneStateListener() { // from class: com.taobao.android.miniLive.services.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1198008378) {
                    super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
                } else if (e.a(e.this) == null) {
                } else {
                    String d = e.d();
                    hue.a(d, "mPhoneStateListener state " + i);
                    if (i != 0) {
                        if ((i == 1 || i == 2) && e.a(e.this).l()) {
                            e.a(e.this).i();
                            e.a(e.this, true);
                        }
                    } else if (!e.a(e.this).l() && e.b(e.this)) {
                        e.a(e.this).g();
                        e.a(e.this, false);
                    }
                    super.onCallStateChanged(i, str);
                }
            }
        };
        try {
            this.i.listen(this.n, 32);
        } catch (Exception unused) {
        }
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ad1b2d0", new Object[0]);
        }
        if (b == null) {
            b = new e();
        }
        return b;
    }

    public VideoStatus b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoStatus) ipChange.ipc$dispatch("200bf3d6", new Object[]{this}) : this.k;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        hue.a(f14353a, "TaoLiveVideoViewManager pause");
        htx htxVar = this.d;
        if (htxVar == null) {
            return;
        }
        htxVar.i();
    }

    public htx a(Context context, VideoInfo videoInfo, String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            return (htx) ipChange.ipc$dispatch("96c6d1e1", new Object[]{this, context, videoInfo, str, new Integer(i), map});
        }
        htx a2 = a(context, str, i);
        if (map != null && map.containsKey(aw.PARAM_PLAY_URL)) {
            a2.a((MediaData) null, map.get(aw.PARAM_PLAY_URL));
            a2.c(l.d(map.get("loop")));
            a2.e(l.a(map.get(CommandID.seekTo), 0));
        } else {
            a2.a(com.taobao.taolive.sdk.model.common.a.a(videoInfo), (String) null);
            if (videoInfo != null) {
                if (!"2".equals(videoInfo.roomStatus)) {
                    i2 = 0;
                }
                a2.d(i2);
            }
        }
        a2.b(videoInfo.pushFeature);
        a2.b(false);
        a2.e(com.taobao.android.miniLive.model.c.b());
        a2.d(com.taobao.android.miniLive.model.c.c());
        a2.f(com.taobao.android.miniLive.model.c.a());
        if (com.taobao.taolive.sdk.ui.media.mute.b.a(null)) {
            if ("zoom".equals(str)) {
                if (com.taobao.taolive.sdk.ui.media.mute.b.b(null)) {
                    a2.a(true);
                } else {
                    a2.a(false);
                }
            } else {
                a2.a(false);
            }
        } else {
            a2.a(false);
        }
        a2.g();
        return a2;
    }

    public htx a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htx) ipChange.ipc$dispatch("af7ee1", new Object[]{this, context, str, new Integer(i)});
        }
        if (!StringUtils.isEmpty(str)) {
            this.e = str;
        }
        this.m = i;
        return a(context);
    }

    private htx a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htx) ipChange.ipc$dispatch("34c44eba", new Object[]{this, context});
        }
        if (this.d == null) {
            b(context);
        }
        ViewGroup viewGroup = (ViewGroup) this.d.a().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.d.a());
        }
        return this.d;
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.d = new htx();
        this.d.a(context);
        this.d.b(2);
        pnk q = pmd.a().q();
        if (q != null) {
            this.d.e(q.a());
        }
        if (!StringUtils.isEmpty(this.e)) {
            this.d.d(this.e);
        }
        htx htxVar = this.d;
        htxVar.c("deviceLevel:" + this.m);
        this.d.a().setBackgroundColor(context.getResources().getColor(R.color.minilive_text_color_gray));
        this.d.a(new IMediaPlayer.i() { // from class: com.taobao.android.miniLive.services.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
            public void onPrepared(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onPrepared");
                if (e.c(e.this) == null || e.c(e.this).size() <= 0) {
                    return;
                }
                Iterator it = e.c(e.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b();
                }
            }
        });
        this.d.a(new IMediaPlayer.e() { // from class: com.taobao.android.miniLive.services.e.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "mediaPlayer: onError what---" + i + "  extra---" + i2);
                if (e.c(e.this) != null && e.c(e.this).size() > 0) {
                    for (int i3 = 0; i3 < e.c(e.this).size(); i3++) {
                        ((ppr) e.c(e.this).get(i3)).a(iMediaPlayer, i, i2);
                    }
                }
                return false;
            }
        });
        this.d.a(new IMediaPlayer.g() { // from class: com.taobao.android.miniLive.services.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                pnj m = pmd.a().m();
                m.c(pnj.LOG_TAG, "mediaPlayer: onInfo what---" + j + "  extra---" + j2);
                if (e.c(e.this) != null && e.c(e.this).size() > 0) {
                    Iterator it = e.c(e.this).iterator();
                    while (it.hasNext()) {
                        ((ppr) it.next()).a(iMediaPlayer, j, j2, obj);
                    }
                }
                return false;
            }
        });
        this.d.a(new IMediaPlayer.d() { // from class: com.taobao.android.miniLive.services.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onCompletion");
                if (e.c(e.this) == null || e.c(e.this).size() <= 0) {
                    return;
                }
                for (int i = 0; i < e.c(e.this).size(); i++) {
                    ((ppr) e.c(e.this).get(i)).c(iMediaPlayer);
                }
            }
        });
        this.d.a(new IMediaPlayer.j() { // from class: com.taobao.android.miniLive.services.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onStart");
                if (e.c(e.this) == null || e.c(e.this).size() <= 0) {
                    return;
                }
                Iterator it = e.c(e.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).a(iMediaPlayer);
                }
            }
        });
        this.d.a(new IMediaPlayer.h() { // from class: com.taobao.android.miniLive.services.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                    return;
                }
                pmd.a().m().c(pnj.LOG_TAG, "mediaPlayer: onPause");
                if (e.c(e.this) == null || e.c(e.this).size() <= 0) {
                    return;
                }
                Iterator it = e.c(e.this).iterator();
                while (it.hasNext()) {
                    ((ppr) it.next()).b(iMediaPlayer);
                }
            }
        });
        this.d.a(new AudioManager.OnAudioFocusChangeListener() { // from class: com.taobao.android.miniLive.services.e.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
                } else if (i == -3) {
                } else {
                    if (i != -2 && i != -1) {
                        if (i != 1) {
                        }
                    } else if (pmd.a().a("closeBgVideoPlay")) {
                    } else {
                        hue.a(e.d(), "mTaoVideoView FUNCTION_CLOSE_VIDEO_BACKGROUND_PLAY ");
                        e.this.c();
                    }
                }
            }
        });
    }

    public void a(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa12cf26", new Object[]{this, pprVar});
            return;
        }
        ArrayList<ppr> arrayList = this.g;
        if (arrayList == null || pprVar == null || arrayList.contains(pprVar)) {
            return;
        }
        this.g.add(pprVar);
    }

    public void b(ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e895d5a7", new Object[]{this, pprVar});
            return;
        }
        ArrayList<ppr> arrayList = this.g;
        if (arrayList == null || pprVar == null || !arrayList.contains(pprVar)) {
            return;
        }
        this.g.remove(pprVar);
    }

    public htx f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htx) ipChange.ipc$dispatch("357de88d", new Object[]{this}) : this.d;
    }

    public void g() {
        PhoneStateListener phoneStateListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.k = VideoStatus.VIDEO_NORMAL_STATUS;
        TelephonyManager telephonyManager = this.i;
        if (telephonyManager != null && (phoneStateListener = this.n) != null) {
            telephonyManager.listen(phoneStateListener, 0);
            this.i = null;
            this.n = null;
        }
        htx htxVar = this.d;
        if (htxVar != null) {
            htxVar.o();
            this.d.c();
            this.d = null;
        }
        ArrayList<ppr> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
            this.g = null;
        }
        this.c = null;
        b = null;
        this.h = false;
        this.f = false;
        this.e = null;
        this.l = false;
    }
}
