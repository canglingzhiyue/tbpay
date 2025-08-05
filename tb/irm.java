package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.p;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.ui.media.d;
import com.taobao.taolive.sdk.ui.media.mute.a;
import com.taobao.taolive.sdk.ui.media.mute.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class irm implements View.OnClickListener, a.InterfaceC0912a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private Context f29254a;
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
    private Runnable q = new Runnable() { // from class: tb.irm.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (irm.a(irm.this) <= 0) {
                irm.f(irm.this);
            } else {
                irm.b(irm.this);
                irm.a(irm.this, 1);
                irm.c(irm.this);
                irm.e(irm.this).postDelayed(irm.d(irm.this), 1000L);
            }
        }
    };
    private Runnable r = new Runnable() { // from class: tb.irm.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                irm.g(irm.this);
            }
        }
    };
    private Handler m = new Handler(Looper.getMainLooper());

    public static /* synthetic */ int a(irm irmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee3acbe7", new Object[]{irmVar})).intValue() : irmVar.o;
    }

    public static /* synthetic */ int a(irm irmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d91f2582", new Object[]{irmVar, new Integer(i)})).intValue();
        }
        irmVar.n = i;
        return i;
    }

    public static /* synthetic */ int b(irm irmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcbdd268", new Object[]{irmVar})).intValue();
        }
        int i = irmVar.o;
        irmVar.o = i - 1;
        return i;
    }

    public static /* synthetic */ void c(irm irmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb40d8f6", new Object[]{irmVar});
        } else {
            irmVar.d();
        }
    }

    public static /* synthetic */ Runnable d(irm irmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("81b70cbd", new Object[]{irmVar}) : irmVar.q;
    }

    public static /* synthetic */ Handler e(irm irmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("245855ce", new Object[]{irmVar}) : irmVar.m;
    }

    public static /* synthetic */ void f(irm irmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c9ec79", new Object[]{irmVar});
        } else {
            irmVar.j();
        }
    }

    public static /* synthetic */ void g(irm irmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854cf2fa", new Object[]{irmVar});
        } else {
            irmVar.l();
        }
    }

    static {
        kge.a(381908399);
        kge.a(-1201612728);
        kge.a(-723077780);
        TAG = irm.class.getSimpleName();
    }

    public irm(Context context, View view, e eVar) {
        this.d = view;
        this.f29254a = context;
        this.b = eVar;
        Context context2 = this.f29254a;
        if (context2 != null) {
            this.c = (AudioManager) context2.getSystemService("audio");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!m()) {
        } else {
            a("start");
            if (this.p) {
                a("start hasStart");
            } else if (this.b.r() == null) {
                a("start isFirst = false");
            } else if (this.b.y() == null) {
                a("start globalContext == null");
            } else {
                this.p = true;
                if (this.b.A() != null) {
                    this.l = this.b.A().e();
                }
                d dVar = this.l;
                if (dVar != null) {
                    dVar.a(this);
                }
                o();
                this.n = 0;
                c();
                if (this.b.r().isFirst) {
                    if (!b.b(this.f29254a)) {
                        if (n() > 0) {
                            if (p.a(this.f29254a)) {
                                z = true;
                            } else {
                                a("start isFirstTimeToday = false");
                            }
                        } else {
                            a("start getStreamVolume()<=0");
                        }
                    } else {
                        a("start isGlobalMuteOpen == true");
                    }
                } else {
                    a("start isFirst == false");
                }
                if (z) {
                    i();
                } else {
                    h();
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!m()) {
        } else {
            a("stop");
            this.n = 0;
            c();
            d dVar = this.l;
            if (dVar != null) {
                dVar.b(this);
            }
            this.l = null;
            this.o = aa.bV();
            this.p = false;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_keep_mute_icon) {
            int i = this.n;
            if (i == 1 || i == 2) {
                d dVar = this.l;
                if (dVar != null) {
                    dVar.r(false);
                }
                this.n = 3;
                e();
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundopen", (HashMap<String, String>) null);
            } else if (i == 3) {
                d dVar2 = this.l;
                if (dVar2 != null) {
                    dVar2.r(true);
                }
                this.n = 2;
                f();
                ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundclose", (HashMap<String, String>) null);
            } else if (i != 4) {
            } else {
                if (b.b(this.f29254a)) {
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundopen", (HashMap<String, String>) null);
                } else {
                    ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "icon_soundclose", (HashMap<String, String>) null);
                }
                d dVar3 = this.l;
                if (dVar3 != null) {
                    dVar3.r(!b.b(this.f29254a));
                }
                p();
            }
        } else if (view.getId() != R.id.taolive_keep_mute_btn || this.n != 1) {
        } else {
            d dVar4 = this.l;
            if (dVar4 != null) {
                dVar4.r(true);
            }
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
        p();
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
        p();
        k();
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
        p();
        k();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a("onStateDismiss");
        View view = this.e;
        if (view == null || this.g == null || this.k == null || this.i == null || this.f == null) {
            return;
        }
        view.setVisibility(0);
        this.g.setVisibility(8);
        this.i.setVisibility(8);
        p();
        this.f.setVisibility(0);
        this.m.removeCallbacks(this.q);
        this.m.removeCallbacks(this.r);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.n = 4;
        g();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.r(true);
        }
        this.n = 1;
        d();
        this.m.postDelayed(this.q, 1000L);
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.b, "mute_outside", (HashMap<String, String>) null);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.r(false);
        }
        this.n = 3;
        e();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.m.removeCallbacks(this.r);
        this.m.postDelayed(this.r, aa.bW() * 1000);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.n = 4;
        g();
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.b != null && this.f29254a != null && aa.m() && b.a(this.f29254a);
    }

    private int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        AudioManager audioManager = this.c;
        if (audioManager == null) {
            return -1;
        }
        return audioManager.getStreamVolume(3);
    }

    private void o() {
        ATaoLiveOpenEntity o;
        Float aR_;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (this.e == null) {
            ViewStub viewStub = (ViewStub) this.d.findViewById(R.id.forever_keep_mute_tip_stub);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.taolive_forever_keep_mute_layout);
                this.e = viewStub.inflate();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                e eVar = this.b;
                float f = 0.0f;
                if (eVar != null && (o = eVar.o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null && (aR_ = o.uiCompontent.a().aR_()) != null && aR_.floatValue() > 0.0f && aR_.floatValue() <= 500.0f) {
                    f = aR_.floatValue() + marginLayoutParams.topMargin;
                    z = true;
                }
                if (z) {
                    marginLayoutParams.topMargin = (int) f;
                }
                this.e.setLayoutParams(marginLayoutParams);
            } else {
                this.e = this.d.findViewById(R.id.taolive_forever_keep_mute_real);
            }
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
        p();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.f == null) {
        } else {
            if (b.b(this.f29254a)) {
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
}
