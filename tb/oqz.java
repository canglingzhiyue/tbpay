package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.infoflow.commonsubservice.dataservice.a;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.List;

/* loaded from: classes.dex */
public class oqz extends tcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f32316a;

    static {
        kge.a(472726164);
    }

    public static /* synthetic */ Object ipc$super(oqz oqzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public oqz(String str) {
        this.f32316a = str;
    }

    @Override // tb.oqa
    public AwesomeGetContainerParams a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("ba4a9d42", new Object[]{this, opeVar, jSONObject});
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return null;
        }
        return a2.getRequestParams(opeVar, jSONObject);
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return;
        }
        a2.notifyRequestStart(jSONObject);
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca449304", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return;
        }
        a2.notifyRequestSuccess(jSONObject, awesomeGetContainerData);
    }

    @Override // tb.oqa
    public void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
            return;
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return;
        }
        a2.notifyRequestFailure(jSONObject, str, str2);
    }

    @Override // tb.oqa
    public void c(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb90cefa", new Object[]{this, opeVar, jSONObject});
            return;
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return;
        }
        a2.customDataProcess(opeVar, jSONObject);
    }

    @Override // tb.oqa
    public void d(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5085c99", new Object[]{this, opeVar, jSONObject});
            return;
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return;
        }
        a2.processUiRefresh(opeVar, jSONObject);
    }

    @Override // tb.oqa
    public boolean a(List<SectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f324", new Object[]{this, list, bVar})).booleanValue();
        }
        HomeInfoFlowDataService a2 = a(this.f32316a);
        if (a2 == null) {
            return false;
        }
        a2.downloadTemplate(list, bVar);
        return true;
    }

    private HomeInfoFlowDataService a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeInfoFlowDataService) ipChange.ipc$dispatch("40701be3", new Object[]{this, str}) : a.a(str);
    }
}
