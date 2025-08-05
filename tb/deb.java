package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* loaded from: classes4.dex */
public class deb implements dec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-361145877);
        kge.a(288296502);
    }

    @Override // tb.dec
    public void a(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b08e2", new Object[]{this, baseFrame});
        }
    }

    @Override // tb.dec
    public void b(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba182001", new Object[]{this, baseFrame});
        }
    }
}
