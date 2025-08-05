package com.alibaba.ability.impl.performance;

import com.alibaba.ability.e;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.akt;
import tb.alm;
import tb.aln;
import tb.als;
import tb.ilb;
import tb.ild;
import tb.kge;

/* loaded from: classes2.dex */
public final class PerformanceAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_BATTERY_WARNING_LISTENER = "addBatteryWarningListener";
    public static final String API_ADD_CPU_WARNING_LISTENER = "addCPUWarningListener";
    public static final String API_ADD_GLOBAL_WARNING_LISTENER = "addGlobalWarningListener";
    public static final String API_ADD_MEMORY_WARNING_LISTENER = "addMemoryWarningListener";
    public static final String API_GET_BATTERY_INFO = "getBatteryInfo";
    public static final String API_GET_CPU_INFO = "getCPUInfo";
    public static final String API_GET_DEVICE_LEVEL = "getDeviceLevel";
    public static final String API_GET_MEMORY_INFO = "getMemoryInfo";
    public static final String API_REMOVE_BATTERY_WARNING_LISTENER = "removeBatteryWarningListener";
    public static final String API_REMOVE_CPU_WARNING_LISTENER = "removeCPUWarningListener";
    public static final String API_REMOVE_GLOBAL_WARNING_LISTENER = "removeGlobalWarningListener";
    public static final String API_REMOVE_MEMORY_WARNING_LISTENER = "removeMemoryWarningListener";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private List<b> f1929a;
    private List<b> b;
    private List<b> c;
    private List<b> d;

    static {
        kge.a(1663950562);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(PerformanceAbility performanceAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(1365645226);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        switch (api.hashCode()) {
            case -1120553913:
                if (api.equals(API_REMOVE_BATTERY_WARNING_LISTENER)) {
                    List<b> list = this.d;
                    if (list != null) {
                        a(list);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case -860790743:
                if (api.equals(API_ADD_CPU_WARNING_LISTENER)) {
                    String a2 = e.a(params, "bizID", "");
                    String str11 = (String) context.c("url");
                    ArrayList arrayList = this.c;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.c = arrayList;
                        t tVar = t.INSTANCE;
                    }
                    a(1, 101, a2, str11, callback, arrayList);
                    return null;
                }
                break;
            case -592801628:
                if (api.equals(API_ADD_BATTERY_WARNING_LISTENER)) {
                    String a3 = e.a(params, "bizID", "");
                    String str12 = (String) context.c("url");
                    ArrayList arrayList2 = this.d;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.d = arrayList2;
                        t tVar2 = t.INSTANCE;
                    }
                    a(4, 999, a3, str12, callback, arrayList2);
                    return null;
                }
                break;
            case 164252716:
                if (api.equals(API_ADD_GLOBAL_WARNING_LISTENER)) {
                    String a4 = e.a(params, "bizID", "");
                    String str13 = (String) context.c("url");
                    ArrayList arrayList3 = this.f1929a;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        this.f1929a = arrayList3;
                        t tVar3 = t.INSTANCE;
                    }
                    a(9, 999, a4, str13, callback, arrayList3);
                    return null;
                }
                break;
            case 424323113:
                if (api.equals(API_REMOVE_GLOBAL_WARNING_LISTENER)) {
                    List<b> list2 = this.f1929a;
                    if (list2 != null) {
                        a(list2);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 800516878:
                if (api.equals(API_ADD_MEMORY_WARNING_LISTENER)) {
                    String a5 = e.a(params, "bizID", "");
                    String str14 = (String) context.c("url");
                    ArrayList arrayList4 = this.b;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        this.b = arrayList4;
                        t tVar4 = t.INSTANCE;
                    }
                    a(2, 999, a5, str14, callback, arrayList4);
                    return null;
                }
                break;
            case 1060587275:
                if (api.equals(API_REMOVE_MEMORY_WARNING_LISTENER)) {
                    List<b> list3 = this.b;
                    if (list3 != null) {
                        a(list3);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 1076526656:
                if (api.equals(API_GET_CPU_INFO)) {
                    com.taobao.android.resourceguardian.data.model.b a6 = ild.a(1, 101, 101);
                    Pair[] pairArr = new Pair[2];
                    if (a6 == null || (str = a6.c) == null) {
                        str = "unknown";
                    }
                    pairArr[0] = j.a("level", str);
                    if (a6 == null || (str2 = a6.d) == null) {
                        str2 = "-1";
                    }
                    pairArr[1] = j.a("value", str2);
                    return new FinishResult(new JSONObject(ai.a(pairArr)), null, 2, null);
                }
                break;
            case 1382743845:
                if (api.equals(API_GET_BATTERY_INFO)) {
                    com.taobao.android.resourceguardian.data.model.b a7 = ild.a(4, 401, 101);
                    com.taobao.android.resourceguardian.data.model.b a8 = ild.a(4, 402, 101);
                    Pair[] pairArr2 = new Pair[4];
                    if (a7 == null || (str3 = a7.c) == null) {
                        str3 = "unknown";
                    }
                    pairArr2[0] = j.a("level", str3);
                    if (a7 == null || (str4 = a7.d) == null) {
                        str4 = "-1";
                    }
                    pairArr2[1] = j.a("value", str4);
                    if (a8 == null || (str5 = a8.c) == null) {
                        str5 = "unknown";
                    }
                    pairArr2[2] = j.a("temperatureLevel", str5);
                    if (a8 == null || (str6 = a8.d) == null) {
                        str6 = "-1";
                    }
                    pairArr2[3] = j.a("temperature", str6);
                    return new FinishResult(new JSONObject(ai.a(pairArr2)), null, 2, null);
                }
                break;
            case 1498271052:
                if (api.equals(API_REMOVE_CPU_WARNING_LISTENER)) {
                    List<b> list4 = this.c;
                    if (list4 != null) {
                        a(list4);
                    }
                    return new FinishResult(new JSONObject(), null, 2, null);
                }
                break;
            case 1687020869:
                if (api.equals(API_GET_MEMORY_INFO)) {
                    com.taobao.android.resourceguardian.data.model.b a9 = ild.a(2, 201, 101);
                    com.taobao.android.resourceguardian.data.model.b a10 = ild.a(2, 202, 101);
                    Pair[] pairArr3 = new Pair[4];
                    if (a9 == null || (str7 = a9.c) == null) {
                        str7 = "unknown";
                    }
                    pairArr3[0] = j.a("level", str7);
                    if (a9 == null || (str8 = a9.d) == null) {
                        str8 = "-1";
                    }
                    pairArr3[1] = j.a("value", str8);
                    if (a10 == null || (str9 = a10.c) == null) {
                        str9 = "unknown";
                    }
                    pairArr3[2] = j.a("nativeMemoryLevel", str9);
                    if (a10 == null || (str10 = a10.d) == null) {
                        str10 = "-1";
                    }
                    pairArr3[3] = j.a("nativeMemorySize", str10);
                    return new FinishResult(new JSONObject(ai.a(pairArr3)), null, 2, null);
                }
                break;
            case 2093832600:
                if (api.equals(API_GET_DEVICE_LEVEL)) {
                    return new FinishResult(new JSONObject(ai.a(j.a("result", a()))), null, 2, null);
                }
                break;
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a("api " + api + " not found");
    }

    private final void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (b bVar : list) {
            ild.b(bVar);
        }
        list.clear();
    }

    private final void a(int i, int i2, String str, String str2, aln alnVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156b6cba", new Object[]{this, new Integer(i), new Integer(i2), str, str2, alnVar, list});
            return;
        }
        b bVar = new b(i, i2, str, str2, alnVar);
        ild.a(bVar);
        list.add(bVar);
    }

    /* loaded from: classes2.dex */
    public static final class b implements ilb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f1930a;
        private final int b;
        private final String c;
        private final String d;
        private final aln e;

        static {
            kge.a(313359184);
            kge.a(-485676334);
        }

        public b(int i, int i2, String str, String str2, aln callback) {
            q.d(callback, "callback");
            this.f1930a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = callback;
        }

        @Override // tb.ilb
        public boolean a(com.taobao.android.resourceguardian.data.model.b warningInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("733ff0c7", new Object[]{this, warningInfo})).booleanValue();
            }
            q.d(warningInfo, "warningInfo");
            this.e.a((ExecuteResult) new FinishResult(new JSONObject(ai.a(j.a("category", RGCategoryInfo.a(warningInfo.f14879a)), j.a("type", RGTypeInfo.a(warningInfo.b)), j.a("level", warningInfo.c), j.a("value", warningInfo.d), j.a("profileType", warningInfo.f), j.a("process", warningInfo.g))), "onWarning"));
            return true;
        }

        @Override // tb.ilb
        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
        }

        @Override // tb.ilb
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f1930a;
        }

        @Override // tb.ilb
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            String str = this.c;
            return str == null ? "" : str;
        }

        @Override // tb.ilb
        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
            }
            String str = this.d;
            return str == null ? "" : str;
        }
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        List<b> list = this.f1929a;
        if (list != null) {
            a(list);
            this.f1929a = null;
        }
        List<b> list2 = this.b;
        if (list2 != null) {
            a(list2);
            this.b = null;
        }
        List<b> list3 = this.c;
        if (list3 != null) {
            a(list3);
            this.c = null;
        }
        List<b> list4 = this.d;
        if (list4 == null) {
            return;
        }
        a(list4);
        this.d = null;
    }

    private final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            int a2 = akt.a();
            return a2 != 0 ? a2 != 1 ? a2 != 2 ? "unknown" : "low" : "medium" : "high";
        } catch (Throwable unused) {
            return "unknown";
        }
    }
}
