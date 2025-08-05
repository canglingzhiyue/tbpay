package com.taobao.taobao.scancode.gateway.util;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.StringUtil;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class UrlModifyAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f21259a = new ArrayList();
    private boolean b = false;
    private Map<String, String> c;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(-1087186863);
    }

    public static /* synthetic */ void a(UrlModifyAdapter urlModifyAdapter, String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af704f9", new Object[]{urlModifyAdapter, str, str2, hashMap});
        } else {
            urlModifyAdapter.a(str, str2, hashMap);
        }
    }

    public UrlModifyAdapter() {
        try {
            this.c = OrangeConfig.getInstance().getConfigs("scancode_url_mapping");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, String> f21260a;
        private String b;
        private String c;

        static {
            kge.a(321850255);
        }

        private b() {
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8124a38", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d9df77ae", new Object[]{bVar, str});
            }
            bVar.b = str;
            return str;
        }

        public static /* synthetic */ HashMap a(b bVar, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("347179ee", new Object[]{bVar, hashMap});
            }
            bVar.f21260a = hashMap;
            return hashMap;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26c3b457", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("926c380d", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ HashMap c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("c8c5464d", new Object[]{bVar}) : bVar.f21260a;
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b[] f21261a;
        private String b;
        private String c;
        private String d;
        private String e;

        static {
            kge.a(1830747633);
        }

        private c() {
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ab3fb9", new Object[]{cVar}) : cVar.b;
        }

        public static /* synthetic */ String a(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a2e06eef", new Object[]{cVar, str});
            }
            cVar.d = str;
            return str;
        }

        public static /* synthetic */ b[] a(c cVar, b[] bVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b[]) ipChange.ipc$dispatch("d4a858b3", new Object[]{cVar, bVarArr});
            }
            cVar.f21261a = bVarArr;
            return bVarArr;
        }

        public static /* synthetic */ String b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("335ca9d8", new Object[]{cVar}) : cVar.c;
        }

        public static /* synthetic */ String b(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5b6d2f4e", new Object[]{cVar, str});
            }
            cVar.e = str;
            return str;
        }

        public static /* synthetic */ String c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("620e13f7", new Object[]{cVar}) : cVar.d;
        }

        public static /* synthetic */ String c(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13f9efad", new Object[]{cVar, str});
            }
            cVar.b = str;
            return str;
        }

        public static /* synthetic */ String d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90bf7e16", new Object[]{cVar}) : cVar.e;
        }

        public static /* synthetic */ String d(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cc86b00c", new Object[]{cVar, str});
            }
            cVar.c = str;
            return str;
        }

        public static /* synthetic */ b[] e(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b[]) ipChange.ipc$dispatch("4af89150", new Object[]{cVar}) : cVar.f21261a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public static class UrlModifyRequest implements IMTOPDataObject {
        public String API_NAME;
        public boolean NEED_ECODE;
        public boolean NEED_SESSION;
        public String VERSION;
        public String url;

        static {
            kge.a(1589105497);
            kge.a(-350052935);
        }

        private UrlModifyRequest() {
            this.NEED_ECODE = false;
            this.NEED_SESSION = true;
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917ff7d3", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (TextUtils.isEmpty(str)) {
                aVar.a(str);
            } else if (this.c == null) {
                aVar.a(str);
            } else if (!b()) {
                aVar.a(str);
            } else if (a() && !a(str)) {
                aVar.a(str);
            } else {
                if (!this.b) {
                    this.b = true;
                    a(this.c);
                }
                c c2 = c(str);
                if (c2 != null) {
                    a("Page_ScanHome", "UrlMappingSuc", (HashMap<String, String>) null);
                    a(str, aVar, c2);
                    return;
                }
                aVar.a(str);
            }
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_check_out_url", "true"));
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (android.taobao.windvane.config.p.a(str) || b(str)) {
            z = false;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("time", (SystemClock.elapsedRealtime() - elapsedRealtime) + "");
        a("Page_ScanHome", "innerUrlSpendTime", hashMap);
        return z;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : h.a(str);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_unify_urlmapping", "true"));
    }

    private void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, hashMap).build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(final String str, final a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9209fcb2", new Object[]{this, str, aVar, cVar});
            return;
        }
        UrlModifyRequest urlModifyRequest = new UrlModifyRequest();
        urlModifyRequest.url = str;
        urlModifyRequest.API_NAME = c.a(cVar);
        urlModifyRequest.VERSION = c.b(cVar);
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) urlModifyRequest).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "requestsystemerror");
                UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                aVar.a(str);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    String string = new JSONObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getString("result");
                    if (TextUtils.isEmpty(string)) {
                        throw new NullPointerException();
                    }
                    aVar.a(string);
                    UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenSuc", null);
                } catch (Throwable unused) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reason", "nourlreturn");
                    UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                    aVar.a(str);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "requestfail");
                UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                aVar.a(str);
            }
        });
        registeListener.mo1305reqMethod(MethodEnum.GET);
        registeListener.startRequest();
    }

    private c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("78d85c81", new Object[]{this, str});
        }
        if (this.f21259a.size() != 0 && !TextUtils.isEmpty(str)) {
            for (c cVar : this.f21259a) {
                if (a(cVar, str)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private boolean a(c cVar, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("357d41d5", new Object[]{this, cVar, str})).booleanValue();
        }
        if (cVar != null) {
            try {
                if (!StringUtil.isEmpty(str)) {
                    long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
                    long parseLong = TextUtils.isEmpty(c.c(cVar)) ? 0L : Long.parseLong(c.c(cVar));
                    if (parseLong != 0 && parseLong > currentTimeStamp) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("reason", "outoftime");
                        a("Page_ScanHome", "UrlMappingOpenFail", hashMap);
                        return false;
                    }
                    long parseLong2 = TextUtils.isEmpty(c.d(cVar)) ? 0L : Long.parseLong(c.d(cVar));
                    if (parseLong2 != 0 && parseLong2 < currentTimeStamp) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("reason", "outoftime");
                        a("Page_ScanHome", "UrlMappingOpenFail", hashMap2);
                        return false;
                    }
                    b[] e = c.e(cVar);
                    if (e == null) {
                        HashMap<String, String> hashMap3 = new HashMap<>();
                        hashMap3.put("reason", "norules");
                        a("Page_ScanHome", "UrlMappingOpenFail", hashMap3);
                        return false;
                    }
                    Uri parse = Uri.parse(str);
                    if (parse == null) {
                        HashMap<String, String> hashMap4 = new HashMap<>();
                        hashMap4.put("reason", "uriparsefail");
                        a("Page_ScanHome", "UrlMappingOpenFail", hashMap4);
                        return false;
                    }
                    for (b bVar : e) {
                        if (bVar != null && b.a(bVar) != null && b.a(bVar).equalsIgnoreCase(parse.getHost()) && (TextUtils.isEmpty(b.b(bVar)) || b.b(bVar).equals(parse.getPath()))) {
                            HashMap c2 = b.c(bVar);
                            if (c2 != null) {
                                for (String str2 : c2.keySet()) {
                                    String queryParameter = parse.getQueryParameter(str2);
                                    if (queryParameter == null) {
                                        if (c2.get(str2) != null) {
                                            z = false;
                                            break;
                                        }
                                    } else if (!queryParameter.equals(c2.get(str2))) {
                                        z = false;
                                        break;
                                    }
                                }
                            }
                            z = true;
                            if (z) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                HashMap<String, String> hashMap5 = new HashMap<>();
                hashMap5.put("needmodifyfindexp", th.getMessage() == null ? "no_Msg" : th.getMessage());
                a("Page_ScanHome", "UrlMappingOpenFail", hashMap5);
            }
        }
        return false;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null) {
            for (int i = 0; i < map.size(); i++) {
                try {
                    a(new JSONObject(map.get(i + "")));
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.f21259a.clear();
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("parsefindexp", th.getMessage() == null ? "no_Msg" : th.getMessage());
                    a("Page_ScanHome", "UrlMappingOpenFail", hashMap);
                    return;
                }
            }
        }
    }

    private void a(JSONObject jSONObject) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        c cVar = new c();
        c.a(cVar, jSONObject.has("startTime") ? jSONObject.getString("startTime") : null);
        c.b(cVar, jSONObject.has("endTime") ? jSONObject.getString("endTime") : null);
        c.c(cVar, jSONObject.getJSONObject("mtopAPI").getString("method"));
        c.d(cVar, jSONObject.getJSONObject("mtopAPI").getString("v"));
        JSONArray jSONArray = jSONObject.getJSONArray(MspGlobalDefine.RULES);
        b[] bVarArr = new b[jSONArray == null ? 0 : jSONArray.length()];
        c.a(cVar, bVarArr);
        for (int i = 0; i < bVarArr.length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                bVarArr[i] = new b();
                b.a(bVarArr[i], jSONObject2.has("host") ? jSONObject2.getString("host") : null);
                b.b(bVarArr[i], jSONObject2.has("path") ? jSONObject2.getString("path") : null);
                JSONObject jSONObject3 = jSONObject2.has("params") ? jSONObject2.getJSONObject("params") : null;
                if (jSONObject3 != null) {
                    b.a(bVarArr[i], new HashMap());
                    Iterator<String> keys = jSONObject3.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (next != null) {
                                b.c(bVarArr[i]).put(next, jSONObject3.getString(next));
                            }
                        }
                    }
                }
            }
        }
        this.f21259a.add(cVar);
    }
}
