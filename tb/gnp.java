package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.TBMainHost;
import java.util.Map;

/* loaded from: classes5.dex */
public class gnp extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "isTabbarHidden";

    static {
        kge.a(-692419173);
    }

    public static /* synthetic */ Object ipc$super(gnp gnpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        bbz bbzVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : (dXRuntimeContext == null || dXRuntimeContext.a() == null || !(dXRuntimeContext.a() instanceof Map) || (obj = ((Map) dXRuntimeContext.a()).get("ViewEngine")) == null || !(obj instanceof bny) || (bbzVar = (bbz) ((bny) obj).a(bbz.class)) == null || !a(bbzVar.m())) ? false : true;
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        return context != TBMainHost.a().getContext() && !"com.taobao.android.trade.cart.CartTabActivity".equals(context.getClass().getName());
    }
}
