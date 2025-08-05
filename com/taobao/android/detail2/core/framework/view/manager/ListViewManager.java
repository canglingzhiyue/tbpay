package com.taobao.android.detail2.core.framework.view.manager;

import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.android.detail2.core.framework.view.feeds.c;
import com.taobao.android.weex_framework.l;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.fho;
import tb.fhp;
import tb.fjh;
import tb.fjl;
import tb.fjp;
import tb.fjt;
import tb.fkr;
import tb.flm;
import tb.fmb;
import tb.fmd;
import tb.hnj;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class ListViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PULL_END_LAST_PAGE_TEXT = "没有更多了";
    public static final String PULL_END_LOADING_TEXT = "正在加载更多";
    public static final String PULL_END_PULL_LOAD_MORE_TEXT = "上拉加载更多";

    /* renamed from: a  reason: collision with root package name */
    private fmd f11598a;
    private fmb b;
    private DetailVerticalRecyclerView c;
    private com.taobao.android.detail2.core.framework.view.feeds.c d;
    private PullBase e;
    private TextView f;
    private LinearLayout g;
    private ListStatus h;
    private boolean i;
    private a j;
    private d k;
    private long l;
    private com.taobao.android.detail2.core.framework.b m;
    private flm n;
    private DetailVerticalRecyclerView.b o;
    private PullBase.b p;
    private DetailVerticalRecyclerView.d q;
    private DetailVerticalRecyclerView.a r;

    /* renamed from: com.taobao.android.detail2.core.framework.view.manager.ListViewManager$7  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11605a = new int[ListStatus.values().length];

        static {
            try {
                f11605a[ListStatus.STATUS_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11605a[ListStatus.STATUS_LAST_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11605a[ListStatus.STATUS_PULL_LOAD_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum ListStatus {
        STATUS_LOADING,
        STATUS_PULL_LOAD_MORE,
        STATUS_LAST_PAGE
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar);

        void b(com.taobao.android.detail2.core.framework.view.feeds.d dVar);

        void c(com.taobao.android.detail2.core.framework.view.feeds.d dVar);
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static final String ERROR_CODE_NEXT_NID_NOT_EXIST = "10003";
        public static final String ERROR_CODE_NID_IS_CURRENT = "10001";
        public static final String ERROR_CODE_NID_NOT_EXIST = "10002";
        public static final String ERROR_CODE_PRE_NID_NOT_EXIST = "10004";
        public static final String ERROR_MSG_NEXT_NID_NOT_EXIST = "下一张卡片找不到";
        public static final String ERROR_MSG_NID_IS_CURRENT = "nid就是当前卡片";
        public static final String ERROR_MSG_NID_NOT_EXIST = "nid找不到";
        public static final String ERROR_MSG_PRE_NID_NOT_EXIST = "上一张卡片找不到";

        /* renamed from: a  reason: collision with root package name */
        public boolean f11606a;
        public String b;
        public String c;

        static {
            kge.a(-1300322235);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static final String ERROR_CODE_EXCEED_SCREEN_HEIGHT = "10001";
        public static final String ERROR_CODE_HAS_NO_MORE_CARD = "10002";
        public static final String ERROR_MSG_EXCEED_SCREEN_HEIGHT = "offset超出屏幕高度";
        public static final String ERROR_MSG_HAS_NO_MORE_CARD = "对应方向没有更多商品";

        /* renamed from: a  reason: collision with root package name */
        public boolean f11607a;
        public String b;
        public String c;

        static {
            kge.a(-596700479);
        }
    }

    static {
        kge.a(1227366398);
    }

    public static /* synthetic */ d a(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("917ebb73", new Object[]{listViewManager}) : listViewManager.k;
    }

    public static /* synthetic */ d a(ListViewManager listViewManager, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e4200e5d", new Object[]{listViewManager, dVar});
        }
        listViewManager.k = dVar;
        return dVar;
    }

    public static /* synthetic */ void a(ListViewManager listViewManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82064aca", new Object[]{listViewManager, new Integer(i)});
        } else {
            listViewManager.g(i);
        }
    }

    public static /* synthetic */ void a(ListViewManager listViewManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec38179", new Object[]{listViewManager, new Integer(i), new Integer(i2)});
        } else {
            listViewManager.b(i, i2);
        }
    }

    public static /* synthetic */ void a(ListViewManager listViewManager, com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4f21b2", new Object[]{listViewManager, dVar, str});
        } else {
            listViewManager.c(dVar, str);
        }
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.view.feeds.c b(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.view.feeds.c) ipChange.ipc$dispatch("fb4a842c", new Object[]{listViewManager}) : listViewManager.d;
    }

    public static /* synthetic */ void b(ListViewManager listViewManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b079c69", new Object[]{listViewManager, new Integer(i)});
        } else {
            listViewManager.f(i);
        }
    }

    public static /* synthetic */ void b(ListViewManager listViewManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ec63ba", new Object[]{listViewManager, new Integer(i), new Integer(i2)});
        } else {
            listViewManager.a(i, i2);
        }
    }

    public static /* synthetic */ ListStatus c(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStatus) ipChange.ipc$dispatch("24723a56", new Object[]{listViewManager}) : listViewManager.h;
    }

    public static /* synthetic */ a d(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("37b797ce", new Object[]{listViewManager}) : listViewManager.j;
    }

    public static /* synthetic */ fmd e(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("588679ac", new Object[]{listViewManager}) : listViewManager.f11598a;
    }

    public static /* synthetic */ DetailVerticalRecyclerView f(ListViewManager listViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailVerticalRecyclerView) ipChange.ipc$dispatch("1a50d200", new Object[]{listViewManager}) : listViewManager.c;
    }

    public ListViewManager(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar) {
        this.h = null;
        if (!ipa.f()) {
            this.h = ListStatus.STATUS_PULL_LOAD_MORE;
        }
        this.i = true;
        this.k = null;
        this.o = new DetailVerticalRecyclerView.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
                if (r6 > r0.b(com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r0).k)) goto L12;
             */
            @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void a(int r5, int r6) {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L22
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r4
                    r2 = 1
                    java.lang.Integer r3 = new java.lang.Integer
                    r3.<init>(r5)
                    r1[r2] = r3
                    r5 = 2
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r6)
                    r1[r5] = r2
                    java.lang.String r5 = "5c1152c8"
                    r0.ipc$dispatch(r5, r1)
                    return
                L22:
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.data.model.d r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r0)
                    if (r0 == 0) goto L38
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.data.model.d r1 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r0)
                    java.lang.String r1 = r1.k
                    int r0 = r0.b(r1)
                    if (r6 <= r0) goto L41
                L38:
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.data.model.d r1 = r0.e(r6)
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r0, r1)
                L41:
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a(r0, r5, r6)
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r0 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager.b(r0, r5, r6)
                    com.taobao.android.detail2.core.framework.view.manager.ListViewManager r5 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.this
                    com.taobao.android.detail2.core.framework.view.feeds.c r5 = com.taobao.android.detail2.core.framework.view.manager.ListViewManager.b(r5)
                    r5.b()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.AnonymousClass1.a(int, int):void");
            }
        };
        this.p = new PullBase.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.b
            public void b(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c06f3ca3", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void c(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("54adac42", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                }
            }

            @Override // com.taobao.ptr.PullBase.b
            public void a(PullBase pullBase, PullBase.Mode mode, float f, int i) {
                int i2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c30cd04", new Object[]{this, pullBase, mode, new Float(f), new Integer(i)});
                } else if (ListViewManager.c(ListViewManager.this) == null || (i2 = AnonymousClass7.f11605a[ListViewManager.c(ListViewManager.this).ordinal()]) == 1 || i2 == 2 || i2 != 3) {
                } else {
                    ListViewManager.this.a(ListStatus.STATUS_LOADING);
                    if (ListViewManager.d(ListViewManager.this) == null) {
                        return;
                    }
                    ListViewManager.d(ListViewManager.this).a();
                }
            }
        };
        this.q = new DetailVerticalRecyclerView.d() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.d
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                ListViewManager.a(ListViewManager.this, i);
                ListViewManager.b(ListViewManager.this, i2);
                if (i2 != 1) {
                    return;
                }
                ListViewManager.e(ListViewManager.this).s();
                ListViewManager.this.q();
            }
        };
        this.r = new com.taobao.android.detail2.core.framework.view.feeds.b() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private boolean f11602a = false;
            private boolean c = false;

            @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
            public void a(RecyclerView recyclerView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
            public void a(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                if (ListViewManager.this.j() != null && ListViewManager.this.j().size() > 1) {
                    ListViewManager.e(ListViewManager.this).s();
                }
                if (Math.abs(i2) <= 0 || !this.f11602a) {
                    return;
                }
                this.c = true;
                this.f11602a = false;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "dragStart");
                fjt.a(fjt.TAG_RENDER, "onFeedsListScrollStateChange: dragStart");
                if (ListViewManager.b(ListViewManager.this) == null) {
                    return;
                }
                ListViewManager.b(ListViewManager.this).a("onFeedsListScrollStateChange", jSONObject);
            }

            @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
            public void b(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
                } else if (motionEvent.getActionMasked() == 0) {
                    this.f11602a = true;
                } else if (motionEvent.getActionMasked() != 1) {
                } else {
                    if (this.c) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", (Object) "dragEnd");
                        fjt.a(fjt.TAG_RENDER, "onFeedsListScrollStateChange: dragEnd");
                        if (ListViewManager.b(ListViewManager.this) != null) {
                            ListViewManager.b(ListViewManager.this).a("onFeedsListScrollStateChange", jSONObject);
                        }
                    }
                    this.c = false;
                    this.f11602a = false;
                }
            }

            @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
            public void a(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                } else if (motionEvent.getActionMasked() != 1) {
                } else {
                    if (this.c) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", (Object) "dragEnd");
                        fjt.a(fjt.TAG_RENDER, "onFeedsListScrollStateChange: dragEnd");
                        if (ListViewManager.b(ListViewManager.this) != null) {
                            ListViewManager.b(ListViewManager.this).a("onFeedsListScrollStateChange", jSONObject);
                        }
                    }
                    this.c = false;
                    this.f11602a = false;
                }
            }
        };
        this.m = bVar;
        this.f11598a = fmdVar;
        u();
        v();
        this.n = new flm(this.m);
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.b = new fmb();
        this.b.a("item", fho.c);
        this.b.a(fhp.VIEWHOLDER_KEY, fhp.d);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        if (!ipa.f()) {
            s();
        }
        this.c = (DetailVerticalRecyclerView) this.f11598a.c().findViewById(R.id.root_recycler_view);
        this.c.setNewDetailContext(this.m);
        if (w().ad()) {
            this.c.setEnableAlignTop(true);
        }
        this.c.addOnPageChangedListener(this.o);
        this.c.addOnScrollWillStatusListener(this.q);
        this.c.addCardScrollListener(this.r);
        if (ipa.T()) {
            hnj.a(this.c);
        }
        com.taobao.android.detail2.core.framework.b bVar = this.m;
        if (bVar == null || bVar.k() == null) {
            return;
        }
        this.m.k().a(this.c);
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.e = (PullBase) this.f11598a.c().findViewById(R.id.detail_feeds_pullbase);
        this.f = (TextView) this.f11598a.c().findViewById(R.id.new_detail_feeds_pull_end_text);
        this.g = (LinearLayout) this.f11598a.c().findViewById(R.id.new_detail_feeds_pull_end_ll);
        PullBase pullBase = this.e;
        if (pullBase == null) {
            return;
        }
        pullBase.addOnPullListener(this.p);
    }

    private fkr w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("b848d89b", new Object[]{this}) : this.m.h();
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d d = d(i);
        if (d != null) {
            this.m.h().a(d.H());
            a(d, "scroll");
        }
        c(d(i2), "scroll");
    }

    private void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae03c01", new Object[]{this, dVar, str});
        } else if (dVar == null) {
        } else {
            a aVar = this.j;
            if (aVar != null) {
                aVar.c(dVar);
            }
            dVar.e(str);
        }
    }

    private void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a127f6f3", new Object[]{this, dVar, str, new Boolean(z)});
        } else if (dVar == null) {
        } else {
            a aVar = this.j;
            if (aVar != null) {
                aVar.c(dVar);
            }
            dVar.b(str, z);
        }
    }

    private void b(com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1b5cd2", new Object[]{this, dVar, str, new Boolean(z)});
        } else if (dVar == null) {
        } else {
            dVar.a(str, z);
        }
    }

    private void b(com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2091e42", new Object[]{this, dVar, str});
        } else if (dVar == null) {
        } else {
            dVar.v();
        }
    }

    private void c(com.taobao.android.detail2.core.framework.view.feeds.d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9320083", new Object[]{this, dVar, str});
        } else if (dVar == null) {
        } else {
            dVar.d(str);
            a aVar = this.j;
            if (aVar == null) {
                return;
            }
            aVar.b(dVar);
        }
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i);
        if (!(holder instanceof com.taobao.android.detail2.core.framework.view.feeds.d)) {
            return;
        }
        ((com.taobao.android.detail2.core.framework.view.feeds.d) holder).u();
    }

    private void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i);
        if (!(holder instanceof com.taobao.android.detail2.core.framework.view.feeds.d)) {
            return;
        }
        ((com.taobao.android.detail2.core.framework.view.feeds.d) holder).t();
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        d e = e(i);
        if (e == null) {
            return;
        }
        hashMap.put("spm", fjh.a(e, "a2141.22412911") + ".slide");
        if (i2 > i) {
            e.a("leaveAction", "slideUp");
            this.f11598a.y().a(e.g, "SlideUp", "", "", hashMap, e);
            return;
        }
        e.a("leaveAction", "slideDown");
        this.f11598a.y().a(e.g, "SlideDown", "", "", hashMap, e);
    }

    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    ListViewManager.f(ListViewManager.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ListViewManager listViewManager = ListViewManager.this;
                    ListViewManager.a(listViewManager, listViewManager.e(0));
                    ListViewManager.a(ListViewManager.this, ListViewManager.this.d(i), "foreground");
                }
            });
        }
    }

    public void a(List<? extends d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        fjt.a(this.m.g(), fjt.TAG_RENDER, "ViewEngine refresh");
        if (this.i) {
            a(0);
            this.i = false;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            this.d = new com.taobao.android.detail2.core.framework.view.feeds.c(this.m, this.f11598a, list, this.b);
            this.d.a(new c.a() { // from class: com.taobao.android.detail2.core.framework.view.manager.ListViewManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.feeds.c.a
                public void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("799501f7", new Object[]{this, dVar});
                    } else if (ListViewManager.d(ListViewManager.this) == null) {
                    } else {
                        ListViewManager.d(ListViewManager.this).a(dVar);
                    }
                }
            });
            this.c.setAdapter(this.d);
            this.c.addOnChildAttachStateChangeListener(this.n);
            return;
        }
        cVar.b(list);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            return;
        }
        detailVerticalRecyclerView.scrollToPosition(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = g();
        if (g != null) {
            this.m.h().a(g.H());
            g.e("refresh");
        }
        a(i);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            return;
        }
        detailVerticalRecyclerView.setForbidNotifyPageChange(z);
    }

    public c.b a(List<? extends d> list, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (c.b) ipChange.ipc$dispatch("e63469fe", new Object[]{this, list, new Integer(i)});
        }
        fjt.a(fjt.TAG_RENDER, "ViewEngine refresh from: " + i);
        fjt.a(fjt.TAG_REARRANGE, "ViewEngine refresh from: " + i);
        if (this.d == null) {
            return null;
        }
        d(list);
        c.b a2 = this.d.a(list, i);
        int i3 = a2.f11589a;
        if (list != null) {
            i2 = list.size();
        }
        c(i3, i2);
        return a2;
    }

    private void d(List<? extends d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (d dVar : j()) {
            if (dVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nid", (Object) dVar.k);
                jSONObject.put("cardFixed", (Object) Boolean.valueOf(dVar.U));
                jSONArray.add(jSONObject);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        if (list != null) {
            for (d dVar2 : list) {
                if (dVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nid", (Object) dVar2.k);
                    jSONObject2.put("cardFixed", (Object) Boolean.valueOf(dVar2.U));
                    jSONArray2.add(jSONObject2);
                }
            }
        }
        fjt.a(fjt.TAG_REARRANGE, "UI侧刷新前列表情况, currentListData: " + jSONArray.toJSONString() + ", replaceList: " + jSONArray2.toJSONString());
    }

    private void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (d dVar : j()) {
            if (dVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("nid", (Object) dVar.k);
                jSONObject.put("cardFixed", (Object) Boolean.valueOf(dVar.U));
                jSONArray.add(jSONObject);
            }
        }
        fjt.a(fjt.TAG_REARRANGE, "UI侧最终调用notifyItemRangeChanged, 重排生效，start:" + i + ", repalceSize: " + i2 + ", listdata: " + jSONArray.toJSONString());
    }

    public void b(List<? extends d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        fjt.a(this.m.g(), fjt.TAG_RENDER, "ViewEngine insertDataAtFront");
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.c(list);
    }

    public void c(List<? extends d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        fjt.a(this.m.g(), fjt.TAG_RENDER, "ViewEngine appendData");
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d(list);
    }

    public void a(boolean z, String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba5438c", new Object[]{this, new Boolean(z), str, dVar});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.a(z, str, dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        int b2 = cVar.b(str);
        this.c.notifyCardScrollBeforeDelete(str);
        a(d(b2), "dismiss");
        c(d(b2 + 1), "dismiss");
        this.d.a(str);
    }

    public d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ab2d9d84", new Object[]{this});
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView != null && this.d != null) {
            int currentDisplayPosition = detailVerticalRecyclerView.getCurrentDisplayPosition();
            List<d> a2 = this.d.a();
            if (a2 != null && currentDisplayPosition >= 0 && currentDisplayPosition < a2.size()) {
                return a2.get(currentDisplayPosition);
            }
        }
        return null;
    }

    public d b() {
        List<d> a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b13168e3", new Object[]{this});
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            fjt.a(fjt.TAG_RENDER, "getPreDisplayNode在非主线程调用");
            return null;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || (a2 = this.d.a()) == null || (i = findFirstVisibleItemPosition - 1) < 0 || i >= a2.size()) {
            return null;
        }
        return a2.get(i);
    }

    public d c() {
        List<d> a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b7353442", new Object[]{this});
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            fjt.a(fjt.TAG_RENDER, "getNextDisplayNode在非主线程调用");
            return null;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || (a2 = this.d.a()) == null || (i = findFirstVisibleItemPosition + 1) < 0 || i >= a2.size()) {
            return null;
        }
        return a2.get(i);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c.getCurrentDisplayPosition();
    }

    public d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c33ccb00", new Object[]{this}) : this.k;
    }

    public List<d> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        d dVar = this.k;
        int b2 = dVar == null ? -1 : b(dVar.k);
        if (b2 >= 0 && b2 < j().size()) {
            return j().subList(b2 + 1, j().size());
        }
        return null;
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar != null) {
            return cVar.b(str);
        }
        return -1;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar != null) {
            return cVar.a(str, i);
        }
        return -1;
    }

    public com.taobao.android.detail2.core.framework.view.feeds.d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.view.feeds.d) ipChange.ipc$dispatch("3074a637", new Object[]{this});
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(this.c.getCurrentDisplayPosition());
        if (!(holder instanceof com.taobao.android.detail2.core.framework.view.feeds.d)) {
            return null;
        }
        return (com.taobao.android.detail2.core.framework.view.feeds.d) holder;
    }

    public com.taobao.android.detail2.core.framework.view.feeds.d d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.view.feeds.d) ipChange.ipc$dispatch("75dc3eed", new Object[]{this, new Integer(i)});
        }
        RecyclerView.ViewHolder holder = this.c.getHolder(i);
        if (!(holder instanceof com.taobao.android.detail2.core.framework.view.feeds.d)) {
            return null;
        }
        return (com.taobao.android.detail2.core.framework.view.feeds.d) holder;
    }

    public d e(int i) {
        List<d> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("cf219af5", new Object[]{this, new Integer(i)});
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar != null && (a2 = cVar.a()) != null && i < a2.size() && i >= 0) {
            return a2.get(i);
        }
        return null;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.d.b();
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.c.isScrolling();
    }

    public d c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e9e4e5b8", new Object[]{this, str});
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return null;
        }
        for (d dVar : cVar.a()) {
            if (str.equals(dVar.k)) {
                return dVar;
            }
        }
        return null;
    }

    public List<d> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[]{this});
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        if (z == this.c.enableScroll) {
            return false;
        }
        fjp.a(fjp.SCENE_CONTROL_SCROLL, fjp.ERROR_CODE_CONTROL_SCROLL, str, w().T());
        this.c.setEnableScroll(z);
        return true;
    }

    public int[] k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b93197b2", new Object[]{this}) : new int[]{((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition(), ((LinearLayoutManager) this.c.getLayoutManager()).findLastVisibleItemPosition()};
    }

    public b a(String str, boolean z, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9272e42f", new Object[]{this, str, new Boolean(z), scrollSpeed});
        }
        b bVar = new b();
        if (TextUtils.isEmpty(str)) {
            bVar.f11606a = false;
            bVar.b = "10002";
            bVar.c = b.ERROR_MSG_NID_NOT_EXIST;
            return bVar;
        }
        List<d> j = j();
        if (j == null) {
            bVar.f11606a = false;
            bVar.b = "10002";
            bVar.c = b.ERROR_MSG_NID_NOT_EXIST;
            return bVar;
        }
        int i = -1;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) this.c.getLayoutManager()).findFirstVisibleItemPosition();
        Iterator<d> it = j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d next = it.next();
            if (next != null && str.equals(next.k)) {
                i = j.indexOf(next);
                if (i == findFirstVisibleItemPosition) {
                    bVar.f11606a = false;
                    bVar.b = "10001";
                    bVar.c = b.ERROR_MSG_NID_IS_CURRENT;
                    return bVar;
                }
            }
        }
        if (i >= 0) {
            if (z) {
                this.c.smoothScrollToPosition(i, scrollSpeed);
            } else {
                this.c.scrollToPosition(i);
            }
            bVar.f11606a = true;
            return bVar;
        }
        bVar.f11606a = false;
        bVar.b = "10002";
        bVar.c = b.ERROR_MSG_NID_NOT_EXIST;
        return bVar;
    }

    public b a(String str, String str2, DetailVerticalRecyclerView.ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("47f7a149", new Object[]{this, str, str2, scrollSpeed});
        }
        if (TextUtils.isEmpty(str)) {
            return a(str2, false, scrollSpeed);
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 66107232) {
            if (hashCode == 417776790 && str.equals("scrollPre")) {
                c2 = 1;
            }
        } else if (str.equals("scrollNext")) {
            c2 = 0;
        }
        if (c2 == 0) {
            d c3 = c();
            if (c3 == null) {
                b bVar = new b();
                bVar.f11606a = false;
                bVar.b = "10003";
                bVar.c = b.ERROR_MSG_NEXT_NID_NOT_EXIST;
                return bVar;
            }
            return a(c3.k, true, scrollSpeed);
        } else if (c2 == 1) {
            d b2 = b();
            if (b2 == null) {
                b bVar2 = new b();
                bVar2.f11606a = false;
                bVar2.b = "10004";
                bVar2.c = b.ERROR_MSG_PRE_NID_NOT_EXIST;
                return bVar2;
            }
            return a(b2.k, true, scrollSpeed);
        } else {
            return a(str2, false, scrollSpeed);
        }
    }

    public c d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("989f0313", new Object[]{this, str});
        }
        c cVar = new c();
        int parseFloat = (int) Float.parseFloat(str);
        if (Math.abs(parseFloat) > fjl.b(this.m.g())) {
            cVar.f11607a = false;
            cVar.b = "10001";
            cVar.c = c.ERROR_MSG_EXCEED_SCREEN_HEIGHT;
            return cVar;
        }
        if (parseFloat > 0) {
            int remainScrollYDistance = this.c.getRemainScrollYDistance();
            fjt.a(fjt.TAG_SCROLL_PAGE_OFF, "offset: " + parseFloat + ", remainDistance: " + remainScrollYDistance);
            if (remainScrollYDistance < parseFloat) {
                cVar.f11607a = false;
                cVar.b = "10002";
                cVar.c = c.ERROR_MSG_HAS_NO_MORE_CARD;
                return cVar;
            }
        } else {
            int scrollYDistance = this.c.getScrollYDistance();
            fjt.a(fjt.TAG_SCROLL_PAGE_OFF, "offset: " + parseFloat + ", remainDistance: " + scrollYDistance);
            if (scrollYDistance < Math.abs(parseFloat)) {
                cVar.f11607a = false;
                cVar.b = "10002";
                cVar.c = c.ERROR_MSG_HAS_NO_MORE_CARD;
                return cVar;
            }
        }
        this.c.scrollSmoothByHover(0, parseFloat);
        cVar.f11607a = true;
        return cVar;
    }

    public void a(ListStatus listStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e87ba3", new Object[]{this, listStatus});
        } else if (ipa.f()) {
        } else {
            this.h = listStatus;
            if (this.f == null) {
                return;
            }
            int i = AnonymousClass7.f11605a[listStatus.ordinal()];
            if (i == 1) {
                this.f.setText(PULL_END_LOADING_TEXT);
            } else if (i == 2) {
                this.f.setText(PULL_END_LAST_PAGE_TEXT);
            } else if (i != 3) {
            } else {
                this.f.setText(PULL_END_PULL_LOAD_MORE_TEXT);
            }
        }
    }

    public void l() {
        PullBase pullBase;
        PullBase.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar != null) {
            cVar.c();
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            return;
        }
        detailVerticalRecyclerView.removeOnChildAttachStateChangeListener(this.n);
        this.c.destroy();
        if (!ipa.f() && (pullBase = this.e) != null && (bVar = this.p) != null) {
            pullBase.removeOnPullListener(bVar);
        }
        this.j = null;
        this.m.g();
        l.a().q();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            c(g(), "foreground");
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = g();
        if (g == null) {
            return;
        }
        a(g, "background", z);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = g();
        if (g == null) {
            return;
        }
        b(g, "background", z);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.d g = g();
        if (g == null) {
            return;
        }
        b(g, "foreground");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8a193c", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void b(DetailVerticalRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7733c8c", new Object[]{this, aVar});
        } else {
            this.c.addCardScrollListener(aVar);
        }
    }

    public void a(DetailVerticalRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751825ad", new Object[]{this, aVar});
            return;
        }
        DetailVerticalRecyclerView detailVerticalRecyclerView = this.c;
        if (detailVerticalRecyclerView == null) {
            return;
        }
        detailVerticalRecyclerView.addCardScrollListener(aVar);
    }

    public void q() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (ipa.f() || (linearLayout = this.g) == null) {
        } else {
            linearLayout.setVisibility(0);
        }
    }

    public void r() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (ipa.f() || (linearLayout = this.g) == null) {
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.c.setEnablePinchConflict(z);
        }
    }
}
