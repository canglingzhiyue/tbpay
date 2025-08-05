package com.taobao.android.detail.core.detail.activity;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.model.constant.DetailConstants;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.g;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.task.Coordinator;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.android.trade.locator.callback.LocatorAction;
import com.taobao.android.trade.locator.callback.d;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.dxz;
import tb.dyd;
import tb.dyf;
import tb.dyy;
import tb.ecf;
import tb.edh;
import tb.edi;
import tb.edj;
import tb.edk;
import tb.edl;
import tb.ehu;
import tb.ehw;
import tb.eie;
import tb.eig;
import tb.eip;
import tb.emu;
import tb.end;
import tb.eng;
import tb.eno;
import tb.epe;
import tb.epo;
import tb.eqb;
import tb.god;
import tb.ieg;
import tb.iza;
import tb.izb;
import tb.izc;
import tb.jkc;
import tb.jke;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements j, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGENAME = "Page_Detail";
    public static final String TAG = "DetailMainPage";

    /* renamed from: a  reason: collision with root package name */
    public NestedScrollContainer f9420a;
    public dyy b;
    public com.taobao.android.detail.core.detail.widget.d c;
    public DialogFragment d;
    public f e;
    private ViewGroup h;
    private dyf i;
    private ehu k;
    private Activity m;
    private jkc n;
    private eie s;
    public ieg y;
    private List<com.taobao.android.detail.core.detail.widget.container.a> j = new ArrayList();
    private ArrayList<View> l = new ArrayList<>();
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private boolean r = true;
    private final List<com.taobao.android.detail.core.detail.widget.container.d> t = new ArrayList();
    private final List<dxz.a> u = new ArrayList();
    public boolean f = false;
    public boolean g = false;
    private dxz.a v = new dxz.a() { // from class: com.taobao.android.detail.core.detail.activity.b.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dxz.a
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
                return;
            }
            for (dxz.a aVar : b.j(b.this)) {
                aVar.a(i, str, str2);
            }
        }

        @Override // tb.dxz.a
        public void a(int i, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2de12f2d", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
                return;
            }
            for (dxz.a aVar : b.j(b.this)) {
                aVar.a(i, z, str, str2);
            }
        }
    };
    private View.OnClickListener w = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.activity.b.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b.k(b.this);
            ecf.a(b.a(b.this));
        }
    };
    private DetailListView.b x = new DetailListView.b() { // from class: com.taobao.android.detail.core.detail.activity.b.7
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b = (int) (epo.f27511a * 300.0f);

        @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            i.a(b.TAG, "onScrollYChange newY = " + i + " oldY = " + i2);
            if (b.d(b.this) != null) {
                if (i >= this.b) {
                    b.a(b.this, 1.0f);
                } else if (Math.abs(i - i2) > 2) {
                    b.a(b.this, (i * 1.0f) / this.b);
                }
            }
            b.c(b.this, i);
            if (b.l(b.this) == null) {
                return;
            }
            b bVar = b.this;
            b.b(bVar, b.l(bVar).q());
            String str = "main list view rate top " + b.g(b.this);
        }
    };

    static {
        kge.a(-1911608448);
        kge.a(-1134841149);
        kge.a(-1453870097);
        kge.a(1145648425);
    }

    public static /* synthetic */ int a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4debbfa", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.o = i;
        return i;
    }

    public static /* synthetic */ Activity a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("948379ac", new Object[]{bVar}) : bVar.m;
    }

    public static /* synthetic */ void a(b bVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4deb0c4", new Object[]{bVar, new Float(f)});
        } else {
            bVar.a(f);
        }
    }

    public static /* synthetic */ void a(b bVar, end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcfba31", new Object[]{bVar, endVar});
        } else {
            bVar.c(endVar);
        }
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2c6dbb0", new Object[]{bVar})).intValue() : bVar.o;
    }

    public static /* synthetic */ int b(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6150ed9", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.q = i;
        return i;
    }

    public static /* synthetic */ int c(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a74b61b8", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.p = i;
        return i;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc1b3102", new Object[]{bVar})).booleanValue() : bVar.q();
    }

    public static /* synthetic */ ehu d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehu) ipChange.ipc$dispatch("d11f9975", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ boolean e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2ec3db84", new Object[]{bVar})).booleanValue() : bVar.r;
    }

    public static /* synthetic */ List f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1dffe766", new Object[]{bVar}) : bVar.t;
    }

    public static /* synthetic */ int g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("816c85f5", new Object[]{bVar})).intValue() : bVar.q;
    }

    public static /* synthetic */ int h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aac0db36", new Object[]{bVar})).intValue() : bVar.p;
    }

    public static /* synthetic */ void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4153084", new Object[]{bVar});
        } else {
            bVar.n();
        }
    }

    public static /* synthetic */ List j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18169e2", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bddb06", new Object[]{bVar});
        } else {
            bVar.m();
        }
    }

    public static /* synthetic */ dyf l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyf) ipChange.ipc$dispatch("7312e00e", new Object[]{bVar}) : bVar.i;
    }

    public b(Activity activity, ViewGroup viewGroup) {
        this.h = viewGroup;
        this.m = activity;
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.m);
        if (a2 != null) {
            a2.a(eno.a(edl.class), this);
            a2.a(eno.a(edi.class), this);
            a2.a(eno.a(com.taobao.android.detail.core.event.basic.a.class), this);
            a2.a(eno.a(edk.class), this);
            a2.a(eno.a(edj.class), this);
            a2.a(eno.a(edh.class), this);
        }
        this.n = jke.a(activity);
        this.n.a(LocatorAction.LOCATOR, this);
        emu.a("com.taobao.android.detail.core.detail.activity.DetailMainPage");
    }

    @Deprecated
    public void a(eng engVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72c513a", new Object[]{this, engVar});
        } else if (engVar == null) {
        } else {
            try {
                c();
                this.i.a((List<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) engVar.f27460a);
            } catch (Throwable th) {
                i.a("Page_Detail", "loadDefaultLayout", th);
            }
        }
    }

    public void a() {
        List<com.taobao.android.detail.core.detail.widget.container.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f && (list = this.j) != null && !list.isEmpty()) {
            this.f = true;
            List<com.taobao.android.detail.core.detail.widget.container.a> list2 = this.j;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            for (com.taobao.android.detail.core.detail.widget.container.a aVar : this.j) {
                if (aVar instanceof dyd) {
                    aVar.a();
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g) {
        } else {
            i.a(g.TAG, "preloadDetailRecommendContent");
            this.g = true;
            Coordinator.postTask(new Coordinator.TaggedRunnable("preloadDetailBottomContent") { // from class: com.taobao.android.detail.core.detail.activity.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (b.a(b.this) != null && !b.a(b.this).isFinishing()) {
                            i.a(g.TAG, "DetailMainPage.preloadDetailRecommendContent .run ");
                            ehw b = ((h) com.taobao.android.detail.core.open.j.a(b.a(b.this))).b();
                            ComponentModel componentModel = new ComponentModel();
                            componentModel.type = "guessYouLike";
                            com.taobao.android.detail.core.detail.widget.container.a b2 = b.b((DetailCoreActivity) b.a(b.this), new epe(componentModel) { // from class: com.taobao.android.detail.core.detail.activity.b.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(C03671 c03671, String str, Object... objArr) {
                                    if (str.hashCode() == 333833545) {
                                        return super.getType();
                                    }
                                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                                }

                                @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
                                public String getType() {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("13e5e549", new Object[]{this}) : super.getType();
                                }
                            });
                            if (b2 == null) {
                                return;
                            }
                            b2.a();
                        }
                    } catch (Throwable th) {
                        UnifyLog.d(b.TAG, "preloadDetailBottomContent error", th.getMessage());
                    }
                }
            });
        }
    }

    private boolean q() {
        Activity activity;
        View findViewById;
        View findViewById2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        Activity activity2 = this.m;
        if (activity2 != null && (findViewById2 = activity2.findViewById(R.id.fl_industry_mini_video_window)) != null && findViewById2.getVisibility() == 0) {
            z = true;
        }
        if (!z) {
            try {
                iza a2 = new izb().a(izc.class);
                if (a2 instanceof izc) {
                    z = ((izc) a2).a();
                }
            } catch (Throwable unused) {
            }
        }
        if (!z && (activity = this.m) != null && (findViewById = activity.findViewById(R.id.dl_mini_video_drag_container)) != null && findViewById.getVisibility() == 0) {
            return true;
        }
        return z;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (eip.n) {
            this.f9420a = new NestedScrollContainer(this.m);
            this.f9420a.setId(R.id.aliDetailNestedScrollContainer);
            i.c(com.taobao.android.detail.core.performance.a.a(TAG), "NestedScrollContainer通过代码create");
        } else {
            this.f9420a = (NestedScrollContainer) LayoutInflater.from(this.m).inflate(R.layout.x_detail_scroll_container, (ViewGroup) null);
            i.c(com.taobao.android.detail.core.performance.a.a(TAG), "NestedScrollContainer通过Layout文件create");
        }
        this.h.addView(this.f9420a);
        this.f9420a.setScrollIndexListener(new com.taobao.android.detail.core.detail.widget.container.d() { // from class: com.taobao.android.detail.core.detail.activity.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.container.d
            public void a(int i, String str, int i2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
                    return;
                }
                if (b.b(b.this) != i) {
                    i.d(b.TAG, "current index change from " + b.b(b.this) + " to " + i);
                    if (i == 0) {
                        if (b.b(b.this) > 0 && !b.c(b.this)) {
                            com.taobao.android.detail.core.utils.b.a(b.a(b.this));
                        }
                    } else if (b.b(b.this) == 0 && !b.c(b.this)) {
                        com.taobao.android.detail.core.utils.b.b(b.a(b.this));
                    }
                    b.a(b.this, i);
                    if (b.this.b != null) {
                        b.this.b.d(b.b(b.this));
                    }
                    if (b.b(b.this) != 0) {
                        if (b.d(b.this) != null) {
                            if (b.e(b.this)) {
                                b.d(b.this).highlightTab(str);
                            }
                            b.a(b.this, 1.0f);
                        }
                        if (b.this.c != null) {
                            b.this.c.a(str);
                        }
                    }
                    for (com.taobao.android.detail.core.detail.widget.container.d dVar : b.f(b.this)) {
                        dVar.a(i, str, i2);
                    }
                }
                if (b.b(b.this) != 0) {
                    return;
                }
                if (b.g(b.this) == -1 || b.h(b.this) == -1) {
                    b.i(b.this);
                    if (b.this.c == null) {
                        return;
                    }
                    b.this.c.a("detailInfoAura");
                    return;
                }
                if (com.taobao.android.detail.core.aura.utils.a.b(b.a(b.this)) && b.this.f9420a != null) {
                    b.this.f9420a.updateStatusBarHeight();
                }
                if (i2 + b.h(b.this) < b.g(b.this) - b.this.f9420a.mAdditionalHeight) {
                    z = false;
                }
                if (!z || !b.e(b.this)) {
                    b.i(b.this);
                } else if (b.d(b.this) != null) {
                    b.d(b.this).highlightTab(com.taobao.android.detail.ttdetail.constant.a.DIVISION_RATE);
                }
                if (b.this.c == null) {
                    return;
                }
                b.this.c.a(com.taobao.android.detail.ttdetail.constant.a.DIVISION_RATE);
            }
        });
        if (!s.b()) {
            this.f9420a.setOnScrollListener(new NestedScrollContainer.b() { // from class: com.taobao.android.detail.core.detail.activity.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.b
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (b.this.c == null) {
                    } else {
                        b.this.c.a(i);
                    }
                }
            });
        }
        if (this.i == null) {
            this.i = new dyf(this.m);
        }
        this.i.a(this.e);
        this.i.a(this.x);
        this.i.a(this.v);
        this.j.add(this.i);
        this.f9420a.addScrollChild(this.i);
        this.l.add(this.i.k());
        this.c = new com.taobao.android.detail.core.detail.widget.d(this.m);
        this.h.addView(this.c.a(), new FrameLayout.LayoutParams(-1, -1));
        if (god.d) {
            this.y = new ieg(this.m);
        }
        this.b = this.c.b();
        this.b.b(this.w);
        a(this.m, this.b);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.f9420a.scrollToPos(0);
        for (int i = 1; i < this.j.size(); i++) {
            this.j.get(i).a(true, true);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.k == null || !this.r) {
        } else {
            if (p()) {
                this.k.highlightTab("detailInfoAura");
                return;
            }
            f fVar = this.e;
            if (fVar != null && fVar.a()) {
                this.k.highlightTab("detailInfoUltron");
            } else {
                this.k.highlightTab("detailInfo");
            }
        }
    }

    private void a(Activity activity, dyy dyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5af126", new Object[]{this, activity, dyyVar});
            return;
        }
        eig k = ((h) n.a(activity)).k();
        if (k == null) {
            this.s = null;
            return;
        }
        this.s = k.a();
        eie eieVar = this.s;
        if (eieVar == null) {
            return;
        }
        eieVar.a(this.m, dyyVar);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        dyf dyfVar = this.i;
        if (dyfVar == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        dyfVar.k().getLocationInWindow(iArr);
        this.f9420a.getLocationInWindow(iArr2);
        if (iArr2[1] - iArr[1] <= 0) {
            return;
        }
        this.i.a(Integer.MAX_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc A[Catch: Throwable -> 0x0198, TryCatch #3 {Throwable -> 0x0198, blocks: (B:6:0x0017, B:8:0x0022, B:10:0x0026, B:14:0x0052, B:16:0x005a, B:19:0x005f, B:21:0x0067, B:22:0x006d, B:24:0x0073, B:25:0x0082, B:39:0x00c6, B:40:0x00f6, B:42:0x00fc, B:44:0x0116, B:46:0x0125, B:47:0x012c, B:49:0x0170, B:48:0x0153, B:26:0x0088, B:28:0x0091, B:29:0x0097, B:31:0x009d, B:33:0x00a7, B:34:0x00ab, B:13:0x0036, B:50:0x0185, B:35:0x00b0), top: B:76:0x0017, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.end r11) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.activity.b.a(tb.end):void");
    }

    private void d(final end endVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b407a0", new Object[]{this, endVar});
            return;
        }
        if (endVar == null || endVar.b == null || endVar.b.b == null || endVar.b.b.f10055a == null || !endVar.b.b.f10055a.n()) {
            z = false;
        }
        if (z) {
            return;
        }
        ((DetailCoreActivity) this.m).A().post(new Runnable() { // from class: com.taobao.android.detail.core.detail.activity.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(b.this, endVar);
                }
            }
        });
    }

    private void c(end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c431011f", new Object[]{this, endVar});
            return;
        }
        this.c.a(endVar);
        if (endVar.e != null) {
            boolean e = e(endVar);
            dyy dyyVar = this.b;
            if (dyyVar != null) {
                dyyVar.a(e);
                this.b.b(true);
            }
            if (e) {
                return;
            }
            this.c.a(endVar.e);
            return;
        }
        this.c.c();
        dyy dyyVar2 = this.b;
        if (dyyVar2 == null) {
            return;
        }
        dyyVar2.a(true);
        this.b.b(true);
    }

    private boolean e(end endVar) {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1370e25", new Object[]{this, endVar})).booleanValue() : (endVar.f27459a == null || endVar.f27459a.f10055a == null || (f = eqb.f(endVar.f27459a.f10055a)) == null || !f.isEnabledDetail3Tab()) ? false : true;
    }

    private void a(end endVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e830a7", new Object[]{this, endVar, str});
        } else if (p()) {
            this.n.a(com.taobao.android.detail.ttdetail.constant.a.DIVISION_RATE, str, null);
        } else {
            f fVar = this.e;
            if (fVar != null) {
                for (String str2 : fVar.h()) {
                    this.n.a(str2, str, null);
                }
            } else if (endVar.b != null && endVar.b.f27460a != null) {
                for (T t : endVar.b.f27460a) {
                    this.n.a(t.mLocatorId, str, null);
                }
            }
        }
    }

    public void b(end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5adfa9e", new Object[]{this, endVar});
            return;
        }
        if (endVar != null) {
            try {
                if (endVar.b != null && this.i != null) {
                    this.i.a((List<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) endVar.b.f27460a);
                    if (this.f9420a.getScrollY() > 0) {
                        this.i.a(Integer.MAX_VALUE, false);
                    }
                    a(endVar, this.i.f());
                }
            } catch (Throwable th) {
                i.a("Page_Detail", "refreshDetail", th);
                return;
            }
        }
        c(endVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        NestedScrollContainer nestedScrollContainer = this.f9420a;
        if (nestedScrollContainer == null) {
            return;
        }
        nestedScrollContainer.refreshHeight();
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (this.k == null) {
        } else {
            if (s.b()) {
                this.k.setTransparency(1.0f);
                this.k.setPadTransparency(f);
                f = 1.0f;
            } else {
                this.k.setTransparency(f);
            }
            if (f < 0.2f) {
                z = false;
            }
            a(z);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Activity activity = this.m;
        if (!(activity instanceof DetailCoreActivity) || !((DetailCoreActivity) activity).F()) {
            return;
        }
        ehu ehuVar = this.k;
        if (ehuVar instanceof View) {
            ((View) ehuVar).setClickable(z);
        }
        View findViewById = this.m.findViewById(R.id.actionbar_layout);
        if (findViewById == null) {
            return;
        }
        findViewById.setClickable(z);
    }

    public void a(ehu ehuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6de2166", new Object[]{this, ehuVar});
            return;
        }
        this.k = ehuVar;
        if (ehuVar != null) {
            DetailConstants.f9636a = ehuVar.getActionBarHeight();
        }
        a(0.0f);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail.core.detail.widget.container.a aVar : this.j) {
            aVar.c();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail.core.detail.widget.container.a aVar : this.j) {
            aVar.a(false, false);
        }
        eie eieVar = this.s;
        if (eieVar != null) {
            eieVar.b();
        }
        ieg iegVar = this.y;
        if (iegVar == null) {
            return;
        }
        iegVar.b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        NestedScrollContainer nestedScrollContainer = this.f9420a;
        if (nestedScrollContainer != null) {
            nestedScrollContainer.onResume();
        }
        eie eieVar = this.s;
        if (eieVar != null) {
            eieVar.a();
        }
        ieg iegVar = this.y;
        if (iegVar == null) {
            return;
        }
        iegVar.a();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        eie eieVar = this.s;
        if (eieVar != null) {
            eieVar.c();
        }
        dyf dyfVar = this.i;
        if (dyfVar != null) {
            dyfVar.d();
        }
        ieg iegVar = this.y;
        if (iegVar != null) {
            iegVar.c();
        }
        com.taobao.android.detail.core.detail.widget.d dVar = this.c;
        if (dVar != null) {
            dVar.i();
        }
        for (com.taobao.android.detail.core.detail.widget.container.a aVar : this.j) {
            aVar.d();
        }
        o();
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.m);
        if (a2 != null) {
            a2.b(eno.a(edl.class), this);
            a2.b(eno.a(edi.class), this);
            a2.b(eno.a(com.taobao.android.detail.core.event.basic.a.class), this);
            a2.b(eno.a(edk.class), this);
            a2.b(eno.a(edj.class), this);
            a2.b(eno.a(edh.class), this);
        }
        if (this.n == null) {
            return;
        }
        jke.b(this.m);
    }

    private void o() {
        ArrayList<View> arrayList = this.l;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.l.clear();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.m.getSystemService("input_method");
        try {
            Method declaredMethod = Class.forName("android.view.inputmethod.InputMethodManager").getDeclaredMethod("windowDismissed", IBinder.class);
            Iterator<View> it = this.l.iterator();
            while (it.hasNext()) {
                declaredMethod.invoke(inputMethodManager, it.next().getWindowToken());
            }
            declaredMethod.invoke(inputMethodManager, null);
        } catch (Exception e) {
            i.a(TAG, "destroy", e);
        }
        this.l.clear();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(Event event) {
        jkc jkcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (event == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (eno.a(edl.class) == event.getEventId()) {
            j();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(edi.class) == event.getEventId()) {
            k();
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.basic.a.class) == event.getEventId() && (event instanceof com.taobao.android.detail.core.event.basic.a) && (jkcVar = this.n) != null) {
            jkcVar.b(((com.taobao.android.detail.core.event.basic.a) event).f9694a);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(edk.class) == event.getEventId()) {
            this.f9420a.scrollBy(0, ((edk) event).f27210a);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(edj.class) == event.getEventId()) {
            this.r = ((edj) event).f27209a;
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(edh.class) == event.getEventId()) {
            a(1.0f);
            return com.taobao.android.trade.event.i.SUCCESS;
        } else {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        NestedScrollContainer nestedScrollContainer;
        List<com.taobao.android.detail.core.detail.widget.container.c> scrollChildList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        i.d(TAG, "locator id " + str);
        if (!TextUtils.isEmpty(str) && (nestedScrollContainer = this.f9420a) != null && (scrollChildList = nestedScrollContainer.getScrollChildList()) != null) {
            for (int i = 0; i < scrollChildList.size(); i++) {
                if (str.equals(scrollChildList.get(i).f())) {
                    if (s.b()) {
                        this.f9420a.scrollToPos(i, true, false);
                    } else {
                        this.f9420a.scrollToPos(i);
                    }
                    if (i == 0 || (i == 1 && (str.equals("detailInfo") || str.equals("detailInfoUltron") || str.equals("detailInfoAura")))) {
                        for (int i2 = 1; i2 < this.j.size(); i2++) {
                            this.j.get(i2).a(true, true);
                        }
                    }
                    return new com.taobao.android.trade.locator.callback.a(scrollChildList.get(i), null);
                }
            }
        }
        return null;
    }

    @Override // com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        } else if (aVar == null) {
        } else {
            bVar.a();
        }
    }

    public void a(dxz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bb1a55", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.u.add(aVar);
        }
    }

    public void b(dxz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef968496", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.u.remove(aVar);
        }
    }

    public void a(com.taobao.android.detail.core.detail.widget.container.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aac4e33", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.t.add(dVar);
        }
    }

    public void b(com.taobao.android.detail.core.detail.widget.container.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3bd274", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.t.remove(dVar);
        }
    }

    public dyf l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyf) ipChange.ipc$dispatch("63a607e2", new Object[]{this}) : this.i;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        Activity activity = this.m;
        if (!(activity instanceof DetailCoreActivity)) {
            return false;
        }
        return ((DetailCoreActivity) activity).F();
    }
}
