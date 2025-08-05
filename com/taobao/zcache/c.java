package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import tb.kge;

/* loaded from: classes9.dex */
public class c implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(419039773);
        kge.a(1764821357);
    }

    @Override // com.taobao.zcache.f
    public void a(final IZCacheClientListener iZCacheClientListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d98cdd", new Object[]{this, iZCacheClientListener});
            return;
        }
        try {
            com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.zcache.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            iZCacheClientListener.clientActived();
                            return;
                        } else if (i != 50) {
                            return;
                        }
                    }
                    iZCacheClientListener.clientDeactived();
                }
            });
        } catch (NoClassDefFoundError unused) {
        }
    }
}
