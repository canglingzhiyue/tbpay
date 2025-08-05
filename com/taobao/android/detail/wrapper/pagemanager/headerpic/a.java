package com.taobao.android.detail.wrapper.pagemanager.headerpic;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.e;
import com.taobao.android.detail.core.event.basic.d;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import com.taobao.android.detail.core.perf.c;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.o;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ultronengine.event.l;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import java.util.HashMap;
import java.util.Map;
import tb.bpk;
import tb.dya;
import tb.dyo;
import tb.ebx;
import tb.ecg;
import tb.ecu;
import tb.ecv;
import tb.edp;
import tb.ehs;
import tb.els;
import tb.eme;
import tb.emu;
import tb.eno;
import tb.ety;
import tb.etz;
import tb.eua;
import tb.eub;
import tb.euc;
import tb.eup;
import tb.ffj;
import tb.fgj;
import tb.fgl;
import tb.fgr;
import tb.kge;
import tb.lcm;
import tb.lpa;

/* loaded from: classes5.dex */
public class a implements lpa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailHeaderPicV2Component";
    private static final int f;

    /* renamed from: a  reason: collision with root package name */
    public g f11428a;
    private final DetailCoreActivity g;
    private boolean i;
    private fgl j;
    private ffj k;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b l;
    private long m;
    private ViewGroup n;
    private els o;
    private int h = -1;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public j<Event> e = new j<Event>() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.trade.event.j
        public i handleEvent(Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
            }
            if (eno.a(d.class) == event.getEventId() && a.this.f11428a != null) {
                a.this.f11428a.a((IDMComponent) null);
            }
            return i.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    };

    @Override // tb.lpa
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.datamodel.node.b a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.b) ipChange.ipc$dispatch("3c2dbeae", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef59be1", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d569fc0", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : f;
    }

    public static /* synthetic */ DetailCoreActivity d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("368297ea", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a18a782", new Object[]{aVar})).booleanValue() : aVar.h();
    }

    static {
        kge.a(-242786465);
        kge.a(-671507480);
        f = ecv.a(125.0f);
    }

    public a(lcm lcmVar) {
        emu.a("com.taobao.android.detail.wrapper.pagemanager.headerpic.DetailHeaderPicV2Component");
        if (!(lcmVar.a() instanceof DetailCoreActivity)) {
            throw new IllegalArgumentException("activity must be DetailCoreActivity");
        }
        this.g = lcmVar.a();
        this.o = new els();
    }

    private boolean a(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22c0784", new Object[]{this, detailActivity})).booleanValue();
        }
        if (detailActivity != null && detailActivity.ac() != null) {
            return detailActivity.ac().m();
        }
        return false;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.c) {
        } else {
            this.c = true;
            DetailCoreActivity detailCoreActivity = this.g;
            c.b(detailCoreActivity, "mainPicViewRender");
            c.b(detailCoreActivity, "viewRender");
            DetailCoreActivity detailCoreActivity2 = this.g;
            if (!(detailCoreActivity2 instanceof DetailActivity)) {
                return;
            }
            ebx ebxVar = ((DetailActivity) detailCoreActivity2).f9411a;
            long uptimeMillis = SystemClock.uptimeMillis();
            String str = ebxVar.q;
            String a2 = com.taobao.android.detail.core.performance.preload.b.a(ebxVar.q);
            Map<String, String> a3 = com.taobao.android.detail.core.perf.d.a(detailCoreActivity, str, a2);
            String b = b((DetailActivity) this.g);
            c.a(detailCoreActivity, b, "ProductDetail_FirstScreen", ebxVar.w, uptimeMillis, a3);
            a((DetailActivity) this.g, b, ebxVar.w, uptimeMillis);
            ecg.d(this.g, ebxVar.f27180a, str, a2);
            if (!this.d) {
                return;
            }
            if (a((DetailActivity) this.g)) {
                c.a(detailCoreActivity, "aura_visibleIntervals", this.m, uptimeMillis);
            } else {
                c.a(detailCoreActivity, "visibleIntervals", this.m, uptimeMillis);
            }
        }
    }

    private void a(DetailActivity detailActivity, String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dff4a", new Object[]{this, detailActivity, str, new Long(j), new Long(j2)});
            return;
        }
        dya y = detailActivity.y();
        if (y == null || !y.c()) {
            return;
        }
        long j3 = j2 - j;
        long j4 = 0;
        if (detailActivity.getIntent() != null) {
            j4 = o.a(detailActivity.getIntent().getStringExtra(dyo.STREAM_FLAG));
        }
        long j5 = j2 - j4;
        long H = j2 - y.H();
        if (TextUtils.equals(str, "aura_preload_visible")) {
            h.b(detailActivity, j3, j5, H);
        } else if (TextUtils.equals(str, "aura_visible")) {
            h.a(detailActivity, j3, j5, H);
        } else if (TextUtils.equals(str, "preload_visible")) {
            h.d(detailActivity, j3, j5);
        } else if (!TextUtils.equals(str, "visible")) {
        } else {
            h.c(detailActivity, j3, j5);
        }
    }

    private String b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b273321", new Object[]{this, detailActivity}) : a(detailActivity) ? this.d ? "aura_preload_visible" : "aura_visible" : this.d ? "preload_visible" : "visible";
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.g;
        if (!(detailCoreActivity instanceof DetailActivity) || this.d) {
            return;
        }
        this.d = true;
        ebx ebxVar = ((DetailActivity) detailCoreActivity).f9411a;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a((DetailActivity) this.g)) {
            c.a(this.g, "cache_aura_visible", "ProductDetail_FirstScreen_Cache", ebxVar.w, uptimeMillis);
            h.i(this.g, uptimeMillis - ebxVar.w);
        } else {
            c.a(this.g, "cache_visible", "ProductDetail_FirstScreen_Cache", ebxVar.w, uptimeMillis);
        }
        ecg.a(this.g, ebxVar.f27180a, ebxVar.q, com.taobao.android.detail.core.performance.preload.b.a(ebxVar.q));
        this.m = uptimeMillis;
    }

    @Override // tb.lpa
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        c.a(this.g, "mainPicViewCreate");
        com.taobao.android.detail.mainpic.h hVar = new com.taobao.android.detail.mainpic.h();
        hVar.a(ecu.f27202a);
        hVar.a(new C0453a());
        hVar.c(!com.taobao.android.autosize.h.a().b((Context) this.g));
        DetailCoreActivity detailCoreActivity = this.g;
        if (detailCoreActivity instanceof com.taobao.android.detail.wrapper.activity.b) {
            hVar.b(((com.taobao.android.detail.wrapper.activity.b) detailCoreActivity).ae());
        }
        hVar.a(ecu.ab);
        hVar.a(new etz() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.etz
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a.a(a.this) == null || !a.a(a.this).n()) {
                    a.c(a.this);
                } else {
                    a.b(a.this);
                }
            }
        });
        hVar.a(new eub() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eub
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a.a(a.this) == null || !a.a(a.this).n()) {
                    a.c(a.this);
                } else {
                    a.b(a.this);
                }
            }
        });
        a(hVar);
        this.f11428a = g.a(this.g, hVar);
        this.f11428a.a((ViewGroup) null);
        DetailCoreActivity detailCoreActivity2 = this.g;
        if (detailCoreActivity2 instanceof DetailCoreActivity) {
            this.f11428a.a(detailCoreActivity2.N());
            if (detailCoreActivity2.b != null && detailCoreActivity2.b.y() != null) {
                detailCoreActivity2.b.y().a(new e() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private boolean b;

                    @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i, float f2, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
                        } else if (this.b || f2 <= 0.1f || i != 0) {
                        } else {
                            a.this.c();
                        }
                    }

                    @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageSelected(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        } else if (i != 0) {
                        } else {
                            this.b = false;
                        }
                    }
                });
            }
        }
        if (eme.a(this.g)) {
            DetailCoreActivity detailCoreActivity3 = this.g;
            if (detailCoreActivity3 instanceof DetailActivity) {
                ((DetailActivity) detailCoreActivity3).a(new InsideLinearLayout.a() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
                    public void b(InsideLinearLayout.InsideDetailState insideDetailState) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6f10a4df", new Object[]{this, insideDetailState});
                        }
                    }

                    @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
                    public void a(InsideLinearLayout.InsideDetailState insideDetailState) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8e974ede", new Object[]{this, insideDetailState});
                            return;
                        }
                        g gVar = a.this.f11428a;
                        if (insideDetailState != InsideLinearLayout.InsideDetailState.HALF_SCREEN) {
                            z = false;
                        }
                        gVar.b(z);
                    }
                });
                this.f11428a.b(true);
            }
        }
        this.f11428a.a(new euc() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.euc
            public boolean a(DWInstance dWInstance, final IDMComponent iDMComponent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7f45402f", new Object[]{this, dWInstance, iDMComponent})).booleanValue();
                }
                if (dWInstance.getVideoState() == 1 || dWInstance.getVideoState() == 5 || dWInstance.getVideoState() == 8) {
                    dWInstance.setRootViewClickListener(new z() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.common.z
                        public boolean hook() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                            }
                            a.this.f11428a.a(iDMComponent);
                            com.taobao.android.detail.core.event.video.c.a((Context) a.d(a.this), (com.taobao.android.trade.event.c) null, false);
                            return false;
                        }
                    });
                    dWInstance.setVideoLifecycleListener(new av() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.5.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.av
                        public void onVideoClose() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("24db3403", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoError(Object obj, int i, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoFullScreen() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5dcccbde", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoInfo(Object obj, int i, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoNormalScreen() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ff4b0936", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoPause(boolean z) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoPlay() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("931007b7", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoProgressChanged(int i, int i2, int i3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoSeekTo(int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoStart() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("c2b2d56d", new Object[]{this});
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoPrepared(Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3faee61c", new Object[]{this, obj});
                            } else {
                                a.c(a.this);
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoComplete() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3c2c53c", new Object[]{this});
                            } else {
                                com.taobao.android.detail.core.event.video.c.a((Context) a.d(a.this), (com.taobao.android.trade.event.c) null, false);
                            }
                        }
                    });
                    if (a.e(a.this)) {
                        com.taobao.android.detail.wrapper.ext.video.d.a(a.d(a.this), dWInstance, null, DetailVideoSource.GALLERY, a.d(), a.d(), 0, 0);
                    }
                }
                return true;
            }

            @Override // tb.euc
            public boolean b(DWInstance dWInstance, IDMComponent iDMComponent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b7361b4e", new Object[]{this, dWInstance, iDMComponent})).booleanValue();
                }
                com.taobao.android.detail.core.event.video.c.a((Context) a.d(a.this), (com.taobao.android.trade.event.c) null, false);
                return true;
            }
        });
        this.f11428a.a(new eua() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eua
            public boolean a(View view, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b3af19a", new Object[]{this, view, new Float(f2)})).booleanValue();
                }
                f.a(a.d(a.this), new edp());
                return true;
            }
        });
        this.f11428a.a(new ety() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ety
            public void a(ety.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("284e8191", new Object[]{this, aVar});
                } else if (!"GrantPermissionEvent".equals(aVar.e)) {
                } else {
                    com.taobao.android.detail.core.event.basic.h hVar2 = new com.taobao.android.detail.core.event.basic.h();
                    hVar2.b = aVar.b;
                    hVar2.f9703a = aVar.f27574a;
                    hVar2.c = aVar.c;
                    hVar2.d = aVar.d;
                    com.taobao.android.detail.core.event.basic.g gVar = new com.taobao.android.detail.core.event.basic.g();
                    gVar.f9702a = hVar2;
                    f.a(a.d(a.this)).a(gVar);
                }
            }
        });
        com.taobao.android.trade.event.d a2 = f.a(this.g);
        if (a2 != null) {
            a2.a(eno.a(d.class), this.e);
        }
        DetailCoreActivity detailCoreActivity4 = this.g;
        if (detailCoreActivity4 instanceof Activity) {
            c.b(detailCoreActivity4, "mainPicViewCreate");
            c.a(this.g, "mainPicViewRender");
        }
        i();
        View b = this.f11428a.b();
        this.n = new FrameLayout(this.g);
        this.n.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.n.addView(b, layoutParams);
        return this.n;
    }

    @Override // tb.lpa
    public void a(lcm lcmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f285f542", new Object[]{this, lcmVar});
            return;
        }
        c.a(this.g, "mainPicDataProcess");
        this.l = lcmVar.a().C().f10055a;
        int a2 = a(this.l);
        if (eup.a()) {
            g();
        }
        this.f11428a.a(this.l, a2);
        c.b(this.g, "mainPicDataProcess");
        this.b = true;
    }

    private int a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4562f5", new Object[]{this, bVar})).intValue();
        }
        if (bVar == null || bVar.m()) {
        }
        return -1;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f11428a == null || this.k != null) {
        } else {
            this.k = new ffj();
            this.f11428a.a(this.k);
        }
    }

    private boolean h() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        boolean a2 = fgr.a("enable_main_pic_mini_video_switch", true, false);
        com.taobao.android.detail.core.utils.i.d(TAG, "canShowMiniVideo enableMiniVideoSwitch: " + a2);
        if (!a2 || (gVar = this.f11428a) == null || !(gVar.e() instanceof LifecycleOwner)) {
            return true;
        }
        Lifecycle.State currentState = ((LifecycleOwner) this.f11428a.e()).getLifecycle().getCurrentState();
        StringBuilder sb = new StringBuilder();
        sb.append("canShowMiniVideo currentState: ");
        sb.append(currentState);
        sb.append(",");
        sb.append(currentState == Lifecycle.State.RESUMED);
        com.taobao.android.detail.core.utils.i.d(TAG, sb.toString());
        return currentState == Lifecycle.State.RESUMED;
    }

    private void a(com.taobao.android.detail.mainpic.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200e9fda", new Object[]{this, hVar});
        } else {
            hVar.a("openRate", new l());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g gVar = this.f11428a;
        if (gVar == null) {
            return;
        }
        gVar.a();
    }

    /* renamed from: com.taobao.android.detail.wrapper.pagemanager.headerpic.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0453a extends q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1663803987);
        }

        private C0453a() {
        }

        @Override // com.alibaba.android.ultron.event.q
        public void a(com.alibaba.android.ultron.event.base.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
                return;
            }
            com.taobao.android.detail.core.utils.i.a("NewMainPicDefaultSubscriber", "onHandleEvent ultronEvent:" + eVar.b());
            try {
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) eVar.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) eVar.b());
                if (eVar.i() instanceof com.taobao.android.ultron.common.model.b) {
                    jSONObject.put("params", (Object) ((com.taobao.android.ultron.common.model.b) eVar.i()).getFields());
                }
                Event a2 = ehs.a(detailCoreActivity, new ActionModel(jSONObject), detailCoreActivity.y().t.f10055a, null, new HashMap());
                if (a2 == null) {
                    return;
                }
                if (!f.a(detailCoreActivity).b(a2.getEventId())) {
                    com.taobao.android.detail.core.utils.i.a("NewMainPicDefaultSubscriber", "事件未找到: " + eVar.b());
                    bpk.b(eVar);
                }
                com.taobao.android.detail.core.ultronengine.h.a(eVar);
                f.a(detailCoreActivity, a2);
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("NewMainPicDefaultSubscriber", "onHandleEvent", th);
            }
        }
    }

    private void i() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (fgj.a() || (z = this.i) || this.f11428a == null || z) {
        } else {
            this.j = new fgl();
            this.j.a(new fgl.a() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fgl.a
                public Map<String, String> a() {
                    DetailActivity detailActivity;
                    com.taobao.android.detail.datasdk.model.datamodel.node.c C;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                    }
                    HashMap hashMap = new HashMap();
                    if (!(a.d(a.this) instanceof DetailActivity) || (C = (detailActivity = (DetailActivity) a.d(a.this)).C()) == null) {
                        return hashMap;
                    }
                    String i = C.i();
                    if (TextUtils.isEmpty(i)) {
                        return hashMap;
                    }
                    hashMap.put("token", detailActivity.h);
                    hashMap.put(fgl.ORIGINALITEMID, i);
                    hashMap.put(fgl.TARGETITEMID, i);
                    return hashMap;
                }
            });
            this.f11428a.n().a(this.j);
            this.i = true;
        }
    }
}
