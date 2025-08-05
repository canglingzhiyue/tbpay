package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.weex_framework.r;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jvm;

/* loaded from: classes6.dex */
public class ity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-526517120);
    }

    public static jvm.d a(r rVar, Map<String, TemplateBean> map, imn imnVar, ConcurrentHashMap<String, jvm.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.d) ipChange.ipc$dispatch("a4168e4d", new Object[]{rVar, map, imnVar, concurrentHashMap}) : a(rVar, map, imnVar, concurrentHashMap, true);
    }

    public static jvm.d b(r rVar, Map<String, TemplateBean> map, imn imnVar, ConcurrentHashMap<String, jvm.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.d) ipChange.ipc$dispatch("5fbfbc6c", new Object[]{rVar, map, imnVar, concurrentHashMap}) : a(rVar, map, imnVar, concurrentHashMap, false);
    }

    private static jvm.d a(r rVar, Map<String, TemplateBean> map, imn imnVar, ConcurrentHashMap<String, jvm.c> concurrentHashMap, boolean z) {
        jvm.d b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.d) ipChange.ipc$dispatch("aabecbe9", new Object[]{rVar, map, imnVar, concurrentHashMap, new Boolean(z)});
        }
        if (map == null || map.isEmpty()) {
            return new jvm.d();
        }
        ArrayList arrayList = new ArrayList();
        if (map.size() > 0) {
            for (Map.Entry<String, TemplateBean> entry : map.entrySet()) {
                String str = entry.getValue().url;
                if (str != null && (concurrentHashMap == null || !concurrentHashMap.containsKey(str))) {
                    arrayList.add(new jvm.b(entry.getValue().url, entry.getValue().templateName, entry.getValue().md5));
                }
            }
        }
        Object[] objArr = new Object[2];
        String str2 = "wait";
        objArr[0] = z ? str2 : "no_wait";
        objArr[1] = Integer.valueOf(arrayList.size());
        k.d("[XS.request]", "[Request] Template download task start(%s), %d to download or load cache", objArr);
        if (z) {
            b = dpl.a().a(arrayList, imnVar.c().k().f29274a, rVar);
        } else {
            b = dpl.a().b(arrayList, imnVar.c().k().f29274a, rVar);
        }
        if (concurrentHashMap != null) {
            concurrentHashMap.putAll(b.f29819a);
        }
        Object[] objArr2 = new Object[3];
        if (!z) {
            str2 = "no_wait";
        }
        objArr2[0] = str2;
        objArr2[1] = Integer.valueOf(b.b);
        objArr2[2] = Integer.valueOf(b.b - b.c);
        k.d("[XS.request]", "[Request] Template download task finished(%s), downloadSuccCount: %d, failedCount: %d", objArr2);
        return b;
    }
}
