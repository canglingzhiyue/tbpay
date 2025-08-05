package tb;

import android.content.Context;
import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.c;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.gkb;

/* loaded from: classes7.dex */
public class lwd implements lwf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLAG_CACHE = "1";
    public static final int SOURCE_FROM_CONTAINER_DEFAULT_CACHE = 0;
    public static final int SOURCE_FROM_CONTAINER_ONLY_NEW_TIME = 2;
    public static final int SOURCE_FROM_TAB_CACHE = 1;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;
    private String e;
    private Context f;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, AwesomeGetContainerData> f30932a = new ConcurrentHashMap(16);
    private final Object g = new Object();

    static {
        kge.a(-1873568850);
        kge.a(-536052995);
    }

    public static /* synthetic */ Context a(lwd lwdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e49bc5f7", new Object[]{lwdVar}) : lwdVar.f;
    }

    public static /* synthetic */ void a(lwd lwdVar, AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9494d1", new Object[]{lwdVar, awesomeGetContainerInnerData});
        } else {
            lwdVar.c(awesomeGetContainerInnerData);
        }
    }

    public static /* synthetic */ void a(lwd lwdVar, List list, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc14f6a", new Object[]{lwdVar, list, cVar});
        } else {
            lwdVar.a(list, cVar);
        }
    }

    public static /* synthetic */ String b(lwd lwdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e178a20", new Object[]{lwdVar}) : lwdVar.e;
    }

    public lwd(Context context, String str) {
        this.f = context;
        this.e = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    public void a(final List<String> list, boolean z, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f01d5", new Object[]{this, list, new Boolean(z), cVar});
            return;
        }
        lxo.b("DataSource", "start loadCache");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = this.f30932a.get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                this.f30932a.put(str, awesomeGetContainerData);
            }
            if (awesomeGetContainerData.getBaseData() != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == list.size()) {
            a.a("cacheProcess", "DataSource", "memory data");
            cVar.a(arrayList, null);
        } else if (z) {
            a(list, cVar);
        } else {
            lxs.a().a(new Runnable() { // from class: tb.lwd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lwd.a(lwd.this, list, cVar);
                    }
                }
            });
        }
    }

    private synchronized void a(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        char c = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26906213", new Object[]{this, list, cVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = gmb.a(this.f).a();
        if (this.b == null) {
            this.b = b(new File(a2, String.format("%s_%s.dat", this.e, "page")));
        }
        if (this.c == null) {
            this.c = b(new File(a2, String.format("%s_%s.dat", this.e, BHRTaskConfigBase.TYPE_CONFIG_UT)));
        }
        if (this.d == null) {
            this.d = b(new File(a2, String.format("%s_%s.dat", this.e, "global")));
        }
        for (String str : list) {
            AwesomeGetContainerData awesomeGetContainerData = this.f30932a.get(str);
            if (awesomeGetContainerData == null) {
                awesomeGetContainerData = new AwesomeGetContainerData();
                this.f30932a.put(str, awesomeGetContainerData);
            }
            awesomeGetContainerData.setContainerId(str);
            if (awesomeGetContainerData.getBase() == null) {
                try {
                    Process.setThreadPriority(0);
                } catch (Throwable unused) {
                }
                Object[] objArr = new Object[i];
                objArr[0] = str;
                objArr[c] = "base";
                File file = new File(a2, String.format("%s_%s.dat", objArr));
                Object[] objArr2 = new Object[i];
                objArr2[0] = str;
                objArr2[c] = "delta";
                File file2 = new File(a2, String.format("%s_%s.dat", objArr2));
                AwesomeGetContainerInnerData a3 = a(file);
                if (a3 == null) {
                    a.b("cacheProcess", "process_error", "网络缓存数据加载失败", "DataSource", "containerId : " + str);
                    a3 = f(str);
                }
                AwesomeGetContainerInnerData a4 = a(file2);
                if (a3 != null) {
                    a3.setCacheTime(0L);
                }
                if (a4 != null) {
                    a4.setCacheTime(0L);
                }
                if (a3 != null) {
                    if (awesomeGetContainerData.getBase() == null) {
                        awesomeGetContainerData.setBase(a3);
                        awesomeGetContainerData.setDelta(a4);
                        b(a3);
                        a(a3);
                        a(a4);
                        awesomeGetContainerData.setTotalData(a3.getSections());
                        lxl.c("DataSource", "load cache success, and call to refresh ui");
                        a.a("cacheProcess", "DataSource", "load cache success, and call to refresh ui");
                    }
                    arrayList.add(str);
                } else {
                    a.b("cacheProcess", "process_error", "预置数据加载失败", "DataSource", "containerId : " + str);
                    arrayList2.add(str);
                }
            } else {
                arrayList.add(str);
            }
            i = 2;
            c = 1;
        }
        a.a("cacheProcess", "DataSource", "end loadCache");
        cVar.a(arrayList, arrayList2);
    }

    private void a(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22da0948", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.getSections() != null && !awesomeGetContainerInnerData.getSections().isEmpty()) {
            for (SectionModel sectionModel : awesomeGetContainerInnerData.getSections()) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put(tim.S_ARGS_IS_CLIENT_CACHE, (Object) "1");
                }
            }
        }
    }

    private void b(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f02ba7", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.mo1280getPageParams() == null) {
        } else {
            awesomeGetContainerInnerData.mo1280getPageParams().setRequestInAdvance(4);
        }
    }

    private void c(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f064e06", new Object[]{this, awesomeGetContainerInnerData});
        } else if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.getSections() != null && !awesomeGetContainerInnerData.getSections().isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            for (SectionModel sectionModel : awesomeGetContainerInnerData.getSections()) {
                JSONObject jSONObject = sectionModel.getJSONObject("args");
                if (jSONObject != null) {
                    jSONObject.put("clientGetDataTime", (Object) Long.valueOf(currentTimeMillis));
                }
            }
        }
    }

    private AwesomeGetContainerInnerData f(String str) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("e6b657", new Object[]{this, str});
        }
        try {
            byte[] a3 = lxr.a(String.format("awesome/container_%s.json", str));
            if (a3 != null && a3.length > 0) {
                return (AwesomeGetContainerInnerData) JSON.parseObject(a3, AwesomeGetContainerInnerData.class, new Feature[0]);
            }
            if (!str.contains("recommend_home") || (a2 = lxr.a("awesome/container_recommend_home_main_1001.json")) == null || a2.length <= 0) {
                return null;
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
            lxl.a("xingzed", "gateway2.0 default hit and cid=" + str);
            return awesomeGetContainerInnerData;
        } catch (Throwable unused) {
            lxo.b("gateway2-GatewayDataSource.loadAsset", str);
            return null;
        }
    }

    private AwesomeGetContainerInnerData a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("c6c395bf", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] a2 = lxr.a(file);
            if (a2 != null && a2.length > 0) {
                return (AwesomeGetContainerInnerData) JSON.parseObject(a2, AwesomeGetContainerInnerData.class, new Feature[0]);
            }
            return null;
        } catch (Throwable th) {
            com.taobao.android.gateway.util.a.a("loadFile error", th);
            lxo.b("gateway2-GatewayDataSource.loadFile", file.getAbsolutePath());
            return null;
        }
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
            byte[] a2 = lxr.a(file);
            if (a2 != null && a2.length > 0) {
                return (JSONObject) JSON.parseObject(a2, JSONObject.class, new Feature[0]);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public AwesomeGetContainerData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("45f80bba", new Object[]{this, str});
        }
        if (this.f30932a.get(str) == null) {
            synchronized (this.g) {
                if (this.f30932a.get(str) == null) {
                    this.f30932a.put(str, new AwesomeGetContainerData());
                }
            }
        }
        return this.f30932a.get(str);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("d5929853", new Object[]{this, str}) : a(str).getBase();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("e0679fd4", new Object[]{this, str}) : a(str).getDelta();
    }

    public List<SectionModel> d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4c7331b2", new Object[]{this, str}) : a(str).getDeltaData();
    }

    public List<SectionModel> e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("adc5ce51", new Object[]{this, str}) : a(str).getTotalData();
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

    @Override // tb.lwf
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(JSON.toJSONString(jSONObject), new TypeReference<HashMap<String, String>>() { // from class: tb.lwd.2
            }, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.lwf
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            return null;
        }
        return JSON.toJSONString(jSONObject);
    }

    public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e742b2", new Object[]{this, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else {
            a(false, str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2);
        }
    }

    public void a(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, AwesomeGetContainerInnerData awesomeGetContainerInnerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cab1b6", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, awesomeGetContainerInnerData2});
        } else if (!z && this.f30932a.get(str) != null && this.f30932a.get(str).getDelta() == awesomeGetContainerInnerData) {
        } else {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.setCacheTime(a(System.currentTimeMillis()));
                awesomeGetContainerInnerData.setDataCacheTime(a(System.currentTimeMillis()));
            }
            a(str).setDelta(awesomeGetContainerInnerData);
            if (awesomeGetContainerInnerData2 == null) {
                return;
            }
            a(awesomeGetContainerInnerData2, str, "delta");
        }
    }

    public void a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else {
            a(str).setTotalData(list);
        }
    }

    public void a(String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd7e656", new Object[]{this, str, awesomeGetContainerInnerData, new Boolean(z)});
        } else {
            a(false, str, awesomeGetContainerInnerData, 0, z);
        }
    }

    public void a(boolean z, String str, AwesomeGetContainerInnerData awesomeGetContainerInnerData, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f9276b", new Object[]{this, new Boolean(z), str, awesomeGetContainerInnerData, new Integer(i), new Boolean(z2)});
        } else if (!z && this.f30932a.get(str) != null && this.f30932a.get(str).getBase() == awesomeGetContainerInnerData) {
        } else {
            if (awesomeGetContainerInnerData != null) {
                awesomeGetContainerInnerData.setCacheTime(a(System.currentTimeMillis()));
                awesomeGetContainerInnerData.setDataCacheTime(a(System.currentTimeMillis()));
            }
            a(str).setBase(awesomeGetContainerInnerData);
            lxl.c("DataSource", "net success, and call to refresh ui");
            if (awesomeGetContainerInnerData == null) {
                return;
            }
            if (awesomeGetContainerInnerData.mo1280getPageParams() != null && awesomeGetContainerInnerData.mo1280getPageParams().getPageNum() != 0) {
                return;
            }
            if (z2) {
                gkb.a.b(ksl.GATEWAY_SP_FILE, "passParams_" + str, awesomeGetContainerInnerData.getPassParams() == null ? "" : JSON.toJSONString(awesomeGetContainerInnerData.getPassParams()));
                a(awesomeGetContainerInnerData.getDataCacheTime(), str);
            }
            if (i == 0) {
                a(awesomeGetContainerInnerData, str, "base");
            } else if (i != 1) {
            } else {
                a(awesomeGetContainerInnerData, str, "base");
            }
        }
    }

    private void a(final AwesomeGetContainerInnerData awesomeGetContainerInnerData, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe03a5c", new Object[]{this, awesomeGetContainerInnerData, str, str2});
        } else if (awesomeGetContainerInnerData == null) {
        } else {
            lxs.a().a(new Runnable() { // from class: tb.lwd.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    File file = new File(gmb.a(lwd.a(lwd.this)).a(), String.format("%s_%s.dat", str, str2));
                    try {
                        lwd.a(lwd.this, awesomeGetContainerInnerData);
                    } catch (Throwable th) {
                        lxl.c("DataSource", "addGetTimeToArgs error. error is " + th);
                    }
                    try {
                        lxr.a(file, JSON.toJSONBytes(awesomeGetContainerInnerData, new SerializerFeature[0]));
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
            lxs.a().a(new Runnable() { // from class: tb.lwd.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lxr.a(new File(gmb.a(lwd.a(lwd.this)).a(), String.format("%s_%s.dat", lwd.b(lwd.this), str)), JSON.toJSONBytes(jSONObject, new SerializerFeature[0]));
                    }
                }
            });
        }
    }

    public long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue() : j + (SDKUtils.getTimeOffset() * 1000);
    }

    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        gkb.a.b("homepage_common", "homeBaseCacheTime" + str, j + "");
    }
}
