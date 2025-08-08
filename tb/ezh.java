package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.content.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.ak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ezh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_BIZ_NAME = "industry_detail";
    public static final int DINAMIC_IMG_BIZ_ID = 15;
    public static final String DINAMIC_IMG_BIZ_TYPE = "detail";

    /* renamed from: a  reason: collision with root package name */
    private a f27672a;
    private Context b;
    private eyx c;
    private bd d;
    private DinamicXEngine e;
    private Map<String, List<c>> f;
    private fve g;
    private Handler h;

    /* loaded from: classes4.dex */
    public interface b {
        void a(ViewGroup viewGroup);

        void a(String str);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(ezi eziVar);

        void a(ezi eziVar, String str);
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(ViewGroup viewGroup);

        void a(String str);
    }

    static {
        kge.a(902449406);
    }

    public static /* synthetic */ DXResult a(ezh ezhVar, DXTemplateItem dXTemplateItem, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("1f9b2534", new Object[]{ezhVar, dXTemplateItem, viewGroup}) : ezhVar.a(dXTemplateItem, viewGroup);
    }

    public static /* synthetic */ DXTemplateItem a(ezh ezhVar, ezi eziVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("82958b1e", new Object[]{ezhVar, eziVar}) : ezhVar.b(eziVar);
    }

    public static /* synthetic */ void a(ezh ezhVar, fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e48643", new Object[]{ezhVar, fvbVar});
        } else {
            ezhVar.a(fvbVar);
        }
    }

    private synchronized void a(fvb fvbVar) {
        List<c> list;
        List<c> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94fa006", new Object[]{this, fvbVar});
            return;
        }
        if (fvbVar.b != null && !fvbVar.b.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : fvbVar.b) {
                i.a("DinamicXEngine", "failedTemplateItem: " + dXTemplateItem.toString());
                String b2 = b(dXTemplateItem);
                if (!StringUtils.isEmpty(b2) && (list2 = this.f.get(b2)) != null) {
                    for (final c cVar : list2) {
                        final ezi a2 = a(dXTemplateItem);
                        a(new Runnable() { // from class: tb.ezh.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    cVar.a(a2, "unknown error");
                                }
                            }
                        }, !(cVar instanceof e));
                    }
                    list2.clear();
                }
            }
        }
        if (fvbVar.f28139a != null && !fvbVar.f28139a.isEmpty()) {
            for (DXTemplateItem dXTemplateItem2 : fvbVar.f28139a) {
                String b3 = b(dXTemplateItem2);
                if (!StringUtils.isEmpty(b3) && (list = this.f.get(b3)) != null) {
                    for (final c cVar2 : list) {
                        final ezi a3 = a(dXTemplateItem2);
                        a(new Runnable() { // from class: tb.ezh.10
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    cVar2.a(a3);
                                }
                            }
                        }, !(cVar2 instanceof e));
                    }
                    list.clear();
                }
            }
        }
    }

    private ezh() {
        this.f = new ConcurrentHashMap(0);
        this.g = new fve() { // from class: tb.ezh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public void onNotificationListener(fvb fvbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                } else {
                    ezh.a(ezh.this, fvbVar);
                }
            }
        };
    }

    private ezh(a aVar) {
        this.f = new ConcurrentHashMap(0);
        this.g = new fve() { // from class: tb.ezh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public void onNotificationListener(fvb fvbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                } else {
                    ezh.a(ezh.this, fvbVar);
                }
            }
        };
        this.f27672a = aVar;
        this.b = a.a(aVar);
        this.c = a.b(aVar);
        this.h = this.c == null ? new Handler(Looper.getMainLooper()) : null;
        DXVideoControlConfig<fxw> b2 = DXVideoControlConfig.b();
        try {
            b2.a(Class.forName("com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode"));
            b2.b(true);
        } catch (Throwable th) {
            i.a("DinamicXEngine", "find DXVideoViewWidgetNode error", th);
        }
        this.d = new bd(new DXEngineConfig.a(a.h(aVar)).d(a.g(aVar)).a(a.f(aVar)).b(a.e(aVar)).b(a.d(aVar)).a(a.c(aVar)).f(true).a(b2).a(new f()).a(true, true).a());
        this.e = this.d.d();
        this.d.a(this.g);
    }

    public void a(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa971a4c", new Object[]{this, new Long(j), bnVar});
        } else {
            this.d.a(j, bnVar);
        }
    }

    public void a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
        } else {
            this.d.a(j, futVar);
        }
    }

    public void a(long j, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
        } else {
            this.d.a(j, akVar);
        }
    }

    public void a(long j, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e836f26", new Object[]{this, new Long(j), dlnVar});
        } else {
            this.e.a(j, dlnVar);
        }
    }

    public void a(String str, String str2, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d14546", new Object[]{this, str, str2, dlnVar});
        } else {
            this.e.a(str, str2, dlnVar);
        }
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.e.b(dXRootView);
        }
    }

    public void b(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
        } else {
            this.e.a(dXRootView);
        }
    }

    private void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{this, runnable, new Boolean(z)});
        } else if (!z) {
            eyx eyxVar = this.c;
            if (eyxVar != null) {
                eyxVar.b().a(runnable);
            } else {
                this.h.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    private DXTemplateItem b(ezi eziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("44f1115a", new Object[]{this, eziVar});
        }
        if (eziVar == null) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = eziVar.a();
        dXTemplateItem.b = eziVar.b();
        dXTemplateItem.c = eziVar.c();
        return dXTemplateItem;
    }

    public static ezi a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("1fa12b81", new Object[]{dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        ezi eziVar = new ezi();
        eziVar.a(dXTemplateItem.f11925a);
        eziVar.b(String.valueOf(dXTemplateItem.b));
        eziVar.c(dXTemplateItem.c);
        return eziVar;
    }

    public synchronized ezi a(ezi eziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezi) ipChange.ipc$dispatch("d12ff62e", new Object[]{this, eziVar});
        }
        DXTemplateItem b2 = b(eziVar);
        if (b2 == null) {
            return null;
        }
        return a(c(b2));
    }

    public ViewGroup a(ezi eziVar, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("ff60cb32", new Object[]{this, eziVar, bVar}) : a(eziVar, (ViewGroup) null, bVar);
    }

    public ViewGroup a(ezi eziVar, ViewGroup viewGroup, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2fd82ed3", new Object[]{this, eziVar, viewGroup, bVar}) : a(eziVar, viewGroup, bVar, true);
    }

    public ViewGroup a(ezi eziVar, final ViewGroup viewGroup, final b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("815fbc3", new Object[]{this, eziVar, viewGroup, bVar, new Boolean(z)});
        }
        ezi a2 = a(eziVar);
        boolean a3 = a(a2, eziVar);
        final DXResult<DXRootView> a4 = a(b(a2), viewGroup);
        if (!a3 && bVar != null) {
            a(eziVar, new c() { // from class: tb.ezh.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.c
                public void a(ezi eziVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7d65404", new Object[]{this, eziVar2});
                        return;
                    }
                    ezh ezhVar = ezh.this;
                    DXResult a5 = ezh.a(ezhVar, ezh.a(ezhVar, eziVar2), viewGroup);
                    if (a5 == null) {
                        bVar.a("after download createView() dxViewResult is null");
                    } else if (a5.b()) {
                        b bVar2 = bVar;
                        bVar2.a("after download createView() has error: " + a5.a().toString());
                    } else if (a5.f11780a == 0) {
                        bVar.a("after download createView() dxViewResult.result is null");
                    } else {
                        bVar.a((ViewGroup) a5.f11780a);
                    }
                }

                @Override // tb.ezh.c
                public void a(ezi eziVar2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fd804ce", new Object[]{this, eziVar2, str});
                    } else {
                        bVar.a(str);
                    }
                }
            }, true);
        }
        if (a4 == null) {
            a(new Runnable() { // from class: tb.ezh.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a("createView() dxViewResult is null");
                }
            }, z);
        } else if (a4.b()) {
            a(new Runnable() { // from class: tb.ezh.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a("createView() has error: " + a4.a().toString());
                }
            }, z);
        } else if (a4.f11780a == null) {
            a(new Runnable() { // from class: tb.ezh.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a("createView() dxViewResult.result is null");
                }
            }, z);
        } else {
            a(new Runnable() { // from class: tb.ezh.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a((ViewGroup) a4.f11780a);
                }
            }, z);
        }
        return a4.f11780a;
    }

    @Deprecated
    public DXResult<DXRootView> a(DXRootView dXRootView, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("5d1e437a", new Object[]{this, dXRootView, jSONObject, new Integer(i), new Integer(i2)}) : this.e.a(this.b, jSONObject, dXRootView, i, i2, (Object) null);
    }

    public ViewGroup a(ViewGroup viewGroup, JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e340ae2f", new Object[]{this, viewGroup, jSONObject, dVar}) : a(viewGroup, gbg.a(), gbg.b(), jSONObject, dVar);
    }

    public ViewGroup a(ViewGroup viewGroup, int i, int i2, JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("112a58cf", new Object[]{this, viewGroup, new Integer(i), new Integer(i2), jSONObject, dVar}) : a(viewGroup, i, i2, jSONObject, dVar, true);
    }

    public ViewGroup a(ViewGroup viewGroup, int i, int i2, JSONObject jSONObject, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("51091147", new Object[]{this, viewGroup, new Integer(i), new Integer(i2), jSONObject, dVar, new Boolean(z)}) : a(viewGroup, i, i2, jSONObject, dVar, z, null);
    }

    public ViewGroup a(ViewGroup viewGroup, int i, int i2, JSONObject jSONObject, final d dVar, boolean z, ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("99cdae8a", new Object[]{this, viewGroup, new Integer(i), new Integer(i2), jSONObject, dVar, new Boolean(z), baVar});
        }
        if (!(viewGroup instanceof DXRootView)) {
            a(new Runnable() { // from class: tb.ezh.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d dVar2 = dVar;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a("renderView() the parameter dxRootView should be DinamicXEngine createView()");
                }
            }, z);
            return viewGroup;
        } else if (jSONObject == null) {
            a(new Runnable() { // from class: tb.ezh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d dVar2 = dVar;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a("renderView() the parameter data should not be null");
                }
            }, z);
            return viewGroup;
        } else {
            final DXResult<DXRootView> a2 = a((DXRootView) viewGroup, i, i2, jSONObject, baVar);
            if (a2 == null) {
                a(new Runnable() { // from class: tb.ezh.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d dVar2 = dVar;
                        if (dVar2 == null) {
                            return;
                        }
                        dVar2.a("renderView() dxViewResult is null");
                    }
                }, z);
                return null;
            }
            if (a2.b()) {
                a(new Runnable() { // from class: tb.ezh.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d dVar2 = dVar;
                        if (dVar2 == null) {
                            return;
                        }
                        dVar2.a("renderView() " + a2.a().toString());
                    }
                }, z);
            } else {
                a(new Runnable() { // from class: tb.ezh.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d dVar2 = dVar;
                        if (dVar2 == null) {
                            return;
                        }
                        dVar2.a((ViewGroup) a2.f11780a);
                    }
                }, z);
            }
            return a2.f11780a;
        }
    }

    public synchronized boolean a(ezi eziVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14847fe6", new Object[]{this, eziVar, cVar})).booleanValue();
        }
        return a(eziVar, cVar, false);
    }

    public synchronized boolean a(final ezi eziVar, final c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c0c2f36", new Object[]{this, eziVar, cVar, new Boolean(z)})).booleanValue();
        } else if (eziVar == null) {
            Runnable runnable = new Runnable() { // from class: tb.ezh.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(null, "DxTemplateInfo is null");
                }
            };
            if (z) {
                z2 = false;
            }
            a(runnable, z2);
            return false;
        } else if (d(eziVar)) {
            Runnable runnable2 = new Runnable() { // from class: tb.ezh.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(eziVar);
                }
            };
            if (!z) {
                z3 = true;
            }
            a(runnable2, z3);
            return true;
        } else {
            String c2 = c(eziVar);
            if (c2 == null) {
                Runnable runnable3 = new Runnable() { // from class: tb.ezh.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        c cVar2 = cVar;
                        if (cVar2 == null) {
                            return;
                        }
                        cVar2.a(eziVar, "DxTemplateInfo is invalid");
                    }
                };
                if (z) {
                    z2 = false;
                }
                a(runnable3, z2);
            } else {
                if (cVar != null) {
                    List<c> list = this.f.get(c2);
                    if (list == null) {
                        list = new ArrayList<>(1);
                        this.f.put(c2, list);
                    }
                    if (z) {
                        cVar = new e(cVar);
                    }
                    list.add(cVar);
                }
                a(Collections.singletonList(b(eziVar)));
            }
            return false;
        }
    }

    private String b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f5f10e", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null || StringUtils.isEmpty(dXTemplateItem.f()) || dXTemplateItem.g() < 0) {
            return null;
        }
        return dXTemplateItem.f() + " | " + dXTemplateItem.g();
    }

    private String c(ezi eziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39f7005a", new Object[]{this, eziVar});
        }
        if (eziVar == null || StringUtils.isEmpty(eziVar.a()) || eziVar.b() < 0) {
            return null;
        }
        return eziVar.a() + " | " + eziVar.b();
    }

    private boolean a(ezi eziVar, ezi eziVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b1cdfa4", new Object[]{this, eziVar, eziVar2})).booleanValue() : eziVar != null && eziVar2 != null && StringUtils.equals(eziVar.a(), eziVar2.a()) && eziVar.b() == eziVar2.b();
    }

    private boolean d(ezi eziVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b35f678b", new Object[]{this, eziVar})).booleanValue() : a(a(eziVar), eziVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f.clear();
        this.d.b(this.g);
        this.e.o();
    }

    private DXTemplateItem c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("5354490c", new Object[]{this, dXTemplateItem}) : this.d.a(dXTemplateItem);
    }

    private DXResult<DXRootView> a(DXTemplateItem dXTemplateItem, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("95879a91", new Object[]{this, dXTemplateItem, viewGroup}) : this.d.a(this.b, viewGroup, dXTemplateItem);
    }

    private DXResult<DXRootView> a(DXRootView dXRootView, int i, int i2, JSONObject jSONObject, ba baVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("70543d", new Object[]{this, dXRootView, new Integer(i), new Integer(i2), jSONObject, baVar}) : this.e.a(this.b, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.a().a(i).b(i2).a(baVar).a());
    }

    private void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.d.a(list);
        }
    }

    /* loaded from: classes4.dex */
    public static class e implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f27690a;

        static {
            kge.a(-1977872854);
            kge.a(-1196305625);
        }

        public e(c cVar) {
            this.f27690a = cVar;
        }

        @Override // tb.ezh.c
        public void a(ezi eziVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7d65404", new Object[]{this, eziVar});
                return;
            }
            c cVar = this.f27690a;
            if (cVar == null) {
                return;
            }
            cVar.a(eziVar);
        }

        @Override // tb.ezh.c
        public void a(ezi eziVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fd804ce", new Object[]{this, eziVar, str});
                return;
            }
            c cVar = this.f27690a;
            if (cVar == null) {
                return;
            }
            cVar.a(eziVar, str);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f27689a;
        private eyx b;
        private String c;
        private int d;
        private String e;
        private int f = 2;
        private boolean g;
        private boolean h;

        static {
            kge.a(865026517);
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2680c980", new Object[]{aVar}) : aVar.f27689a;
        }

        public static /* synthetic */ eyx b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("60a5e3d9", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc68570e", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5643c14f", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b01f2b7f", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("83ee1273", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63d60001", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("944e9231", new Object[]{aVar}) : aVar.c;
        }

        public a(Context context, String str) {
            this.f27689a = context;
            this.c = str;
        }

        public a(Context context, eyx eyxVar, String str) {
            this.f27689a = context;
            this.b = eyxVar;
            this.c = str;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d347be3b", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ce3bf84", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public ezh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ezh) ipChange.ipc$dispatch("f04652b", new Object[]{this}) : new ezh(this);
        }
    }
}
