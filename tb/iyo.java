package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ifz;

@AURAExtensionImpl(code = "alibuy.impl.nextrpc.monitor")
/* loaded from: classes4.dex */
public final class iyo extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1447854187);
    }

    @Override // tb.asf, tb.asg
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
        } else {
            ifz.a(ifz.b.a(aVar.c(), true).a(baq.a(aVar)).b(aVar.a()).a(1.0E-4f));
        }
    }
}
