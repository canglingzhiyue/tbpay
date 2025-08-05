package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.e;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes8.dex */
public class ouw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-154950071);
    }

    public static void a(IMTOPDataObject iMTOPDataObject, Class<? extends IMTOPDataObject> cls, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867bae16", new Object[]{iMTOPDataObject, cls, mtopListener});
            return;
        }
        e eVar = new e(3000);
        eVar.a(mtopListener);
        eVar.a(null, 0, iMTOPDataObject, cls);
    }
}
