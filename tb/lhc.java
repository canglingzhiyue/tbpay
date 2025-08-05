package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.model.datamodel.response.a;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.Map;

/* loaded from: classes.dex */
public class lhc implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30597a;

    static {
        kge.a(302530047);
        kge.a(-1289034225);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.l
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        return null;
    }

    public lhc(ljs ljsVar) {
        this.f30597a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.l
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30597a.a().c();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.l
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30597a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return null;
        }
        a pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            ldf.d("UtInvokerImpl", "getUpdatePageProperties pageInfo == null");
            return null;
        }
        JSONObject currentPageParams = pageInfo.getCurrentPageParams();
        if (currentPageParams == null) {
            ldf.d("UtInvokerImpl", "getUpdatePageProperties CurrentPageParams == null");
            return null;
        }
        return (Map) JSONObject.parseObject(currentPageParams.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.lhc.1
        }, new Feature[0]);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.l
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30597a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("UtInvokerImpl", "getUpdatePageUtParam dataService == null");
            return null;
        }
        a pageInfo = iContainerDataService.getPageInfo();
        if (pageInfo == null) {
            ldf.d("UtInvokerImpl", "getUpdatePageUtParam pageInfo == null");
            return null;
        }
        JSONObject currentUTParams = pageInfo.getCurrentUTParams();
        if (currentUTParams == null) {
            ldf.d("UtInvokerImpl", "getUpdatePageUtParam currentUTParams == null");
            return null;
        }
        return currentUTParams.toJSONString();
    }
}
