package tb;

import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.a;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes7.dex */
public class xku extends lhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f34359a;
    private final String b;

    public xku(ljs ljsVar) {
        super(ljsVar);
        this.b = "tmghomeservice";
        this.f34359a = ljsVar;
    }

    @Override // tb.lhc, com.taobao.infoflow.protocol.engine.invoke.biz.l
    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f34359a.a(IContainerDataService.class);
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
        if (!b.b() && e() && currentPageParams.get("ovs-spm-cnt") != null) {
            currentPageParams.put("spm-cnt", currentPageParams.get("ovs-spm-cnt"));
            currentPageParams.put("force-spm-cnt", currentPageParams.get("ovs-spm-cnt"));
        }
        return (Map) JSONObject.parseObject(currentPageParams.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.xku.1
        }, new Feature[0]);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Boolean.valueOf(OrangeConfig.getInstance().getConfig("tmghomeservice", "enableHomeSpmCnt", "true")).booleanValue();
    }
}
