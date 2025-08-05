package com.loc;

import android.content.Context;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ax extends r {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f7673a = null;
    public Context b = null;

    @Override // com.loc.bt
    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put(HttpConstant.USER_AGENT, "AMAP SDK Android core 4.3.3");
        hashMap.put("X-INFO", n.a(this.b));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.3", "core"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.loc.bt
    public final String b() {
        return q.a().b() ? "https://restsdk.amap.com/sdk/compliance/params" : "http://restsdk.amap.com/sdk/compliance/params";
    }

    @Override // com.loc.bt
    public final String c_() {
        return "core";
    }

    @Override // com.loc.bt
    public final byte[] d() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f7673a != null) {
                Iterator<String> keys = this.f7673a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String obj = this.f7673a.get(next).toString();
                    stringBuffer.append(next + "=" + URLEncoder.encode(obj, "utf-8") + "&");
                }
            }
            stringBuffer.append("output=json");
            String f = l.f(this.b);
            stringBuffer.append("&key=".concat(String.valueOf(f)));
            String a2 = n.a();
            stringBuffer.append("&ts=".concat(String.valueOf(a2)));
            stringBuffer.append("&scode=" + n.a(this.b, a2, "key=".concat(String.valueOf(f))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        return null;
    }
}
