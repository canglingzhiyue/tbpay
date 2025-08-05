package mtopsdk.mtop.protocol.builder.impl;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;
import mtopsdk.xstate.a;
import mtopsdk.xstate.network.NetworkStateReceiver;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class InnerProtocolParamBuilderImpl implements ProtocolParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerProtocolParamBuilderImpl";
    private MtopConfig mtopConfig = null;

    static {
        kge.a(-1817559314);
        kge.a(-648902425);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05fb  */
    @Override // mtopsdk.mtop.protocol.builder.ProtocolParamBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.String> buildParams(mtopsdk.framework.domain.a r29) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.protocol.builder.impl.InnerProtocolParamBuilderImpl.buildParams(mtopsdk.framework.domain.a):java.util.Map");
    }

    private void setOldTopProtocolParams(Mtop mtop, MtopNetworkProp mtopNetworkProp, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323ed44f", new Object[]{this, mtop, mtopNetworkProp, hashMap});
        } else if (mtopNetworkProp.apiType == null) {
        } else {
            if (mtopNetworkProp.isInnerOpen) {
                mtopNetworkProp.accessToken = a.a(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp.openAppKey), "accessToken");
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

    private void buildExtParams(mtopsdk.framework.domain.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbaf8eba", new Object[]{this, aVar, map});
            return;
        }
        MtopNetworkProp mtopNetworkProp = aVar.d;
        map.put("netType", a.a("netType"));
        map.put("nq", a.a("nq"));
        if (map.get("umt") == null) {
            map.put("umt", a.a(aVar.f25000a.getInstanceId(), "umt"));
        }
        String str = this.mtopConfig.appVersion;
        if (StringUtils.isNotBlank(str)) {
            map.put(HttpHeaderConstant.X_APP_VER, str);
        }
        String str2 = this.mtopConfig.xOrangeQ;
        if (StringUtils.isNotBlank(str2)) {
            map.put(HttpHeaderConstant.X_ORANGE_Q, str2);
        }
        map.put(HttpHeaderConstant.X_APP_CONF_V, String.valueOf(this.mtopConfig.xAppConfigVersion));
        String a2 = a.a(MspGlobalDefine.UA);
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
                        TBSdkLog.w(TAG, "set wifi ssid error.", e);
                    }
                }
            }
            if ((mtopNetworkProp.netParam & 2) != 0) {
                String str4 = NetworkStateReceiver.b;
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.BSSID, str4);
                    } catch (JSONException e2) {
                        TBSdkLog.w(TAG, "set wifi bssid error.", e2);
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
        String str5 = this.mtopConfig.mtopGlobalABTestParams.get(mtopNetworkProp.pageUrl);
        if (str5 == null) {
            return;
        }
        map.put(HttpHeaderConstant.X_PAGE_MAB, str5);
    }
}
