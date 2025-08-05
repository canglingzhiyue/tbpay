package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class iux extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_BYTELENGTH = -2674075262426068960L;

    static {
        kge.a(330966798);
    }

    public iux() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.title.DXDataParserByteLength");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length > 0) {
            String str = objArr[0] instanceof String ? (String) objArr[0] : "";
            try {
                if (!TextUtils.isEmpty(str)) {
                    int i = 0;
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        i = String.valueOf(str.charAt(i2)).getBytes().length == 1 ? i + 1 : i + 2;
                    }
                    return Integer.valueOf(i);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
