package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes7.dex */
public class mwb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_URLCODETOOL = -8358760303821231753L;
    public static final String KEY_DECODE = "decode";
    public static final String KEY_ENCODE = "encode";

    static {
        kge.a(-2145584578);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            if (StringUtils.isEmpty(valueOf2)) {
                return null;
            }
            try {
                if ("encode".equals(valueOf)) {
                    return URLEncoder.encode(valueOf2, "utf-8");
                }
                if ("decode".equals(valueOf)) {
                    return URLDecoder.decode(valueOf2, "utf-8");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
