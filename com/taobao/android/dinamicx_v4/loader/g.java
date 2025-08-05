package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import tb.fwr;
import tb.kge;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAJOR_VERSION = 4;

    /* renamed from: a  reason: collision with root package name */
    private int f12228a;
    private int b;
    private int c;
    private String d;
    private long e;

    static {
        kge.a(1003369314);
        kge.a(-202982083);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f12228a = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i - this.f12228a;
        }
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12228a);
        if (!"ALIDX".equals(new String(fwrVar.a(), 0, 5))) {
            throw new DXLoaderException("文件不合法");
        }
        fwrVar.b(5);
        if (fwrVar.d() != 4) {
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_BINARY_MAJOR_VERSION_ERROR));
            return false;
        }
        this.c = fwrVar.e();
        short e = fwrVar.e();
        this.d = new String(fwrVar.a(), fwrVar.b(), (int) e);
        fwrVar.b(e);
        this.e = fwrVar.g();
        return true;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }
}
