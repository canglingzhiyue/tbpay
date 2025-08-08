package com.taobao.android.miniLive.smallwindow;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.android.miniLive.ui.b;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.o;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.htx;
import tb.hud;
import tb.hue;
import tb.huf;
import tb.ipz;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.poy;

/* loaded from: classes6.dex */
public class c extends a implements TBMiniLiveFloatingVideoView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a */
    private static final String f14369a;
    private com.taobao.taolive.sdk.playcontrol.observe.a b;
    private TBMiniLiveFloatingVideoView c;
    private WindowManager e;
    private VideoInfo g;
    private String h;
    private String i;
    private WindowManager.LayoutParams k;
    private long m;
    private String n;
    private String o;
    private float p;
    private float q;
    private com.taobao.android.miniLive.ui.a r;
    private com.taobao.android.miniLive.sdk.c s;
    private boolean w;
    private boolean j = false;
    private TBMiniLiveFloatController.ControllerStatus l = TBMiniLiveFloatController.ControllerStatus.loading;
    private BroadcastReceiver v = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.smallwindow.PassiveSmallWindowController$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            hue.a(c.g(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (!StringUtils.isEmpty(action) && action.equals("com.taobao.avplayer.start")) {
                if (booleanExtra) {
                    return;
                }
                c.this.a("dismiss");
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).b();
            } else if (!StringUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                c.this.a("dismiss");
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).b();
            } else if (StringUtils.isEmpty(action) || !action.equals(com.taobao.taolive.sdk.playcontrol.d.ON_LIVE_CARD_START_ACTION)) {
            } else {
                String stringExtra = intent.getStringExtra("SubBusinessType");
                if (!"TimeMovingPlay".equals(stringExtra) && !"ShopSampleCard".equals(stringExtra) && booleanExtra) {
                    return;
                }
                c.this.a("dismiss");
                if (c.a(c.this) == null) {
                    return;
                }
                c.a(c.this).b();
            }
        }
    };

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -207205326) {
            super.a((String) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.android.miniLive.sdk.c a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.miniLive.sdk.c) ipChange.ipc$dispatch("5710f3c3", new Object[]{cVar}) : cVar.s;
    }

    public static /* synthetic */ com.taobao.android.miniLive.ui.a b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.miniLive.ui.a) ipChange.ipc$dispatch("a1556b00", new Object[]{cVar}) : cVar.r;
    }

    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : f14369a;
    }

    static {
        kge.a(-591015523);
        kge.a(-1433364322);
        f14369a = TBMiniLiveFloatController.class.getSimpleName();
    }

    public c(Context context, IMediaPlayer iMediaPlayer, final VideoInfo videoInfo, String str, String str2, String str3, String str4, ipz ipzVar, boolean z) {
        String str5 = f14369a;
        hue.a(str5, "Constructor isLiveMute = " + z);
        this.b = new com.taobao.taolive.sdk.playcontrol.observe.a(videoInfo != null ? videoInfo.liveId : "");
        this.z = ipzVar;
        a(videoInfo, str3, str4);
        if (this.f instanceof htx) {
            ((htx) this.f).a(this.b);
        }
        this.e = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.c = new TBMiniLiveFloatingVideoView(context, str, str2);
        this.c.setCloseBtnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.smallwindow.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c cVar;
                String str6;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (c.this.d != null) {
                    c.this.d.b(c.this.f);
                }
                if (c.b(c.this) != null) {
                    c.b(c.this).a(new HashMap());
                }
                if (poy.g(n.a())) {
                    cVar = c.this;
                    str6 = "halfGoodDetail";
                } else {
                    cVar = c.this;
                    str6 = "close";
                }
                cVar.a(str6);
                if (c.a(c.this) != null) {
                    c.a(c.this).b();
                }
                com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
                ddw.a().a("com.taobao.taolive.room.float_view_close", null, a2 != null ? a2.G() : null);
            }
        });
        this.c.setFloatingVideoViewLifeCycleCallback(this);
        this.c.setOnViewClickListener(new TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener() { // from class: com.taobao.android.miniLive.smallwindow.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    c.this.a(view, videoInfo);
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
        this.c.init(context, null, this.f, b(z2), z2, z);
        a(context);
        i();
        this.z = ipzVar;
    }

    @Override // com.taobao.android.miniLive.smallwindow.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (n.a() != null && o.m() && poy.g(n.a()) && poy.h(n.a())) {
            hue.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
            return false;
        } else if (this.j) {
            return true;
        } else {
            this.j = true;
            if (this.e != null && this.l != TBMiniLiveFloatController.ControllerStatus.destroy) {
                try {
                    this.m = SystemClock.uptimeMillis();
                    this.e.addView(this.c, this.k);
                    l();
                    f();
                    if (this.s != null) {
                        this.s.a();
                    }
                    if (this.d != null) {
                        this.d.h(com.taobao.taolive.sdk.ui.media.mute.b.b(null) ? "close" : "open");
                    }
                    hue.a(f14369a, "addMiniView");
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
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

    @Override // com.taobao.android.miniLive.smallwindow.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.a(str);
        String str2 = f14369a;
        hue.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.h + " isAdded " + this.j);
        if (!this.j) {
            return;
        }
        this.l = TBMiniLiveFloatController.ControllerStatus.destroy;
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
        if (tBMiniLiveFloatingVideoView != null) {
            if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            this.c.removeAllViews();
            this.c.setVisibility(8);
            this.c.destroy();
        }
        m();
        b(str);
        c(str);
        if (StringUtils.equals("halfGoodDetail", str)) {
            h();
            return;
        }
        if (this.f != null && !StringUtils.equals(str, "liveroom")) {
            this.f.i();
        }
        if (this.d != null) {
            this.d.a();
        }
        e();
        try {
            if (this.t != null) {
                this.t.getApplicationContext().unregisterReceiver(this.v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.j = false;
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
            context.getApplicationContext().registerReceiver(this.v, intentFilter);
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
            if (j()) {
                this.k.type = 2038;
            } else if (k()) {
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

    private void h() {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.c;
        if (tBMiniLiveFloatingVideoView != null && (parent = tBMiniLiveFloatingVideoView.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.c);
        }
        WindowManager windowManager = this.e;
        if (windowManager != null) {
            windowManager.removeView(this.c);
        }
        e();
        ddw.a().a("com.taobao.taolive.room.float_view_add_to_live_room", null);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.w) {
        } else {
            this.w = false;
            hue.a("TBMiniLiveFloatController", "onWindowRemoved");
            this.f.q(false);
            com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.b;
            if (aVar != null) {
                aVar.d();
            }
            this.B = null;
            this.r = null;
            this.A = null;
            if (this.d == null) {
                return;
            }
            this.d.a();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.w) {
        } else {
            this.w = true;
            hue.a("TBMiniLiveFloatController", "onWindowAdded");
            this.f.q(true);
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

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (pmd.a().q() != null) {
            hashMap.put("userId", pmd.a().q().a());
        }
        if (this.m <= 0) {
            return;
        }
        hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.m)) / 1000.0f));
        hashMap.put("type", str);
        if (!StringUtils.isEmpty(this.i)) {
            hashMap.put("algParams", this.i);
        }
        huf.a(this.h, "FloatWindowExposure", hashMap);
        this.m = 0L;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
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

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
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

    private void a(VideoInfo videoInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ab1ff9", new Object[]{this, videoInfo, str, str2});
            return;
        }
        this.d = new e();
        this.d.a("pocket");
        e eVar = this.d;
        eVar.b("PassiveSmallWindowController_" + System.currentTimeMillis());
        if (videoInfo == null) {
            return;
        }
        this.d.c(videoInfo.liveId);
        if (videoInfo.broadCaster != null) {
            this.d.d(videoInfo.broadCaster.accountId);
        }
        this.d.e(str);
        this.d.f(String.valueOf(videoInfo.status));
        this.d.g(str2);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return ContextCompat.checkSelfPermission(this.t.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0 && Build.VERSION.SDK_INT < 19;
    }
}
