package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class fqt extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(994695939);
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        if (this.c == null) {
            return null;
        }
        int size = this.c.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object a2 = this.c.get(i).a(dXEvent, dXRuntimeContext);
            if (a2 != null) {
                arrayList.add(a2.toString());
            }
        }
        return arrayList;
    }

    public fqt() {
        this.f28129a = (byte) 4;
        this.e = "branch";
    }
}
