package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class fws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b<Map<String, Integer>> f28171a;
    private fwy b;

    static {
        kge.a(-144213636);
    }

    public fws(fwy fwyVar) {
        this.b = fwyVar;
    }

    public boolean a(int i, fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a06c79f", new Object[]{this, new Integer(i), fwrVar, dXRuntimeContext})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        int b = fwrVar.b();
        short e = fwrVar.e();
        if (e < 0) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_COUNT_ERROR, "totalSize < 0"));
            return false;
        }
        this.f28171a = new b<>(e);
        int i2 = 0;
        while (i2 < e) {
            long g = fwrVar.g();
            byte d = fwrVar.d();
            if (d <= 0) {
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_ERROR, "count <= 0"));
                return z;
            }
            HashMap hashMap = new HashMap(d);
            for (int i3 = 0; i3 < d; i3++) {
                hashMap.put(this.b.a(fwrVar.g()), Integer.valueOf(fwrVar.f()));
            }
            this.f28171a.put(g, hashMap);
            i2++;
            z = false;
        }
        if (fwrVar.b() - b == i) {
            return true;
        }
        dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_ERROR, "reader.getPos() - startPos != length"));
        return false;
    }

    public b<Map<String, Integer>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("df391af0", new Object[]{this}) : this.f28171a;
    }
}
