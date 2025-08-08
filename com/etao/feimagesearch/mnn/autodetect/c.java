package com.etao.feimagesearch.mnn.autodetect;

import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.mnn.k;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.util.f;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.text.n;
import tb.cof;
import tb.cot;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends BaseMnnRunUnit<com.etao.feimagesearch.mnn.autodetect.a, com.etao.feimagesearch.mnn.autodetect.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "SmartAutoDetectObjectUnit";
    public static final String TASK_NAME = "plt_smart_camera";
    private static final kotlin.d c;

    /* renamed from: a  reason: collision with root package name */
    private final com.etao.feimagesearch.mnn.utils.b f6752a;
    private final NetConfig b;
    private String d;
    private String e;

    /* renamed from: com.etao.feimagesearch.mnn.autodetect.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0232c implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f6755a;
        public final /* synthetic */ c b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d e;
        public final /* synthetic */ Bitmap f;

        public C0232c(long j, c cVar, boolean z, boolean z2, com.etao.feimagesearch.mnn.d dVar, Bitmap bitmap) {
            this.f6755a = j;
            this.b = cVar;
            this.c = z;
            this.d = z2;
            this.e = dVar;
            this.f = bitmap;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else if (mRTRuntimeException != null) {
                cot.b(c.TAG, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                this.e.a((Throwable) mRTRuntimeException);
            } else if (map == null) {
                this.e.a((Throwable) new RuntimeException("result and exception are all null"));
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.f6755a;
                String jSONString = JSON.toJSONString(map);
                c.b(this.b).a(currentTimeMillis);
                c.b(this.b).a(jSONString);
                cot.c(c.TAG, "result = " + jSONString + ", costTime = " + currentTimeMillis + ", width: " + this.f.getWidth() + 'x' + this.f.getHeight() + ' ');
                c.a(this.b, this.f, map, currentTimeMillis, this.e);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -207205326) {
            super.a((String) objArr[0]);
            return null;
        } else if (hashCode != 841311143) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((k) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public /* synthetic */ c(o oVar) {
        this();
    }

    public static final /* synthetic */ NetConfig a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetConfig) ipChange.ipc$dispatch("1574b114", new Object[]{cVar}) : cVar.b;
    }

    public static final /* synthetic */ kotlin.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : c;
    }

    public static final /* synthetic */ void a(c cVar, Bitmap bitmap, Map map, long j, com.etao.feimagesearch.mnn.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24375367", new Object[]{cVar, bitmap, map, new Long(j), dVar});
        } else {
            cVar.a(bitmap, map, j, dVar);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.mnn.utils.b b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.utils.b) ipChange.ipc$dispatch("d2888b91", new Object[]{cVar}) : cVar.f6752a;
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, com.etao.feimagesearch.mnn.d dVar) {
        a((com.etao.feimagesearch.mnn.autodetect.a) obj, obj2, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b>) dVar);
    }

    private c() {
        super("plt_smart_camera");
        this.f6752a = new com.etao.feimagesearch.mnn.utils.b();
        this.b = new NetConfig("plt_smart_camera", "plt_smart_camera", "", "");
        this.d = "";
        this.e = "";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6753a;

        static {
            kge.a(-1527357926);
            f6753a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/autodetect/SmartAutoDetectObjectUnit;"))};
        }

        public final c a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("9ca8ab42", new Object[]{this});
            } else {
                kotlin.d a2 = c.a();
                a aVar = c.Companion;
                value = a2.getValue();
            }
            return (c) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-658607790);
        Companion = new a(null);
        c = e.a(LazyThreadSafetyMode.SYNCHRONIZED, SmartAutoDetectObjectUnit$Companion$instance$2.INSTANCE);
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(k callback, String activityHashCode) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322563a7", new Object[]{this, callback, activityHashCode});
            return;
        }
        q.c(callback, "callback");
        q.c(activityHashCode, "activityHashCode");
        String b2 = cof.b(com.etao.feimagesearch.config.b.ADVANCE_AUTODETECT_EXPERIMENT);
        if (b2 == null) {
            b2 = "asDefaultBucketId";
        }
        c(b2);
        String dM = com.etao.feimagesearch.config.b.dM();
        q.a((Object) dM, "ConfigModel.getSmartLensBackTipConfig()");
        List b3 = n.b((CharSequence) dM, new String[]{":"}, false, 0, 6, (Object) null);
        if (b3.size() > 1) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(b3.get(1));
            str = jSONArray.toString();
            q.a((Object) str, "JSONArray().apply {\n    …gs[1])\n      }.toString()");
        } else {
            str = "";
        }
        this.e = str;
        String ef = com.etao.feimagesearch.config.b.ef();
        q.a((Object) ef, "ConfigModel.getSmartDetectAlgoConfig()");
        this.d = ef;
        com.etao.feimagesearch.mnn.b.Companion.a().b();
        super.a(new b(System.currentTimeMillis(), callback), activityHashCode);
    }

    /* loaded from: classes3.dex */
    public static final class b implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ k c;

        public b(long j, k kVar) {
            this.b = j;
            this.c = kVar;
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            this.c.a();
            com.etao.feimagesearch.mnn.utils.a.a(c.a(c.this), currentTimeMillis);
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            this.c.a(i, str);
            com.etao.feimagesearch.mnn.utils.a.a(c.a(c.this), currentTimeMillis, String.valueOf(i), str);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit
    public void a(HashMap<String, Object> args) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, args});
            return;
        }
        q.c(args, "args");
        if (!StringUtils.isEmpty(this.d)) {
            args.put(com.etao.feimagesearch.mnn.utils.a.KEY_CONFIG_STRING, this.d);
        }
        if (StringUtils.isEmpty(this.e)) {
            return;
        }
        args.put(com.etao.feimagesearch.mnn.utils.a.KEY_CLIENT_EXP_CONFIG_STRING, this.e);
    }

    public void a(com.etao.feimagesearch.mnn.autodetect.a input, Object obj, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a389fdfc", new Object[]{this, input, obj, callback});
            return;
        }
        q.c(input, "input");
        q.c(callback, "callback");
        cot.d(TAG, "call run ----");
        f.c a2 = f.a(input.a(), input.c(), input.d(), input.g(), input.b());
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
        }
        Bitmap bitmap = ((f.b) a2).b(input.e(), input.f()).a();
        q.a((Object) bitmap, "bitmap");
        a(bitmap, input.i(), input.h(), callback);
    }

    private final void a(Bitmap bitmap, boolean z, boolean z2, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be984762", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2), dVar});
            return;
        }
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(bitmap);
        if (a2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f6752a.f();
            HashMap<String, Object> hashMap = a2;
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.k, String.valueOf(com.etao.feimagesearch.config.c.b()));
            hashMap.put(com.etao.feimagesearch.mnn.utils.a.j, String.valueOf(z2));
            a(a2, z, new C0232c(currentTimeMillis, this, z2, z, dVar, bitmap));
            return;
        }
        a(bitmap, (Map<String, Object>) null, 0L, dVar);
    }

    private final void a(Bitmap bitmap, Map<String, Object> map, long j, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52113601", new Object[]{this, bitmap, map, new Long(j), dVar});
            return;
        }
        com.etao.feimagesearch.mnn.autodetect.b a2 = com.etao.feimagesearch.mnn.autodetect.b.Companion.a("plt_smart_camera", b(), bitmap, Long.valueOf(j), map);
        if (a2 == null) {
            a(false);
            dVar.a((com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b>) com.etao.feimagesearch.mnn.autodetect.b.Companion.a(bitmap, Long.valueOf(j)));
            return;
        }
        com.etao.feimagesearch.mnn.b a3 = com.etao.feimagesearch.mnn.b.Companion.a();
        String l = a2.l();
        if (l == null) {
            l = "";
        }
        a3.a(l);
        a(true);
        dVar.a((com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.autodetect.b>) a2);
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_smart_camera");
        cot.a("AutoDetect", "objectDetected", "taskName: plt_smart_camera");
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f6752a.d() >= 1000) {
        } else {
            this.f6752a.a(z);
            this.f6752a.b(true);
            com.etao.feimagesearch.mnn.utils.a.a("mnnAdvanceDetectionResult", this.f6752a);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        super.a(activityHashCode);
        com.etao.feimagesearch.mnn.b.Companion.a().b();
    }
}
