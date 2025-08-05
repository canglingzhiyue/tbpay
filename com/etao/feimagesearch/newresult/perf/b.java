package com.etao.feimagesearch.newresult.perf;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.c;
import com.etao.feimagesearch.model.d;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.cof;
import tb.cox;
import tb.djy;
import tb.kge;
import tb.mto;
import tb.nnh;
import tb.rwf;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final String MODULE_CHAIN = "PLT_CHAIN";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6857a;
    private static boolean b;

    static {
        kge.a(-1311731402);
        INSTANCE = new b();
    }

    private b() {
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f6857a) {
        } else {
            f6857a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("irp_open_with_anim");
            arrayList.add("irp_open");
            arrayList.add("irp_open_pre_process");
            arrayList.add("irp_load_with_anim");
            arrayList.add("irp_open_with_first_item_render");
            arrayList.add("irp_open_final");
            arrayList.add("irp_load");
            arrayList.add("irp_init");
            arrayList.add("irp_image_load_wait");
            arrayList.add("irp_net_wait");
            arrayList.add("irp_muise_init");
            arrayList.add("irp_muise_data_transfer");
            arrayList.add("image_load");
            arrayList.add("image_detect");
            arrayList.add("face_detect");
            arrayList.add("channel_detect");
            arrayList.add("watermark_detect");
            arrayList.add("video_watermark_detect");
            arrayList.add("image_process");
            arrayList.add("image_base64_size");
            arrayList.add("image_feature_extract");
            arrayList.add("net_all");
            arrayList.add("net_mtop_all");
            arrayList.add("net_one_way_aserver");
            arrayList.add("net_parse");
            arrayList.add("net_server_rt");
            arrayList.add("net_send_size");
            arrayList.add("net_recv_time");
            arrayList.add("net_recv_size");
            arrayList.add("list_data_parse_time");
            arrayList.add("list_load_time");
            arrayList.add("list_templates_time");
            arrayList.add("list_templates_download_count");
            arrayList.add("list_first_render_time");
            arrayList.add("irp_muise_data_trans_time");
            arrayList.add("irp_muise_page_process_time");
            arrayList.add("irp_muise_list_process_time");
            arrayList.add("irp_muise_process_call_time");
            arrayList.add("net_event_call_time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(djy.SERIALIZE_EXP_BUCKET_ID);
            arrayList2.add(d.KEY_PHOTO_FROM);
            arrayList2.add("pssource");
            arrayList2.add("device_level");
            arrayList2.add("auto_task_id");
            arrayList2.add("paging_state");
            arrayList2.add("paging_bucket");
            arrayList2.add("channel");
            arrayList2.add("watermark_status");
            arrayList2.add("face_count");
            cox.a("PLT", "IrpLoad", arrayList, arrayList2);
        }
    }

    public static /* synthetic */ void a(b bVar, Map map, String str, long j, Long l, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aefbd0f", new Object[]{bVar, map, str, new Long(j), l, new Integer(i), obj});
            return;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        bVar.a(map, str, j, l);
    }

    private final void a(Map<String, Double> map, String str, long j, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ef1b3c", new Object[]{this, map, str, new Long(j), l});
        } else if (j <= 0) {
        } else {
            if (l != null && j > l.longValue()) {
                return;
            }
            map.put(str, Double.valueOf(j));
        }
    }

    @JvmStatic
    public static final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17af8add", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            INSTANCE.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            INSTANCE.a(aVar, linkedHashMap);
            HashMap hashMap = new HashMap();
            INSTANCE.c(aVar, hashMap);
            INSTANCE.b(aVar, hashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            INSTANCE.d(aVar, linkedHashMap2);
            cox.a("PLT", "IrpLoad", hashMap, linkedHashMap);
            if (aVar.g() != null) {
                nnh.Companion.a(aVar.g(), "irpPerfDimension", linkedHashMap);
                nnh.Companion.a(aVar.g(), "irpPerfMeasure", hashMap);
                nnh.Companion.a(aVar.g(), "irpPerfNodeResult", linkedHashMap2);
                nnh.Companion.a(aVar.g(), "bizPageLoadEnd", Long.valueOf(rwf.a(aVar.aq(), aVar.ap())));
            }
            TLogTracker.b("IrpPerf", "Default", JSON.toJSONString(hashMap));
        }
    }

    private final void a(a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49499b08", new Object[]{this, aVar, map});
            return;
        }
        String a2 = aVar.a();
        if (a2 == null) {
            a2 = "unknown";
        }
        map.put("pssource", a2);
        String b2 = aVar.b();
        if (b2 == null) {
            b2 = "unknown";
        }
        map.put(d.KEY_PHOTO_FROM, b2);
        String irpBucketId = cof.b("tbAndroidPltIrpBackSourceOfflineV2");
        if (TextUtils.isEmpty(irpBucketId)) {
            irpBucketId = "-1";
        }
        q.a((Object) irpBucketId, "irpBucketId");
        map.put(djy.SERIALIZE_EXP_BUCKET_ID, irpBucketId);
        map.put("device_level", String.valueOf(c.b()));
        String d = aVar.d();
        if (d == null) {
            d = "";
        }
        map.put("auto_task_id", d);
        map.put("paging_state", String.valueOf(aVar.e()));
        String f = aVar.f();
        if (f == null) {
            f = "";
        }
        map.put("paging_bucket", f);
        map.put("face_count", String.valueOf(aVar.R()));
        map.put("watermark_status", String.valueOf(aVar.ai()));
        map.put("channel", String.valueOf(aVar.aj()));
    }

    private final void d(a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78aa7c8b", new Object[]{this, aVar, map});
            return;
        }
        map.put("image_compress_maxlength", Integer.valueOf(aVar.an()));
        String ao = aVar.ao();
        if (ao == null) {
            ao = "";
        }
        map.put("image_compress_format_type", ao);
        String ak = aVar.ak();
        if (ak == null) {
            ak = "";
        }
        map.put("image_size_origin", ak);
        map.put("image_base64_length", Long.valueOf(aVar.n()));
        map.put("image_compress_quality", Integer.valueOf(aVar.am()));
        String al = aVar.al();
        if (al == null) {
            al = "";
        }
        map.put("image_size_resized", al);
    }

    private final void b(a aVar, Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bf3b89", new Object[]{this, aVar, map});
            return;
        }
        a(this, map, "image_load", aVar.h(), null, 8, null);
        a(this, map, "image_detect", aVar.i(), null, 8, null);
        a(this, map, "face_detect", aVar.j(), null, 8, null);
        a(this, map, "channel_detect", aVar.c(), null, 8, null);
        a(this, map, "watermark_detect", aVar.k(), null, 8, null);
        a(this, map, "video_watermark_detect", aVar.l(), null, 8, null);
        a(this, map, "image_feature_extract", aVar.o(), null, 8, null);
        a(this, map, "image_process", aVar.m(), null, 8, null);
        a(this, map, "image_base64_size", aVar.n(), null, 8, null);
        a(this, map, "net_event_call_time", aVar.D() - aVar.ag(), null, 8, null);
        a(this, map, "net_all", aVar.p(), null, 8, null);
        a(this, map, "net_mtop_all", aVar.q(), null, 8, null);
        a(this, map, "net_send_size", aVar.w(), null, 8, null);
        a(this, map, "net_server_rt", aVar.v(), null, 8, null);
        a(this, map, "net_one_way_aserver", aVar.r(), null, 8, null);
        a(this, map, "net_recv_size", aVar.u(), null, 8, null);
        a(this, map, "net_recv_time", aVar.t(), null, 8, null);
        a(this, map, "net_parse", aVar.s(), null, 8, null);
        a(this, map, "list_load_time", aVar.V(), null, 8, null);
        a(this, map, "list_data_parse_time", aVar.X(), null, 8, null);
        a(this, map, "list_templates_time", aVar.W(), null, 8, null);
        a(this, map, "list_templates_download_count", aVar.Y(), null, 8, null);
        a(this, map, "list_first_render_time", aVar.Z(), null, 8, null);
        a(this, map, "irp_muise_data_trans_time", aVar.ab() - aVar.ae(), null, 8, null);
        a(this, map, "irp_muise_list_process_time", aVar.ac() - aVar.ab(), null, 8, null);
        a(this, map, "irp_muise_page_process_time", aVar.ad() - aVar.ac(), null, 8, null);
        a(this, map, "irp_muise_process_call_time", aVar.af() - aVar.ad(), null, 8, null);
    }

    private final void c(a aVar, Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be34dc0a", new Object[]{this, aVar, map});
            return;
        }
        a(this, map, "irp_open_with_first_item_render", aVar.aa() - aVar.x(), null, 8, null);
        a(this, map, "irp_open_final", rwf.a(aVar.aa(), aVar.G()) - aVar.x(), null, 8, null);
        a(this, map, "irp_open_with_anim", aVar.G() - aVar.x(), null, 8, null);
        a(this, map, "irp_open", aVar.F() - aVar.x(), null, 8, null);
        a(this, map, "irp_open_pre_process", aVar.y() - aVar.x(), null, 8, null);
        a(this, map, "irp_load_with_anim", aVar.G() - aVar.y(), null, 8, null);
        a(this, map, "irp_load", aVar.F() - aVar.y(), null, 8, null);
        a(this, map, "irp_init", aVar.z() - aVar.y(), null, 8, null);
        a(this, map, "irp_muise_init", aVar.B() - aVar.A(), null, 8, null);
        a(this, map, "irp_image_load_wait", aVar.C() - aVar.y(), null, 8, null);
        a(this, map, "irp_net_wait", aVar.D() - aVar.y(), null, 8, null);
        a(map, "irp_muise_data_transfer", aVar.F() - aVar.E(), 3000L);
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (b) {
        } else {
            b = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("success");
            arrayList.add("failure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("ava_type");
            arrayList2.add(djy.SERIALIZE_EXP_BUCKET_ID);
            arrayList2.add(d.KEY_PHOTO_FROM);
            arrayList2.add("pssource");
            arrayList2.add("ava_type");
            arrayList2.add("err_type");
            arrayList2.add("err_msg");
            arrayList2.add("device_level");
            cox.a("PLT", "IrpAva", arrayList, arrayList2);
        }
    }

    @JvmStatic
    public static final void a(IrpAvaRecord irpAvaRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f32bb7c", new Object[]{irpAvaRecord});
        } else if (irpAvaRecord == null) {
        } else {
            INSTANCE.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            INSTANCE.a(irpAvaRecord, linkedHashMap);
            HashMap hashMap = new HashMap();
            if (irpAvaRecord.b()) {
                hashMap.put("success", Double.valueOf(1.0d));
                hashMap.put("failure", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
            } else {
                hashMap.put("failure", Double.valueOf(1.0d));
                hashMap.put("success", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
            }
            cox.a("PLT", "IrpAva", hashMap, linkedHashMap);
        }
    }

    private final void a(IrpAvaRecord irpAvaRecord, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe993889", new Object[]{this, irpAvaRecord, map});
            return;
        }
        String e = irpAvaRecord.e();
        if (e == null) {
            e = "unknown";
        }
        map.put("pssource", e);
        String f = irpAvaRecord.f();
        if (f == null) {
            f = "unknown";
        }
        map.put(d.KEY_PHOTO_FROM, f);
        map.put("device_level", String.valueOf(c.b()));
        String irpBucketId = cof.b("tbAndroidPltIrpBackSourceOfflineV2");
        if (TextUtils.isEmpty(irpBucketId)) {
            irpBucketId = "-1";
        }
        q.a((Object) irpBucketId, "irpBucketId");
        map.put(djy.SERIALIZE_EXP_BUCKET_ID, irpBucketId);
        map.put("ava_type", irpAvaRecord.a());
        if (irpAvaRecord.b()) {
            return;
        }
        String c = irpAvaRecord.c();
        if (c == null) {
            c = "unknown";
        }
        map.put("err_type", c);
        String d = irpAvaRecord.d();
        if (d == null) {
            d = "unknown";
        }
        map.put("err_msg", d);
    }
}
