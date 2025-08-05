package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.android.tbtheme.kit.m;

/* loaded from: classes.dex */
public class jdn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TAOBAO_THEME_VALID = 8377551176377625193L;

    static {
        kge.a(-2021553799);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String valueOf = String.valueOf(j.b());
        m.a("DXDataParserTaobaoThemeValid", "evalWithArgs:", valueOf);
        return valueOf;
    }
}
