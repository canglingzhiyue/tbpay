package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import java.util.Map;

/* loaded from: classes.dex */
public interface ggz {
    gfx a(DXRuntimeContext dXRuntimeContext, String str, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError;

    a a(DXRuntimeContext dXRuntimeContext, int i, ghg ghgVar, Map map);

    void a(ghe gheVar);

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f28327a;
        public final String b;
        public final gfx c;

        static {
            kge.a(255770310);
        }

        public a(boolean z, String str, gfx gfxVar) {
            this.f28327a = z;
            this.b = str;
            this.c = gfxVar;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "EngineResult{success=" + this.f28327a + ", errorMsg='" + this.b + "', result=" + this.c + '}';
        }
    }
}
