package com.taobao.android.fluid.framework.media.miniwindow;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.obu;
import tb.sjq;
import tb.snv;
import tb.spy;
import tb.suz;

/* loaded from: classes5.dex */
public class f implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "action.com.taobao.taolive.room.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a */
    private static volatile f f12591a;
    private FluidContext c;
    private Activity d;
    private d e;
    private snv f;
    private int l;
    private final Map<String, Object> b = new HashMap();
    private boolean g = false;
    private boolean h = false;
    private final a i = new a() { // from class: com.taobao.android.fluid.framework.media.miniwindow.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            f.this = this;
        }

        @Override // com.taobao.android.fluid.framework.media.miniwindow.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (b.a(activity) || !f.a(f.this)) {
            } else {
                if ((f.b(f.this) || Build.VERSION.SDK_INT < 21) && f.c(f.this) != null) {
                    f.c(f.this).b();
                    f.a(f.this, false);
                }
                f.this.d();
                f.b(f.this, false);
            }
        }

        @Override // com.taobao.android.fluid.framework.media.miniwindow.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else if (!b.a(activity) || f.a(f.this)) {
            } else {
                if (f.c(f.this) != null && f.c(f.this).e() == 1) {
                    f.a(f.this, true);
                }
                f.this.c();
                f.b(f.this, true);
            }
        }
    };
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.media.miniwindow.FloatingVideoManager$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                if (f.a(f.this)) {
                    return;
                }
                if (f.c(f.this) != null && f.c(f.this).e() == 1) {
                    f.a(f.this, true);
                }
                f.this.c();
            } else if (!"android.intent.action.USER_PRESENT".equals(action) || f.a(f.this)) {
            } else {
                if ((f.b(f.this) || Build.VERSION.SDK_INT < 21) && f.c(f.this) != null) {
                    f.c(f.this).b();
                    f.a(f.this, false);
                }
                f.this.d();
            }
        }
    };
    private boolean k = false;
    private final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.media.miniwindow.FloatingVideoManager$3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            f.this.c();
            f.this.b();
        }
    };

    static {
        kge.a(-1862652084);
        kge.a(688755897);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("587560cb", new Object[]{fVar})).booleanValue() : fVar.g;
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6376af1", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.h = z;
        return z;
    }

    public static /* synthetic */ boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e792c2a", new Object[]{fVar})).booleanValue() : fVar.h;
    }

    public static /* synthetic */ boolean b(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70ad0b72", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.g = z;
        return z;
    }

    public static /* synthetic */ snv c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("a5d9c146", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ Activity d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("86468e44", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ FluidContext e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("598abc25", new Object[]{fVar}) : fVar.c;
    }

    private f() {
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("dc8f08c7", new Object[0]);
        }
        if (f12591a == null) {
            synchronized (f.class) {
                if (f12591a == null) {
                    f12591a = new f();
                }
            }
        }
        return f12591a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Application e = obu.e();
        try {
            WindowManager windowManager = (WindowManager) e.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager != null) {
                ViewGroup f = this.f.f();
                if (f != null && f.getParent() != null) {
                    ((ViewGroup) f.getParent()).removeView(f);
                }
                windowManager.removeView(this.e.b());
            }
        } catch (Throwable th) {
            Log.e(getClass().getSimpleName(), th.toString());
        }
        if (this.k) {
            e.unregisterReceiver(this.m);
            e.unregisterReceiver(this.j);
            obu.e().unregisterActivityLifecycleCallbacks(this.i);
            this.k = false;
        }
        d dVar = this.e;
        if (dVar != null) {
            dVar.a();
            this.e = null;
        }
        this.d = null;
        f12591a = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = this.e;
        if (dVar != null && dVar.b() != null) {
            this.e.b().setVisibility(8);
        }
        snv snvVar = this.f;
        if (snvVar == null) {
            return;
        }
        snvVar.c();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        d dVar = this.e;
        if (dVar == null || dVar.b() == null) {
            return;
        }
        this.e.b().play();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.e;
        if (dVar == null || dVar.b() == null || z) {
            return;
        }
        this.e.b().pause();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        d dVar = this.e;
        if (dVar == null || dVar.b() == null) {
            return;
        }
        this.e.b().play();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        d dVar = this.e;
        if (dVar != null && dVar.b() != null) {
            this.e.b().setProgress(i, i3);
        }
        int i4 = i / 1000;
        if (this.l == i4) {
            return;
        }
        this.l = i4;
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null || (a2 = currentMediaSetData.a()) == null) {
            return;
        }
        String str = a2.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put("state", suz.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
        this.b.put("totalTime", String.valueOf(i3 / 1000));
        this.b.put("currentTime", String.valueOf(this.l));
        ((IMessageService) this.c.getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, str, this.b));
    }

    public void a(final Activity activity, final snv snvVar, FluidContext fluidContext) {
        sjq sjqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f41f81", new Object[]{this, activity, snvVar, fluidContext});
            return;
        }
        this.d = activity;
        this.c = fluidContext;
        e();
        if (snvVar == null) {
            return;
        }
        this.f = snvVar;
        final Application e = obu.e();
        if (this.e == null) {
            this.e = new d(e);
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaSetData();
        a.c cVar = null;
        if (currentMediaSetData != null) {
            cVar = currentMediaSetData.a();
        }
        if (cVar == null) {
            sjqVar = new sjq(0, 0);
        } else {
            sjqVar = new sjq(cVar.K(), cVar.q());
        }
        this.e.a(snvVar, sjqVar);
        FloatWindow b = this.e.b();
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.media.miniwindow.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (f.d(f.this) != null) {
                        Intent intent = new Intent(e, activity.getClass());
                        intent.setFlags(603979776);
                        f.d(f.this).startActivity(intent);
                    }
                    com.taobao.android.fluid.business.usertrack.track.b.e(f.e(f.this));
                }
            });
            this.f.a(new z() { // from class: com.taobao.android.fluid.framework.media.miniwindow.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // com.taobao.avplayer.common.z
                public boolean hook() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                    }
                    if (f.d(f.this) != null) {
                        Intent intent = new Intent(e, activity.getClass());
                        intent.setFlags(603979776);
                        f.d(f.this).startActivity(intent);
                    }
                    com.taobao.android.fluid.business.usertrack.track.b.e(f.e(f.this));
                    return false;
                }
            });
            b.setCloseOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.media.miniwindow.f.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    f.this.c();
                    com.taobao.android.fluid.business.usertrack.track.b.f(f.e(f.this));
                }
            });
            b.setPlayPauseOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.fluid.framework.media.miniwindow.f.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (snvVar.e() == 1) {
                        snvVar.c();
                        com.taobao.android.fluid.business.usertrack.track.b.e(f.e(f.this), true);
                    } else {
                        snvVar.b();
                        com.taobao.android.fluid.business.usertrack.track.b.e(f.e(f.this), false);
                    }
                }
            });
        }
        snvVar.a(this);
        try {
            WindowManager windowManager = (WindowManager) e.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager != null) {
                FloatWindow b2 = this.e.b();
                if (b2.getParent() != null) {
                    ((ViewGroup) b2.getParent()).removeView(b2);
                }
                windowManager.addView(this.e.b(), this.e.c());
            }
        } catch (Throwable th) {
            Log.e(getClass().getSimpleName(), th.toString());
        }
        d();
        com.taobao.android.fluid.business.usertrack.track.b.g(this.c);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        d dVar = this.e;
        if (dVar == null || dVar.b() == null) {
            return;
        }
        this.e.b().setVisibility(0);
        snv snvVar = this.f;
        if (snvVar == null) {
            return;
        }
        if (snvVar.e() == 1) {
            this.e.b().play();
        } else {
            this.e.b().pause();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Application e = obu.e();
        if (this.k) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.avplayer.start");
        intentFilter.addAction("action.com.taobao.taolive.room.start");
        e.registerReceiver(this.m, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_ON");
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        intentFilter2.addAction("android.intent.action.USER_PRESENT");
        e.registerReceiver(this.j, intentFilter2);
        obu.e().registerActivityLifecycleCallbacks(this.i);
        this.k = true;
    }
}
