package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\nH\u0002R,\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/queue/AttachedQueue;", "", "()V", "attachedRecords", "", "", "", "", "attachedResponsesMap", "", "Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", "attachedStats", "bizSeqMapper", "isAllAttachedResponse", "", "onAttachedResponse", "", "attachedResponse", "onMainResponse", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "recordAttachAndChangeStat", "", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<xih>> f34308a = new ConcurrentHashMap();
    private final Map<String, Integer> b = new ConcurrentHashMap();
    private final Map<Integer, Map<String, Integer>> c = new ConcurrentHashMap();
    private final Map<Integer, Map<String, Set<Integer>>> d = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", TplMsg.VALUE_T_NATIVE_RETURN, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue() : rue.a(Integer.valueOf(((xih) t).f()), Integer.valueOf(((xih) t2).f()));
        }
    }

    public final synchronized List<xih> a(xij mainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b049d3c8", new Object[]{this, mainResponse});
        }
        q.d(mainResponse, "mainResponse");
        int f = mainResponse.f();
        this.c.put(Integer.valueOf(f), mainResponse.e());
        for (String str : mainResponse.e().keySet()) {
            this.b.put(str, Integer.valueOf(f));
        }
        ArrayList<xih> arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : this.b.entrySet()) {
            List<xih> list = this.f34308a.get(entry.getKey());
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (xih xihVar : arrayList) {
            b(xihVar);
        }
        this.f34308a.clear();
        return arrayList;
    }

    public final synchronized List<xih> a(xih attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14f51046", new Object[]{this, attachedResponse});
        }
        q.d(attachedResponse, "attachedResponse");
        if (!attachedResponse.e()) {
            return new ArrayList();
        }
        String d = attachedResponse.d();
        if (this.b.get(d) == null) {
            ArrayList arrayList = this.f34308a.get(d);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty()) {
                this.f34308a.put(d, arrayList);
            }
            arrayList.add(attachedResponse);
            if (arrayList.size() > 1) {
                p.a((List) arrayList, (Comparator) new a());
            }
            return new ArrayList();
        }
        b(attachedResponse);
        return p.a(attachedResponse);
    }

    private final void b(xih xihVar) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d56a62", new Object[]{this, xihVar});
            return;
        }
        String d = xihVar.d();
        int f = xihVar.f();
        Integer num2 = this.b.get(d);
        Map<String, Integer> map = this.c.get(num2);
        if (map == null || (num = map.get(d)) == null) {
            return;
        }
        Map<Integer, Map<String, Set<Integer>>> map2 = this.d;
        Integer valueOf = Integer.valueOf(f);
        LinkedHashMap linkedHashMap = map2.get(valueOf);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map2.put(valueOf, linkedHashMap);
        }
        Map<String, Set<Integer>> map3 = linkedHashMap;
        LinkedHashSet linkedHashSet = map3.get(d);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map3.put(d, linkedHashSet);
        }
        Set<Integer> set = linkedHashSet;
        set.add(Integer.valueOf(f));
        if (set.size() != num.intValue()) {
            return;
        }
        map.remove(d);
        if (!map.isEmpty()) {
            return;
        }
        Map<Integer, Map<String, Integer>> map4 = this.c;
        if (map4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        x.i(map4).remove(num2);
    }

    public final synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return this.c.isEmpty();
    }
}
