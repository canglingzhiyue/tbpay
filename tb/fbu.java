package tb;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.e;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.event.basic.d;
import com.taobao.android.detail.core.event.video.DetailVideoSource;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.o;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
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
import tb.ety;
import tb.fgl;

/* loaded from: classes5.dex */
public class fbu extends c<MultiMediaModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NewMainPicViewHolder";
    private static final int m;
    public boolean g;
    public g h;
    public boolean i;
    public boolean j;
    public boolean k;
    public j l;
    private boolean n;
    private fgl o;
    private ffj p;
    private b q;
    private long r;

    public static /* synthetic */ Object ipc$super(fbu fbuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    public static /* synthetic */ b a(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("461a4451", new Object[]{fbuVar}) : fbuVar.q;
    }

    public static /* synthetic */ void a(fbu fbuVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f91a9d1", new Object[]{fbuVar, jSONObject});
        } else {
            fbuVar.a(jSONObject);
        }
    }

    public static /* synthetic */ void b(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c17380", new Object[]{fbuVar});
        } else {
            fbuVar.f();
        }
    }

    public static /* synthetic */ void c(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5447a01", new Object[]{fbuVar});
        } else {
            fbuVar.e();
        }
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : m;
    }

    public static /* synthetic */ boolean d(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3c78086", new Object[]{fbuVar})).booleanValue() : fbuVar.i();
    }

    public static /* synthetic */ Context e(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c982ccfb", new Object[]{fbuVar}) : fbuVar.f9568a;
    }

    public static /* synthetic */ Context f(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dd2aa07c", new Object[]{fbuVar}) : fbuVar.f9568a;
    }

    public static /* synthetic */ Context g(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f0d273fd", new Object[]{fbuVar}) : fbuVar.f9568a;
    }

    public static /* synthetic */ Context h(fbu fbuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("47a477e", new Object[]{fbuVar}) : fbuVar.f9568a;
    }

    static {
        kge.a(79801329);
        m = ecv.a(125.0f);
    }

    public fbu(Context context, boolean z) {
        super(context);
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = new j() { // from class: tb.fbu.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.event.j
            public i handleEvent(Event event) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
                }
                if (eno.a(d.class) == event.getEventId() && fbu.this.h != null) {
                    fbu.this.h.a((IDMComponent) null);
                }
                return i.SUCCESS;
            }

            @Override // com.taobao.android.trade.event.j
            public ThreadMode getThreadMode() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
            }
        };
        this.g = z;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.NewMainPicViewHolder");
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
        } else if (this.j) {
        } else {
            this.j = true;
            Activity activity = (Activity) this.f9568a;
            com.taobao.android.detail.core.perf.c.b(activity, "mainPicViewRender");
            com.taobao.android.detail.core.perf.c.b(activity, "viewRender");
            if (!(this.f9568a instanceof DetailActivity)) {
                return;
            }
            ebx ebxVar = ((DetailActivity) this.f9568a).f9411a;
            long uptimeMillis = SystemClock.uptimeMillis();
            ebxVar.G = uptimeMillis;
            String str = ebxVar.q;
            String a2 = com.taobao.android.detail.core.performance.preload.b.a(ebxVar.q);
            Map<String, String> a3 = com.taobao.android.detail.core.perf.d.a((DetailCoreActivity) activity, str, a2);
            String b = b((DetailActivity) this.f9568a);
            com.taobao.android.detail.core.perf.c.a(activity, b, "ProductDetail_FirstScreen", ebxVar.w, uptimeMillis, a3);
            a((DetailActivity) this.f9568a, b, ebxVar.w, uptimeMillis);
            ecg.d(this.f9568a, ebxVar.f27180a, str, a2);
            if (!this.k) {
                return;
            }
            if (a((DetailActivity) this.f9568a)) {
                com.taobao.android.detail.core.perf.c.a(activity, "aura_visibleIntervals", this.r, uptimeMillis);
            } else {
                com.taobao.android.detail.core.perf.c.a(activity, "visibleIntervals", this.r, uptimeMillis);
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
        if (StringUtils.equals(str, "aura_preload_visible")) {
            h.b(detailActivity, j3, j5, H);
        } else if (StringUtils.equals(str, "aura_visible")) {
            h.a(detailActivity, j3, j5, H);
        } else if (StringUtils.equals(str, "preload_visible")) {
            h.d(detailActivity, j3, j5);
        } else if (!StringUtils.equals(str, "visible")) {
        } else {
            h.c(detailActivity, j3, j5);
        }
    }

    private String b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b273321", new Object[]{this, detailActivity}) : a(detailActivity) ? this.k ? "aura_preload_visible" : "aura_visible" : this.k ? "preload_visible" : "visible";
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!(this.f9568a instanceof DetailActivity) || this.k) {
        } else {
            this.k = true;
            ebx ebxVar = ((DetailActivity) this.f9568a).f9411a;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (a((DetailActivity) this.f9568a)) {
                com.taobao.android.detail.core.perf.c.a((Activity) this.f9568a, "cache_aura_visible", "ProductDetail_FirstScreen_Cache", ebxVar.w, uptimeMillis);
                h.i((Activity) this.f9568a, uptimeMillis - ebxVar.w);
            } else {
                com.taobao.android.detail.core.perf.c.a((Activity) this.f9568a, "cache_visible", "ProductDetail_FirstScreen_Cache", ebxVar.w, uptimeMillis);
            }
            ecg.a(this.f9568a, ebxVar.f27180a, ebxVar.q, com.taobao.android.detail.core.performance.preload.b.a(ebxVar.q));
            this.r = uptimeMillis;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(final Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        if (s.b()) {
            return new Space(context);
        }
        if (this.f9568a instanceof Activity) {
            com.taobao.android.detail.core.perf.c.a((Activity) this.f9568a, "mainPicViewCreate");
        }
        com.taobao.android.detail.mainpic.h hVar = new com.taobao.android.detail.mainpic.h();
        hVar.a(ecu.f27202a);
        hVar.a(new a());
        if (this.f9568a instanceof com.taobao.android.detail.wrapper.activity.b) {
            hVar.b(((com.taobao.android.detail.wrapper.activity.b) this.f9568a).ae());
        }
        hVar.a(ecu.ab);
        hVar.a(new etz() { // from class: tb.fbu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.etz
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (fbu.a(fbu.this) == null || !fbu.a(fbu.this).n()) {
                    fbu.c(fbu.this);
                } else {
                    fbu.b(fbu.this);
                }
            }
        });
        hVar.a(new eub() { // from class: tb.fbu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eub
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (fbu.a(fbu.this) == null || !fbu.a(fbu.this).n()) {
                    fbu.c(fbu.this);
                } else {
                    fbu.b(fbu.this);
                }
            }
        });
        a(hVar);
        this.h = g.a(context, hVar);
        this.h.a(viewGroup);
        if (this.f9568a instanceof DetailCoreActivity) {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.f9568a;
            this.h.a(detailCoreActivity.N());
            if (detailCoreActivity.b != null && detailCoreActivity.b.y() != null) {
                detailCoreActivity.b.y().a(new e() { // from class: tb.fbu.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private boolean b;

                    @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int i, float f, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                        } else if (this.b || f <= 0.1f || i != 0) {
                        } else {
                            fbu.this.c();
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
        if (eme.a(this.f9568a) && (this.f9568a instanceof DetailActivity)) {
            ((DetailActivity) this.f9568a).a(new InsideLinearLayout.a() { // from class: tb.fbu.4
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
                    g gVar = fbu.this.h;
                    if (insideDetailState != InsideLinearLayout.InsideDetailState.HALF_SCREEN) {
                        z = false;
                    }
                    gVar.b(z);
                }
            });
            this.h.b(true);
        }
        this.h.a(new euc() { // from class: tb.fbu.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.euc
            public boolean a(DWInstance dWInstance, final IDMComponent iDMComponent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7f45402f", new Object[]{this, dWInstance, iDMComponent})).booleanValue();
                }
                if (dWInstance.getVideoState() == 1 || dWInstance.getVideoState() == 5 || dWInstance.getVideoState() == 8) {
                    dWInstance.setRootViewClickListener(new z() { // from class: tb.fbu.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.common.z
                        public boolean hook() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                            }
                            fbu.this.h.a(iDMComponent);
                            com.taobao.android.detail.core.event.video.c.a(context, (com.taobao.android.trade.event.c) null, false);
                            return false;
                        }
                    });
                    dWInstance.setVideoLifecycleListener(new av() { // from class: tb.fbu.5.2
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
                                fbu.c(fbu.this);
                            }
                        }

                        @Override // com.taobao.avplayer.av
                        public void onVideoComplete() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d3c2c53c", new Object[]{this});
                            } else {
                                com.taobao.android.detail.core.event.video.c.a(context, (com.taobao.android.trade.event.c) null, false);
                            }
                        }
                    });
                    if (fbu.d(fbu.this)) {
                        com.taobao.android.detail.wrapper.ext.video.d.a(context, dWInstance, null, DetailVideoSource.GALLERY, fbu.d(), fbu.d(), 0, 0);
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
                com.taobao.android.detail.core.event.video.c.a(context, (com.taobao.android.trade.event.c) null, false);
                return true;
            }
        });
        this.h.a(new eua() { // from class: tb.fbu.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eua
            public boolean a(View view, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b3af19a", new Object[]{this, view, new Float(f)})).booleanValue();
                }
                f.a(fbu.e(fbu.this), new edp());
                return true;
            }
        });
        this.h.a(new ety() { // from class: tb.fbu.7
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
                    f.a(fbu.f(fbu.this)).a(gVar);
                }
            }
        });
        com.taobao.android.trade.event.d a2 = f.a(this.f9568a);
        if (a2 != null) {
            a2.a(eno.a(d.class), this.l);
        }
        if (this.f9568a instanceof Activity) {
            com.taobao.android.detail.core.perf.c.b((Activity) this.f9568a, "mainPicViewCreate");
            com.taobao.android.detail.core.perf.c.a((Activity) this.f9568a, "mainPicViewRender");
        }
        j();
        return this.h.b();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5953b14", new Object[]{this, multiMediaModel});
            return;
        }
        if ((this.f9568a instanceof Activity) && !this.i) {
            com.taobao.android.detail.core.perf.c.a((Activity) this.f9568a, "mainPicDataProcess");
        }
        if (multiMediaModel == null || multiMediaModel.nodeBundle == null || this.h == null) {
            com.taobao.android.detail.core.utils.i.a("boze", "fillData model is null");
            return;
        }
        this.q = multiMediaModel.nodeBundle;
        int b = b(multiMediaModel);
        if (eup.a()) {
            h();
        }
        this.h.a(multiMediaModel.nodeBundle, b);
        if ((this.f9568a instanceof Activity) && !this.i) {
            com.taobao.android.detail.core.perf.c.b((Activity) this.f9568a, "mainPicDataProcess");
        }
        this.i = true;
    }

    private int b(MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b663b988", new Object[]{this, multiMediaModel})).intValue();
        }
        if ((multiMediaModel.nodeBundle != null && multiMediaModel.nodeBundle.m()) || multiMediaModel.dmComponent == null) {
            return -1;
        }
        IDMComponent parent = multiMediaModel.dmComponent.getParent();
        while (parent != null && !StringUtils.equals(parent.getKey(), "detailInfoUltron")) {
            parent = parent.getParent();
        }
        if (parent != null) {
            for (IDMComponent iDMComponent : parent.getChildren()) {
                if (StringUtils.equals(iDMComponent.getKey(), "detailPromote")) {
                    break;
                }
            }
        }
        z = false;
        return (z || multiMediaModel.nodeBundle == null || !multiMediaModel.nodeBundle.b) ? -1 : 0;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.h == null || this.p != null) {
        } else {
            this.p = new ffj();
            this.h.a(this.p);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        k();
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.x();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.H_();
    }

    private boolean i() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        boolean a2 = fgr.a("enable_main_pic_mini_video_switch", true, false);
        com.taobao.android.detail.core.utils.i.d(TAG, "canShowMiniVideo enableMiniVideoSwitch: " + a2);
        if (!a2 || (gVar = this.h) == null || !(gVar.e() instanceof LifecycleOwner)) {
            return true;
        }
        Lifecycle.State currentState = ((LifecycleOwner) this.h.e()).getLifecycle().getCurrentState();
        StringBuilder sb = new StringBuilder();
        sb.append("canShowMiniVideo currentState: ");
        sb.append(currentState);
        sb.append(",");
        sb.append(currentState == Lifecycle.State.RESUMED);
        com.taobao.android.detail.core.utils.i.d(TAG, sb.toString());
        return currentState == Lifecycle.State.RESUMED;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        if (this.h == null) {
            return;
        }
        if (eme.a(this.f9568a) && (this.f9568a instanceof DetailActivity)) {
            ((DetailActivity) this.f9568a).a(this.h.b(), this.h.o().c());
        }
        this.h.I_();
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
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.a();
    }

    /* loaded from: classes5.dex */
    public final class a extends q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(46940133);
        }

        private a() {
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
                if (fbu.this.g) {
                    fbu.a(fbu.this, jSONObject);
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

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!"openRate".equals(jSONObject.getString("type"))) {
        } else {
            jSONObject.put("type", com.taobao.android.detail.ttdetail.handler.bizhandlers.s.EVENT_TYPE_ALTERNATIVE);
        }
    }

    private void j() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (fgj.a() || (z = this.n) || this.h == null || z) {
        } else {
            this.o = new fgl();
            this.o.a(new fgl.a() { // from class: tb.fbu.9
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
                    if (!(fbu.g(fbu.this) instanceof DetailActivity) || (C = (detailActivity = (DetailActivity) fbu.h(fbu.this)).C()) == null) {
                        return hashMap;
                    }
                    String i = C.i();
                    if (StringUtils.isEmpty(i)) {
                        return hashMap;
                    }
                    hashMap.put("token", detailActivity.h);
                    hashMap.put(fgl.ORIGINALITEMID, i);
                    hashMap.put(fgl.TARGETITEMID, i);
                    return hashMap;
                }
            });
            this.h.n().a(this.o);
            this.n = true;
        }
    }

    private void k() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.o == null || (gVar = this.h) == null) {
        } else {
            gVar.n().b(this.o);
            this.n = false;
        }
    }
}
