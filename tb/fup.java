package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class fup extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_PARENTSUBDATA = -1943779674642760869L;

    static {
        kge.a(-1454084097);
    }

    public static /* synthetic */ Object ipc$super(fup fupVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "parentSubdata";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = a(dXRuntimeContext);
        if (a2 == null) {
            return null;
        }
        if (objArr != null && objArr.length != 0) {
            if (objArr.length > 1) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer((String) obj, dmp.DELIMITER, false);
            while (stringTokenizer.hasMoreTokens()) {
                a2 = a(dXRuntimeContext, a2, stringTokenizer.nextToken());
            }
        }
        return a2;
    }

    private Object a(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode d;
        DXWidgetNode parentWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || (d = dXRuntimeContext.d()) == null || (parentWidget = d.getParentWidget()) == null) {
            return null;
        }
        m mVar = (m) parentWidget;
        if (mVar.isHandleListData()) {
            return mVar.getDXRuntimeContext().f();
        }
        return a(mVar.getDXRuntimeContext());
    }

    private Object a(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5243d13", new Object[]{this, dXRuntimeContext, obj, str});
        }
        if (obj != null && str != null) {
            return fuj.a(dXRuntimeContext, obj, str);
        }
        return null;
    }
}
