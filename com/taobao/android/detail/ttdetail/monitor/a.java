package com.taobao.android.detail.ttdetail.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/monitor/CodeMappingHandler;", "", "()V", "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0425a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Integer[]> f10769a;

    static {
        kge.a(-182454479);
        Companion = new C0425a(null);
        HashMap<String, Integer[]> hashMap = new HashMap<>();
        hashMap.put("D-N", new Integer[]{-300007, -300008, -300009, -300003, -300004, -300005, -300006});
        hashMap.put("D-R", new Integer[]{-100001, -100011, -100002});
        hashMap.put("D-Other", new Integer[]{-100016, -100017, -100018, -300010, -100008, -100015, -100021, -100022, -100025, -100026, -100027, -100028, -100029, -500005, -500006, -800007, -500007});
        hashMap.put("D-SKU", new Integer[]{-700001, -700002, -700003, -700004, -700005, -700006, -700007, -700008});
        f10769a = hashMap;
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]) : f10769a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R9\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/detail/ttdetail/monitor/CodeMappingHandler$Companion;", "", "()V", "mappingHandler", "Ljava/util/HashMap;", "", "", "", "Lkotlin/collections/HashMap;", "getMappingHandler", "()Ljava/util/HashMap;", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* renamed from: com.taobao.android.detail.ttdetail.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0425a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2971961);
        }

        private C0425a() {
        }

        public /* synthetic */ C0425a(o oVar) {
            this();
        }

        public final HashMap<String, Integer[]> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : a.a();
        }
    }
}
