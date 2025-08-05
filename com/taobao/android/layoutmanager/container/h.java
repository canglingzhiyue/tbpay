package com.taobao.android.layoutmanager.container;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gvw;
import tb.kge;
import tb.oea;
import tb.oec;
import tb.ogg;
import tb.ohh;
import tb.ohk;

/* loaded from: classes5.dex */
public class h implements n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f13213a;
    private static Map<String, b> b;

    /* loaded from: classes5.dex */
    private interface b {
        boolean a(JSONObject jSONObject, JSONArray jSONArray, y yVar);
    }

    static {
        kge.a(1083670016);
        kge.a(-1705195404);
        f13213a = null;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("mtop", new c());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString(IStorage.TYPE_DSL);
            ohh.b("tnode_prefetch_config_" + string, jSONObject);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n
    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object b2 = ohh.b("tnode_prefetch_config_" + str);
        if (!(b2 instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) b2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n
    public boolean a(String str, final y yVar) {
        JSONObject a2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca048181", new Object[]{this, str, yVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (a2 = a(str)) == null || (jSONArray = a2.getJSONArray("list")) == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("type");
            final b bVar = b.get(string);
            if (bVar != null && a(oec.a(l.a((String) null, jSONObject.get("enable"), yVar), true), oec.a(jSONObject.get("minVersion"), ""), oec.a(jSONObject.get("minOSVersion"), ""), oec.a(jSONObject.get("login"), false)) && gvw.a(string, str, yVar, jSONObject)) {
                final JSONArray jSONArray2 = jSONObject.getJSONArray("calculateArgs");
                final JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    long a3 = oec.a(jSONObject.get("delay"), 0L);
                    if (a3 <= 0) {
                        try {
                            bVar.a(jSONObject2, jSONArray2, yVar);
                        } catch (Exception e) {
                            ogg.b("prefetch error:" + e.getMessage());
                        }
                    } else {
                        oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.container.h.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    bVar.a(jSONObject2, jSONArray2, yVar);
                                } catch (Exception e2) {
                                    ogg.b("prefetch error:" + e2.getMessage());
                                }
                            }
                        }, a3);
                    }
                }
                z = true;
            }
        }
        return z;
    }

    /* loaded from: classes5.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1182738416);
            kge.a(1030127977);
        }

        private c() {
        }

        @Override // com.taobao.android.layoutmanager.container.h.b
        public boolean a(JSONObject jSONObject, JSONArray jSONArray, y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a336cdc3", new Object[]{this, jSONObject, jSONArray, yVar})).booleanValue();
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (jSONArray != null && jSONArray.contains(key) && yVar != null) {
                        value = l.a((String) null, value, yVar);
                    }
                    jSONObject2.put(key, value);
                }
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("options");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
                jSONObject2.put("options", (Object) jSONObject3);
            }
            jSONObject3.put("prefetch", (Object) true);
            MtopModule.request(new g.c(null, jSONObject2, null));
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Map<String, Class> f13215a;
        private static JSONObject b;
        private JSONObject c = new JSONObject();
        private Map d;

        static {
            kge.a(-1921551737);
            kge.a(-1679197260);
            HashMap hashMap = new HashMap();
            f13215a = hashMap;
            com.taobao.tao.flexbox.layoutmanager.filter.a.a(hashMap);
            b = oea.b(Globals.getApplication());
        }

        public a(Map<String, String> map) {
            Uri parse;
            this.d = map;
            if (map != null) {
                this.c.put("query", (Object) map);
                String str = map.get("tnode");
                if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                int lastIndexOf = str.lastIndexOf("?");
                if (lastIndexOf > 0) {
                    hashMap.put("dslUrl", str.substring(0, lastIndexOf));
                }
                Map<String, String> b2 = ohk.b(parse);
                if (b2 != null) {
                    hashMap.putAll(b2);
                }
                this.c.put("tnodeParams", (Object) hashMap);
            }
        }

        public Map a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.d;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.y
        public Object a(String str, String str2, List list) {
            Class cls;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7e58fc65", new Object[]{this, str, str2, list});
            }
            List<String> b2 = oec.b(str2.substring(2), '.');
            if (b2 != null && b2.size() == 2 && (cls = f13215a.get(b2.get(0))) != null) {
                return com.taobao.tao.flexbox.layoutmanager.filter.a.a(this, null, null, b2.get(0), cls, b2.get(1), list);
            }
            return null;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.y
        public Object a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
            }
            if (str.equals(".")) {
                return this.c;
            }
            if ('.' == str.charAt(0)) {
                str = str.substring(1);
            }
            if (!str.startsWith("$.")) {
                return null;
            }
            String substring = str.substring(2);
            if (substring.startsWith("vm.")) {
                return Utils.objectForKeyPath(this.c, substring.substring(3));
            }
            return Utils.objectForKeyPath(b, substring);
        }
    }

    private static boolean a(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a744058", new Object[]{new Boolean(z), str, str2, new Boolean(z2)})).booleanValue();
        }
        if (!z) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && !oec.a(Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 16384).versionName, str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str2) && !oec.a(Build.VERSION.RELEASE, str2)) {
            return false;
        }
        if (z2) {
            if (!com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g().b()) {
                return false;
            }
        }
        return true;
    }
}
