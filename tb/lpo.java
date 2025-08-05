package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.lpp;
import tb.lpq;
import tb.lpr;

/* loaded from: classes.dex */
public class lpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(606724856);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(6136827152325085276L, new ley(new lps()));
        dinamicXEngine.a(-9200576388575376305L, new ley(new lpt()));
        dinamicXEngine.a(xkp.DX_EVENT_OPENHOSTTARGETURLHANDLER, new ley(new xkp()));
        dinamicXEngine.a(lpp.GATEWAYTRIGGEREVENT, new lpp.a());
        dinamicXEngine.a(lpr.DISMISS, new lpr.a());
        dinamicXEngine.a(lpq.HOMEPAGETOAST, new lpq.a());
        dinamicXEngine.a(6584495743641924598L, new lfo(new lpv()));
    }
}
