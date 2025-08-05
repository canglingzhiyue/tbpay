package tb;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes6.dex */
public class jpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<UMDimKey, Object> CONTAINER_DIM_MAP;
    public static final Map<UMTagKey, String> CONTAINER_TAG_MAP;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f29687a;

    public static /* synthetic */ UMLinkLogInterface a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UMLinkLogInterface) ipChange.ipc$dispatch("8c51e28b", new Object[0]) : f29687a;
    }

    public static /* synthetic */ String a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5eeb72d", new Object[]{mtopRequest}) : b(mtopRequest);
    }

    static {
        kge.a(1614731283);
        f29687a = bpp.a();
        CONTAINER_TAG_MAP = new HashMap(1);
        CONTAINER_DIM_MAP = new HashMap(1);
        CONTAINER_TAG_MAP.put(UMTagKey.TAG_1, "ultron_container");
        CONTAINER_DIM_MAP.put(UMDimKey.TAG_1, "ultron_container");
    }

    public static void c(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64f7711", new Object[]{mtopRequest});
        } else {
            a(null, mtopRequest);
        }
    }

    public static void a(jny jnyVar, final MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43576e98", new Object[]{jnyVar, mtopRequest});
        } else if (mtopRequest == null) {
        } else {
            jqh.a(new Runnable() { // from class: tb.jpz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        UnifyLog.d("UltronMtopRequest", MtopRequest.this.toString(), new Object[0]);
                    } catch (Throwable th) {
                        com.taobao.android.ultron.common.utils.UnifyLog.d("UMLLUtils", "logMtopReq", th.getMessage());
                    }
                }
            });
        }
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc941389", new Object[]{str, str2, str3, str4, map, str5, str6});
            return;
        }
        try {
            f29687a.commitFailure(str, str2, "1.0", str3, str4, map, str5, str6);
        } catch (Throwable th) {
            com.taobao.android.ultron.common.utils.UnifyLog.d("UMLLUtils", "logError", th.getMessage());
        }
    }

    public static void a(final jny jnyVar, final MtopResponse mtopResponse, final MtopRequest mtopRequest, final boolean z, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e938864", new Object[]{jnyVar, mtopResponse, mtopRequest, new Boolean(z), map});
        } else if (jnyVar == null || mtopResponse == null) {
        } else {
            jqh.a(new Runnable() { // from class: tb.jpz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:35:0x0109 A[Catch: Throwable -> 0x017e, TryCatch #0 {Throwable -> 0x017e, blocks: (B:7:0x001b, B:9:0x0043, B:10:0x0048, B:33:0x0103, B:35:0x0109, B:37:0x0113, B:39:0x011e, B:41:0x0122, B:42:0x0128, B:43:0x0136, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x0164, B:32:0x00f4), top: B:55:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0136 A[Catch: Throwable -> 0x017e, TryCatch #0 {Throwable -> 0x017e, blocks: (B:7:0x001b, B:9:0x0043, B:10:0x0048, B:33:0x0103, B:35:0x0109, B:37:0x0113, B:39:0x011e, B:41:0x0122, B:42:0x0128, B:43:0x0136, B:45:0x014f, B:47:0x015a, B:49:0x015e, B:50:0x0164, B:32:0x00f4), top: B:55:0x001b }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 399
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.jpz.AnonymousClass2.run():void");
                }
            });
        }
    }

    private static String b(MtopRequest mtopRequest) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf430c6e", new Object[]{mtopRequest}) : (mtopRequest == null || (map = mtopRequest.dataParams) == null || map.isEmpty()) ? "" : JSON.toJSONString(map);
    }
}
