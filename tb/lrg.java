package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class lrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f30855a;
    private IContainerDataService.a b;
    private lri c;
    private lrh d;
    private Map<String, BaseSectionModel<?>> e;
    private boolean f;

    static {
        kge.a(-1261064325);
    }

    public static /* synthetic */ void a(lrg lrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3569b97", new Object[]{lrgVar});
        } else {
            lrgVar.e();
        }
    }

    public static /* synthetic */ boolean a(lrg lrgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("777d8a21", new Object[]{lrgVar, new Boolean(z)})).booleanValue();
        }
        lrgVar.f = z;
        return z;
    }

    public lrg(ljs ljsVar) {
        this.f30855a = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.f30855a == null) {
            ldf.d("ShareDataSource", "ShareDataSource mContainerDataService is null");
            return;
        }
        this.c = new lri(ljsVar);
        this.d = new lrh(this.f30855a);
        this.b = f();
        this.f30855a.addDataProcessListener(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f30855a;
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(this.b);
    }

    public JSONObject a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5496e366", new Object[]{this, str, str2, str3});
        }
        if (this.d == null) {
            ldf.d("ShareDataSource", "findSmartContentInfo mFindSmartContentInfoHandler is null");
            return null;
        }
        BaseSectionModel<?> a2 = a(str);
        if (a2 == null) {
            ldf.d("ShareDataSource", "isMiniAppExist sectionModel is null");
            return null;
        }
        return this.d.a(a2, str2, str3);
    }

    public boolean a(JSONObject jSONObject) {
        Map<String, BaseSectionModel<?>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (!this.f) {
            ldf.d("ShareDataSource", "baseSectionModelMap not build");
            return true;
        }
        BaseSectionModel<?> createBaseSectionModel = this.f30855a.createBaseSectionModel(jSONObject);
        String sectionBizCode = createBaseSectionModel.getSectionBizCode();
        if (this.c == null || (map = this.e) == null || !map.containsKey(sectionBizCode)) {
            return false;
        }
        this.e.put(sectionBizCode, createBaseSectionModel);
        return this.c.a(createBaseSectionModel);
    }

    public BaseSectionModel<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("57cd676c", new Object[]{this, str});
        }
        if (this.f30855a == null) {
            ldf.d("ShareDataSource", "getData mContainerDataService is null");
            return null;
        }
        Map<String, BaseSectionModel<?>> map = this.e;
        if (map == null) {
            ldf.d("ShareDataSource", "getData baseSectionModelMap is null");
            return null;
        }
        return map.get(str);
    }

    public Collection<BaseSectionModel<?>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this});
        }
        Map<String, BaseSectionModel<?>> map = this.e;
        if (map == null || map.isEmpty()) {
            ldf.d("ShareDataSource", "getShareData, baseSectionModelMap is null");
            return null;
        }
        return this.e.values();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    public JSONObject c() {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.f30855a;
        if (iContainerDataService == null) {
            ldf.d("ShareDataSource", "getPassParams mContainerDataService is null");
            return null;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData != 0 && (base = containerData.getBase()) != null) {
            return base.getPassParams();
        }
        return null;
    }

    public IContainerDataService<?> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService) ipChange.ipc$dispatch("355492bd", new Object[]{this}) : this.f30855a;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List<BaseSectionModel<?>> a2 = a(this.f30855a);
        if (a2 == null || a2.isEmpty()) {
            this.e = null;
            ldf.d("ShareDataSource", "createSectionModelMap containerDataModel is null");
            return;
        }
        HashMap hashMap = new HashMap(2);
        for (BaseSectionModel<?> baseSectionModel : a2) {
            if (baseSectionModel.getExt().getBooleanValue("isHSharedData")) {
                hashMap.put(baseSectionModel.getSectionBizCode(), baseSectionModel);
            }
        }
        this.e = hashMap;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private List<BaseSectionModel<?>> a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b15c9f4d", new Object[]{this, iContainerDataService});
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("ShareDataSource", "containerDataModel == null");
            return null;
        }
        return containerData.getTotalData();
    }

    private IContainerDataService.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("40cc51a2", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lrg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                    return;
                }
                lrg.a(lrg.this);
                lrg.a(lrg.this, true);
            }
        };
    }
}
