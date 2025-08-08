package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes7.dex */
public class ltn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30919a;
    private final ltm b;

    static {
        kge.a(380020690);
    }

    public ltn(ljs ljsVar) {
        this.f30919a = ljsVar;
        this.b = new ltm(ljsVar);
    }

    public AwesomeGetContainerParams a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("33639ade", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        if (!a((IContainerDataModel) awesomeGetContainerData, jSONObject)) {
            ldf.d("DosaRequestParamsGenerator", "!isAllowRequest");
            return null;
        }
        AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
        awesomeGetContainerParams.setRequestType(a(jSONObject));
        awesomeGetContainerParams.setBaseCacheTime(c(awesomeGetContainerData, jSONObject));
        awesomeGetContainerParams.setDeltaCacheTime(d(awesomeGetContainerData, jSONObject));
        awesomeGetContainerParams.setClientReqTime(d(jSONObject));
        awesomeGetContainerParams.setClientReqOffsetTime(e(jSONObject));
        awesomeGetContainerParams.setPageParams(b(awesomeGetContainerData, jSONObject));
        awesomeGetContainerParams.setDeltaSections(a(awesomeGetContainerData));
        awesomeGetContainerParams.setPassParams(lxw.a(this.f30919a.a().a()));
        awesomeGetContainerParams.setBizParams(this.b.a(awesomeGetContainerData, jSONObject));
        return awesomeGetContainerParams;
    }

    private boolean a(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fb1181", new Object[]{this, iContainerDataModel, jSONObject})).booleanValue();
        }
        boolean b = b(jSONObject);
        if (!c(jSONObject) && !b) {
            return b(iContainerDataModel, jSONObject);
        }
        return true;
    }

    private boolean b(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c742382", new Object[]{this, iContainerDataModel, jSONObject})).booleanValue();
        }
        return (iContainerDataModel.getBase() != null && iContainerDataModel.getBase().isAbandoned()) || (jSONObject.getBooleanValue("checkDeltaExpire") && (iContainerDataModel.getDelta() == null || (iContainerDataModel.getDelta() != null && iContainerDataModel.getDelta().isAbandoned())));
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : jSONObject.getString(i.CDN_REQUEST_TYPE);
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : jSONObject.getBooleanValue("isNextPage");
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue() : jSONObject.getBooleanValue("forceRequest");
    }

    private long c(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfed3573", new Object[]{this, iContainerDataModel, jSONObject})).longValue();
        }
        if (c(jSONObject) || iContainerDataModel.getBase() == null) {
            return 0L;
        }
        return a(iContainerDataModel.getBase().getCacheTime());
    }

    private long d(IContainerDataModel iContainerDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93664774", new Object[]{this, iContainerDataModel, jSONObject})).longValue();
        }
        if (c(jSONObject) || iContainerDataModel.getDelta() == null) {
            return 0L;
        }
        return a(iContainerDataModel.getDelta().getCacheTime());
    }

    private long d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("265ed159", new Object[]{this, jSONObject})).longValue();
        }
        if (!c(jSONObject)) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    private long e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87b16df8", new Object[]{this, jSONObject})).longValue();
        }
        if (!c(jSONObject)) {
            return SDKUtils.getTimeOffset();
        }
        return 0L;
    }

    private AwesomeGetPageData b(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("6bb2bf7", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        if (jSONObject.getBooleanValue("isCurrentPage")) {
            return awesomeGetContainerData.getBase().mo1280getPageParams();
        }
        if (!b(jSONObject)) {
            return new AwesomeGetPageData();
        }
        return a(awesomeGetContainerData.getBase().mo1280getPageParams());
    }

    private AwesomeGetPageData a(IPageDataModel iPageDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("c70bed15", new Object[]{this, iPageDataModel});
        }
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.setPageNum(iPageDataModel.getPageNum() + 1);
        awesomeGetPageData.setIsLastPage(iPageDataModel.isLastPage() ? "y" : "n");
        awesomeGetPageData.setRequestInAdvance(iPageDataModel.getRequestInAdvance());
        awesomeGetPageData.setItemLastCount(iPageDataModel.getItemLastCount());
        return awesomeGetPageData;
    }

    private List<String> a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2db82214", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> delta = iContainerDataModel.getDelta();
        ArrayList arrayList = null;
        if (delta == null) {
            return null;
        }
        List<?> sections = delta.getSections();
        if (sections != null && sections.size() > 0) {
            arrayList = new ArrayList(sections.size());
            Iterator<?> it = sections.iterator();
            while (it.hasNext()) {
                String string = ((JSONObject) it.next()).getString("sectionBizCode");
                if (!StringUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    private long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue() : j + (SDKUtils.getTimeOffset() * 1000);
    }
}
