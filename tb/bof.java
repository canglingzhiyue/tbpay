package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class bof extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEvent";

    static {
        kge.a(1854043201);
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        bny bnyVar;
        bol bolVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ecc62", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
        } else if (!(obj3 instanceof Map) || (bnyVar = (bny) ((Map) obj3).get("ViewEngine")) == null || (bolVar = (bol) bnyVar.a(bol.class)) == null) {
        } else {
            bolVar.a(view, str, obj, obj2, obj3, arrayList);
        }
    }
}
