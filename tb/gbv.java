package tb;

import android.util.Log;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;
import tb.ggz;

/* loaded from: classes.dex */
public class gbv implements ggz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gbw f28299a = new gbw();

    static {
        kge.a(621081530);
        kge.a(-1105167459);
    }

    @Override // tb.ggz
    public ggz.a a(DXRuntimeContext dXRuntimeContext, int i, ghg ghgVar, Map map) {
        String str = "null";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggz.a) ipChange.ipc$dispatch("6cad823e", new Object[]{this, dXRuntimeContext, new Integer(i), ghgVar, map});
        }
        try {
            gfl dxv4Properties = dXRuntimeContext.d().getDxv4Properties();
            gbz gbzVar = new gbz(this.f28299a);
            gbzVar.a(DinamicXEngine.j());
            SparseArray<byte[]> d = dxv4Properties.d();
            SparseArray<Object> e = dxv4Properties.e();
            if (gbzVar.a()) {
                fuw.d("dx_v4_expression", "expr start index = " + i);
            }
            gfx a2 = gbzVar.a(dXRuntimeContext, d.get(i), e, ghgVar, map);
            if (gbzVar.a()) {
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("expr result index:");
                sb.append(i);
                sb.append(" type:");
                sb.append(a2.d());
                sb.append(" value:");
                sb.append(a2.J() == null ? str : a2.J().toString());
                strArr[0] = sb.toString();
                fuw.d("dx_v4_expression", strArr);
            }
            return new ggz.a(true, "", a2);
        } catch (Throwable th) {
            DXTemplateItem c = dXRuntimeContext.c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("表达式执行异常 templateItem info:");
            if (c != null) {
                str = c.toString();
            }
            sb2.append(str);
            sb2.append(" expr index:");
            sb2.append(i);
            String str2 = sb2.toString() + " " + Log.getStackTraceString(th);
            fuw.b(str2);
            return new ggz.a(false, str2, null);
        }
    }

    @Override // tb.ggz
    public void a(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea408cb4", new Object[]{this, gheVar});
        } else if (gheVar == null) {
        } else {
            this.f28299a.a(gheVar);
        }
    }

    @Override // tb.ggz
    public gfx a(DXRuntimeContext dXRuntimeContext, String str, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("7006a94b", new Object[]{this, dXRuntimeContext, str, gfxVar, new Integer(i), gfxVarArr, map});
        }
        gfx a2 = this.f28299a.a(str);
        if (a2 != null) {
            try {
                return a2.u().execute(dXRuntimeContext, gfxVar, i, gfxVarArr, map);
            } catch (Exception e) {
                a.b(e);
            }
        }
        return gfx.e();
    }
}
