package com.taobao.android.detail.core.detail.fragment.desc;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import anet.channel.status.NetworkStatusHelper;
import anetwork.channel.Response;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.desc.helper.DetailDescViewAdapter;
import com.taobao.android.detail.core.detail.kit.view.widget.desc.DESCErrorView;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.c;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.event.basic.m;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.core.event.video.l;
import com.taobao.android.detail.core.event.video.n;
import com.taobao.android.detail.core.request.desc.b;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.ocr.e;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.dyd;
import tb.ecc;
import tb.ecg;
import tb.ecm;
import tb.ecr;
import tb.egy;
import tb.eid;
import tb.eig;
import tb.elz;
import tb.emu;
import tb.enl;
import tb.eno;
import tb.enp;
import tb.epe;
import tb.epf;
import tb.eqc;
import tb.fjp;
import tb.kge;

/* loaded from: classes4.dex */
public class DescNativeController extends com.taobao.android.detail.core.detail.widget.container.a implements DESCErrorView.a, j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DescNativeController";

    /* renamed from: a  reason: collision with root package name */
    private Activity f9487a;
    private String b;
    private FrameLayout c;
    private DetailListView d;
    private DESCErrorView e;
    private View f;
    private egy g;
    private DetailDescViewAdapter h;
    private enl i;
    private b j;
    private DESCState k;
    private dyd.a l;
    private com.taobao.android.detail.core.detail.kit.view.holder.b m;
    private List<Event> n;
    private List<Event> o;
    private NestedScrollContainer.a p;
    private c q;
    private boolean r;
    private boolean s;
    private boolean t;
    private eid u;
    private boolean v;
    private a w;
    private com.taobao.android.detail.core.request.desc.c x;
    private long y;

    /* loaded from: classes4.dex */
    public enum DESCState {
        STATIC_FAIL,
        INITIALIZED
    }

    static {
        kge.a(-1508547012);
        kge.a(-1052435729);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(DescNativeController descNativeController, String str, Object... objArr) {
        if (str.hashCode() == -414738562) {
            super.a((epe) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ DESCState a(DescNativeController descNativeController, DESCState dESCState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DESCState) ipChange.ipc$dispatch("bf97d2fb", new Object[]{descNativeController, dESCState});
        }
        descNativeController.k = dESCState;
        return dESCState;
    }

    public static /* synthetic */ com.taobao.android.detail.core.detail.kit.view.holder.b a(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.detail.kit.view.holder.b) ipChange.ipc$dispatch("627988f5", new Object[]{descNativeController}) : descNativeController.m;
    }

    public static /* synthetic */ com.taobao.android.detail.core.detail.kit.view.holder.b a(DescNativeController descNativeController, com.taobao.android.detail.core.detail.kit.view.holder.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.kit.view.holder.b) ipChange.ipc$dispatch("fd84f5c9", new Object[]{descNativeController, bVar});
        }
        descNativeController.m = bVar;
        return bVar;
    }

    public static /* synthetic */ void a(DescNativeController descNativeController, int i, int i2, boolean z, DESCErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30258b7a", new Object[]{descNativeController, new Integer(i), new Integer(i2), new Boolean(z), aVar});
        } else {
            descNativeController.a(i, i2, z, aVar);
        }
    }

    public static /* synthetic */ void a(DescNativeController descNativeController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36c6057", new Object[]{descNativeController, view});
        } else {
            descNativeController.b(view);
        }
    }

    public static /* synthetic */ boolean a(DescNativeController descNativeController, enl enlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73d0ec4c", new Object[]{descNativeController, enlVar})).booleanValue() : descNativeController.a(enlVar);
    }

    public static /* synthetic */ boolean a(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc70a19d", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.s = z;
        return z;
    }

    public static /* synthetic */ a b(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("92bef9a4", new Object[]{descNativeController}) : descNativeController.w;
    }

    public static /* synthetic */ enl b(DescNativeController descNativeController, enl enlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enl) ipChange.ipc$dispatch("d22a505a", new Object[]{descNativeController, enlVar});
        }
        descNativeController.i = enlVar;
        return enlVar;
    }

    public static /* synthetic */ boolean b(DescNativeController descNativeController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a64077c", new Object[]{descNativeController, new Boolean(z)})).booleanValue();
        }
        descNativeController.r = z;
        return z;
    }

    public static /* synthetic */ dyd.a c(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyd.a) ipChange.ipc$dispatch("2a19395d", new Object[]{descNativeController}) : descNativeController.l;
    }

    public static /* synthetic */ Activity d(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("78c7f60a", new Object[]{descNativeController}) : descNativeController.f9487a;
    }

    public static /* synthetic */ egy e(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (egy) ipChange.ipc$dispatch("d77de2d0", new Object[]{descNativeController}) : descNativeController.g;
    }

    public static /* synthetic */ List f(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("40170667", new Object[]{descNativeController}) : descNativeController.n;
    }

    public static /* synthetic */ List g(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd73a06", new Object[]{descNativeController}) : descNativeController.o;
    }

    public static /* synthetic */ enl h(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enl) ipChange.ipc$dispatch("a861c361", new Object[]{descNativeController}) : descNativeController.i;
    }

    public static /* synthetic */ DetailDescViewAdapter i(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailDescViewAdapter) ipChange.ipc$dispatch("325f8f03", new Object[]{descNativeController}) : descNativeController.h;
    }

    public static /* synthetic */ DetailListView j(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailListView) ipChange.ipc$dispatch("cfee0bd3", new Object[]{descNativeController}) : descNativeController.d;
    }

    public static /* synthetic */ NestedScrollContainer.a k(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NestedScrollContainer.a) ipChange.ipc$dispatch("c88c626", new Object[]{descNativeController}) : descNativeController.p;
    }

    public static /* synthetic */ c l(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("333ea51c", new Object[]{descNativeController}) : descNativeController.q;
    }

    public static /* synthetic */ long m(DescNativeController descNativeController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e0f3f9b", new Object[]{descNativeController})).longValue() : descNativeController.y;
    }

    public DescNativeController(Activity activity) {
        super(activity);
        this.d = null;
        this.e = null;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = false;
        this.y = 0L;
        this.x = new com.taobao.android.detail.core.request.desc.c() { // from class: com.taobao.android.detail.core.detail.fragment.desc.DescNativeController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.request.desc.c
            public void a(enl enlVar) {
                String str = "";
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e72e9715", new Object[]{this, enlVar});
                    return;
                }
                i.d("DescNativeController", "nativeDesc onStaticRequestSuccess");
                DescNativeController.a(DescNativeController.this, false);
                try {
                    if (DescNativeController.a(DescNativeController.this, enlVar)) {
                        if (DescNativeController.c(DescNativeController.this) != null && DescNativeController.c(DescNativeController.this).a(-1)) {
                            ecc.d(DescNativeController.d(DescNativeController.this), DescNativeController.e(DescNativeController.this) != null ? DescNativeController.e(DescNativeController.this).c : str);
                            return;
                        }
                        ecm.a(DescNativeController.d(DescNativeController.this), DescNativeController.e(DescNativeController.this), "Desc_Request", null);
                        DescNativeController.a(DescNativeController.this, DESCState.STATIC_FAIL);
                        DescNativeController.b(DescNativeController.this, (enl) null);
                        DescNativeController.a(DescNativeController.this, R.string.taodetail_iconfont_wifi, R.string.detail_fulldesc_error_network_tip, true, DescNativeController.this);
                        return;
                    }
                    DescNativeController.f(DescNativeController.this).clear();
                    DescNativeController.g(DescNativeController.this).clear();
                    if (enlVar.c != null && !enlVar.c.isEmpty()) {
                        d a2 = f.a(DescNativeController.d(DescNativeController.this));
                        Iterator<Event> it = enlVar.c.iterator();
                        while (it.hasNext()) {
                            Event next = it.next();
                            if (next != null) {
                                a2.a(next);
                                if (eno.a(enp.class) == next.getEventId()) {
                                    DescNativeController.f(DescNativeController.this).add(next);
                                }
                            }
                        }
                        a(DescNativeController.g(DescNativeController.this), DescNativeController.f(DescNativeController.this));
                    }
                    if (!enlVar.a()) {
                        DescNativeController.a(DescNativeController.this, DESCState.INITIALIZED);
                    }
                    DescNativeController.b(DescNativeController.this, enlVar);
                    DescNativeController.a(DescNativeController.this, new com.taobao.android.detail.core.detail.kit.view.holder.b(DescNativeController.d(DescNativeController.this), DescNativeController.h(DescNativeController.this).f27460a));
                    DescNativeController.i(DescNativeController.this).setDescRecyleEngine(DescNativeController.a(DescNativeController.this));
                    DescNativeController.j(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.i(DescNativeController.this));
                    DescNativeController.a(DescNativeController.this, DescNativeController.j(DescNativeController.this));
                    if (DescNativeController.k(DescNativeController.this) != null) {
                        DescNativeController.k(DescNativeController.this).a(false, DescNativeController.l(DescNativeController.this));
                    }
                    DescNativeController.b(DescNativeController.this, true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    DescNativeController.a(DescNativeController.this).a(uptimeMillis);
                    h.o(DescNativeController.d(DescNativeController.this), uptimeMillis - DescNativeController.m(DescNativeController.this));
                    eqc.b(DescNativeController.d(DescNativeController.this), "desc_load");
                } catch (Exception e) {
                    DescNativeController.a(DescNativeController.this, R.string.taodetail_iconfont_wifi, R.string.detail_fulldesc_error_network_tip, true, DescNativeController.this);
                    i.a("DescNativeController", "onStaticRequestSuccess", e);
                    Activity d = DescNativeController.d(DescNativeController.this);
                    if (DescNativeController.e(DescNativeController.this) != null) {
                        str = DescNativeController.e(DescNativeController.this).c;
                    }
                    ecg.c(d, str, e);
                }
            }

            private void a(List<Event> list, List<Event> list2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                } else if (list != null && list2 != null && !list2.isEmpty()) {
                    for (Event event : list2) {
                        if (event instanceof enp) {
                            com.taobao.android.detail.core.event.basic.b bVar = new com.taobao.android.detail.core.event.basic.b(null);
                            bVar.f9696a = ((enp) event).f27473a;
                            list.add(bVar);
                        }
                    }
                }
            }

            @Override // com.taobao.android.detail.core.request.desc.c
            public void a(Response response) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b24c63aa", new Object[]{this, response});
                    return;
                }
                DescNativeController.a(DescNativeController.this, false);
                i.d("DescNativeController", "nativeDesc onStaticRequestFailure");
                String str = "";
                ecc.c(DescNativeController.d(DescNativeController.this), DescNativeController.e(DescNativeController.this) != null ? DescNativeController.e(DescNativeController.this).c : str);
                DescNativeController.a(DescNativeController.this, R.string.taodetail_iconfont_wifi, R.string.detail_fulldesc_error_network_tip, true, DescNativeController.this);
                Activity d = DescNativeController.d(DescNativeController.this);
                if (DescNativeController.e(DescNativeController.this) != null) {
                    str = DescNativeController.e(DescNativeController.this).c;
                }
                ecg.i(d, str, response.toString());
                ecm.a(DescNativeController.d(DescNativeController.this), DescNativeController.e(DescNativeController.this), "Desc_Request", null, fjp.ERROR_CODE_CONTROL_SCROLL, "getdesc_failed");
                if (!NetworkStatusHelper.isConnected()) {
                    DescNativeController.a(DescNativeController.this, DESCState.STATIC_FAIL);
                    DescNativeController.b(DescNativeController.this, (enl) null);
                } else if (DescNativeController.c(DescNativeController.this) == null) {
                } else {
                    i.a("DescNativeDegradeH5", "DescNativeController requestDesc failed.");
                    DescNativeController.c(DescNativeController.this).a(-1);
                }
            }

            @Override // com.taobao.android.detail.core.request.desc.c
            public void b(enl enlVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d5b19d96", new Object[]{this, enlVar});
                    return;
                }
                i.d("DescNativeController", "nativeDesc onDynamicRequestSuccess");
                if (DescNativeController.d(DescNativeController.this) == null || DescNativeController.i(DescNativeController.this) == null || DescNativeController.j(DescNativeController.this) == null || enlVar == null || enlVar.f27460a == null) {
                    return;
                }
                DescNativeController.b(DescNativeController.this, enlVar);
                DescNativeController.a(DescNativeController.this).a((List<epf>) DescNativeController.h(DescNativeController.this).f27460a);
                DescNativeController.i(DescNativeController.this).setDescRecyleEngine(DescNativeController.a(DescNativeController.this));
                if (DescNativeController.a(DescNativeController.this).a()) {
                    DescNativeController.i(DescNativeController.this).notifyDataSetChanged();
                } else {
                    DescNativeController.j(DescNativeController.this).setAdapter((ListAdapter) DescNativeController.i(DescNativeController.this));
                }
                DescNativeController descNativeController = DescNativeController.this;
                DescNativeController.a(descNativeController, DescNativeController.j(descNativeController));
            }
        };
        this.f9487a = activity;
        e();
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.DescNativeController");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.w = new a(this.f9487a);
        this.c = new FrameLayout(this.f9487a);
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.d = new DetailListView(this.f9487a);
        this.d.setLayoutParams(layoutParams);
        this.d.setOverScrollMode(2);
        this.d.setCacheColorHint(0);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setDividerHeight(0);
        this.d.setFocusable(false);
        this.d.setDescendantFocusability(393216);
        try {
            i = ((DetailCoreActivity) this.f9487a).r().getActionBarHeight() + (((DetailCoreActivity) this.f9487a).c ? ecr.b(this.f9487a) : 0);
        } catch (Exception unused) {
        }
        this.d.setCoverOffset(i);
        this.d.setOnItemStateListener(new DetailListView.a() { // from class: com.taobao.android.detail.core.detail.fragment.desc.DescNativeController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void a(int i2) {
                com.taobao.android.detail.core.detail.kit.view.holder.desc.b d;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else if (DescNativeController.a(DescNativeController.this) == null || (d = DescNativeController.a(DescNativeController.this).d(i2)) == null) {
                } else {
                    d.G_();
                    if (DescNativeController.b(DescNativeController.this) == null) {
                        return;
                    }
                    DescNativeController.b(DescNativeController.this).a(i2, d);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void a(int i2, boolean z) {
                com.taobao.android.detail.core.detail.kit.view.holder.desc.b d;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
                } else if (DescNativeController.a(DescNativeController.this) == null || (d = DescNativeController.a(DescNativeController.this).d(i2)) == null) {
                } else {
                    d.a(true, z);
                    if (DescNativeController.b(DescNativeController.this) == null) {
                        return;
                    }
                    DescNativeController.b(DescNativeController.this).a(i2, z, d);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void b(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                } else if (DescNativeController.a(DescNativeController.this) == null) {
                } else {
                    DescNativeController.a(DescNativeController.this).d(i2);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
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
        this.h = new DetailDescViewAdapter();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        super.a(epeVar);
        if (!(epeVar instanceof egy)) {
            return;
        }
        this.g = (egy) epeVar;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(dyd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a516b7ec", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(NestedScrollContainer.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a701729", new Object[]{this, aVar, cVar});
        } else if (aVar == null || cVar == null) {
        } else {
            this.p = aVar;
            this.q = cVar;
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        int childCount = this.c.getChildCount();
        if (childCount <= 0) {
            this.c.addView(view);
            return;
        }
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.c.getChildAt(i);
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
        this.c.addView(view);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!this.r) {
            return true;
        }
        return this.d.getFirstVisiblePosition() == 0 && (childAt = this.d.getChildAt(0)) != null && childAt.getTop() == 0;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (!this.r) {
            return true;
        }
        if (this.d.getLastVisiblePosition() == this.d.getCount() - 1) {
            DetailListView detailListView = this.d;
            View childAt = detailListView.getChildAt(detailListView.getChildCount() - 1);
            if (childAt != null && childAt.getBottom() <= this.d.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.d.getMeasuredHeight();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.d.getCount() <= 0) {
        } else {
            if (z) {
                if (i == Integer.MAX_VALUE) {
                    DetailListView detailListView = this.d;
                    detailListView.smoothScrollToPosition(detailListView.getCount() - 1);
                    return;
                }
                this.d.smoothScrollToPosition(i);
            } else if (i == Integer.MAX_VALUE) {
                DetailListView detailListView2 = this.d;
                detailListView2.setSelection(detailListView2.getCount() - 1);
            } else {
                this.d.setSelection(i);
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.d.smoothScrollBy(i2, 10);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d.onScroll(i);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.y = SystemClock.uptimeMillis();
        eqc.a(this.f9487a, "desc_load", "图文详情");
        ecg.g(this.f9487a, this.g.c);
        i.d("DescNativeController", "requestDesc");
        if (this.j == null) {
            if (b(this.g)) {
                dyd.a aVar = this.l;
                if (aVar == null) {
                    return;
                }
                aVar.a(-1);
                return;
            }
            this.j = a(this.g);
        }
        this.j.a();
        this.s = true;
        this.t = true;
        e.a(this.f9487a);
        n();
    }

    private b a(final egy egyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("45e9d5c9", new Object[]{this, egyVar});
        }
        com.taobao.android.detail.core.request.desc.d dVar = new com.taobao.android.detail.core.request.desc.d(egyVar.c, egyVar.f27302a, null);
        dVar.e = egyVar.d;
        dVar.d = new HashMap<String, String>() { // from class: com.taobao.android.detail.core.detail.fragment.desc.DescNativeController.2
            {
                put("shopId", egyVar.b);
            }
        };
        return new b(this.f9487a, dVar, this.x);
    }

    private boolean b(egy egyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d554e1e6", new Object[]{this, egyVar})).booleanValue();
        }
        if (egyVar == null) {
            i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel is null.");
            return true;
        } else if (egyVar.d == null) {
            i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is null.");
            return true;
        } else if (egyVar.d.size() != 0) {
            return false;
        } else {
            i.a("DescNativeDegradeH5", "DescNativeController mDetailDescViewModel.mModuleDescParams is empty.");
            return true;
        }
    }

    private boolean a(enl enlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72e9719", new Object[]{this, enlVar})).booleanValue();
        }
        if (enlVar == null) {
            i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response is null.");
            return true;
        } else if (enlVar.f27460a == null) {
            i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is null.");
            return true;
        } else if (!enlVar.f27460a.isEmpty()) {
            return false;
        } else {
            i.a("DescNativeDegradeH5", "DescNativeController DetailDescStructure response.contents is empty.");
            return true;
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        if (this.f == null) {
            try {
                this.f = com.taobao.android.detail.core.async.d.b(this.f9487a, R.layout.x_taodetail_loading_mask);
            } catch (Throwable th) {
                i.a("DescNativeController", "showLoading inflate x_taodetail_loading_mask", th);
                this.f = new View(this.f9487a);
            }
        }
        b(this.f);
    }

    private void a(int i, int i2, boolean z, DESCErrorView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417780d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), aVar});
            return;
        }
        Activity activity = this.f9487a;
        if (activity == null) {
            return;
        }
        if (this.e == null) {
            this.e = new DESCErrorView(activity);
            this.c.addView(this.e);
        }
        this.e.showButton(z);
        if (z) {
            this.e.setOnReloadButtonClickListener(aVar);
        }
        this.e.setErrorIconRes(i);
        this.e.setErrorTip(this.f9487a.getString(i2));
        b(this.e);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.desc.DESCErrorView.a
    public void a(View view) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.k == DESCState.STATIC_FAIL && this.g != null) {
            a();
        } else {
            enl enlVar = this.i;
            if (enlVar == null || !enlVar.a() || (bVar = this.j) == null) {
                return;
            }
            bVar.c();
            DESCErrorView dESCErrorView = this.e;
            if (dESCErrorView == null || !dESCErrorView.isShown()) {
                return;
            }
            a(R.string.taodetail_iconfont_shop, R.string.detail_fulldesc_dataquerying_tip, false, null);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(Event event) {
        eid eidVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (eno.a(OpenSkuEvent.class) == event.getEventId()) {
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        if (eno.a(l.class) == event.getEventId()) {
            eid eidVar2 = this.u;
            if (eidVar2 != null) {
                eidVar2.b();
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(m.class) == event.getEventId()) {
            m.a aVar = (m.a) event.getParam();
            a(this.f9487a, aVar, aVar.f);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(com.taobao.android.detail.core.event.video.m.class) == event.getEventId()) {
            eid eidVar3 = this.u;
            if (eidVar3 != null) {
                com.taobao.android.detail.core.event.video.m mVar = (com.taobao.android.detail.core.event.video.m) event;
                eidVar3.a(mVar.f9739a, mVar.b);
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else if (eno.a(n.class) == event.getEventId()) {
            eid eidVar4 = this.u;
            if (eidVar4 != null) {
                eidVar4.a();
            }
            return com.taobao.android.detail.core.event.a.SUCCESS;
        } else {
            if (eno.a(com.taobao.android.detail.core.event.video.f.class) == event.getEventId() && (eidVar = this.u) != null) {
                eidVar.c();
            }
            if (eno.a(o.class) == event.getEventId()) {
                return com.taobao.android.detail.core.event.a.SUCCESS;
            }
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
    }

    private void a(Context context, m.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fd0d54", new Object[]{this, context, aVar, new Boolean(z)});
            return;
        }
        eig k = ((com.taobao.android.detail.core.open.h) com.taobao.android.detail.core.open.n.a(context)).k();
        if (k == null) {
            this.u = null;
            return;
        }
        this.u = k.b();
        eid eidVar = this.u;
        if (eidVar == null) {
            return;
        }
        eidVar.a(context, aVar, z);
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (com.taobao.android.detail.core.utils.e.i() && this.t) {
            z = true;
        }
        if (z || this.s || this.g == null) {
            return;
        }
        l();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!this.t) {
            a();
        }
        List<Event> list = this.n;
        if (list != null && !list.isEmpty()) {
            for (Event event : this.n) {
                f.a(this.f9487a, event);
            }
        }
        if (this.m != null) {
            int lastVisibleItem = this.d.getLastVisibleItem();
            for (int firstVisibleItem = this.d.getFirstVisibleItem(); firstVisibleItem <= lastVisibleItem; firstVisibleItem++) {
                com.taobao.android.detail.core.detail.kit.view.holder.desc.b d = this.m.d(firstVisibleItem);
                if (d != null) {
                    d.G_();
                }
            }
        }
        a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        elz.a(this.f9487a, true);
        this.v = true;
        i.d("DescNativeController", "commitUserMotionForDesc:appear");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        List<Event> list = this.o;
        if (list != null && !list.isEmpty()) {
            for (Event event : this.o) {
                f.a(this.f9487a, event);
            }
        }
        com.taobao.android.detail.core.detail.kit.view.holder.b bVar = this.m;
        if (bVar != null) {
            Iterator<com.taobao.android.detail.core.detail.kit.view.holder.desc.b> it = bVar.d().iterator();
            while (it.hasNext()) {
                it.next().a(z, z2);
            }
        }
        if (!this.v) {
            return;
        }
        elz.a(this.f9487a, false);
        this.v = false;
        i.d("DescNativeController", "commitUserMotionForDesc:disappear");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
        f.a(this.f9487a).b(eno.a(m.class), this);
        com.taobao.android.detail.core.detail.kit.view.holder.b bVar2 = this.m;
        if (bVar2 != null) {
            Iterator<com.taobao.android.detail.core.detail.kit.view.holder.desc.b> it = bVar2.d().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        a aVar = this.w;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
        com.taobao.android.detail.core.detail.kit.view.holder.b bVar2 = this.m;
        if (bVar2 != null) {
            Iterator<com.taobao.android.detail.core.detail.kit.view.holder.desc.b> it = bVar2.d().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        a aVar = this.w;
        if (aVar == null) {
            return;
        }
        aVar.c();
        this.w = null;
    }
}
