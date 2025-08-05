package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.aj;

/* loaded from: classes.dex */
public class frk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXAB = 33582044307L;

    static {
        kge.a(-1632734094);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dxAB";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr != null && objArr.length > 1) {
            String obj = objArr[0].toString();
            String obj2 = objArr[1].toString();
            aj b = u.b();
            if (b != null) {
                try {
                    jSONObject.putAll(b.a(obj, obj2));
                } catch (Throwable th) {
                    fuw.d("DXDataParserDxAB", "获取ABTest信息错误: \n" + th.getMessage());
                }
            }
        }
        return jSONObject;
    }
}
