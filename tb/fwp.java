package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;

/* loaded from: classes.dex */
public class fwp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f28168a;
    private int b;
    private b<String> c;

    static {
        kge.a(-1784785764);
        kge.a(-1704593867);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f28168a = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        if (this.b == 0) {
            return true;
        }
        int i = this.f28168a;
        if (i <= 0) {
            return false;
        }
        fwrVar.c(i);
        int c = fwrVar.c();
        short e = fwrVar.e();
        if (e < 0) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_VARSTRING_LOADER_COUNT_ERROR));
            return false;
        }
        this.c = new b<>(e);
        for (int i2 = 0; i2 < e; i2++) {
            long g = fwrVar.g();
            int f = fwrVar.f();
            if (fwrVar.b() + f <= c) {
                this.c.put(g, new String(fwrVar.a(), fwrVar.b(), f));
                fwrVar.b(f);
            } else {
                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_FILE_BIGSTRING_LOADER_ERROR));
                Log.e("DXBigStringLoader", "read bigstring over");
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
        b<String> bVar = this.c;
        if (bVar != null && bVar.get(j) != null) {
            return this.c.get(j);
        }
        if (!DinamicXEngine.j()) {
            return null;
        }
        Log.e("DXBigStringLoader", "getString null:" + j);
        return null;
    }
}
