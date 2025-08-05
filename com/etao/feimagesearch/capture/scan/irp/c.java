package com.etao.feimagesearch.capture.scan.irp;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.k;
import com.etao.feimagesearch.nn.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int IRP_CHANNEL_DETECT_FLAG = 256;
    public static final String TAG = "ImgChannelDetectManager";
    private static final d c;

    /* renamed from: a  reason: collision with root package name */
    private final LimitLinkedHashMap<Integer, com.etao.feimagesearch.mnn.channel.b> f6600a;
    private k b;

    private c() {
        this.f6600a = new LimitLinkedHashMap<>(16);
    }

    public /* synthetic */ c(o oVar) {
        this();
    }

    public static final /* synthetic */ LimitLinkedHashMap a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LimitLinkedHashMap) ipChange.ipc$dispatch("2e908831", new Object[]{cVar}) : cVar.f6600a;
    }

    public static final /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : c;
    }

    public static final /* synthetic */ k b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("b4e3b0d4", new Object[]{cVar}) : cVar.b;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6601a;

        static {
            kge.a(-754117904);
            f6601a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/capture/scan/irp/ImgChannelDetectManager;"))};
        }

        public final c a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("a109da38", new Object[]{this});
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

        @JvmStatic
        public final boolean a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{this, num})).booleanValue();
            }
            if (num != null) {
                num.intValue();
                if ((num.intValue() & 256) > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        kge.a(-1917642328);
        Companion = new a(null);
        c = e.a(LazyThreadSafetyMode.SYNCHRONIZED, ImgChannelDetectManager$Companion$instance$2.INSTANCE);
    }

    public final void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        f.Companion.a().a(com.etao.feimagesearch.mnn.channel.c.TASK_NAME, new C0222c(activityHashCode));
    }

    /* renamed from: com.etao.feimagesearch.capture.scan.irp.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0222c implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public C0222c(String str) {
            this.b = str;
        }

        @Override // com.etao.feimagesearch.nn.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                com.etao.feimagesearch.mnn.channel.c.Companion.a().a(new a(), this.b);
            }
        }

        /* renamed from: com.etao.feimagesearch.capture.scan.irp.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a implements k {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.etao.feimagesearch.mnn.k
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.a("PltCamera", c.TAG, "channel detect prepare success");
                k b = c.b(c.this);
                if (b == null) {
                    return;
                }
                b.a();
            }

            @Override // com.etao.feimagesearch.mnn.k
            public void a(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    return;
                }
                cot.a("PltCamera", c.TAG, "channel detect prepare failed errorCode=" + i + ", errorMsg=" + str);
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
        if (com.etao.feimagesearch.mnn.channel.c.Companion.a().i()) {
            callback.a();
        } else {
            this.b = callback;
        }
    }

    public final void b(k callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2737a6de", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        if (!q.a(callback, this.b)) {
            return;
        }
        this.b = null;
    }

    public final void a(com.etao.feimagesearch.mnn.channel.a channelDetectInput) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900f38f3", new Object[]{this, channelDetectInput});
            return;
        }
        q.c(channelDetectInput, "channelDetectInput");
        Integer b2 = channelDetectInput.b();
        if (b2 == null) {
            return;
        }
        int intValue = b2.intValue();
        if (!com.etao.feimagesearch.mnn.channel.c.Companion.a().i()) {
            this.f6600a.put(Integer.valueOf(intValue), new com.etao.feimagesearch.mnn.channel.b(-1, "unit prepare error", 0L));
        } else {
            com.etao.feimagesearch.mnn.channel.c.Companion.a().a(channelDetectInput, (Object) null, (com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b>) new b(intValue));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements com.etao.feimagesearch.mnn.d<com.etao.feimagesearch.mnn.channel.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.etao.feimagesearch.mnn.d
        public void a(com.etao.feimagesearch.mnn.channel.b output) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("900fad52", new Object[]{this, output});
                return;
            }
            q.c(output, "output");
            c.a(c.this).put(Integer.valueOf(this.b), output);
        }

        @Override // com.etao.feimagesearch.mnn.d
        public void a(Throwable throwable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, throwable});
                return;
            }
            q.c(throwable, "throwable");
            c.a(c.this).put(Integer.valueOf(this.b), new com.etao.feimagesearch.mnn.channel.b(-2, "unit run error", 0L));
        }
    }

    public final com.etao.feimagesearch.mnn.channel.b a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.mnn.channel.b) ipChange.ipc$dispatch("3fba9a91", new Object[]{this, num});
        }
        if (num != null) {
            num.intValue();
            return this.f6600a.get(num);
        }
        return new com.etao.feimagesearch.mnn.channel.b(-5, "invalid client img token", 0L);
    }

    public final void b(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        this.b = null;
        com.etao.feimagesearch.mnn.channel.c.Companion.a().a(activityHashCode);
        this.f6600a.clear();
    }
}
