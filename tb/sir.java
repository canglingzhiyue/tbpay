package tb;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.RangeSeekBar;
import com.taobao.android.fluid.framework.card.cards.video.manager.c;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class sir extends pta implements NavigationTabModule.a, hni, six, sjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final siu c;
    private final sii d;
    private final IHostAppService e;
    private ViewGroup f;
    private RangeSeekBar g;
    private TextView h;
    private TextView i;
    private View j;
    private boolean k;
    private boolean l;
    private String m;
    private int n;
    private int o;
    private int p;
    private int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    private int w;
    private int x;
    private boolean y;

    static {
        kge.a(721818622);
        kge.a(-303938763);
        kge.a(2025534365);
        kge.a(1120919262);
        kge.a(632676500);
    }

    public static /* synthetic */ Object ipc$super(sir sirVar, String str, Object... objArr) {
        if (str.hashCode() == 95040273) {
            super.onBindData((psw) objArr[0], (a) objArr[1], ((Number) objArr[2]).intValue(), (List) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ptc
    public String cL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e3f2f83", new Object[]{this}) : "SeekBarLayer";
    }

    @Override // tb.sjd
    public void cM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbe4f5c", new Object[]{this});
        }
    }

    @Override // tb.hni
    public void onLoopCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0caff82", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoClose(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366581f", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoComplete(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169a058", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
        }
    }

    @Override // tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoPrepared(psw pswVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc216e38", new Object[]{this, pswVar, obj});
        }
    }

    @Override // tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.hni
    public void onVideoScreenChanged(psw pswVar, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ff74ca", new Object[]{this, pswVar, dWVideoScreenType});
        }
    }

    @Override // tb.hni
    public void onVideoSeekTo(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f305711", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    @Override // tb.hni
    public void onVideoStart(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef89", new Object[]{this, pswVar});
        }
    }

    @Override // tb.hni
    public void onVideoStateChanged(psw pswVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400dd041", new Object[]{this, pswVar, new Integer(i)});
        }
    }

    public static /* synthetic */ ViewGroup a(sir sirVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("451d1a19", new Object[]{sirVar}) : sirVar.f;
    }

    public sir(FluidContext fluidContext, sii siiVar) {
        super(fluidContext, siiVar);
        this.d = siiVar;
        this.e = (IHostAppService) this.d.z().getService(IHostAppService.class);
        this.c = new sis(fluidContext);
        s();
        Context context = fluidContext.getContext();
        int a2 = ohd.a(context, 2);
        this.v = a2;
        this.s = a2;
        int a3 = ohd.a(context, 26);
        this.u = a3;
        this.t = a3;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.n;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.g;
    }

    public siu e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (siu) ipChange.ipc$dispatch("2dd1199b", new Object[]{this}) : this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.m;
    }

    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.f;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.p;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d(i);
        e(i2);
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.i == null || this.j.getVisibility() != 0) {
        } else {
            this.i.setText(slm.a(i));
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.w = i;
        if (this.h == null || this.j.getVisibility() != 0) {
            return;
        }
        this.h.setText(slm.a(i));
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        RangeSeekBar rangeSeekBar = this.g;
        if (rangeSeekBar == null) {
            return;
        }
        rangeSeekBar.setProgress(f);
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        RangeSeekBar rangeSeekBar = this.g;
        if (rangeSeekBar == null) {
            return;
        }
        rangeSeekBar.setRange(f, f2);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.j == null) {
            this.j = this.f.findViewById(R.id.time_layout);
            this.h = (TextView) this.f.findViewById(R.id.total_time);
            this.i = (TextView) this.f.findViewById(R.id.current_time);
        }
        if (this.j != null) {
            return;
        }
        View e = jqz.e(this.f32873a.getContext());
        this.j = e;
        this.h = (TextView) e.findViewById(R.id.total_time);
        this.i = (TextView) e.findViewById(R.id.current_time);
        this.f.addView(e, 0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.addRule(3, R.id.time_layout);
        this.g.setLayoutParams(layoutParams);
    }

    @Override // tb.pta, tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        this.f = (ViewGroup) snpVar.itemView.findViewById(R.id.seek_bar_layout);
        this.g = (RangeSeekBar) snpVar.itemView.findViewById(R.id.seek_bar);
        a(snpVar);
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        View g = g();
        if (!this.d.J()) {
            i2 = 8;
        }
        ocf.a(g, i2);
    }

    @Override // tb.pta, tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        } else {
            super.onBindData(pswVar, aVar, i, list);
        }
    }

    public void l() {
        RangeSeekBar rangeSeekBar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (sil.a() && (rangeSeekBar = this.g) != null && (i = this.p) > 0 && !this.k && this.n > 1000) {
            rangeSeekBar.setProgress(i);
        }
        d.e(this.d);
        ljq.d(this.d, "complete");
    }

    public Pair<Integer, Integer> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a1d3dcff", new Object[]{this});
        }
        boolean b = sil.b(this.d.z());
        Pair<Integer, Integer> q = q();
        if (this.d.Z().d() == null) {
            return q;
        }
        int intValue = ((Integer) q.first).intValue();
        int intValue2 = ((Integer) q.second).intValue();
        if (b) {
            intValue = ohd.a((Context) obu.e(), 70);
            intValue2 = intValue;
        }
        return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        boolean b = sil.b(this.d.z());
        Pair<Integer, Integer> n = n();
        ((Integer) n.first).intValue();
        int intValue = ((Integer) n.second).intValue();
        this.x = intValue;
        if (this.d.Z().d() == null) {
            return;
        }
        int i = this.s;
        this.f = (ViewGroup) this.d.Z().d().findViewById(R.id.seek_bar_layout);
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        int r = this.d.r();
        int actionBarHeight = ((IContainerService) this.f32873a.getService(IContainerService.class)).getActionBarHeight();
        boolean o = this.d.af().o();
        if (sjt.u()) {
            layoutParams.bottomMargin = (actionBarHeight - (i / 2)) - intValue;
        } else {
            String str = "up";
            if (sjv.b(this.f32873a)) {
                spz.c("SeekBarLayer", "更新第" + r + "卡进度条的底部边距，bottomMargin：" + layoutParams.bottomMargin + "，actionbarHeight：" + actionBarHeight + "，size：" + i + "，seekBarPaddingBottom：" + intValue + "，bottomTabBarHeight：" + obu.b());
                if (spj.i(this.d.z())) {
                    boolean isTabBarHide = ((IHostAppService) this.d.z().getService(IHostAppService.class)).isTabBarHide();
                    boolean z = a(this.d.z()) && r == 0;
                    spz.c("SeekBarLayer", "第" + r + "卡进度条，isNewGuideAnd0po=" + z + " isHideStatus=" + isTabBarHide);
                    if (isTabBarHide && !z) {
                        layoutParams.bottomMargin = (actionBarHeight - (i / 2)) - intValue;
                        this.l = false;
                    } else {
                        layoutParams.bottomMargin = ((obu.b() + actionBarHeight) - (i / 2)) - intValue;
                        this.l = true;
                    }
                    spz.c("SeekBarLayer", "VSMSG_progressChanged，mSeekBarLayer.isSeekBarLocatedUp=" + this.l + " position=" + this.d.r() + "; " + sju.a(this.d));
                    if (!this.l) {
                        str = "down";
                    }
                    this.m = str;
                    sml.a(this.d.z(), this.m, this.d.D());
                } else {
                    layoutParams.bottomMargin = (actionBarHeight - (i / 2)) - intValue;
                }
                spz.c("SeekBarLayer", "第" + r + "卡进度条的底部边距更新完成，bottomMargin：" + layoutParams.bottomMargin);
            } else if (actionBarHeight > 0) {
                if (o) {
                    layoutParams.bottomMargin = ((obu.b() + actionBarHeight) - (i / 2)) - intValue;
                    this.l = true;
                    spz.c("SeekBarLayer", "VSMSG_progressChanged，isSecondPageUpBar,isSeekBarLocatedUp=true,position=" + this.d.r() + "; " + sju.a(this.d));
                } else {
                    this.l = false;
                    layoutParams.bottomMargin = (actionBarHeight - (i / 2)) - intValue;
                }
                if (!this.l) {
                    str = "down";
                }
                this.m = str;
                sml.a(this.d.z(), this.m, this.d.D());
            } else if (b) {
                layoutParams.bottomMargin = (-intValue) - (i / 2);
            } else {
                layoutParams.bottomMargin = (ohd.a(FluidSDK.getContext(), 70.0f) - intValue) - (i / 2);
            }
        }
        this.f.setLayoutParams(layoutParams);
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableFixSeekBarTouch", false);
    }

    private Pair<Integer, Integer> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8068a8c2", new Object[]{this});
        }
        try {
            return t();
        } catch (Throwable th) {
            spz.a("SeekBarLayer", "", th);
            int b = ohd.b((Context) obu.e(), 20);
            return Pair.create(Integer.valueOf(b), Integer.valueOf(b));
        }
    }

    private long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbed", new Object[]{this})).longValue();
        }
        long orangeLongConfig = FluidSDK.getRemoteConfigAdapter().getOrangeLongConfig("translateSeekBarToFollowTabBarDelayTime", 150L);
        if (orangeLongConfig < 0) {
            return 150L;
        }
        return orangeLongConfig;
    }

    private void a(snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff144143", new Object[]{this, snpVar});
            return;
        }
        this.y = sil.b(this.d.z());
        Pair<Integer, Integer> n = n();
        int intValue = ((Integer) n.first).intValue();
        int intValue2 = ((Integer) n.second).intValue();
        if (!sjt.B() && Build.VERSION.SDK_INT >= 21) {
            if (spj.a(this.d.z()) || p()) {
                this.f.setTranslationZ(1.0f);
            } else {
                this.f.setTranslationZ(0.0f);
            }
        }
        this.g.setProgressHeight(this.s);
        if (sjt.u() || this.y) {
            this.g.setThumbProgressHeight(this.s);
        } else {
            this.g.setThumbProgressHeight(ohd.a(this.f32873a.getContext(), 2));
        }
        int a2 = ohd.a(this.f32873a.getContext(), 24);
        this.g.setPadding(a2, intValue, a2, intValue2);
        this.g.getLeftSeekBar().c(this.s);
        this.g.getLeftSeekBar().b(this.s);
        this.g.setOnRangeChangedListener(this);
        spz.c("SeekBarLayer", "添加底部状态监听; " + this.b.C());
        this.e.addNavigationShowHideStatusListener(this);
        this.d.p().c().a(this);
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c7b4db", new Object[]{this, rangeSeekBar, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        this.c.a(rangeSeekBar, f, f2, z);
        i();
        if (this.j.getVisibility() != 0) {
            return;
        }
        this.i.setText(slm.a((int) f));
    }

    @Override // tb.six
    public void a(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286a829b", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.c.a(rangeSeekBar, z);
        this.k = true;
        i();
        a(true, this.t, this.u);
        if (rangeSeekBar != null) {
            this.r = rangeSeekBar.getProgress();
        }
        this.j.setVisibility(0);
        e(this.w);
        b.f(this.d.z(), this.d.k().j());
        c.a(this.d, "seekBegin");
    }

    @Override // tb.six
    public void b(RangeSeekBar rangeSeekBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee950b5c", new Object[]{this, rangeSeekBar, new Boolean(z)});
            return;
        }
        this.c.b(rangeSeekBar, z);
        this.k = false;
        this.j.setVisibility(8);
        int i = this.s;
        a(false, i, i);
        if (this.d.k().f() != null && rangeSeekBar != null) {
            int progress = rangeSeekBar.getProgress();
            this.d.k().f().a(progress);
            this.d.k().f().b();
            b.a(this.d.z(), this.r, progress);
            this.r = 0;
        }
        c.a(this.d, "seekEnd");
    }

    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c("SeekBarLayer", "onNavigationShowHideStatusChanged isHideStatus=" + z + " ; " + this.b.C());
        b(z ^ true);
    }

    @Override // tb.sjd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d.k().f() == null) {
        } else {
            if (this.d.k().f().e() == 2) {
                this.g.setThumbEnabled(true);
            }
            b.b(this.d.z(), this.d.p().c().c());
        }
    }

    private boolean a(FluidContext fluidContext) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{this, fluidContext})).booleanValue();
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null || j.am == null) {
            return false;
        }
        Map<String, Object> d = j.d();
        spz.c("SeekBarLayer", "halfscreen isNewGuide, halfScreenConfigAndroid=" + d);
        if (d == null) {
            return false;
        }
        boolean a3 = oec.a(d.get("enable"), false);
        if (j.ap != null) {
            Map<String, Object> a4 = j.a(j.ap, "smartBubbleTextConfig");
            a2 = a4 != null ? oec.a(a4.get("enableBubble"), false) : false;
            spz.c("PickPreloadControllerNew", "下滑 新协议。enableNewGuide=" + a2);
        } else {
            a2 = oec.a(d.get("enableNewGuide"), false);
        }
        return !a3 && a2;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.d.P().a(this);
        }
    }

    @Override // tb.hni
    public void onPreCompletion(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9060abe3", new Object[]{this, pswVar});
        } else {
            l();
        }
    }

    private Pair<Integer, Integer> t() throws Exception {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5efd7485", new Object[]{this});
        }
        String[] split = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("seekBarPaddingVertical", "17,17").split(",");
        int a4 = ocb.a(split[0]);
        int a5 = ocb.a(split[1]);
        if (a4 < 0) {
            a2 = ohd.b((Context) obu.e(), 20);
        } else {
            a2 = ohd.a((Context) obu.e(), a4);
        }
        if (a5 < 0) {
            a3 = ohd.b((Context) obu.e(), 20);
        } else {
            a3 = ohd.a((Context) obu.e(), a5);
        }
        return Pair.create(Integer.valueOf(a2), Integer.valueOf(a3));
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (sjt.u() || this.f == null || this.l == z || !sjv.b(this.f32873a) || !spj.i(this.d.z())) {
        } else {
            final int r = this.d.r();
            if (a(this.d.z()) && r == 0) {
                spz.c("SeekBarLayer", "isNewGuide 首坑、开启新样式，不处理进度条位置");
                return;
            }
            this.l = z;
            long r2 = r();
            int b = obu.b();
            this.f.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams != null) {
                if (this.l) {
                    ((FrameLayout.LayoutParams) layoutParams).bottomMargin += b;
                } else {
                    ((FrameLayout.LayoutParams) layoutParams).bottomMargin -= b;
                }
                this.f.setLayoutParams(layoutParams);
            }
            spz.c("SeekBarLayer", "VSMSG_progressChanged，隐藏 & 更改新位置 :" + this.l + "; delayTime=" + r2 + "ms, position=" + r + "; " + sju.a(this.d) + " ; bottomTabBarHeight=" + b);
            this.m = this.l ? "up" : "down";
            sml.a(this.d.z(), this.m, this.d.D());
            sii.mHandler.postDelayed(new Runnable() { // from class: tb.sir.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (sir.a(sir.this) == null) {
                    } else {
                        spz.c("SeekBarLayer", "VSMSG_progressChanged，开始显示: position=" + r);
                        sir.a(sir.this).setAlpha(0.0f);
                        sir.a(sir.this).setVisibility(0);
                        obt.a(sir.a(sir.this), 300);
                    }
                }
            }, r2);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            a(z, this.s, this.v);
        }
    }

    private void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        this.g.setThumbProgressHeight(i);
        this.g.getLeftSeekBar().c(i2);
        this.g.getLeftSeekBar().b(i2);
        this.g.setThumbEnabled(z);
    }
}
