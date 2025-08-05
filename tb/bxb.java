package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class bxb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f26154a;
    private static final float b;
    private static final boolean c;
    private static final float sCustomSampling;
    private static final float sMtopSampling;
    private static final float sPVSampling;
    public static final String sPid = "28046-tracker";

    static {
        kge.a(-53336941);
        sPVSampling = bxd.f();
        sCustomSampling = bxd.h();
        sMtopSampling = bxd.g();
        b = bxd.a("order_perf_sampling_of_jstracker");
        f26154a = bxd.e();
        c = jpx.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r10.equals(com.taobao.android.order.constants.OrderBizCode.orderDetail) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008b, code lost:
        if (r10.equals(com.taobao.android.order.constants.OrderBizCode.orderDetail) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bxb.b(java.lang.String):java.lang.String");
    }

    private static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue();
        }
        if (!jpx.a()) {
            return f;
        }
        return 1.0f;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!f26154a) {
        } else {
            jpr.a(jpu.a(hzb.b, sPid, b(str)).c(str2).b(str3));
        }
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!f26154a) {
        } else {
            if (!(jptVar instanceof a)) {
                throw new IllegalArgumentException("请使用OrderCustomModel");
            }
            float f = sCustomSampling;
            if (f <= 0.0f) {
                f = jptVar.a();
            }
            jpr.a(jptVar.a(a(f)));
        }
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!f26154a) {
        } else {
            if (!(sdaVar instanceof b)) {
                throw new IllegalArgumentException("请使用OrderMtopModel");
            }
            float f = sMtopSampling;
            if (f <= 0.0f) {
                f = sdaVar.a();
            }
            jpr.a(sdaVar.a(a(f)));
        }
    }

    public static void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123a1ce", new Object[]{str, new Float(f)});
        } else if (!f26154a) {
        } else {
            sdb sdbVar = new sdb(hzb.b, sPid, b(str));
            float f2 = sPVSampling;
            if (f2 <= 0.0f) {
                f2 = f;
            }
            jpr.a(sdbVar.a(a(f2)));
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(377606683);
        }

        private a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("19d28480", new Object[]{str, str2}) : new a(str, str2, bxb.sPid, bxb.b(str));
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(31296228);
        }

        private b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static b a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3fca1ea4", new Object[]{str, str2, new Boolean(z)}) : new b(str, bxb.sPid, bxb.b(str), str2, z);
        }
    }
}
