package com.taobao.android.alinnkit.alinn;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.core.AliNNForwardType;
import com.taobao.android.alinnkit.net.AliNNKitBaseNet;
import tb.dpn;
import tb.dpo;
import tb.dpq;
import tb.kge;

/* loaded from: classes4.dex */
public class AliNNNetInstance extends AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9018a;
    public String b;
    public String c;
    private long d;

    /* loaded from: classes4.dex */
    public enum MemoryMode {
        Memory_Normal(0),
        Memory_High(1),
        Memory_Low(2);
        
        public int mode;

        MemoryMode(int i) {
            this.mode = i;
        }
    }

    /* loaded from: classes4.dex */
    public enum PowerMode {
        Power_Normal(0),
        Power_High(1),
        Power_Low(2);
        
        public int mode;

        PowerMode(int i) {
            this.mode = i;
        }
    }

    /* loaded from: classes4.dex */
    public enum PrecisionMode {
        Precision_Normal(0),
        Precision_High(1),
        Precision_Low(2);
        
        public int mode;

        PrecisionMode(int i) {
            this.mode = i;
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9019a = MemoryMode.Memory_Normal.mode;
        public int b = PowerMode.Power_Normal.mode;
        public int c = PrecisionMode.Precision_Normal.mode;

        static {
            kge.a(-668797253);
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f9020a = AliNNForwardType.FORWARD_CPU.type;
        public int b = 4;
        public String[] c = null;
        public a d = new a();

        static {
            kge.a(-1496529123);
        }
    }

    static {
        kge.a(1131260233);
    }

    public static /* synthetic */ Object ipc$super(AliNNNetInstance aliNNNetInstance, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(AliNNNetInstance aliNNNetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6098ffa2", new Object[]{aliNNNetInstance})).longValue() : aliNNNetInstance.d;
    }

    public static /* synthetic */ void b(AliNNNetInstance aliNNNetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862d08af", new Object[]{aliNNNetInstance});
        } else {
            aliNNNetInstance.a();
        }
    }

    public static AliNNNetInstance a(Context context, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("dfcae268", new Object[]{context, str, str2});
        }
        long nativeCreateNetFromFile = AliNNNetNative.nativeCreateNetFromFile(str);
        if (0 == nativeCreateNetFromFile) {
            Log.e("alinnnet-v2", "Create Net Failed from file " + str);
            return null;
        }
        try {
            z = dpo.a(context, AliNNNetNative.nativeNetBizCode(nativeCreateNetFromFile), str2);
        } catch (Exception e) {
            dpq.a("alinnnet-v2", e.getMessage(), new Object[0]);
            z = false;
        }
        if (!z) {
            dpq.a("alinnnet-v2", "license code or model not match, please input the correct code or models", new Object[0]);
            AliNNNetNative.nativeReleaseNet(nativeCreateNetFromFile);
            return null;
        }
        return new AliNNNetInstance(nativeCreateNetFromFile);
    }

    public static AliNNNetInstance a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("400edeca", new Object[]{context, str, str2, str3, str4, str5});
        }
        if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4) || StringUtils.isEmpty(str5)) {
            return a(context, str, str2);
        }
        long currentTimeMillis = System.currentTimeMillis();
        AliNNNetInstance a2 = a(context, str, str2);
        dpn.b(str3, str4, str5, a2 != null ? "0" : "ALINN_UNCOMMIT_VALUE", a2 != null, (float) (System.currentTimeMillis() - currentTimeMillis));
        a2.f9018a = str3;
        a2.b = str4;
        a2.c = str5;
        return a2;
    }

    /* loaded from: classes4.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;
        private boolean c;

        static {
            kge.a(1886108187);
        }

        /* loaded from: classes4.dex */
        public class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private float[] b = null;
            private int[] c = null;
            private byte[] d = null;
            private long e;

            static {
                kge.a(-435605726);
            }

            public a(long j) {
                this.e = j;
            }

            public long a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.e;
            }

            public int[] b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : AliNNNetNative.nativeTensorGetDimensions(this.e);
            }

            public float[] c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (float[]) ipChange.ipc$dispatch("ab8ad2b7", new Object[]{this});
                }
                d();
                return this.b;
            }

            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                if (this.b == null) {
                    this.b = new float[AliNNNetNative.nativeTensorGetData(this.e, null)];
                }
                AliNNNetNative.nativeTensorGetData(this.e, this.b);
            }
        }

        private c(long j) {
            this.b = 0L;
            this.c = false;
            this.b = j;
        }

        private c(long j, boolean z) {
            this.b = 0L;
            this.c = false;
            this.b = j;
            this.c = z;
        }

        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                AliNNNetNative.nativeRunSession(AliNNNetInstance.a(AliNNNetInstance.this), this.b);
            }
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("751fc52e", new Object[]{this, str});
            }
            long nativeGetSessionInput = AliNNNetNative.nativeGetSessionInput(AliNNNetInstance.a(AliNNNetInstance.this), this.b, str);
            if (0 == nativeGetSessionInput) {
                Log.e("alinnnet-v2", "Can't find seesion input: " + str);
                return null;
            }
            return new a(nativeGetSessionInput);
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8e2116cd", new Object[]{this, str});
            }
            long nativeGetSessionOutput = AliNNNetNative.nativeGetSessionOutput(AliNNNetInstance.a(AliNNNetInstance.this), this.b, str);
            if (0 == nativeGetSessionOutput) {
                Log.e("alinnnet-v2", "Can't find seesion output: " + str);
                return null;
            }
            return new a(nativeGetSessionOutput);
        }

        public synchronized void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            AliNNNetInstance.b(AliNNNetInstance.this);
            AliNNNetNative.nativeReleaseSession(AliNNNetInstance.a(AliNNNetInstance.this), this.b);
            this.b = 0L;
        }
    }

    public c a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6ce15c8d", new Object[]{this, bVar});
        }
        a();
        if (bVar == null) {
            bVar = new b();
        }
        long nativeCreateSession = AliNNNetNative.nativeCreateSession(this.d, bVar.f9020a, bVar.b, bVar.d.f9019a, bVar.d.b, bVar.d.c, bVar.c);
        if (0 == nativeCreateSession) {
            Log.e("alinnnet-v2", "Create Session Error");
            return null;
        }
        return new c(nativeCreateSession);
    }

    public c b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7aed866c", new Object[]{this, bVar});
        }
        a();
        b bVar2 = bVar == null ? new b() : bVar;
        boolean[] zArr = {false};
        long nativeCreateSessionWithFlag = AliNNNetNative.nativeCreateSessionWithFlag(this.d, bVar2.f9020a, bVar2.b, bVar2.d.f9019a, bVar2.d.b, bVar2.d.c, bVar2.c, zArr);
        if (0 == nativeCreateSessionWithFlag) {
            Log.e("alinnnet-v2", "Create Session Error");
            return null;
        }
        return new c(nativeCreateSessionWithFlag, zArr[0]);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d == 0) {
            throw new RuntimeException("AliNNNetInstance native pointer is null, it may has been released");
        }
    }

    @Override // com.taobao.android.alinnkit.net.AliNNKitBaseNet
    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        a();
        AliNNNetNative.nativeReleaseNet(this.d);
        this.d = 0L;
    }

    private AliNNNetInstance(long j) {
        this.d = j;
    }
}
