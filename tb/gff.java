package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ax;
import com.taobao.android.dinamicx.bc;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class gff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FROM_MAIN = 1;
    public static final int TYPE_FROM_SIMPLE = 2;

    /* renamed from: a  reason: collision with root package name */
    public ax f28306a;
    public ghc b;
    public bc c;

    static {
        kge.a(-2015508221);
    }

    public gff(ghc ghcVar, ax axVar) {
        this.f28306a = axVar;
        this.b = ghcVar;
        if (this.f28306a == null) {
            this.f28306a = new ax();
        }
        this.c = new bc();
        if (this.b != null || u.g() == null || u.g().c() == null) {
            return;
        }
        this.b = u.g().c().a();
    }

    public gff(ghc ghcVar, bc bcVar) {
        this.b = ghcVar;
        this.c = bcVar;
        if (this.c == null) {
            this.c = new bc();
        }
        this.f28306a = new ax();
        if (this.b != null || u.g() == null || u.g().c() == null) {
            return;
        }
        this.b = u.g().c().a();
    }

    public DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a7cf1c07", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        if (dXWidgetNode.isV4Node()) {
            return this.b.b(dXWidgetNode, 1, dXRenderOptions);
        }
        return this.f28306a.a(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
    }

    public DXWidgetNode b(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("69cd8408", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        if (dXWidgetNode.isV4Node()) {
            return this.b.b(dXWidgetNode, 2, dXRenderOptions);
        }
        return this.c.a(dXWidgetNode, dXRenderOptions);
    }
}
