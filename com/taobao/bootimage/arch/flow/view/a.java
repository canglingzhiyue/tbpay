package com.taobao.bootimage.arch.flow.view;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.d;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.h;
import com.taobao.login4android.api.Login;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Iterator;
import java.util.List;
import tb.kej;
import tb.kel;
import tb.kge;
import tb.njn;
import tb.njr;
import tb.pbe;
import tb.pbg;
import tb.ssf;

/* loaded from: classes6.dex */
public class a implements d, d.a, njr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TUrlImageView f16664a;
    private pbe b;
    private ViewGroup c;
    private TextView d;
    private TextView e;
    private b f;
    private View g;
    private RelativeLayout h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private ImageView l;
    private LinearLayout m;
    private View n;
    private boolean o;
    private c p;
    private BootImageInfo q;
    private String r;

    static {
        kge.a(707779222);
        kge.a(608582774);
        kge.a(-838488950);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PopStrategy.IDENTIFIER_SPLASH;
    }

    @Override // tb.njr
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public c a(Activity activity, BootImageInfo bootImageInfo, int i, d.a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b61eecdb", new Object[]{this, activity, bootImageInfo, new Integer(i), bVar});
        }
        this.q = bootImageInfo;
        this.f = new b(bootImageInfo, this);
        this.p = this.f.a(activity, i, bVar);
        this.r = activity.getLocalClassName();
        Iterator<com.taobao.bootimage.linked.a> it = v().iterator();
        while (it.hasNext()) {
            it.next();
        }
        return this.p;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public c e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("18142903", new Object[]{this}) : this.p;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.a();
        }
        return 205;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        pbe pbeVar = this.b;
        if (pbeVar == null) {
            kej.a("2ARCH_BootImageBaseView", "getSeekTime mPlayService null");
            return 0;
        }
        int currentPoistion = pbeVar.getCurrentPoistion();
        if (currentPoistion == 0 && !this.b.isPlaying()) {
            int duration = this.b.getDuration();
            kej.a("2ARCH_BootImageBaseView", "getSeekTime mPlayService duration:" + duration);
            return duration;
        }
        kej.a("2ARCH_BootImageBaseView", "getSeekTime state error:" + this.b.isPlaying());
        return currentPoistion;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public c a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("db6899d1", new Object[]{this, activity});
        }
        r();
        FrameLayout b = b(activity);
        this.g = LayoutInflater.from(activity).inflate(R.layout.bootimage_base, (ViewGroup) b, false);
        this.c = (ViewGroup) this.g.findViewById(R.id.ll_close);
        this.e = (TextView) this.g.findViewById(R.id.tv_countdown);
        this.d = (TextView) this.g.findViewById(R.id.tv_close);
        this.f16664a = (TUrlImageView) this.g.findViewById(R.id.iv_main);
        this.h = (RelativeLayout) this.g.findViewById(R.id.rv_title);
        ViewGroup viewGroup = (ViewGroup) this.g.findViewById(R.id.fl_animation_view);
        this.m = (LinearLayout) this.g.findViewById(R.id.ll_container);
        this.i = (ImageView) this.g.findViewById(R.id.iv_left_top_tb_logo);
        this.j = (ImageView) this.g.findViewById(R.id.iv_ipv6_logo);
        this.l = (ImageView) this.g.findViewById(R.id.iv_bottom_tb_logo);
        this.k = (TextView) this.g.findViewById(R.id.tv_wifi_loaded);
        t();
        b.addView(this.g);
        this.g.setVisibility(8);
        return new c(this.f16664a, viewGroup, this.h, this.l, this.g.findViewById(R.id.iv_bg_view));
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.i == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "showLeftTopTbLogo: ");
            this.i.setVisibility(0);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void i() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.l == null || (linearLayout = this.m) == null) {
        } else {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            kej.a("2ARCH_BootImageBaseView", "showBottomTbLogo: ");
            this.l.setVisibility(0);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.j == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "showIPV6Icon: ");
            this.j.setVisibility(0);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.k == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "showWifiLoadIcon: ");
            this.k.setVisibility(0);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TextView textView = this.e;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public boolean a(String str, boolean z, pbe.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95ff0826", new Object[]{this, str, new Boolean(z), aVar})).booleanValue();
        }
        kej.a("2ARCH_BootImageBaseView", "initVideoView: ");
        this.b = (pbe) AliAdaptServiceManager.getInstance().findAliAdaptService(pbe.class);
        if (this.b == null) {
            kej.a("2ARCH_BootImageBaseView", "show video: service error.");
            return false;
        }
        String a2 = ssf.a(this.q.sceneType, str);
        if (StringUtils.isEmpty(a2)) {
            kej.a("2ARCH_BootImageBaseView", "initPlayService localVideoPath null, videoUrl =" + str);
            return false;
        }
        kej.a("2ARCH_BootImageBaseView", "initPlayService file.getAbsolutePath(): " + a2);
        pbg pbgVar = new pbg("tbbootimage", Login.getUserId());
        pbgVar.c = 2;
        pbgVar.d = 2;
        pbgVar.f = 0;
        this.b.initConfig(this.m.getContext(), pbgVar);
        this.b.setVideoPath(a2);
        this.b.setMuted(!z);
        this.b.setListener(aVar);
        this.n = this.b.getPlayView();
        View view = this.n;
        if (view == null) {
            kej.a("2ARCH_BootImageBaseView", "show video: mPlayerView error.");
            return false;
        }
        this.m.addView(view);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return true;
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void a(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0084d5d", new Object[]{this, bitmapDrawable});
        } else if (this.f16664a == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "loadFirstFrameImage: ");
            this.f16664a.setImageDrawable(bitmapDrawable);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void b(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4582739e", new Object[]{this, bitmapDrawable});
        } else if (this.f16664a == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "loadDefaultImage: ");
            this.f16664a.setImageDrawable(bitmapDrawable);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.f16664a == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "videoPlayFailShowFirstFrameImage: ");
            this.f16664a.setVisibility(0);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.f16664a == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "removeFirstFrameImage ");
            this.f16664a.setVisibility(8);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.b == null) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "PlayService.start: ");
            this.b.start();
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setOnClickListener(onClickListener);
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public void a(d.a.InterfaceC0637a interfaceC0637a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e26e4", new Object[]{this, interfaceC0637a});
            return;
        }
        t();
        this.f.a(interfaceC0637a, true);
        kel.a(this.q.sceneType);
        for (com.taobao.bootimage.linked.a aVar : v()) {
            aVar.a(this.q.sceneType);
        }
    }

    @Override // com.taobao.bootimage.arch.flow.view.d
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // com.taobao.bootimage.arch.flow.view.d.a
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            return;
        }
        bVar.f();
        StringBuilder sb = new StringBuilder();
        sb.append("notifyTerminate: ");
        b bVar2 = this.f;
        sb.append(bVar2 != null ? Integer.valueOf(bVar2.a()) : "bootImagePresenter=null");
        kej.a("2ARCH_BootImageBaseView", sb.toString());
        s();
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
            this.g = null;
        }
        q();
    }

    private FrameLayout b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c6b99d7e", new Object[]{this, activity});
        }
        kej.a("2ARCH_BootImageBaseView", "getRootFrame: ");
        View findViewById = activity.findViewById(16908290);
        while (true) {
            ViewParent parent = findViewById.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            findViewById = (ViewGroup) parent;
        }
        if (findViewById instanceof FrameLayout) {
            return (FrameLayout) findViewById;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (!(childAt instanceof FrameLayout)) {
            childAt = new FrameLayout(activity);
            viewGroup.addView(childAt, new ViewGroup.LayoutParams(-1, -1));
        }
        return (FrameLayout) childAt;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        pbe pbeVar = this.b;
        if (pbeVar != null) {
            pbeVar.release();
            kej.a("2ARCH_BootImageBaseView", "releasePlayService: ");
            this.b = null;
        }
        if (this.n == null) {
            return;
        }
        this.n = null;
    }

    @Override // tb.njr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a("2ARCH_BootImageBaseView", "popCenter show");
        this.o = true;
    }

    @Override // tb.njr
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("popCenter isShown ");
        sb.append(!this.o);
        kej.a("2ARCH_BootImageBaseView", sb.toString());
        return !this.o;
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.o) {
        } else {
            kej.a("2ARCH_BootImageBaseView", "notifyViewShown PopCenter  addPopOperation ");
            this.o = true;
            njn.a("com.taobao.tao.homepage.HomepageFragment").a(this);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.o) {
            this.o = false;
            kej.a("2ARCH_BootImageBaseView", "notifyTerminate PopCenter  finishPopOperation ");
            njn.a("com.taobao.tao.homepage.HomepageFragment").b(this);
            for (com.taobao.bootimage.linked.a aVar : v()) {
                aVar.c();
            }
        }
    }

    private void t() {
        BootImageInfo bootImageInfo;
        SkipStyle skipStyle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (this.c == null || this.d == null || this.e == null || (bootImageInfo = this.q) == null || (skipStyle = bootImageInfo.skipStyle) == null) {
        } else {
            if (skipStyle.isHide) {
                this.c.setVisibility(8);
                return;
            }
            if (skipStyle.background != -1) {
                this.c.setBackgroundResource(skipStyle.background);
            }
            if (!StringUtils.isEmpty(skipStyle.skipText)) {
                this.d.setText(skipStyle.skipText);
            }
            if (skipStyle.skipTextSize != 0) {
                this.d.setTextSize(skipStyle.skipTextSize);
            }
            if (skipStyle.countTimeTextSize != 0) {
                this.e.setTextSize(skipStyle.countTimeTextSize);
            }
            this.d.setTextColor(skipStyle.skipTextColor);
            this.e.setTextColor(skipStyle.countTimeTextColor);
            this.e.setTypeface(Typeface.defaultFromStyle(skipStyle.countTimeTextIsBold ? 1 : 0));
            this.d.setTypeface(Typeface.defaultFromStyle(skipStyle.skipTextIsBold ? 1 : 0));
        }
    }

    private List<com.taobao.bootimage.linked.a> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("62bc9eaa", new Object[]{this});
        }
        kej.a("2ARCH_BootImageBaseView", "pageBizCallback  getPageBizCallback");
        return h.b(this.r).h();
    }
}
