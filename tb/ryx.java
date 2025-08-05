package tb;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.security.util.a;
import mtopsdk.security.util.b;
import tb.ryv;

/* loaded from: classes.dex */
public class ryx extends ryu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c;
    public String d;

    static {
        kge.a(1687274618);
    }

    public static /* synthetic */ Object ipc$super(ryx ryxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ryv
    public String a(ryv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4258ed4", new Object[]{this, aVar}) : this.c;
    }

    @Override // tb.ryv
    public String a(HashMap<String, String> hashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78ece6a1", new Object[]{this, hashMap, str, str2});
        }
        String c = c();
        if (hashMap == null) {
            TBSdkLog.e("mtopsdk.LocalInnerSignImpl", c + " [getMtopApiSign] params is null.appKey=" + str);
            return null;
        } else if (str == null) {
            hashMap.put("SG_ERROR_CODE", "AppKey is null");
            TBSdkLog.e("mtopsdk.LocalInnerSignImpl", c + " [getMtopApiSign] AppKey is null.");
            return null;
        } else {
            try {
                return a(a((Map<String, String>) hashMap, str), str);
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.LocalInnerSignImpl", c + " [getMtopApiSign] ISecureSignatureComponent signRequest error", e);
                return null;
            }
        }
    }

    private String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        String str2 = map.get(HttpHeaderConstant.KEY_EXTDATA);
        String str3 = map.get(HttpHeaderConstant.X_FEATURES);
        StringBuilder sb = new StringBuilder(64);
        sb.append(b.a(map.get("utdid")));
        sb.append("&");
        sb.append(b.a(map.get("uid")));
        sb.append("&");
        sb.append(b.a(map.get("reqbiz-ext")));
        sb.append("&");
        sb.append(str);
        sb.append("&");
        sb.append(b.b(map.get("data")));
        sb.append("&");
        sb.append(map.get("t"));
        sb.append("&");
        sb.append(map.get("api"));
        sb.append("&");
        sb.append(map.get("v"));
        sb.append("&");
        sb.append(b.a(map.get("sid")));
        sb.append("&");
        sb.append(b.a(map.get("ttid")));
        sb.append("&");
        sb.append(b.a(map.get("deviceId")));
        sb.append("&");
        sb.append(b.a(map.get(DispatchConstants.LATITUDE)));
        sb.append("&");
        sb.append(b.a(map.get(DispatchConstants.LONGTITUDE)));
        sb.append("&");
        if (StringUtils.isNotBlank(str2)) {
            sb.append(str2);
            sb.append("&");
        }
        sb.append(str3);
        return sb.toString();
    }

    @Override // tb.ryv
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String c = c();
        if (StringUtils.isBlank(str)) {
            TBSdkLog.e("mtopsdk.LocalInnerSignImpl", c + " [getCommonHmacSha1Sign] baseStr is null.appKey=" + str2);
            return null;
        } else if (str2 == null || !str2.equals(this.c)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(c);
            sb.append(" [getCommonHmacSha1Sign] request appKey mismatches global appKey.requestAppKey=");
            sb.append(str2);
            sb.append(",globalAppKey=");
            sb.append(this.c);
            TBSdkLog.e("mtopsdk.LocalInnerSignImpl", sb.toString());
            return null;
        } else {
            return a.a(str, this.d);
        }
    }
}
