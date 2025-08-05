package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.f;

/* loaded from: classes6.dex */
public final class rid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f33162a;
    public String b;
    private f c;
    private a d;

    /* loaded from: classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(969551427);
        }

        public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4a4dc6b", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
            }
            return false;
        }

        public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel, fgf fgfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c0211f6", new Object[]{this, ultronPerformanceFlowModel, fgfVar})).booleanValue();
            }
            return false;
        }

        public boolean b(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d5735aec", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
            }
            return false;
        }
    }

    static {
        kge.a(684044531);
    }

    public rid(String str, String str2) {
        this.f33162a = str;
        this.b = str2;
    }

    public rid a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rid) ipChange.ipc$dispatch("b083bb4b", new Object[]{this, aVar});
        }
        this.d = aVar;
        return this;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("74bd1b14", new Object[]{this}) : this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f33162a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public f d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("83a1b7e7", new Object[]{this}) : this.c;
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce5d664", new Object[]{this, fVar});
        } else {
            this.c = fVar;
        }
    }
}
