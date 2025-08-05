package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractSelectedRet;
import com.taobao.android.detail.alicom.widget.a;
import com.taobao.android.detail.alicom.widget.b;
import com.taobao.android.detail.sdk.model.node.ContractNode;

/* loaded from: classes4.dex */
public class dwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1483756254);
    }

    public static void a(Activity activity, a aVar, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac0edec", new Object[]{activity, aVar, contractNode, str, str2, contractSelectedRet});
            return;
        }
        b bVar = new b(false, activity, aVar, contractNode, str, str2, contractSelectedRet);
        bVar.setCanceledOnTouchOutside(false);
        bVar.show();
    }

    public static void b(Activity activity, a aVar, ContractNode contractNode, String str, String str2, ContractSelectedRet contractSelectedRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e33a6d", new Object[]{activity, aVar, contractNode, str, str2, contractSelectedRet});
            return;
        }
        b bVar = new b(true, activity, aVar, contractNode, str, str2, contractSelectedRet);
        bVar.setCanceledOnTouchOutside(false);
        bVar.show();
    }
}
