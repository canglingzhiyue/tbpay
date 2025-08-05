package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class lro extends lrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lrg f30866a;
    private final IContainerDataService<?> b;
    private volatile boolean c;
    private lrq d;
    private IContainerDataService.b f;
    private final List<IJsBridgeService.a.InterfaceC0670a> e = new CopyOnWriteArrayList();
    private long g = -1;

    static {
        kge.a(-1347616871);
    }

    private String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "MiniAppRequestFeature_miniAppPopRequest";
    }

    public static /* synthetic */ Object ipc$super(lro lroVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "miniApp.request";
    }

    public static /* synthetic */ JSONObject a(lro lroVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ad75026c", new Object[]{lroVar, iContainerDataModel}) : lroVar.a(iContainerDataModel);
    }

    public static /* synthetic */ lrq a(lro lroVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lrq) ipChange.ipc$dispatch("96973acc", new Object[]{lroVar}) : lroVar.d;
    }

    public static /* synthetic */ lrq a(lro lroVar, lrq lrqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrq) ipChange.ipc$dispatch("a00d5b47", new Object[]{lroVar, lrqVar});
        }
        lroVar.d = lrqVar;
        return lrqVar;
    }

    public static /* synthetic */ boolean a(lro lroVar, lli lliVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d6bb27a", new Object[]{lroVar, lliVar})).booleanValue() : lroVar.a(lliVar);
    }

    public static /* synthetic */ boolean a(lro lroVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ee4629", new Object[]{lroVar, new Boolean(z)})).booleanValue();
        }
        lroVar.c = z;
        return z;
    }

    public static /* synthetic */ void b(lro lroVar, lrq lrqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a5cd7f5", new Object[]{lroVar, lrqVar});
        } else {
            lroVar.b(lrqVar);
        }
    }

    public lro(lrg lrgVar) {
        this.f30866a = lrgVar;
        this.b = this.f30866a.d();
        if (this.b != null) {
            this.f = e();
            this.b.addRequestListener(this.f);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void a(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a8e84a", new Object[]{this, jSONObject, interfaceC0670a});
        } else if (this.b == null) {
            ldf.d("MiniAppRequestFeature", "mContainerDataService is null");
            interfaceC0670a.a("首页数据服务未初始化，mContainerDataService is null");
        } else if (!a(this.d)) {
            ldf.d("MiniAppRequestFeature", "直接返回历史结果");
            this.e.add(interfaceC0670a);
            b(this.d);
        } else {
            if (this.c) {
                if (!c()) {
                    this.e.add(interfaceC0670a);
                    ldf.d("MiniAppRequestFeature", "请求尚未结束，等待结果");
                    return;
                }
                ldf.d("MiniAppRequestFeature", "mtop无返回");
                for (IJsBridgeService.a.InterfaceC0670a interfaceC0670a2 : this.e) {
                    interfaceC0670a2.a("no mtop callback receive , request local timeout in20000");
                }
                this.c = false;
            }
            b(jSONObject, interfaceC0670a);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g > 0 && System.currentTimeMillis() - this.g > orq.FRAME_CHECK_TIMEOUT;
    }

    @Override // tb.lrr
    public void b() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null || (bVar = this.f) == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
    }

    private void b(JSONObject jSONObject, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5308b4b", new Object[]{this, jSONObject, interfaceC0670a});
            return;
        }
        this.e.add(interfaceC0670a);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Object> a2 = a(jSONObject);
        if (a2 != null) {
            jSONObject2.put("bizParam", (Object) a2);
        }
        jSONObject2.put(i.CDN_REQUEST_TYPE, (Object) "miniAppPopRequest");
        this.g = System.currentTimeMillis();
        this.c = true;
        this.b.triggerEvent("OnlyRequest", jSONObject2, new lje(f()));
    }

    private boolean a(lrq lrqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f35b2751", new Object[]{this, lrqVar})).booleanValue();
        }
        if (lrqVar == null) {
            ldf.d("MiniAppRequestFeature", "未请求过，允许发起请求");
            return true;
        } else if (!lrqVar.c()) {
            ldf.d("MiniAppRequestFeature", "上一次请求失败，允许发起请求");
            return true;
        } else {
            boolean z = SystemClock.uptimeMillis() - lrqVar.a() > d();
            ldf.d("MiniAppRequestFeature", "请求是否过期 isRequestExpired ： " + z);
            return z;
        }
    }

    private long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        JSONObject a2 = lrp.a(this.f30866a.b());
        long j = 1000;
        if (a2 == null || !a2.containsKey("miniAppRequestInterval")) {
            return 1000L;
        }
        try {
            j = a2.getLongValue("miniAppRequestInterval");
            ldf.d("MiniAppRequestFeature", "parseValidTime : " + j);
            return j;
        } catch (Throwable th) {
            ldf.a("MiniAppRequestFeature", "parseValidTime error", th);
            return j;
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("miniAppBizParam");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        ldf.d("MiniAppRequestFeature", "miniAppBizParam : " + string);
        HashMap hashMap = new HashMap(2);
        hashMap.put("miniAppBizParam", string);
        return hashMap;
    }

    private IContainerDataService.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("39a36f80", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lro.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (!lro.a(lro.this, lliVar)) {
                } else {
                    lro.a(lro.this, false);
                    lro.a(lro.this, new lrq(lro.a(lro.this, iContainerDataModel), true, null));
                    lro lroVar = lro.this;
                    lro.b(lroVar, lro.a(lroVar));
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                } else if (!lro.a(lro.this, lliVar)) {
                } else {
                    lro.a(lro.this, false);
                    lro.a(lro.this, new lrq(null, false, str2));
                    lro lroVar = lro.this;
                    lro.b(lroVar, lro.a(lroVar));
                }
            }
        };
    }

    private boolean a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f302f753", new Object[]{this, lliVar})).booleanValue();
        }
        if (lliVar != null) {
            return f().equals(lliVar.a());
        }
        return false;
    }

    private JSONObject a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> delta;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42e64ef3", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel != null && (delta = iContainerDataModel.getDelta()) != null) {
            return JSON.parseObject(JSON.toJSONString(delta));
        }
        return null;
    }

    private void b(lrq lrqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1de2dce", new Object[]{this, lrqVar});
            return;
        }
        String c = c(lrqVar);
        HashMap hashMap = null;
        if (TextUtils.isEmpty(c)) {
            hashMap = new HashMap(2);
            hashMap.put("data", lrqVar.b());
        }
        for (IJsBridgeService.a.InterfaceC0670a interfaceC0670a : this.e) {
            if (hashMap != null) {
                interfaceC0670a.a(hashMap);
            } else {
                interfaceC0670a.a(c);
            }
        }
        this.e.clear();
    }

    private String c(lrq lrqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71ec0831", new Object[]{this, lrqVar});
        }
        if (!lrqVar.c()) {
            return "请求失败，message ： " + lrqVar.d();
        } else if (!ObjectUtils.a(lrqVar.b())) {
            return null;
        } else {
            return "请求成功，但是服务端未返回delta数据";
        }
    }
}
