package com.taobao.android.detail2.core.framework.floatwindow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import com.taobao.utils.Global;
import tb.fjl;
import tb.fjt;
import tb.flb;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "action.com.taobao.taolive.room.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";

    /* renamed from: a */
    private Context f11542a;
    private flb b;
    private int d;
    private int e;
    private FloatWindow f;
    private boolean c = false;
    private a.b g = new a.b() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            fjt.b("FloatingVideoManager", "addApmEventListener: " + i);
            if (i == 1) {
                b.b(b.this).post(new Runnable() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.this.b();
                        if (b.a(b.this) == null) {
                            return;
                        }
                        b.a(b.this).j();
                    }
                });
            } else if (i != 2) {
            } else {
                b.b(b.this).post(new Runnable() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.c(b.this);
                        b.this.c();
                    }
                });
            }
        }
    };
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.floatwindow.FloatingVideoManager$2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            fjt.b("FloatingVideoManager", "mVideoReceiver: " + intent.getAction());
            b.this.b();
            if (b.a(b.this) != null) {
                b.a(b.this).j();
            }
            b.this.d();
        }
    };
    private z i = new z() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // com.taobao.avplayer.common.z
        public boolean hook() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
            }
            b.d(b.this);
            return false;
        }
    };
    private View.OnClickListener j = new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                b.d(b.this);
            }
        }
    };
    private View.OnClickListener k = new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b.this.b();
            if (b.a(b.this) == null) {
                return;
            }
            b.a(b.this).j();
        }
    };
    private View.OnClickListener l = new View.OnClickListener() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (b.a(b.this) == null) {
            } else {
                b.a(b.this).i();
            }
        }
    };
    private av m = new av() { // from class: com.taobao.android.detail2.core.framework.floatwindow.b.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            b.this = this;
        }

        @Override // com.taobao.avplayer.av
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else if (b.b(b.this) == null) {
            } else {
                b.b(b.this).onPlayStatus();
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else if (b.b(b.this) == null || z) {
            } else {
                b.b(b.this).onPauseStatus();
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else if (b.b(b.this) == null) {
            } else {
                b.b(b.this).onPlayStatus();
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                return;
            }
            fjt.b("FloatingVideoManager", "onVideoSeekTo:" + i);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
                return;
            }
            fjt.b("FloatingVideoManager", "onVideoPrepared " + obj);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            fjt.b("FloatingVideoManager", "onVideoError: " + i + "," + i2);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoInfo(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                return;
            }
            fjt.b("FloatingVideoManager", "onVideoInfo:" + obj);
        }

        @Override // com.taobao.avplayer.av
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                fjt.b("FloatingVideoManager", "onVideoComplete");
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                fjt.b("FloatingVideoManager", "onVideoClose");
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoFullScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            } else {
                fjt.b("FloatingVideoManager", "onVideoFullScreen");
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoNormalScreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            } else {
                fjt.b("FloatingVideoManager", "onVideoNormalScreen");
            }
        }

        @Override // com.taobao.avplayer.av
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (b.b(b.this) == null) {
            } else {
                b.b(b.this).setProgress(i, i3);
            }
        }
    };

    static {
        kge.a(-1335494405);
    }

    public static /* synthetic */ flb a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flb) ipChange.ipc$dispatch("d5bb09b0", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ FloatWindow b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindow) ipChange.ipc$dispatch("638ce501", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6e05f8", new Object[]{bVar});
        } else {
            bVar.f();
        }
    }

    public static /* synthetic */ void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fac7597", new Object[]{bVar});
        } else {
            bVar.s();
        }
    }

    public b(Context context, flb flbVar) {
        this.f11542a = context;
        this.b = flbVar;
        this.f = new FloatWindow(context.getApplicationContext());
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        flb flbVar = this.b;
        if (flbVar == null) {
            return;
        }
        flbVar.d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        i();
        g();
        j();
        r();
        p();
        q();
        n();
        c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.application.common.c.a(this.g);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            com.taobao.application.common.c.b(this.g);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.c) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction("action.com.taobao.taolive.room.start");
            Global.getApplication().registerReceiver(this.h, intentFilter);
            this.c = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f;
        if (floatWindow != null) {
            floatWindow.setVisibility(8);
        }
        flb flbVar = this.b;
        if (flbVar != null) {
            flbVar.e();
        }
        d.f11554a = false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        FloatWindow floatWindow = this.f;
        if (floatWindow == null) {
            return;
        }
        floatWindow.setVisibility(0);
        flb flbVar = this.b;
        if (flbVar != null) {
            if (flbVar.g() == 1) {
                this.f.onPlayStatus();
            } else {
                this.f.onPauseStatus();
            }
        }
        d.f11554a = true;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        View view = null;
        flb flbVar = this.b;
        if (flbVar != null) {
            view = flbVar.h();
        }
        if (view == null) {
            return;
        }
        k();
        a(view);
        FloatWindow floatWindow = this.f;
        if (floatWindow == null) {
            return;
        }
        floatWindow.addVideoView(view);
    }

    private void k() {
        double d;
        double d2;
        double d3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        flb flbVar = this.b;
        if (flbVar != null) {
            d = flbVar.h().getWidth();
            d2 = this.b.h().getHeight();
        } else {
            d = 0.0d;
            d2 = 0.0d;
        }
        if (d2 == mto.a.GEO_NOT_SUPPORT || d == mto.a.GEO_NOT_SUPPORT) {
            d2 = m();
            d = l();
        }
        double l = (l() * 4.0d) / 15.0d;
        double d4 = d / d2;
        if (Math.abs(d4 - 1.7777777777777777d) < 0.1d) {
            l = (16.0d * l) / 9.0d;
            d3 = l;
        } else {
            if (Math.abs(d4 - 1.0d) < 0.1d) {
                l = (l * 6.0d) / 5.0d;
            } else if (Math.abs(d4 - 0.075d) < 0.1d) {
                d3 = (4.0d * l) / 3.0d;
            } else if (Math.abs(d4 - 0.5625d) < 0.1d) {
                d3 = (16.0d * l) / 9.0d;
            }
            d3 = l;
        }
        this.d = (int) l;
        this.e = (int) d3;
        flb flbVar2 = this.b;
        if (flbVar2 == null) {
            return;
        }
        flbVar2.a(this.d, this.e);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    private int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : fjl.a(Global.getApplication());
    }

    private int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : fjl.b(Global.getApplication());
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            WindowManager windowManager = (WindowManager) Global.getApplication().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager == null) {
                return;
            }
            a(this.f);
            windowManager.addView(this.f, o());
        } catch (Exception e) {
            fjt.a("FloatingVideoManager", "showFloatingView fail", e);
        }
    }

    private WindowManager.LayoutParams o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager.LayoutParams) ipChange.ipc$dispatch("7152f686", new Object[]{this}) : a.a(this.d, this.e);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        flb flbVar = this.b;
        if (flbVar == null) {
            return;
        }
        flbVar.a(this.m);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        flb flbVar = this.b;
        if (flbVar == null) {
            return;
        }
        flbVar.a(this.i);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.f.setOnClickListener(this.j);
        this.f.setCloseOnClickListener(this.k);
        this.f.setPlayPauseOnClickListener(this.l);
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        Context context = this.f11542a;
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, context.getClass());
        intent.setFlags(603979776);
        this.f11542a.startActivity(intent);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            WindowManager windowManager = (WindowManager) Global.getApplication().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
            if (windowManager != null) {
                a(this.b.h());
                windowManager.removeView(this.f);
            }
        } catch (Exception e) {
            fjt.a("FloatingVideoManager", "closeFloatingView fail", e);
        }
        t();
        h();
        FloatWindow floatWindow = this.f;
        if (floatWindow != null) {
            floatWindow.destroy();
        }
        this.f11542a = null;
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (!this.c) {
        } else {
            Global.getApplication().unregisterReceiver(this.h);
            this.c = false;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b();
        d();
        flb flbVar = this.b;
        if (flbVar == null) {
            return;
        }
        flbVar.f();
    }
}
