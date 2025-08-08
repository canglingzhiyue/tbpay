package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class ffy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DETAILGETIMAGERADIO = 1779172034916198520L;

    static {
        kge.a(-1690513019);
    }

    public ffy() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.title.DXDataParserDetailGetImageRadio");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0) {
            return 0;
        }
        String str = objArr[0] instanceof String ? (String) objArr[0] : "";
        if (!StringUtils.isEmpty(str)) {
            return Float.valueOf(dxi.a(str));
        }
        return 0;
    }
}
