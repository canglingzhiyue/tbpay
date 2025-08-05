package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.taolive.sdk.utils.e;

/* loaded from: classes8.dex */
public class pba implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-588130884);
        kge.a(-1121988874);
    }

    @Override // com.taobao.taolive.sdk.utils.e
    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : TimestampSynchronizer.getServerTime();
    }

    @Override // com.taobao.taolive.sdk.utils.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            TimeStampManager.instance().pullTimeStampIfNeeded();
        }
    }
}
