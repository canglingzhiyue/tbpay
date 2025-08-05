package tb;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;
import mtopsdk.xstate.network.NetworkStateReceiver;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class scf implements ProtocolParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopConfig f33468a = null;

    static {
        kge.a(-1003128122);
        kge.a(-648902425);
    }

    @Override // mtopsdk.mtop.protocol.builder.ProtocolParamBuilder
    public Map<String, String> buildParams(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bad7d67b", new Object[]{this, aVar});
        }
        aVar.g.buildParamsStartTime = aVar.g.currentTimeMillis();
        Mtop mtop = aVar.f25000a;
        this.f33468a = mtop.getMtopConfig();
        MtopRequest mtopRequest = aVar.b;
        MtopNetworkProp mtopNetworkProp = aVar.d;
        HashMap<String, String> hashMap = new HashMap<>(64);
        hashMap.put("utdid", mtop.getUtdid());
        hashMap.put("uid", StringUtils.isNotBlank(mtopNetworkProp.reqUserId) ? mtopNetworkProp.reqUserId : mtop.getMultiAccountUserId(mtopNetworkProp.userInfo));
        if (StringUtils.isNotBlank(mtopNetworkProp.reqBizExt)) {
            hashMap.put("reqbiz-ext", mtopNetworkProp.reqBizExt);
        }
        if (StringUtils.isBlank(mtopNetworkProp.reqAppKey)) {
            mtopNetworkProp.reqAppKey = this.f33468a.appKey;
            mtopNetworkProp.authCode = this.f33468a.authCode;
        }
        String str = mtopNetworkProp.reqAppKey;
        if (StringUtils.isNotBlank(this.f33468a.routerId)) {
            hashMap.put("routerId", this.f33468a.routerId);
        }
        if (StringUtils.isNotBlank(mtopNetworkProp.routerId)) {
            hashMap.put("routerId", mtopNetworkProp.routerId);
        }
        if (StringUtils.isNotBlank(this.f33468a.placeId)) {
            hashMap.put("placeId", this.f33468a.placeId);
        }
        if (StringUtils.isNotBlank(mtopNetworkProp.placeId)) {
            hashMap.put("placeId", mtopNetworkProp.placeId);
        }
        hashMap.put("appKey", str);
        String data = mtopRequest.getData();
        if (mtopNetworkProp.priorityFlag && mtopNetworkProp.priorityData != null) {
            try {
                JSONObject jSONObject = new JSONObject(data);
                jSONObject.putOpt(HttpHeaderConstant.X_PRIORITY_DATA, JSON.toJSONString(mtopNetworkProp.priorityData));
                data = jSONObject.toString();
            } catch (Exception e) {
                String str2 = aVar.h;
                TBSdkLog.e("qmtopsdk.InnerProtocolParamBuilderImpl", str2, "set api priority data error, priorityData:" + mtopNetworkProp.priorityData, e);
            }
        }
        hashMap.put("data", data);
        hashMap.put("t", String.valueOf(SDKUtils.getCorrectionTime()));
        hashMap.put("api", mtopRequest.getApiName().toLowerCase(Locale.US));
        hashMap.put("v", mtopRequest.getVersion().toLowerCase(Locale.US));
        hashMap.put("sid", mtop.getMultiAccountSid(mtopNetworkProp.userInfo));
        hashMap.put("ttid", mtopNetworkProp.ttid);
        hashMap.put("deviceId", mtop.getDeviceId());
        String a2 = mtopsdk.xstate.a.a(DispatchConstants.LATITUDE);
        if (StringUtils.isNotBlank(a2)) {
            String a3 = mtopsdk.xstate.a.a(DispatchConstants.LONGTITUDE);
            if (StringUtils.isNotBlank(a3)) {
                hashMap.put(DispatchConstants.LATITUDE, a2);
                hashMap.put(DispatchConstants.LONGTITUDE, a3);
            }
        }
        long mtopTotalFeatures = MtopFeatureManager.getMtopTotalFeatures(mtop);
        if (mtopNetworkProp.reqSource == 1) {
            mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(11);
        }
        if (mtopNetworkProp.priorityFlag) {
            mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(12);
        }
        hashMap.put(HttpHeaderConstant.X_FEATURES, String.valueOf(mtopTotalFeatures));
        a(mtop, mtopNetworkProp, hashMap);
        if (!TextUtils.isEmpty(mtopNetworkProp.openBiz)) {
            hashMap.put("open-biz", mtopNetworkProp.openBiz);
            if (!TextUtils.isEmpty(mtopNetworkProp.miniAppKey)) {
                hashMap.put("mini-appkey", mtopNetworkProp.miniAppKey);
            }
            if (!TextUtils.isEmpty(mtopNetworkProp.reqAppKey)) {
                hashMap.put("req-appkey", mtopNetworkProp.requestSourceAppKey);
            }
            if (!TextUtils.isEmpty(mtopNetworkProp.openBizData)) {
                hashMap.put("open-biz-data", mtopNetworkProp.openBizData);
            }
            mtopNetworkProp.accessToken = mtopsdk.xstate.a.a(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp.miniAppKey), "accessToken");
            if (!TextUtils.isEmpty(mtopNetworkProp.accessToken)) {
                hashMap.put("accessToken", mtopNetworkProp.accessToken);
            }
        }
        hashMap.put("pv", DispatchConstants.UPGRADE_VER_CODE_PROTOCOL);
        hashMap.put("sign", UUID.randomUUID().toString());
        a(aVar, hashMap);
        aVar.g.buildParamsEndTime = aVar.g.currentTimeMillis();
        aVar.g.buildParamsTime = aVar.g.buildParamsEndTime - aVar.g.buildParamsStartTime;
        return hashMap;
    }

    private void a(Mtop mtop, MtopNetworkProp mtopNetworkProp, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f82ee22", new Object[]{this, mtop, mtopNetworkProp, hashMap});
        } else if (mtopNetworkProp.apiType == null) {
        } else {
            if (mtopNetworkProp.isInnerOpen) {
                mtopNetworkProp.accessToken = mtopsdk.xstate.a.a(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp.openAppKey), "accessToken");
            }
            hashMap.put(HttpHeaderConstant.KEY_EXTTYPE, mtopNetworkProp.apiType.getApiType());
            StringBuilder sb = new StringBuilder(64);
            if (StringUtils.isNotBlank(mtopNetworkProp.openAppKey)) {
                sb.append(HttpHeaderConstant.KEY_EXTDATA_OPENAPPKEY);
                sb.append("=");
                sb.append(mtopNetworkProp.openAppKey);
            }
            if (StringUtils.isNotBlank(mtopNetworkProp.accessToken)) {
                sb.append(";");
                sb.append(HttpHeaderConstant.KEY_EXTDATA_ACCESSTOKEN);
                sb.append("=");
                sb.append(mtopNetworkProp.accessToken);
            }
            hashMap.put(HttpHeaderConstant.KEY_EXTDATA, sb.toString());
        }
    }

    private void a(a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52652192", new Object[]{this, aVar, map});
            return;
        }
        MtopNetworkProp mtopNetworkProp = aVar.d;
        map.put("netType", mtopsdk.xstate.a.a("netType"));
        map.put("nq", mtopsdk.xstate.a.a("nq"));
        if (map.get("umt") == null) {
            map.put("umt", mtopsdk.xstate.a.a(aVar.f25000a.getInstanceId(), "umt"));
        }
        String str = this.f33468a.appVersion;
        if (StringUtils.isNotBlank(str)) {
            map.put(HttpHeaderConstant.X_APP_VER, str);
        }
        String str2 = this.f33468a.xOrangeQ;
        if (StringUtils.isNotBlank(str2)) {
            map.put(HttpHeaderConstant.X_ORANGE_Q, str2);
        }
        map.put(HttpHeaderConstant.X_APP_CONF_V, String.valueOf(this.f33468a.xAppConfigVersion));
        String a2 = mtopsdk.xstate.a.a(MspGlobalDefine.UA);
        if (a2 != null) {
            map.put("user-agent", a2);
        }
        map.put(HttpHeaderConstant.CLIENT_TRACE_ID, mtopNetworkProp.clientTraceId);
        if (SwitchConfig.getInstance().getEnableFalcoId()) {
            map.put("x-falco-id", mtopNetworkProp.falcoId);
        }
        map.put("f-refer", "mtop");
        if (mtopNetworkProp.netParam > 0) {
            JSONObject jSONObject = new JSONObject();
            if ((mtopNetworkProp.netParam & 1) != 0) {
                String str3 = NetworkStateReceiver.f25047a;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.SSID, str3);
                    } catch (JSONException e) {
                        TBSdkLog.w("qmtopsdk.InnerProtocolParamBuilderImpl", "set wifi ssid error.", e);
                    }
                }
            }
            if ((mtopNetworkProp.netParam & 2) != 0) {
                String str4 = NetworkStateReceiver.b;
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.BSSID, str4);
                    } catch (JSONException e2) {
                        TBSdkLog.w("qmtopsdk.InnerProtocolParamBuilderImpl", "set wifi bssid error.", e2);
                    }
                }
            }
            if (jSONObject.length() > 0) {
                map.put(HttpHeaderConstant.X_NETINFO, jSONObject.toString());
            }
        }
        if (mtopNetworkProp.pageName != null) {
            map.put(HttpHeaderConstant.X_PAGE_NAME, mtopNetworkProp.pageName);
        }
        if (mtopNetworkProp.pageUrl == null) {
            return;
        }
        map.put(HttpHeaderConstant.X_PAGE_URL, mtopNetworkProp.pageUrl);
        String str5 = this.f33468a.mtopGlobalABTestParams.get(mtopNetworkProp.pageUrl);
        if (str5 == null) {
            return;
        }
        map.put(HttpHeaderConstant.X_PAGE_MAB, str5);
    }
}
