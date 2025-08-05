package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes.dex */
public class fry extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETTEMPLATEINFO = -4081992190257812457L;

    static {
        kge.a(-1767846431);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "getTemplateInfo";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXTemplateItem c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || (c = dXRuntimeContext.c()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) c.f11925a);
        jSONObject.put("version", (Object) (c.b + ""));
        jSONObject.put("url", (Object) c.c);
        return (objArr == null || objArr.length != 1) ? jSONObject : jSONObject.get(String.valueOf(objArr[0]));
    }
}
