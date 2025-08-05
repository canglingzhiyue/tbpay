package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.c;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes5.dex */
public class fwk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEANUP = "CleanUp";
    public static final String CONFIG_KEY_BIZTYPE = "bizType";
    public static final String CONFIG_KEY_DELETE_INTERVAL = "deleteInterval";
    public static final String CONFIG_KEY_DELETE_STRATEGY = "deleteStrategy";
    public static final String CONFIG_KEY_EXPIRED_STRATEGY = "expiredStrategy";
    public static final String CONFIG_KEY_EXPIRED_TIME = "expiredTime";
    public static final String CONFIG_KEY_RETAIN_COUNT = "retainCount";
    public static final String CONFIG_KEY_RETAIN_ORDER = "retainOrder";
    public static final String CONFIG_KEY_TEMPLATE_NAME = "templateName";
    public static final int DEFAULT_DELETE_INTERVAL = 7;
    public static final String DEFAULT_DELETE_STRATEGY = "mark_dirty";
    public static final String DEFAULT_EXPIRED_STRATEGY = "lastModified";
    public static final int DEFAULT_EXPIRED_TIME = 365;
    public static final int DEFAULT_RETAIN_COUNT = 3;
    public static final String DEFAULT_RETAIN_ORDER = "version";
    public static final String DELETE_STRATEGY_ALL_DELETE = "all_delete";
    public static final String DELETE_STRATEGY_MARK_DIRTY_DELETE_FILE = "mark_dirty";
    public static final String EXPIRED_STRATEGY_LAST_MODIFIED = "lastModified";
    public static final String RETAIN_ORDER_VERSION = "version";
    public static final String SP_KEY_LATEST_EXEC_TIME = "latest_exec_time";
    public static final String SP_NAME = "dx_template_storage";

    static {
        kge.a(-390548478);
    }

    public static /* synthetic */ void b(String str, String str2, DXTemplateItem dXTemplateItem, Map map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0dacb45", new Object[]{str, str2, dXTemplateItem, map, new Long(j)});
        } else {
            a(str, str2, dXTemplateItem, map, j);
        }
    }

    public static void a(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8092cfb", new Object[]{str, new Long(j), dXTemplateItem});
        } else if ((!a(str) && !f(str) && !i().containsKey(str)) || !fqi.bl() || TextUtils.isEmpty(str) || dXTemplateItem == null) {
        } else {
            try {
                if (!fwj.a().b(str, dXTemplateItem)) {
                    return;
                }
                s sVar = new s(str);
                sVar.c = new ArrayList();
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_TEMPLATE_FETCH, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_FETCH, s.DX_ERROR_FETCH_TEMPLATE_DIRTY);
                sVar.c.add(aVar);
                sVar.b = dXTemplateItem;
                try {
                    Set<Long> a2 = fwj.a().a(str, j, dXTemplateItem.f11925a);
                    if (a2 != null) {
                        aVar.e = "templateVersions: " + TextUtils.join(",", a2);
                    }
                } catch (Exception e) {
                    aVar.e = "templateVersions: error " + com.taobao.android.dinamicx.exception.a.a(e);
                }
                b.a(sVar);
                if (!DinamicXEngine.j()) {
                    return;
                }
                fuw.d("DXTemplateStorageManager", "访问了已被删除的模版: " + dXTemplateItem.b());
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    @Deprecated
    public static long a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        long j = 0;
        if (!c()) {
            if (DinamicXEngine.j()) {
                fuw.d("DXTemplateStorageManager", "最近已执行过一次文件删除, 跳过");
            }
            a(0L, true);
            return 0L;
        }
        try {
            Map<String, Map<String, a>> b = b();
            if (b != null && !b.isEmpty()) {
                for (Map.Entry<String, Map<String, a>> entry : b.entrySet()) {
                    String key = entry.getKey();
                    Map<String, a> value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null && !value.isEmpty()) {
                        for (a aVar : value.values()) {
                            j += a(key, aVar);
                        }
                    }
                }
            }
            d();
            z = false;
        } catch (Throwable th) {
            a(th);
            z = true;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXTemplateStorageManager", "deleteStaleTemplateFiles deletedSize: " + j + "KB");
        }
        if (!z) {
            a(j, false);
        }
        a(j);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r4.equals("mark_dirty") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long a(java.lang.String r8, tb.fwk.a r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fwk.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r8 = "622b2bf"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            return r8
        L1c:
            r0 = 0
            if (r9 != 0) goto L21
            return r0
        L21:
            java.lang.String r4 = e()
            r5 = -1
            int r6 = r4.hashCode()
            r7 = 931332064(0x3782ffe0, float:1.5616359E-5)
            if (r6 == r7) goto L3f
            r2 = 1099440649(0x41882209, float:17.016619)
            if (r6 == r2) goto L35
            goto L48
        L35:
            java.lang.String r2 = "all_delete"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L48
            r2 = 0
            goto L49
        L3f:
            java.lang.String r3 = "mark_dirty"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L48
            goto L49
        L48:
            r2 = -1
        L49:
            if (r2 == 0) goto L66
            tb.fwh r2 = tb.fwh.a()
            java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r3 = r9.f28161a
            boolean r2 = r2.b(r8, r3)
            if (r2 == 0) goto L65
            tb.fwj r0 = tb.fwj.a()
            java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r1 = r9.f28161a
            r0.a(r8, r1)
            long r8 = r9.a(r8)
            return r8
        L65:
            return r0
        L66:
            tb.fwh r2 = tb.fwh.a()
            java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r3 = r9.f28161a
            boolean r2 = r2.a(r8, r3)
            if (r2 == 0) goto L80
            tb.fwj r0 = tb.fwj.a()
            java.util.List<com.taobao.android.dinamicx.template.download.DXTemplateItem> r1 = r9.f28161a
            r0.a(r8, r1)
            long r8 = r9.a(r8)
            return r8
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fwk.a(java.lang.String, tb.fwk$a):long");
    }

    public static Map<String, Map<String, a>> b() {
        File[] listFiles;
        Map<String, a> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        String b = fwn.a().b();
        Map<String, Set<String>> i = i();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File file = new File(b);
        if (!file.exists() || (listFiles = file.listFiles(new FileFilter() { // from class: tb.fwk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2.isDirectory();
            }
        })) == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            if ((a(file2.getName()) || f(file2.getName()) || i.containsKey(file2.getName()) || fqi.bl()) && (a2 = a(file2)) != null) {
                hashMap.put(file2.getName(), a2);
            }
        }
        return hashMap;
    }

    public static Map<String, a> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b928ffd4", new Object[]{file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        File[] listFiles = file.listFiles(new FileFilter() { // from class: tb.fwk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            a a2 = a(name, file2);
            if (a2 != null) {
                hashMap.put(file2.getName(), a2);
            }
        }
        return hashMap;
    }

    public static a a(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2432aa6", new Object[]{str, file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Set<String> set = h().get(str);
        if (set != null && set.contains(name)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> set2 = i().get(str);
        if (set2 == null) {
            set2 = new HashSet<>();
        }
        File[] listFiles = file.listFiles(new FileFilter() { // from class: tb.fwk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        Arrays.sort(listFiles, e(str));
        long currentTimeMillis = System.currentTimeMillis();
        int b = b(str);
        String d = d(str);
        long c = c(str);
        for (int i = 0; i < listFiles.length; i++) {
            File file2 = listFiles[i];
            if (i < listFiles.length - b || set2.contains(name)) {
                arrayList.add(file2);
            } else if (a(d, currentTimeMillis, c, new File(file2, fxb.DX_MAIN_TEMPLATE_NAME))) {
                arrayList.add(file2);
            }
        }
        if (!arrayList.isEmpty()) {
            return new a(name, arrayList);
        }
        return null;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        int f = f();
        SharedPreferences g = g();
        if (g == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - g.getLong(SP_KEY_LATEST_EXEC_TIME, currentTimeMillis) >= ((long) f);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        SharedPreferences g = g();
        if (g == null) {
            return;
        }
        g.edit().putLong(SP_KEY_LATEST_EXEC_TIME, System.currentTimeMillis()).apply();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : fqi.y(str);
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : fqi.D(str);
    }

    public static Map<String, Set<String>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[0]);
        }
        JSONArray bd = fqi.bd();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < bd.size(); i++) {
            JSONObject jSONObject = bd.getJSONObject(i);
            String string = jSONObject.getString("bizType");
            String string2 = jSONObject.getString("templateName");
            if (hashMap.containsKey(string)) {
                ((Set) hashMap.get(string)).add(string2);
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(string2);
                hashMap.put(string, hashSet);
            }
        }
        return hashMap;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue() : fxr.a(CONFIG_KEY_RETAIN_COUNT, fqi.z(str), 3);
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue() : fxr.a("expiredTime", fqi.z(str), (int) DEFAULT_EXPIRED_TIME) * 24 * 60 * 60 * 1000;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : fxr.a(CONFIG_KEY_DELETE_STRATEGY, fqi.at(), "mark_dirty");
    }

    public static Map<String, Set<String>> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[0]);
        }
        JSONArray bc = fqi.bc();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < bc.size(); i++) {
            JSONObject jSONObject = bc.getJSONObject(i);
            String string = jSONObject.getString("bizType");
            String string2 = jSONObject.getString("templateName");
            if (hashMap.containsKey(string)) {
                ((Set) hashMap.get(string)).add(string2);
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(string2);
                hashMap.put(string, hashSet);
            }
        }
        return hashMap;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : fxr.a(CONFIG_KEY_EXPIRED_STRATEGY, fqi.z(str), "lastModified");
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : fxr.a(CONFIG_KEY_DELETE_INTERVAL, fqi.at(), 7) * 24 * 60 * 60 * 1000;
    }

    public static boolean a(String str, long j, long j2, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55daaa2d", new Object[]{str, new Long(j), new Long(j2), file})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (str.hashCode() == 1959003007) {
            str.equals("lastModified");
        }
        return j - file.lastModified() >= j2;
    }

    public static Comparator<File> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Comparator) ipChange.ipc$dispatch("8d5db219", new Object[]{str});
        }
        String a2 = fxr.a(CONFIG_KEY_RETAIN_ORDER, fqi.z(str), "version");
        if (a2.hashCode() == 351608024) {
            a2.equals("version");
        }
        return new Comparator<File>() { // from class: tb.fwk.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(File file, File file2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue() : a(file, file2);
            }

            public int a(File file, File file2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a3abf709", new Object[]{this, file, file2})).intValue() : (int) (Long.parseLong(file.getName()) - Long.parseLong(file2.getName()));
            }
        };
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
            return;
        }
        com.taobao.android.dinamicx.exception.a.b(th);
        s sVar = new s("dinamicx");
        sVar.c = new ArrayList();
        s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_ERROR_STORAGE_PERF_ERROR);
        aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
        sVar.c.add(aVar);
        b.a(sVar);
    }

    public static void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        try {
            s sVar = new s("dinamicx");
            sVar.c = new ArrayList();
            s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, z ? s.DX_ERROR_STORAGE_PERF_SUCCESS_SKIP : s.DX_ERROR_STORAGE_PERF_SUCCESS);
            if (z) {
                aVar.e = "DXTemplateStorageManager: 最近已执行过一次文件删除, 跳过";
            } else {
                aVar.e = "DXTemplateStorageManager deleteStaleTemplateFiles deletedSize: " + j + "KB";
            }
            sVar.c.add(aVar);
            b.a(sVar);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public static SharedPreferences g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("f516cec2", new Object[0]);
        }
        Context i = DinamicXEngine.i();
        if (i != null) {
            return i.getSharedPreferences(SP_NAME, 0);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final List<File> b = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        public final List<DXTemplateItem> f28161a = new ArrayList();

        static {
            kge.a(-2016570545);
        }

        public a(String str, List<File> list) {
            for (File file : list) {
                String name = file.getName();
                if (!TextUtils.isEmpty(name)) {
                    long d = fqr.d(name);
                    if (d != 0) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f11925a = str;
                        dXTemplateItem.b = d;
                        this.f28161a.add(dXTemplateItem);
                        this.b.add(file);
                    }
                }
            }
        }

        public long a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
            }
            long[] jArr = new long[1];
            for (File file : this.b) {
                if (!fwk.f(str)) {
                    boolean a2 = c.a(file, jArr);
                    StringBuilder sb = new StringBuilder();
                    sb.append("deleteDir ");
                    sb.append(a2 ? "success" : "fail");
                    sb.append(ResponseProtocolType.COMMENT);
                    sb.append(file.getAbsolutePath());
                    String sb2 = sb.toString();
                    if (DinamicXEngine.j()) {
                        fuw.d("DXTemplateStorageManager", sb2);
                    }
                    fux.b("DXTemplateStorageManager: " + sb2);
                }
            }
            return jArr[0] / 1024;
        }
    }

    public static long b(File file) {
        File[] listFiles;
        long b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58420194", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    b = file2.length();
                } else if (file2.isDirectory()) {
                    b = b(file2);
                }
                j += b;
            }
        }
        return j;
    }

    private static void a(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        try {
            fxe.a(new fxd() { // from class: tb.fwk.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    File[] listFiles;
                    AnonymousClass5 anonymousClass5 = this;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{anonymousClass5});
                        return;
                    }
                    long nanoTime = System.nanoTime();
                    HashMap hashMap = new HashMap();
                    hashMap.put("deletedSize", String.valueOf(j));
                    hashMap.put("strategy", fwk.e());
                    hashMap.put("expiredTime", String.valueOf((int) fwk.DEFAULT_EXPIRED_TIME));
                    hashMap.put("remainCount", String.valueOf(3));
                    hashMap.put(fwk.CONFIG_KEY_DELETE_INTERVAL, String.valueOf(fwk.f()));
                    String b = fwn.a().b();
                    if (TextUtils.isEmpty(b)) {
                        return;
                    }
                    File file = new File(b);
                    if (!file.exists() || (listFiles = file.listFiles(new FileFilter() { // from class: tb.fwk.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.io.FileFilter
                        public boolean accept(File file2) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2.isDirectory();
                        }
                    })) == null || listFiles.length == 0) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        long b2 = fwk.b(file2) / 1024;
                        File[] fileArr = listFiles;
                        if (b2 > 1024) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("size", (Object) Long.valueOf(b2));
                            jSONObject.put("bizType", (Object) file2.getName());
                            jSONArray.add(jSONObject);
                        }
                        File[] listFiles2 = file2.listFiles(new FileFilter() { // from class: tb.fwk.5.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.io.FileFilter
                            public boolean accept(File file3) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("50e018ca", new Object[]{this, file3})).booleanValue() : file3.isDirectory();
                            }
                        });
                        if (listFiles2 != null && listFiles2.length != 0) {
                            int length2 = listFiles2.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                File file3 = listFiles2[i2];
                                long b3 = fwk.b(file3) / 1024;
                                File[] fileArr2 = listFiles2;
                                int i3 = length2;
                                if (b3 > fqi.bk()) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("size", (Object) Long.valueOf(b3));
                                    jSONObject2.put("bizType", (Object) file2.getName());
                                    jSONObject2.put("template", (Object) file3.getName());
                                    jSONArray2.add(jSONObject2);
                                }
                                i2++;
                                listFiles2 = fileArr2;
                                length2 = i3;
                            }
                        }
                        i++;
                        anonymousClass5 = this;
                        listFiles = fileArr;
                    }
                    String jSONArray3 = jSONArray.toString();
                    String jSONArray4 = jSONArray2.toString();
                    hashMap.put("existFiles", jSONArray3);
                    hashMap.put("templateFiles", jSONArray4);
                    hashMap.put("totalSize", String.valueOf(fwk.b(file) / 1024));
                    fwk.b(fwk.CLEANUP, fwk.CLEANUP, null, hashMap, System.nanoTime() - nanoTime);
                }
            });
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private static void a(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e710fe04", new Object[]{str, str2, dXTemplateItem, map, new Long(j)});
        } else {
            b.a(0, str2, CLEANUP, str, dXTemplateItem, map, j, true);
        }
    }
}
