package com.taobao.android.dinamicx;

import android.content.Context;
import android.graphics.Color;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.List;
import tb.fqi;
import tb.fqp;
import tb.fuj;
import tb.gbg;
import tb.ghc;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class bc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ghc f11823a;

    static {
        kge.a(-165185556);
    }

    public bc() {
        this.f11823a = null;
        if (u.g() == null || u.g().c() == null) {
            return;
        }
        this.f11823a = u.g().c().a();
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
            return;
        }
        dXWidgetNode.setStatFlag(1024);
        if (c(dXWidgetNode) || !e(dXWidgetNode)) {
            return;
        }
        int direction = dXWidgetNode.getDirection();
        for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
            DXWidgetNode childAt = dXWidgetNode.getChildAt(i);
            childAt.getDXRuntimeContext().c(direction);
            a(childAt);
        }
    }

    public DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("82fbb598", new Object[]{this, dXWidgetNode, dXRenderOptions});
        }
        try {
            b(dXWidgetNode, dXRenderOptions);
            return dXWidgetNode;
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
                return null;
            }
            dXWidgetNode.getDXRuntimeContext().n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_WIDGETNODE_PARSE_WT_EXCEPTION));
            return null;
        }
    }

    public void a(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64337ed", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || c(dXWidgetNode)) {
        } else {
            f(dXWidgetNode);
            if (!z) {
                return;
            }
            b(dXWidgetNode, true);
        }
    }

    private void b(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        boolean c;
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e54663a", new Object[]{this, dXWidgetNode, dXRenderOptions});
                return;
            }
            try {
                if (DXTraceUtil.c()) {
                    DXTraceUtil.a(dXWidgetNode.getClass().getSimpleName() + " simpleparser id: " + dXWidgetNode.getUserId());
                }
                dXWidgetNode.beginParser(true);
                dXWidgetNode.unsetStatFlag(1024);
                if (c(dXWidgetNode)) {
                    if (!c) {
                        return;
                    }
                    return;
                }
                if (dXWidgetNode.getDXRuntimeContext().G() && dXWidgetNode.needParseAP()) {
                    dXWidgetNode.setStatFlag(4);
                }
                boolean e = e(dXWidgetNode);
                int direction = dXWidgetNode.getDirection();
                for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                    DXWidgetNode childAt = dXWidgetNode.getChildAt(i);
                    childAt.getDXRuntimeContext().c(direction);
                    if (childAt.isV4Node() && childAt.isRootNode()) {
                        this.f11823a.b(childAt, 2, dXRenderOptions);
                    } else {
                        b(childAt, dXRenderOptions);
                    }
                }
                b(dXWidgetNode, e);
                dXWidgetNode.endParser(true);
                if (!DXTraceUtil.c()) {
                    return;
                }
                DXTraceUtil.a();
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            if (DXTraceUtil.c()) {
                DXTraceUtil.a();
            }
        }
    }

    private void b(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef978d2e", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        dXWidgetNode.unsetStatFlag(1);
        dXWidgetNode.setStatFlag(32768);
        if (!z) {
            return;
        }
        dXWidgetNode.setStatFlag(4);
    }

    private boolean e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9a9ee47", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getStatInPrivateFlags(1024)) {
            if (dXWidgetNode.getLayoutWidth() == 0 || dXWidgetNode.getLayoutHeight() == 0) {
                g(dXWidgetNode);
                dXWidgetNode.setStatFlag(2);
            }
            if (dXWidgetNode.getLayoutWidth() != -2 && dXWidgetNode.getLayoutHeight() != -2) {
                return false;
            }
        }
        if (fqi.aj()) {
            if (dXWidgetNode.getDXRuntimeContext() != null) {
                if (!dXWidgetNode.getDXRuntimeContext().G() || dXWidgetNode.getStatInPrivateFlags(4) || dXWidgetNode.getStatInPrivateFlags(1) || dXWidgetNode.getStatInPrivateFlags(16384)) {
                    z = f(dXWidgetNode);
                }
            } else {
                z = f(dXWidgetNode);
            }
        } else if (dXWidgetNode.getDXRuntimeContext() != null && fqi.u(dXWidgetNode.getDXRuntimeContext().L().d) && dXWidgetNode.getDXRuntimeContext().G() && !dXWidgetNode.getStatInPrivateFlags(4) && !dXWidgetNode.getStatInPrivateFlags(1) && !dXWidgetNode.getStatInPrivateFlags(16384)) {
            return false;
        } else {
            f(dXWidgetNode);
            z = true;
        }
        if (dXWidgetNode instanceof com.taobao.android.dinamicx.widget.ac) {
            ((com.taobao.android.dinamicx.widget.ac) dXWidgetNode).a(1);
        }
        if (dXWidgetNode.getStatInPrivateFlags(524288)) {
            if ((dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m) && ((com.taobao.android.dinamicx.widget.m) dXWidgetNode).isDataSizeChange()) {
                dXWidgetNode.beforeBindChildData();
            }
            dXWidgetNode.setStatFlag(4096);
            dXWidgetNode.unsetStatFlag(524288);
        } else if (!dXWidgetNode.getStatInPrivateFlags(4096)) {
            dXWidgetNode.setStatFlag(4096);
            if (fqi.ai()) {
                dXWidgetNode.beforeBindChildData();
            } else if (dXWidgetNode.getChildrenCount() > 0) {
                dXWidgetNode.beforeBindChildData();
            }
        }
        return z;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e9 -> B:52:0x00fe). Please submit an issue!!! */
    public static boolean c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9572f109", new Object[]{dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getVisibility() == 2 && dXWidgetNode.getDataParsersExprNode() != null && dXWidgetNode.getDataParsersExprNode().get(5802348655878590802L) == null) {
            return true;
        }
        if (dXWidgetNode.getDataParsersExprNode() == null) {
            return false;
        }
        if (!dXWidgetNode.getStatInPrivateFlags(2048)) {
            if (dXWidgetNode.getDataParsersExprNode().get(5802348655878590802L) != null) {
                fqp fqpVar = dXWidgetNode.getDataParsersExprNode().get(5802348655878590802L);
                Object obj = null;
                try {
                    dXWidgetNode.getDXRuntimeContext();
                    com.taobao.android.preview.a.a();
                    obj = fqpVar.a(null, dXWidgetNode.getDXRuntimeContext());
                    com.taobao.android.preview.a.a();
                } catch (Exception e) {
                    if (DinamicXEngine.j()) {
                        e.printStackTrace();
                    }
                    dXWidgetNode.getDXRuntimeContext().n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_EVALUEATE_EXCEPTION));
                }
                try {
                    if (obj instanceof String) {
                        String valueOf = String.valueOf(obj);
                        if (dXWidgetNode.getEnumMap() != null && dXWidgetNode.getEnumMap().get(5802348655878590802L) != null && dXWidgetNode.getEnumMap().get(5802348655878590802L).get(valueOf) != null) {
                            dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getEnumMap().get(5802348655878590802L).get(valueOf).intValue());
                        } else {
                            dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L));
                        }
                    } else {
                        dXWidgetNode.setIntAttribute(5802348655878590802L, dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L));
                    }
                } catch (Exception e2) {
                    if (DinamicXEngine.j()) {
                        e2.printStackTrace();
                    }
                    dXWidgetNode.getDXRuntimeContext().n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
                }
            }
            dXWidgetNode.setStatFlag(2048);
        }
        return dXWidgetNode.getVisibility() == 2;
    }

    private boolean f(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c56ce6", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDXRuntimeContext().G() && dXWidgetNode.needParseAP()) {
            dXWidgetNode.parseAp();
        }
        if (dXWidgetNode.getStatInPrivateFlags(2) && !dXWidgetNode.getStatInPrivateFlags(1)) {
            return false;
        }
        g(dXWidgetNode);
        dXWidgetNode.setStatFlag(2);
        return true;
    }

    private void g(DXWidgetNode dXWidgetNode) {
        int defaultValueForIntAttr;
        IpChange ipChange = $ipChange;
        short s = 2;
        short s2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde0eb81", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode.getDataParsersExprNode() == null) {
        } else {
            DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
            int i = 0;
            while (i < dXWidgetNode.getDataParsersExprNode().size()) {
                long keyAt = dXWidgetNode.getDataParsersExprNode().keyAt(i);
                if (keyAt != 5802348655878590802L) {
                    fqp valueAt = dXWidgetNode.getDataParsersExprNode().valueAt(i);
                    Object obj = null;
                    try {
                        com.taobao.android.preview.a.a();
                        obj = valueAt.a(null, dXWidgetNode.getDXRuntimeContext());
                        com.taobao.android.preview.a.a();
                    } catch (Exception e) {
                        if (DinamicXEngine.j()) {
                            e.printStackTrace();
                        }
                        dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_EVALUEATE_EXCEPTION));
                    }
                    Object obj2 = obj;
                    short a2 = valueAt.a();
                    if (a2 == 96) {
                        a(dXRuntimeContext.m(), dXWidgetNode, keyAt, obj2);
                    } else if (a2 == 608) {
                        String valueOf = String.valueOf(obj2);
                        if (dXWidgetNode.getEnumMap() != null && dXWidgetNode.getEnumMap().get(keyAt) != null && dXWidgetNode.getEnumMap().get(keyAt).get(valueOf) != null) {
                            dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getEnumMap().get(keyAt).get(valueOf).intValue());
                        } else {
                            a(dXRuntimeContext.m(), dXWidgetNode, keyAt, obj2);
                        }
                    } else {
                        boolean z = obj2 != null;
                        if (a2 != s2) {
                            if (a2 != s) {
                                if (a2 != 4) {
                                    if (a2 != 8) {
                                        if (a2 == 16) {
                                            if (z) {
                                                try {
                                                    defaultValueForIntAttr = Color.parseColor(String.valueOf(obj2));
                                                } catch (Exception unused) {
                                                    dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_COLOR_EXCEPTION));
                                                    String str = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse Color failed, use default value.";
                                                    defaultValueForIntAttr = dXWidgetNode.getDefaultValueForIntAttr(keyAt);
                                                }
                                            } else {
                                                defaultValueForIntAttr = dXWidgetNode.getDefaultValueForIntAttr(keyAt);
                                            }
                                            dXWidgetNode.setIntAttribute(keyAt, defaultValueForIntAttr);
                                        } else if (a2 == 32 || a2 == 64) {
                                            a(dXRuntimeContext.m(), dXWidgetNode, keyAt, obj2);
                                        } else if (a2 != 128) {
                                            if (a2 != 256) {
                                                if (a2 != 512) {
                                                    if (a2 == 1024) {
                                                        if (obj2 != null) {
                                                            dXWidgetNode.setObjAttribute(keyAt, obj2);
                                                        } else {
                                                            dXWidgetNode.setObjAttribute(keyAt, dXWidgetNode.getDefaultValueForObjectAttr(keyAt));
                                                        }
                                                    }
                                                } else if (obj2 instanceof String) {
                                                    String valueOf2 = String.valueOf(obj2);
                                                    if (dXWidgetNode.getEnumMap() != null && dXWidgetNode.getEnumMap().get(keyAt) != null && dXWidgetNode.getEnumMap().get(keyAt).get(valueOf2) != null) {
                                                        dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getEnumMap().get(keyAt).get(valueOf2).intValue());
                                                    } else {
                                                        dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                                                    }
                                                } else {
                                                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                                                }
                                            } else if (!z || !(obj2 instanceof JSONObject)) {
                                                e(dXWidgetNode, keyAt);
                                            } else {
                                                try {
                                                    dXWidgetNode.setMapAttribute(keyAt, (JSONObject) obj2);
                                                } catch (Exception unused2) {
                                                    dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_MAP_EXCEPTION));
                                                    String str2 = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse JsonObject&Map failed, use default value.";
                                                    e(dXWidgetNode, keyAt);
                                                }
                                            }
                                        } else if (z && fuj.a(dXRuntimeContext, obj2)) {
                                            dXWidgetNode.setUserDefinedListAttribute(keyAt, (List) obj2);
                                        } else if (!z || !(obj2 instanceof JSONArray)) {
                                            d(dXWidgetNode, keyAt);
                                        } else {
                                            try {
                                                dXWidgetNode.setListAttribute(keyAt, (JSONArray) obj2);
                                            } catch (Exception unused3) {
                                                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_LIST_EXCEPTION));
                                                String str3 = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse JsonArray&List failed, use default value.";
                                                d(dXWidgetNode, keyAt);
                                            }
                                        }
                                    } else if (z && (obj2 instanceof String)) {
                                        dXWidgetNode.setStringAttribute(keyAt, (String) obj2);
                                    } else {
                                        dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                                    }
                                } else if (!z) {
                                    c(dXWidgetNode, keyAt);
                                } else {
                                    try {
                                        dXWidgetNode.setDoubleAttribute(keyAt, Double.parseDouble(String.valueOf(obj2)));
                                    } catch (Exception unused4) {
                                        dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_DOUBLE_EXCEPTION));
                                        String str4 = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse Double failed, use default value.";
                                        c(dXWidgetNode, keyAt);
                                    }
                                }
                            } else if (!z) {
                                b(dXWidgetNode, keyAt);
                            } else {
                                try {
                                    dXWidgetNode.setLongAttribute(keyAt, Long.parseLong(String.valueOf(obj2)));
                                } catch (Exception unused5) {
                                    dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_LONG_EXCEPTION));
                                    String str5 = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse Long failed, use default value.";
                                    b(dXWidgetNode, keyAt);
                                }
                            }
                        } else if (!z) {
                            a(dXWidgetNode, keyAt);
                        } else {
                            try {
                                dXWidgetNode.setIntAttribute(keyAt, Integer.parseInt(String.valueOf(obj2)));
                            } catch (Exception e2) {
                                dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_PARSE_WT, s.DXERROR_PIPELINE_PARSE_WT_INT_EXCEPTION, "parseAttrsInWidgetNode" + com.taobao.android.dinamicx.exception.a.a(e2)));
                                String str6 = riy.ARRAY_START_STR + keyAt + "=" + obj2 + "] parse Integer failed, use default value.";
                                a(dXWidgetNode, keyAt);
                            }
                        }
                    }
                }
                i++;
                s = 2;
                s2 = 1;
            }
        }
    }

    private void a(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c642fbdd", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setIntAttribute(j, dXWidgetNode.getDefaultValueForIntAttr(j));
        }
    }

    private void b(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef97511e", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setLongAttribute(j, dXWidgetNode.getDefaultValueForLongAttr(j));
        }
    }

    private void c(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18eba65f", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setDoubleAttribute(j, dXWidgetNode.getDefaultValueForDoubleAttr(j));
        }
    }

    private void d(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ffba0", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setListAttribute(j, dXWidgetNode.getDefaultValueForListAttr(j));
        }
    }

    private void e(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9450e1", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setMapAttribute(j, dXWidgetNode.getDefaultValueForMapAttr(j));
        }
    }

    private void a(Context context, DXWidgetNode dXWidgetNode, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d0a71", new Object[]{this, context, dXWidgetNode, new Long(j), obj});
        } else {
            dXWidgetNode.setIntAttribute(j, gbg.a(dXWidgetNode.getEngine(), context, String.valueOf(obj), dXWidgetNode.getDefaultValueForIntAttr(j)));
        }
    }
}
