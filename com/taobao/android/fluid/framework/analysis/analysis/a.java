package com.taobao.android.fluid.framework.analysis.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.f;
import com.taobao.analysis.v3.p;
import com.taobao.analysis.v3.r;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f12464a;
    private f e;
    private f f;
    private final Map<String, p> d = new HashMap();
    private final r b = FalcoGlobalTracer.get();
    private final boolean c = true;

    static {
        kge.a(-878932995);
        kge.a(-83855588);
    }

    public a(FluidContext fluidContext, f fVar) {
        this.f12464a = fluidContext;
        this.e = fVar;
        a();
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public void a(String str) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!b() || !this.c || (fVar = this.f) == null) {
        } else {
            fVar.b(str);
            spz.c("FluidAnalysis", e() + " Span 结束, 状态：" + str);
        }
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == null) {
            spz.c("FluidAnalysis", e() + " FalcoTracer 为空");
        } else if (b()) {
            r.a a2 = this.b.a(b.MODULE_SHORT_VIDEO_PAGE, b.SCENE_PREFIX + c());
            f fVar = this.e;
            if (fVar != null) {
                a2.a(fVar);
            }
            this.f = a2.a();
            for (String str : d()) {
                this.d.put(str, this.f.c(str));
            }
            spz.c("FluidAnalysis", e() + " Span 开始");
        }
    }

    public void a(String str, com.taobao.android.fluid.core.b bVar) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6903565", new Object[]{this, str, bVar});
        } else if (!b() || !this.c || (pVar = this.d.get(str)) == null) {
        } else {
            this.f.b("failed");
            pVar.a(null, bVar.b());
            c();
            FluidException.throwException(this.f12464a, bVar);
            spz.c("FluidAnalysis", e() + " Stage：" + str + " 失败");
        }
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public void b(String str) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!b() || !this.c || (pVar = this.d.get(str)) == null) {
        } else {
            pVar.b(null);
            c();
            spz.c("FluidAnalysis", e() + " Stage：" + str + " 成功");
        }
    }

    @Override // com.taobao.android.fluid.framework.analysis.analysis.b
    public void c(String str) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!b() || !this.c || (pVar = this.d.get(str)) == null) {
        } else {
            pVar.a(null);
            spz.c("FluidAnalysis", e() + " Stage：" + str + " 开始");
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        return "全链路监控，场景：ShortVideoPage_" + c();
    }
}
