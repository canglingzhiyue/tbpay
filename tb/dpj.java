package tb;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.util.WeexAppMonitor;
import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.common.b;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.p;
import com.taobao.themis.kernel.i;
import com.taobao.weex.common.WXPerformance;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.model.ZCacheResourceResponse;
import com.taobao.zcache.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.jyx;
import tb.mto;

/* loaded from: classes4.dex */
public class dpj implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "[Request]";
    private static boolean g;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static /* synthetic */ void a(dpj dpjVar, com.taobao.android.weex_framework.common.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a9f745", new Object[]{dpjVar, aVar, bVar});
        } else {
            dpjVar.a(aVar, bVar);
        }
    }

    static {
        kge.a(-305950941);
        kge.a(1841223049);
        g = false;
        try {
            g = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    private void a(com.taobao.android.weex_framework.common.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0c44f3", new Object[]{this, aVar, bVar});
            return;
        }
        double uptimeMillis = SystemClock.uptimeMillis();
        try {
            String uri = Uri.parse(aVar.c).buildUpon().clearQuery().build().toString();
            Map<String, Object> map = bVar.e;
            String str = "http";
            if (map != null && "ZCache".equals(map.get("connectionType"))) {
                str = "zcache";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) uri);
            jSONObject.put(WXPerformance.CACHE_TYPE, (Object) str);
            jSONObject.put("code", (Object) bVar.f15987a);
            jSONObject.put("deviceLevel", (Object) String.valueOf(l.a().t()));
            if (bVar.c != null) {
                WeexAppMonitor.Avail.Point.HTTP_DOWNLOAD.commitFailAsync(jSONObject, bVar.c, bVar.d);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("zcacheCheckTime", Double.valueOf(aVar.k - aVar.j));
            hashMap.put(jyx.c.POINT_NAME, Double.valueOf(uptimeMillis - aVar.k));
            hashMap.put("resourceSize", Double.valueOf(bVar.b != null ? bVar.b.length : mto.a.GEO_NOT_SUPPORT));
            WeexAppMonitor.Avail.Point.HTTP_DOWNLOAD.commitSuccessAsync(jSONObject);
            WeexAppMonitor.Performance.Point.HTTP_DOWNLOAD.commitAsync(jSONObject, hashMap);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.c
    public void a(com.taobao.android.weex_framework.common.a aVar, c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e2b45f", new Object[]{this, aVar, aVar2});
        } else if (aVar2 == null || aVar == null) {
        } else {
            com.taobao.android.weex_framework.devtool.a aVar3 = new com.taobao.android.weex_framework.devtool.a();
            aVar2.a();
            aVar3.a(aVar);
            aVar.j = SystemClock.uptimeMillis();
            b bVar = new b();
            if (bVar.e == null) {
                bVar.e = new HashMap();
            }
            if (TextUtils.isEmpty(aVar.c)) {
                bVar.f15987a = String.valueOf(16);
                bVar.d = "request url is empty!";
                aVar3.a(bVar);
                aVar2.a(bVar);
                return;
            }
            if (g && !aVar.h) {
                a(aVar, bVar, aVar3);
            }
            aVar.k = SystemClock.uptimeMillis();
            b(aVar, bVar, aVar2, aVar3);
        }
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : uri != null && (uri.getHost().startsWith("mo.m.taobao.com") || uri.getHost().startsWith("pre-mo.m.taobao.com")) && "true".equals(uri.getQueryParameter("wh_muise"));
    }

    private void a(com.taobao.android.weex_framework.common.a aVar, b bVar, c.a aVar2, com.taobao.android.weex_framework.devtool.a aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdd9614", new Object[]{this, aVar, bVar, aVar2, aVar3});
            return;
        }
        try {
            g.b(TAG, "Http request start, url: " + aVar.c);
            bVar.f15987a = String.valueOf(16);
            bVar.d = "default err";
            aVar.f = 10000;
            Request a2 = a(aVar);
            a(a2, aVar.c);
            new DegradableNetwork(m.b).asyncSend(a2, null, null, new a(aVar, bVar, aVar2, aVar.c, aVar3));
        } catch (Exception e) {
            g.c(TAG, e);
            bVar.f15987a = String.valueOf(16);
            bVar.c = String.valueOf(16);
            bVar.d = e.getMessage();
            if (aVar3 != null) {
                aVar3.a(bVar);
            }
            aVar2.a(bVar);
        }
    }

    private void a(Request request, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b702d00", new Object[]{this, request, str});
        } else if (request == null) {
        } else {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("wx_request_timeout");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                int parseFloat = (int) (Float.parseFloat(queryParameter) * 1000.0f);
                if (parseFloat <= 0) {
                    parseFloat = 10000;
                }
                request.setConnectTimeout(parseFloat);
                request.setReadTimeout(parseFloat);
            } catch (Throwable unused) {
            }
        }
    }

    private String b() {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String str = locale.getLanguage() + "-" + locale.getCountry();
            if (locale.getLanguage().equals("zh")) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + "," + locale.getLanguage() + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Throwable unused) {
            return "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3";
        }
    }

    private Request a(com.taobao.android.weex_framework.common.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3c16e9e6", new Object[]{this, aVar});
        }
        RequestImpl requestImpl = new RequestImpl(aVar.c);
        requestImpl.setBizId(4102);
        if (aVar.b != null) {
            for (String str : aVar.b.keySet()) {
                requestImpl.addHeader(str, aVar.b.get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, b());
        String str2 = aVar.d;
        if (TextUtils.isEmpty(str2)) {
            str2 = "GET";
        }
        requestImpl.setMethod(str2);
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(2);
        requestImpl.setConnectTimeout(aVar.f);
        if (!TextUtils.isEmpty(aVar.e)) {
            requestImpl.setBodyEntry(new ByteArrayEntry(aVar.e.getBytes()));
        }
        return requestImpl;
    }

    private void b(com.taobao.android.weex_framework.common.a aVar, b bVar, c.a aVar2, com.taobao.android.weex_framework.devtool.a aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca08f15", new Object[]{this, aVar, bVar, aVar2, aVar3});
        } else if (TextUtils.equals("200", bVar.f15987a)) {
            bVar.e.put(i.CDN_REQUEST_TYPE, "cache");
            bVar.e.put(WXPerformance.CACHE_TYPE, "zcache");
            a(aVar, bVar);
            aVar3.a(bVar);
            aVar2.a(bVar);
        } else {
            a(aVar, bVar, aVar2, aVar3);
        }
    }

    public b a(com.taobao.android.weex_framework.common.a aVar, b bVar, com.taobao.android.weex_framework.devtool.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4c657460", new Object[]{this, aVar, bVar, aVar2});
        }
        bVar.f15987a = "-1";
        byte[] bArr = null;
        try {
            ResourceRequest resourceRequest = new ResourceRequest(aVar.c.trim(), aVar.b);
            resourceRequest.setTraceId(aVar.f15985a);
            ResourceResponse a2 = n.a(resourceRequest);
            if (a2 != null) {
                Map<String, String> header = a2.getHeader();
                String str = "unknown";
                String str2 = header == null ? str : header.get("X-ZCache-Info");
                if (str2 != null) {
                    str = str2;
                }
                if (aVar2 != null) {
                    aVar2.f15989a = str;
                }
                bVar.e.put("X-ZCache-Info", str);
                bArr = a2.getData();
                if (!a(aVar.c, bArr, str, bVar.e)) {
                    return bVar;
                }
                if (header != null) {
                    for (Map.Entry<String, String> entry : header.entrySet()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(entry.getValue());
                        bVar.f.put(entry.getKey() == null ? "_" : entry.getKey(), arrayList);
                    }
                }
            } else {
                bVar.e.put("X-ZCache-Info", ZCacheResourceResponse.ZCACHE_NO_RESPONSE);
            }
        } catch (Throwable th) {
            if (g.a()) {
                g.f(TAG, "getResponseByZCache error:" + th.getMessage());
            }
        }
        if (bArr != null) {
            bVar.f15987a = "200";
            bVar.b = bArr;
            bVar.e.put("connectionType", "ZCache");
            if (g.a()) {
                g.b(TAG, "Http request finished hit zcache, url: " + aVar.c);
            }
        }
        return bVar;
    }

    private static boolean a(String str, byte[] bArr, String str2, Map<String, Object> map) {
        String queryParameter;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83775b26", new Object[]{str, bArr, str2, map})).booleanValue();
        }
        if (bArr == null || (queryParameter = Uri.parse(str).getQueryParameter("wx_js_min_version")) == null || queryParameter.isEmpty() || (str3 = p.a(bArr).get(com.taobao.android.weex_framework.util.a.ATOM_stack)) == null || str3.isEmpty() || p.a(queryParameter, str3) <= 0) {
            return true;
        }
        map.put("X-ZCache-Info", String.format("%s version %s < %s", str2, str3, queryParameter));
        return false;
    }

    public void a(c.a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e07d2a", new Object[]{this, aVar, bVar});
        } else {
            aVar.a(bVar);
        }
    }

    /* loaded from: classes4.dex */
    public class a implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b b;
        private c.a c;
        private ByteArrayOutputStream d = new ByteArrayOutputStream();
        private String e;
        private Map<String, List<String>> f;
        private com.taobao.android.weex_framework.devtool.a g;
        private com.taobao.android.weex_framework.common.a h;

        static {
            kge.a(1935624545);
            kge.a(-501869850);
            kge.a(-324998464);
            kge.a(1776397793);
        }

        public a(com.taobao.android.weex_framework.common.a aVar, b bVar, c.a aVar2, String str, com.taobao.android.weex_framework.devtool.a aVar3) {
            this.h = aVar;
            this.b = bVar;
            this.c = aVar2;
            this.e = str;
            this.g = aVar3;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else {
                a(finishEvent);
            }
        }

        private void a(NetworkEvent.FinishEvent finishEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("512b11c", new Object[]{this, finishEvent});
                return;
            }
            this.b.f15987a = String.valueOf(finishEvent.getHttpCode());
            if (finishEvent.getHttpCode() == 200) {
                byte[] byteArray = this.d.toByteArray();
                if (g.a()) {
                    g.b(dpj.TAG, "Http request finished succ, length: " + byteArray.length + ", url: " + this.e);
                }
                this.b.b = byteArray;
            } else if (finishEvent.getHttpCode() == 304) {
                if (g.a()) {
                    g.b(dpj.TAG, "Http request finished 304, url: " + this.e);
                }
            } else if (finishEvent.getHttpCode() == 404) {
                g.f(dpj.TAG, "Http request finished error code: 404, url: " + this.e);
                this.b.c = String.valueOf(finishEvent.getHttpCode());
                this.b.d = "404 NOT FOUND!";
            } else {
                g.f(dpj.TAG, "Http request finished error code: " + finishEvent.getHttpCode() + ", url: " + this.e);
                this.b.c = String.valueOf(finishEvent.getHttpCode());
                b bVar = this.b;
                bVar.d = "net_err: " + finishEvent.getDesc() + "|code: " + finishEvent.getHttpCode();
            }
            dpj.a(dpj.this, this.h, this.b);
            dpj.this.a(this.c, this.b);
            com.taobao.android.weex_framework.devtool.a aVar = this.g;
            if (aVar != null) {
                aVar.b();
            }
            ByteArrayOutputStream byteArrayOutputStream = this.d;
            if (byteArrayOutputStream == null) {
                return;
            }
            try {
                byteArrayOutputStream.close();
                this.d = null;
            } catch (IOException e) {
                if (!g.a()) {
                    return;
                }
                g.c(dpj.TAG, e);
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent == null) {
            } else {
                this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                this.c.a(this.d.size());
                com.taobao.android.weex_framework.devtool.a aVar = this.g;
                if (aVar == null) {
                    return;
                }
                aVar.a(progressEvent.getBytedata());
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.f = map;
            this.b.f = new HashMap(map);
            this.c.a(i, map);
            com.taobao.android.weex_framework.devtool.a aVar = this.g;
            if (aVar != null) {
                aVar.a(i, false, map);
            }
            return true;
        }
    }
}
