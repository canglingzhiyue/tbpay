package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class lry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30880a;
    private long b;
    private int c = Integer.MAX_VALUE;

    static {
        kge.a(-185303035);
    }

    public static /* synthetic */ long a(lry lryVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("787af513", new Object[]{lryVar, new Long(j)})).longValue();
        }
        lryVar.b = j;
        return j;
    }

    public static /* synthetic */ void a(lry lryVar, a aVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f41f12", new Object[]{lryVar, aVar, iContainerDataModel});
        } else {
            lryVar.a(aVar, iContainerDataModel);
        }
    }

    public lry(ljs ljsVar, a aVar) {
        this.f30880a = ljsVar;
        a(aVar);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        JSONObject a2 = xjl.a().a(this.f30880a.a().a(), "aiRefresh", d());
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30880a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingTrigger", "containerDataService == null");
            return;
        }
        iContainerDataService.triggerEvent("OnlyRequest", a2, new lje("smartLoading"));
        lql.b();
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78afaac", new Object[]{this, aVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30880a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.addRequestListener(b(aVar));
    }

    private IContainerDataService.b b(final a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("7b7c0801", new Object[]{this, aVar}) : new IContainerDataService.b() { // from class: tb.lry.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                } else if (!"aiRefresh".equals(str)) {
                } else {
                    lry.a(lry.this, System.currentTimeMillis());
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (lliVar == null || !lliVar.a().equals("smartLoading")) {
                    ldf.d("SmartLoadingTrigger", "traceInfo : " + lliVar);
                } else if (iContainerDataModel == null) {
                    ldf.d("SmartLoadingTrigger", "AiRefresh request containerDataModel is null");
                } else {
                    lry.a(lry.this, aVar, iContainerDataModel);
                }
            }
        };
    }

    private void a(a aVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc86f0f", new Object[]{this, aVar, iContainerDataModel});
            return;
        }
        List<?> sections = iContainerDataModel.getBase().getSections();
        this.c = sections.size();
        ldf.d("SmartLoadingTrigger", "请求回来处理，请求回来的个数是：" + this.c);
        String a2 = this.f30880a.a().a();
        aVar.a(a2, (List<BaseSectionModel<?>>) sections);
        aVar.b(a2, sections.subList(0, Math.min(sections.size(), 100)));
        aVar.b();
    }

    private Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put("aiRequestType", "smartLoading");
        hashMap.put("enableAISolution", true);
        hashMap.put("pagenum", Integer.valueOf(f()));
        hashMap.put("aiRequestConfig", e());
        return hashMap;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("realtime-item", (Object) "##");
        return jSONObject.toString();
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        IContainerInnerDataModel<?> g = g();
        if (g == null) {
            ldf.d("SmartLoadingTrigger", "getPageNumber base is null");
            return 0;
        }
        IPageDataModel mo1280getPageParams = g.mo1280getPageParams();
        if (mo1280getPageParams == null) {
            ldf.d("SmartLoadingTrigger", "getPageNumber pageDataModel is null");
            return 0;
        }
        return mo1280getPageParams.getPageNum();
    }

    private IContainerInnerDataModel<?> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerInnerDataModel) ipChange.ipc$dispatch("3d2f3635", new Object[]{this});
        }
        IContainerDataModel<?> h = h();
        if (h == null) {
            ldf.d("SmartLoadingTrigger", "getBase containerDataModel is null");
            return null;
        }
        return h.getBase();
    }

    private IContainerDataModel<?> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("b6c1721a", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30880a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingTrigger", "containerDataService == null");
            return null;
        }
        return iContainerDataService.getContainerData();
    }
}
