package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import java.util.List;
import java.util.StringTokenizer;
import tb.ggz;

/* loaded from: classes.dex */
public class fti extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TEMPLATEDATA = -1464634009013122078L;
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;

    /* renamed from: a  reason: collision with root package name */
    public ftj f28132a = new ftj();

    static {
        kge.a(-765621503);
    }

    public static /* synthetic */ Object ipc$super(fti ftiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "templateData";
    }

    @Override // tb.fum, tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!fqi.J()) {
            return this.f28132a.evalWithArgs(objArr, dXRuntimeContext);
        }
        JSONObject jSONObject = null;
        if (objArr == null || objArr.length == 0) {
            return a(dXRuntimeContext, null);
        }
        if (objArr.length > 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        if (stringTokenizer.hasMoreTokens()) {
            jSONObject = a(dXRuntimeContext, stringTokenizer.nextToken());
        }
        return a(str, jSONObject, dXRuntimeContext);
    }

    private JSONObject a(DXRuntimeContext dXRuntimeContext, String str) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b283fa83", new Object[]{this, dXRuntimeContext, str});
        }
        DXWidgetNode queryRootWidgetNode = dXRuntimeContext.d().queryRootWidgetNode();
        if (queryRootWidgetNode == null) {
            return null;
        }
        DXWidgetNode parentWidget = queryRootWidgetNode.getParentWidget();
        if (!(parentWidget instanceof ac)) {
            return null;
        }
        ac acVar = (ac) parentWidget;
        JSONObject m = acVar.m();
        List<String> n = acVar.n();
        if (m != null && !m.isEmpty() && m.containsKey(str)) {
            return m;
        }
        if (n == null || !n.contains(str)) {
            JSONObject l = acVar.l();
            if (l == null) {
                return null;
            }
            if (parentWidget.isV4Node()) {
                a2 = a(l, parentWidget, parentWidget.getDXRuntimeContext(), str);
            } else {
                a2 = a(l, parentWidget.getDXRuntimeContext(), str);
            }
            if (a2 != null) {
                if (m == null) {
                    m = new JSONObject();
                }
                m.putAll(a2);
            }
            acVar.a(m);
        }
        return m;
    }

    private JSONObject a(JSONObject jSONObject, DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6b5f62c2", new Object[]{this, jSONObject, dXWidgetNode, dXRuntimeContext, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        int intValue = jSONObject2.getInteger("t").intValue();
        if (intValue == 0) {
            Object a2 = a(dXRuntimeContext.d(), jSONObject2.getInteger("v").intValue(), str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str, a2);
            return jSONObject3;
        } else if (1 == intValue) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(str, dXWidgetNode.getDxv4Properties().e().get(jSONObject2.getInteger("v").intValue()));
            return jSONObject4;
        } else if (2 != intValue) {
            return null;
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(str, jSONObject2.get("v"));
            return jSONObject5;
        }
    }

    private JSONObject a(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c47109a3", new Object[]{this, jSONObject, dXRuntimeContext, str});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (1 == jSONObject2.getInteger("t").intValue()) {
            Object a2 = a(dXRuntimeContext.d(), jSONObject2.getLongValue("v"), str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(str, a2);
            return jSONObject3;
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(str, jSONObject2.get("v"));
        return jSONObject4;
    }

    public static Object a(DXWidgetNode dXWidgetNode, long j, String str) {
        ggz.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e7fc49ab", new Object[]{dXWidgetNode, new Long(j), str});
        }
        DXWidgetNode a3 = a(dXWidgetNode);
        if (a3 == null) {
            fuw.b("key " + str + " root 是null");
            return null;
        } else if (!a3.isV4Node()) {
            b<fqp> codeMap = a3.getCodeMap();
            if (codeMap == null) {
                fuw.b("key " + str + " mCodeMap 是null");
                return null;
            }
            fqp fqpVar = codeMap.get(j);
            if (fqpVar == null) {
                fuw.b("key " + str + " exprNode 是null");
                return null;
            }
            return fqpVar.a(null, dXWidgetNode.getDXRuntimeContext());
        } else if (a3.isV4Node() && (a2 = ggv.a(dXWidgetNode, (int) j)) != null && a2.f28327a) {
            return a2.c.J();
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (android.text.StringUtils.isEmpty(r1.q()) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.android.dinamicx.widget.DXWidgetNode a(com.taobao.android.dinamicx.widget.DXWidgetNode r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fti.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "1e0c66e6"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r3
            return r3
        L15:
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = r3.queryRootWidgetNode()
            r0 = 0
            if (r3 != 0) goto L1d
            return r0
        L1d:
            boolean r1 = r3.isV4Node()
            if (r1 != 0) goto L44
            com.taobao.android.dinamicx.model.b r1 = r3.getCodeMap()
            if (r1 == 0) goto L44
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r3.getParentWidget()
            boolean r2 = r1 instanceof com.taobao.android.dinamicx.widget.ac
            if (r2 == 0) goto L43
            com.taobao.android.dinamicx.widget.ac r1 = (com.taobao.android.dinamicx.widget.ac) r1
            boolean r2 = r1.p()
            if (r2 != 0) goto L76
            java.lang.String r1 = r1.q()
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 == 0) goto L76
        L43:
            return r3
        L44:
            boolean r1 = r3.isV4Node()
            if (r1 == 0) goto L76
            tb.gfl r1 = r3.getDxv4Properties()
            android.util.SparseArray r1 = r1.d()
            if (r1 == 0) goto L76
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r3.getParentWidget()
            boolean r2 = r1 instanceof com.taobao.android.dinamicx.widget.ac
            if (r2 == 0) goto L6f
            com.taobao.android.dinamicx.widget.ac r1 = (com.taobao.android.dinamicx.widget.ac) r1
            boolean r2 = r1.p()
            if (r2 != 0) goto L76
            java.lang.String r1 = r1.q()
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 == 0) goto L76
            return r3
        L6f:
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r3.getParentWidget()
            if (r1 != 0) goto L76
            return r3
        L76:
            com.taobao.android.dinamicx.widget.DXWidgetNode r1 = r3.getParentWidget()
            boolean r1 = r1 instanceof com.taobao.android.dinamicx.widget.ac
            if (r1 == 0) goto L87
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = r3.getParentWidget()
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = a(r3)
            return r3
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fti.a(com.taobao.android.dinamicx.widget.DXWidgetNode):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }
}
