package com.taobao.taolive.room;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.launcher.bootstrap.tao.ability.b;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.login4android.api.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.media.MediaConstant;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.monitor.procedure.s;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.utils.RRoomProxy;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ap;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.g;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.history.RecentlyOftenWatchService;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import com.taobao.taolive.sdk.utils.MediaCaptureObserver;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.ddw;
import tb.dlx;
import tb.fmg;
import tb.kge;
import tb.oyh;
import tb.pbt;
import tb.pez;
import tb.pfd;
import tb.pkm;
import tb.plk;
import tb.ply;
import tb.pmd;
import tb.pnf;
import tb.pni;
import tb.poz;
import tb.psm;
import tb.qzp;
import tb.rmx;
import tb.tnn;
import tb.tno;
import tb.tnp;

/* loaded from: classes8.dex */
public class TaoLiveVideoActivity extends CustomBaseActivity implements com.alibaba.ut.c, com.taobao.android.launcher.bootstrap.tao.ability.c, IUtActivityNotTrack, ShareContentCallBack, dlx, fmg, qzp, rmx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_KILL_SELF = "com.taobao.taolive.room.TaoLiveVideoActivity.killself";

    /* renamed from: a */
    private static final String f21500a;
    public boolean A;
    private boolean B;
    public MediaData C;
    private MediaCaptureObserver D;
    public String E;
    private boolean F;
    private com.taobao.taolive.room.controller2.d b;
    public String c;
    private String e;
    private String f;
    private pez g;
    private SystemBarDecorator i;
    private long r;
    private IMediaPlayer s;
    private ViewGroup v;
    private final ArrayList<fmg> x = new ArrayList<>();
    private final ArrayList<dlx> y = new ArrayList<>();
    private Handler d = new Handler(Looper.getMainLooper());
    private boolean j = false;
    private boolean o = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private BroadcastReceiver q = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TaoLiveVideoActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"com.taobao.taolive.room.TaoLiveVideoActivity.killself".equals(intent.getAction())) {
            } else {
                TaoLiveVideoActivity.this.finish();
            }
        }
    };
    private boolean t = false;
    private oyh p = new oyh(this);
    private PanguApplication.CrossActivityLifecycleCallback G = new PanguApplication.CrossActivityLifecycleCallback() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            }
        }

        {
            TaoLiveVideoActivity.this = this;
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
                return;
            }
            ap.f = true;
            TaoLiveVideoActivity.this.getPanguApplication().unregisterCrossActivityLifecycleCallback(TaoLiveVideoActivity.a(TaoLiveVideoActivity.this));
        }
    };
    private BroadcastReceiver u = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.13
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TaoLiveVideoActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            } else {
                String action = intent.getAction();
                if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
                    TaoLiveVideoActivity.a(taoLiveVideoActivity, taoLiveVideoActivity);
                    TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveVideoActivity.b() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_SUCCESS");
                    TaoLiveVideoActivity.l(TaoLiveVideoActivity.this);
                } else if (!TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                } else {
                    TaoLiveVideoActivity taoLiveVideoActivity2 = TaoLiveVideoActivity.this;
                    TaoLiveVideoActivity.a(taoLiveVideoActivity2, taoLiveVideoActivity2);
                    TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveVideoActivity.b() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_CANCEL");
                    TaoLiveVideoActivity.this.finish();
                }
            }
        }
    };
    private g.a z = new g.a() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.14
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TaoLiveVideoActivity.this = this;
        }

        @Override // com.taobao.taolive.sdk.core.g.a
        public void onGlobalLiveRoomMuteChanged(boolean z) {
            Uri data;
            Uri a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            } else if (TaoLiveVideoActivity.this.getIntent() == null || (data = TaoLiveVideoActivity.this.getIntent().getData()) == null || (a2 = TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, data, aw.PARAM_IS_LIVE_MUTE, String.valueOf(z))) == null) {
            } else {
                TaoLiveVideoActivity.this.getIntent().setData(a2);
            }
        }
    };
    private TBPublicMenu.TBOnPublicMenuClickListener w = new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.19
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            TaoLiveVideoActivity.this = this;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            a a2 = n.a();
            String str = null;
            if (a2 != null) {
                str = a2.G();
            }
            if (tBPublicMenuItem.getId() == R.id.taolive_global_report) {
                ddw.a().a(pfd.EVENT_START_REPORT, tBPublicMenuItem, str);
            } else {
                ddw.a().a("com.taobao.taolive.room.share", tBPublicMenuItem, str);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(TaoLiveVideoActivity taoLiveVideoActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1398848845:
                super.onPostResume();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 79457038:
                return new Boolean(super.isImmersiveStatus());
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void lambda$N_Dnd8eaytJgmKZSyCpVrFtAW1A(TaoLiveVideoActivity taoLiveVideoActivity) {
        taoLiveVideoActivity.I();
    }

    /* renamed from: lambda$wugtRD0hoHV-LgE-Q9AsQrHi9u0 */
    public static /* synthetic */ void m1373lambda$wugtRD0hoHVLgEQ9AsQrHi9u0(TaoLiveVideoActivity taoLiveVideoActivity, Runnable runnable, long j) {
        taoLiveVideoActivity.a(runnable, j);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Uri a(TaoLiveVideoActivity taoLiveVideoActivity, Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("32ddd0f7", new Object[]{taoLiveVideoActivity, uri, str, str2}) : taoLiveVideoActivity.a(uri, str, str2);
    }

    public static /* synthetic */ PanguApplication.CrossActivityLifecycleCallback a(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PanguApplication.CrossActivityLifecycleCallback) ipChange.ipc$dispatch("777f3643", new Object[]{taoLiveVideoActivity}) : taoLiveVideoActivity.G;
    }

    public static /* synthetic */ IMediaPlayer a(TaoLiveVideoActivity taoLiveVideoActivity, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMediaPlayer) ipChange.ipc$dispatch("45024c3b", new Object[]{taoLiveVideoActivity, iMediaPlayer});
        }
        taoLiveVideoActivity.s = iMediaPlayer;
        return iMediaPlayer;
    }

    public static /* synthetic */ void a(TaoLiveVideoActivity taoLiveVideoActivity, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82432b0d", new Object[]{taoLiveVideoActivity, activity});
        } else {
            taoLiveVideoActivity.b(activity);
        }
    }

    public static /* synthetic */ void a(TaoLiveVideoActivity taoLiveVideoActivity, Intent intent, MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f509cc2", new Object[]{taoLiveVideoActivity, intent, mediaData, str});
        } else {
            taoLiveVideoActivity.a(intent, mediaData, str);
        }
    }

    public static /* synthetic */ void a(TaoLiveVideoActivity taoLiveVideoActivity, Drawable drawable, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819994d9", new Object[]{taoLiveVideoActivity, drawable, fVar});
        } else {
            taoLiveVideoActivity.a(drawable, fVar);
        }
    }

    public static /* synthetic */ void a(TaoLiveVideoActivity taoLiveVideoActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f816f7", new Object[]{taoLiveVideoActivity, view});
        } else {
            taoLiveVideoActivity.a(view);
        }
    }

    public static /* synthetic */ boolean a(TaoLiveVideoActivity taoLiveVideoActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8ac03d", new Object[]{taoLiveVideoActivity, new Boolean(z)})).booleanValue();
        }
        taoLiveVideoActivity.o = z;
        return z;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f21500a;
    }

    public static /* synthetic */ void b(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4874fbc", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.o();
        }
    }

    public static /* synthetic */ boolean b(TaoLiveVideoActivity taoLiveVideoActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec635a9c", new Object[]{taoLiveVideoActivity, new Boolean(z)})).booleanValue();
        }
        taoLiveVideoActivity.F = z;
        return z;
    }

    public static /* synthetic */ void c(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8126d7d", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.s();
        }
    }

    public static /* synthetic */ void d(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9d8b3e", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.d();
        }
    }

    public static /* synthetic */ boolean e(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f28a903", new Object[]{taoLiveVideoActivity})).booleanValue() : taoLiveVideoActivity.j;
    }

    public static /* synthetic */ com.taobao.taolive.room.controller2.d f(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.room.controller2.d) ipChange.ipc$dispatch("1910c8c6", new Object[]{taoLiveVideoActivity}) : taoLiveVideoActivity.b;
    }

    public static /* synthetic */ Handler g(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("154f50a5", new Object[]{taoLiveVideoActivity}) : taoLiveVideoActivity.d;
    }

    public static /* synthetic */ boolean h(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39ca0246", new Object[]{taoLiveVideoActivity})).booleanValue() : taoLiveVideoActivity.F;
    }

    public static /* synthetic */ void i(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d552003", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.f();
        }
    }

    public static /* synthetic */ boolean j(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0e03dc8", new Object[]{taoLiveVideoActivity})).booleanValue() : taoLiveVideoActivity.n();
    }

    public static /* synthetic */ TBPublicMenu.TBOnPublicMenuClickListener k(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu.TBOnPublicMenuClickListener) ipChange.ipc$dispatch("62e9a24b", new Object[]{taoLiveVideoActivity}) : taoLiveVideoActivity.w;
    }

    public static /* synthetic */ void l(TaoLiveVideoActivity taoLiveVideoActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f67946", new Object[]{taoLiveVideoActivity});
        } else {
            taoLiveVideoActivity.k();
        }
    }

    static {
        kge.a(-1553391268);
        kge.a(321354641);
        kge.a(-1864841087);
        kge.a(-2028101264);
        kge.a(1698775038);
        kge.a(2123619074);
        kge.a(514757849);
        kge.a(478546929);
        kge.a(1861127946);
        f21500a = TaoLiveVideoActivity.class.getSimpleName();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ac.a("KLifecycle_activity_create");
        ac.a();
        ac.a(f21500a, i.b.MEASURE_ONCREATE);
        ap.b = System.currentTimeMillis();
        ap.c = true;
        getPanguApplication().registerCrossActivityLifecycleCallback(this.G);
        this.p.a(bundle);
        TaoLiveLaunchInitializer.init();
        com.taobao.taolive.room.utils.a.d = false;
        ap.d = SystemClock.uptimeMillis();
        ab.c(f21500a, "[SavedInstanceState_startTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        Trace.beginSection("super.onCreate");
        super.onCreate(bundle);
        Trace.endSection();
        ab.c(f21500a, "[SavedInstanceState_endTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        this.p.a();
        this.B = false;
        this.A = false;
        Intent intent = getIntent();
        this.j = b.d(intent);
        this.k = b.c(intent);
        Coordinator.execute(new Runnable() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoLiveVideoActivity.b(TaoLiveVideoActivity.this);
                }
            }
        });
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onCreate isAfcColdContext " + this.j + " isAfcContextCallback " + this.k + " mIsNewIntentAfcColdContext " + this.m);
        String dataString = intent.getDataString();
        if (this.j) {
            if (C()) {
                HashMap hashMap = new HashMap();
                hashMap.put("isAfcColdContext", String.valueOf(this.j));
                hashMap.put("isAfcContextCallback", String.valueOf(this.k));
                hashMap.put("isAfcColdContext_rul", dataString);
                ai.a(n.a(), "IsAfcColdContext_create2", (Map<String, String>) hashMap);
            }
            if (this.k && a(dataString, false)) {
                return;
            }
        }
        v();
        this.r = System.currentTimeMillis();
        g();
        m.a(this.r, this.j, this.f, true, dataString);
        if (!u() || !t()) {
            return;
        }
        if (this.j && aa.cP() && com.taobao.taolive.room.afccoldlunch.b.a().c()) {
            this.o = false;
            com.taobao.taolive.room.afccoldlunch.b.a().a(new com.taobao.taolive.room.afccoldlunch.a() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a(SimpleVideoInfo simpleVideoInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0df487", new Object[]{this, simpleVideoInfo});
                        return;
                    }
                    MediaData b = com.taobao.taolive.room.afccoldlunch.b.b(simpleVideoInfo);
                    if (b != null && b.liveUrlList != null && !b.liveUrlList.isEmpty()) {
                        TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, true);
                        m.b("setResponseListener LayoutInflater asyncMediaPlayer");
                        TaoLiveVideoActivity taoLiveVideoActivity = TaoLiveVideoActivity.this;
                        TaoLiveVideoActivity.a(taoLiveVideoActivity, taoLiveVideoActivity.getIntent(), b, (String) null);
                        return;
                    }
                    TaoLiveVideoActivity.c(TaoLiveVideoActivity.this);
                }

                @Override // com.taobao.taolive.room.afccoldlunch.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TaoLiveVideoActivity.c(TaoLiveVideoActivity.this);
                    }
                }
            });
        } else if (b(intent.getData())) {
            A();
        } else if (a(intent.getData())) {
            p();
        } else if (q() && bundle == null) {
            r();
        } else {
            s();
        }
        ac.a();
    }

    private void w() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        if (y.a()) {
            com.taobao.android.autosize.f.a((Activity) this);
        }
        if (ply.aa()) {
            h();
        } else {
            getWindow().addFlags(1024);
        }
        c();
        com.taobao.taolive.sdk.monitor.b.b().a(this);
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        s.f18233a.d().a("taolive_session_id", m.a());
        s.f18233a.d().a("taolive_create_time", Long.valueOf(SystemClock.uptimeMillis()));
        s.f18233a.d().a("taolive_create_isAfcColdContext", Boolean.valueOf(this.j));
        this.g = new pez(this);
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(this.q, new IntentFilter("com.taobao.taolive.room.TaoLiveVideoActivity.killself"));
        if (this.p.e() || (findViewById = findViewById(16908290)) == null) {
            return;
        }
        findViewById.setBackgroundColor(-16777216);
    }

    private boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().b("tblive", "closeAsyncStartUpOrg1", "true"));
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (getIntent() != null && getIntent().getData() != null) {
            String queryParameter = getIntent().getData().getQueryParameter("livesource");
            if (!TextUtils.isEmpty(queryParameter) && a(queryParameter) && !m.e()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taolive.room.TaoLiveVideoActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "f3a64c36"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            tb.pmd r0 = tb.pmd.a()
            tb.pmi r0 = r0.d()
            if (r0 == 0) goto L96
            tb.pmd r0 = tb.pmd.a()
            tb.pmi r0 = r0.d()
            java.lang.String r1 = "tblive"
            java.lang.String r4 = "enableTaoliveStartUpOpt"
            java.lang.String r5 = "true"
            java.lang.String r0 = r0.a(r1, r4, r5)
            boolean r0 = com.taobao.taolive.sdk.utils.l.d(r0)
            tb.pmd r4 = tb.pmd.a()
            tb.pmi r4 = r4.d()
            java.lang.String r5 = "StartUpOptBlacklist"
            java.lang.String r6 = "tab2,taolivejulang,haiguan,anchor_pc_share"
            java.lang.String r1 = r4.a(r1, r5, r6)
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L88
            java.lang.String r4 = "."
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L7d
            java.lang.String r4 = "\\."
            java.lang.String[] r8 = r8.split(r4)
            if (r8 == 0) goto L88
            int r4 = r8.length
            if (r4 <= 0) goto L88
            r4 = r8[r3]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L88
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L88
            r8 = r8[r3]
            boolean r8 = r1.contains(r8)
            goto L89
        L7d:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L88
            boolean r8 = r1.contains(r8)
            goto L89
        L88:
            r8 = 0
        L89:
            com.taobao.taolive.room.TaoLiveVideoActivity$6 r1 = new com.taobao.taolive.room.TaoLiveVideoActivity$6
            r1.<init>()
            com.taobao.login4android.api.Coordinator.execute(r1)
            if (r0 == 0) goto L96
            if (r8 != 0) goto L96
            return r2
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.TaoLiveVideoActivity.a(java.lang.String):boolean");
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        tno d = tnn.a().d(data.getQueryParameter("id"));
        if (d == null) {
            this.B = false;
            s();
            return;
        }
        String str = d.c;
        MediaData mediaData = d.b;
        if (mediaData != null) {
            this.C = mediaData;
            this.B = true;
        }
        if (com.taobao.taolive.sdk.ui.media.g.a().d(str)) {
            this.c = str;
            this.B = true;
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_MODE, "OptPlayPreload");
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN, str);
            getIntent().setData(buildUpon.build());
        }
        if (this.B) {
            return;
        }
        s();
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        Uri.Builder buildUpon = data.buildUpon();
        buildUpon.appendQueryParameter(aw.SHOULD_USE_PRE_CREATE_REC, "true");
        getIntent().setData(buildUpon.build());
        tnp e = tnn.a().e(data.getQueryParameter("livesource"));
        if (e == null || e.b == null || tnn.a().d(e.b) == null) {
            this.B = false;
            s();
            return;
        }
        String str = e.b;
        buildUpon.appendQueryParameter(aw.PRE_CREATE_REC_LIVE_ROOM_ID, str);
        tno d = tnn.a().d(str);
        String str2 = d.c;
        MediaData mediaData = d.b;
        if (mediaData != null) {
            this.C = mediaData;
            this.B = true;
        }
        if (com.taobao.taolive.sdk.ui.media.g.a().d(str2)) {
            this.c = str2;
            this.B = true;
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_MODE, "OptPlayPreRec");
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN, str2);
            getIntent().setData(buildUpon.build());
        }
        if (this.B) {
            return;
        }
        s();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (getIntent() == null || getIntent().getData() == null) {
        } else {
            String str = null;
            String string = getIntent().getExtras() != null ? getIntent().getExtras().getString("mediaInfo") : null;
            Uri data = getIntent().getData();
            if (data != null && !TextUtils.isEmpty(data.getQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN))) {
                str = data.getQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN);
            }
            if (string != null || str != null) {
                this.B = true;
                this.c = str;
                this.E = string;
                return;
            }
            this.B = false;
            s();
        }
    }

    public static void updateApmDataInvalid(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d114fed3", new Object[]{view});
        } else if (view == null) {
        } else {
            Log.e("updateApmData", "updateApmDataInvalid: invalid_view:" + view.hashCode());
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        }
    }

    public static void updateApmDataValid(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30beceee", new Object[]{view});
        } else if (view == null) {
        } else {
            Log.e("updateApmData", "updateApmDataValid:valid_view:" + view.hashCode());
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableTbliveUtBugfix", "true"));
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        w();
        k();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null && dVar.j() != null) {
            poz.n(true, (g) this.b.j());
        }
        if (u.aD()) {
            com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T0);
            ab.d("LIVE_CODE_BOOT_STAGE", "stage:t0");
        }
        if (com.taobao.android.live.plugin.proxy.c.a().d()) {
            d();
        } else {
            com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TaoLiveVideoActivity.d(TaoLiveVideoActivity.this);
                    }
                }
            });
        }
        com.taobao.taolive.room.controller2.d dVar2 = this.b;
        if (dVar2 != null) {
            dVar2.k();
        }
        F();
    }

    private boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        boolean checkSessionValid = Login.checkSessionValid();
        String userId = Login.getUserId();
        String nick = Login.getNick();
        s.f18233a.d().a("taolive_check_login_session_valid", Boolean.valueOf(checkSessionValid));
        if (this.j) {
            if (!checkSessionValid && ((TextUtils.isEmpty(userId) || TextUtils.isEmpty(nick)) && !a(checkSessionValid))) {
                return false;
            }
        } else if (!a(checkSessionValid)) {
            return false;
        }
        return true;
    }

    private boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        if (com.taobao.taolive.room.utils.d.b()) {
            return true;
        }
        Toast.makeText(this, "亲,你的机型暂不支持直播T.T", 1).show();
        finish();
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onCreate isArmV7CpuType false ");
        return false;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        getWindow().setAttributes(attributes);
    }

    private void a(Intent intent, MediaData mediaData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa20075", new Object[]{this, intent, mediaData, str});
            return;
        }
        final View inflate = LayoutInflater.from(this).inflate(R.layout.taolive_root_layout, (ViewGroup) null, false);
        h hVar = new h();
        Uri data = intent.getData();
        if (data != null && !TextUtils.isEmpty(str)) {
            if (com.taobao.taolive.sdk.ui.media.g.a().d(str)) {
                hVar.f21934a = str;
            } else {
                hVar.b = r.a(mediaData, null);
                hVar.f21934a = com.taobao.taolive.sdk.ui.media.g.e(hVar.b);
                intent.setData(Uri.parse(data.toString().replace("playViewToken=" + str, "playViewToken=" + hVar.f21934a)));
            }
        } else {
            hVar.b = r.a(mediaData, null);
            hVar.f21934a = com.taobao.taolive.sdk.ui.media.g.e(hVar.b);
            if (data != null) {
                Uri.Builder buildUpon = data.buildUpon();
                buildUpon.appendQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN, hVar.f21934a);
                buildUpon.appendQueryParameter(aw.PARAM_PLAY_MODE, "OptPlay");
                intent.setData(buildUpon.build());
            }
        }
        f fVar = new f(hVar);
        fVar.s(true);
        fVar.a(this);
        if (mediaData != null) {
            fVar.a(mediaData, (String) null);
        }
        fVar.f(true);
        fVar.a(true);
        fVar.d("LiveRoom");
        ViewGroup G = fVar.G();
        if (G == null) {
            ab.c(f21500a, "[Metrics-VideoPrePlay: mediaView is null");
            return;
        }
        fVar.g();
        final FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.rootVideoFrameLayout);
        if (this.j && aa.cP()) {
            frameLayout.addView(G, 0);
        } else {
            frameLayout.addView(G);
        }
        oyh oyhVar = this.p;
        if (oyhVar != null && oyhVar.e()) {
            this.p.a(inflate);
        } else {
            setContentView(inflate);
        }
        updateApmDataInvalid(inflate);
        ab.c(f21500a, "[coverImage:]: hasFirstFrame" + fVar.D() + ":" + hashCode());
        long j = 5000;
        if (fVar.cA_()) {
            this.d.post(new Runnable() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, inflate);
                    }
                }
            });
        } else {
            if (i() && intent.getExtras() != null) {
                String string = intent.getExtras().getString("coverImage");
                if (!TextUtils.isEmpty(string)) {
                    a(fVar, string);
                }
            }
            this.d.postDelayed(new Runnable() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FrameLayout frameLayout2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, inflate);
                    if (!TaoLiveVideoActivity.e(TaoLiveVideoActivity.this) || (frameLayout2 = frameLayout) == null) {
                        return;
                    }
                    frameLayout2.removeAllViews();
                }
            }, this.j ? 5000L : 1000L);
        }
        fVar.a(new IMediaPlayer.g() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j2, long j3, long j4, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), new Long(j4), obj})).booleanValue();
                }
                int i = (int) j2;
                if (i != 3) {
                    if (i == 12101) {
                        com.taobao.taolive.room.utils.a.a(TaoLiveVideoActivity.this.getActivity());
                        TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, iMediaPlayer);
                        if (frameLayout != null && !TaoLiveVideoActivity.this.A) {
                            TaoLiveVideoActivity.g(TaoLiveVideoActivity.this).postDelayed(new Runnable() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.10.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                {
                                    AnonymousClass10.this = this;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, inflate);
                                    }
                                }
                            }, TaoLiveVideoActivity.e(TaoLiveVideoActivity.this) ? 16L : 0L);
                        }
                        if (!TaoLiveVideoActivity.h(TaoLiveVideoActivity.this) && TaoLiveVideoActivity.f(TaoLiveVideoActivity.this) != null && TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j() != null) {
                            TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j().E().put("kLivePlayerSuccess", String.valueOf(System.currentTimeMillis()));
                            TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j().E().put("kLiveLowerPlayerSuccess", String.valueOf(j3));
                            ai.a(TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j(), (pkm) null);
                            new HashMap().put("kLivePlayerSuccess", String.valueOf(j3));
                            TaoLiveVideoActivity.b(TaoLiveVideoActivity.this, true);
                        }
                    }
                } else if (TaoLiveVideoActivity.f(TaoLiveVideoActivity.this) != null && TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j() != null) {
                    TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).j().E().put("kPlayerFirstFinishTime", String.valueOf(j3));
                }
                return false;
            }
        });
        if (o.S()) {
            if (!this.j) {
                j = o.k() + 300;
            }
            fVar.a(j, true);
            return;
        }
        fVar.N();
    }

    private void a(Drawable drawable, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f31dcc", new Object[]{this, drawable, fVar});
        } else if (!y.a() || fVar == null || !(fVar.b() instanceof FrameLayout)) {
        } else {
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(drawable);
            ((FrameLayout) fVar.b()).addView(imageView, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void a(final f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1becd3a", new Object[]{this, fVar, str});
            return;
        }
        fVar.a(getResources().getDrawable(R.drawable.taolive_cover_image_common_opt), true);
        if (aa.aq()) {
            pni l = pmd.a().l();
            l.a(str + aa.cJ()).a(new pnf() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pnf
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    }
                }

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // tb.pnf
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    f fVar2 = fVar;
                    if (fVar2 == null) {
                        return;
                    }
                    fVar2.a((Drawable) bitmapDrawable, true);
                    TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, bitmapDrawable, fVar);
                }
            }).a();
            return;
        }
        com.taobao.taolive.room.utils.g.a(str, fVar.G(), -1, -1, new g.a() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.utils.g.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // com.taobao.taolive.room.utils.g.a
            public void a(BitmapDrawable bitmapDrawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
                    return;
                }
                f fVar2 = fVar;
                if (fVar2 == null) {
                    return;
                }
                fVar2.a((Drawable) bitmapDrawable, true);
                TaoLiveVideoActivity.a(TaoLiveVideoActivity.this, bitmapDrawable, fVar);
            }
        });
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "fixCoverImageRelease", "true"));
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.A || isDestroyed()) {
        } else {
            if (!E()) {
                w();
            }
            b("firstFrame");
            m.h(null);
            updateApmDataValid(view);
            this.A = true;
            s();
            x();
            y();
            z();
            this.B = false;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e.a().a(e.ATYPE, false, this);
        e.a().a(e.BTYPE, false, this);
        if (pmd.a().u() != null) {
            com.taobao.taolive.sdk.morelive.e.a().a(pmd.a().u().c());
        }
        com.taobao.android.live.plugin.proxy.c.a().f();
        com.taobao.android.live.plugin.proxy.ir.a.a().a(IRRoomProxy.KEY, RRoomProxy.getInstance());
    }

    private void d() {
        IUniversalProxy.d volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (com.taobao.android.live.plugin.proxy.f.o() == null || (volumeChangeUploadManager = com.taobao.android.live.plugin.proxy.f.o().getVolumeChangeUploadManager()) == null) {
        } else {
            volumeChangeUploadManager.a(this);
        }
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return true;
        }
        if (this.j && !Login.checkInit()) {
            e();
        } else {
            f();
        }
        return false;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                if (!AppInfo.INITED_ACTION.equals(intent.getAction())) {
                    return;
                }
                TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveVideoActivity.b() + "_APM", "onCreate registerLoginInitAction onReceive INITED_ACTION");
                if (!Login.checkSessionValid()) {
                    TaoLiveVideoActivity.i(TaoLiveVideoActivity.this);
                } else {
                    TaoLiveVideoActivity.l(TaoLiveVideoActivity.this);
                }
            }
        }, new IntentFilter(AppInfo.INITED_ACTION));
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.j));
        hashMap.put("isAfcContextCallback", String.valueOf(this.k));
        ai.a(n.a(), "IsAfcColdContext_checkLoginInit", (Map<String, String>) hashMap);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onCreate registerLoginInitAction");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a((Activity) this);
        Login.login(true);
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.j));
        hashMap.put("isAfcContextCallback", String.valueOf(this.k));
        ai.a(n.a(), "IsAfcColdContext_checkSessionValid", (Map<String, String>) hashMap);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onCreate checkSessionValidFalse " + this.j);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        boolean equals = "true".equals(data.getQueryParameter(com.taobao.taolive.room.controller2.j.PARAM_LIVEHOMEMIX));
        String str = "a2141.8001249";
        String str2 = ag.PAGE_HOME_LIVETAB;
        if (equals) {
            String queryParameter = data.getQueryParameter(com.taobao.taolive.room.controller2.j.PARAM_LIVEHOME_SPM);
            if (!TextUtils.isEmpty(queryParameter)) {
                str = queryParameter;
            }
        } else {
            str2 = "Page_TaobaoLiveWatch";
        }
        ai.a((a) null, (Object) this, str2);
        hashMap.put("spm-cnt", str);
        this.f = data.getQueryParameter("livesource");
        if (!TextUtils.isEmpty(this.f)) {
            hashMap.put("livesource", this.f);
            hashMap.put("entryLiveSource", this.f);
        }
        String queryParameter2 = data.getQueryParameter("spm");
        if (!TextUtils.isEmpty(queryParameter2)) {
            hashMap.put("entrySpm", queryParameter2);
        }
        String queryParameter3 = data.getQueryParameter("userId");
        if (!TextUtils.isEmpty(queryParameter3)) {
            hashMap.put("account_id", queryParameter3);
        }
        String queryParameter4 = data.getQueryParameter("id");
        if (!TextUtils.isEmpty(queryParameter4)) {
            hashMap.put("feed_id", queryParameter4);
        }
        hashMap.put("isAfcColdContext", String.valueOf(this.j));
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a(this, hashMap);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.i = new SystemBarDecorator(this);
        this.i.enableImmersiveStatusBar(true);
        c.c = SystemBarDecorator.getStatusBarHeight(this);
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.u);
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.u);
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        if (!ply.aa()) {
            return super.isImmersiveStatus();
        }
        return true;
    }

    private void k() {
        ViewGroup viewGroup;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        getIntent().putExtra("firstTime", this.r);
        if (getIntent() != null && (data = getIntent().getData()) != null) {
            this.e = data.getQueryParameter("newRoomType");
        }
        l();
        if (this.o || this.B) {
            viewGroup = (ViewGroup) findViewById(16908290);
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(0);
                viewGroup.addView(this.b.a(), 0);
            }
        } else {
            viewGroup = this.b.a();
            if (this.p.e()) {
                this.p.a(viewGroup);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.v != null) {
            return;
        }
        this.v = viewGroup;
    }

    private Uri a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("61dafaaa", new Object[]{this, uri, str, str2});
        }
        if (uri == null || str == null || str2 == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        buildUpon.clearQuery();
        for (String str3 : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str3);
            if (str.equals(str3)) {
                buildUpon.appendQueryParameter(str3, str2);
                z = true;
            } else {
                buildUpon.appendQueryParameter(str3, queryParameter);
            }
        }
        if (!z) {
            buildUpon.appendQueryParameter(str, str2);
        }
        return buildUpon.build();
    }

    private void l() {
        Uri data;
        Uri a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (aa.bi()) {
            this.b = new com.taobao.taolive.room.controller2.m(this, getIntent());
        } else {
            this.b = new com.taobao.taolive.room.controller2.h(this, getIntent());
        }
        if (this.b.j() != null) {
            this.p.a(this.b.j());
        }
        this.b.l(true);
        this.b.a(new com.taobao.taolive.room.controller2.f() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.controller2.f
            public void a(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                }
            }

            @Override // com.taobao.taolive.room.controller2.f
            public void b(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("41e3e87c", new Object[]{this, map});
                }
            }

            {
                TaoLiveVideoActivity.this = this;
            }
        });
        this.b.a(new View.OnClickListener() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TaoLiveVideoActivity.j(TaoLiveVideoActivity.this)) {
                } else {
                    TaoLiveVideoActivity.f(TaoLiveVideoActivity.this).c();
                }
            }
        });
        final TBPublicMenu publicMenu = getPublicMenu();
        this.b.b(new View.OnClickListener() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBPublicMenu tBPublicMenu = publicMenu;
                if (tBPublicMenu == null) {
                    return;
                }
                tBPublicMenu.show();
                publicMenu.addOnShareMenuClickListener(TaoLiveVideoActivity.k(TaoLiveVideoActivity.this));
                publicMenu.setDefaultPublicMenuClickListener(TaoLiveVideoActivity.k(TaoLiveVideoActivity.this));
            }
        });
        if (psm.K()) {
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            builder.setTitle("킊:直播举报").setMenuNeedtoBeClosedAfterItemClicked(true).setName("live_report").setId(R.id.taolive_global_report);
            TBPublicMenuItem build = builder.build();
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            if (build != null) {
                arrayList.add(build);
            }
            publicMenu.removeCustomMenuItemsByType("report");
            publicMenu.clearExternalMenus();
            publicMenu.addExternalMenus(arrayList, this.w);
        }
        this.b.a(new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                    return;
                }
                if (!TextUtils.isEmpty(str) && aa.i()) {
                    str = str.replace(com.taobao.taolive.room.utils.y.TAOLIVE_ONLINE_LIVE_ID, "id=" + aa.C());
                }
                if (TextUtils.isEmpty(str)) {
                    str = com.taobao.taolive.room.utils.c.a(str2);
                }
                String replace = str.replace("forceRefresh=true", "forceRefresh=false");
                if (aa.bk()) {
                    replace = replace.replace("needRecommend=true", "id=" + str2);
                }
                com.taobao.taolive.room.utils.s.a(view.getContext(), replace, null, 67108864, false);
            }
        });
        if (this.b.j() == null) {
            return;
        }
        if (getIntent() != null && (data = getIntent().getData()) != null && (a2 = a(data, aw.PARAM_IS_LIVE_MUTE, String.valueOf(this.b.j().r()))) != null) {
            getIntent().setData(a2);
        }
        this.b.j().a(this.z);
    }

    private void m() {
        com.taobao.taolive.room.controller2.d dVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!psm.p() || (dVar = this.b) == null || !dVar.e() || (viewGroup = this.v) == null) {
        } else {
            viewGroup.removeAllViews();
            this.v.setId(View.generateViewId());
            l();
            com.taobao.taolive.room.controller2.d dVar2 = this.b;
            if (dVar2 != null && dVar2.j() != null) {
                this.b.j().c(true);
            }
            this.v.addView(this.b.a());
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        ap.b = System.currentTimeMillis();
        ap.e = true;
        this.B = false;
        this.m = b.d(intent);
        boolean c = b.c(intent);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onNewIntent isAfcColdContext " + this.j + " isAfcContextCallback " + this.k + " mIsNewIntentAfcColdContext " + this.m + " isAfcContextCallback " + c);
        if (this.j) {
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.j));
            hashMap.put("isAfcContextCallback", String.valueOf(this.k));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.m));
            hashMap.put("isAfcContextCallbackNewIntent", String.valueOf(c));
            ai.a(n.a(), "IsAfcColdContext_newIntent2", (Map<String, String>) hashMap);
        }
        if (this.j && this.m && c) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onNewIntent return mIsAfcContextCallback " + this.k);
            if (this.k) {
                return;
            }
            a(intent.getDataString(), true);
            return;
        }
        if (intent != null) {
            setIntent(intent);
            Uri data = intent.getData();
            if (data != null) {
                z = data.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false);
            }
        }
        if (this.b != null) {
            m();
            this.b.a(intent, z);
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null || dVar.j() == null) {
            return;
        }
        poz.n(true, (com.taobao.taolive.sdk.core.g) this.b.j());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        e.h();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.onConfigurationChanged(configuration);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        ac.a(f21500a, "onStart");
        if (!this.B) {
            x();
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onStart isAfcColdContext " + this.j + " isAfcContextCallback " + this.k + " mIsNewIntentAfcColdContext " + this.m);
        ac.a();
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        if (!dVar.P()) {
            m();
        }
        this.b.onResume();
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (getIntent() == null || !D()) {
        } else {
            final double currentTimeMillis = System.currentTimeMillis();
            final Uri data = getIntent().getData();
            final String stringExtra = getIntent().getStringExtra("newLiveSession");
            Coordinator.execute(new Runnable() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (data == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("action", str);
                        hashMap.put("currentTimeOpt", String.valueOf(currentTimeMillis));
                        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, String.valueOf(data.getQueryParameter("id")));
                        hashMap.put("livesource", data.getQueryParameter("livesource"));
                        hashMap.put("deviceLevel", String.valueOf(k.a()));
                        hashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                        hashMap.put("liveSession", String.valueOf(stringExtra));
                        hashMap.put(aw.PARAM_PLAY_MODE, data.getQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN));
                        ai.a((a) null, "NewArchitecturePlayStart", (Map<String, String>) hashMap);
                    }
                }
            });
            ab.c("TBLiveOpt_" + str, String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ac.a("super.onResume");
        super.onResume();
        Trace.endSection();
        ac.a(f21500a, "onResume");
        b("onResumeStart");
        if (ply.aa()) {
            a((Activity) this, false);
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onResume isAfcColdContext " + this.j + " isAfcContextCallback " + this.k + " mIsNewIntentAfcColdContext " + this.m);
        if (this.j) {
            if (!this.l) {
                ai.a((a) null, this);
                this.l = true;
            }
        } else {
            ai.a((a) null, this);
        }
        b("onResumeEnd");
        if (!this.B) {
            y();
        } else {
            H();
        }
        ac.a();
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.taobao.taolive.room.-$$Lambda$TaoLiveVideoActivity$N_Dnd8eaytJgmKZSyCpVrFtAW1A
            {
                TaoLiveVideoActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaoLiveVideoActivity.lambda$N_Dnd8eaytJgmKZSyCpVrFtAW1A(TaoLiveVideoActivity.this);
            }
        };
        if (akt.b() <= 20.0f && u.w()) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.taolive.room.-$$Lambda$TaoLiveVideoActivity$wugtRD0hoHV-LgE-Q9AsQrHi9u0
                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    TaoLiveVideoActivity.m1373lambda$wugtRD0hoHVLgEQ9AsQrHi9u0(TaoLiveVideoActivity.this, runnable, j);
                }
            });
        } else {
            this.d.postAtFrontOfQueue(runnable);
        }
    }

    public /* synthetic */ void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        MediaData mediaData = this.C;
        if (mediaData == null) {
            mediaData = com.taobao.taolive.sdk.model.common.a.a(JSON.parseObject(this.E));
        }
        a(getIntent(), mediaData, this.c);
    }

    public /* synthetic */ void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else {
            this.d.postAtFrontOfQueue(runnable);
        }
    }

    private void a(Activity activity, boolean z) {
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{this, activity, new Boolean(z)});
        } else if (activity == null || activity.getWindow() == null || (decorView = activity.getWindow().getDecorView()) == null) {
        } else {
            if (z) {
                decorView.setSystemUiVisibility(9216);
                return;
            }
            decorView.setSystemUiVisibility(1280);
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            getWindow().setStatusBarColor(0);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ac.a(f21500a, "onPause");
        if (isFinishing() && pmd.a().e() != null) {
            pbt.a().f32558a.a("liveRoom", "Page_TaobaoLiveWatch", pmd.a().e().a((Activity) this));
        }
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "onPause isAfcColdContext " + this.j + " isAfcContextCallback " + this.k + " mIsNewIntentAfcColdContext " + this.m);
        super.onPause();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null) {
            dVar.i();
            this.b.onPause();
        }
        if (u.aD()) {
            com.taobao.taolive.sdk.monitor.b.b().a();
        }
        if (!j()) {
            if (this.j) {
                if (this.m && this.l) {
                    ai.b((a) null, this);
                    this.l = false;
                }
            } else {
                ai.b((a) null, this);
            }
        }
        com.ut.mini.r.setUtVariables("Page_TaobaoLiveWatch");
        ac.a();
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        ai.a(dVar != null ? dVar.j() : null, this, "Page_TaobaoLiveWatch");
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f42b3", new Object[]{this});
            return;
        }
        super.onPostResume();
        if (this.B) {
            return;
        }
        z();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IMediaPlayer iMediaPlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ac.a(f21500a, MessageID.onStop);
        if (this.j && this.o && (iMediaPlayer = this.s) != null && iMediaPlayer.l()) {
            this.s.i();
            this.s = null;
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null) {
            dVar.onStop();
        }
        if (!j() && this.j && this.l) {
            ai.b((a) null, this);
            this.l = false;
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.j));
            hashMap.put("isAfcContextCallback", String.valueOf(this.k));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.m));
            ai.a(n.a(), "IsAfcColdContext_onStop_pageDisAppear", (Map<String, String>) hashMap);
        }
        ac.a();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.p.c();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IUniversalProxy.d volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ac.a(f21500a, MessageID.onDestroy);
        this.p.d();
        getPanguApplication().unregisterCrossActivityLifecycleCallback(this.G);
        this.v = null;
        pez pezVar = this.g;
        if (pezVar != null) {
            pezVar.b();
        }
        RecentlyOftenWatchService.a().d();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null) {
            dVar.onDestroy();
        }
        b((Activity) this);
        if (this.q != null) {
            LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(this.q);
            this.q = null;
        }
        com.taobao.taolive.room.controller2.d dVar2 = this.b;
        if (dVar2 != null && dVar2.j() != null) {
            poz.n(true, (com.taobao.taolive.sdk.core.g) this.b.j());
            poz.Q("", this.b.j());
        }
        com.taobao.taolive.room.pre.a.a().b();
        if (com.taobao.android.live.plugin.proxy.f.o() != null && (volumeChangeUploadManager = com.taobao.android.live.plugin.proxy.f.o().getVolumeChangeUploadManager()) != null) {
            volumeChangeUploadManager.a();
        }
        com.taobao.android.live.plugin.proxy.c.a().f();
        G();
        ddw.a().a(this);
        this.d.removeCallbacks(null);
        ac.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        if (i == 20000) {
            dVar.f();
        } else if (i == 20001) {
            dVar.g();
        } else if (i != 10000) {
        } else {
            if (i2 == 8) {
                dVar.a(false);
            } else if (i2 != 1) {
            } else {
                dVar.a(true);
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            a a2 = n.a();
            if (a2 == null || !aa.di() || !a2.W()) {
                z = true;
            }
            if (z && n()) {
                return true;
            }
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null && dVar.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    private boolean a(String str, boolean z) {
        String str2;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        this.n = false;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (TextUtils.equals("/tbopen/index.html", parse.getPath())) {
                String queryParameter = parse.getQueryParameter("h5Url");
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                parse = Uri.parse(queryParameter);
                str2 = queryParameter;
                z2 = true;
            } else {
                str2 = str;
                z2 = false;
            }
            if (parse != null && !TextUtils.equals("/taolive/video.html", parse.getPath()) && !TextUtils.equals("/act/talent/live.html", parse.getPath())) {
                if (z) {
                    ai.b((a) null, this);
                    this.n = true;
                }
                NotifyApm.a().a(this);
                finish(true);
                Nav.from(this).toUri(str2);
                overridePendingTransition(0, 0);
                HashMap hashMap = new HashMap();
                hashMap.put("url_intent", str2);
                ai.a(n.a(), "IsAfcColdContext_newIntent_Nav", (Map<String, String>) hashMap);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, f21500a + "_APM", "changeUrlNav " + str2);
                return true;
            } else if (z2 && parse != null) {
                Intent intent = getIntent();
                intent.setData(parse);
                setIntent(intent);
            }
        }
        return false;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.j) {
            if (this.t) {
                return false;
            }
            this.t = true;
            plk.a(getApplicationContext(), "亲，不再看一会儿了吗？");
            return true;
        } else if (aa.dj()) {
            return false;
        } else {
            return a(new ISmartLandingProxy.a() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.21
                {
                    TaoLiveVideoActivity.this = this;
                }
            });
        }
    }

    private boolean a(ISmartLandingProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adf3bb93", new Object[]{this, aVar})).booleanValue();
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null && dVar.j() != null && this.b.j().F != null && this.b.j().F.f()) {
            return this.b.j().F.a("leave", aVar);
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        pez pezVar = this.g;
        if (pezVar != null && (menu instanceof android.support.v7.view.menu.e)) {
            pezVar.a(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        pez pezVar = this.g;
        if (pezVar != null && pezVar.a(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        pez pezVar = this.g;
        if (pezVar != null) {
            pezVar.b(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT < 19) {
            return;
        }
        View decorView = getWindow().getDecorView();
        if (ply.aa()) {
            decorView.setSystemUiVisibility(1280);
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            getWindow().setStatusBarColor(0);
            return;
        }
        decorView.setSystemUiVisibility(5376);
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        pez pezVar = this.g;
        if (pezVar == null) {
            return null;
        }
        return pezVar.a();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            setTheme(R.style.Theme_NoBackgroundAndOverLayingActionBar_Taobao);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (pmd.a().d() == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enableInitUCCoreOrange", "true");
            hashMap.put("isNeedShowH5LiveSourceBlackList", "");
            hashMap.put("isNeedShowH5EntryLiveSourceBlackList", "");
            hashMap.put("enableSimpleTrackPageFeedId", "true");
            hashMap.put("enableLiveAndHomeMixOrange", "true");
            hashMap.put("liveAndHomeMixTemplate", "taolive_home_and_live_tab");
            hashMap.put("liveAndHomeMixTemplateHeight", "40");
            hashMap.put("enableKandianRecommendPopView", "true");
            hashMap.put("enablePreLoadVideoSimpleData", "true");
            hashMap.put("closeAsyncStartUpOrg1", "true");
            pmd.a().d().a("tblive", hashMap);
        }
    }

    @Override // tb.rmx
    public void a(fmg fmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d31258", new Object[]{this, fmgVar});
        } else {
            this.x.add(fmgVar);
        }
    }

    @Override // tb.qzp
    public void a(dlx dlxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56303e8", new Object[]{this, dlxVar});
        } else {
            this.y.add(dlxVar);
        }
    }

    @Override // tb.fmg
    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator<fmg> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(str, jSONObject);
        }
    }

    @Override // tb.dlx
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        Iterator<dlx> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(jSONObject);
        }
    }

    @Override // tb.dlx
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator<dlx> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(str, jSONObject);
        }
    }

    private boolean a(Uri uri) {
        String queryParameter;
        tno d;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue() : (uri == null || RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(uri.getQueryParameter(aw.PARAM_PRODUCT_TYPE)) || (queryParameter = uri.getQueryParameter("id")) == null || (d = tnn.a().d(queryParameter)) == null || (d.b == null && d.c == null)) ? false : true;
    }

    private boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter(aw.PARAM_NEED_RECOMMEND);
        String queryParameter2 = uri.getQueryParameter("id");
        String queryParameter3 = uri.getQueryParameter("livesource");
        if (queryParameter2 != null || queryParameter3 == null || !Boolean.parseBoolean(queryParameter)) {
            return false;
        }
        com.taobao.taolive.room.pre.a a2 = com.taobao.taolive.room.pre.a.a();
        return a2.b(com.taobao.taolive.room.pre.a.PRE_CREATE_ROOM_REC + queryParameter3);
    }

    private boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().a("tblive", "handleLiveMethodCreateFix", "true"));
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().a("tblive", "enableCaptureObserver", "true"));
    }

    private void F() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (!B() || (data = getIntent().getData()) == null) {
        } else {
            this.D = new MediaCaptureObserver(this, String.valueOf(data.getQueryParameter("id")));
            this.D.a(new MediaCaptureObserver.a() { // from class: com.taobao.taolive.room.TaoLiveVideoActivity.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TaoLiveVideoActivity.this = this;
                }

                @Override // com.taobao.taolive.sdk.utils.MediaCaptureObserver.a
                public void a(List<MediaCaptureObserver.CapatureData> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    } else if (pmd.a().e() == null) {
                    } else {
                        try {
                            HashMap hashMap = new HashMap();
                            String jSONString = JSON.toJSONString(list);
                            hashMap.put("screenShots", jSONString);
                            pmd.a().e().a(TaoLiveVideoActivity.this, hashMap);
                            String b = TaoLiveVideoActivity.b();
                            q.b(b, "上报截屏/录屏数据成功：" + jSONString);
                        } catch (Exception e) {
                            String b2 = TaoLiveVideoActivity.b();
                            q.b(b2, "上报截屏/录屏数据失败：" + e);
                        }
                    }
                }
            });
        }
    }

    private void G() {
        MediaCaptureObserver mediaCaptureObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else if (!B() || (mediaCaptureObserver = this.D) == null) {
        } else {
            mediaCaptureObserver.a();
        }
    }
}
