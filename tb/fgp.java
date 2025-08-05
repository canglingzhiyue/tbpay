package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;

/* loaded from: classes5.dex */
public class fgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-166192821);
        emu.a("com.taobao.android.detail.wrapper.utils.DetailShareUtil");
    }

    public static String a(b bVar) {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632ab5de", new Object[]{bVar});
        }
        if (bVar != null && (c = eqb.c(bVar)) != null) {
            return c.shareBizCode;
        }
        return null;
    }

    public static String b(b bVar) {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("411e1bbd", new Object[]{bVar});
        }
        if (bVar != null && (c = eqb.c(bVar)) != null) {
            return c.shareItemLink;
        }
        return null;
    }
}
