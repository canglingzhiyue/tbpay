package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.infoflow.protocol.model.datamodel.response.a;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class lgi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_PAGE = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30564a;
    private String b;

    static {
        kge.a(-565012253);
    }

    public static /* synthetic */ ljs a(lgi lgiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("c498d167", new Object[]{lgiVar}) : lgiVar.f30564a;
    }

    public lgi(ljs ljsVar) {
        this.f30564a = ljsVar;
    }

    public void a(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cc4e3e", new Object[]{this, baseSubItemModel});
        } else if (baseSubItemModel == null) {
            ldf.d("TapGlobalSceneUtUtils", "beginScene tapItem is null");
        } else {
            BaseUtModel mo1100getClickParam = baseSubItemModel.mo1100getClickParam();
            if (mo1100getClickParam == null) {
                ldf.d("TapGlobalSceneUtUtils", "beginScene clickParams is null");
                return;
            }
            String page = mo1100getClickParam.getPage();
            if (!"Page_Home".equals(page)) {
                ldf.d("TapGlobalSceneUtUtils", "beginScene scene : " + page);
                return;
            }
            Map<String, String> a2 = a(this.f30564a, mo1100getClickParam);
            if (a2 != null) {
                ldl.a(page, null, null, a2);
                return;
            }
            ldf.d("TapGlobalSceneUtUtils", "beginScene properties : " + page);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ljd.a().d(new Runnable() { // from class: tb.lgi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ldl.b(lgi.a(lgi.this).a().c());
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String a2 = a(this.f30564a);
        if (a2 == null) {
            return;
        }
        this.b = a2;
    }

    private Map<String, String> a(ljs ljsVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1fd87ac2", new Object[]{this, ljsVar, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("multiPageUtParams");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            ldf.d("TapGlobalSceneUtUtils", "parseMultiPageUtParams multiPageUtParams is null");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            if (next.getValue() != null) {
                str = next.getValue().toString();
            }
            hashMap.put(key, str);
        }
        String str2 = this.b;
        if (str2 == null) {
            str2 = str;
        }
        hashMap.put(ood.HOME_BUCKETS, str2);
        return hashMap;
    }

    private String a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5596c6fd", new Object[]{this, ljsVar});
        }
        if (ljsVar == null) {
            ldf.d("TapGlobalSceneUtUtils", "getHomeBuckets infoFlowContext is null");
            return null;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("TapGlobalSceneUtUtils", "getHomeBuckets containerDataService is null");
            return null;
        }
        a pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            ldf.d("TapGlobalSceneUtUtils", "getHomeBuckets pageInfoDataModel is null");
            return null;
        }
        JSONObject currentPageParams = pageInfo.getCurrentPageParams();
        if (currentPageParams == null) {
            ldf.d("TapGlobalSceneUtUtils", "getHomeBuckets pageParams is null");
            return null;
        }
        return currentPageParams.getString(ood.HOME_BUCKETS);
    }
}
