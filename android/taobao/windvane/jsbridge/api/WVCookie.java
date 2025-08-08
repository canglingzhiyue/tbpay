package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVCookie extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVCookie";

    static {
        kge.a(-335567343);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("readCookies".equals(str)) {
            readCookies(wVCallBackContext, str2);
        } else if ("writeCookies".equals(str)) {
            writeCookies(wVCallBackContext, str2);
        } else if ("read".equals(str)) {
            read(wVCallBackContext, str2);
        } else if (!"write".equals(str)) {
            return false;
        } else {
            write(wVCallBackContext, str2);
        }
        return true;
    }

    public void readCookies(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899ffe7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        String str2 = null;
        if (!StringUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                m.e(TAG, "readCookies: param decode error, param=" + str);
            }
            try {
                str2 = new JSONObject(str).getString("url");
            } catch (JSONException unused2) {
                m.e(TAG, "readCookies: param parse to JSON error, param=" + str);
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        String a2 = android.taobao.windvane.a.a(str2);
        if (a2 == null) {
            m.d(TAG, "readCookies: cookieStr is null");
            a2 = "";
        }
        String replace = a2.replace("\"", "\\\\\"");
        replace.split(";");
        rVar.a("value", replace);
        wVCallBackContext.success(rVar);
    }

    public void writeCookies(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237004be", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                m.e(TAG, "writeCookies: param decode error, param=" + str);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string2 = jSONObject.getString("name");
                try {
                    str2 = URLEncoder.encode(jSONObject.getString("value"), "utf-8");
                } catch (UnsupportedEncodingException unused2) {
                    m.e(TAG, "writeCookies: URLEncoder.encode error: value=" + str2);
                }
                string = jSONObject.getString("domain");
                String optString = jSONObject.optString("expires");
                String optString2 = jSONObject.optString("path");
                String optString3 = jSONObject.optString("secure");
                sb.append(string2);
                sb.append("=");
                sb.append(str2);
                sb.append("; ");
                sb.append("Domain=");
                sb.append(string);
                if (!StringUtils.isEmpty(optString2)) {
                    sb.append("; ");
                    sb.append("Path=");
                    sb.append(optString2);
                }
                if (!StringUtils.isEmpty(optString)) {
                    sb.append("; ");
                    sb.append("Expires=");
                    sb.append(optString);
                }
                if (!StringUtils.isEmpty(optString3)) {
                    sb.append("; ");
                    sb.append("Secure");
                }
            } catch (JSONException unused3) {
                m.e(TAG, "writeCookies: param parse to JSON error, param=" + str);
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        } else {
            string = null;
        }
        String sb2 = sb.toString();
        if (StringUtils.isEmpty(sb2) || StringUtils.isEmpty(string)) {
            if (m.a()) {
                m.d(TAG, "writeCookies: Illegal param: cookieStr=" + sb2 + ";domain=" + string);
            }
            wVCallBackContext.error(rVar);
            return;
        }
        android.taobao.windvane.a.a(string, sb2);
        wVCallBackContext.success(rVar);
    }

    public void read(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f4d24", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        String str2 = null;
        if (!StringUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                m.e(TAG, "readCookies: param decode error, param=" + str);
            }
            try {
                str2 = new JSONObject(str).getString("url");
            } catch (JSONException unused2) {
                m.e(TAG, "readCookies: param parse to JSON error, param=" + str);
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        String a2 = android.taobao.windvane.a.a(str2);
        if (a2 == null) {
            m.d(TAG, "readCookies: cookieStr is null");
            a2 = "";
        }
        String[] split = a2.replace("\"", "\\\\\"").split(";");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str3 : split) {
            String[] split2 = str3.split("=");
            if (split2 != null && split2.length > 1) {
                try {
                    jSONObject2.put(split2[0].trim(), split2[1].trim());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            if (!android.taobao.windvane.util.e.b()) {
                jSONObject.put("values", jSONObject2);
            }
            jSONObject.put("value", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        rVar.a("value", jSONObject);
        wVCallBackContext.success(rVar);
    }

    public void write(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe30fc2d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        StringBuilder sb = new StringBuilder();
        String str2 = null;
        if (!StringUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                m.e(TAG, "writeCookies: param decode error, param=" + str);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    sb.append(next);
                    sb.append("=");
                    sb.append(string);
                    if (keys.hasNext()) {
                        sb.append("; ");
                    }
                }
                str2 = jSONObject.getString("domain");
            } catch (JSONException unused2) {
                m.e(TAG, "writeCookies: param parse to JSON error, param=" + str);
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        String sb2 = sb.toString();
        if (StringUtils.isEmpty(sb2) || StringUtils.isEmpty(str2)) {
            if (m.a()) {
                m.d(TAG, "writeCookies: Illegal param: cookieStr=" + sb2 + ";domain=" + str2);
            }
            wVCallBackContext.error(rVar);
            return;
        }
        android.taobao.windvane.a.a(str2, sb2);
        wVCallBackContext.success(rVar);
    }
}
