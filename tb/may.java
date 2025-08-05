package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;

/* loaded from: classes.dex */
public class may implements knt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1465268318);
        kge.a(-2086326011);
    }

    @Override // tb.knt
    public void onEvent(final kof kofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a2b8b0", new Object[]{this, kofVar});
        } else if (kofVar == null) {
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.may.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(new a.b() { // from class: tb.may.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.application.common.IApmEventListener
                            public void onEvent(int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                                } else if (i == 1) {
                                    kofVar.a();
                                } else if (i != 2) {
                                } else {
                                    kofVar.b();
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
