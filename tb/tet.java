package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class tet extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TAOLIVEDXAB = -2270310021871231170L;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f34060a;

    static {
        kge.a(-684489231);
        f34060a = new HashMap();
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 3) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr[2];
        Object obj4 = objArr[3];
        if (!(obj instanceof String) || !(obj2 instanceof String) || !(obj3 instanceof String) || !(obj4 instanceof String)) {
            return obj4 instanceof String ? obj4 : "";
        }
        String str = "" + obj + obj2 + obj3;
        String str2 = f34060a.get(str);
        if (!TextUtils.isEmpty(str2)) {
            his.a("TaoliveDxAB", "evalWithArgs | has cache, key=" + str + " value=" + str2);
            return str2;
        }
        String a2 = pmd.a().t().a((String) obj, (String) obj2, (String) obj3, (String) obj4);
        if (!TextUtils.isEmpty(a2)) {
            his.a("TaoliveDxAB", "evalWithArgs |  activate, key=" + str + " value=" + a2);
            f34060a.put(str, a2);
        }
        return a2;
    }
}
