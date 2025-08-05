package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.List;
import tb.bga;

/* loaded from: classes2.dex */
public class beh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-696660666);
    }

    public static void a(bcb bcbVar, jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c8ce92", new Object[]{bcbVar, jnyVar});
        } else {
            c(jnyVar);
        }
    }

    public static boolean c(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccc2c809", new Object[]{jnyVar})).booleanValue();
        }
        if (jnyVar == null) {
            return false;
        }
        b bVar = (b) jnyVar;
        List<IDMComponent> b = jnyVar.b();
        if (b != null && !b.isEmpty()) {
            return true;
        }
        UnifyLog.a("iCart", "CheckDataUtils", "NotFoundAnyComponent", "structure=" + bVar.w());
        UnifyLog.a("iCart", "CheckDataUtils", "NotFoundAnyComponent", "data=" + bVar.o());
        UnifyLog.a("iCart", "CheckDataUtils", "NotFoundAnyComponent", "componentMap=" + bVar.u());
        bga.a.a("iCart", "dataIntegrality", "NotFoundAnyComponent", "未发现任何组件");
        return false;
    }
}
