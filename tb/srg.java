package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class srg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Integer> f33852a = new ConcurrentHashMap();
    private final Map<String, Integer> b = new ConcurrentHashMap();
    private final String d = "Record";
    private final String e = "Local";
    private final String f = "Remote";

    static {
        kge.a(756959690);
    }

    public static /* synthetic */ String a(srg srgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9f44ab0", new Object[]{srgVar}) : srgVar.c;
    }

    public static /* synthetic */ Map b(srg srgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("430706e6", new Object[]{srgVar}) : srgVar.f33852a;
    }

    public static /* synthetic */ Map c(srg srgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7c5817a7", new Object[]{srgVar}) : srgVar.b;
    }

    public srg(String str) {
        this.c = str + "Record";
    }

    public boolean a(BootImageInfo bootImageInfo) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75806d92", new Object[]{this, bootImageInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(bootImageInfo.itemId)) {
            return false;
        }
        Integer num2 = this.f33852a.get(bootImageInfo.itemId);
        if (num2 == null || (num = this.b.get(bootImageInfo.itemId)) == null) {
            return true;
        }
        kej.a("BusinessFatigueRecord", this.c + ",itemId:" + bootImageInfo.itemId + " fatigueRecord:" + num2 + ",remoteFatigue:" + num);
        return num2.intValue() < num.intValue();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ssg a2 = ssg.a();
        a2.a(this.c + "Local", new srm() { // from class: tb.srg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.srm
            public void a(String str) {
                Map map;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TextUtils.isEmpty(str)) {
                    kej.a("BusinessFatigueRecord", srg.a(srg.this) + ",fatigueRecordMap cache null");
                } else {
                    try {
                        map = (Map) JSON.parseObject(str, new TypeReference<Map<String, Integer>>() { // from class: tb.srg.1.1
                        }, new Feature[0]);
                    } catch (Exception e) {
                        kej.a("BusinessFatigueRecord", "loadBusinessFatigueRecord fatigueRecordMap error", e);
                        map = null;
                    }
                    if (map != null) {
                        srg.b(srg.this).putAll(map);
                    }
                    kej.a("BusinessFatigueRecord", srg.a(srg.this) + ",fatigueRecordMap:" + srg.b(srg.this).size());
                }
            }
        });
        ssg a3 = ssg.a();
        a3.a(this.c + "Remote", new srm() { // from class: tb.srg.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.srm
            public void a(String str) {
                Map map;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else if (TextUtils.isEmpty(str)) {
                    kej.a("BusinessFatigueRecord", srg.a(srg.this) + ",remoteFatigueMap cache null");
                } else {
                    try {
                        map = (Map) JSON.parseObject(str, new TypeReference<Map<String, Integer>>() { // from class: tb.srg.2.1
                        }, new Feature[0]);
                    } catch (Exception e) {
                        kej.a("BusinessFatigueRecord", "loadBusinessFatigueRecord remoteFatigueMap error", e);
                        map = null;
                    }
                    if (map != null) {
                        srg.c(srg.this).putAll(map);
                    }
                    kej.a("BusinessFatigueRecord", srg.a(srg.this) + ",remoteFatigueMap:" + srg.c(srg.this).size());
                }
            }
        });
    }

    public void b(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7fb2d", new Object[]{this, bootImageInfo});
        } else if (TextUtils.isEmpty(bootImageInfo.itemId)) {
        } else {
            Integer num = this.f33852a.get(bootImageInfo.itemId);
            if (num != null) {
                i = 1 + num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            this.f33852a.put(bootImageInfo.itemId, valueOf);
            kej.a("BusinessFatigueRecord", this.c + ",saveFatigueRecord,itemId:" + bootImageInfo.itemId + ",count:" + valueOf);
            ssg a2 = ssg.a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append("Local");
            a2.a(sb.toString(), JSON.toJSONString(this.f33852a));
        }
    }

    public void a(List<BootImageInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        for (BootImageInfo bootImageInfo : list) {
            if (!TextUtils.isEmpty(bootImageInfo.itemId)) {
                kej.a("BusinessFatigueRecord", this.c + ",updateRemoteFatigue,itemId:" + bootImageInfo.itemId + ",times:" + bootImageInfo.times);
                this.b.put(bootImageInfo.itemId, Integer.valueOf(bootImageInfo.times));
            }
        }
        ssg a2 = ssg.a();
        a2.a(this.c + "Remote", JSON.toJSONString(this.b));
        for (Map.Entry<String, Integer> entry : this.f33852a.entrySet()) {
            if (!this.b.containsKey(entry.getKey())) {
                kej.a("BusinessFatigueRecord", this.c + ",removeFatigueRecordMap,itemId:" + entry.getKey());
                this.f33852a.remove(entry.getKey());
            }
        }
        ssg a3 = ssg.a();
        a3.a(this.c + "Local", JSON.toJSONString(this.f33852a));
    }
}
