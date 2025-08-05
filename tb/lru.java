package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes7.dex */
public class lru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30875a;
    private IContainerDataService<?> b;
    private JSONObject c;

    static {
        kge.a(-1113378279);
    }

    public static /* synthetic */ void a(lru lruVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57fbd4d2", new Object[]{lruVar, iContainerDataModel});
        } else {
            lruVar.a(iContainerDataModel);
        }
    }

    public lru(ljs ljsVar) {
        this.f30875a = ljsVar;
        this.b = (IContainerDataService) this.f30875a.a(IContainerDataService.class);
        d();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            ldf.d("SmartLoadingConfig", "homeGlobalConfig == null,服务端的HomeGlobalABTest为空");
            return 0;
        }
        try {
            return Integer.parseInt(jSONObject.getString("onceInsert"));
        } catch (Exception e) {
            ldf.d("SmartLoadingConfig", "解析一次插几张卡时出现异常，异常为：" + e);
            return 0;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            ldf.d("SmartLoadingConfig", "homeGlobalConfig == null,服务端的HomeGlobalABTest为空");
            return 0;
        }
        try {
            return Integer.parseInt(jSONObject.getString("insertForwardNum"));
        } catch (Exception e) {
            ldf.d("SmartLoadingConfig", "解析倒数第几张插卡时出现异常，异常为：" + e);
            return 0;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            ldf.d("SmartLoadingConfig", "homeGlobalConfig == null,服务端的HomeGlobalABTest为空");
            return 0;
        }
        try {
            return Integer.parseInt(jSONObject.getString("expirationTime"));
        } catch (Exception e) {
            ldf.d("SmartLoadingConfig", "解析倒数第几张插卡时出现异常，异常为：" + e);
            return 0;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30875a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingConfig", "containerDataService == null");
            return;
        }
        this.c = f();
        iContainerDataService.addDataProcessListener(e());
    }

    private IContainerDataService.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("39a36f61", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lru.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    lru.a(lru.this, iContainerDataModel);
                }
            }
        };
    }

    private void a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
        } else {
            this.c = a(base);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingConfig", "containerDataService == null");
            return null;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("SmartLoadingConfig", "containerData == null");
            return null;
        }
        return a(containerData.getBase());
    }

    private JSONObject a(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27067895", new Object[]{this, iContainerInnerDataModel});
        }
        if (iContainerInnerDataModel == null) {
            ldf.d("SmartLoadingConfig", "baseData == null");
            return null;
        }
        JSONObject ext = iContainerInnerDataModel.getExt();
        if (ext == null) {
            ldf.d("SmartLoadingConfig", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }
}
