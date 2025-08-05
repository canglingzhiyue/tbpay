package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.g;

/* loaded from: classes.dex */
public class kzx extends kzw implements IPopViewEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public kzx(lad ladVar) {
        super(ladVar);
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
        } else if (i == 3) {
        } else {
            if (g.b(i)) {
                a(i, null, iPopData);
                b(iPopData);
            }
            if (!g.c(i)) {
                return;
            }
            a(iPopData);
        }
    }
}
