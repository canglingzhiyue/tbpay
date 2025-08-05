package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.MediaMixDetailReportRequest;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class sln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1843981886);
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
            return;
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null || !j.Z) {
            return;
        }
        String unExposeIds = ((IDataService) fluidContext.getService(IDataService.class)).getUnExposeIds();
        if (TextUtils.isEmpty(unExposeIds)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("recallContentIds", (Object) unExposeIds);
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        MediaMixDetailReportRequest mediaMixDetailReportRequest = new MediaMixDetailReportRequest();
        if (TextUtils.isEmpty(str)) {
            str = sessionParams.d;
        }
        mediaMixDetailReportRequest.contentId = str;
        mediaMixDetailReportRequest.source = sessionParams.c;
        mediaMixDetailReportRequest.type = sessionParams.b;
        mediaMixDetailReportRequest.eventType = "1001";
        mediaMixDetailReportRequest.extendParameters = obz.a(jSONObject);
        FluidSDK.getMTopAdapter().send(mediaMixDetailReportRequest, new IMTopAdapter.b<CommonResponseOutDo>() { // from class: tb.sln.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                }
            }

            @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
            public /* bridge */ /* synthetic */ void a(MtopResponse mtopResponse, CommonResponseOutDo commonResponseOutDo) {
            }
        });
        ljq.e(fluidContext);
    }
}
