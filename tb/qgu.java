package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.perf.MnnOnceDetectRecord;
import com.etao.feimagesearch.config.c;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qgu INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32925a;
    private static boolean b;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f32926a;
        public final /* synthetic */ qgt c;

        public a(List list, qgt qgtVar) {
            this.f32926a = list;
            this.c = qgtVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f32926a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                qgu.a(qgu.INSTANCE, this.c, linkedHashMap);
                int size = this.f32926a.size();
                for (int i = 0; i < size; i++) {
                    MnnOnceDetectRecord mnnOnceDetectRecord = (MnnOnceDetectRecord) this.f32926a.get(i);
                    Long mnnTime = mnnOnceDetectRecord.getMnnTime();
                    if ((mnnTime != null ? mnnTime.longValue() : 0L) > 0) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        qgu.a(qgu.INSTANCE, linkedHashMap2, "client_cost_time", mnnOnceDetectRecord.a(), 0L, 10000L);
                        qgu qguVar = qgu.INSTANCE;
                        Long mnnTime2 = mnnOnceDetectRecord.getMnnTime();
                        qgu.a(qguVar, linkedHashMap2, "mnn_cost_time", mnnTime2 != null ? mnnTime2.longValue() : 0L, 0L, 10000L);
                        qgu qguVar2 = qgu.INSTANCE;
                        Long mnnPreTime = mnnOnceDetectRecord.getMnnPreTime();
                        qgu.a(qguVar2, linkedHashMap2, "pre_time", mnnPreTime != null ? mnnPreTime.longValue() : 0L, 0L, 10000L);
                        qgu qguVar3 = qgu.INSTANCE;
                        Long mnnInferTime = mnnOnceDetectRecord.getMnnInferTime();
                        qgu.a(qguVar3, linkedHashMap2, "infer_time", mnnInferTime != null ? mnnInferTime.longValue() : 0L, 0L, 10000L);
                        qgu qguVar4 = qgu.INSTANCE;
                        Long mnnLogicTime = mnnOnceDetectRecord.getMnnLogicTime();
                        qgu.a(qguVar4, linkedHashMap2, "logic_time", mnnLogicTime != null ? mnnLogicTime.longValue() : 0L, 0L, 10000L);
                        qgu qguVar5 = qgu.INSTANCE;
                        Long mnnPostTime = mnnOnceDetectRecord.getMnnPostTime();
                        qgu.a(qguVar5, linkedHashMap2, "post_time", mnnPostTime != null ? mnnPostTime.longValue() : 0L, 0L, 10000L);
                        qgu qguVar6 = qgu.INSTANCE;
                        Long mnnPreTransTime = mnnOnceDetectRecord.getMnnPreTransTime();
                        qgu.a(qguVar6, linkedHashMap2, "const_time", mnnPreTransTime != null ? mnnPreTransTime.longValue() : 0L, 0L, 10000L);
                        arrayList.add(linkedHashMap2);
                        linkedHashMap.put("is_detect_result", String.valueOf(mnnOnceDetectRecord.b()));
                        cox.a("PLT", "AutodetectOncePerfV2", linkedHashMap2, linkedHashMap);
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("dimension", linkedHashMap);
                linkedHashMap3.put("measure", arrayList);
                TLogTracker.b("AutoDetectTrace", "Default", JSON.toJSONString(linkedHashMap3));
            }
        }
    }

    static {
        kge.a(-1469670639);
        INSTANCE = new qgu();
    }

    private qgu() {
    }

    public static final /* synthetic */ void a(qgu qguVar, Map map, String str, long j, Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6ba02c", new Object[]{qguVar, map, str, new Long(j), l, l2});
        } else {
            qguVar.a(map, str, j, l, l2);
        }
    }

    public static final /* synthetic */ void a(qgu qguVar, qgt qgtVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a8873a", new Object[]{qguVar, qgtVar, map});
        } else {
            qguVar.a(qgtVar, map);
        }
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f32925a) {
        } else {
            f32925a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("detect_cost_frames");
            arrayList.add("detect_cost_time");
            arrayList.add("mnn_detect_cost_frames");
            arrayList.add("mnn_detect_cost_time");
            arrayList.add("alinn_cost_frames");
            arrayList.add("alinn_cost_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("is_tao_init");
            arrayList2.add("is_page_init");
            arrayList2.add("device_level");
            arrayList2.add("first_model_type");
            arrayList2.add("is_smart_lens");
            cox.a("PLT", "AutodetectPerf", arrayList, arrayList2);
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (b) {
        } else {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("client_cost_time");
            arrayList.add("mnn_cost_time");
            arrayList.add("pre_time");
            arrayList.add("infer_time");
            arrayList.add("logic_time");
            arrayList.add("post_time");
            arrayList.add("const_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("is_tao_init");
            arrayList2.add("is_page_init");
            arrayList2.add("device_level");
            arrayList2.add("first_model_type");
            arrayList2.add("is_smart_lens");
            arrayList2.add("is_detect_result");
            cox.a("PLT", "AutodetectOncePerfV2", arrayList, arrayList2);
        }
    }

    private final void a(qgt qgtVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894b4b4b", new Object[]{this, qgtVar, map});
            return;
        }
        map.put("device_level", String.valueOf(c.b()));
        map.put("first_model_type", String.valueOf(qgtVar.d()));
        map.put("is_tao_init", String.valueOf(qgtVar.a()));
        map.put("is_page_init", String.valueOf(qgtVar.b()));
        map.put("is_smart_lens", String.valueOf(qgtVar.o()));
    }

    private final void a(Map<String, Double> map, String str, long j, Long l, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be95b7b", new Object[]{this, map, str, new Long(j), l, l2});
            return;
        }
        if (j <= (l != null ? l.longValue() : 0L)) {
            return;
        }
        if (j >= (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
            return;
        }
        map.put(str, Double.valueOf(j));
    }

    public final void a(qgt qgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb49bcfa", new Object[]{this, qgtVar});
        } else if (qgtVar == null) {
        } else {
            a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a(qgtVar, linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            a(linkedHashMap2, "detect_cost_time", qgtVar.f() - qgtVar.c(), 0L, 10000L);
            a(linkedHashMap2, "detect_cost_frames", qgtVar.g(), -1L, 10000L);
            a(linkedHashMap2, "mnn_detect_cost_time", qgtVar.m(), 0L, 10000L);
            a(linkedHashMap2, "mnn_detect_cost_frames", qgtVar.h(), -1L, 10000L);
            a(linkedHashMap2, "alinn_cost_time", qgtVar.j(), 0L, 10000L);
            a(linkedHashMap2, "alinn_cost_frames", qgtVar.i(), -1L, 10000L);
            cox.a("PLT", "AutodetectPerf", linkedHashMap2, linkedHashMap);
            if (!com.a()) {
                return;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("dimension", linkedHashMap);
            linkedHashMap3.put("measure", linkedHashMap2);
            TLogTracker.b("AutoDetectTrace", "Default", JSON.toJSONString(linkedHashMap3));
        }
    }

    public final void b(qgt qgtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ccc37b", new Object[]{this, qgtVar});
        } else if (qgtVar == null) {
        } else {
            b();
            VExecutors.defaultSharedThreadPool().submit(new a(qgtVar.l(), qgtVar));
        }
    }
}
