package com.taobao.android.weex_framework.module.builtin.stream;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.common.a;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.module.builtin.stream.Options;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.g;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class MUSStreamModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Pattern CHARSET_PATTERN;
    public static final String KEY_USER_AGENT = "user-agent";
    public static final String MODULE_NAME = "stream";
    public static final String STATUS = "status";
    public static final String STATUS_TEXT = "statusText";
    private static final String TAG = "MUSStreamModule";
    public final c mAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public interface a {
        void a(com.taobao.android.weex_framework.common.b bVar, Map<String, String> map);
    }

    public static /* synthetic */ Object ipc$super(MUSStreamModule mUSStreamModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-616933381);
        CHARSET_PATTERN = Pattern.compile("charset=([a-z0-9-]+)");
    }

    public MUSStreamModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mAdapter = l.a().g();
    }

    @MUSMethod(uiThread = false)
    public void fetch(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e8ed7d", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        try {
            doFetchInternal(jSONObject, bVar, bVar2);
        } catch (Throwable th) {
            g.c(TAG, th);
        }
    }

    private void doFetchInternal(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d728ab", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        if (jSONObject == null || jSONObject.getString("url") == null) {
            if (bVar == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("ok", false);
            hashMap.put("statusText", "ERR_INVALID_REQUEST");
            bVar.a(hashMap);
            return;
        }
        String string = jSONObject.getString("method");
        String string2 = jSONObject.getString("url");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        String string3 = jSONObject.getString(AgooConstants.MESSAGE_BODY);
        String string4 = jSONObject.getString("type");
        int intValue = jSONObject.getIntValue("timeout");
        if (string != null) {
            string = string.toUpperCase(Locale.ROOT);
        }
        Options.a aVar = new Options.a();
        if (!"GET".equals(string) && !"POST".equals(string) && !"PUT".equals(string) && !"DELETE".equals(string) && !"HEAD".equals(string) && !"PATCH".equals(string)) {
            string = "GET";
        }
        Options.a a2 = aVar.a(string).b(string2).c(string3).d(string4).a(intValue);
        extractHeaders(jSONObject2, a2);
        final Options a3 = a2.a();
        sendRequest(a3, new a() { // from class: com.taobao.android.weex_framework.module.builtin.stream.MUSStreamModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.module.builtin.stream.MUSStreamModule.a
            public void a(com.taobao.android.weex_framework.common.b bVar3, Map<String, String> map) {
                String str;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("92de7e88", new Object[]{this, bVar3, map});
                } else if (bVar == null) {
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    if (bVar3 == null || "-1".equals(bVar3.f15987a)) {
                        jSONObject3.put("status", (Object) (-1));
                        str = "ERR_CONNECT_FAILED";
                    } else {
                        int parseInt = Integer.parseInt(bVar3.f15987a);
                        jSONObject3.put("status", (Object) Integer.valueOf(parseInt));
                        jSONObject3.put("ok", (Object) Boolean.valueOf(parseInt >= 200 && parseInt <= 299));
                        if (bVar3.b == null) {
                            str2 = null;
                        } else {
                            try {
                                jSONObject3.put("data", MUSStreamModule.this.parseData(MUSStreamModule.readAsString(bVar3.b, map != null ? MUSStreamModule.getHeader(map, "Content-Type") : ""), a3.e()));
                            } catch (JSONException e) {
                                g.c("", e);
                                jSONObject3.put("ok", (Object) false);
                                str2 = "{'err':'Data parse failed!'}";
                            }
                            str = com.taobao.android.weex_framework.module.builtin.stream.a.a(bVar3.f15987a);
                        }
                        jSONObject3.put("data", (Object) str2);
                        str = com.taobao.android.weex_framework.module.builtin.stream.a.a(bVar3.f15987a);
                    }
                    jSONObject3.put("statusText", (Object) str);
                    jSONObject3.put("headers", (Object) map);
                    bVar.a(jSONObject3);
                }
            }
        }, bVar2);
    }

    public Object parseData(String str, Options.Type type) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8121d9b1", new Object[]{this, str, type});
        }
        if (type == Options.Type.json) {
            return JSONObject.parse(str);
        }
        if (type != Options.Type.jsonp) {
            return str;
        }
        if (str == null || str.isEmpty()) {
            return new JSONObject();
        }
        int indexOf = str.indexOf(riy.BRACKET_START_STR) + 1;
        int lastIndexOf = str.lastIndexOf(riy.BRACKET_END_STR);
        if (indexOf == 0 || indexOf >= lastIndexOf || lastIndexOf <= 0) {
            return new JSONObject();
        }
        return JSONObject.parse(str.substring(indexOf, lastIndexOf));
    }

    public static String getHeader(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b30007b", new Object[]{map, str});
        }
        if (map == null || str == null) {
            return null;
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return map.get(str.toLowerCase(Locale.ROOT));
    }

    public static String readAsString(byte[] bArr, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c54174f", new Object[]{bArr, str});
        }
        try {
            if (str != null) {
                Matcher matcher = CHARSET_PATTERN.matcher(str.toLowerCase(Locale.ROOT));
                if (matcher.find()) {
                    str2 = matcher.group(1);
                    return new String(bArr, str2);
                }
            }
            return new String(bArr, str2);
        } catch (UnsupportedEncodingException e) {
            g.c("", e);
            return new String(bArr);
        }
        str2 = "utf-8";
    }

    private void extractHeaders(JSONObject jSONObject, Options.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac1ee9e", new Object[]{this, jSONObject, aVar});
            return;
        }
        String a2 = m.a("system", "userAgent");
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                if (str.equals("user-agent")) {
                    a2 = jSONObject.getString(str);
                } else {
                    aVar.a(str, jSONObject.getString(str));
                }
            }
        }
        aVar.a("user-agent", a2);
    }

    private void sendRequest(Options options, a aVar, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2774cf", new Object[]{this, options, aVar, bVar});
            return;
        }
        com.taobao.android.weex_framework.common.a aVar2 = new com.taobao.android.weex_framework.common.a();
        aVar2.d = options.a();
        aVar2.c = options.b();
        aVar2.e = options.d();
        aVar2.f = options.f();
        aVar2.g = new a.C0618a(NetworkResourceType.Fetch, getInstance() != null ? getInstance().getInstanceId() : -1);
        if (options.c() != null) {
            aVar2.b.putAll(options.c());
        }
        c cVar = this.mAdapter;
        if (cVar == null) {
            cVar = l.a().g();
        }
        if (cVar != null) {
            cVar.a(aVar2, new b(aVar, bVar));
        } else {
            g.f(TAG, "No HttpAdapter found,request failed.");
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f16058a;
        private com.taobao.android.weex_framework.bridge.b b;
        private JSONObject c;
        private Map<String, String> d;

        static {
            kge.a(-1266188187);
            kge.a(-1919922432);
        }

        private b(a aVar, com.taobao.android.weex_framework.bridge.b bVar) {
            this.c = new JSONObject();
            this.f16058a = aVar;
            this.b = bVar;
        }

        @Override // com.taobao.android.weex_framework.adapter.c.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b == null) {
            } else {
                this.c.put("readyState", (Object) 1);
                this.c.put(com.taobao.android.weex_framework.util.a.ATOM_length, (Object) 0);
                this.b.b(this.c);
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.c.a
        public void a(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
                return;
            }
            this.c.put("readyState", (Object) 2);
            this.c.put("status", (Object) Integer.valueOf(i));
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().size() != 0) {
                        String str = "_";
                        if (entry.getValue().size() == 1) {
                            if (entry.getKey() != null) {
                                str = entry.getKey();
                            }
                            hashMap.put(str, entry.getValue().get(0));
                        } else {
                            if (entry.getKey() != null) {
                                str = entry.getKey();
                            }
                            hashMap.put(str, entry.getValue().toString());
                        }
                    }
                }
            }
            this.c.put("headers", (Object) hashMap);
            this.d = hashMap;
            com.taobao.android.weex_framework.bridge.b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.b(this.c);
        }

        @Override // com.taobao.android.weex_framework.adapter.c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            this.c.put(com.taobao.android.weex_framework.util.a.ATOM_length, (Object) Integer.valueOf(i));
            com.taobao.android.weex_framework.bridge.b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.b(this.c);
        }

        @Override // com.taobao.android.weex_framework.adapter.c.a
        public void a(com.taobao.android.weex_framework.common.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2660175d", new Object[]{this, bVar});
                return;
            }
            a aVar = this.f16058a;
            if (aVar != null) {
                aVar.a(bVar, this.d);
            }
            if (!g.a()) {
                return;
            }
            g.a(MUSStreamModule.TAG, (bVar == null || bVar.b == null) ? "response data is NUll!" : new String(bVar.b));
        }
    }
}
