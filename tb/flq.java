package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.d;

/* loaded from: classes5.dex */
public class flq implements flr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(577250104);
        kge.a(1666232131);
    }

    @Override // tb.flr
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799501f7", new Object[]{this, dVar});
        }
    }

    @Override // tb.flr
    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340aa278", new Object[]{this, dVar});
        }
    }
}
