package com.taobao.android.miniLive.smallwindow;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.android.miniLive.ui.b;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.htx;
import tb.hud;
import tb.hue;
import tb.ipz;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes6.dex */
public class b extends a implements TBMiniLiveFloatingVideoView.a, VolumeChangeHelper.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a */
    private static final String f14367a;
    private com.taobao.taolive.sdk.playcontrol.observe.a b;
    private TBMiniLiveFloatingVideoView c;
    private WindowManager e;
    private VideoInfo g;
    private String h;
    private String i;
    private WindowManager.LayoutParams k;
    private VolumeChangeHelper m;
    private String n;
    private String o;
    private float p;
    private float q;
    private com.taobao.android.miniLive.ui.a r;
    private com.taobao.android.miniLive.sdk.c s;
    private String u;
    private d v;
    private boolean y;
    private boolean j = false;
    private TBMiniLiveFloatController.ControllerStatus l = TBMiniLiveFloatController.ControllerStatus.loading;
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.smallwindow.InitiativeSmallWindowController$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            hue.a(b.h(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (!StringUtils.isEmpty(action) && action.equals("com.taobao.avplayer.start")) {
                if (booleanExtra) {
                    return;
                }
                b.this.a("dismiss");
                if (b.a(b.this) == null) {
                    return;
                }
                b.a(b.this).b();
            } else if (!StringUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                b.this.a("dismiss");
                if (b.a(b.this) == null) {
                    return;
                }
                b.a(b.this).b();
            } else if (StringUtils.isEmpty(action) || !action.equals(com.taobao.taolive.sdk.playcontrol.d.ON_LIVE_CARD_START_ACTION)) {
            } else {
                if (!"ShopSampleCard".equals(intent.getStringExtra("SubBusinessType")) && booleanExtra) {
                    return;
                }
                b.this.a("dismiss");
                if (b.a(b.this) == null) {
                    return;
                }
                b.a(b.this).b();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -207205326) {
            super.a((String) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: lambda$YBDPB3Ds0xeAYPnC7-hHdS0g2sI */
    public static /* synthetic */ void m1004lambda$YBDPB3Ds0xeAYPnC7hHdS0g2sI(b bVar, View view) {
        bVar.b(view);
    }

    /* renamed from: lambda$eLOaeCIPKqzF_tfXlhFK0-fHDR8 */
    public static /* synthetic */ void m1005lambda$eLOaeCIPKqzF_tfXlhFK0fHDR8(b bVar, View view) {
        bVar.a(view);
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.android.miniLive.sdk.c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.miniLive.sdk.c) ipChange.ipc$dispatch("f5be5724", new Object[]{bVar}) : bVar.s;
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : f14367a;
    }

    static {
        kge.a(-133952810);
        kge.a(-1433364322);
        kge.a(533419569);
        f14367a = b.class.getSimpleName();
    }

    public b(Context context, IMediaPlayer iMediaPlayer, final VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, ipz ipzVar, boolean z) {
        String str6 = f14367a;
        hue.a(str6, "Constructor isLiveMute = " + z);
        this.z = ipzVar;
        this.u = str3;
        this.v = new d(this.u);
        a(videoInfo, str3, str4, str5);
        this.b = new com.taobao.taolive.sdk.playcontrol.observe.a(videoInfo != null ? videoInfo.liveId : "");
        if (this.f instanceof htx) {
            ((htx) this.f).a(this.b);
        }
        this.e = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.c = new TBMiniLiveFloatingVideoView(context, str, str2);
        this.c.setCloseBtnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$b$eLOaeCIPKqzF_tfXlhFK0-fHDR8
            {
                b.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.m1005lambda$eLOaeCIPKqzF_tfXlhFK0fHDR8(b.this, view);
            }
        });
        this.c.setFloatingVideoViewLifeCycleCallback(this);
        this.c.setOnViewClickListener(new TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener() { // from class: com.taobao.android.miniLive.smallwindow.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    b.this.a(view, videoInfo);
                }
            }
        });
        this.f = iMediaPlayer;
        this.t = context;
        this.g = videoInfo;
        VideoInfo videoInfo2 = this.g;
        if (videoInfo2 != null) {
            this.n = videoInfo2.liveId;
        }
        this.h = str;
        this.i = str2;
        boolean z2 = videoInfo != null ? videoInfo.landScape : false;
        b.a e = new b.a().a(str).d(false).e(false);
        e.b(hud.l());
        this.c.setTbLiveConfig(e.a());
        if (this.f != null) {
            this.f.a(z);
        }
        this.c.init(context, null, this.f, b(z2), z2, z);
        VideoInfo videoInfo3 = this.g;
        if (videoInfo3 != null) {
            this.c.setVideoCover(videoInfo3.coverImg);
        }
        a(context);
        k();
        d dVar = this.v;
        if (dVar != null) {
            dVar.a(this.f);
            this.v.a(this.d);
        }
    }

    public /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        d dVar = this.v;
        if (dVar != null) {
            z = dVar.d();
        }
        if (z) {
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
            if (tBMiniLiveFloatingVideoView == null) {
                return;
            }
            tBMiniLiveFloatingVideoView.showCloseSwitchTips(new View.OnClickListener() { // from class: com.taobao.android.miniLive.smallwindow.-$$Lambda$b$YBDPB3Ds0xeAYPnC7-hHdS0g2sI
                {
                    b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    b.m1004lambda$YBDPB3Ds0xeAYPnC7hHdS0g2sI(b.this, view2);
                }
            });
            if (this.d == null) {
                return;
            }
            this.d.d(this.f);
            return;
        }
        if (this.d != null) {
            this.d.b(this.f);
        }
        a("close");
        if (this.r != null) {
            this.r.a(new HashMap());
        }
        com.taobao.android.miniLive.sdk.c cVar = this.s;
        if (cVar != null) {
            cVar.b();
        }
        com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
        ddw.a().a("com.taobao.taolive.room.float_view_close", null, a2 != null ? a2.G() : null);
    }

    public /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        if (this.d != null) {
            this.d.b(this.f);
        }
        a("close");
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        hue.a(f14367a, "addMiniView");
        if (this.j) {
            return true;
        }
        this.j = true;
        if (this.e != null && this.l != TBMiniLiveFloatController.ControllerStatus.destroy) {
            try {
                this.e.addView(this.c, this.k);
                if (this.s != null) {
                    this.s.a();
                }
                if (com.taobao.taolive.sdk.ui.media.mute.b.a(null)) {
                    this.m = new VolumeChangeHelper();
                    this.m.a(this);
                }
                g();
                if (this.d != null) {
                    this.d.h(com.taobao.taolive.sdk.ui.media.mute.b.b(null) ? "close" : "open");
                }
                if (this.v != null) {
                    this.v.a();
                }
                l();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public void a(String str) {
        VolumeChangeHelper volumeChangeHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.a(str);
        String str2 = f14367a;
        hue.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.h + " isAdded " + this.j);
        if (!this.j) {
            return;
        }
        this.l = TBMiniLiveFloatController.ControllerStatus.destroy;
        this.v.c();
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
        if (tBMiniLiveFloatingVideoView != null) {
            if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            this.c.removeAllViews();
            this.c.setVisibility(8);
            this.c.destroy();
        }
        b(str);
        if (com.taobao.taolive.sdk.ui.media.mute.b.a(null) && (volumeChangeHelper = this.m) != null) {
            volumeChangeHelper.c();
            this.m = null;
        }
        if (this.f != null) {
            this.f.o();
            this.f.c();
            this.f = null;
            com.taobao.android.miniLive.services.e.a().g();
        }
        if (this.d != null) {
            this.d.a();
        }
        m();
        f();
        if (this.t != null) {
            this.t.getApplicationContext().unregisterReceiver(this.x);
        }
        this.j = false;
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a("dismiss");
        }
    }

    public void a(com.taobao.android.miniLive.sdk.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a13a5c4", new Object[]{this, cVar});
        } else {
            this.s = cVar;
        }
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.B = onClickListener;
        }
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
        if (tBMiniLiveFloatingVideoView == null) {
            return null;
        }
        return tBMiniLiveFloatingVideoView;
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d != null) {
            this.d.a(z);
        }
        if (this.A == null) {
            return;
        }
        this.A.a(z);
    }

    @Override // com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (StringUtils.equals(this.h, "liveroom") || !com.taobao.taolive.sdk.ui.media.mute.b.a(null) || this.f == null || !this.f.x()) {
        } else {
            this.f.a(false);
            String str = f14367a;
            hue.a(str, "onVolumeChanged mediaPlayer = " + this.f);
            com.taobao.taolive.sdk.ui.media.mute.b.a(null, false);
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
            if (tBMiniLiveFloatingVideoView == null) {
                return;
            }
            tBMiniLiveFloatingVideoView.updateMuteView(false);
        }
    }

    private WindowManager.LayoutParams b(boolean z) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("6382f41b", new Object[]{this, new Boolean(z)});
        }
        this.k = new WindowManager.LayoutParams();
        if (hud.s() || (this.t instanceof Application)) {
            if (i()) {
                this.k.type = 2038;
            } else if (j()) {
                this.k.type = 2003;
            } else {
                this.k.type = 2005;
            }
        }
        WindowManager.LayoutParams layoutParams = this.k;
        layoutParams.format = 1;
        layoutParams.flags = layoutParams.flags | 262144 | 32 | 8;
        if (hud.G()) {
            this.k.flags |= 128;
        }
        int b = com.taobao.taolive.sdk.utils.b.b(this.t);
        int c = com.taobao.taolive.sdk.utils.b.c(this.t);
        int a4 = com.taobao.taolive.sdk.utils.b.a(this.t, 12.0f);
        int a5 = com.taobao.taolive.sdk.utils.b.a(this.t, 84.0f);
        if (StringUtils.equals(this.h, "liveroom") || StringUtils.equals(this.h, "zoom")) {
            a4 += (hud.v() * com.taobao.taolive.sdk.utils.b.c(this.t)) / 750;
            a5 += (hud.w() * com.taobao.taolive.sdk.utils.b.c(this.t)) / 750;
        }
        this.k.gravity = 51;
        if (hud.c(this.h)) {
            if (z) {
                a2 = com.taobao.taolive.sdk.utils.b.a(this.t, 175.0f);
                a3 = com.taobao.taolive.sdk.utils.b.a(this.t, 130.0f);
            } else {
                a2 = com.taobao.taolive.sdk.utils.b.a(this.t, 129.0f);
                a3 = com.taobao.taolive.sdk.utils.b.a(this.t, 228.0f);
            }
        } else if (z) {
            a2 = com.taobao.taolive.sdk.utils.b.a(this.t, 160.0f);
            a3 = com.taobao.taolive.sdk.utils.b.a(this.t, 94.0f);
        } else {
            a2 = com.taobao.taolive.sdk.utils.b.a(this.t, 96.0f);
            a3 = com.taobao.taolive.sdk.utils.b.a(this.t, 173.0f);
        }
        WindowManager.LayoutParams layoutParams2 = this.k;
        layoutParams2.width = a2;
        layoutParams2.height = a3;
        if (StringUtils.equals("top-left", this.o)) {
            this.k.x = (int) Math.max(b * this.p, a4);
            this.k.y = (int) Math.max(c * this.q, a5);
        } else if (StringUtils.equals("top-right", this.o)) {
            WindowManager.LayoutParams layoutParams3 = this.k;
            layoutParams3.x = (b - layoutParams3.width) - ((int) Math.max(b * this.p, a4));
            this.k.y = (int) Math.max(c * this.q, a5);
        } else if (StringUtils.equals("bottom-left", this.o)) {
            this.k.x = (int) Math.max(b * this.p, a4);
            WindowManager.LayoutParams layoutParams4 = this.k;
            layoutParams4.y = (c - layoutParams4.height) - ((int) Math.max(c * this.q, a5));
        } else if (StringUtils.equals("bottom-right", this.o)) {
            WindowManager.LayoutParams layoutParams5 = this.k;
            layoutParams5.x = (b - layoutParams5.width) - ((int) Math.max(b * this.p, a4));
            WindowManager.LayoutParams layoutParams6 = this.k;
            layoutParams6.y = (c - layoutParams6.height) - ((int) Math.max(c * this.q, a5));
        } else {
            WindowManager.LayoutParams layoutParams7 = this.k;
            layoutParams7.x = (b - layoutParams7.width) - a4;
            WindowManager.LayoutParams layoutParams8 = this.k;
            layoutParams8.y = (c - layoutParams8.height) - a5;
        }
        return this.k;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.taolive.start");
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction(com.taobao.taolive.sdk.playcontrol.d.ON_LIVE_CARD_START_ACTION);
            context.getApplicationContext().registerReceiver(this.x, intentFilter);
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return ContextCompat.checkSelfPermission(this.t.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0 && Build.VERSION.SDK_INT < 19;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.y) {
        } else {
            this.y = false;
            hue.a(f14367a, "onWindowRemoved");
            com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.b;
            if (aVar != null) {
                aVar.d();
            }
            this.B = null;
            this.r = null;
            this.A = null;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.y) {
        } else {
            this.y = true;
            hue.a(f14367a, "onWindowAdded");
            com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(this.n);
            this.b.c("MiniLive");
            this.b.b(this.h);
            this.b.a();
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.f == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", "smallWindow");
            this.f.a((Map<String, String>) hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "1");
            this.f.a((Map<String, String>) hashMap2);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (pmd.a().m() != null) {
            pnj m = pmd.a().m();
            m.a("updatePlayExValue", "updateExpParamsWhenQuit type = " + str);
        }
        if (this.f == null) {
            return;
        }
        if (StringUtils.equals(this.h, "liveroom") || StringUtils.equals(str, "liveroom")) {
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", "liveRoom");
            this.f.a((Map<String, String>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("enterFloating", "0");
        this.f.a((Map<String, String>) hashMap2);
    }

    private void a(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f9d83", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        this.d = new e();
        if ("SideSlip".equals(str)) {
            this.d.a("slide");
        } else if ("KeyBackDown".equals(str)) {
            this.d.a("close");
        } else {
            this.d.a("zoom");
        }
        e eVar = this.d;
        eVar.b("InitiativeSmallWindowController_" + System.currentTimeMillis());
        if (videoInfo == null) {
            return;
        }
        this.d.c(videoInfo.liveId);
        if (videoInfo.broadCaster != null) {
            this.d.d(videoInfo.broadCaster.accountId);
        }
        this.d.e(str2);
        this.d.f(String.valueOf(videoInfo.status));
        this.d.g(str3);
    }
}
