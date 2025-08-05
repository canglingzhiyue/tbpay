package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.d;
import com.etao.feimagesearch.nn.h;
import com.etao.feimagesearch.nn.l;
import com.etao.feimagesearch.util.z;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import com.taobao.android.alinnkit.core.AliNNForwardType;

/* loaded from: classes3.dex */
public abstract class crb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FEATURE_LOADED = 4;
    public static final int FEATURE_PARTLY_LOADED = 8;
    public static final int FEATURE_UNLOADED = 0;
    public static final int MODEL_INITIALIZING = 8;
    public static final int MODEL_LOADED = 2;
    public static final int MODEL_UNLOADED = 0;

    /* renamed from: a  reason: collision with root package name */
    public AliNNNetInstance f26461a;
    public AliNNNetInstance.c b;
    public AliNNImageProcess.a c;
    public crc d;
    public int e = 0;

    static {
        kge.a(1985514257);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public crb(crc crcVar) {
        this.d = crcVar;
        cot.d("AliNNModel", "AliNNModel: " + toString());
    }

    private static String a(crc crcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2476e09c", new Object[]{crcVar});
        }
        if (crcVar != null && crcVar.a()) {
            try {
                String a2 = l.a(crcVar.b, crcVar.c);
                if (TextUtils.isEmpty(a2)) {
                    z.a().a("DOWNLOAD_MODEL", -1);
                    a2 = l.a(crcVar.b, false, crcVar.c, crcVar.b());
                    h.a(z.a().a("DOWNLOAD_MODEL"), crcVar.b());
                }
                if (TextUtils.isEmpty(a2)) {
                    h.a("downloadFailed", crcVar.b());
                }
                return a2;
            } catch (Exception unused) {
                h.a("downloadException", crcVar.b());
            }
        }
        return "";
    }

    public int b() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.b != null) {
            if (!b.b()) {
                this.b.b();
            }
            this.b = null;
        }
        AliNNNetInstance aliNNNetInstance = this.f26461a;
        if (aliNNNetInstance != null) {
            aliNNNetInstance.release();
            this.f26461a = null;
        }
        try {
            a2 = a(this.d);
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(a2)) {
            return a(a2, this.d.d);
        }
        cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint.DataPoint.IRP_NETWORK_BUILD_FAILED.getPoint(), "network", this.d.b(), "reason", "emptyPath");
        return 0;
    }

    private AliNNForwardType a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNForwardType) ipChange.ipc$dispatch("df28dabf", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return AliNNForwardType.FORWARD_CPU;
        }
        if (i == 1) {
            return AliNNForwardType.FORWARD_OPENCL;
        }
        if (i == 2) {
            return AliNNForwardType.FORWARD_NPU;
        }
        return AliNNForwardType.FORWARD_CPU;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            synchronized (this) {
                z.a().a("INIT_MODEL", -1);
                if (this.d.e()) {
                    this.f26461a = d.a(com.b(), str, this.d.d());
                } else {
                    this.f26461a = AliNNNetInstance.a(com.b(), str, this.d.d() != null ? this.d.d() : NetConfig.AUTH_CODE, NetConfig.ALINN_BIZ_NAME, this.d.c(), this.d.b());
                }
                AliNNNetInstance.b bVar = new AliNNNetInstance.b();
                bVar.f9020a = a(i).type;
                bVar.b = 4;
                if (this.f26461a != null) {
                    try {
                        this.b = this.f26461a.b(bVar);
                    } catch (Exception unused) {
                        this.b = this.f26461a.a(bVar);
                    }
                }
                long a2 = z.a().a("INIT_MODEL");
                h.a(a2, this.d.b(), j());
                dpn.b(NetConfig.ALINN_BIZ_NAME, this.d.c(), this.d.b(), this.b != null ? "0" : "ALINN_UNCOMMIT_VALUE", this.f26461a != null, (float) a2);
                if (this.f26461a == null) {
                    h.a("createNetInstanceFailed", k());
                }
            }
            return this.f26461a != null ? 2 : 0;
        } catch (Exception unused2) {
            cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint.DataPoint.IRP_NETWORK_BUILD_FAILED.getPoint(), "network", k(), "reason", "createNetException");
            h.a("createNetInstanceException", k());
            return 0;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.b != null) {
                if (!b.b()) {
                    this.b.b();
                }
                this.b = null;
            }
            if (this.f26461a != null) {
                this.f26461a.release();
                this.f26461a = null;
            }
            this.e &= -3;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.f26461a != null && this.b != null) {
                try {
                    this.b.a();
                } catch (Exception unused) {
                    h.a("runNetException", k());
                }
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e = this.e & (-5) & (-9);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c();
        e();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : (this.e & 4) == 4;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : (this.e & 2) == 2;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : g() && h();
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        int i = this.d.d;
        return i != 0 ? i != 1 ? i != 2 ? eoe.TYPE_CPU : "npu" : "gpu-opencl" : eoe.TYPE_CPU;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        crc crcVar = this.d;
        return crcVar != null ? crcVar.b() : "";
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ModelId = " + this.d.c() + " ModelName = " + this.d.b();
    }
}
