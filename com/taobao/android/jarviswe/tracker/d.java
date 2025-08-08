package com.taobao.android.jarviswe.tracker;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import tb.gse;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f12981a;
    private int c = 0;
    private ConcurrentHashMap<String, JSONObject> b = new ConcurrentHashMap<>();

    /* loaded from: classes5.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(Boolean bool);
    }

    static {
        kge.a(1894226736);
    }

    public static /* synthetic */ ArrayList a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2d9a4ff9", new Object[]{dVar, str}) : dVar.a(str);
    }

    public static /* synthetic */ ConcurrentHashMap a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("c4184f31", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ boolean a(d dVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbef8923", new Object[]{dVar, str, arrayList, arrayList2})).booleanValue() : dVar.a(str, arrayList, arrayList2);
    }

    public static /* synthetic */ boolean a(d dVar, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("466ee719", new Object[]{dVar, arrayList, arrayList2})).booleanValue() : dVar.a(arrayList, arrayList2);
    }

    public static /* synthetic */ ArrayList b(d dVar, ArrayList arrayList, ArrayList arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2cd92b8e", new Object[]{dVar, arrayList, arrayList2}) : dVar.b(arrayList, arrayList2);
    }

    private d() {
    }

    public static synchronized d a() {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("ac602095", new Object[0]);
            }
            if (f12981a == null) {
                f12981a = new d();
            }
            return f12981a;
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cd89f8", new Object[]{this, aVar});
            return;
        }
        try {
            com.taobao.android.jarviswe.a.a().a("Jarvis", "JarvisInitTask", null, new gse() { // from class: com.taobao.android.jarviswe.tracker.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gse
                public void notify(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                        return;
                    }
                    try {
                        JSONObject parseObject = JSONObject.parseObject(str2);
                        d.this.a(parseObject);
                        if (aVar == null) {
                            return;
                        }
                        aVar.a(parseObject);
                    } catch (Throwable unused) {
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(null);
                    }
                }

                @Override // tb.gse
                public void errorReport(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(null);
                }
            });
        } catch (Throwable unused) {
            if (aVar == null) {
                return;
            }
            aVar.a(null);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            try {
                Iterator<Object> it = jSONObject.getJSONArray("feature_table").iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it.next();
                    String string = jSONObject2.getString("biz_name");
                    if (string != null) {
                        this.b.put(string, jSONObject2);
                    }
                }
            } catch (Throwable unused) {
                LogUtil.e("JarvisFeatureTableManager", "updateFeatureTables error");
            }
        }
    }

    private ArrayList<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        JSONObject jSONObject = this.b.get(str);
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            Iterator<Object> it = jSONObject.getJSONArray("features").iterator();
            while (it.hasNext()) {
                arrayList.add(((JSONObject) it.next()).getString("feature_name"));
            }
        }
        return arrayList;
    }

    private boolean a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c91f8ac", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(arrayList);
        return arrayList3.size() > 0;
    }

    private ArrayList<String> b(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d5f37443", new Object[]{this, arrayList, arrayList2});
        }
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        arrayList3.removeAll(arrayList);
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final java.lang.String r10, java.util.ArrayList<java.lang.String> r11, final java.util.ArrayList<java.util.Map> r12, final com.taobao.android.jarviswe.tracker.d.b r13) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.jarviswe.tracker.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r1[r3] = r10
            r10 = 2
            r1[r10] = r11
            r10 = 3
            r1[r10] = r12
            r10 = 4
            r1[r10] = r13
            java.lang.String r10 = "637f720d"
            r0.ipc$dispatch(r10, r1)
            return
        L1e:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r11 = ""
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.alibaba.fastjson.JSONObject> r0 = r9.b     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L86
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L37
        L34:
            r6 = r11
            r2 = 1
            goto L4a
        L37:
            java.lang.String r11 = "table_name"
            java.lang.String r11 = r0.getString(r11)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r1 = r9.a(r11)     // Catch: java.lang.Throwable -> L86
            boolean r1 = r9.a(r1, r7)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L49
            goto L34
        L49:
            r6 = r11
        L4a:
            if (r2 == 0) goto L63
            int r11 = r9.c     // Catch: java.lang.Throwable -> L86
            if (r11 > 0) goto L63
            int r11 = r9.c     // Catch: java.lang.Throwable -> L86
            int r11 = r11 + r3
            r9.c = r11     // Catch: java.lang.Throwable -> L86
            com.taobao.android.jarviswe.tracker.d$2 r11 = new com.taobao.android.jarviswe.tracker.d$2     // Catch: java.lang.Throwable -> L86
            r2 = r11
            r3 = r9
            r4 = r10
            r5 = r13
            r8 = r12
            r2.<init>()     // Catch: java.lang.Throwable -> L86
            r9.a(r11)     // Catch: java.lang.Throwable -> L86
            goto L8e
        L63:
            if (r0 == 0) goto L85
            if (r2 == 0) goto L78
            java.util.ArrayList r10 = r9.a(r6)     // Catch: java.lang.Throwable -> L86
            boolean r11 = r9.a(r10, r7)     // Catch: java.lang.Throwable -> L86
            if (r11 == 0) goto L78
            java.util.ArrayList r10 = r9.b(r10, r7)     // Catch: java.lang.Throwable -> L86
            r7.removeAll(r10)     // Catch: java.lang.Throwable -> L86
        L78:
            boolean r10 = r9.a(r6, r7, r12)     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L85
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L86
            r13.a(r10)     // Catch: java.lang.Throwable -> L86
        L85:
            return
        L86:
            r10 = move-exception
            java.lang.String r11 = "JarvisFeatureTableManager"
            java.lang.String r12 = "saveBizFeature"
            com.tmall.android.dai.internal.util.LogUtil.e(r11, r12, r10)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.jarviswe.tracker.d.a(java.lang.String, java.util.ArrayList, java.util.ArrayList, com.taobao.android.jarviswe.tracker.d$b):void");
    }

    private boolean a(String str, ArrayList<String> arrayList, ArrayList<Map> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88a67bf6", new Object[]{this, str, arrayList, arrayList2})).booleanValue();
        }
        if (arrayList != null) {
            try {
                if (arrayList.size() != 0 && arrayList2 != null && arrayList2.size() != 0) {
                    DbManager dbManager = DbManager.getInstance();
                    HashMap hashMap = new HashMap();
                    hashMap.put("data_names", str);
                    dbManager.beginTransaction("JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap);
                    Iterator<Map> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Map next = it.next();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<String> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object obj = next.get(it2.next());
                            if (obj != null) {
                                arrayList3.add("'" + obj + "'");
                            } else {
                                arrayList3.add("null");
                            }
                        }
                        String str2 = "INSERT INTO " + str + " (" + StringUtils.join(",", arrayList) + ") VALUES (" + StringUtils.join(",", arrayList3) + ");";
                        LogUtil.d("saveBizFeatureToDB", str2);
                        LogUtil.d("saveBizFeatureToDB", "result:" + dbManager.insert(str2, null, "JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap));
                    }
                    dbManager.endTransaction("JarvisFeatureTableManager", "saveBizFeatureToDB", hashMap);
                    return true;
                }
            } catch (Throwable th) {
                LogUtil.e("JarvisFeatureTableManager", "saveBizFeatureToDB", th);
            }
        }
        return false;
    }
}
