package com.etao.feimagesearch.mnn.decode;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.mnn.k;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.cof;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class a extends BaseMnnRunUnit<com.etao.feimagesearch.mnn.decode.b, com.etao.feimagesearch.mnn.decode.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0233a Companion;
    public static final String EXACT_STRATEGY = "exact";
    public static final String FULL_STRATEGY = "full";
    public static final String TAG = "AI_decode_AlbumDecodeUnit";
    public static final String TAG_PREFIX = "AI_decode_";
    public static final String TASK_NAME = "plt_code_detect";

    /* renamed from: a  reason: collision with root package name */
    private static final d f6765a;

    /* loaded from: classes3.dex */
    public static final class c implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f6768a;
        public final /* synthetic */ a b;
        public final /* synthetic */ com.etao.feimagesearch.mnn.decode.b c;
        public final /* synthetic */ HashMap d;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d e;

        public c(long j, a aVar, com.etao.feimagesearch.mnn.decode.b bVar, HashMap hashMap, com.etao.feimagesearch.mnn.d dVar) {
            this.f6768a = j;
            this.b = aVar;
            this.c = bVar;
            this.d = hashMap;
            this.e = dVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            int i = 0;
            int i2 = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            cot.c(a.TAG, "after process ");
            if (mRTRuntimeException != null) {
                cot.c(a.TAG, "----errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                com.etao.feimagesearch.mnn.decode.c cVar = new com.etao.feimagesearch.mnn.decode.c(null, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                a.a(this.b, false);
                this.e.a((com.etao.feimagesearch.mnn.d) cVar);
            }
            if (map == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f6768a;
            cot.c(a.TAG, "result is " + map + "} ,\n costTime: " + currentTimeMillis);
            ArrayList arrayList = (ArrayList) map.get("boxes");
            String extraInfo = com.etao.feimagesearch.mnn.utils.a.a(map);
            if (arrayList == null || arrayList.isEmpty()) {
                if (extraInfo == null) {
                    extraInfo = "extraInfo is empty";
                }
                com.etao.feimagesearch.mnn.decode.c cVar2 = new com.etao.feimagesearch.mnn.decode.c(null, extraInfo);
                a.a(this.b, true);
                this.e.a((com.etao.feimagesearch.mnn.d) cVar2);
                return;
            }
            int width = this.c.a().getWidth();
            int height = this.c.a().getHeight();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList3 = (ArrayList) it.next();
                if (arrayList3.size() == 4) {
                    float f = width;
                    float f2 = height;
                    arrayList2.add(new Rect((int) (((Number) arrayList3.get(i)).floatValue() * f), (int) (((Number) arrayList3.get(i2)).floatValue() * f2), (int) (f * ((Number) arrayList3.get(2)).floatValue()), (int) (((Number) arrayList3.get(3)).floatValue() * f2)));
                }
                i = 0;
                i2 = 1;
            }
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "albumCodeDetectResult", 19999, "costTime", String.valueOf(currentTimeMillis), "extraInfo", extraInfo);
            a.a(this.b, true);
            q.a((Object) extraInfo, "extraInfo");
            this.e.a((com.etao.feimagesearch.mnn.d) new com.etao.feimagesearch.mnn.decode.c(arrayList2, extraInfo));
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 841311143) {
            super.a((k) objArr[0], (String) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: com.etao.feimagesearch.mnn.decode.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0233a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6766a;

        static {
            kge.a(1892504185);
            f6766a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(C0233a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/decode/AlbumDecodeUnit;"))};
        }

        public final a a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("edf0df28", new Object[]{this});
            } else {
                d a2 = a.a();
                C0233a c0233a = a.Companion;
                value = a2.getValue();
            }
            return (a) value;
        }

        private C0233a() {
        }

        public /* synthetic */ C0233a(o oVar) {
            this();
        }
    }

    private a() {
        super("plt_code_detect");
    }

    public /* synthetic */ a(o oVar) {
        this();
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : f6765a;
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b67e2c", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, com.etao.feimagesearch.mnn.d dVar) {
        a((com.etao.feimagesearch.mnn.decode.b) obj, obj2, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.decode.c>) dVar);
    }

    static {
        kge.a(493518961);
        Companion = new C0233a(null);
        f6765a = e.a(LazyThreadSafetyMode.SYNCHRONIZED, AlbumDecodeUnit$Companion$instance$2.INSTANCE);
    }

    /* loaded from: classes3.dex */
    public static final class b implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f6767a;

        public b(k kVar) {
            this.f6767a = kVar;
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "AlbumDecodeBuildSuccess", 19999, new String[0]);
            this.f6767a.a();
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            cot.b(a.TAG, "plt_code_detect errorCode: " + i + ", errorMsg: " + str);
            this.f6767a.a(i, str);
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "AlbumDecodeBuildFailed", 19999, "errorCode", String.valueOf(i), "errorMsg", str);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(k callback, String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322563a7", new Object[]{this, callback, activityHashCode});
            return;
        }
        q.c(callback, "callback");
        q.c(activityHashCode, "activityHashCode");
        String b2 = cof.b(com.etao.feimagesearch.config.b.MA_DETECT_EXPERIMENT);
        if (b2 == null) {
            b2 = "maDetectBucketId";
        }
        c(b2);
        super.a(new b(callback), activityHashCode);
    }

    public void a(com.etao.feimagesearch.mnn.decode.b input, Object obj, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.decode.c> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16dccff", new Object[]{this, input, obj, callback});
            return;
        }
        q.c(input, "input");
        q.c(callback, "callback");
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(input.a());
        if (a2 != null) {
            a2.put(com.etao.feimagesearch.mnn.utils.a.e, input.b());
            cot.c(TAG, "prepare do process");
            a(a2, false, (MNNCVExecutor.b) new c(System.currentTimeMillis(), this, input, a2, callback));
            return;
        }
        cot.b(TAG, "cannot find format of bitmap");
        com.etao.feimagesearch.mnn.decode.c cVar = new com.etao.feimagesearch.mnn.decode.c(null, "cannot find format of bitmap");
        a(false);
        callback.a((com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.decode.c>) cVar);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = com.etao.feimagesearch.structure.capture.a.f6987a;
        String[] strArr = new String[10];
        strArr[0] = BaseMnnRunUnit.KEY_TASK_NAME;
        strArr[1] = "plt_code_detect";
        strArr[2] = BaseMnnRunUnit.KEY_TASK_CID;
        strArr[3] = b();
        strArr[4] = "base64tfsOss";
        strArr[5] = "";
        strArr[6] = "result";
        strArr[7] = z ? "success" : "fail";
        strArr[8] = "decodeType";
        strArr[9] = "normal";
        coy.a(str, "algoDebug", 19999, strArr);
    }
}
