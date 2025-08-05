package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.android.dinamicx_v4.responsive.impl.a;
import com.taobao.android.dxv4common.exception.DXParserException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ggk;
import tb.ggz;

/* loaded from: classes.dex */
public class gfa implements ghc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1356855063);
        kge.a(1643714468);
    }

    public void a(DXWidgetNode dXWidgetNode, int i, DXRenderOptions dXRenderOptions) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdbb044", new Object[]{this, dXWidgetNode, new Integer(i), dXRenderOptions});
        } else if (dXWidgetNode != null && !j(dXWidgetNode)) {
            boolean i2 = i(dXWidgetNode);
            dXWidgetNode.beginParser(i2);
            if (dXWidgetNode.getDXRuntimeContext() != null && dXWidgetNode.needParseAP()) {
                dXWidgetNode.parseAp();
            }
            if (i2) {
                f(dXWidgetNode);
            }
            a(dXWidgetNode, i2);
            if (!g(dXWidgetNode)) {
                h(dXWidgetNode);
                b(dXWidgetNode, i2);
            }
            int direction = dXWidgetNode.getDirection();
            for (int i3 = 0; i3 < dXWidgetNode.getChildrenCount(); i3++) {
                DXWidgetNode childAt = dXWidgetNode.getChildAt(i3);
                childAt.getDXRuntimeContext().c(direction);
                if (childAt.isV4Node() && (!((z = dXWidgetNode instanceof ac)) || (z && ((ac) dXWidgetNode).e() == 1))) {
                    childAt.getDxv4Properties().c(dXWidgetNode.getDxv4Properties().k());
                    childAt.getDxv4Properties().a(dXWidgetNode.getDxv4Properties().b());
                    childAt.getDxv4Properties().a(dXWidgetNode.getDxv4Properties().j());
                }
                if (childAt.isRootNode()) {
                    if (childAt.getDXRuntimeContext() != null && childAt.getDXRuntimeContext().r() != null) {
                        if (i == 2) {
                            childAt.getDXRuntimeContext().r().b(childAt, childAt.getDXRuntimeContext(), dXRenderOptions);
                        } else {
                            childAt.getDXRuntimeContext().r().a(childAt, childAt.getDXRuntimeContext(), dXRenderOptions);
                        }
                    }
                } else {
                    a(childAt, i, dXRenderOptions);
                }
            }
            dXWidgetNode.endParser(i2);
        }
    }

    @Override // tb.ghc
    public DXWidgetNode b(DXWidgetNode dXWidgetNode, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("9b113bc2", new Object[]{this, dXWidgetNode, new Integer(i), dXRenderOptions});
        }
        c(dXWidgetNode);
        a(dXWidgetNode, i, dXRenderOptions);
        return dXWidgetNode;
    }

    public void c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9572f105", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode.getStatInPrivateFlags(131072)) {
        } else {
            k(dXWidgetNode);
            d(dXWidgetNode);
            e(dXWidgetNode);
            dXWidgetNode.setStatFlag(131072);
        }
    }

    public void d(DXWidgetNode dXWidgetNode) {
        ggk.b f;
        byte a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af8e6fa4", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null && dXWidgetNode.getDxv4Properties() != null && dXWidgetNode.getVariableNameMap() != null) {
            HashMap hashMap = null;
            for (Map.Entry<String, ggk> entry : dXWidgetNode.getVariableNameMap().entrySet()) {
                ggk value = entry.getValue();
                if (value != null && value.f() != null && (a2 = (f = value.f()).a()) != 1) {
                    if (a2 == 2) {
                        a aVar = new a(value);
                        aVar.b(dXWidgetNode);
                        aVar.a(dXWidgetNode);
                        if (aVar.b()) {
                            short c = f.c();
                            if (c == 1) {
                                aVar.b(dXWidgetNode.getDXRuntimeContext().e());
                            } else if (c == 3) {
                                aVar.b(value);
                            }
                            aVar.a(dXWidgetNode.getDxv4Properties().l());
                        }
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(entry.getKey(), aVar);
                    } else if (DinamicXEngine.j()) {
                        throw new DXParserException("不认识的响应式类型" + ((int) f.a()));
                    }
                }
            }
            dXWidgetNode.getDxv4Properties().c(hashMap);
        }
    }

    public void e(DXWidgetNode dXWidgetNode) {
        List<gfh> f;
        List<ggk.a> g;
        gfh gfhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a9ee43", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            gfl dxv4Properties = dXWidgetNode.getDxv4Properties();
            Map<String, ggk> variableNameMap = dXWidgetNode.getVariableNameMap();
            if (dxv4Properties == null || variableNameMap == null || (f = dxv4Properties.f()) == null) {
                return;
            }
            for (Map.Entry<String, ggk> entry : variableNameMap.entrySet()) {
                String key = entry.getKey();
                ggk value = entry.getValue();
                if (key != null && value != null && (g = value.g()) != null && !g.isEmpty()) {
                    for (ggk.a aVar : g) {
                        int a2 = aVar.a();
                        if (a2 >= 0 && a2 < f.size() && (gfhVar = f.get(a2)) != null) {
                            gfhVar.a(a(dXWidgetNode, gfhVar));
                        }
                    }
                }
            }
        }
    }

    public gbn a(DXWidgetNode dXWidgetNode, gfh gfhVar) {
        gbn gbnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbn) ipChange.ipc$dispatch("cce3e305", new Object[]{this, dXWidgetNode, gfhVar});
        }
        if (gfhVar.f() != null) {
            gbnVar = gfhVar.f();
        } else {
            gbnVar = new gbn(gfhVar.b(), gfhVar.d(), gfhVar.e());
        }
        if (gbnVar != null) {
            gfq gfqVar = dXWidgetNode.getDxv4Properties().k().get(gfhVar.c());
            if (gfqVar != null) {
                gbnVar.a(dXWidgetNode, gfqVar);
            } else if (DinamicXEngine.j()) {
                throw new DXParserException("动画不存在绑定的响应式变量");
            }
        }
        return gbnVar;
    }

    public void f(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c56ce2", new Object[]{this, dXWidgetNode});
            return;
        }
        b<gfm> c = dXWidgetNode.getDxv4Properties().c();
        if (c == null) {
            return;
        }
        int size = c.size();
        for (int i = 0; i < size; i++) {
            long keyAt = c.keyAt(i);
            gfm valueAt = c.valueAt(i);
            gfx a2 = a(dXWidgetNode, valueAt);
            short a3 = valueAt.a();
            if (a3 == 1) {
                if (a2 != null) {
                    try {
                        if (!a2.h() && a2.v()) {
                            dXWidgetNode.setIntAttribute(keyAt, a2.w());
                        }
                    } catch (Throwable th) {
                        dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                        com.taobao.android.dinamicx.exception.a.c(th);
                    }
                }
                dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
            } else if (a3 == 2) {
                if (a2 != null) {
                    try {
                        if (!a2.h() && a2.v()) {
                            dXWidgetNode.setLongAttribute(keyAt, a2.x());
                        }
                    } catch (Throwable th2) {
                        dXWidgetNode.setLongAttribute(keyAt, dXWidgetNode.getDefaultValueForLongAttr(keyAt));
                        com.taobao.android.dinamicx.exception.a.c(th2);
                    }
                }
                dXWidgetNode.setLongAttribute(keyAt, dXWidgetNode.getDefaultValueForLongAttr(keyAt));
            } else if (a3 == 4) {
                if (a2 != null) {
                    try {
                        if (!a2.h() && a2.z()) {
                            dXWidgetNode.setDoubleAttribute(keyAt, a2.A());
                        }
                    } catch (Throwable th3) {
                        dXWidgetNode.setDoubleAttribute(keyAt, dXWidgetNode.getDefaultValueForDoubleAttr(keyAt));
                        com.taobao.android.dinamicx.exception.a.c(th3);
                    }
                }
                dXWidgetNode.setDoubleAttribute(keyAt, dXWidgetNode.getDefaultValueForDoubleAttr(keyAt));
            } else if (a3 == 8) {
                if (a2 != null) {
                    try {
                        if (!a2.h() && a2.k()) {
                            if (a2.i() != null) {
                                dXWidgetNode.setStringAttribute(keyAt, a2.i());
                            } else {
                                dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                            }
                        }
                    } catch (Exception e) {
                        dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                        com.taobao.android.dinamicx.exception.a.c(e);
                    }
                }
                dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
            } else if (a3 == 16) {
                if (a2 != null) {
                    try {
                        if (!a2.h() && a2.k()) {
                            if (a2.i() == null) {
                                dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                            } else {
                                String i2 = a2.i();
                                if (!TextUtils.isEmpty(i2)) {
                                    dXWidgetNode.setIntAttribute(keyAt, Color.parseColor(i2));
                                } else {
                                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        com.taobao.android.dinamicx.exception.a.c(th4);
                    }
                }
                dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
            } else if (a3 != 32) {
                if (a3 == 128) {
                    if (a2 != null) {
                        try {
                            if (!a2.h() && a2.n()) {
                                JSONArray o = a2.o();
                                if (o != null) {
                                    dXWidgetNode.setListAttribute(keyAt, o);
                                }
                            }
                        } catch (Exception e2) {
                            dXWidgetNode.setListAttribute(keyAt, dXWidgetNode.getDefaultValueForListAttr(keyAt));
                            com.taobao.android.dinamicx.exception.a.c(e2);
                        }
                    }
                    dXWidgetNode.setListAttribute(keyAt, dXWidgetNode.getDefaultValueForListAttr(keyAt));
                } else if (a3 == 256) {
                    if (a2 != null) {
                        try {
                            if (!a2.h() && a2.p()) {
                                JSONObject r = a2.r();
                                if (r instanceof JSONObject) {
                                    dXWidgetNode.setMapAttribute(keyAt, r);
                                }
                            }
                        } catch (Exception e3) {
                            dXWidgetNode.setMapAttribute(keyAt, dXWidgetNode.getDefaultValueForMapAttr(keyAt));
                            com.taobao.android.dinamicx.exception.a.c(e3);
                        }
                    }
                    dXWidgetNode.setMapAttribute(keyAt, dXWidgetNode.getDefaultValueForMapAttr(keyAt));
                } else if (a3 == 1024) {
                    if (a2 != null) {
                        try {
                            if (!a2.h() && a2.l()) {
                                dXWidgetNode.setObjAttribute(keyAt, a2.j());
                            }
                        } catch (Exception e4) {
                            dXWidgetNode.setObjAttribute(keyAt, dXWidgetNode.getDefaultValueForObjectAttr(keyAt));
                            com.taobao.android.dinamicx.exception.a.c(e4);
                        }
                    }
                    dXWidgetNode.setObjAttribute(keyAt, dXWidgetNode.getDefaultValueForObjectAttr(keyAt));
                } else if (DinamicXEngine.j()) {
                    throw new DXParserException("不支持的数据类型: " + ((int) valueAt.a()));
                }
            } else if (a2 != null) {
                try {
                    if (!a2.h()) {
                        float B = (float) a2.B();
                        if (20052926345925L != keyAt && 9346582897824575L != keyAt) {
                            dXWidgetNode.setIntAttribute(keyAt, gbg.a(dXWidgetNode.getEngine(), dXWidgetNode.getDXRuntimeContext().m(), B));
                        }
                        if (B < 0.0f) {
                            dXWidgetNode.setIntAttribute(keyAt, (int) B);
                        } else {
                            dXWidgetNode.setIntAttribute(keyAt, gbg.a(dXWidgetNode.getEngine(), dXWidgetNode.getDXRuntimeContext().m(), B));
                        }
                    }
                } catch (Exception e5) {
                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                    com.taobao.android.dinamicx.exception.a.c(e5);
                }
            }
            a(null, valueAt, dXWidgetNode, keyAt);
        }
    }

    public void a(DXWidgetNode dXWidgetNode, gfm gfmVar, DXWidgetNode dXWidgetNode2, long j) {
        Map<String, gfq> k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acefe3e", new Object[]{this, dXWidgetNode, gfmVar, dXWidgetNode2, new Long(j)});
        } else if (gfmVar.c() != null && gfmVar.c().size() != 0 && (k = dXWidgetNode2.getDxv4Properties().k()) != null) {
            for (String str : gfmVar.c()) {
                gfq gfqVar = k.get(str);
                if (gfqVar == null) {
                    if (DinamicXEngine.j()) {
                        throw new DXParserException(str + " stateProtocol == null ");
                    }
                } else {
                    gfqVar.a(dXWidgetNode2, j);
                }
            }
        }
    }

    public void a(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64337ed", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        if (z) {
            dXWidgetNode.setStatFlag(4);
        }
        dXWidgetNode.unsetStatFlag(1);
        dXWidgetNode.setStatFlag(2);
    }

    public boolean g(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fde0eb85", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (!(dXWidgetNode instanceof ivl) || dXWidgetNode.getChildrenCount() != 2) {
            return false;
        }
        ivl ivlVar = (ivl) dXWidgetNode;
        if (ivlVar.a()) {
            ivlVar.b(ivlVar.removeChildAt(1));
        } else {
            ivlVar.a(ivlVar.removeChildAt(0));
        }
        return true;
    }

    public void h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fc6a20", new Object[]{this, dXWidgetNode});
        } else if (!(dXWidgetNode instanceof ac)) {
        } else {
            if (fqi.aF()) {
                ((ac) dXWidgetNode).a(1);
            } else {
                ((ac) dXWidgetNode).a(0);
            }
        }
    }

    public void b(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef978d2e", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode.getDXRuntimeContext() == null || !dXWidgetNode.getDXRuntimeContext().G()) {
            dXWidgetNode.setStatFlag(4096);
            dXWidgetNode.beforeBindChildData();
        } else if (!z) {
        } else {
            if (dXWidgetNode.getStatInPrivateFlags(524288)) {
                if ((dXWidgetNode instanceof m) && ((m) dXWidgetNode).isDataSizeChange()) {
                    dXWidgetNode.beforeBindChildData();
                }
                dXWidgetNode.setStatFlag(4096);
                dXWidgetNode.unsetStatFlag(524288);
            } else if (dXWidgetNode.getStatInPrivateFlags(4096)) {
            } else {
                dXWidgetNode.setStatFlag(4096);
                dXWidgetNode.beforeBindChildData();
            }
        }
    }

    public boolean i(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3217e8c3", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (dXRuntimeContext != null && dXRuntimeContext.G()) {
            if (dXWidgetNode.getDxv4Properties() == null || dXWidgetNode.getDxv4Properties().c() == null || !dXWidgetNode.getStatInPrivateFlags(1) || dXWidgetNode.getStatInPrivateFlags(2)) {
                return false;
            }
        } else if (dXWidgetNode.getDxv4Properties() == null || dXWidgetNode.getDxv4Properties().c() == null) {
            return false;
        }
        return true;
    }

    public boolean j(DXWidgetNode dXWidgetNode) {
        gfm gfmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c336762", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDxv4Properties() == null || dXWidgetNode.getDxv4Properties().c() == null || (gfmVar = dXWidgetNode.getDxv4Properties().c().get(5802348655878590802L)) == null) {
            return dXWidgetNode.getVisibility() == 2;
        }
        ggz x = dXWidgetNode.getDXRuntimeContext().C().b().x();
        if (x != null) {
            ggz.a a2 = x.a(dXWidgetNode.getDXRuntimeContext(), gfmVar.b(), u.g().d(), null);
            if (a2.f28327a && a2.c != null) {
                dXWidgetNode.setIntAttribute(5802348655878590802L, a2.c.w());
            }
        }
        gfx a3 = a(dXWidgetNode, gfmVar);
        if (a3 != null && a3.v()) {
            dXWidgetNode.setIntAttribute(5802348655878590802L, a3.w());
        }
        return dXWidgetNode.getVisibility() == 2;
    }

    public gfx a(DXWidgetNode dXWidgetNode, gfm gfmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("b55b7104", new Object[]{this, dXWidgetNode, gfmVar});
        }
        ggz.a a2 = a(dXWidgetNode, gfmVar.b());
        if (a2 != null && a2.f28327a) {
            return a2.c;
        }
        return null;
    }

    public ggz.a a(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggz.a) ipChange.ipc$dispatch("d5defc33", new Object[]{this, dXWidgetNode, new Integer(i)}) : ggv.a(dXWidgetNode, i);
    }

    public void k(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664ee5fd", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if ((parentWidget instanceof ac) && ((ac) parentWidget).e() == 1) {
                dXWidgetNode.getDxv4Properties().b(parentWidget.queryRootWidgetNode().getVariableNameMap());
                return;
            }
            Map<String, ggk> variableNameMap = dXWidgetNode.getVariableNameMap();
            if (variableNameMap == null) {
                return;
            }
            for (Map.Entry<String, ggk> entry : variableNameMap.entrySet()) {
                if (entry != null) {
                    ggk value = entry.getValue();
                    boolean a2 = a(dXWidgetNode, value);
                    byte c = value.c();
                    if (!a2 && c == 2) {
                        ggz.a a3 = a(dXWidgetNode, ((gfw) value).b());
                        if (a3 != null && a3.f28327a) {
                            ggu a4 = a(value, a3.c);
                            if (a4 != null) {
                                value.a(a4);
                            } else {
                                value.a(new ggt(null, value.d()));
                            }
                        } else {
                            value.a(new ggt(null, value.d()));
                        }
                    }
                }
            }
            a(dXWidgetNode, dXWidgetNode.getDxv4Properties().i());
        }
    }

    public void a(DXWidgetNode dXWidgetNode, List<gfi> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f012b8", new Object[]{this, dXWidgetNode, list});
        } else if (list != null) {
            for (gfi gfiVar : list) {
                if (gfiVar != null) {
                    if (gfiVar.a() == 1) {
                        a(dXWidgetNode, ((gfj) gfiVar).b());
                    } else {
                        throw new DXParserException("processVariableInitCommand 不认识的command类型： " + ((int) gfiVar.a()));
                    }
                }
            }
        }
    }

    public ggu a(ggk ggkVar, gfx gfxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("43ce664d", new Object[]{this, ggkVar, gfxVar});
        }
        if (gfxVar == null) {
            return null;
        }
        switch (ggkVar.d()) {
            case 0:
                return new ggt(gfxVar.J(), (short) 0);
            case 1:
                return new ggr((int) gfxVar.y());
            case 2:
                return new ggs(gfxVar.y());
            case 3:
                return new ggp(gfxVar.B());
            case 4:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 4);
                }
                return new ggt(gfxVar.m(), (short) 4);
            case 5:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 4);
                }
                return new ggt(gfxVar.m(), (short) 4);
            case 6:
            case 7:
            case 14:
            default:
                throw new DXParserException("不认识的 类型" + ((int) ggkVar.d()));
            case 8:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 8);
                }
                return new ggt(gfxVar.H(), (short) 8);
            case 9:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 9);
                }
                return new ggt(gfxVar.G(), (short) 9);
            case 10:
                return new ggt(gfxVar.J(), (short) 10);
            case 11:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 11);
                }
                return new ggr((int) gfxVar.y());
            case 12:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 12);
                }
                return new ggs(gfxVar.y());
            case 13:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 13);
                }
                return new ggp(gfxVar.B());
            case 15:
                return new ggo(gfxVar.F());
            case 16:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 16);
                }
                return new ggo(gfxVar.F());
            case 17:
                return new ggq(gfxVar.C());
            case 18:
                if (gfxVar.f()) {
                    return new ggt(null, (short) 18);
                }
                return new ggq(gfxVar.C());
        }
    }

    public boolean a(DXWidgetNode dXWidgetNode, ggk ggkVar) {
        gfx gfxVar;
        ggu a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22f2e7d0", new Object[]{this, dXWidgetNode, ggkVar})).booleanValue();
        }
        List<ggl> e = ggkVar.e();
        if (e != null && e != null) {
            Iterator<ggl> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ggl next = it.next();
                if (next != null) {
                    short a3 = next.a();
                    if (a3 == 1) {
                        ggz.a a4 = a(dXWidgetNode, next.c());
                        if (a4 != null && a4.f28327a && (gfxVar = a4.c) != null && gfxVar.d() > 1 && (a2 = a(ggkVar, gfxVar)) != null && (!(a2 instanceof ggt) || a2.f() != null)) {
                            ggkVar.a(a2);
                            return true;
                        }
                    } else if (a3 == 3) {
                        return a(dXWidgetNode, next.b()) != null;
                    }
                }
            }
        }
        return false;
    }

    public ggk a(DXWidgetNode dXWidgetNode, String str) {
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("1fbe16a", new Object[]{this, dXWidgetNode, str});
        }
        if (dXWidgetNode != null && (b = dXWidgetNode.getDXRuntimeContext().C().b()) != null) {
            return b.A().a(str);
        }
        return null;
    }

    @Override // tb.ghc
    public ghc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghc) ipChange.ipc$dispatch("f0509bc", new Object[]{this}) : new gfa();
    }
}
