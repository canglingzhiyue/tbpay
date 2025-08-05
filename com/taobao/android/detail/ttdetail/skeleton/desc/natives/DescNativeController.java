package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.v;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.GalleryPopupWindow;
import com.taobao.android.detail.ttdetail.widget.listview.DetailListView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.eyx;
import tb.kge;
import tb.ojv;
import tb.spl;
import tb.syh;
import tb.szi;
import tb.szk;
import tb.szp;
import tb.szq;
import tb.szt;
import tb.szu;
import tb.szv;

/* loaded from: classes5.dex */
public class DescNativeController implements com.taobao.android.detail.ttdetail.communication.g<com.taobao.android.detail.ttdetail.communication.a>, v, TTDetailErrorView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DescNativeController";
    private int A;
    private eyx D;
    private boolean E;

    /* renamed from: a  reason: collision with root package name */
    private Context f10804a;
    private FrameLayout b;
    private View e;
    private spl f;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c i;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.a l;
    private h p;
    private b s;
    private GalleryPopupWindow t;
    private i x;
    private ojv y;
    private DetailListView c = null;
    private TTDetailErrorView d = null;
    private DetailDescViewAdapter g = null;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g h = null;
    private DESCState j = null;
    private syh.a k = null;
    private List<com.taobao.android.detail.ttdetail.communication.a> v = new ArrayList();
    private List<com.taobao.android.detail.ttdetail.communication.a> w = new ArrayList();
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean q = false;
    private long r = 0;
    private boolean z = true;
    private float B = com.taobao.android.detail.ttdetail.utils.j.D();
    private boolean C = com.taobao.android.detail.ttdetail.utils.j.G();
    private boolean F = true;
    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.d u = new com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.d() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.d
        public void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d096e", new Object[]{this, gVar});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "nativeDesc onStaticRequestSuccess");
            DescNativeController.b(DescNativeController.this, false);
            try {
                if (DescNativeController.a(DescNativeController.this, gVar)) {
                    if (DescNativeController.j(DescNativeController.this) != null && DescNativeController.j(DescNativeController.this).a(-1)) {
                        DescNativeController.k(DescNativeController.this);
                        return;
                    }
                    DescNativeController.a(DescNativeController.this, DESCState.STATIC_FAIL);
                    DescNativeController.b(DescNativeController.this, (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) null);
                    DescNativeController.a(DescNativeController.this, DescNativeController.this);
                    return;
                }
                DescNativeController.l(DescNativeController.this).clear();
                DescNativeController.m(DescNativeController.this).clear();
                if (gVar.e != null && !gVar.e.isEmpty()) {
                    Iterator<com.taobao.android.detail.ttdetail.communication.a> it = gVar.e.iterator();
                    while (it.hasNext()) {
                        com.taobao.android.detail.ttdetail.communication.a next = it.next();
                        if (next != null && (next instanceof com.taobao.android.detail.ttdetail.bizmessage.h)) {
                            if ("ut_exposure".equals(((com.taobao.android.detail.ttdetail.bizmessage.h) next).b())) {
                                DescNativeController.l(DescNativeController.this).add(next);
                            } else {
                                com.taobao.android.detail.ttdetail.communication.c.a(DescNativeController.n(DescNativeController.this), next);
                            }
                        }
                    }
                    a(DescNativeController.m(DescNativeController.this), DescNativeController.l(DescNativeController.this));
                }
                if (!gVar.a()) {
                    DescNativeController.a(DescNativeController.this, DESCState.INITIALIZED);
                }
                DescNativeController.b(DescNativeController.this, gVar);
                DescNativeController.a(DescNativeController.this, new com.taobao.android.detail.ttdetail.skeleton.desc.natives.a(DescNativeController.n(DescNativeController.this), DescNativeController.o(DescNativeController.this).d));
                DescNativeController.p(DescNativeController.this).setDescRecyleEngine(DescNativeController.a(DescNativeController.this));
                DescNativeController.q(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.p(DescNativeController.this));
                DescNativeController.a(DescNativeController.this, DescNativeController.q(DescNativeController.this));
                DescNativeController.q(DescNativeController.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (DescNativeController.r(DescNativeController.this) == null) {
                        } else {
                            DescNativeController.q(DescNativeController.this).onScroll(0);
                            DescNativeController.a(DescNativeController.this, DescNativeController.q(DescNativeController.this).getTotalHeight());
                            if (DescNativeController.r(DescNativeController.this).a(DescNativeController.c(DescNativeController.this))) {
                                return;
                            }
                            DescNativeController.r(DescNativeController.this).a();
                        }
                    }
                });
                com.taobao.android.detail.ttdetail.communication.c.a(DescNativeController.n(DescNativeController.this), new a("native"));
                DescNativeController.c(DescNativeController.this, true);
                DescNativeController.a(DescNativeController.this).a(SystemClock.uptimeMillis());
            } catch (Exception e) {
                DescNativeController descNativeController = DescNativeController.this;
                DescNativeController.a(descNativeController, descNativeController);
                com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "onStaticRequestSuccess", e);
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", DescNativeController.s(DescNativeController.this).c);
                hashMap.put("exception", e.getMessage());
                ae.a(hashMap, -900002, "Native图文详情数据解析异常");
            }
        }

        private void a(List<com.taobao.android.detail.ttdetail.communication.a> list, List<com.taobao.android.detail.ttdetail.communication.a> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            } else if (list != null && list2 != null && !list2.isEmpty()) {
                for (com.taobao.android.detail.ttdetail.communication.a aVar : list2) {
                    if (aVar instanceof com.taobao.android.detail.ttdetail.bizmessage.h) {
                        list.add(new com.taobao.android.detail.ttdetail.bizmessage.h("disappear", ((com.taobao.android.detail.ttdetail.bizmessage.h) aVar).c(), new RuntimeAbilityParam[0]));
                    }
                }
            }
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.d
        public void a(Response response) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b24c63aa", new Object[]{this, response});
                return;
            }
            DescNativeController.b(DescNativeController.this, false);
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "nativeDesc onStaticRequestFailure");
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", DescNativeController.s(DescNativeController.this).c);
            ae.a(hashMap, -900001, "Native图文详情请求回调失败");
            DescNativeController descNativeController = DescNativeController.this;
            DescNativeController.a(descNativeController, descNativeController);
            if (!NetworkStatusHelper.isConnected()) {
                DescNativeController.a(DescNativeController.this, DESCState.STATIC_FAIL);
                DescNativeController.b(DescNativeController.this, (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) null);
            } else if (DescNativeController.j(DescNativeController.this) == null) {
            } else {
                com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController requestDesc failed.");
                DescNativeController.j(DescNativeController.this).a(-1);
                DescNativeController.k(DescNativeController.this);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.d
        public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba0b342f", new Object[]{this, gVar});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "nativeDesc onDynamicRequestSuccess");
            if (DescNativeController.n(DescNativeController.this) == null || DescNativeController.p(DescNativeController.this) == null || DescNativeController.q(DescNativeController.this) == null || gVar == null || gVar.d == null) {
                return;
            }
            DescNativeController.b(DescNativeController.this, gVar);
            DescNativeController.a(DescNativeController.this).a((List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>) DescNativeController.o(DescNativeController.this).d);
            DescNativeController.p(DescNativeController.this).setDescRecyleEngine(DescNativeController.a(DescNativeController.this));
            if (DescNativeController.a(DescNativeController.this).a()) {
                DescNativeController.p(DescNativeController.this).notifyDataSetChanged();
            } else {
                DescNativeController.q(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.p(DescNativeController.this));
            }
            DescNativeController descNativeController = DescNativeController.this;
            DescNativeController.a(descNativeController, DescNativeController.q(descNativeController));
        }
    };

    /* loaded from: classes5.dex */
    public enum DESCState {
        STATIC_FAIL,
        INITIALIZED
    }

    static {
        kge.a(-1552475482);
        kge.a(1340016746);
        kge.a(-767194759);
        kge.a(-36377025);
    }

    public static /* synthetic */ int a(DescNativeController descNativeController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30173b23", new Object[]{descNativeController, new Integer(i)})).intValue();
        }
        descNativeController.A = i;
        return i;
    }

    public static /* synthetic */ DESCState a(DescNativeController descNativeController, DESCState dESCState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCState) ipChange.ipc$dispatch("ae467d1b", new Object[]{descNativeController, dESCState});
        }
        descNativeController.j = dESCState;
        return dESCState;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.a a(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.desc.natives.a) ipChange.ipc$dispatch("ada6b373", new Object[]{descNativeController}) : descNativeController.l;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.a a(DescNativeController descNativeController, com.taobao.android.detail.ttdetail.skeleton.desc.natives.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.a) ipChange.ipc$dispatch("ddfe9703", new Object[]{descNativeController, aVar});
        }
        descNativeController.l = aVar;
        return aVar;
    }

    public static /* synthetic */ void a(DescNativeController descNativeController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a6afbf", new Object[]{descNativeController, view});
        } else {
            descNativeController.b(view);
        }
    }

    public static /* synthetic */ void a(DescNativeController descNativeController, TTDetailErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a48def", new Object[]{descNativeController, aVar});
        } else {
            descNativeController.a(aVar);
        }
    }

    public static /* synthetic */ boolean a(DescNativeController descNativeController, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5127fefd", new Object[]{descNativeController, gVar})).booleanValue() : descNativeController.a(gVar);
    }

    public static /* synthetic */ boolean a(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30177b05", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.z = z;
        return z;
    }

    public static /* synthetic */ b b(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3a5d0dd3", new Object[]{descNativeController}) : descNativeController.s;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g b(DescNativeController descNativeController, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) ipChange.ipc$dispatch("fa540644", new Object[]{descNativeController, gVar});
        }
        descNativeController.h = gVar;
        return gVar;
    }

    public static /* synthetic */ boolean b(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e803e886", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.n = z;
        return z;
    }

    public static /* synthetic */ int c(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8107bae4", new Object[]{descNativeController})).intValue() : descNativeController.A;
    }

    public static /* synthetic */ boolean c(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ff05607", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.m = z;
        return z;
    }

    public static /* synthetic */ boolean d(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9071954", new Object[]{descNativeController})).booleanValue() : descNativeController.C;
    }

    public static /* synthetic */ boolean e(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("110677b3", new Object[]{descNativeController})).booleanValue() : descNativeController.E;
    }

    public static /* synthetic */ boolean f(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5905d612", new Object[]{descNativeController})).booleanValue() : descNativeController.F;
    }

    public static /* synthetic */ boolean g(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1053471", new Object[]{descNativeController})).booleanValue() : descNativeController.z;
    }

    public static /* synthetic */ float h(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e90492bc", new Object[]{descNativeController})).floatValue() : descNativeController.B;
    }

    public static /* synthetic */ ojv i(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ojv) ipChange.ipc$dispatch("3739e060", new Object[]{descNativeController}) : descNativeController.y;
    }

    public static /* synthetic */ syh.a j(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (syh.a) ipChange.ipc$dispatch("3d8ec05d", new Object[]{descNativeController}) : descNativeController.k;
    }

    public static /* synthetic */ void k(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c102ade9", new Object[]{descNativeController});
        } else {
            descNativeController.f();
        }
    }

    public static /* synthetic */ List l(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1ab0acff", new Object[]{descNativeController}) : descNativeController.v;
    }

    public static /* synthetic */ List m(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("396ae4c0", new Object[]{descNativeController}) : descNativeController.w;
    }

    public static /* synthetic */ Context n(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7ea3f5fe", new Object[]{descNativeController}) : descNativeController.f10804a;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g o(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g) ipChange.ipc$dispatch("77c7117", new Object[]{descNativeController}) : descNativeController.h;
    }

    public static /* synthetic */ DetailDescViewAdapter p(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailDescViewAdapter) ipChange.ipc$dispatch("f41db59b", new Object[]{descNativeController}) : descNativeController.g;
    }

    public static /* synthetic */ DetailListView q(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailListView) ipChange.ipc$dispatch("ed384dcc", new Object[]{descNativeController}) : descNativeController.c;
    }

    public static /* synthetic */ i r(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("5c2b2bc", new Object[]{descNativeController}) : descNativeController.x;
    }

    public static /* synthetic */ spl s(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spl) ipChange.ipc$dispatch("f4e51eb6", new Object[]{descNativeController}) : descNativeController.f;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, aVar})).booleanValue() : a(aVar);
    }

    public DescNativeController(Context context, spl splVar) {
        this.f10804a = context;
        this.f = splVar;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.s = new b(this.f10804a);
        this.b = new FrameLayout(this.f10804a);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.c = new DetailListView(this.f10804a);
        this.c.setLayoutParams(layoutParams);
        this.c.setOverScrollMode(2);
        this.c.setCacheColorHint(0);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setDividerHeight(0);
        this.c.setFocusable(false);
        this.c.setDescendantFocusability(393216);
        try {
            i = com.taobao.android.detail.ttdetail.utils.e.d();
        } catch (Exception unused) {
        }
        this.c.setCoverOffset(i);
        this.c.setOnItemStateListener(new DetailListView.a() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.a
            public void a(int i2) {
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e d;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else if (DescNativeController.a(DescNativeController.this) == null || (d = DescNativeController.a(DescNativeController.this).d(i2)) == null) {
                } else {
                    d.cG_();
                    if (DescNativeController.b(DescNativeController.this) == null) {
                        return;
                    }
                    DescNativeController.b(DescNativeController.this).a(i2, d);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.a
            public void a(int i2, boolean z) {
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e d;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
                } else if (DescNativeController.a(DescNativeController.this) == null || (d = DescNativeController.a(DescNativeController.this).d(i2)) == null) {
                } else {
                    d.b(true, z);
                    if (DescNativeController.b(DescNativeController.this) == null) {
                        return;
                    }
                    DescNativeController.b(DescNativeController.this).a(i2, z, d);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.a
            public void b(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                } else if (DescNativeController.a(DescNativeController.this) == null) {
                } else {
                    DescNativeController.a(DescNativeController.this).d(i2);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.a
            public void c(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
                } else if (DescNativeController.a(DescNativeController.this) == null) {
                } else {
                    DescNativeController.a(DescNativeController.this).d(i2);
                }
            }
        });
        final int b = com.taobao.android.detail.ttdetail.utils.f.b(this.f10804a);
        this.c.setOnScrollYDistanceChangeListener(new DetailListView.b() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.b
            public void a(int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
                } else if (DescNativeController.c(DescNativeController.this) == 0 || !DescNativeController.d(DescNativeController.this) || !DescNativeController.e(DescNativeController.this) || DescNativeController.f(DescNativeController.this) || !DescNativeController.g(DescNativeController.this) || DescNativeController.c(DescNativeController.this) <= DescNativeController.h(DescNativeController.this) * b || DescNativeController.c(DescNativeController.this) - i2 > DescNativeController.h(DescNativeController.this) * b || DescNativeController.i(DescNativeController.this) == null) {
                } else {
                    DescNativeController.i(DescNativeController.this).a();
                    DescNativeController.a(DescNativeController.this, false);
                    com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "onScrollYChange newY=" + i2 + ", totalHeight=" + DescNativeController.c(DescNativeController.this));
                }
            }
        });
        this.g = new DetailDescViewAdapter();
        a(this.f10804a);
    }

    public void a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{this, eyxVar});
            return;
        }
        this.D = eyxVar;
        this.E = com.taobao.android.detail.ttdetail.utils.d.a(this.D);
        if (!com.taobao.android.detail.ttdetail.utils.e.b() || com.taobao.android.detail.ttdetail.utils.j.F()) {
            z = false;
        }
        this.F = z;
    }

    public void a(ojv ojvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80b3afd", new Object[]{this, ojvVar});
        } else {
            this.y = ojvVar;
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(context, szp.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(context, szi.class, this);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10804a, szp.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10804a, szi.class);
    }

    public void a(syh.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21bbb79", new Object[]{this, aVar});
        } else {
            this.k = aVar;
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e04a050", new Object[]{this, iVar});
        } else {
            this.x = iVar;
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        int childCount = this.b.getChildCount();
        if (childCount <= 0) {
            this.b.addView(view);
            return;
        }
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt == view) {
                if (childAt.getVisibility() == 8) {
                    childAt.setVisibility(0);
                }
                z = true;
            } else if (childAt.getVisibility() == 0) {
                childAt.setVisibility(8);
            }
        }
        if (z) {
            return;
        }
        this.b.addView(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c.getCount() <= 0) {
        } else {
            int count = this.c.getCount() - 1;
            if (i == Integer.MAX_VALUE && this.c.getSelectedItemPosition() != count) {
                this.c.setSelection(count);
            } else if (this.c.getSelectedItemPosition() == i) {
            } else {
                this.c.setSelection(i);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view}) : this.b;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c.onScroll(i);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.r = SystemClock.uptimeMillis();
        com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "requestDesc");
        if (this.i == null) {
            if (b(this.f)) {
                syh.a aVar = this.k;
                if (aVar == null) {
                    return;
                }
                aVar.a(-1);
                f();
                return;
            }
            this.i = a(this.f);
        }
        this.i.a();
        this.n = true;
        this.o = true;
        g();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", this.f.c);
        ae.a(hashMap, -900003, "Native图文详情降级");
    }

    private com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c a(final spl splVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c) ipChange.ipc$dispatch("7485e9db", new Object[]{this, splVar});
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.e eVar = new com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.e(splVar.c, splVar.f33814a, null);
        eVar.e = splVar.d;
        eVar.d = new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController.3
            {
                put("shopId", splVar.b);
                put("hidPriceDesc", String.valueOf(splVar.h));
            }
        };
        return new com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c(this.f10804a, eVar, this.u);
    }

    private boolean b(spl splVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb1a54e", new Object[]{this, splVar})).booleanValue();
        }
        if (splVar == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel is null.");
            return true;
        } else if (splVar.d == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is null.");
            return true;
        } else if (splVar.d.size() != 0) {
            return false;
        } else {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is empty.");
            return true;
        }
    }

    private boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865d0972", new Object[]{this, gVar})).booleanValue();
        }
        if (gVar == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response is null.");
            return true;
        } else if (gVar.d == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is null.");
            return true;
        } else if (!gVar.d.isEmpty()) {
            return false;
        } else {
            com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is empty.");
            return true;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.e == null) {
            try {
                com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.f10804a);
                if (a2 != null) {
                    this.e = (RelativeLayout) a2.a(this.f10804a, R.layout.tt_taodetail_loading_mask, null, true);
                } else {
                    this.e = (RelativeLayout) LayoutInflater.from(this.f10804a).inflate(R.layout.tt_taodetail_loading_mask, (ViewGroup) null);
                }
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "showLoading inflate x_taodetail_loading_mask", th);
                this.e = new View(this.f10804a);
            }
        }
        b(this.e);
    }

    private void a(TTDetailErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13b1a4", new Object[]{this, aVar});
            return;
        }
        Context context = this.f10804a;
        if (context == null) {
            return;
        }
        if (this.d == null) {
            this.d = new TTDetailErrorView(context);
            this.b.addView(this.d);
        }
        this.d.setOnReloadButtonClickListener(aVar);
        b(this.d);
        i iVar = this.x;
        if (iVar == null) {
            return;
        }
        iVar.b();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
    public void a(View view) {
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.j == DESCState.STATIC_FAIL && this.f != null) {
            a();
        } else {
            com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.g gVar = this.h;
            if (gVar == null || !gVar.a() || (cVar = this.i) == null) {
                return;
            }
            cVar.c();
            TTDetailErrorView tTDetailErrorView = this.d;
            if (tTDetailErrorView == null || !tTDetailErrorView.isShown()) {
                return;
            }
            a((TTDetailErrorView.a) this);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.m || this.n || this.f == null) {
        } else {
            e();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.c cVar = this.i;
        if (cVar != null) {
            cVar.b();
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.a aVar = this.l;
        if (aVar != null) {
            Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e> it = aVar.d().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        b bVar = this.s;
        if (bVar != null) {
            bVar.b();
            this.s = null;
        }
        d();
        com.taobao.android.detail.ttdetail.behavior.b.b(this.f10804a, "detail_desc_max_scroll", String.valueOf(this.c.getMaxScrollY()));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        List<com.taobao.android.detail.ttdetail.communication.a> list = this.w;
        if (list != null && !list.isEmpty()) {
            for (com.taobao.android.detail.ttdetail.communication.a aVar : this.w) {
                com.taobao.android.detail.ttdetail.communication.c.a(this.f10804a, aVar);
            }
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.a aVar2 = this.l;
        if (aVar2 != null) {
            Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e> it = aVar2.d().iterator();
            while (it.hasNext()) {
                it.next().b(z, z2);
            }
        }
        if (!this.q) {
            return;
        }
        this.q = false;
        com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "commitUserMotionForDesc:disappear");
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        if (!this.m) {
            a();
        }
        List<com.taobao.android.detail.ttdetail.communication.a> list = this.v;
        if (list != null && !list.isEmpty()) {
            for (com.taobao.android.detail.ttdetail.communication.a aVar : this.v) {
                com.taobao.android.detail.ttdetail.communication.c.a(this.f10804a, aVar);
            }
        }
        if (this.l != null) {
            int lastVisibleItem = this.c.getLastVisibleItem();
            for (int firstVisibleItem = this.c.getFirstVisibleItem(); firstVisibleItem <= lastVisibleItem; firstVisibleItem++) {
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e d = this.l.d(firstVisibleItem);
                if (d != null) {
                    d.cG_();
                }
            }
        }
        b bVar = this.s;
        if (bVar != null) {
            bVar.a();
        }
        this.q = true;
        com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "commitUserMotionForDesc:appear");
    }

    public boolean a(com.taobao.android.detail.ttdetail.communication.a aVar) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6298e986", new Object[]{this, aVar})).booleanValue();
        }
        boolean z = aVar instanceof szp;
        if (z) {
            szp szpVar = (szp) aVar;
            GalleryPopupWindow galleryPopupWindow = this.t;
            if (galleryPopupWindow != null) {
                galleryPopupWindow.showGalleryDialog(szpVar.b());
                return true;
            }
            try {
                this.t = new GalleryPopupWindow((RelativeLayout) LayoutInflater.from(this.f10804a).inflate(R.layout.tt_detail_main_gallarybig, (ViewGroup) null), -1, -1, this.f10804a);
                this.t.showGalleryDialog(szpVar.b());
                return true;
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("DescNativeController", "Create pic gallery popup window error: ", th);
            }
        }
        if (aVar instanceof szt) {
            h hVar2 = this.p;
            if (hVar2 != null) {
                hVar2.c();
            }
            return true;
        } else if (aVar instanceof szu) {
            h hVar3 = this.p;
            if (hVar3 != null) {
                szu szuVar = (szu) aVar;
                hVar3.a(szuVar.f33974a, szuVar.b);
            }
            return true;
        } else if (aVar instanceof szv) {
            h hVar4 = this.p;
            if (hVar4 != null) {
                hVar4.b();
            }
            return true;
        } else {
            if ((aVar instanceof szk) && (hVar = this.p) != null) {
                hVar.d();
            }
            if (z) {
                return true;
            }
            if (aVar instanceof szi) {
                com.taobao.android.detail.ttdetail.communication.c.a(this.f10804a, new szq());
            }
            return false;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    /* loaded from: classes5.dex */
    public static class a extends com.taobao.android.detail.ttdetail.communication.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10810a;

        static {
            kge.a(-1601738224);
        }

        public a(String str) {
            this.f10810a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10810a;
        }
    }
}
