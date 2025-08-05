package com.etao.feimagesearch.mnn.featureextract;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.etao.feimagesearch.mnn.k;
import com.etao.feimagesearch.nn.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c INSTANCE;
    public static final int IRP_FEATURE_EXTRACT_FLAG = 261;
    public static final String TAG = "ImgFeatureExtract";

    /* renamed from: a  reason: collision with root package name */
    private static final LimitLinkedHashMap<Integer, com.etao.feimagesearch.mnn.featureextract.b> f6773a;
    private static final Map<Integer, Long> b;
    private static k c;

    static {
        kge.a(1512981298);
        INSTANCE = new c();
        f6773a = new LimitLinkedHashMap<>(8);
        b = new LinkedHashMap();
    }

    private c() {
    }

    public static final /* synthetic */ k a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("fe28d4c2", new Object[]{cVar}) : c;
    }

    public static final /* synthetic */ Map b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c7907ffd", new Object[]{cVar}) : b;
    }

    public static final /* synthetic */ LimitLinkedHashMap c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LimitLinkedHashMap) ipChange.ipc$dispatch("f723f362", new Object[]{cVar}) : f6773a;
    }

    @JvmStatic
    public static final boolean a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{num})).booleanValue();
        }
        if (num != null) {
            num.intValue();
            if ((num.intValue() & 261) > 0) {
                return true;
            }
        }
        return false;
    }

    public final void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        f.Companion.a().a(d.TASK_NAME, new b(activityHashCode));
    }

    /* loaded from: classes3.dex */
    public static final class b implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6775a;

        public b(String str) {
            this.f6775a = str;
        }

        @Override // com.etao.feimagesearch.nn.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                d.Companion.a().a(new a(), this.f6775a);
            }
        }

        /* loaded from: classes3.dex */
        public static final class a implements k {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.k
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.a("PltCamera", c.TAG, "feature extract prepare success");
                k a2 = c.a(c.INSTANCE);
                if (a2 == null) {
                    return;
                }
                a2.a();
            }

            @Override // com.etao.feimagesearch.mnn.k
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    return;
                }
                cot.a("PltCamera", c.TAG, "feature extract prepare failed errorCode=" + i + ", errorMsg=" + str);
            }
        }
    }

    public final void a(k callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05ee71d", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        if (d.Companion.a().i()) {
            callback.a();
        } else {
            c = callback;
        }
    }

    public final void b(k callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2737a6de", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        if (!q.a(callback, c)) {
            return;
        }
        c = null;
    }

    public final void a(com.etao.feimagesearch.mnn.featureextract.a featureExtractInput) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501ceb", new Object[]{this, featureExtractInput});
            return;
        }
        q.c(featureExtractInput, "featureExtractInput");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int a2 = featureExtractInput.a();
        if (!d.Companion.a().i()) {
            f6773a.put(Integer.valueOf(a2), com.etao.feimagesearch.mnn.featureextract.b.Companion.a(d.TASK_NAME, "", "unit prepare error", 0L, -1));
            return;
        }
        b.put(Integer.valueOf(a2), Long.valueOf(elapsedRealtime));
        d.Companion.a().a(featureExtractInput, (Object) null, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b>) new a(a2));
    }

    /* loaded from: classes3.dex */
    public static final class a implements com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.featureextract.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6774a;

        public a(int i) {
            this.f6774a = i;
        }

        @Override // com.etao.feimagesearch.mnn.d
        public void a(com.etao.feimagesearch.mnn.featureextract.b output) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a50914a", new Object[]{this, output});
                return;
            }
            q.c(output, "output");
            Long l = (Long) c.b(c.INSTANCE).remove(Integer.valueOf(this.f6774a));
            if (l != null) {
                output.b(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
            }
            c.c(c.INSTANCE).put(Integer.valueOf(this.f6774a), output);
        }

        @Override // com.etao.feimagesearch.mnn.d
        public void a(Throwable throwable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, throwable});
                return;
            }
            q.c(throwable, "throwable");
            com.etao.feimagesearch.mnn.featureextract.b a2 = com.etao.feimagesearch.mnn.featureextract.b.Companion.a(d.TASK_NAME, "", "unit run error", 0L, -2);
            Long l = (Long) c.b(c.INSTANCE).remove(Integer.valueOf(this.f6774a));
            if (l != null) {
                a2.b(Long.valueOf(SystemClock.elapsedRealtime() - l.longValue()));
            }
            c.c(c.INSTANCE).put(Integer.valueOf(this.f6774a), a2);
        }
    }

    public final com.etao.feimagesearch.mnn.featureextract.b b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.mnn.featureextract.b) ipChange.ipc$dispatch("730860d0", new Object[]{this, num});
        }
        if (num == null) {
            return null;
        }
        num.intValue();
        if (f6773a.containsKey(num)) {
            return f6773a.get(num);
        }
        return com.etao.feimagesearch.mnn.featureextract.b.Companion.a(d.TASK_NAME, "", "", 0L, -5);
    }

    public final void b(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        d.Companion.a().a(activityHashCode);
        c = null;
        f6773a.clear();
        b.clear();
    }
}
