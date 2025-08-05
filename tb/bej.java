package tb;

import com.alibaba.android.ultron.trade.event.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class bej {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1026002138);
    }

    public static void a(bbz bbzVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{bbzVar});
            return;
        }
        bcb n = bbzVar.n();
        boolean j = n.j();
        Iterator<IDMComponent> it = n.w().b().iterator();
        while (true) {
            str = "hidden";
            if (!it.hasNext()) {
                break;
            }
            IDMComponent next = it.next();
            JSONObject fields = next.getFields();
            if (fields != null && fields.containsKey("hideInManage")) {
                boolean booleanValue = fields.getBoolean("hideInManage").booleanValue();
                if (!j || !booleanValue) {
                    str = "normal";
                }
                next.getData().put("status", (Object) str);
            }
        }
        IDMComponent e = n.e("cartTimePromotion");
        if (!j) {
            str = "normal";
        }
        if (!"normal".equals(str)) {
            return;
        }
        h.a(bbzVar.m(), e);
    }
}
