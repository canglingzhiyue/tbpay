package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class kqp extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLIVEIMAGERATIO = -521746365956793992L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if (objArr[0] instanceof String) {
            try {
                String str = (String) objArr[0];
                if (!pro.e(str)) {
                    int lastIndexOf = str.lastIndexOf("-", str.lastIndexOf("-") - 1) + 1;
                    int lastIndexOf2 = str.lastIndexOf(".");
                    String[] split = ((lastIndexOf == 0 || lastIndexOf2 == -1) ? "0" : str.substring(lastIndexOf, lastIndexOf2)).split("-");
                    if (split.length == 2 && Integer.parseInt(split[0]) > 0 && Integer.parseInt(split[1]) > 0) {
                        return Float.valueOf(Integer.parseInt(split[0]) / Integer.parseInt(split[1]));
                    }
                    return -1;
                }
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }
}
