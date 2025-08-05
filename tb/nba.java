package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

@AURAExtensionImpl(code = "albbcashier.impl.aspect.lifecycle.event.monitor")
/* loaded from: classes9.dex */
public final class nba extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f31360a;

    public static /* synthetic */ Object ipc$super(nba nbaVar, String str, Object... objArr) {
        if (str.hashCode() == -362309544) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-334624956);
        f31360a = 0L;
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        try {
            if (!e.CODE.equals(aVar.c())) {
                return;
            }
            Serializable data = aURAInputData.getData();
            if (!(data instanceof AURAEventIO)) {
                return;
            }
            AURAEventIO aURAEventIO = (AURAEventIO) data;
            if (!"openUrl".equals(aURAEventIO.getEventType()) || !"overseaPayType".equals(aURAEventIO.getEventModel().i())) {
                return;
            }
            f31360a = System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
            ard a2 = arc.a();
            a2.a("FrontCashierPreRender", "EventMonitor", "error:" + e.getMessage());
        }
    }
}
