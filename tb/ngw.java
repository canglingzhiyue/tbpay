package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.e;
import com.taobao.android.riverlogger.h;
import com.taobao.android.riverlogger.i;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;

/* loaded from: classes.dex */
public class ngw implements ney {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1490088549);
        kge.a(365505693);
    }

    @Override // tb.ney
    public void a(String str, String str2, final a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf44c13", new Object[]{this, str, str2, interfaceC0751a});
        } else {
            e.a(new i(str, str2), new h() { // from class: tb.ngw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.h
                public void a(boolean z, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str3});
                    } else if (z) {
                        interfaceC0751a.a(null);
                    } else {
                        interfaceC0751a.a(PHAErrorType.NETWORK_ERROR, str3);
                    }
                }
            });
        }
    }

    @Override // tb.ney
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e.c();
        }
    }
}
