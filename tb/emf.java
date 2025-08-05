package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;

/* loaded from: classes4.dex */
public class emf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1359546633);
        emu.a("com.taobao.android.detail.core.standard.utils.AliSDetailItemIdRetriever");
    }

    public static String a(Context context) {
        c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!(context instanceof DetailCoreActivity) || (C = ((DetailCoreActivity) context).C()) == null) {
            return null;
        }
        return C.i();
    }
}
