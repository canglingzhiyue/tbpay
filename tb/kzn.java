package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes7.dex */
public class kzn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETSEARCHBARHEIGHT = -1687529246199642529L;

    public static /* synthetic */ Object ipc$super(kzn kznVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            c.a("DXDataParserHGetSearchBarHeight", "dinamicParams == null,上下文为空");
            return 0;
        }
        int a2 = a(b.b(dXRuntimeContext));
        int a3 = a(dXRuntimeContext.m(), a2);
        c.a("DXDataParserHGetSearchBarHeight", "searchBarHeightPx: " + a2 + "px2dip: " + a3);
        return Integer.valueOf(a3);
    }

    private int a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f20ac4a4", new Object[]{this, kyuVar})).intValue();
        }
        if (kyuVar == null) {
            c.a("DXDataParserHGetSearchBarHeight", "engine == null");
            return -1;
        }
        return kyuVar.e().b();
    }

    private int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue();
        }
        if (context == null) {
            c.a("DXDataParserHGetSearchBarHeight", "context == null");
            return 0;
        }
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }
}
