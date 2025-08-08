package com.taobao.android.miniLive.ui;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.android.miniLive.services.a;
import com.taobao.android.miniLive.smallwindow.e;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.d;
import com.taobao.taolive.sdk.ui.media.g;
import com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.o;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.htx;
import tb.hud;
import tb.hue;
import tb.huf;
import tb.kge;
import tb.obw;
import tb.pmd;
import tb.pnj;
import tb.poy;
import tb.pqj;

/* loaded from: classes6.dex */
public class TBMiniLiveFloatController implements TBMiniLiveFloatingVideoView.a, a.InterfaceC0554a, VolumeChangeHelper.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a  reason: collision with root package name */
    private static final String f14380a;
    private SimpleLiveInfo A;
    private IMediaPlayer B;
    private long D;
    private WindowManager E;
    private com.taobao.android.miniLive.sdk.c F;
    private boolean H;
    private d I;
    private Context b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String i;
    private float j;
    private float k;
    private View.OnClickListener l;
    private a m;
    private String o;
    private long p;
    private com.taobao.taolive.sdk.playcontrol.observe.a q;
    private TBMiniLiveFloatingVideoView r;
    private VolumeChangeHelper s;
    private e t;
    private VideoInfo u;
    private boolean v;
    private com.taobao.android.miniLive.services.a y;
    private WindowManager.LayoutParams z;
    private boolean h = true;
    private boolean w = false;
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            hue.a(TBMiniLiveFloatController.c(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (!StringUtils.isEmpty(action) && action.equals("com.taobao.avplayer.start")) {
                if (booleanExtra) {
                    return;
                }
                TBMiniLiveFloatController.this.a("dismiss");
                if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) == null) {
                    return;
                }
                TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).b();
            } else if (!StringUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                TBMiniLiveFloatController.this.a("dismiss");
                if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) == null) {
                    return;
                }
                TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).b();
            } else if (StringUtils.isEmpty(action) || !action.equals(com.taobao.taolive.sdk.playcontrol.d.ON_LIVE_CARD_START_ACTION)) {
            } else {
                if (!"ShopSampleCard".equals(intent.getStringExtra("SubBusinessType")) && booleanExtra) {
                    return;
                }
                TBMiniLiveFloatController.this.a("dismiss");
                if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) == null) {
                    return;
                }
                TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).b();
            }
        }
    };
    private boolean C = false;
    private ControllerStatus G = ControllerStatus.loading;
    private boolean n = hud.d();

    /* loaded from: classes6.dex */
    public enum ControllerStatus {
        loading,
        start,
        pause,
        error,
        destroy
    }

    public static /* synthetic */ e a(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2b60970f", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.t;
    }

    public static /* synthetic */ ControllerStatus a(TBMiniLiveFloatController tBMiniLiveFloatController, ControllerStatus controllerStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ControllerStatus) ipChange.ipc$dispatch("f73189c6", new Object[]{tBMiniLiveFloatController, controllerStatus});
        }
        tBMiniLiveFloatController.G = controllerStatus;
        return controllerStatus;
    }

    public static /* synthetic */ IMediaPlayer a(TBMiniLiveFloatController tBMiniLiveFloatController, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("38a8ca04", new Object[]{tBMiniLiveFloatController, iMediaPlayer});
        }
        tBMiniLiveFloatController.B = iMediaPlayer;
        return iMediaPlayer;
    }

    public static /* synthetic */ IMediaPlayer b(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMediaPlayer) ipChange.ipc$dispatch("cf369b99", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.B;
    }

    public static /* synthetic */ a c(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("483dceb2", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.m;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f14380a;
    }

    public static /* synthetic */ com.taobao.android.miniLive.sdk.c d(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.miniLive.sdk.c) ipChange.ipc$dispatch("eb9da471", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.F;
    }

    public static /* synthetic */ SimpleLiveInfo e(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleLiveInfo) ipChange.ipc$dispatch("30628a44", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.A;
    }

    public static /* synthetic */ String f(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e6d269", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.c;
    }

    public static /* synthetic */ String g(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5da3848", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.d;
    }

    public static /* synthetic */ View.OnClickListener h(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("e44468c2", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.l;
    }

    public static /* synthetic */ Context i(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c6fe50d2", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.b;
    }

    public static /* synthetic */ String j(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb469e5", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.f;
    }

    public static /* synthetic */ String k(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5da7cfc4", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.e;
    }

    public static /* synthetic */ boolean l(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaebeca1", new Object[]{tBMiniLiveFloatController})).booleanValue() : tBMiniLiveFloatController.h;
    }

    public static /* synthetic */ boolean m(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de7b70e2", new Object[]{tBMiniLiveFloatController})).booleanValue() : tBMiniLiveFloatController.n;
    }

    public static /* synthetic */ String n(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7820161", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.o;
    }

    public static /* synthetic */ String o(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d5756740", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.g;
    }

    public static /* synthetic */ VideoInfo p(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("e0cda35e", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.u;
    }

    public static /* synthetic */ boolean q(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acb981e6", new Object[]{tBMiniLiveFloatController})).booleanValue() : tBMiniLiveFloatController.v;
    }

    public static /* synthetic */ ControllerStatus r(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ControllerStatus) ipChange.ipc$dispatch("892e9987", new Object[]{tBMiniLiveFloatController}) : tBMiniLiveFloatController.G;
    }

    static {
        kge.a(-504795547);
        kge.a(-142574917);
        kge.a(-1433364322);
        kge.a(533419569);
        f14380a = TBMiniLiveFloatController.class.getSimpleName();
    }

    public TBMiniLiveFloatController(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        this.p = -1L;
        this.v = false;
        this.E = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        this.v = false;
        this.q = new com.taobao.taolive.sdk.playcontrol.observe.a(str);
        a(context, str, str2, str3, str4, map);
        this.p = System.currentTimeMillis();
        this.t = new e();
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

    @Override // com.taobao.taolive.sdk.ui.media.mute.VolumeChangeHelper.a
    public void e() {
        IMediaPlayer iMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (StringUtils.equals(this.c, "liveroom") || !com.taobao.taolive.sdk.ui.media.mute.b.a(null) || (iMediaPlayer = this.B) == null || !iMediaPlayer.x()) {
        } else {
            this.B.a(false);
            String str = f14380a;
            hue.a(str, "onVolumeChanged mediaPlayer = " + this.B);
            com.taobao.taolive.sdk.ui.media.mute.b.a(null, false);
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
            if (tBMiniLiveFloatingVideoView == null) {
                return;
            }
            tBMiniLiveFloatingVideoView.updateMuteView(false);
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (tBMiniLiveFloatingVideoView == null) {
            return null;
        }
        return tBMiniLiveFloatingVideoView;
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.l = onClickListener;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce684698", new Object[]{this, aVar});
        } else {
            this.m = aVar;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce69a3b5", new Object[]{this, dVar});
        } else {
            this.I = dVar;
        }
    }

    public void a(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc5fd", new Object[]{this, context, str, str2, str3, str4, map});
        } else if (this.w) {
        } else {
            this.w = true;
            this.b = context;
            this.c = str2;
            this.d = str3;
            if (map != null) {
                if (map.containsKey("jumpUrl")) {
                    this.f = String.valueOf(map.get("jumpUrl"));
                    Uri parse = Uri.parse(this.f);
                    if (parse != null) {
                        this.g = parse.getQueryParameter("spm");
                    }
                }
                if (map.containsKey("position") && (b = pqj.b(String.valueOf(map.get("position")))) != null) {
                    this.i = b.getString("style");
                    this.j = l.c(b.getString("padding-x"));
                    this.k = l.c(b.getString("padding-y"));
                }
                if (map.containsKey("mute")) {
                    this.h = !"NONMUTE".equals(map.get("mute"));
                }
                if (map.containsKey("playType")) {
                    z = "CLICK".equals(map.get("playType"));
                }
            }
            this.r = new TBMiniLiveFloatingVideoView(context, str2, str3);
            this.r.setFloatingVideoViewLifeCycleCallback(this);
            this.r.setClickPlay(z);
            this.r.setCloseBtnClickListener(new View.OnClickListener() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (TBMiniLiveFloatController.a(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.a(TBMiniLiveFloatController.this).b(TBMiniLiveFloatController.b(TBMiniLiveFloatController.this));
                    }
                    if (TBMiniLiveFloatController.c(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).a(new HashMap());
                    }
                    TBMiniLiveFloatController.this.a("close");
                    if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).b();
                    }
                    huf.b(TBMiniLiveFloatController.e(TBMiniLiveFloatController.this), "Close", TBMiniLiveFloatController.f(TBMiniLiveFloatController.this), TBMiniLiveFloatController.g(TBMiniLiveFloatController.this));
                    if (view == null || view.getContext() == null) {
                        return;
                    }
                    hud.a(view.getContext().getApplicationContext());
                }
            });
            this.r.setOnViewClickListener(new TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    if (TBMiniLiveFloatController.a(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.a(TBMiniLiveFloatController.this).a(TBMiniLiveFloatController.b(TBMiniLiveFloatController.this));
                    }
                    if (TBMiniLiveFloatController.h(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.h(TBMiniLiveFloatController.this).onClick(view);
                    } else if (pmd.a().r() != null && TBMiniLiveFloatController.i(TBMiniLiveFloatController.this) != null) {
                        StringBuilder sb = new StringBuilder();
                        if (!StringUtils.isEmpty(TBMiniLiveFloatController.j(TBMiniLiveFloatController.this))) {
                            sb.append(TBMiniLiveFloatController.j(TBMiniLiveFloatController.this));
                        }
                        if (StringUtils.isEmpty(sb)) {
                            sb.append(hud.n());
                            sb.append("&id=");
                            sb.append(TBMiniLiveFloatController.k(TBMiniLiveFloatController.this));
                        }
                        if (!StringUtils.isEmpty(TBMiniLiveFloatController.f(TBMiniLiveFloatController.this)) && sb.indexOf("entrySource") == -1) {
                            sb.append("&entrySource=");
                            sb.append(TBMiniLiveFloatController.f(TBMiniLiveFloatController.this));
                        }
                        sb.append("&isLiveMute=");
                        sb.append(TBMiniLiveFloatController.l(TBMiniLiveFloatController.this));
                        if (TBMiniLiveFloatController.m(TBMiniLiveFloatController.this) && !StringUtils.isEmpty(TBMiniLiveFloatController.n(TBMiniLiveFloatController.this))) {
                            sb.append("&playViewToken=");
                            sb.append(TBMiniLiveFloatController.n(TBMiniLiveFloatController.this));
                        }
                        Bundle bundle = new Bundle();
                        if (hud.x()) {
                            if (TBMiniLiveFloatController.b(TBMiniLiveFloatController.this) instanceof htx) {
                                String s = ((htx) TBMiniLiveFloatController.b(TBMiniLiveFloatController.this)).s();
                                if (!StringUtils.isEmpty(s)) {
                                    sb.append("&playerToken=");
                                    sb.append(s);
                                }
                            }
                            if (TBMiniLiveFloatController.e(TBMiniLiveFloatController.this) != null) {
                                bundle.putString("mediaInfo", pqj.a(com.taobao.taolive.sdk.model.common.a.a((JSONObject) JSONObject.toJSON(TBMiniLiveFloatController.e(TBMiniLiveFloatController.this)))));
                            }
                        }
                        TBMiniLiveFloatController.c();
                        pmd.a().r().a(TBMiniLiveFloatController.i(TBMiniLiveFloatController.this), sb.toString(), bundle, 67108864);
                    }
                    TBMiniLiveFloatController.this.a("liveroom");
                    if (TBMiniLiveFloatController.e(TBMiniLiveFloatController.this) != null) {
                        huf.b(TBMiniLiveFloatController.e(TBMiniLiveFloatController.this), "FloatWindow", TBMiniLiveFloatController.f(TBMiniLiveFloatController.this), TBMiniLiveFloatController.g(TBMiniLiveFloatController.this), TBMiniLiveFloatController.o(TBMiniLiveFloatController.this));
                    } else if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) == null) {
                    } else {
                        huf.b(TBMiniLiveFloatController.p(TBMiniLiveFloatController.this), "FloatWindow", TBMiniLiveFloatController.f(TBMiniLiveFloatController.this), TBMiniLiveFloatController.g(TBMiniLiveFloatController.this), TBMiniLiveFloatController.o(TBMiniLiveFloatController.this));
                    }
                }
            });
            if (StringUtils.equals(str4, com.taobao.android.weex_framework.util.a.ATOM_EXT_window)) {
                hue.a("TBLiveService", CommandID.setDataSource);
                b(str);
            }
            a(context);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.y == null) {
            this.y = new com.taobao.android.miniLive.services.a();
        }
        this.y.a(str, this.c, this);
    }

    private WindowManager.LayoutParams b(boolean z) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("6382f41b", new Object[]{this, new Boolean(z)});
        }
        this.z = new WindowManager.LayoutParams();
        if (hud.s() || (this.b instanceof Application)) {
            if (q()) {
                this.z.type = 2038;
            } else if (r()) {
                this.z.type = 2003;
            } else {
                this.z.type = 2005;
            }
        }
        WindowManager.LayoutParams layoutParams = this.z;
        layoutParams.format = 1;
        layoutParams.flags = layoutParams.flags | 262144 | 32 | 8;
        if (hud.G()) {
            this.z.flags |= 128;
        }
        int b = com.taobao.taolive.sdk.utils.b.b(this.b);
        int c = com.taobao.taolive.sdk.utils.b.c(this.b);
        int a4 = com.taobao.taolive.sdk.utils.b.a(this.b, 12.0f);
        int a5 = com.taobao.taolive.sdk.utils.b.a(this.b, 84.0f);
        if (StringUtils.equals(this.c, "liveroom") || StringUtils.equals(this.c, "zoom")) {
            a4 += (hud.v() * com.taobao.taolive.sdk.utils.b.c(this.b)) / 750;
            a5 += (hud.w() * com.taobao.taolive.sdk.utils.b.c(this.b)) / 750;
        }
        this.z.gravity = 51;
        if (hud.c(this.c)) {
            if (z) {
                a2 = com.taobao.taolive.sdk.utils.b.a(this.b, 175.0f);
                a3 = com.taobao.taolive.sdk.utils.b.a(this.b, 130.0f);
            } else {
                a2 = com.taobao.taolive.sdk.utils.b.a(this.b, 129.0f);
                a3 = com.taobao.taolive.sdk.utils.b.a(this.b, 228.0f);
            }
        } else if (z) {
            a2 = com.taobao.taolive.sdk.utils.b.a(this.b, 160.0f);
            a3 = com.taobao.taolive.sdk.utils.b.a(this.b, 94.0f);
        } else {
            a2 = com.taobao.taolive.sdk.utils.b.a(this.b, 96.0f);
            a3 = com.taobao.taolive.sdk.utils.b.a(this.b, 173.0f);
        }
        WindowManager.LayoutParams layoutParams2 = this.z;
        layoutParams2.width = a2;
        layoutParams2.height = a3;
        if (StringUtils.equals("top-left", this.i)) {
            this.z.x = (int) Math.max(b * this.j, a4);
            this.z.y = (int) Math.max(c * this.k, a5);
        } else if (StringUtils.equals("top-right", this.i)) {
            WindowManager.LayoutParams layoutParams3 = this.z;
            layoutParams3.x = (b - layoutParams3.width) - ((int) Math.max(b * this.j, a4));
            this.z.y = (int) Math.max(c * this.k, a5);
        } else if (StringUtils.equals("bottom-left", this.i)) {
            this.z.x = (int) Math.max(b * this.j, a4);
            WindowManager.LayoutParams layoutParams4 = this.z;
            layoutParams4.y = (c - layoutParams4.height) - ((int) Math.max(c * this.k, a5));
        } else if (StringUtils.equals("bottom-right", this.i)) {
            WindowManager.LayoutParams layoutParams5 = this.z;
            layoutParams5.x = (b - layoutParams5.width) - ((int) Math.max(b * this.j, a4));
            WindowManager.LayoutParams layoutParams6 = this.z;
            layoutParams6.y = (c - layoutParams6.height) - ((int) Math.max(c * this.k, a5));
        } else {
            WindowManager.LayoutParams layoutParams7 = this.z;
            layoutParams7.x = (b - layoutParams7.width) - a4;
            WindowManager.LayoutParams layoutParams8 = this.z;
            layoutParams8.y = (c - layoutParams8.height) - a5;
        }
        return this.z;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (tBMiniLiveFloatingVideoView == null) {
            return;
        }
        tBMiniLiveFloatingVideoView.updateViewPositionOffset(i, i2);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a("dismiss");
        try {
            this.G = ControllerStatus.destroy;
            if (this.y != null) {
                this.y.a(true);
            }
            if (this.r != null) {
                if (this.E != null) {
                    try {
                        this.E.removeView(this.r);
                        k();
                    } catch (Exception unused) {
                    }
                    this.E = null;
                }
                this.r.destroy();
                this.r = null;
            }
            if (this.b == null) {
                return;
            }
            this.b.getApplicationContext().unregisterReceiver(this.x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.android.miniLive.services.a.InterfaceC0554a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        hue.a("TBLiveService", "TBMiniLiveFloatController onSuccess");
        if (this.E == null) {
            d();
            return;
        }
        if (this.r != null && (obj instanceof SimpleLiveInfo)) {
            this.A = (SimpleLiveInfo) obj;
            if (this.A.roomStatus == 1 && this.A.streamStatus == 1) {
                if (this.B == null) {
                    this.B = p();
                    s();
                }
                if (this.t != null) {
                    if ("shop".equals(this.c)) {
                        this.t.a("shop2F_bigcard");
                    } else if ("detail".equals(this.c)) {
                        this.t.a("Detail");
                    }
                    e eVar = this.t;
                    eVar.b("TBMiniLiveFloatController_" + System.currentTimeMillis());
                    SimpleLiveInfo simpleLiveInfo = this.A;
                    if (simpleLiveInfo != null) {
                        this.t.c(simpleLiveInfo.liveId);
                        if (this.A.broadCaster != null) {
                            this.t.d(this.A.broadCaster.accountId);
                        }
                        this.t.f("0");
                    }
                }
                this.e = this.A.liveId;
                TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
                Context context = this.b;
                SimpleLiveInfo simpleLiveInfo2 = this.A;
                tBMiniLiveFloatingVideoView.init(context, simpleLiveInfo2, this.B, b(simpleLiveInfo2.landScape), this.A.landScape, this.h);
                this.r.setVideoCover(this.A.coverImg);
                if (this.A.roomStatus == 1) {
                    this.r.startPlay(this.A);
                }
            } else {
                d();
                return;
            }
        }
        this.w = false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (n.a() != null && o.m() && poy.g(n.a()) && poy.h(n.a())) {
            hue.a(f14380a, "addMiniView isUserCloseSmallWindow");
            return false;
        } else if (this.C) {
            hue.a(f14380a, "addMiniView isAdded = true");
            return true;
        } else {
            this.C = true;
            if (this.E != null && this.G != ControllerStatus.destroy) {
                try {
                    this.D = SystemClock.uptimeMillis();
                    this.E.addView(this.r, this.z);
                    l();
                    if (this.A != null) {
                        huf.a(this.A, "Show-FloatWindow", this.c, this.d, this.g);
                    } else if (this.u != null) {
                        huf.a(this.u, "Show-FloatWindow", this.c, this.d, this.g);
                    }
                    if (this.F != null) {
                        this.F.a();
                    }
                    hue.a(f14380a, "addMiniView");
                    if (!StringUtils.equals(this.c, "liveroom") && com.taobao.taolive.sdk.ui.media.mute.b.a(null)) {
                        this.s = new VolumeChangeHelper();
                        this.s.a(this);
                    }
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (o.m() && poy.g(n.a()) && poy.h(n.a())) {
            hue.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
            return false;
        }
        try {
            if (this.r != null) {
                if (this.r.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.r.getParent()).removeView(this.r);
                }
                this.r.removeAllViews();
                this.r.setVisibility(8);
                if (this.E != null) {
                    this.E.removeView(this.r);
                }
                k();
                this.r.destroy();
                HashMap hashMap = new HashMap();
                if (pmd.a().q() != null) {
                    hashMap.put("userId", pmd.a().q().a());
                }
                if (this.D > 0) {
                    hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.D)) / 1000.0f));
                    hashMap.put("type", this.c);
                    if (!StringUtils.isEmpty(this.d)) {
                        hashMap.put("algParams", this.d);
                    }
                    huf.a(this.c, "FloatWindowExposure", hashMap);
                    this.D = 0L;
                }
            }
            if (hud.C() && "shop".equals(this.c)) {
                hue.a(f14380a, "removeMiniView shop destroy player");
                if (this.B != null) {
                    this.B.o();
                    this.B.c();
                }
            }
            this.w = false;
            this.C = false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void a(String str) {
        VolumeChangeHelper volumeChangeHelper;
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String str2 = f14380a;
        hue.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.c + " isAdded " + this.C + " isGlobal " + this.v);
        if (hud.F() && !this.C) {
            return;
        }
        this.G = ControllerStatus.destroy;
        com.taobao.android.miniLive.services.a aVar = this.y;
        if (aVar != null) {
            aVar.a(true);
        }
        if (this.C && (tBMiniLiveFloatingVideoView = this.r) != null) {
            if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.r.getParent()).removeView(this.r);
            }
            this.r.removeAllViews();
            this.r.setVisibility(8);
            this.r.destroy();
            HashMap hashMap = new HashMap();
            if (pmd.a().q() != null) {
                hashMap.put("userId", pmd.a().q().a());
            }
            if (this.D > 0) {
                hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.D)) / 1000.0f));
                hashMap.put("type", str);
                if (!StringUtils.isEmpty(this.d)) {
                    hashMap.put("algParams", this.d);
                }
                huf.a(this.c, "FloatWindowExposure", hashMap);
                this.D = 0L;
            }
        }
        c(str);
        if (com.taobao.taolive.sdk.ui.media.mute.b.a(null) && (volumeChangeHelper = this.s) != null) {
            volumeChangeHelper.c();
            this.s = null;
        }
        if (StringUtils.equals("halfGoodDetail", str)) {
            o();
            return;
        }
        if (this.B != null) {
            if (StringUtils.equals(this.c, "zoom")) {
                this.B.o();
                this.B.c();
                this.B = null;
                com.taobao.android.miniLive.services.e.a().g();
            } else if (StringUtils.equals(this.c, "liveroom")) {
                if (!StringUtils.equals(str, "liveroom") || hud.B()) {
                    this.B.i();
                }
            } else if (StringUtils.equals(str, "liveroom")) {
                if (!this.n) {
                    this.B.i();
                    new Handler(this.b.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TBMiniLiveFloatController.c();
                            if (TBMiniLiveFloatController.b(TBMiniLiveFloatController.this) != null) {
                                TBMiniLiveFloatController.b(TBMiniLiveFloatController.this).o();
                                if (!TBMiniLiveFloatController.q(TBMiniLiveFloatController.this)) {
                                    TBMiniLiveFloatController.b(TBMiniLiveFloatController.this).c();
                                    TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, (IMediaPlayer) null);
                                }
                            }
                            com.taobao.android.miniLive.services.e.a().g();
                        }
                    }, 1000L);
                }
            } else {
                this.B.i();
                IMediaPlayer iMediaPlayer = this.B;
                if (iMediaPlayer != null) {
                    iMediaPlayer.o();
                    if (!this.v) {
                        this.B.c();
                        this.B = null;
                    }
                }
                com.taobao.android.miniLive.services.e.a().g();
            }
        }
        this.v = false;
        this.w = false;
        this.C = false;
    }

    private void o() {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (tBMiniLiveFloatingVideoView != null && (parent = tBMiniLiveFloatingVideoView.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.r);
        }
        WindowManager windowManager = this.E;
        if (windowManager != null) {
            windowManager.removeView(this.r);
        }
        k();
        com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
        ddw.a().a("com.taobao.taolive.room.float_view_add_to_live_room", null, a2 != null ? a2.G() : null);
    }

    public void a(com.taobao.android.miniLive.sdk.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a13a5c4", new Object[]{this, cVar});
        } else {
            this.F = cVar;
        }
    }

    @Override // com.taobao.android.miniLive.services.a.InterfaceC0554a
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        this.A = null;
        this.w = false;
        d();
        hue.a("TBLiveService", "network onError");
    }

    private IMediaPlayer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("2a9f335", new Object[]{this});
        }
        this.o = g.b();
        com.taobao.taolive.sdk.ui.media.e eVar = new com.taobao.taolive.sdk.ui.media.e(this.o);
        eVar.a(this.b);
        eVar.f_(true);
        eVar.d(this.c);
        long j = this.p;
        if (j > 0) {
            eVar.b(j);
        }
        eVar.a(this.q);
        eVar.a(new IMediaPlayer.j() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.j
            public void onStart(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                } else if (TBMiniLiveFloatController.r(TBMiniLiveFloatController.this) == ControllerStatus.destroy) {
                } else {
                    boolean f = TBMiniLiveFloatController.this.f();
                    if (TBMiniLiveFloatController.a(TBMiniLiveFloatController.this) != null && iMediaPlayer != null) {
                        TBMiniLiveFloatController.a(TBMiniLiveFloatController.this).h(iMediaPlayer.x() ? "close" : "open");
                    }
                    if (!f) {
                        TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.error);
                        TBMiniLiveFloatController.this.d();
                    } else {
                        TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.start);
                    }
                    hue.a("TBMiniLiveController", "onStart addMiniView " + f);
                }
            }
        });
        eVar.a(new IMediaPlayer.d() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.d
            public void onCompletion(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                } else if (TBMiniLiveFloatController.r(TBMiniLiveFloatController.this) == ControllerStatus.destroy) {
                } else {
                    TBMiniLiveFloatController.this.a("dismiss");
                    hue.a("TBMiniLiveController", MessageID.onCompletion);
                    if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).c();
                    }
                    TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.pause);
                }
            }
        });
        eVar.a(new IMediaPlayer.h() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
            public void onPause(IMediaPlayer iMediaPlayer) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                } else if (TBMiniLiveFloatController.r(TBMiniLiveFloatController.this) == ControllerStatus.destroy) {
                } else {
                    TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.pause);
                }
            }
        });
        eVar.a(new IMediaPlayer.e() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                if (TBMiniLiveFloatController.r(TBMiniLiveFloatController.this) == ControllerStatus.destroy) {
                    return false;
                }
                TBMiniLiveFloatController.this.a(i);
                TBMiniLiveFloatController.this.a("dismiss");
                hue.a("TBMiniLiveController", "onError i = " + i + " i1 = " + i2);
                if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) != null) {
                    TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).c();
                }
                TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.error);
                return false;
            }
        });
        eVar.a(new IMediaPlayer.g() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj})).booleanValue();
                }
                if (j2 == 3) {
                    TBMiniLiveFloatController.this.m();
                }
                return false;
            }
        });
        eVar.a(new d.a() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.d.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // com.taobao.taolive.sdk.ui.media.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                TBMiniLiveFloatController.this.a("dismiss");
                hue.a("TBMiniLiveController", "onNotInstallPlayError");
                if (TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) != null) {
                    TBMiniLiveFloatController.d(TBMiniLiveFloatController.this).c();
                }
                TBMiniLiveFloatController.a(TBMiniLiveFloatController.this, ControllerStatus.error);
            }
        });
        return eVar;
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 26;
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return ContextCompat.checkSelfPermission(this.b.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0 && Build.VERSION.SDK_INT < 19;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        IMediaPlayer iMediaPlayer = this.B;
        return iMediaPlayer != null && iMediaPlayer.l();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.c;
    }

    public ControllerStatus j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ControllerStatus) ipChange.ipc$dispatch("19fbf9d5", new Object[]{this}) : this.G;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.B == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.A.liveConfigForStream != null) {
                hashMap.put("__livePushControlInfo", this.A.liveConfigForStream);
            }
            this.B.a((Map<String, String>) hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "1");
            this.B.a((Map<String, String>) hashMap2);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            HashMap hashMap3 = new HashMap();
            String str2 = "entryLiveSource=" + str + ",videoActionType=init,vod_scenario=smallWindow";
            if (pmd.a().m() != null) {
                pmd.a().m().a("updatePlayExValue", "shop2F updatePlayExValue = " + str2);
            }
            hashMap3.put(obw.KEY_VIDEO_UPDATE_PARAMS, str2);
            this.B.a((Map<String, String>) hashMap3);
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
        if (this.B == null) {
            return;
        }
        if (StringUtils.equals(this.c, "liveroom") || StringUtils.equals(str, "liveroom")) {
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", "liveRoom");
            this.B.a((Map<String, String>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("enterFloating", "0");
        this.B.a((Map<String, String>) hashMap2);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.H) {
        } else {
            this.H = false;
            hue.a("TBMiniLiveFloatController", "onWindowRemoved");
            com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.q;
            if (aVar != null) {
                aVar.d();
            }
            this.l = null;
            this.m = null;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.H) {
        } else {
            this.H = true;
            hue.a("TBMiniLiveFloatController", "onWindowAdded");
            com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.q;
            if (aVar == null) {
                return;
            }
            aVar.a(this.e);
            this.q.c("MiniLive");
            this.q.b(this.c);
            this.q.a();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        hue.a("TBMiniLiveFloatController", "onPlayerFirstFrame");
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.q;
        if (aVar == null) {
            return;
        }
        aVar.g();
        IMediaPlayer iMediaPlayer = this.B;
        if (iMediaPlayer == null) {
            return;
        }
        this.q.g(iMediaPlayer.e());
        this.q.h(this.B.y());
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        hue.a("TBMiniLiveFloatController", "onPlayerError");
        com.taobao.taolive.sdk.playcontrol.observe.a aVar = this.q;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        e eVar = this.t;
        if (eVar != null) {
            eVar.a(z);
        }
        d dVar = this.I;
        if (dVar == null) {
            return;
        }
        dVar.a(z);
    }
}
