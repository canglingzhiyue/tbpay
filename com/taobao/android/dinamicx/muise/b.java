package com.taobao.android.dinamicx.muise;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.am;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.ag;
import com.taobao.android.dinamicx.widget.m;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(JSONObject jSONObject, DXWidgetNode dXWidgetNode, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bfbf0d", new Object[]{jSONObject, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null) {
        } else {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (queryRootWidgetNode != null && (dXRuntimeContext = queryRootWidgetNode.getDXRuntimeContext()) != null) {
                JSONObject e = dXRuntimeContext.e();
                if (e != null) {
                    e.clear();
                    if (jSONObject != null) {
                        e.putAll(jSONObject);
                    }
                } else {
                    dXRuntimeContext.a(jSONObject);
                }
            }
            if (!z) {
                dXWidgetNode = queryRootWidgetNode;
            }
            a(dXWidgetNode, queryRootWidgetNode, z);
        }
    }

    public static void b(JSONObject jSONObject, DXWidgetNode dXWidgetNode, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1ad5ec", new Object[]{jSONObject, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && jSONObject != null) {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (queryRootWidgetNode != null && (dXRuntimeContext = queryRootWidgetNode.getDXRuntimeContext()) != null) {
                JSONObject e = dXRuntimeContext.e();
                if (e != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        if (entry != null) {
                            e.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    dXRuntimeContext.a(jSONObject);
                }
            }
            if (!z) {
                dXWidgetNode = queryRootWidgetNode;
            }
            a(dXWidgetNode, queryRootWidgetNode, z);
        }
    }

    private static void a(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, boolean z) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda3098c", new Object[]{dXWidgetNode, dXWidgetNode2, new Boolean(z)});
        } else if (dXWidgetNode != null && dXWidgetNode2 != null && (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) != null) {
            if (dXWidgetNode2.getParentWidget() instanceof ac) {
                ac acVar = (ac) dXWidgetNode2.getParentWidget();
                acVar.updateRefreshType(1);
                b(acVar, z);
                for (DXWidgetNode dXWidgetNode3 = acVar; dXWidgetNode3.getParentWidget() != null; dXWidgetNode3 = dXWidgetNode3.getParentWidget()) {
                    if (dXWidgetNode3.getParentWidget() instanceof DXRecyclerLayout) {
                        ((DXRecyclerLayout) dXWidgetNode3.getParentWidget()).a(acVar);
                        return;
                    }
                }
                return;
            }
            DXWidgetNode a2 = a(dXWidgetNode, z);
            b(dXWidgetNode, z);
            a(a2, dXRuntimeContext.s(), dXRuntimeContext);
        }
    }

    public static DXWidgetNode a(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("3468870c", new Object[]{dXWidgetNode, new Boolean(z)});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
        if (parentWidget == null) {
            if (z) {
                dXWidgetNode.updateRefreshType(1);
            }
            return dXWidgetNode;
        }
        parentWidget.setStatFlag(16384);
        parentWidget.unsetStatFlag(8);
        parentWidget.unsetStatFlag(32);
        return a(parentWidget, z);
    }

    public static void b(DXWidgetNode dXWidgetNode, boolean z) {
        m mVar;
        List<DXWidgetNode> originItems;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef978d2e", new Object[]{dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null) {
            dXWidgetNode.setVisibility(0);
            dXWidgetNode.unsetStatFlag(2);
            dXWidgetNode.setStatFlag(1);
            dXWidgetNode.setStatFlag(4);
            dXWidgetNode.setStatFlag(256);
            dXWidgetNode.unsetStatFlag(2048);
            dXWidgetNode.unsetStatFlag(4096);
            if (!z) {
                dXWidgetNode.setStatFlag(16384);
                dXWidgetNode.unsetStatFlag(4);
                dXWidgetNode.unsetStatFlag(32);
            }
            if ((dXWidgetNode instanceof m) && (originItems = (mVar = (m) dXWidgetNode).getOriginItems()) != null && !originItems.isEmpty() && (dXWidgetNode.getChildren() == null || dXWidgetNode.getChildren().isEmpty() || (mVar.isHandleListData() && mVar.getListData() != null && !mVar.getListData().isEmpty()))) {
                dXWidgetNode.removeAllChild();
                for (DXWidgetNode dXWidgetNode2 : originItems) {
                    dXWidgetNode.addChild(dXWidgetNode2, false);
                }
            }
            for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                b(dXWidgetNode.getChildAt(i), z);
            }
        }
    }

    private static void a(DXWidgetNode dXWidgetNode, DXRootView dXRootView, DXRuntimeContext dXRuntimeContext) {
        am r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744b7b9", new Object[]{dXWidgetNode, dXRootView, dXRuntimeContext});
        } else if (dXWidgetNode == null || dXRuntimeContext == null || dXRootView == null || (r = dXRuntimeContext.r()) == null) {
        } else {
            r.a(dXWidgetNode, dXRootView.getFlattenWidgetNode(), dXRootView, dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode), new DXRenderOptions.a().a(true).d(2).e(9).a(dXRuntimeContext.y()).b(dXRuntimeContext.z()).a());
        }
    }

    public static JSONArray a(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1e8dc945", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.d() == null || (queryRootWidgetNode = dXRuntimeContext.d().queryRootWidgetNode()) == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        a(queryRootWidgetNode, jSONArray);
        return jSONArray;
    }

    private static void a(DXWidgetNode dXWidgetNode, JSONArray jSONArray) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a0f0ef", new Object[]{dXWidgetNode, jSONArray});
        } else if (dXWidgetNode != null) {
            String ref = dXWidgetNode.getRef();
            JSONArray exportMethods = dXWidgetNode.exportMethods();
            if (!TextUtils.isEmpty(ref)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ref", (Object) ref);
                if (exportMethods == null) {
                    exportMethods = new JSONArray();
                }
                jSONObject.put("methods", (Object) exportMethods);
                jSONArray.add(jSONObject);
            }
            if (dXWidgetNode instanceof ag) {
                children = ((ag) dXWidgetNode).d();
            } else {
                children = dXWidgetNode.getChildren();
            }
            if (children == null) {
                return;
            }
            for (DXWidgetNode dXWidgetNode2 : children) {
                a(dXWidgetNode2, jSONArray);
            }
        }
    }
}
