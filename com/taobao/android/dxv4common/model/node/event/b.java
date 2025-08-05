package com.taobao.android.dxv4common.model.node.event;

import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import java.util.List;
import tb.fuw;
import tb.gfg;
import tb.gfx;
import tb.ghb;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f12243a;
    public String b;
    public String c;

    static {
        kge.a(-852267659);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(String str, String str2, String str3) {
        this.b = str;
        this.f12243a = str2;
        this.c = str3;
        this.eventType = (byte) 1;
    }

    @Override // tb.gfn
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        DXRuntimeContext a2 = a(dXRuntimeContext.d());
        if (a2 == null || dXRuntimeContext.C() == null || dXRuntimeContext.C().b() == null || dXRuntimeContext.C().b().f() == null || a2.d() == null) {
            fuw.d("DinamicX", "call logic 失败 rootRuntimeContext == null");
            return false;
        } else if (dXRuntimeContext.c() == null) {
            fuw.d("DinamicX", "call logic 失败 runtimeContext.getDxTemplateItem() == null");
            return false;
        } else {
            ghb f = dXRuntimeContext.C().b().f();
            int hashCode = a2.c().b().hashCode();
            if (!f.a(hashCode)) {
                List<Pair<String, byte[]>> b = a2.d().getDxv4Properties().b();
                if (b == null || b.isEmpty()) {
                    fuw.d("主线程加载 " + dXRuntimeContext.c().b() + " 的 logic 文件");
                    gfg.b(a2.d());
                    b = a2.d().getDxv4Properties().b();
                }
                f.a(hashCode, dXRuntimeContext, b);
            }
            f.a(hashCode, dXRuntimeContext, this.b, this.f12243a, 1, new gfx[]{gfx.a(dXEvent)});
            return true;
        }
    }

    private DXRuntimeContext a(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("49858920", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        if ((queryRootWidgetNode.getParentWidget() instanceof ac) && ((ac) queryRootWidgetNode.getParentWidget()).e() == 1) {
            return a(queryRootWidgetNode.getParentWidget());
        }
        return queryRootWidgetNode.getDXRuntimeContext();
    }
}
