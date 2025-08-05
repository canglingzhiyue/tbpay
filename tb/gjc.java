package tb;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.IOException;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* loaded from: classes5.dex */
public class gjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-370889122);
    }

    public static byte[] a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(Globals.getApplication());
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setFollowRedirects(true);
        requestImpl.setConnectTimeout(16000);
        requestImpl.setReadTimeout(JosStatusCodes.RTN_CODE_COMMON_ERROR);
        Response syncSend = degradableNetwork.syncSend(requestImpl, null);
        if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
            return syncSend.getBytedata();
        }
        return null;
    }

    public static MtopResponse a(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("fa24476f", new Object[]{skinConfig});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("skinCode", (Object) skinConfig.skinCode);
        jSONObject.put("version", (Object) Integer.valueOf(skinConfig.version));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.wireless.skin.skin.status");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        mtopRequest.setData(jSONObject.toJSONString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, SDKConfig.getInstance().getGlobalTtid());
        build.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        return build.syncRequest();
    }
}
