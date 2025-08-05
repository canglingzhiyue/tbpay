package com.etao.feimagesearch.mnn.channel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends BaseMnnRunUnit<com.etao.feimagesearch.mnn.channel.a, com.etao.feimagesearch.mnn.channel.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TASK_NAME = "plt_channel_detect";
    private static final d b;

    /* renamed from: a  reason: collision with root package name */
    private final String f6762a;

    /* loaded from: classes3.dex */
    public static final class b implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.mnn.d b;
        public final /* synthetic */ long c;

        public b(com.etao.feimagesearch.mnn.d dVar, long j) {
            this.b = dVar;
            this.c = j;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                String a2 = c.a(c.this);
                cot.c(a2, "----errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                c cVar = c.this;
                com.etao.feimagesearch.mnn.d dVar = this.b;
                c.a(cVar, -2, dVar, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage(), SystemClock.elapsedRealtime() - this.c);
            }
            if (map == null) {
                return;
            }
            Object obj = map.get("imgClientChannel");
            String a3 = com.etao.feimagesearch.mnn.utils.a.a(map);
            if (obj != null && (obj instanceof Integer)) {
                this.b.a((com.etao.feimagesearch.mnn.d) new com.etao.feimagesearch.mnn.channel.b((Integer) obj, a3, SystemClock.elapsedRealtime() - this.c));
                return;
            }
            c cVar2 = c.this;
            com.etao.feimagesearch.mnn.d dVar2 = this.b;
            if (TextUtils.isEmpty(a3)) {
                a3 = "extraInfo is empty";
            }
            c.a(cVar2, -3, dVar2, a3, SystemClock.elapsedRealtime() - this.c);
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public /* synthetic */ c(o oVar) {
        this();
    }

    public static final /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("922d4b0f", new Object[]{cVar}) : cVar.f6762a;
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : b;
    }

    public static final /* synthetic */ void a(c cVar, int i, com.etao.feimagesearch.mnn.d dVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca196c", new Object[]{cVar, new Integer(i), dVar, str, new Long(j)});
        } else {
            cVar.a(i, dVar, str, j);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, com.etao.feimagesearch.mnn.d dVar) {
        a((com.etao.feimagesearch.mnn.channel.a) obj, obj2, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b>) dVar);
    }

    private c() {
        super(TASK_NAME);
        this.f6762a = "ChannelDetectUnit";
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ k[] f6763a;

        static {
            kge.a(-1614130923);
            f6763a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/channel/ChannelDetectUnit;"))};
        }

        public final c a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("a531c6f7", new Object[]{this});
            } else {
                d a2 = c.a();
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
        kge.a(-1514417651);
        Companion = new a(null);
        b = e.a(LazyThreadSafetyMode.SYNCHRONIZED, ChannelDetectUnit$Companion$instance$2.INSTANCE);
    }

    public void a(com.etao.feimagesearch.mnn.channel.a input, Object obj, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5431feb", new Object[]{this, input, obj, callback});
            return;
        }
        q.c(input, "input");
        q.c(callback, "callback");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(input.c());
        if (a2 == null) {
            a(-2, callback, "cannot find format of bitmap", SystemClock.elapsedRealtime() - elapsedRealtime);
            return;
        }
        a2.put(com.etao.feimagesearch.mnn.utils.a.i, input.a() ? input.d() : "");
        a(a2, false, (MNNCVExecutor.b) new b(callback, elapsedRealtime));
    }

    private final void a(int i, com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b> dVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a322863", new Object[]{this, new Integer(i), dVar, str, new Long(j)});
        } else {
            dVar.a((com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b>) new com.etao.feimagesearch.mnn.channel.b(Integer.valueOf(i), str, j));
        }
    }
}
