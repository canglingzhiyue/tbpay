package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.p;
import com.taobao.search.musie.weex.MusWeex;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public final class nex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31407a = nex.class.getSimpleName();
    private final String b = "PHADevToolsConfig";
    private final String c = "PHADevToolsJS";
    private final String d = "injectScriptUrl";
    private final String e = "proxySettings";
    private final String f = "debugId";
    private final String g = "appWsUrl";
    private JSONObject h = null;
    private JSONArray i = null;
    private String j = null;
    private List<String> k = Arrays.asList("https://g.alicdn.com/appworks/", "https://dev.g.alicdn.com/appworks/", "https://g.alicdn.com/??appworks/", "https://dev.g.alicdn.com/??appworks/");
    private String l = null;
    private boolean m = false;
    private boolean n = false;
    private String o = null;
    private String p = null;

    static {
        kge.a(-1644017966);
    }

    public static /* synthetic */ JSONObject a(nex nexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("67fb64b7", new Object[]{nexVar}) : nexVar.h;
    }

    public static /* synthetic */ String a(nex nexVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c89a31f", new Object[]{nexVar, str}) : nexVar.b(str);
    }

    public static /* synthetic */ void a(nex nexVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96b4b2b", new Object[]{nexVar, str, str2});
        } else {
            nexVar.a(str, str2);
        }
    }

    public static /* synthetic */ String b(nex nexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8906cb88", new Object[]{nexVar}) : nexVar.l;
    }

    public static /* synthetic */ void b(nex nexVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c932fe2", new Object[]{nexVar, str});
        } else {
            nexVar.c(str);
        }
    }

    public static /* synthetic */ String c(nex nexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89b37727", new Object[]{nexVar}) : nexVar.f31407a;
    }

    public static /* synthetic */ boolean c(nex nexVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("517bf827", new Object[]{nexVar, str})).booleanValue() : nexVar.a(str);
    }

    public static /* synthetic */ void d(nex nexVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c199e91a", new Object[]{nexVar});
        } else {
            nexVar.g();
        }
    }

    public nex() {
        Cnew.a(new Runnable() { // from class: tb.nex.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                nex nexVar = nex.this;
                nex.b(nexVar, nex.a(nexVar, "PHADevToolsJS"));
                nex nexVar2 = nex.this;
                if (nex.b(nexVar2) != null) {
                    z = true;
                }
                nexVar2.a(z);
            }
        });
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            for (String str2 : this.k) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.l = str;
        b("BACK_END_JS", str);
    }

    private static void b(String str, String str2) {
        try {
            Class.forName("android.taobao.windvane.extra.devtools.DevTools").getField(str).set(null, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean b(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if ("injectScriptUrl".equals(str) && !StringUtils.isEmpty(string) && !Uri.decode(string).equals(this.j)) {
                z = true;
            }
        }
        this.h = jSONObject;
        c(this.h);
        Cnew.a(new Runnable() { // from class: tb.nex.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (z) {
                    String decode = Uri.decode(jSONObject.getString("injectScriptUrl"));
                    String str2 = null;
                    if (nex.c(nex.this, decode)) {
                        str2 = ngs.a(decode, null);
                    }
                    if (str2 != null) {
                        nex.b(nex.this, str2);
                        nex nexVar = nex.this;
                        nex.a(nexVar, nex.b(nexVar), "PHADevToolsJS");
                    }
                }
                nex nexVar2 = nex.this;
                nex.a(nexVar2, nex.a(nexVar2).toJSONString(), "PHADevToolsConfig");
            }
        });
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.n;
    }

    public void a(JSONObject jSONObject, sgj sgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243851a2", new Object[]{this, jSONObject, sgjVar});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("enable");
        this.n = booleanValue;
        if (!booleanValue) {
            this.o = null;
            this.p = null;
            if (sgjVar != null) {
                sgjVar.a();
                return;
            }
        }
        String string = jSONObject.getString(MusWeex.ATTR_SCRIPT_URL);
        if (StringUtils.isEmpty(string)) {
            if (sgjVar == null) {
                return;
            }
            sgjVar.a(-1, "scripturl is null");
        } else if (StringUtils.equals(this.o, string) && sgjVar != null) {
            sgjVar.a();
        } else {
            a(string, sgjVar);
        }
    }

    private void a(String str, sgj sgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e99584c", new Object[]{this, str, sgjVar});
        } else if (!a(str) && sgjVar != null) {
            sgjVar.a(-5, "not safe url");
        } else {
            try {
                d(ngs.a(str, null));
                this.o = str;
                if (StringUtils.isEmpty(this.p)) {
                    if (sgjVar == null) {
                        return;
                    }
                    sgjVar.a(-6, "get inject url fail");
                } else if (sgjVar == null) {
                } else {
                    sgjVar.a();
                }
            } catch (Exception e) {
                String str2 = this.f31407a;
                ngr.b(str2, "get inject url fail:" + Log.getStackTraceString(e));
                if (sgjVar == null) {
                    return;
                }
                sgjVar.a(-7, "get inject url fail:" + e.getMessage());
            }
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.p;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            final String string = jSONObject.getString("debugId");
            final String string2 = jSONObject.getString("appWsUrl");
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                return;
            }
            this.h = jSONObject;
            this.j = jSONObject.getString("injectScriptUrl");
            Cnew.a(new Runnable() { // from class: tb.nex.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ney e = p.b().e();
                    if (e != null) {
                        e.a(string2, string, new a.InterfaceC0751a() { // from class: tb.nex.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                            public void a(JSONObject jSONObject2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                                    return;
                                }
                                ngr.b(nex.c(nex.this), "AppDevTools Logger connection Success ");
                                nex.d(nex.this);
                            }

                            @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                            public void a(PHAErrorType pHAErrorType, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str});
                                    return;
                                }
                                String c = nex.c(nex.this);
                                ngr.b(c, "AppDevTools Logger connection failed: " + str);
                            }
                        });
                    } else {
                        nex.d(nex.this);
                    }
                }
            });
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.p = str;
        b("INJECTED_JS", str);
    }

    public Future<Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b5805ffe", new Object[]{this});
        }
        a(false);
        this.h = null;
        this.l = null;
        this.i = null;
        File filesDir = p.e().getFilesDir();
        final File file = new File(filesDir, "PHADevToolsConfig");
        final File file2 = new File(filesDir, "PHADevToolsJS");
        return Cnew.a(new Callable<Boolean>() { // from class: tb.nex.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ Boolean call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public Boolean a() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    return (Boolean) ipChange2.ipc$dispatch("5b7a33e5", new Object[]{this});
                }
                ney e = p.b().e();
                if (e != null) {
                    e.a();
                }
                if (file.delete() && file2.delete()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = this.h;
        if (jSONObject == null || jSONObject.isEmpty()) {
            this.h = ngn.i(b("PHADevToolsConfig"));
        }
        return this.h;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = null;
        if (a(this.j)) {
            str = ngs.a(this.j, null);
        }
        c(str);
        if (this.l == null) {
            ngr.b(this.f31407a, "BackEndJs download failed or forbidden js url!");
            return;
        }
        a(true);
        a(this.h.toJSONString(), "PHADevToolsConfig");
        a(this.l, "PHADevToolsJS");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.l;
    }

    public JSONArray d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this});
        }
        if (b() != null && this.i == null) {
            this.i = b().getJSONArray("proxySettings");
        }
        return this.i;
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.i = jSONObject.getJSONArray("proxySettings");
        }
    }

    public Map<String, JSONArray> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        if (d() == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.i.size(); i++) {
            JSONObject jSONObject = this.i.getJSONObject(i);
            String string = jSONObject.getString("from");
            if (string != null) {
                hashMap.put(string, jSONObject.getJSONArray("to"));
            }
        }
        return hashMap;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.m;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            FileOutputStream openFileOutput = p.e().openFileOutput(str2, 0);
            openFileOutput.write(str.getBytes("UTF-8"));
            if (openFileOutput == null) {
                return;
            }
            openFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            if (!new File(p.e().getFilesDir(), str).exists()) {
                return null;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(p.e().openFileInput(str), "UTF-8");
            StringBuilder sb = new StringBuilder();
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                            sb.append(readLine);
                            sb.append('\n');
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            if (th != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            } else {
                                bufferedReader.close();
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    String str2 = this.f31407a;
                    ngr.b(str2, "devtools file read error: " + e.getMessage());
                    inputStreamReader.close();
                }
                return sb.toString();
            } catch (Throwable th4) {
                inputStreamReader.close();
                sb.toString();
                throw th4;
            }
        } catch (IOException | SecurityException e2) {
            ngr.b(this.f31407a, e2.getMessage());
            return null;
        }
    }
}
