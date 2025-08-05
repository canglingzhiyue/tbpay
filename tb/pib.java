package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pib {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIDING = 1001;
    public static final int SHOWING = 1000;
    public static final String TAG = "MediaStatusController";

    /* renamed from: a  reason: collision with root package name */
    private int f32673a;
    private String b;
    private long c;
    private long d;
    private boolean e;
    private View f;
    private View g;
    private AliUrlImageView h;
    private pqf i;
    private Handler j;
    private Context k;
    private a l;
    private Runnable m = new Runnable() { // from class: tb.pib.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pib.a(pib.this, "showLoadingTaskReach");
            if (pib.a(pib.this) != 1001) {
                return;
            }
            pib.b(pib.this);
        }
    };
    private Runnable n = new Runnable() { // from class: tb.pib.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pib.a(pib.this, "showToastTaskReach");
            if (pib.c(pib.this) == null || !pib.c(pib.this).getIsLowNetworkForLive() || pib.d(pib.this) == null) {
                return;
            }
            plk.a(pib.d(pib.this), "您的网络环境较差，建议切换网络重试");
            ai.a(pib.e(pib.this), "Show-Toast_Lowtraffic", (HashMap<String, String>) null);
        }
    };

    static {
        kge.a(2093129646);
    }

    public static /* synthetic */ int a(pib pibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9a8e4a2", new Object[]{pibVar})).intValue() : pibVar.f32673a;
    }

    public static /* synthetic */ void a(pib pibVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8f5e0b9", new Object[]{pibVar, str});
        } else {
            pibVar.a(str);
        }
    }

    public static /* synthetic */ void b(pib pibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82beb30", new Object[]{pibVar});
        } else {
            pibVar.i();
        }
    }

    public static /* synthetic */ pqf c(pib pibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqf) ipChange.ipc$dispatch("4b0ce9d0", new Object[]{pibVar}) : pibVar.i;
    }

    public static /* synthetic */ Context d(pib pibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fe45612a", new Object[]{pibVar}) : pibVar.k;
    }

    public static /* synthetic */ a e(pib pibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9b8484e8", new Object[]{pibVar}) : pibVar.l;
    }

    public pib(Context context, View view, a aVar) {
        this.c = 3000L;
        this.d = 7000L;
        a("init");
        this.l = aVar;
        this.k = context;
        this.f = view;
        View view2 = this.f;
        if (view2 != null) {
            this.g = view2.findViewById(R.id.taolive_play_loading_layout);
            this.h = (AliUrlImageView) this.f.findViewById(R.id.taolive_play_loading);
            AliUrlImageView aliUrlImageView = this.h;
            if (aliUrlImageView != null) {
                aliUrlImageView.setSkipAutoSize(true);
                this.h.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01S0YwGI1JTKKkxBwlT_!!6000000001029-54-tps-72-72.apng");
            }
        }
        this.c = aa.aR() * 1000;
        long aS = (aa.aS() * 1000) - this.c;
        if (aS > 0) {
            this.d = aS;
        }
        this.e = aa.aQ();
    }

    public void a(String str, pqf pqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a05e7fd", new Object[]{this, str, pqfVar});
        } else if (!this.e) {
        } else {
            this.b = str;
            a("onWillAppear");
            this.f32673a = 1001;
            View view = this.g;
            if (view != null) {
                view.setVisibility(8);
            }
            this.j = new Handler(Looper.getMainLooper());
            this.i = pqfVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onStartPlay");
            Handler handler = this.j;
            if (handler == null) {
                return;
            }
            handler.postDelayed(this.m, this.c);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onFirstFrame");
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onPlayError");
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onVideoLoading");
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onReceiveAnchorLeavingMsg");
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.e) {
        } else {
            a("onGetLiveDetailFailed");
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.e) {
        } else {
            a("onGetLiveDetailSucc isLiving = " + z);
            if (z) {
                return;
            }
            k();
            if (this.f32673a != 1000) {
                return;
            }
            j();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.e) {
        } else {
            a(MessageID.onDestroy);
            k();
            if (this.f32673a == 1000) {
                j();
            }
            this.j = null;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.e) {
        } else {
            a(DMComponent.RESET);
            k();
            this.f32673a = 1001;
            View view = this.g;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f32673a = 1000;
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
        ai.a(this.l, "Show-Loading_Lowtraffic", (HashMap<String, String>) null);
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.postDelayed(this.n, this.d);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f32673a = 1001;
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.m);
        this.j.removeCallbacks(this.n);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a(TAG, this.b + " - " + str);
        }
    }
}
