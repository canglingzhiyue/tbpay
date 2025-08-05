package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;

/* loaded from: classes.dex */
public class fwy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b<String> f28176a;

    static {
        kge.a(2014156428);
        kge.a(-1704593867);
    }

    public boolean a(int i, fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a06c79f", new Object[]{this, new Integer(i), fwrVar, dXRuntimeContext})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        int c = fwrVar.c();
        short e = fwrVar.e();
        if (e < 0) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_VARSTRING_LOADER_COUNT_ERROR));
            return false;
        }
        this.f28176a = new b<>(e);
        for (int i2 = 0; i2 < e; i2++) {
            long g = fwrVar.g();
            short e2 = fwrVar.e();
            if (fwrVar.b() + e2 <= c) {
                this.f28176a.put(g, new String(fwrVar.a(), fwrVar.b(), (int) e2));
                fwrVar.b(e2);
            } else {
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", 70005));
                Log.e("StringLoader_TMTEST", "read string over");
                return false;
            }
        }
        return true;
    }

    public String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        b<String> bVar = this.f28176a;
        if (bVar != null && bVar.get(j) != null) {
            return this.f28176a.get(j);
        }
        if (!DinamicXEngine.j()) {
            return null;
        }
        Log.e("StringLoader_TMTEST", "getString null:" + j);
        return null;
    }
}
