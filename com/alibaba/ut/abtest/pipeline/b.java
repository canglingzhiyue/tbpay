package com.alibaba.ut.abtest.pipeline;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.internal.util.f;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.o;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import tb.any;
import tb.aph;
import tb.cew;
import tb.cex;
import tb.kge;

/* loaded from: classes3.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f4209a;

    static {
        kge.a(1676600499);
        kge.a(-1474084877);
    }

    @Override // com.alibaba.ut.abtest.pipeline.a
    public Response a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("2c822604", new Object[]{this, cVar});
        }
        Response response = null;
        try {
            response = b(cVar);
            h.a("PipelineServiceImpl", "executeRequest complete, response=" + response);
            return response;
        } catch (Throwable th) {
            h.c("PipelineServiceImpl", "executeRequest failure." + th.getMessage(), th);
            if (response != null) {
                return response;
            }
            Response response2 = new Response();
            response2.setSuccess(false);
            response2.setCode(40000);
            response2.setMessage(th.getMessage());
            return response2;
        }
    }

    private Response b(c cVar) throws Exception {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("33ab0845", new Object[]{this, cVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Response response = new Response();
        DataOutputStream dataOutputStream2 = null;
        try {
            URL url = new URL(a() + cVar.c());
            h.a("PipelineServiceImpl", "sendRequest. request=" + cVar + ", requestUrl=" + url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (httpURLConnection instanceof HttpsURLConnection) {
                if (this.f4209a == null && !TextUtils.isEmpty(url.getHost())) {
                    this.f4209a = new d(url.getHost());
                }
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f4209a);
            }
            httpURLConnection.setRequestProperty("Charset", cew.a.DEFAULT_CHARSET.name());
            httpURLConnection.setRequestProperty("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            if (cVar.a() != null) {
                for (Map.Entry<String, String> entry : cVar.a().entrySet()) {
                    if (entry.getValue() == null) {
                        httpURLConnection.setRequestProperty(entry.getKey(), "");
                    } else {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            String a2 = a(httpURLConnection, cVar);
            if (a2 == null || a2.length() <= 0) {
                dataOutputStream = null;
            } else {
                String str = "requestBody=" + a2;
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream.writeBytes(str);
                    dataOutputStream.flush();
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    dataOutputStream2 = dataOutputStream;
                    f.a(dataOutputStream2);
                    f.a(closeable);
                    throw th;
                }
            }
            response.setHttpResponseCode(httpURLConnection.getResponseCode());
            if (response.getHttpResponseCode() != 200) {
                h.e("PipelineServiceImpl", "request returned http code " + response.getHttpResponseCode());
                f.a(dataOutputStream);
                f.a(null);
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            response.setByteData(f.a(inputStream));
            String str2 = new String(response.getByteData(), "UTF-8");
            if (h.a()) {
                h.a("PipelineServiceImpl", "responseString=" + str2 + ", request=" + cVar);
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (TextUtils.equals("sm", jSONObject.optString("rgv587_flag"))) {
                response.setSuccess(false);
                response.setCode(20001);
                response.setMessage("rgv587_flag");
            } else {
                response.setSuccess(jSONObject.optBoolean("success"));
                response.setCode(jSONObject.optInt("code"));
                response.setMessage(jSONObject.optString("info"));
                response.setDataJsonObject(jSONObject.optJSONObject("data"));
                if (response.getDataJsonObject() != null) {
                    if (cVar.f() != null) {
                        response.setData(g.a(response.getDataJsonObject().toString(), (Class<Object>) cVar.f()));
                    } else if (cVar.g() != null) {
                        response.setData(g.a(response.getDataJsonObject().toString(), cVar.g()));
                    }
                }
            }
            f.a(dataOutputStream);
            f.a(inputStream);
            if (h.a()) {
                h.a("PipelineServiceImpl", "The request ended and it took " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds. request=" + cVar);
            } else {
                h.a("PipelineServiceImpl", "The request ended and it took " + (System.currentTimeMillis() - currentTimeMillis) + " milliseconds.");
            }
            return response;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
        }
    }

    public String a(HttpURLConnection httpURLConnection, c cVar) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42aeec23", new Object[]{this, httpURLConnection, cVar});
        }
        if (cVar.b() != null && cVar.b().a() != null) {
            Object a2 = cVar.b().a();
            if (a2 instanceof Map) {
                str = g.a((Map<String, ?>) cVar.b().a());
            } else if (a2 instanceof List) {
                str = g.a((List) cVar.b().a());
            }
            String b = aph.b(com.alibaba.ut.abtest.pipeline.encoder.b.a(str.getBytes(cew.a.DEFAULT_CHARSET)), 2);
            httpURLConnection.setRequestProperty("ab-sign", com.alibaba.ut.abtest.pipeline.encoder.a.a("51734f6a783d4d4e6152405f413f68684552807b888d8163927b5280838d648d", b));
            httpURLConnection.setRequestProperty("ab-client-version", "2.15.28");
            httpURLConnection.setRequestProperty("app-key", any.d().c());
            httpURLConnection.setRequestProperty("app-version", o.a().c());
            return URLEncoder.encode(b, cew.a.DEFAULT_CHARSET.name());
        }
        str = "";
        String b2 = aph.b(com.alibaba.ut.abtest.pipeline.encoder.b.a(str.getBytes(cew.a.DEFAULT_CHARSET)), 2);
        httpURLConnection.setRequestProperty("ab-sign", com.alibaba.ut.abtest.pipeline.encoder.a.a("51734f6a783d4d4e6152405f413f68684552807b888d8163927b5280838d648d", b2));
        httpURLConnection.setRequestProperty("ab-client-version", "2.15.28");
        httpURLConnection.setRequestProperty("app-key", any.d().c());
        httpURLConnection.setRequestProperty("app-version", o.a().c());
        return URLEncoder.encode(b2, cew.a.DEFAULT_CHARSET.name());
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        UTABEnvironment t = cex.a().t();
        return (t == null || t == UTABEnvironment.Product) ? "https://abtest.alibaba.com" : t == UTABEnvironment.Prepare ? "http://preabtest.alibaba-inc.com" : t == UTABEnvironment.Daily ? "http://abtest-daily.tmall.net" : "https://abtest.alibaba.com";
    }
}
