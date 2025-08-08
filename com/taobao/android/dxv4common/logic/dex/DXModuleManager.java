package com.taobao.android.dxv4common.logic.dex;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.g;
import com.taobao.android.dinamicx.template.download.h;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxe;
import tb.kge;

/* loaded from: classes5.dex */
public class DXModuleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ASSET_DEPENDENCIES_DIR = "dinamicx/native_logic_dependencies/dependencies.json";
    private static final String ROOT_DIR = "dinamicx_logic/native_logic_dependencies";
    private static final String SEPARATOR = "/";
    private h dxDownloader;
    private File fileRoorPath;
    private Map<String, Map<String, DXNativeLogicLoader>> logicMaps;
    private Map<String, Map<String, DXNativeLogicLoader>> moduleDependenciesMap;

    /* renamed from: com.taobao.android.dxv4common.logic.dex.DXModuleManager$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f12236a;
        public final /* synthetic */ b b;
        public final /* synthetic */ long d;

        public AnonymousClass1(JSONArray jSONArray, b bVar, long j) {
            this.f12236a = jSONArray;
            this.b = bVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXModuleManager.this.download(this.f12236a, new c() { // from class: com.taobao.android.dxv4common.logic.dex.DXModuleManager.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        List<DXNativeLogicLoader> access$200 = DXModuleManager.access$200(DXModuleManager.this, AnonymousClass1.this.f12236a);
                        if (AnonymousClass1.this.b == null) {
                            return;
                        }
                        AnonymousClass1.this.b.a(access$200);
                    }

                    @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.c
                    public void a(JSONArray jSONArray) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                            return;
                        }
                        String str = AnonymousClass1.this.d + " first download fail , retry " + JSON.toJSONString(jSONArray);
                        fux.b(str);
                        s sVar = new s("dinamicx");
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DX_V4_LOGIC_4100005);
                        aVar.e = str;
                        sVar.c.add(aVar);
                        com.taobao.android.dinamicx.monitor.b.a(sVar);
                        DXModuleManager.this.download(jSONArray, new c() { // from class: com.taobao.android.dxv4common.logic.dex.DXModuleManager.1.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.c
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    return;
                                }
                                List<DXNativeLogicLoader> access$200 = DXModuleManager.access$200(DXModuleManager.this, AnonymousClass1.this.f12236a);
                                if (AnonymousClass1.this.b == null) {
                                    return;
                                }
                                AnonymousClass1.this.b.a(access$200);
                            }

                            @Override // com.taobao.android.dxv4common.logic.dex.DXModuleManager.c
                            public void a(JSONArray jSONArray2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray2});
                                    return;
                                }
                                String str2 = AnonymousClass1.this.d + " second download failed " + JSON.toJSONString(jSONArray2);
                                if (AnonymousClass1.this.b != null) {
                                    AnonymousClass1.this.b.a(str2);
                                }
                                fux.b(str2);
                                s sVar2 = new s("dinamicx");
                                s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DX_V4_LOGIC_4100006);
                                aVar2.e = str2;
                                sVar2.c.add(aVar2);
                                com.taobao.android.dinamicx.monitor.b.a(sVar2);
                            }
                        });
                    }
                });
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final DXModuleManager f12240a;

        static {
            kge.a(574530970);
            f12240a = new DXModuleManager(null);
        }

        public static /* synthetic */ DXModuleManager a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXModuleManager) ipChange.ipc$dispatch("17e27db4", new Object[0]) : f12240a;
        }
    }

    /* loaded from: classes5.dex */
    interface b {
        void a(String str);

        void a(List<DXNativeLogicLoader> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void a(JSONArray jSONArray);
    }

    static {
        kge.a(1804529029);
    }

    public /* synthetic */ DXModuleManager(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ List access$200(DXModuleManager dXModuleManager, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10f1c7c", new Object[]{dXModuleManager, jSONArray}) : dXModuleManager.afterDownload(jSONArray);
    }

    private DXModuleManager() {
        this.moduleDependenciesMap = new ConcurrentHashMap();
        this.logicMaps = new ConcurrentHashMap();
        if (this.dxDownloader == null) {
            this.dxDownloader = new g();
        } else {
            this.dxDownloader = u.a();
        }
        this.fileRoorPath = new File(DinamicXEngine.i().getFilesDir(), ROOT_DIR);
        if (!this.fileRoorPath.exists()) {
            this.fileRoorPath.mkdirs();
        }
    }

    public static DXModuleManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXModuleManager) ipChange.ipc$dispatch("6f8645e", new Object[0]) : a.a();
    }

    public void load(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dae547", new Object[]{this, str, bVar});
            return;
        }
        JSONArray parseArray = JSON.parseArray(str);
        if (parseArray == null || parseArray.size() == 0) {
            bVar.a((List<DXNativeLogicLoader>) null);
            return;
        }
        long nanoTime = System.nanoTime();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fxe.e(new AnonymousClass1(parseArray, bVar, nanoTime));
            return;
        }
        download(parseArray, null);
        List<DXNativeLogicLoader> afterDownload = afterDownload(parseArray);
        if (bVar == null) {
            return;
        }
        bVar.a(afterDownload);
    }

    private synchronized List<DXNativeLogicLoader> afterDownload(JSONArray jSONArray) {
        String str;
        String str2;
        String str3;
        String str4;
        DXNativeLogicLoader dXNativeLogicLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("78101fb4", new Object[]{this, jSONArray});
        }
        String str5 = null;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        String str6 = "baseMain";
        String str7 = "1";
        String str8 = null;
        String str9 = null;
        int i = 0;
        while (i < size) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("name");
                str = jSONObject.getString("version");
                str2 = string;
            } else {
                str = str5;
                str2 = str;
            }
            int i2 = i - 1;
            if (i2 < 0 || i2 >= size) {
                str6 = "baseMain";
                str7 = "1";
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2 != null) {
                    str6 = jSONObject2.getString("name");
                    str7 = jSONObject2.getString("version");
                }
            }
            String str10 = str6;
            String str11 = str7;
            int i3 = i + 1;
            if (i3 < 0 || i3 >= size) {
                str3 = "null";
                str4 = "null";
            } else {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                if (jSONObject3 != null) {
                    str8 = jSONObject3.getString("name");
                    str9 = jSONObject3.getString("version");
                }
                str3 = str8;
                str4 = str9;
            }
            String str12 = str;
            String str13 = str2;
            String generatorKey = generatorKey(str10, str11, str2, str, str3, str4);
            String string2 = jSONObject.getString("type");
            Map<String, DXNativeLogicLoader> map = this.logicMaps.get(str13);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.logicMaps.put(str13, map);
            }
            DXNativeLogicLoader dXNativeLogicLoader2 = map.get(generatorKey);
            if (dXNativeLogicLoader2 != null) {
                if (DinamicXEngine.j()) {
                    fuw.b("获取到logicLoader  直接跳出  " + generatorKey);
                }
                if (bx.i()) {
                    fuw.f("获取到logicLoader memoryCacheVersion " + generatorKey + "  loader  " + dXNativeLogicLoader2.hashCode() + " thread " + Thread.currentThread().getName());
                }
                arrayList.add(dXNativeLogicLoader2);
                str6 = str10;
                str7 = str11;
            } else {
                String str14 = this.fileRoorPath.getAbsolutePath() + "/" + str13 + "/" + str12 + "/" + str13 + "." + string2;
                if (i == 0) {
                    dXNativeLogicLoader = new DXNativeLogicLoader(str14, true);
                } else {
                    DXNativeLogicLoader dXNativeLogicLoader3 = (DXNativeLogicLoader) arrayList.get(arrayList.size() - 1);
                    String name = dXNativeLogicLoader3.getName();
                    String version = dXNativeLogicLoader3.getVersion();
                    str10 = name;
                    str11 = version;
                    dXNativeLogicLoader = new DXNativeLogicLoader(str14, false, null, null, dXNativeLogicLoader3, name, version, str3, str4, str13, str12);
                }
                if (bx.i()) {
                    fuw.f("put memoryCacheVersion " + generatorKey + "  loader  " + dXNativeLogicLoader.hashCode() + " thread " + Thread.currentThread().getName());
                }
                map.put(generatorKey, dXNativeLogicLoader);
                arrayList.add(dXNativeLogicLoader);
                str6 = str10;
                str7 = str11;
            }
            str8 = str3;
            str9 = str4;
            i = i3;
            str5 = null;
        }
        return arrayList;
    }

    private String generatorKey(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1e04eb1", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
        return str + "-" + str2 + "-" + str3 + "-" + str4 + '-' + str5 + "-" + str6;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            fxe.e(new Runnable() { // from class: com.taobao.android.dxv4common.logic.dex.DXModuleManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DXModuleManager.this.download(JSON.parseArray(new String(com.taobao.android.dinamicx.template.download.c.c(DXModuleManager.ASSET_DEPENDENCIES_DIR))), null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void download(JSONArray jSONArray, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e313da66", new Object[]{this, jSONArray, cVar});
        } else if (jSONArray == null || jSONArray.size() == 0) {
            if (cVar == null) {
                return;
            }
            cVar.a();
        } else {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("version");
                String string3 = jSONObject.getString("type");
                String string4 = jSONObject.getString("url");
                String str = this.fileRoorPath.getAbsolutePath() + "/" + string + "/" + string2 + "/" + string + "." + string3;
                if (!new File(str).exists()) {
                    byte[] downLoad = downLoad(string4);
                    if (downLoad == null || downLoad.length == 0) {
                        jSONArray2.add(jSONObject);
                    } else if (!com.taobao.android.dinamicx.template.download.c.a(str, downLoad, false)) {
                        jSONArray2.add(jSONObject);
                    }
                }
            }
            if (!fqi.aO()) {
                if (cVar == null) {
                    return;
                }
                cVar.a();
            } else if (cVar != null) {
                if (jSONArray2.size() == 0) {
                    cVar.a();
                } else {
                    cVar.a(jSONArray2);
                }
            }
        }
    }

    private byte[] downLoad(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("80821ec4", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.dxDownloader.a(str);
        }
        return null;
    }

    public void clearMemoryCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9614fb", new Object[]{this});
            return;
        }
        Map<String, Map<String, DXNativeLogicLoader>> map = this.logicMaps;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void clearDiskCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8201949f", new Object[]{this});
            return;
        }
        deleteOldFile("atomicfu-jvm-0.21.0");
        deleteOldFile("stdlibV1-megability-release");
    }

    private boolean deleteOldFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbacb0ad", new Object[]{this, str})).booleanValue();
        }
        File file = new File(this.fileRoorPath.getAbsolutePath() + "/" + str);
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        long lastModified = listFiles[0].lastModified();
        for (File file2 : listFiles) {
            if (file2.lastModified() < lastModified) {
                deleteDir(file2);
            }
        }
        return true;
    }

    private boolean deleteDir(File file) {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{this, file})).booleanValue();
        }
        if (file != null && file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        if (file != null) {
            fuw.d("DXModuleManager", " dir " + file.getAbsoluteFile());
        }
        return file != null && file.delete();
    }
}
