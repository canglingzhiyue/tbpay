package com.taobao.taolive.room.controller2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.ui.component.VideoFrameErrorController;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.uc.webview.export.media.MessageID;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.poy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AutoDownController";

    /* renamed from: a  reason: collision with root package name */
    private Context f21590a;
    private g b;
    private Handler c;
    private Runnable d = new Runnable() { // from class: com.taobao.taolive.room.controller2.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a(a.this)) {
            } else {
                a.a(a.this, "AUTO_DOWN");
                ddw.a().a(VideoFrameErrorController.EVENT_AUTO_DOWN, a.b(a.this).d, a.this.l);
            }
        }
    };
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private int k;
    public String l;

    static {
        kge.a(-827136570);
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i == -5 || i == -57 || i == -9999;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752ab1b", new Object[]{aVar, str});
        } else {
            aVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ddee395", new Object[]{aVar})).booleanValue() : aVar.k();
    }

    public static /* synthetic */ g b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7f822b53", new Object[]{aVar}) : aVar.b;
    }

    public a(g gVar, Context context) {
        this.l = null;
        this.b = gVar;
        g gVar2 = this.b;
        if (gVar2 != null) {
            this.l = gVar2.G();
        }
        this.f21590a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (k()) {
        } else {
            a("onWillAppear");
            this.e = false;
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (k()) {
        } else {
            a("onDidAppear");
            this.f = true;
            j();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (k()) {
        } else {
            a("onWillDisappear");
            i();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (k()) {
        } else {
            a("onDidDisappear");
            i();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a(MessageID.onDestroy);
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = 0;
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.d);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (k()) {
        } else {
            a("onIsReplay hasAutoDown = " + this.e);
            this.g = true;
            j();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (k()) {
        } else {
            a("onError errCode = " + i + " hasAutoDown = " + this.e);
            this.h = true;
            this.k = i;
            j();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (k()) {
        } else {
            a("onAnchorLeave hasAutoDown = " + this.e);
            this.i = true;
            j();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (k()) {
        } else {
            a("onLiveEnd hasAutoDown = " + this.e);
            this.j = true;
            j();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (k()) {
            a("tryShowToast isClose");
        } else if (this.e) {
            a("tryShowToast hasAutoDown = true");
        } else if (this.b.w() == null || !this.b.w().isFirst) {
            a("tryShowToast isFirst = true");
        } else if (!this.f) {
            a("tryShowToast hasDidAppear = false");
        } else if (poy.W(this.b) == 1) {
            a("tryShowToast isUp");
        } else if (this.h) {
            if (b(this.k) || !com.taobao.taolive.sdk.utils.b.e(this.f21590a)) {
                return;
            }
            a("3s后为你播放下一个直播", false);
            Handler handler = this.c;
            if (handler != null) {
                handler.postDelayed(this.d, 3000L);
            }
            this.e = true;
        } else if (this.g) {
            a("3s后为你播放下一个直播", false);
            Handler handler2 = this.c;
            if (handler2 != null) {
                handler2.postDelayed(this.d, 3000L);
            }
            this.e = true;
        } else if (this.i) {
            a("3s后为你播放下一个直播", false);
            Handler handler3 = this.c;
            if (handler3 != null) {
                handler3.postDelayed(this.d, 3000L);
            }
            this.e = true;
        } else if (!this.j) {
        } else {
            a("直播已结束，3s后播放下一个直播", true);
            Handler handler4 = this.c;
            if (handler4 != null) {
                handler4.postDelayed(this.d, 3000L);
            }
            this.e = true;
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        Toast makeText = Toast.makeText(this.f21590a, str, 1);
        if (z) {
            makeText.setGravity(17, 0, 0);
        }
        makeText.show();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (pmd.a().m() == null || this.b == null) {
        } else {
            pnj m = pmd.a().m();
            m.a(TAG, this.b.j() + " - " + str);
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        g gVar = this.b;
        return (gVar != null && !"fullLive".equals(gVar.v())) || !aa.bB() || com.taobao.taolive.sdk.playcontrol.c.i(this.b) != VideoStatus.VIDEO_NORMAL_STATUS;
    }
}
