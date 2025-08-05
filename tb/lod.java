package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes7.dex */
public class lod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2051092327);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(loc.DX_EVENT_HREFRESHWIDGETNODE, new ley(new loc()));
        dinamicXEngine.a(lob.DX_PARSER_HICONOVERLAYGETDATA, new lfo(new lob()));
    }
}
