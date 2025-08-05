package tb;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.home.component.utils.d;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.n;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.linklog.a;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.tracelog.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ope {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_FROM_CONTAINER_DEFAULT_CACHE = 0;
    public static final int SOURCE_FROM_CONTAINER_ONLY_NEW_TIME = 2;
    public static final int SOURCE_FROM_TAB_CACHE = 1;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private String g;
    private Context h;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, AwesomeGetContainerData> f32253a = new ConcurrentHashMap(16);
    private final Object i = new Object();
    private final Object j = new Object();
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final Map<String, Object> l = new ConcurrentHashMap();

    static {
        kge.a(-915103931);
    }

    public static /* synthetic */ Context a(ope opeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b64390ac", new Object[]{opeVar}) : opeVar.h;
    }

    public static /* synthetic */ String a(ope opeVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f051e8c", new Object[]{opeVar, context}) : opeVar.a(context);
    }

    public static /* synthetic */ void a(ope opeVar, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cd1796", new Object[]{opeVar, awesomeGetContainerInnerData});
        } else {
            opeVar.a(awesomeGetContainerInnerData);
        }
    }

    public static /* synthetic */ void a(ope opeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e0b27e", new Object[]{opeVar, str});
        } else {
            opeVar.n(str);
        }
    }

    public static /* synthetic */ void a(ope opeVar, List list, opf opfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8913b50", new Object[]{opeVar, list, opfVar});
        } else {
            opeVar.c(list, opfVar);
        }
    }

    public static /* synthetic */ boolean a(ope opeVar, String str, String str2, nvs nvsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7e8cbb1", new Object[]{opeVar, str, str2, nvsVar})).booleanValue() : opeVar.a(str, str2, nvsVar);
    }

    public static /* synthetic */ String b(ope opeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab9d310b", new Object[]{opeVar}) : opeVar.g;
    }

    public ope(Context context, String str) {
        this.h = context;
        this.g = str;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.j) {
            this.k.set(z);
        }
    }

    public AtomicBoolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("8048eb6f", new Object[]{this}) : this.k;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.g;
    }

    public void a(List<String> list, final nvs nvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76875b3e", new Object[]{this, list, nvsVar});
            return;
        }
        final String a2 = gmb.a(this.h).a();
        new Thread(new Runnable() { // from class: tb.ope.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                lar.a("loadCache_loadParams");
                ope.a(ope.this, a2);
                lar.b("loadCache_loadParams");
            }
        }, "homeCacheLoadParams").start();
        for (final String str : list) {
            new Thread(new Runnable() { // from class: tb.ope.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lar.a("loadCache_loadContainerData_" + str);
                    ope.a(ope.this, a2, str, nvsVar);
                    lar.b("loadCache_loadContainerData_" + str);
                }
            }, "homeCacheLoadContainerData").start();
        }
        a.a("cacheProcess", "RecmdDataSource", "end loadCache");
    }

    public void a(final List<String> list, final opf opfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e1be04", new Object[]{this, list, opfVar});
        } else if (!b(list, opfVar)) {
        } else {
            a(false);
            Coordinator.execute(new Runnable() { // from class: tb.ope.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a().a("loadCacheAsync", 2);
                    lar.a("loadCacheAsync");
                    ope.a(ope.this, list, opfVar);
                    lar.b("loadCacheAsync");
                    b.a().b("loadCacheAsync");
                }
            });
        }
    }

    private boolean b(List<String> list, opf opfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a131a289", new Object[]{this, list, opfVar})).booleanValue();
        }
        a.a("cacheProcess", "RecmdDataSource", "start loadCache");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = this.f32253a.get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                this.f32253a.put(str, awesomeGetContainerData);
            }
            if (awesomeGetContainerData.getBaseData() != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() != list.size()) {
            return true;
        }
        a.a("cacheProcess", "RecmdDataSource", "memory data");
        opfVar.a(arrayList, null);
        return false;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        if (this.f == null) {
            this.f = new JSONObject();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f.put(str, obj);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f == null || TextUtils.isEmpty(str)) {
        } else {
            this.f.remove(str);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            return;
        }
        jSONObject.clear();
    }

    private synchronized void c(List<String> list, opf opfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca818706", new Object[]{this, list, opfVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = gmb.a(this.h).a();
        n(a2);
        for (String str : list) {
            if (a(a2, str, (nvs) null)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        a.a("cacheProcess", "RecmdDataSource", "end loadCache");
        opfVar.a(arrayList, arrayList2);
    }

    private void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
            return;
        }
        if (this.b == null) {
            this.b = b(new File(str, String.format("%s_%s.dat", this.g, "page")));
        }
        if (this.c == null) {
            this.c = b(new File(str, String.format("%s_%s.dat", this.g, BHRTaskConfigBase.TYPE_CONFIG_UT)));
        }
        if (this.d == null) {
            this.d = b(new File(str, String.format("%s_%s.dat", this.g, "global")));
        }
        if (this.e != null) {
            return;
        }
        this.e = b(new File(str, String.format("%s_%s.dat", this.g, "ext")));
    }

    private boolean a(String str, String str2, nvs nvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3770ec65", new Object[]{this, str, str2, nvsVar})).booleanValue();
        }
        if (n.o()) {
            e.e("RecmdDataSource", "loadContainerDataMainLand");
            return b(str, str2, nvsVar);
        } else if (n.g()) {
            e.e("RecmdDataSource", "loadContainerDataForeign");
            return c(str, str2, nvsVar);
        } else {
            e.e("RecmdDataSource", "loadContainerDataMainLand");
            return b(str, str2, nvsVar);
        }
    }

    private boolean b(String str, String str2, nvs nvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36fa8666", new Object[]{this, str, str2, nvsVar})).booleanValue();
        }
        AwesomeGetContainerData awesomeGetContainerData = this.f32253a.get(str2);
        if (awesomeGetContainerData == null) {
            awesomeGetContainerData = new AwesomeGetContainerData();
            this.f32253a.put(str2, awesomeGetContainerData);
        }
        awesomeGetContainerData.containerId = str2;
        if (this.k.get()) {
            return false;
        }
        if (awesomeGetContainerData.base != null) {
            if (nvsVar == null) {
                return true;
            }
            nvsVar.a(str2, awesomeGetContainerData.base);
            return true;
        }
        try {
            Process.setThreadPriority(0);
        } catch (Throwable unused) {
        }
        if (!com.taobao.tao.recommend4.manager.utils.b.a(str2)) {
            a.b("cacheProcess", "process_error", "不需要读取缓存文件的场景", "RecmdDataSource", "containerId :" + str2);
            return false;
        }
        AwesomeGetContainerInnerData a2 = a(new File(str, String.format("%s_%s.dat", str2, "base")));
        if (a2 == null) {
            a.b("cacheProcess", "process_error", "网络缓存数据加载失败", "RecmdDataSource", "containerId: " + str2);
            ksq.b(str2);
            if (ksq.a(str2)) {
                ksr.b("GATEWAY_LOAD_CACHE", "1.0", "awesome_loadCacheFailed", "awesome_loadCacheFailed", "containerId", str2);
            }
            a2 = l(str2);
        }
        if (a2 != null) {
            a2.cacheTime = 0L;
        }
        if (a2 != null) {
            if (awesomeGetContainerData.base == null) {
                synchronized (this.j) {
                    if (this.k.get()) {
                        return false;
                    }
                    awesomeGetContainerData.setBaseSync(a2);
                    awesomeGetContainerData.delta = null;
                    a2.initCacheRequestInAdvance();
                    a(a2, "1");
                    awesomeGetContainerData.setTotalSectionListSync(a2.sections);
                    e.e("RecmdDataSource", "load cache success, and call to refresh ui");
                    a.a("cacheProcess", "RecmdDataSource", "load cache success, and call to refresh ui");
                }
            }
            if (nvsVar == null) {
                return true;
            }
            nvsVar.a(str2, a2);
            return true;
        }
        a.b("cacheProcess", "process_error", "预置数据加载失败", "RecmdDataSource", "containerId : " + str2);
        ksq.c(str2);
        if (ksq.a(str2)) {
            ksr.b("GATEWAY_LOAD_PRESET", "1.0", "awesome_loadPresetDataFailed", "awesome_loadPresetDataFailed", "containerId", str2);
        }
        return false;
    }

    private boolean c(String str, String str2, nvs nvsVar) {
        AwesomeGetContainerInnerData a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36842067", new Object[]{this, str, str2, nvsVar})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        AwesomeGetContainerData awesomeGetContainerData = this.f32253a.get(str2);
        if (awesomeGetContainerData == null) {
            awesomeGetContainerData = new AwesomeGetContainerData();
            this.f32253a.put(str2, awesomeGetContainerData);
        }
        awesomeGetContainerData.containerId = str2;
        if (this.k.get()) {
            return false;
        }
        if (awesomeGetContainerData.base == null) {
            try {
                Process.setThreadPriority(0);
            } catch (Throwable unused) {
            }
            if (!com.taobao.tao.recommend4.manager.utils.b.a(str2)) {
                a.b("cacheProcess", "process_error", "不需要读取缓存文件的场景", "RecmdDataSource", "containerId :" + str2);
                return false;
            }
            File file = new File(str, String.format("%s_%s.dat", str2, "base"));
            e.e("RecmdDataSource", "load cache file : " + file.getAbsolutePath() + " , exist: " + file.exists());
            synchronized (p(!TextUtils.isEmpty(file.getAbsolutePath()) ? file.getAbsolutePath() : "null")) {
                if (awesomeGetContainerData.base != null) {
                    a2 = awesomeGetContainerData.base;
                } else {
                    a2 = a(file);
                    e.e("RecmdDataSource", "load cache file end, cose: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    if (a2 == null) {
                        a.b("cacheProcess", "process_error", "网络缓存数据加载失败", "RecmdDataSource", "containerId: " + str2);
                        ksq.b(str2);
                        if (ksq.a(str2)) {
                            ksr.b("GATEWAY_LOAD_CACHE", "1.0", "awesome_loadCacheFailed", "awesome_loadCacheFailed", "containerId", str2);
                        }
                        a2 = l(str2);
                    }
                    if (a2 != null) {
                        a2.cacheTime = 0L;
                    }
                }
                if (a2 != null) {
                    if (awesomeGetContainerData.base == null) {
                        synchronized (this.j) {
                            if (this.k.get()) {
                                return false;
                            }
                            awesomeGetContainerData.setBaseSync(a2);
                            awesomeGetContainerData.delta = null;
                            a2.initCacheRequestInAdvance();
                            a(a2, "1");
                            awesomeGetContainerData.setTotalSectionListSync(a2.sections);
                            e.e("RecmdDataSource", "load cache success, and call to refresh ui");
                            a.a("cacheProcess", "RecmdDataSource", "load cache success, and call to refresh ui");
                        }
                    }
                    e.e("RecmdDataSource", "loadContainerData end, cose: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    if (nvsVar != null) {
                        nvsVar.a(str2, a2);
                    }
                } else {
                    a.b("cacheProcess", "process_error", "预置数据加载失败", "RecmdDataSource", "containerId : " + str2);
                    ksq.c(str2);
                    if (ksq.a(str2)) {
                        ksr.b("GATEWAY_LOAD_PRESET", "1.0", "awesome_loadPresetDataFailed", "awesome_loadPresetDataFailed", "containerId", str2);
                    }
                    z = false;
                }
            }
        } else if (nvsVar != null) {
            nvsVar.a(str2, awesomeGetContainerData.base);
        }
        return z;
    }

    public Object p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31f19251", new Object[]{this, str});
        }
        Object obj = this.l.get(str);
        if (obj == null) {
            synchronized (this.l) {
                obj = this.l.get(str);
                if (obj == null) {
                    obj = new Object();
                    this.l.put(str, obj);
                }
            }
        }
        return obj;
    }

    public void a(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b90afac", new Object[]{this, awesomeGetContainerInnerData, str});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.sections != null && !awesomeGetContainerInnerData.sections.isEmpty()) {
            boolean equals = TextUtils.equals(str, "1");
            awesomeGetContainerInnerData.isCacheData = equals;
            for (SectionModel sectionModel : awesomeGetContainerInnerData.sections) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    sectionModel.put("args", (Object) jSONObject);
                }
                if (equals) {
                    jSONObject.put(tim.S_ARGS_IS_CLIENT_CACHE, (Object) str);
                }
                jSONObject.put("dataFlag", (Object) str);
            }
        }
    }

    private void a(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c49a62", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.sections != null && !awesomeGetContainerInnerData.sections.isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (SectionModel sectionModel : awesomeGetContainerInnerData.sections) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put("clientGetDataTime", (Object) Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    private AwesomeGetContainerInnerData l(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("c59ffaf7", new Object[]{this, str});
        }
        try {
            a2 = gmc.a(String.format("awesome/container_%s.json", str), this.h);
        } catch (Throwable th) {
            com.taobao.android.gateway.util.a.a("loadAsset error", th);
            TLog.logd("gateway2-GatewayDataSource.loadAsset", str);
        }
        if (a2 != null && a2.length > 0) {
            return (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
        }
        byte[] a3 = str.contains("recommend_home") ? d.a("awesome/container_recommend_home_main_1001.json") : null;
        if (str.contains(syc.MULTI_NATIVE_INFOFLOW_CID_PREFIX)) {
            a3 = gmc.a(String.format("awesome/container_recommend_multi_channel.json", str), this.h);
        }
        if (a3 != null && a3.length > 0) {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a3, AwesomeGetContainerInnerData.class, new Feature[0]);
            e.b("xingzed", "gateway2.0 default hit and cid=" + str);
            return awesomeGetContainerInnerData;
        }
        return null;
    }

    private AwesomeGetContainerInnerData a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("1f50b559", new Object[]{this, file});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!file.exists()) {
            return null;
        }
        try {
            lar.a(lar.RmdCacheLoad);
            byte[] a2 = gmc.a(file);
            lar.b(lar.RmdCacheLoad);
            if (a2 != null && a2.length > 0) {
                lar.g(lar.RmdDataParse);
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
                lar.h(lar.RmdDataParse);
                return awesomeGetContainerInnerData;
            }
        } catch (Throwable th) {
            com.taobao.android.gateway.util.a.a("loadFile error", th);
            TLog.logd("gateway2-GatewayDataSource.loadFile", file.getAbsolutePath());
        }
        e.e("RecmdDataSource", "loadFile end, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms , file: " + file.getAbsolutePath());
        return null;
    }

    private JSONObject b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47122cc0", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] a2 = gmc.a(file);
            if (a2 != null && a2.length > 0) {
                return (JSONObject) JSON.parseObject(a2, JSONObject.class, new Feature[0]);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public AwesomeGetContainerData b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("18394fbf", new Object[]{this, str});
        }
        if (this.f32253a.get(str) == null) {
            synchronized (this.i) {
                if (this.f32253a.get(str) == null) {
                    this.f32253a.put(str, new AwesomeGetContainerData());
                }
            }
        }
        return this.f32253a.get(str);
    }

    public AwesomeGetContainerInnerData c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("a43a536e", new Object[]{this, str}) : b(str).base;
    }

    public AwesomeGetContainerInnerData d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("fd459eef", new Object[]{this, str}) : b(str).delta;
    }

    public List<SectionModel> e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{this, str}) : b(str).getBaseData();
    }

    public List<SectionModel> f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f186af0", new Object[]{this, str}) : b(str).getDeltaData();
    }

    public List<SectionModel> g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("706b078f", new Object[]{this, str}) : b(str).getTotalData();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject;
            a(jSONObject, "page");
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.c = jSONObject;
            a(jSONObject, BHRTaskConfigBase.TYPE_CONFIG_UT);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.d = jSONObject;
        a(jSONObject, "global");
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.e = jSONObject;
        a(jSONObject, "ext");
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.e;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.b;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.c;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.d;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.f;
    }

    public JSONObject h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("95260419", new Object[]{this, str});
        }
        try {
            AwesomeGetContainerInnerData c = c(str);
            if (c == null) {
                return JSON.parseObject(c.a.a(ksl.GATEWAY_SP_FILE, "passParams_" + str, ""));
            }
            return c.passParams;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af4b72", new Object[]{this, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else {
            a(false, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2);
        }
    }

    public void a(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998cda76", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else if (!z && this.f32253a.get(str) != null && this.f32253a.get(str).delta == awesomeGetContainerInnerData) {
        } else {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.cacheTime = kst.a(System.currentTimeMillis());
                awesomeGetContainerInnerData.dataCacheTime = kst.a(System.currentTimeMillis());
            }
            b(str).delta = awesomeGetContainerInnerData;
        }
    }

    public void a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        AwesomeGetContainerData b = b(str);
        b.totalSectionList = list;
        b.r4uAnchor = a(list, b.getExt());
    }

    public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b1207c", new Object[]{this, str, awesomeGetContainerInnerData, new Boolean(z)});
        } else {
            a(false, str, awesomeGetContainerInnerData, 0, z);
        }
    }

    public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0373d58", new Object[]{this, str, awesomeGetContainerInnerData});
        } else {
            a(false, str, awesomeGetContainerInnerData, 0, false);
        }
    }

    public synchronized void a(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14302205", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i), new Boolean(z2)});
            return;
        }
        if (z || this.f32253a.get(str) == null || this.f32253a.get(str).base != awesomeGetContainerInnerData) {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.cacheTime = kst.a(System.currentTimeMillis());
                awesomeGetContainerInnerData.dataCacheTime = awesomeGetContainerInnerData.cacheTime;
            }
            synchronized (this.j) {
                b(str).base = awesomeGetContainerInnerData;
            }
            e.e("RecmdDataSource", "net success, and call to refresh ui");
            if (!z2 && awesomeGetContainerInnerData != null && (awesomeGetContainerInnerData.pageParams == null || awesomeGetContainerInnerData.pageParams.pageNum == 0)) {
                oqb.a(str, awesomeGetContainerInnerData.passParams);
                HomePageUtility.a(awesomeGetContainerInnerData.dataCacheTime, str);
                if (i == 0) {
                    a(awesomeGetContainerInnerData, str, "base");
                    m(str);
                } else if (i == 1) {
                    a(awesomeGetContainerInnerData, str, "base");
                }
                o(str);
            }
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{this, str});
        } else if (TextUtils.equals(str, oqc.a().m()) || TextUtils.equals(str, oqc.a().l())) {
        } else {
            String a2 = opb.a(com.taobao.tao.recommend3.util.c.a(0));
            if (str != null && TextUtils.equals(a2, str)) {
                com.taobao.android.ai.b.a().g();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.taobao.android.ai.b.a().b(str);
            com.taobao.android.ai.b.a().a(true, str, null);
        }
    }

    public void a(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7d66af", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i)});
        } else {
            a(z, str, awesomeGetContainerInnerData, i, false);
        }
    }

    private int a(List<SectionModel> list, JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2bd60aa", new Object[]{this, list, jSONObject})).intValue();
        }
        JSONArray jSONArray = jSONObject == null ? null : jSONObject.getJSONArray("jumpAnchor");
        if (jSONArray != null && !jSONArray.isEmpty() && list != null && !list.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null && (a2 = opb.a(next.toString(), list)) >= 0) {
                    return a2 + 1;
                }
            }
        }
        return 0;
    }

    private void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
            return;
        }
        String str2 = str + "_tab_";
        for (Map.Entry<String, AwesomeGetContainerData> entry : this.f32253a.entrySet()) {
            if (entry.getKey().startsWith(str2)) {
                entry.getValue().abandonData();
            }
        }
    }

    public void a(final AwesomeGetContainerInnerData awesomeGetContainerInnerData, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a1c676", new Object[]{this, awesomeGetContainerInnerData, str, str2});
        } else if (awesomeGetContainerInnerData == null || !com.taobao.tao.recommend4.manager.utils.b.a(str)) {
        } else {
            com.taobao.gateway.dispatch.a.b().e(new Runnable() { // from class: tb.ope.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ope opeVar = ope.this;
                    String a2 = ope.a(opeVar, ope.a(opeVar));
                    if (TextUtils.isEmpty(a2)) {
                        e.e("RecmdDataSource", "cacheFileData path is null");
                        return;
                    }
                    File file = new File(a2, String.format("%s_%s.dat", str, str2));
                    try {
                        ope.a(ope.this, awesomeGetContainerInnerData);
                    } catch (Throwable th) {
                        e.e("RecmdDataSource", "addGetTimeToArgs error. error is " + th);
                    }
                    try {
                        gmc.a(file, osj.a(str, awesomeGetContainerInnerData));
                    } catch (Exception e) {
                        com.taobao.android.gateway.util.a.a("load cache file error", e);
                    } catch (OutOfMemoryError unused) {
                        com.taobao.android.gateway.util.a.b("load cache file error, out of memory.");
                    }
                }
            });
        }
    }

    private void a(final JSONObject jSONObject, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            com.taobao.gateway.dispatch.a.b().e(new Runnable() { // from class: tb.ope.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ope opeVar = ope.this;
                    String a2 = ope.a(opeVar, ope.a(opeVar));
                    if (TextUtils.isEmpty(a2)) {
                        e.e("RecmdDataSource", "cacheParams path is null");
                    } else {
                        gmc.a(new File(a2, String.format("%s_%s.dat", ope.b(ope.this), str)), JSON.toJSONBytes(jSONObject, new SerializerFeature[0]));
                    }
                }
            });
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        AwesomeGetContainerData b = b(str);
        if (b == null || b.base == null) {
            return;
        }
        b.abandonData();
        b.base.expireType = str2;
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{this, str})).booleanValue() : b(str).isDeltaAbandoned();
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f64af7f", new Object[]{this, str})).booleanValue() : b(str).isBaseAbandoned();
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711ebb64", new Object[]{this, str});
        }
        AwesomeGetContainerData b = b(str);
        if (b != null && b.base != null) {
            return b.base.expireType;
        }
        return null;
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        try {
            return gmb.a(context).a();
        } catch (Throwable th) {
            e.a("RecmdDataSource", "FileStore.from(context).getPath() error.", th);
            return null;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        e.e("RecmdDataSource", "clearHomeDiskCache");
        String str = oqc.j().b;
        String a2 = gmb.a(context).a();
        b(a2, String.format("%s_%s.dat", str, "page"));
        b(a2, String.format("%s_%s.dat", str, BHRTaskConfigBase.TYPE_CONFIG_UT));
        b(a2, String.format("%s_%s.dat", str, "global"));
        b(a2, String.format("%s_%s.dat", str, "ext"));
        String m = oqc.a().m();
        String l = oqc.a().l();
        b(a2, String.format("%s_%s.dat", m, "base"));
        b(a2, String.format("%s_%s.dat", l, "base"));
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        File file = new File(str, str2);
        try {
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (Exception e) {
            e.e("RecmdDataSource", "file delete error : " + str + " " + str2 + " " + e.getMessage());
        }
    }
}
