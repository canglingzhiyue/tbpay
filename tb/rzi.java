package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.ssrcore.c;
import mtopsdk.ssrcore.d;
import mtopsdk.xstate.a;

/* loaded from: classes.dex */
public class rzi implements rzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopConfig f33434a = null;

    @Override // tb.rzm
    public Map<String, String> a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8e831766", new Object[]{this, cVar});
        }
        cVar.d.j = cVar.d.a();
        Mtop mtop = cVar.j;
        this.f33434a = mtop.getMtopConfig();
        ryv ryvVar = this.f33434a.sign;
        if (ryvVar == null) {
            TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", cVar.b, "ISign of mtopConfig in mtopInstance is null");
            return null;
        }
        mtj mtjVar = cVar.g;
        MtopNetworkProp mtopNetworkProp = cVar.f25036a;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("utdid", mtop.getUtdid());
        hashMap.put("uid", mtop.getMultiAccountUserId(mtopNetworkProp.userInfo));
        if (StringUtils.isBlank(mtopNetworkProp.reqAppKey)) {
            mtopNetworkProp.reqAppKey = this.f33434a.appKey;
            mtopNetworkProp.authCode = this.f33434a.authCode;
        }
        String str = mtopNetworkProp.reqAppKey;
        String str2 = mtopNetworkProp.authCode;
        hashMap.put("appKey", str);
        String valueOf = String.valueOf(SDKUtils.getCorrectionTime());
        hashMap.put("t", valueOf);
        hashMap.put("sid", mtop.getMultiAccountSid(mtopNetworkProp.userInfo));
        hashMap.put("ttid", mtopNetworkProp.ttid);
        String a2 = a.a(MspGlobalDefine.UA);
        if (a2 != null) {
            hashMap.put("user-agent", a2);
        }
        if (SwitchConfig.getInstance().getEnableFalcoId()) {
            hashMap.put("x-falco-id", mtopNetworkProp.falcoId);
        }
        String a3 = a.a(DispatchConstants.LATITUDE);
        if (StringUtils.isNotBlank(a3)) {
            String a4 = a.a(DispatchConstants.LONGTITUDE);
            if (StringUtils.isNotBlank(a4)) {
                hashMap.put(DispatchConstants.LATITUDE, a3);
                hashMap.put(DispatchConstants.LONGTITUDE, a4);
            }
        }
        d.g(cVar.d);
        HashMap<String, String> hashMap2 = new HashMap<>();
        boolean z = mtopNetworkProp.wuaFlag >= 0 || mtopNetworkProp.wuaRetry;
        cVar.d.m = cVar.d.a();
        TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", cVar.b, "[buildParams]request sign start");
        Uri parse = Uri.parse(mtjVar.f31244a);
        if (parse != null) {
            hashMap.put("api", parse.getHost() + parse.getPath());
            hashMap.put("data", parse.getQuery());
        }
        hashMap.put("bizId", "3");
        hashMap.put("ssr-pv", "2.1");
        HashMap<String, String> a5 = ryvVar.a(hashMap, hashMap2, str, str2, z, "");
        hashMap.remove("bizId");
        hashMap.remove("data");
        cVar.d.P = parse.getHost();
        cVar.d.n = cVar.d.a();
        cVar.d.l = cVar.d.n - cVar.d.m;
        if (a5 != null) {
            String str3 = a5.get(HttpHeaderConstant.X_SIGN);
            if (StringUtils.isBlank(str3)) {
                String str4 = cVar.b;
                TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", str4, "[buildParams]get sign failed empty output , apiKey=" + cVar.g.f31244a + ",authCode=" + str2);
                return hashMap;
            }
            hashMap.put("sign", str3);
            if (z) {
                String str5 = a5.get("wua");
                hashMap.put("wua", str5);
                if (StringUtils.isBlank(str5)) {
                    String str6 = cVar.b;
                    TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", str6, "[buildParams]get wua failed empty output , apiKey=" + cVar.g.f31244a + ",authCode=" + str2);
                }
            }
            String str7 = a5.get(HttpHeaderConstant.X_MINI_WUA);
            hashMap.put(HttpHeaderConstant.X_MINI_WUA, str7);
            if (StringUtils.isBlank(str7)) {
                String str8 = cVar.b;
                TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", str8, "[buildParams]get mini wua failed empty output , apiKey=" + cVar.g.f31244a + ",authCode=" + str2);
            }
            String str9 = a5.get(HttpHeaderConstant.X_UMID_TOKEN);
            hashMap.put("umt", str9);
            if (StringUtils.isBlank(str9)) {
                String str10 = cVar.b;
                TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", str10, "[buildParams]get umt failed empty output , apiKey=" + cVar.g.f31244a + ",authCode=" + str2);
            }
            String str11 = a5.get("x-sgext");
            if (StringUtils.isNotBlank(str11)) {
                hashMap.put("x-sgext", str11);
            }
        }
        d.b(cVar.d);
        TBSdkLog.e("ssr.SsrProtocolParamBuilderImpl", cVar.b, "[buildParams]request sign finish.");
        String str12 = this.f33434a.appVersion;
        if (StringUtils.isNotBlank(str12)) {
            hashMap.put(HttpHeaderConstant.X_APP_VER, str12);
        }
        String a6 = mtopsdk.ssrcore.util.c.a(this.f33434a.context, parse.getHost());
        String b = mtopsdk.ssrcore.util.c.b(a6);
        String a7 = mtopsdk.ssrcore.util.c.a(a6);
        if (!TextUtils.isEmpty(a6) && !TextUtils.isEmpty(b)) {
            hashMap.put(HttpHeaderConstant.X_SERVICE_DOMAIN, a6);
            hashMap.put(HttpHeaderConstant.X_SERVICE_IPS, b);
            if (!TextUtils.isEmpty(a7)) {
                hashMap.put(HttpHeaderConstant.X_SERVICE_UNIT, a7);
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(HttpHeaderConstant.X_APPKEY, str);
            hashMap3.put(HttpHeaderConstant.X_APP_VER, str12);
            hashMap3.put(HttpHeaderConstant.X_UTDID, mtop.getUtdid());
            hashMap3.put(HttpHeaderConstant.X_T, valueOf);
            hashMap3.put(HttpHeaderConstant.X_SERVICE_DOMAIN, a6);
            hashMap3.put(HttpHeaderConstant.X_SERVICE_IPS, b);
            hashMap3.put(HttpHeaderConstant.X_SERVICE_UNIT, a7);
            hashMap.put(HttpHeaderConstant.X_SERVICE_TOKEN, mtopsdk.ssrcore.util.c.a(hashMap3));
        }
        String a8 = mtopsdk.ssrcore.util.a.a(SceneIdentifier.getDeviceLevel());
        hashMap.put(HttpHeaderConstant.X_DEVICE_LEVEL, a8);
        cVar.d.U = a6;
        cVar.d.V = b;
        cVar.d.W = a7;
        cVar.d.Y = a8;
        cVar.d.k = cVar.d.a();
        cVar.d.i = cVar.d.k - cVar.d.j;
        return hashMap;
    }
}
