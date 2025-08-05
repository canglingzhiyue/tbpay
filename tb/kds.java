package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class kds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int SHOW_TIMES_NO_LIMIT = 0;
    private static final AtomicBoolean b;

    /* renamed from: a  reason: collision with root package name */
    private volatile List<LinkedSplashData> f29992a = null;
    private volatile List<LinkedSplashData> c;

    public static /* synthetic */ List a(kds kdsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c1599c29", new Object[]{kdsVar}) : kdsVar.e();
    }

    public static /* synthetic */ List a(kds kdsVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb976b18", new Object[]{kdsVar, list});
        }
        kdsVar.c = list;
        return list;
    }

    public static /* synthetic */ Map a(kds kdsVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("39be48dd", new Object[]{kdsVar, str}) : kdsVar.d(str);
    }

    public static /* synthetic */ void a(kds kdsVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b925a567", new Object[]{kdsVar, map});
        } else {
            kdsVar.a(map);
        }
    }

    public static /* synthetic */ List b(kds kdsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b22aa388", new Object[]{kdsVar}) : kdsVar.f29992a;
    }

    public static /* synthetic */ List b(kds kdsVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8e83d477", new Object[]{kdsVar, list});
        }
        kdsVar.f29992a = list;
        return list;
    }

    public static /* synthetic */ AtomicBoolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("aa60526b", new Object[0]) : b;
    }

    static {
        kge.a(-678540867);
        b = new AtomicBoolean(false);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.kds.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadAdvCache_before " + kds.d().get());
                    if (!kds.d().get()) {
                        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadAdvCache_loadFromSp start");
                        kds kdsVar = kds.this;
                        kds.a(kdsVar, kds.a(kdsVar));
                        if (kds.b(kds.this) != null && kds.b(kds.this).size() > 0) {
                            kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#temporaryData need update");
                            kds kdsVar2 = kds.this;
                            kdsVar2.a(kds.b(kdsVar2));
                        }
                        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadAdvCache isLoadCache set true");
                        kds.d().set(true);
                    }
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadAdvCache_after " + kds.d().get());
                }
            });
        }
    }

    public void a(final List<LinkedSplashData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.kds.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveCache#dataList is null");
                        return;
                    }
                    ArrayList<LinkedSplashData> arrayList = new ArrayList(list);
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveCache#linkedSplashData : " + arrayList.size());
                    if (!kel.b()) {
                        return;
                    }
                    if (arrayList.isEmpty()) {
                        kel.a().edit().putString("cold_start_boot_info", "").apply();
                        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveCache#数据为空，清空本地缓存 ");
                        return;
                    }
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveCache#isLoadCache:" + kds.d().get());
                    if (!kds.d().get()) {
                        kds.b(kds.this, arrayList);
                        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveAdvCache load cache 未加载好，缓存等待save");
                        return;
                    }
                    String jSONString = JSON.toJSONString(arrayList);
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveCache#cache:" + jSONString);
                    kel.a().edit().putString("cold_start_boot_info", jSONString).apply();
                    HashMap hashMap = new HashMap();
                    for (LinkedSplashData linkedSplashData : arrayList) {
                        List<BootImageInfo> list3 = linkedSplashData.getData().result;
                        Map a2 = kds.a(kds.this, "ad_show_times");
                        for (BootImageInfo bootImageInfo : list3) {
                            long j = 0;
                            if (a2.containsKey(bootImageInfo.itemId)) {
                                Long l = (Long) a2.get(bootImageInfo.itemId);
                                str = bootImageInfo.itemId;
                                if (l != null) {
                                    j = l.longValue();
                                }
                            } else {
                                str = bootImageInfo.itemId;
                            }
                            hashMap.put(str, Long.valueOf(j));
                        }
                    }
                    kds.a(kds.this, hashMap);
                }
            });
        }
    }

    public List<LinkedSplashData> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    private List<LinkedSplashData> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (!kel.b()) {
            return arrayList;
        }
        String string = kel.a().getString("cold_start_boot_info", null);
        kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadFromSp cacheString:" + string);
        try {
            JSONArray parseArray = JSON.parseArray(string);
            if (parseArray == null || parseArray.size() <= 0) {
                kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadFromSp cacheJa is null:" + parseArray);
                return arrayList;
            }
            int i = 0;
            while (true) {
                if (i >= parseArray.size()) {
                    break;
                }
                JSONObject jSONObject = parseArray.getJSONObject(i);
                if (jSONObject == null) {
                    kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#loadFromSp cacheJo is null");
                    break;
                }
                JSONObject jSONObject2 = jSONObject.containsKey("subSection") ? jSONObject.getJSONObject("subSection") : null;
                String string2 = jSONObject.containsKey("traceId") ? jSONObject.getString("traceId") : null;
                JSONObject jSONObject3 = jSONObject.containsKey("splashObj") ? jSONObject.getJSONObject("splashObj") : null;
                JSONObject jSONObject4 = jSONObject.containsKey("feedsData") ? jSONObject.getJSONObject("feedsData").getJSONObject("feedsJson") : null;
                if (jSONObject2 != null) {
                    jSONObject2.put(PopStrategy.IDENTIFIER_SPLASH, (Object) jSONObject3);
                    jSONObject2.put("feeds", (Object) jSONObject4);
                }
                BootImageData bootImageData = jSONObject.containsKey("data") ? (BootImageData) JSONObject.parseObject(jSONObject.getString("data"), BootImageData.class) : null;
                if (jSONObject2 != null && string2 != null && bootImageData != null) {
                    arrayList.add(new LinkedSplashData(jSONObject2, string2, bootImageData));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("ColdStartAdInfoCache#loadFromSp result subSection is null -> ");
                sb.append(jSONObject2 == null);
                sb.append(", traceId is null -> ");
                sb.append(string2 == null);
                sb.append(", bootImageData is null -> ");
                sb.append(bootImageData == null);
                kej.a("ColdStartAdInfoCache", sb.toString());
                i++;
            }
            return arrayList;
        } catch (Throwable th) {
            kej.a("ColdStartAdInfoCache", "loadFromSp", th);
            return arrayList;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!kel.b()) {
        } else {
            Map<String, Long> d = d("ad_show_times");
            Long l = d.get(str);
            long j = 1;
            if (l != null) {
                j = 1 + l.longValue();
            }
            d.put(str, Long.valueOf(j));
            kel.a().edit().putString("ad_show_times", JSON.toJSONString(d)).apply();
            kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveShowTimes:" + JSON.toJSONString(d));
        }
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        Long l = d("ad_show_times").get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("ColdStartAdInfoCache#getAdShowTimes itemId:");
        sb.append(str);
        sb.append(",showTimes:");
        sb.append(l == null ? 0L : l.longValue());
        kej.a("ColdStartAdInfoCache", sb.toString());
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    private Map<String, Long> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{this, str});
        }
        if (!kel.b()) {
            return new HashMap();
        }
        String string = kel.a().getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return new HashMap();
        }
        try {
            Map<String, Long> map = (Map) JSON.parseObject(string, new TypeReference<Map<String, Long>>() { // from class: tb.kds.3
            }, new Feature[0]);
            return map == null ? new HashMap() : map;
        } catch (Throwable th) {
            kej.a("ColdStartAdInfoCache", "getCacheMap", th);
            return new HashMap();
        }
    }

    private void a(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!kel.b()) {
        } else {
            kel.a().edit().putString("ad_show_times", JSON.toJSONString(map)).apply();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!kel.b()) {
        } else {
            kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#clearAdCache");
            kel.a().edit().putString("ad_show_times", "").apply();
            kel.a().edit().putString("cold_start_boot_info", "").apply();
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (!kel.b()) {
        } else {
            Map<String, Long> d = d("adPeriodSeconds");
            d.put(str, Long.valueOf(System.currentTimeMillis() + (j * 1000)));
            kej.a("ColdStartAdInfoCache", "ColdStartAdInfoCache#saveAdPeriodSecond:" + JSON.toJSONString(d));
            kel.a().edit().putString("adPeriodSeconds", JSON.toJSONString(d)).apply();
        }
    }

    public long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{this, str})).longValue();
        }
        Long l = d("adPeriodSeconds").get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("ColdStartAdInfoCache#getLastTime itemId:");
        sb.append(str);
        sb.append(",lastTimes:");
        sb.append(l == null ? 0L : l.longValue());
        kej.a("ColdStartAdInfoCache", sb.toString());
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
