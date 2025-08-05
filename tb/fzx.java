package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bc;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import tb.ggz;

/* loaded from: classes5.dex */
public class fzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bc f28243a;
    private static gfa b;

    static {
        kge.a(956433001);
    }

    public static ac a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ac) ipChange.ipc$dispatch("8a80441e", new Object[]{dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        while (dXWidgetNode.getParentWidget() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if ((dXWidgetNode instanceof ac) && (parentWidget instanceof DXRecyclerLayout)) {
                return (ac) dXWidgetNode;
            }
            dXWidgetNode = parentWidget;
        }
        return null;
    }

    public static boolean a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("548c4efc", new Object[]{dXWidgetNode, dXRuntimeContext})).booleanValue();
        }
        gfx gfxVar = null;
        Object obj = null;
        gfxVar = null;
        if (dXWidgetNode.isV4Node()) {
            if (dXWidgetNode.getDxv4Properties().c() == null) {
                return ((ac) dXWidgetNode).a() != 0;
            } else if (dXWidgetNode.getDxv4Properties().c().get(754805L) == null) {
                return true;
            } else {
                try {
                    ggz.a a2 = ggv.a(dXRuntimeContext, dXWidgetNode.getDxv4Properties().c().get(754805L).b());
                    if (a2.f28327a) {
                        gfxVar = a2.c;
                    }
                } catch (Exception unused) {
                }
                if (gfxVar == null) {
                    return false;
                }
                return gfxVar.F();
            }
        } else if (dXWidgetNode.getDataParsersExprNode() == null) {
            return ((ac) dXWidgetNode).a() != 0;
        } else if (dXWidgetNode.getDataParsersExprNode().get(ac.DXTEMPLATE_IF) == null) {
            return true;
        } else {
            try {
                obj = dXWidgetNode.getDataParsersExprNode().get(ac.DXTEMPLATE_IF).a(null, dXRuntimeContext);
            } catch (Exception unused2) {
            }
            if (obj instanceof String) {
                return "true".equalsIgnoreCase((String) obj);
            }
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    public static void a(ac acVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d806e4", new Object[]{acVar, new Integer(i)});
        } else if (fqi.o()) {
            if (acVar.isV4Node()) {
                if (acVar.getDxv4Properties().c() != null && (acVar.getParentWidget() instanceof DXRecyclerLayout) && acVar.getDxv4Properties().c().get(10297924263834610L) != null) {
                    try {
                        ggz.a a2 = ggv.a(acVar, acVar.getDxv4Properties().c().get(10297924263834610L).b());
                        if (a2.f28327a) {
                            acVar.setStringAttribute(10297924263834610L, a2.c.m());
                            if (!TextUtils.isEmpty(acVar.getUserId())) {
                                ((DXRecyclerLayout) acVar.getParentWidget()).f().put(acVar.getUserId(), Integer.valueOf(i));
                            }
                        }
                    } catch (Exception e) {
                        a.b(e);
                    }
                }
                acVar.b(i);
                c(acVar);
                return;
            }
            if (acVar.getDataParsersExprNode() != null && (acVar.getParentWidget() instanceof DXRecyclerLayout) && acVar.getDataParsersExprNode().get(10297924263834610L) != null) {
                try {
                    Object a3 = acVar.getDataParsersExprNode().get(10297924263834610L).a(null, acVar.getDXRuntimeContext());
                    if (a3 instanceof String) {
                        acVar.setStringAttribute(10297924263834610L, String.valueOf(a3));
                    }
                    if (!TextUtils.isEmpty(acVar.getUserId())) {
                        ((DXRecyclerLayout) acVar.getParentWidget()).f().put(acVar.getUserId(), Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
            }
            acVar.b(i);
            b(acVar);
        } else {
            a(acVar);
        }
    }

    public static void a(ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae5ebff", new Object[]{acVar});
        } else if (!TextUtils.isEmpty(acVar.q())) {
            acVar.b();
        } else if (acVar.getDataParsersExprNode() == null) {
        } else {
            if (acVar.getDataParsersExprNode().get(ac.DXTEMPLATE_NAME) != null) {
                try {
                    Object a2 = acVar.getDataParsersExprNode().get(ac.DXTEMPLATE_NAME).a(null, acVar.getDXRuntimeContext());
                    if (a2 instanceof String) {
                        acVar.setStringAttribute(ac.DXTEMPLATE_NAME, String.valueOf(a2));
                    }
                } catch (Exception unused) {
                }
            }
            if (acVar.getDataParsersExprNode().get(5435381891761953165L) == null) {
                return;
            }
            try {
                Object a3 = acVar.getDataParsersExprNode().get(5435381891761953165L).a(null, acVar.getDXRuntimeContext());
                if (a3 == null) {
                    return;
                }
                acVar.setStringAttribute(5435381891761953165L, String.valueOf(a3));
            } catch (Exception unused2) {
            }
        }
    }

    private static void b(ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd2555e", new Object[]{acVar});
            return;
        }
        if (f28243a == null) {
            f28243a = new bc();
        }
        f28243a.a((DXWidgetNode) acVar, true);
        if (TextUtils.isEmpty(acVar.q())) {
            return;
        }
        acVar.b();
    }

    private static void c(ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bebebd", new Object[]{acVar});
            return;
        }
        if (b == null) {
            b = new gfa();
        }
        b.f(acVar);
        b.a((DXWidgetNode) acVar, true);
        if (!TextUtils.isEmpty(acVar.q())) {
            throw new RuntimeException("slot 相关的还未处理");
        }
    }
}
