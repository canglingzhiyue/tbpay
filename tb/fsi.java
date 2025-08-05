package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fsi extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_KV = 798575;

    static {
        kge.a(-1253094040);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "kv";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            fuw.d("DXDataParserKv", "args 键值对数量不符合规范");
            return null;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            if (objArr[i] != null) {
                String obj = objArr[i].toString();
                if (!TextUtils.isEmpty(obj)) {
                    jSONObject.put(obj, objArr[i + 1]);
                }
            }
        }
        return jSONObject;
    }
}
