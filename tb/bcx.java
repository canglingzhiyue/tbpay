package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class bcx extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ARRAY_CONCAT = 6742876832553239298L;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f25813a = new JSONArray(0);

    static {
        kge.a(2003653565);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2) {
            return this.f25813a;
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        Object obj = objArr[1];
        int size = jSONArray.size();
        boolean z = obj instanceof Object[];
        if (z) {
            i = ((Object[]) obj).length;
        } else if (obj instanceof JSONArray) {
            i = ((JSONArray) obj).size();
        }
        JSONArray jSONArray2 = new JSONArray(i + size);
        jSONArray2.addAll(jSONArray);
        if (z) {
            for (Object obj2 : (Object[]) obj) {
                jSONArray2.add(obj2);
            }
        } else if (obj instanceof JSONArray) {
            jSONArray2.addAll((JSONArray) obj);
        } else {
            jSONArray2.add(obj);
        }
        return jSONArray2;
    }
}
