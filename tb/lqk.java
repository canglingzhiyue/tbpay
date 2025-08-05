package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.lkz;

/* loaded from: classes.dex */
public class lqk extends lqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<lkz.a> f30828a;
    private boolean b;
    private String c;
    private JSONObject d;
    private final lql e;
    private IContainerService f;
    private WeakReference<IContainerDataService.b> g;
    private final ssq h;
    private IContainerDataService i;
    private WeakReference<IContainerDataService.e> j;
    private WeakReference<IContainerService.a> k;

    static {
        kge.a(-1213640350);
    }

    public static /* synthetic */ Object ipc$super(lqk lqkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ lql a(lqk lqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lql) ipChange.ipc$dispatch("3b52c60d", new Object[]{lqkVar}) : lqkVar.e;
    }

    public static /* synthetic */ void a(lqk lqkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7600cfb1", new Object[]{lqkVar, new Integer(i)});
        } else {
            lqkVar.b(i);
        }
    }

    public static /* synthetic */ void a(lqk lqkVar, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc38649", new Object[]{lqkVar, new Integer(i), view, baseSectionModel});
        } else {
            lqkVar.a(i, view, baseSectionModel);
        }
    }

    public static /* synthetic */ void a(lqk lqkVar, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4b7b48", new Object[]{lqkVar, view, baseSectionModel});
        } else {
            lqkVar.a(view, baseSectionModel);
        }
    }

    public static /* synthetic */ ssq b(lqk lqkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ssq) ipChange.ipc$dispatch("22f7d322", new Object[]{lqkVar}) : lqkVar.h;
    }

    public lqk(ljs ljsVar) {
        super(ljsVar);
        this.d = new JSONObject(8);
        this.c = c().a().a();
        this.e = new lql();
        this.h = new ssq();
        this.f = (IContainerService) ljsVar.a(IContainerService.class);
        this.i = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    @Override // tb.lqm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // tb.lqm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        lks<?> d = d();
        if (d == null) {
            return;
        }
        lkz.a g = g();
        this.f30828a = new WeakReference<>(g);
        d.a(g);
        IContainerDataService.b j = j();
        this.g = new WeakReference<>(j);
        this.i.addRequestListener(j);
        IContainerDataService.e eVar = new IContainerDataService.e() { // from class: tb.lqk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
            public void a(String str, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                } else if (!TextUtils.equals(str, "ViewAppear")) {
                } else {
                    lqk.a(lqk.this, jSONObject.getIntValue("index"));
                }
            }
        };
        this.j = new WeakReference<>(eVar);
        this.i.addTriggerEventListener(eVar);
        IContainerService.a aVar = new IContainerService.a() { // from class: tb.lqk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void b(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void a(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                    return;
                }
                lqk.a(lqk.this).a(iUiRefreshActionModel);
                lqk.b(lqk.this).a(iUiRefreshActionModel);
            }
        };
        this.k = new WeakReference<>(aVar);
        this.f.addUiRefreshListener(aVar);
    }

    private IContainerDataService.b j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("5d6fdac5", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lqk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                } else if (!TextUtils.equals(str, "scrollNextPage")) {
                } else {
                    lqk.b(lqk.this).d();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (!TextUtils.equals(str, "scrollNextPage")) {
                } else {
                    lqk.b(lqk.this).e();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                } else if (!TextUtils.equals(str3, "scrollNextPage")) {
                } else {
                    lqk.b(lqk.this).e();
                }
            }
        };
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.h == null) {
        } else {
            this.h.a(this.c, i(), k(), i, m());
        }
    }

    private void f() {
        IContainerDataService.e eVar;
        IContainerDataService iContainerDataService;
        IContainerService.a aVar;
        IContainerService iContainerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        lks<?> d = d();
        if (d == null) {
            return;
        }
        lkz.a aVar2 = this.f30828a.get();
        if (aVar2 != null) {
            d.b(aVar2);
        }
        l();
        WeakReference<IContainerService.a> weakReference = this.k;
        if (weakReference != null && (aVar = weakReference.get()) != null && (iContainerService = this.f) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
        WeakReference<IContainerDataService.e> weakReference2 = this.j;
        if (weakReference2 == null || (eVar = weakReference2.get()) == null || (iContainerDataService = this.i) == null) {
            return;
        }
        iContainerDataService.removeTriggerEventListener(eVar);
    }

    private void l() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        WeakReference<IContainerDataService.b> weakReference = this.g;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        this.i.removeRequestListener(bVar);
    }

    private lkz.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("b5d8f040", new Object[]{this}) : new lkz.a() { // from class: tb.lqk.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                } else {
                    lqk.a(lqk.this, i, view, baseSectionModel);
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                } else {
                    lqk.a(lqk.this, view, baseSectionModel);
                }
            }
        };
    }

    private void a(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel == null) {
        } else {
            a(i, baseSectionModel);
            if (!a(baseSectionModel.getSectionBizCode())) {
                return;
            }
            a(i);
        }
    }

    private void a(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e05c3b2", new Object[]{this, view, baseSectionModel});
        } else if (baseSectionModel == null || !a(baseSectionModel.getSectionBizCode())) {
        } else {
            h();
        }
    }

    private void a(int i, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e9eb63", new Object[]{this, new Integer(i), baseSectionModel});
        } else if (this.b || i <= 0) {
        } else {
            this.b = true;
            HashMap hashMap = new HashMap();
            hashMap.put("isRemoteData", Boolean.valueOf(i.d(i.b(baseSectionModel))));
            lqe.a(this.c, "homeViewRender", hashMap);
            lqe.a(this.c, "homeViewLayout", 1);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "loading".equals(str);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ldl.a(c().a().c(), 19999, "nextPageLoading", null, null, "");
        HashMap hashMap = new HashMap();
        int i2 = i();
        hashMap.put("homeLoadingStay_" + i + "_" + i2, 0);
        lqe.a(this.c, "homeLoadingStay", 1, hashMap);
        this.d.put("index", (Object) Integer.valueOf(i));
        this.d.put(BioDetector.EXT_KEY_PAGENUM, (Object) Integer.valueOf(i2));
        this.d.put("attachTime", (Object) Long.valueOf(SystemClock.uptimeMillis()));
        this.e.a(i2, i);
        this.h.b(i2, i, k());
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        lqe.a(this.c, "homeLoadingStay", oog.a());
        if (this.d.containsKey("attachTime")) {
            this.d.put("bucket", (Object) oog.a());
            this.d.put("stayTime", (Object) Long.valueOf(SystemClock.uptimeMillis() - this.d.getLongValue("attachTime")));
            lap.a("Performance", "Smart_Loading", this.d.toJSONString());
            this.d.clear();
        }
        this.e.a();
        this.h.a();
    }

    private int i() {
        IContainerInnerDataModel base;
        IPageDataModel mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) c().a(IContainerDataService.class);
        if (iContainerDataService != null && iContainerDataService.getContainerData() != null && (base = iContainerDataService.getContainerData().getBase()) != null && (mo1280getPageParams = base.mo1280getPageParams()) != null) {
            return mo1280getPageParams.getPageNum();
        }
        return 0;
    }

    private IPageDataModel a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageDataModel) ipChange.ipc$dispatch("fa4e5baa", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            return base.mo1280getPageParams();
        }
        return null;
    }

    private int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = this.i;
        if (iContainerDataService == null || iContainerDataService.getContainerData() == null) {
            return 10;
        }
        IPageDataModel a2 = a(this.i.getContainerData());
        if (a2 == null) {
            ldf.d("Smart_Loading", "pageDataModel == null");
            return 10;
        }
        return a2.getRequestInAdvance();
    }

    private int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = this.i;
        if (iContainerDataService != null && iContainerDataService.getContainerData() != null) {
            return this.i.getContainerData().getTotalData().size();
        }
        return -1;
    }
}
