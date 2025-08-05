package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.business.data.FestivalInfoData;
import com.taobao.android.festival.business.data.FestivalInfoResponse;
import com.taobao.android.festival.business.data.FestivalRequest;
import com.taobao.android.festival.business.data.FestivalResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* loaded from: classes5.dex */
public class giz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1722895395);
    }

    public static FestivalResponse a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalResponse) ipChange.ipc$dispatch("a9248a88", new Object[]{context, str});
        }
        FestivalRequest festivalRequest = new FestivalRequest();
        festivalRequest.version = str;
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) festivalRequest);
        build.mo1340setBizId(51);
        build.mo1342showLoginUI(false);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest != null && syncRequest.isApiSuccess()) {
            return (FestivalResponse) JSONObject.parseObject(syncRequest.getBytedata(), FestivalResponse.class, new Feature[0]);
        }
        return null;
    }

    public static FestivalInfoData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalInfoData) ipChange.ipc$dispatch("ba38cf33", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.wireless.skin.atmosphere.info");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject.toJSONString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, SDKConfig.getInstance().getGlobalTtid());
        build.mo1342showLoginUI(false);
        build.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest.isApiSuccess() && syncRequest.getBytedata() != null) {
            return ((FestivalInfoResponse) JSONObject.parseObject(syncRequest.getBytedata(), FestivalInfoResponse.class, new Feature[0])).mo2429getData();
        }
        return null;
    }
}
