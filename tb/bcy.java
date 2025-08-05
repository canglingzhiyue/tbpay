package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class bcy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ARRAY_SUB = 2311459087679162833L;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f25814a = new JSONArray(0);

    static {
        kge.a(-231454153);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return this.f25814a;
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        int parseInt = Integer.parseInt((String) objArr[1]);
        int parseInt2 = Integer.parseInt((String) objArr[2]);
        if (jSONArray.size() < parseInt + parseInt2) {
            return this.f25814a;
        }
        JSONArray jSONArray2 = new JSONArray(parseInt2);
        for (int i = 0; i < parseInt2; i++) {
            jSONArray2.add(jSONArray.get(parseInt + i));
        }
        return jSONArray2;
    }
}
