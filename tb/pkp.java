package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.ui.media.d;
import com.taobao.taolive.sdk.ui.media.mute.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pkp implements View.OnClickListener, g.a, a.InterfaceC0912a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private Context f32722a;
    private e b;
    private AudioManager c;
    private View d;
    private View e;
    private TUrlImageView f;
    private RelativeLayout g;
    private TextView h;
    private RelativeLayout i;
    private TextView j;
    private TextView k;
    private d l;
    private boolean p;
    private int n = 0;
    private int o = aa.bV();
    private Runnable q = new Runnable() { // from class: tb.pkp.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (pkp.a(pkp.this) <= 0) {
                pkp.f(pkp.this);
            } else {
                pkp.b(pkp.this);
                pkp.a(pkp.this, 1);
                pkp.c(pkp.this);
                pkp.e(pkp.this).postDelayed(pkp.d(pkp.this), 1000L);
            }
        }
    };
    private Runnable r = new Runnable() { // from class: tb.pkp.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pkp.g(pkp.this);
            }
        }
    };
    private Handler m = new Handler(Looper.getMainLooper());

    public static /* synthetic */ int a(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9cb70d6", new Object[]{pkpVar})).intValue() : pkpVar.o;
    }

    public static /* synthetic */ int a(pkp pkpVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fa31e73", new Object[]{pkpVar, new Integer(i)})).intValue();
        }
        pkpVar.n = i;
        return i;
    }

    public static /* synthetic */ int b(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e84e7757", new Object[]{pkpVar})).intValue();
        }
        int i = pkpVar.o;
        pkpVar.o = i - 1;
        return i;
    }

    public static /* synthetic */ void c(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d17de5", new Object[]{pkpVar});
        } else {
            pkpVar.d();
        }
    }

    public static /* synthetic */ Runnable d(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("19930b6e", new Object[]{pkpVar}) : pkpVar.q;
    }

    public static /* synthetic */ Handler e(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("bc34547f", new Object[]{pkpVar}) : pkpVar.m;
    }

    public static /* synthetic */ void f(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25a9168", new Object[]{pkpVar});
        } else {
            pkpVar.i();
        }
    }

    public static /* synthetic */ void g(pkp pkpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dd97e9", new Object[]{pkpVar});
        } else {
            pkpVar.k();
        }
    }

    static {
        kge.a(-1080433670);
        kge.a(-1201612728);
        kge.a(-723077780);
        kge.a(-609918999);
        TAG = pkp.class.getSimpleName();
    }

    public pkp(Context context, View view, e eVar) {
        this.d = view;
        this.f32722a = context;
        this.b = eVar;
        Context context2 = this.f32722a;
        if (context2 != null) {
            this.c = (AudioManager) context2.getSystemService("audio");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!l()) {
        } else {
            a("start");
            if (this.p) {
                a("start hasStart");
            } else if (this.b.r() == null || !this.b.r().isFirst) {
                a("start isFirst = false");
            } else {
                com.taobao.taolive.sdk.controller.e y = this.b.y();
                if (y == null) {
                    a("start globalContext == null");
                } else if (aa.ah().contains(poy.R(this.b))) {
                    a("start is mainSearch");
                } else if (y.l) {
                    a("start hasKeepMute == true");
                } else {
                    y.l = true;
                    if (!y.k) {
                        a("start liveInitialMuted == false");
                    } else if (m() <= 0) {
                        a("start getStreamVolume()<=0");
                    } else {
                        this.p = true;
                        if (this.b.A() != null) {
                            this.l = this.b.A().e();
                        }
                        b(y);
                        n();
                        this.n = 0;
                        c();
                        a(y);
                    }
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!l()) {
        } else {
            a("stop");
            this.n = 0;
            c();
            q();
            this.l = null;
            this.o = aa.bV();
            this.p = false;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        int i = this.n;
        return (i == 0 || i == 4) ? false : true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_keep_mute_icon) {
            int i = this.n;
            if (i == 1 || i == 2) {
                a(false);
                this.n = 3;
                e();
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundopen", (HashMap<String, String>) null);
            } else if (i != 3) {
            } else {
                a(true);
                this.n = 2;
                f();
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundclose", (HashMap<String, String>) null);
            }
        } else if (view.getId() != R.id.taolive_keep_mute_btn || this.n != 1) {
        } else {
            a(true);
            this.n = 2;
            f();
            ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "keepmute", (HashMap<String, String>) null);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.mute.a.InterfaceC0912a
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (i != 100001 || z) {
        } else {
            int i2 = this.n;
            if (i2 != 1 && i2 != 2) {
                return;
            }
            this.n = 3;
            e();
        }
    }

    @Override // com.taobao.taolive.sdk.core.g.a
    public void onGlobalLiveRoomMuteChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            int i = this.n;
            if (i != 1 && i != 2) {
                return;
            }
            this.n = 3;
            e();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a("onStateInit");
        View view = this.e;
        if (view == null || this.g == null || this.k == null || this.i == null) {
            return;
        }
        view.setVisibility(8);
        this.m.removeCallbacks(this.q);
        this.m.removeCallbacks(this.r);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a("onStateShowTip");
        if (this.e == null || this.g == null || this.k == null || this.i == null) {
            return;
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(String.format("%d秒后开启声音", Integer.valueOf(this.o)));
        }
        this.e.setVisibility(0);
        this.g.setVisibility(0);
        o();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a("onStateNotMute");
        if (this.e == null || this.g == null || this.k == null || this.i == null) {
            return;
        }
        this.m.removeCallbacks(this.q);
        this.e.setVisibility(0);
        this.g.setVisibility(8);
        this.k.setText("声音已开启");
        this.i.setVisibility(0);
        o();
        j();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a("onStateMute");
        if (this.e == null || this.g == null || this.k == null || this.i == null) {
            return;
        }
        this.m.removeCallbacks(this.q);
        this.e.setVisibility(0);
        this.g.setVisibility(8);
        this.k.setText("声音已关闭");
        this.i.setVisibility(0);
        o();
        j();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a("onStateDismiss");
        View view = this.e;
        if (view == null || this.g == null || this.k == null || this.i == null) {
            return;
        }
        view.setVisibility(8);
        this.m.removeCallbacks(this.q);
        this.m.removeCallbacks(this.r);
    }

    private void a(com.taobao.taolive.sdk.controller.e eVar) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
            return;
        }
        if (sst.a(this.b)) {
            if (eVar != null) {
                eVar.e(true);
            }
            if (aa.I() && (dVar = this.l) != null) {
                dVar.a(true);
            }
        } else {
            d dVar2 = this.l;
            if (dVar2 != null) {
                dVar2.r(true);
            }
        }
        this.n = 1;
        d();
        this.m.postDelayed(this.q, 1000L);
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "mute_outside", (HashMap<String, String>) null);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        a(false);
        this.n = 3;
        e();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.m.removeCallbacks(this.r);
        this.m.postDelayed(this.r, aa.bW() * 1000);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.n = 4;
        g();
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : (this.b == null || this.f32722a == null || !aa.bU()) ? false : true;
    }

    private int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        AudioManager audioManager = this.c;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(3);
    }

    private void n() {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        if (this.e == null && (viewStub = (ViewStub) this.d.findViewById(R.id.keep_mute_tip_stub)) != null) {
            viewStub.setLayoutResource(R.layout.taolive_keep_mute_layout);
            this.e = viewStub.inflate();
        }
        View view = this.e;
        if (view == null) {
            return;
        }
        this.f = (TUrlImageView) view.findViewById(R.id.taolive_keep_mute_icon);
        TUrlImageView tUrlImageView = this.f;
        if (tUrlImageView != null) {
            tUrlImageView.setOnClickListener(this);
        }
        this.g = (RelativeLayout) this.e.findViewById(R.id.taolive_keep_mute_choose_layout);
        this.h = (TextView) this.e.findViewById(R.id.taolive_keep_mute_btn);
        TextView textView = this.h;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.i = (RelativeLayout) this.e.findViewById(R.id.taolive_keep_mute_ret_layout);
        this.j = (TextView) this.e.findViewById(R.id.taolive_keep_mute_tv);
        this.k = (TextView) this.e.findViewById(R.id.taolive_keep_mute_ret_tv);
        o();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.f == null) {
        } else {
            if (p()) {
                this.f.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01sfNXtM1yvAkpGYlCB_!!6000000006640-2-tps-120-120.png");
            } else {
                this.f.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01HmaGHp1zZ1DEbeXPk_!!6000000006727-2-tps-120-120.png");
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            String str2 = TAG;
            TLog.loge(str2, this.b.j() + " " + str);
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        d dVar = this.l;
        if (dVar == null) {
            return false;
        }
        return dVar.x();
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (sst.a(this.b)) {
            e eVar = this.b;
            if (eVar == null || eVar.M() == null) {
                return;
            }
            this.b.M().a(z);
        } else {
            d dVar = this.l;
            if (dVar == null) {
                return;
            }
            dVar.r(z);
        }
    }

    private void b(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0eb71d", new Object[]{this, eVar});
        } else if (sst.a(this.b)) {
            eVar.a(this);
        } else {
            d dVar = this.l;
            if (dVar == null) {
                return;
            }
            dVar.a(this);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (sst.a(this.b)) {
            e eVar = this.b;
            if (eVar == null || eVar.y() == null) {
                return;
            }
            this.b.y().b(this);
        } else {
            d dVar = this.l;
            if (dVar == null) {
                return;
            }
            dVar.b(this);
        }
    }
}
