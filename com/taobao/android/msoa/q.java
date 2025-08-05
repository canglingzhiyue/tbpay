package com.taobao.android.msoa;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.p;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class> f14443a;
    private static Map<String, p> b;
    private static Map<String, List<String>> c;
    private static String d;

    /* loaded from: classes6.dex */
    interface a {
        void a();
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        d = str;
        return str;
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{map});
        }
        b = map;
        return map;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : b;
    }

    public static /* synthetic */ Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{map});
        }
        c = map;
        return map;
    }

    static {
        HashMap hashMap = new HashMap();
        f14443a = hashMap;
        hashMap.put("int", Integer.TYPE);
        f14443a.put("long", Long.TYPE);
        f14443a.put(com.taobao.android.weex_framework.util.a.ATOM_boolean, Boolean.TYPE);
        f14443a.put(PopStrategy.IDENTIFIER_FLOAT, Float.TYPE);
        f14443a.put("double", Double.TYPE);
        f14443a.put("byte", Byte.TYPE);
        f14443a.put("char", Character.TYPE);
        f14443a.put("short", Short.TYPE);
    }

    public static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f5646f", new Object[]{aVar});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.android.msoa.q.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    q.b(q.a());
                    q.c(q.b());
                    q.b(q.a(q.c()));
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            });
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01bf -> B:93:0x01c2). Please submit an issue!!! */
    public static Map<String, p> a() {
        BufferedReader bufferedReader;
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        BufferedReader bufferedReader2 = null;
        StringBuilder sb = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "msoap.json")));
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                    }
                } catch (Throwable th) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "p_backup.json")));
            }
            bufferedReader2 = bufferedReader;
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2) && (parseArray = JSONArray.parseArray(sb2)) != null && parseArray.size() > 0) {
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("bizName");
                        JSONArray jSONArray = jSONObject.getJSONArray(ServiceNode.TAG);
                        if (jSONArray != null && jSONArray.size() > 0) {
                            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                if (jSONObject2 != null) {
                                    p pVar = new p();
                                    pVar.f14441a = string;
                                    pVar.b = jSONObject2.getString("serviceId");
                                    pVar.c = jSONObject2.getString("version");
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("provider");
                                    if (jSONObject3 != null) {
                                        pVar.d = jSONObject3.getString("className");
                                        pVar.e = jSONObject3.getString("action");
                                        pVar.f = jSONObject3.getString("func");
                                        pVar.g = jSONObject3.getBoolean("needTimeout") == null ? false : jSONObject3.getBoolean("needTimeout").booleanValue();
                                        pVar.k = jSONObject3.getString("type");
                                        pVar.m = jSONObject3.getString("bundleName");
                                        pVar.l = jSONObject3.getString("implClassName");
                                    }
                                    pVar.j = jSONObject2.getIntValue("platform");
                                    if (pVar.j == 0) {
                                        pVar.j = MSOAServiceDefinition.Platform.ALL.value();
                                    }
                                    JSONArray jSONArray2 = jSONObject2.getJSONArray("params");
                                    if (jSONArray2 != null && jSONArray2.size() > 0) {
                                        pVar.h = new ArrayList();
                                        pVar.i = new Class[jSONArray2.size()];
                                        for (int i3 = 0; i3 < jSONArray2.size(); i3++) {
                                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                                            if (jSONObject4 != null) {
                                                p.a aVar = new p.a();
                                                aVar.f14442a = jSONObject4.getString("name");
                                                String string2 = jSONObject4.getString("type");
                                                if (f14443a.containsKey(string2)) {
                                                    aVar.b = f14443a.get(string2);
                                                    pVar.i[i3] = aVar.b;
                                                } else {
                                                    try {
                                                        aVar.b = Class.forName(string2);
                                                    } catch (ClassNotFoundException unused2) {
                                                        aVar.b = com.taobao.android.msoa.util.a.b(pVar.m, string2);
                                                    }
                                                    pVar.i[i3] = aVar.b;
                                                }
                                                pVar.h.add(aVar);
                                            }
                                        }
                                    }
                                    concurrentHashMap.put(pVar.b + "@" + pVar.c, pVar);
                                }
                            }
                        }
                    }
                }
            }
            bufferedReader2.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return concurrentHashMap;
    }

    public static Map<String, List<String>> b() {
        BufferedReader bufferedReader;
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        BufferedReader bufferedReader2 = null;
        StringBuilder sb = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "msoac.json")));
                } catch (Exception unused) {
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                } catch (Throwable th) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "c_backup.json")));
            }
            bufferedReader2 = bufferedReader;
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2) && (parseArray = JSON.parseArray(sb2)) != null && parseArray.size() > 0) {
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("bizName");
                        JSONArray jSONArray = jSONObject.getJSONArray("serviceDependency");
                        if (jSONArray != null && jSONArray.size() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                if (jSONObject2 != null) {
                                    String string2 = jSONObject2.getString("serviceId");
                                    String string3 = jSONObject2.getString("version");
                                    arrayList.add(string2 + "@" + string3);
                                }
                            }
                            concurrentHashMap.put(string, arrayList);
                        }
                    }
                }
            }
            bufferedReader2.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return concurrentHashMap;
    }

    public static String a(Map<String, p> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList();
        if (map == null) {
            return null;
        }
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, new Comparator<String>() { // from class: com.taobao.android.msoa.q.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
            }

            public int a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
            }
        });
        for (String str : arrayList) {
            sb.append(str);
            sb.append(";");
        }
        return com.taobao.orange.util.c.a(sb.toString());
    }

    public static p a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("8dd73137", new Object[]{str});
        }
        Map<String, p> map = b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if ("msoa.taobao.privilege.weex".equals(str) || "msoa.taobao.privilege.windvane".equals(str)) {
            return true;
        }
        if (str2 != null && str2.startsWith("msoa.taobao.detail.showsku")) {
            return true;
        }
        Map<String, List<String>> map = c;
        return map != null && map.containsKey(str) && c.get(str).contains(str2);
    }

    public static boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{new Integer(i), str})).booleanValue();
        }
        Map<String, p> map = b;
        return map != null && (i & map.get(str).j) > 0;
    }
}
