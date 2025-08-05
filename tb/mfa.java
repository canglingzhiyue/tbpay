package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class mfa extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVJSONTOMAP = 6191155244914605888L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && (objArr[0] instanceof String)) {
            try {
                return JSON.parseObject((String) objArr[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
