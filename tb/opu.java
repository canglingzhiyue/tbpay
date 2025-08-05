package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Map;
import tb.osz;

/* loaded from: classes8.dex */
public class opu implements osz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(455955249);
        kge.a(-358581287);
    }

    @Override // tb.osz.a
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        }
    }

    @Override // tb.osz.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.osz.a
    public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            return;
        }
        AwesomeGetContainerInnerData a2 = a(str, awesomeGetData);
        if (a2 == null) {
            lap.a("buyAfterRecommend", "AfterBuyPersistenceData", "base == null");
        } else {
            a(str, a2);
        }
    }

    private void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0373d58", new Object[]{this, str, awesomeGetContainerInnerData});
            return;
        }
        JSONObject ext = awesomeGetContainerInnerData.getExt();
        if (ext == null) {
            lap.a("buyAfterRecommend", "AfterBuyPersistenceData", "ext == null");
            return;
        }
        JSONObject jSONObject = ext.getJSONObject(ops.OPTIMIZATION_CONFIG);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        opt.a(str, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    private AwesomeGetContainerInnerData a(String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("b40b4a7", new Object[]{this, str, awesomeGetData});
        }
        if (str == null) {
            lap.a("buyAfterRecommend", "AfterBuyPersistenceData", "containerId == null");
            return null;
        }
        Map<String, AwesomeGetContainerData> containers = awesomeGetData.getContainers();
        if (containers == null || containers.isEmpty()) {
            lap.a("buyAfterRecommend", "AfterBuyPersistenceData", "containerDataMap == null");
            return null;
        }
        AwesomeGetContainerData awesomeGetContainerData = containers.get(str);
        if (awesomeGetContainerData == null) {
            lap.a("buyAfterRecommend", "AfterBuyPersistenceData", "awesomeGetContainerData == null");
            return null;
        }
        return awesomeGetContainerData.getBase();
    }
}
