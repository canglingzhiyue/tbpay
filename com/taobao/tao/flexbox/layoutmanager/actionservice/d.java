package com.taobao.tao.flexbox.layoutmanager.actionservice;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.search.common.util.k;
import com.taobao.tao.flexbox.layoutmanager.actionservice.b;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.ActionServiceMgrModule;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.TrackerModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19962a;
    private Map<String, b> b;
    private int c;

    /* loaded from: classes8.dex */
    public interface a {
        void a(b bVar);

        void a(String str);
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f19965a;
        public String b;
        public String c;
        public String d;
        public Class e;
        public boolean f;

        static {
            kge.a(-283173578);
        }
    }

    /* loaded from: classes8.dex */
    public interface c {
        void a(boolean z);
    }

    static {
        kge.a(-702869944);
    }

    public static /* synthetic */ int a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fc6a02a", new Object[]{dVar, new Integer(i)})).intValue();
        }
        dVar.c = i;
        return i;
    }

    public static /* synthetic */ void a(d dVar, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba208b16", new Object[]{dVar, str});
        } else {
            dVar.e(str);
        }
    }

    public void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b46b39", new Object[]{this, str, aVar});
            return;
        }
        final b c2 = c(str);
        if (c2.b != null) {
            aVar.a(c2);
        } else if (c2.f19965a.startsWith("file://")) {
            String[] split = c2.f19965a.split("/");
            String a2 = a(split[split.length - 1], com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a());
            if (!TextUtils.isEmpty(a2)) {
                c2.b = a2;
                aVar.a(c2);
                return;
            }
            aVar.a("JS code not exist in " + c2.f19965a);
        } else if (c2.f19965a.startsWith("http")) {
            String streamByUrl = android.taobao.windvane.packageapp.zipapp.utils.c.getStreamByUrl(c2.f19965a);
            if (!TextUtils.isEmpty(streamByUrl)) {
                c2.b = streamByUrl;
                aVar.a(c2);
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.actionservice.b.a().a(c2.f19965a, new b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    b bVar = c2;
                    bVar.b = str2;
                    aVar.a(bVar);
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a aVar2 = aVar;
                    aVar2.a("faile to download JS code from " + c2.f19965a);
                }
            });
        } else {
            aVar.a("jsCode not found");
        }
    }

    public boolean a(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Map<String, b> map = this.b;
        boolean z = (map == null || (bVar = map.get(str)) == null || (bVar.d == null && bVar.e == null)) ? false : true;
        if (z) {
            return z;
        }
        b bVar2 = com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().e().b.get(str);
        return (bVar2 == null || (bVar2.d == null && bVar2.e == null)) ? false : true;
    }

    public boolean b(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        Map<String, b> map = this.b;
        return (map == null || (bVar = map.get(str)) == null || (bVar.f19965a == null && bVar.b == null)) ? false : true;
    }

    public d() {
        a("$navigator", null, "com.taobao.android.actionservice.NavModule");
        a("$", ActionServiceMgrModule.class);
        a("$tracker", TrackerModule.class);
        a("$login", null, "com.taobao.android.actionservice.LoginModule");
        a("$mtop", MtopModule.class);
        this.c = 0;
        String packageName = com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a() != null ? com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a().getPackageName() : "com.taobao.taobao";
        if (packageName.equals("com.taobao.taobao")) {
            this.f19962a = "https://h5.m.taobao.com/app/actionservice/taobaoModuleMapping.js";
        } else if (packageName.equals("com.tmall.wireless")) {
            this.f19962a = "https://h5.m.taobao.com/app/actionservice/tmallModuleMapping.js";
        } else {
            this.f19962a = "https://h5.m.taobao.com/app/actionservice/moduleMapping.js";
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f19962a = this.f19962a.replace("h5", "wapp");
        }
    }

    public static String a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
            StringBuilder sb = new StringBuilder(proxy_open.available() + 10);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(proxy_open));
            char[] cArr = new char[2048];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            bufferedReader.close();
            if (proxy_open != null) {
                try {
                    proxy_open.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        } catch (IOException e2) {
            Log.e("ModuleManager", "loadFileContent: " + e2.getMessage());
            return "";
        }
    }

    public void a(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d55a2d", new Object[]{this, cVar});
            return;
        }
        int i = this.c;
        if (i == 2 || i == 1) {
            return;
        }
        String streamByUrl = android.taobao.windvane.packageapp.zipapp.utils.c.getStreamByUrl(this.f19962a);
        if (!TextUtils.isEmpty(streamByUrl)) {
            try {
                e(streamByUrl);
                this.c = 2;
                cVar.a(true);
                return;
            } catch (JSONException e) {
                Log.e("ModuleManager", "initModuleMappings in AWP: " + e.getMessage());
                this.c = -1;
                cVar.a(false);
                return;
            }
        }
        this.c = 1;
        com.taobao.tao.flexbox.layoutmanager.actionservice.b.a().a(this.f19962a, new b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                try {
                    d.a(d.this, str);
                    d.a(d.this, 2);
                    cVar.a(true);
                } catch (JSONException e2) {
                    Log.e("ModuleManager", "initModuleMappings in Download: " + e2.getMessage());
                    d.a(d.this, -1);
                    cVar.a(false);
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                d.a(d.this, -1);
                cVar.a(false);
            }
        });
    }

    private void e(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        String a2 = a("ActionService_ModuleMapping.js", com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a());
        if (!TextUtils.isEmpty(a2)) {
            a(JSONObject.parseObject(a2));
        }
        a(JSONObject.parseObject(str));
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                b bVar = new b();
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.startsWith(k.HTTPS_PREFIX) || str.startsWith(k.HTTP_PREFIX) || str.startsWith("file://")) {
                        bVar.f19965a = str;
                    } else {
                        if (key.startsWith("android-")) {
                            key = key.substring(8);
                        }
                        String[] split = str.split(":");
                        bVar.c = split[0];
                        bVar.d = split[1];
                    }
                } else if (value instanceof JSONArray) {
                    a(bVar, (JSONArray) value);
                }
                if (this.b.get(key) == null) {
                    this.b.put(key, bVar);
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i = 0; i < length; i++) {
            if (Integer.parseInt(split2[i]) < Integer.parseInt(split[i])) {
                return true;
            }
            if (Integer.parseInt(split2[i]) > Integer.parseInt(split[i])) {
                return false;
            }
        }
        return split.length >= split2.length;
    }

    private void a(b bVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd806f6", new Object[]{this, bVar, jSONArray});
            return;
        }
        String i = android.taobao.windvane.config.a.a().i();
        JSONObject jSONObject = null;
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String b2 = b(jSONObject2);
            if (a(i, b2) && (jSONObject == null || a(b2, b(jSONObject)))) {
                jSONObject = jSONObject2;
            }
        }
        if (jSONObject == null) {
            return;
        }
        bVar.f19965a = jSONObject.getString("url");
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        String str = null;
        if (jSONObject != null) {
            str = jSONObject.getString("android-version");
        }
        return TextUtils.isEmpty(str) ? jSONObject.getString("version") : str;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c == 2;
    }

    public b c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("86da17c8", new Object[]{this, str}) : this.b.get(str);
    }

    public b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9fdb6967", new Object[]{this, str});
        }
        b bVar = this.b.get(str);
        return bVar == null ? com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().e().d(str) : bVar;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        b bVar = new b();
        bVar.c = str2;
        bVar.d = str3;
        this.b.put(str, bVar);
    }

    public void a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        b bVar = new b();
        bVar.e = cls;
        this.b.put(str, bVar);
    }
}
