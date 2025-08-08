package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.b;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import java.util.Map;

/* loaded from: classes.dex */
public class ftj extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TEMPLATEDATA = -1464634009013122078L;
    public static final int TYPE_CONSTANT = 0;
    public static final int TYPE_EXPR = 1;

    static {
        kge.a(1941192550);
    }

    public static /* synthetic */ Object ipc$super(ftj ftjVar, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fum, tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : super.evalWithArgs(objArr, dXRuntimeContext);
    }

    private JSONObject b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2381b6ba", new Object[]{this, dXRuntimeContext});
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
        if (m != null && !m.isEmpty()) {
            return m;
        }
        JSONObject l = acVar.l();
        if (l == null) {
            return null;
        }
        JSONObject a2 = a(l, parentWidget.getDXRuntimeContext());
        acVar.a(a2);
        return a2;
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext}) : b(dXRuntimeContext);
    }

    private JSONObject a(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26fe7419", new Object[]{this, jSONObject, dXRuntimeContext});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) value;
                if (1 == jSONObject3.getInteger("t").intValue()) {
                    long longValue = jSONObject3.getLongValue("v");
                    b<fqp> a2 = a(dXRuntimeContext.d());
                    String key = entry.getKey();
                    if (a2 == null) {
                        fuw.b("key " + key + " mCodeMap 是null");
                    } else {
                        fqp fqpVar = a2.get(longValue);
                        if (fqpVar == null) {
                            fuw.b("key " + key + " exprNode 是null");
                        } else {
                            jSONObject2.put(entry.getKey(), fqpVar.a(null, dXRuntimeContext));
                        }
                    }
                } else {
                    jSONObject2.put(entry.getKey(), jSONObject3.get("v"));
                }
            }
        }
        return jSONObject2;
    }

    public static b<fqp> a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8b589ecf", new Object[]{dXWidgetNode});
        }
        DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
        if (queryRootWidgetNode == null) {
            return null;
        }
        if (queryRootWidgetNode.getCodeMap() != null) {
            DXWidgetNode parentWidget = queryRootWidgetNode.getParentWidget();
            if (parentWidget instanceof ac) {
                ac acVar = (ac) parentWidget;
                if (!acVar.p() && StringUtils.isEmpty(acVar.q())) {
                    return queryRootWidgetNode.getCodeMap();
                }
            } else {
                return queryRootWidgetNode.getCodeMap();
            }
        }
        if (!(queryRootWidgetNode.getParentWidget() instanceof ac)) {
            return null;
        }
        return a(queryRootWidgetNode.getParentWidget());
    }
}
