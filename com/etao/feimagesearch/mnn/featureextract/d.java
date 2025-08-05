package com.etao.feimagesearch.mnn.featureextract;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class d extends BaseMnnRunUnit<com.etao.feimagesearch.mnn.featureextract.a, com.etao.feimagesearch.mnn.featureextract.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "FeatureExtract";
    public static final String TASK_NAME = "plt_mobile_rongzai";

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.d f6776a;

    /* loaded from: classes3.dex */
    public static final class b implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d c;

        public b(long j, com.etao.feimagesearch.mnn.d dVar) {
            this.b = j;
            this.c = dVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                cot.c(d.TAG, "----errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                d dVar = d.this;
                d.a(dVar, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage(), SystemClock.elapsedRealtime() - this.b, this.c, -4);
            }
            this.c.a((com.etao.feimagesearch.mnn.d) com.etao.feimagesearch.mnn.featureextract.b.Companion.a(d.TASK_NAME, d.a(d.this), Long.valueOf(SystemClock.elapsedRealtime() - this.b), map));
        }
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public /* synthetic */ d(o oVar) {
        this();
    }

    public static final /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a55acb98", new Object[]{dVar}) : dVar.b();
    }

    public static final /* synthetic */ kotlin.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : f6776a;
    }

    public static final /* synthetic */ void a(d dVar, String str, long j, com.etao.feimagesearch.mnn.d dVar2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4690def5", new Object[]{dVar, str, new Long(j), dVar2, new Integer(i)});
        } else {
            dVar.a(str, j, dVar2, i);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, com.etao.feimagesearch.mnn.d dVar) {
        a((com.etao.feimagesearch.mnn.featureextract.a) obj, obj2, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b>) dVar);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ k[] f6777a;

        static {
            kge.a(866086055);
            f6777a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/featureextract/ImgFeatureExtractUnit;"))};
        }

        public final d a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("306d2a88", new Object[]{this});
            } else {
                kotlin.d a2 = d.a();
                a aVar = d.Companion;
                value = a2.getValue();
            }
            return (d) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private d() {
        super(TASK_NAME);
    }

    static {
        kge.a(348183583);
        Companion = new a(null);
        f6776a = e.a(LazyThreadSafetyMode.SYNCHRONIZED, ImgFeatureExtractUnit$Companion$instance$2.INSTANCE);
    }

    public void a(com.etao.feimagesearch.mnn.featureextract.a input, Object obj, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505f33e3", new Object[]{this, input, obj, callback});
            return;
        }
        q.c(input, "input");
        q.c(callback, "callback");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(input.b());
        if (a2 == null) {
            a("cannot find format of bitmap", SystemClock.elapsedRealtime() - elapsedRealtime, callback, -3);
        } else {
            a(a2, false, (MNNCVExecutor.b) new b(elapsedRealtime, callback));
        }
    }

    private final void a(String str, long j, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b> dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d767955", new Object[]{this, str, new Long(j), dVar, new Integer(i)});
        } else {
            dVar.a((com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b>) com.etao.feimagesearch.mnn.featureextract.b.Companion.a(TASK_NAME, b(), str, Long.valueOf(j), i));
        }
    }
}
