package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;

/* loaded from: classes.dex */
public abstract class ryu implements ryv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopConfig f33427a = null;
    public EnvModeEnum b = null;

    /* renamed from: tb.ryu$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33428a = new int[EnvModeEnum.values().length];

        static {
            try {
                f33428a[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33428a[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33428a[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33428a[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-527415183);
        kge.a(-1817851820);
    }

    @Override // tb.ryv
    public String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f592e79", new Object[]{this, str, str2, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ryv
    public String a(String str, String str2, String str3, HashMap<String, String> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90aa366a", new Object[]{this, str, str2, str3, hashMap, new Integer(i)});
        }
        return null;
    }

    public String a(HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8089feb", new Object[]{this, hashMap, str});
        }
        return null;
    }

    @Override // tb.ryv
    public String a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("848f5218", new Object[]{this, hashMap, hashMap2});
        }
        return null;
    }

    @Override // tb.ryv
    public HashMap<String, String> a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a6a0d665", new Object[]{this, hashMap, hashMap2, str, str2, new Boolean(z), str3});
        }
        return null;
    }

    @Override // tb.ryv
    public String b(HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18be6cac", new Object[]{this, hashMap, str});
        }
        return null;
    }

    @Override // tb.ryv
    public void a(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7c9ab", new Object[]{this, mtopConfig});
            return;
        }
        this.f33427a = mtopConfig;
        MtopConfig mtopConfig2 = this.f33427a;
        if (mtopConfig2 == null) {
            return;
        }
        this.b = mtopConfig2.envMode;
    }

    public int a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (this.b == null || (i = AnonymousClass1.f33428a[this.b.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return (i == 3 || i == 4) ? 2 : 0;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        MtopConfig mtopConfig = this.f33427a;
        return mtopConfig != null ? mtopConfig.authCode : "";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        MtopConfig mtopConfig = this.f33427a;
        return mtopConfig != null ? mtopConfig.instanceId : "";
    }
}
