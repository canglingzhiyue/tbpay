package com.taobao.android.fluid.framework.preload.cache;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogv;
import tb.ohh;
import tb.son;
import tb.sox;
import tb.spz;

/* loaded from: classes5.dex */
public class a implements IDetailCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String b;
    private boolean c = false;
    private boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    private List<DetailCacheData> f12624a = new ArrayList();

    static {
        kge.a(475788213);
        kge.a(-1661564988);
    }

    public a(String str) {
        this.b = str;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public DetailCacheData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("baac16dd", new Object[]{this});
        }
        d(">>>>get()," + a());
        d();
        DetailCacheData detailCacheData = null;
        DetailCacheData detailCacheData2 = null;
        for (int i = 0; i < this.f12624a.size(); i++) {
            DetailCacheData detailCacheData3 = this.f12624a.get(i);
            if (detailCacheData3 != null) {
                boolean a2 = b.a(detailCacheData3);
                boolean a3 = son.a(PerfConst.FEATURE_RECOVER_CACHE_SAVE_GET_OPT, false) ? sox.a(detailCacheData3.getVideoResourceStr()) : b.c(detailCacheData3);
                detailCacheData3.isValid = a2;
                detailCacheData3.hasVideoCached = a3;
                d("get(), --- i=" + i + "; contentId=" + detailCacheData3.contentId + ";isValid=" + a2 + ";hasVideoCached=" + a3);
                if (a2 && a3) {
                    return detailCacheData3;
                }
                if (a2 && detailCacheData == null) {
                    detailCacheData = detailCacheData3;
                }
                if (!a2 && detailCacheData2 == null) {
                    detailCacheData2 = detailCacheData3;
                }
            }
        }
        return detailCacheData != null ? detailCacheData : detailCacheData2;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public DetailCacheData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("f38c777c", new Object[]{this});
        }
        if (son.a(PerfConst.FEATURE_RECOVER_CACHE_SAVE_GET_OPT, false)) {
            return k();
        }
        d(">>>>getNeedCachedData()," + a());
        d();
        long j = 0L;
        DetailCacheData detailCacheData = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f12624a.size(); i2++) {
            DetailCacheData detailCacheData2 = this.f12624a.get(i2);
            if (detailCacheData2 != null) {
                boolean a2 = b.a(detailCacheData2);
                boolean a3 = sox.a(detailCacheData2.getVideoResourceStr());
                d("getNeedCachedData(), --- i=" + i2 + "; contentId=" + detailCacheData2.contentId + ";isValid=" + a2 + ";hasVideoCached=" + a3 + "; cachetime=" + detailCacheData2.hasVideoDownloadTime + ";hasDownLoadError=" + detailCacheData2.hasDownLoadError);
                if (a2 && a3) {
                    i++;
                    j = Math.max(j, detailCacheData2.hasVideoDownloadTime);
                }
                if (a2 && !a3 && !detailCacheData2.hasDownLoadError && detailCacheData == null) {
                    detailCacheData = detailCacheData2;
                }
            }
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp() - j;
        if (i >= 2 && currentTimeStamp < android.taobao.windvane.util.b.DEFAULT_MAX_AGE && currentTimeStamp > 0) {
            d("getNeedCachedData(), 已缓存视频满足策略，无需缓存, bestCount=" + i + " spendTime=" + currentTimeStamp);
            return null;
        }
        d("getNeedCachedData(), bestCount=" + i + " spendTime=" + currentTimeStamp + "  需缓存. validNoCacheData：" + detailCacheData);
        return detailCacheData;
    }

    private DetailCacheData k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("ba8f7c74", new Object[]{this});
        }
        spz.c("DetailCacheImpl", "[cachevideo]getNeedCachedData()," + a());
        d();
        DetailCacheData detailCacheData = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f12624a.size(); i2++) {
            DetailCacheData detailCacheData2 = this.f12624a.get(i2);
            if (detailCacheData2 != null) {
                boolean a2 = b.a(detailCacheData2);
                boolean c = b.c(detailCacheData2);
                spz.c("DetailCacheImpl", "[cachevideo]get(), --- i=" + i2 + "; contentId=" + detailCacheData2.contentId + ";isValid=" + a2 + ";hasVideoCached=" + c);
                if (a2 && c) {
                    i++;
                }
                if (a2 && !c && detailCacheData == null) {
                    detailCacheData = detailCacheData2;
                }
                if (i >= 2) {
                    spz.c("DetailCacheImpl", "[cachevideo]getNeedCachedData(), 已缓存视频满足策略，无需缓存");
                    return null;
                }
            }
        }
        spz.c("DetailCacheImpl", "[cachevideo]getNeedCachedData(), 需缓存 validNoCacheData：" + detailCacheData);
        return detailCacheData;
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void a(DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850e05b8", new Object[]{this, detailCacheData});
        } else if (detailCacheData == null) {
        } else {
            d("saveDetailCache, start save one...");
            a(Collections.singletonList(detailCacheData));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void a(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (son.a(PerfConst.FEATURE_RECOVER_CACHE_SAVE_GET_OPT, false)) {
            b(list);
        } else if (son.a(PerfConst.FEATURE_SAVE_CACHE_DYNAMIC_RECOMMEND, false) || son.a(PerfConst.FEATURE_PREDOWNLOAD_TO_CACHE, false)) {
            c(list);
        } else if (list != null) {
            d(">>>>save(), start, save, need save newCacheDataList.size=" + list.size());
            d();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f12624a.size(); i++) {
                DetailCacheData detailCacheData = this.f12624a.get(i);
                if (detailCacheData != null) {
                    boolean a2 = b.a(detailCacheData);
                    boolean c = b.c(detailCacheData);
                    if (a2 && c) {
                        arrayList.add(detailCacheData);
                        d("save, --- 老的 未过期&有缓存的， cacheData=" + detailCacheData);
                    }
                }
            }
            Collections.sort(arrayList, new Comparator<DetailCacheData>() { // from class: com.taobao.android.fluid.framework.preload.cache.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(DetailCacheData detailCacheData2, DetailCacheData detailCacheData3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, detailCacheData2, detailCacheData3})).intValue() : a(detailCacheData2, detailCacheData3);
                }

                public int a(DetailCacheData detailCacheData2, DetailCacheData detailCacheData3) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("67dc0afb", new Object[]{this, detailCacheData2, detailCacheData3})).intValue() : b.b(detailCacheData3) - b.b(detailCacheData2);
                }
            });
            int min = Math.min(arrayList.size(), 2);
            List subList = arrayList.subList(0, min);
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                d("save, --- 最终保留老的 未过期&有缓存的， contentid=" + ((DetailCacheData) it.next()).contentId);
            }
            this.f12624a.clear();
            for (int i2 = 0; i2 < 5 - min && i2 < list.size(); i2++) {
                DetailCacheData detailCacheData2 = list.get(i2);
                if (detailCacheData2 != null) {
                    this.f12624a.add(detailCacheData2);
                    d("save, --- 保存新的 cacheData=" + detailCacheData2);
                }
            }
            this.f12624a.addAll(subList);
            e();
        }
    }

    private void b(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            spz.c("DetailCacheImpl", "[cachevideo]save, start, save, need save newCacheDataList.size=" + list.size());
            d();
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < this.f12624a.size(); i++) {
                DetailCacheData detailCacheData = this.f12624a.get(i);
                if (detailCacheData != null) {
                    boolean a2 = b.a(detailCacheData);
                    boolean c = b.c(detailCacheData);
                    if (a2 && c) {
                        arrayList.add(detailCacheData);
                        spz.c("DetailCacheImpl", "[cachevideo]save, --- 保留老的 cacheData=" + detailCacheData);
                    }
                }
                if (arrayList.size() >= 2) {
                    break;
                }
            }
            this.f12624a.clear();
            int size = arrayList.size();
            for (int i2 = 0; i2 < 5 - size && i2 < list.size(); i2++) {
                DetailCacheData detailCacheData2 = list.get(i2);
                if (detailCacheData2 != null) {
                    this.f12624a.add(detailCacheData2);
                    spz.c("DetailCacheImpl", "[cachevideo]save, --- 保存新的 cacheData=" + detailCacheData2);
                }
            }
            this.f12624a.addAll(arrayList);
            e();
        }
    }

    private void c(List<DetailCacheData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null) {
            d(">>>>save(), start, save, need save srcCacheDataList.size=" + list.size());
            d();
            ArrayList arrayList = new ArrayList(list.size());
            for (DetailCacheData detailCacheData : list) {
                if (!this.f12624a.contains(detailCacheData)) {
                    arrayList.add(detailCacheData);
                }
            }
            if (arrayList.size() <= 0) {
                d("---save() 无新数据，直接return");
                return;
            }
            int size = (this.f12624a.size() + arrayList.size()) - 5;
            if (size > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < this.f12624a.size(); i++) {
                    DetailCacheData detailCacheData2 = this.f12624a.get(i);
                    if (detailCacheData2 != null) {
                        boolean a2 = b.a(detailCacheData2);
                        boolean c = b.c(detailCacheData2);
                        if (a2 && c) {
                            arrayList2.add(detailCacheData2);
                            d("------ 老的 未过期&有缓存的， cacheData=" + detailCacheData2);
                        }
                    }
                }
                int max = Math.max(this.f12624a.size() - size, Math.min(arrayList2.size(), 2));
                Collections.sort(this.f12624a, new Comparator<DetailCacheData>() { // from class: com.taobao.android.fluid.framework.preload.cache.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(DetailCacheData detailCacheData3, DetailCacheData detailCacheData4) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, detailCacheData3, detailCacheData4})).intValue() : a(detailCacheData3, detailCacheData4);
                    }

                    public int a(DetailCacheData detailCacheData3, DetailCacheData detailCacheData4) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("67dc0afb", new Object[]{this, detailCacheData3, detailCacheData4})).intValue() : b.b(detailCacheData4) - b.b(detailCacheData3);
                    }
                });
                List<DetailCacheData> list2 = this.f12624a;
                this.f12624a = list2.subList(0, Math.min(max, list2.size()));
                int size2 = this.f12624a.size();
                for (int i2 = 0; i2 < 5 - size2 && i2 < arrayList.size(); i2++) {
                    DetailCacheData detailCacheData3 = (DetailCacheData) arrayList.get(i2);
                    if (detailCacheData3 != null) {
                        this.f12624a.add(detailCacheData3);
                        d("------ 保存新的 cacheData=" + detailCacheData3);
                    }
                }
            } else {
                this.f12624a.addAll(arrayList);
            }
            e();
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        d(">>>>deleteByContentId：" + str + "; " + a());
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Iterator<DetailCacheData> it = this.f12624a.iterator();
        while (it.hasNext()) {
            DetailCacheData next = it.next();
            if (next != null && str.equals(next.contentId)) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            e();
        }
        d(" contentid：" + str + "; remove=" + z);
    }

    @Override // com.taobao.android.fluid.framework.preload.cache.IDetailCache
    public void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        d(">>>>markVideoHasDownload... contentid：" + str);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        d();
        boolean z = false;
        for (int i2 = 0; i2 < this.f12624a.size(); i2++) {
            DetailCacheData detailCacheData = this.f12624a.get(i2);
            if (detailCacheData != null && str.equals(detailCacheData.contentId)) {
                detailCacheData.hasVideoDownloadSize = i;
                detailCacheData.hasVideoDownloadUrl = str2;
                detailCacheData.hasVideoDownloadTime = TimeStampManager.instance().getCurrentTimeStamp();
                z = true;
            }
        }
        if (!z) {
            return;
        }
        e();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        d("checkDisk2Memory,start, mCacheDataList.size=" + this.f12624a.size());
        if (!this.c) {
            this.c = true;
            List<DetailCacheData> f = f();
            if (!ogv.a(f)) {
                this.f12624a = f;
            }
            d("checkDisk2Memory, 从协议3.0取数据:" + this.f12624a.size());
            if (ogv.b(this.f12624a)) {
                this.d = true;
            } else {
                List<String> h = h();
                if (h != null) {
                    for (String str : h) {
                        DetailCacheData b = b(c(str));
                        if (b != null) {
                            this.f12624a.add(b);
                        }
                    }
                }
                d("checkDisk2Memory, 从协议2.0取数据:" + this.f12624a.size());
                if (ogv.a(this.f12624a)) {
                    DetailCacheData b2 = b(a());
                    if (b2 != null) {
                        this.f12624a.add(b2);
                    }
                    d("checkDisk2Memory, 从协议1.0取数据:" + this.f12624a.size());
                }
            }
        }
        d("checkDisk2Memory, end, mCacheDataList.size=" + this.f12624a.size());
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d("memory2disk...");
        ohh.b(i(), JSON.toJSON(this.f12624a));
        j();
    }

    private List<DetailCacheData> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        try {
            Object b = ohh.b(i());
            if (!(b instanceof JSONArray)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < ((JSONArray) b).size(); i++) {
                arrayList.add(DetailCacheData.parseFromJson(((JSONArray) b).getJSONObject(i)));
            }
            return arrayList;
        } catch (Throwable th) {
            th.printStackTrace();
            d("getCacheDataListFromDisk, error:" + th.getMessage());
            return null;
        }
    }

    private DetailCacheData b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("36223693", new Object[]{this, str});
        }
        DetailCacheData detailCacheData = null;
        try {
            Map a2 = oec.a(ohh.b(str), (Map) null);
            if (!ogv.a(a2)) {
                detailCacheData = (DetailCacheData) JSONObject.toJavaObject((JSONObject) a2, DetailCacheData.class);
            }
        } catch (Throwable th) {
            d("getCacheDataFromDisk, cacheKey=" + str + ", error=" + th.getMessage());
            th.printStackTrace();
        }
        d("getCacheDataFromDisk, cacheKey=" + str + ", data=" + detailCacheData);
        return detailCacheData;
    }

    private List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        try {
            Object b = ohh.b(g());
            if (b != null) {
                return JSONArray.parseArray(JSON.toJSONString(b), String.class);
            }
            return null;
        } catch (Throwable th) {
            d("contentIdsDisk2Memory error:" + th.getMessage());
            th.printStackTrace();
            return null;
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        return a() + "_" + str;
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        return a() + "_contentIds";
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return a() + "_whole_list";
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.d) {
            this.d = false;
            List<String> h = h();
            if (h == null) {
                return;
            }
            for (String str : h) {
                d(" --- 淘汰老的 --- contentId=" + str);
                ohh.b(c(str), null);
            }
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        spz.c("DetailCacheImpl", "[cachevideo][" + a() + "] :" + str);
    }
}
