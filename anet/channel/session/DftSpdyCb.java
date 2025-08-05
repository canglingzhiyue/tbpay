package anet.channel.session;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdySession;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseData;
import tb.kge;

/* loaded from: classes.dex */
public class DftSpdyCb implements Spdycb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1016110741);
        kge.a(1158421859);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cc7148", new Object[]{this, spdySession, new Boolean(z), new Long(j), spdyByteArray, obj});
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbb83e4", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), obj});
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce4e202", new Object[]{this, spdySession, new Boolean(z), new Long(j), new Integer(i), obj});
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdf60d3", new Object[]{this, spdySession, new Long(j), map, obj});
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32746b34", new Object[]{this, spdySession, new Long(j), obj});
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bce1581", new Object[]{this, spdySession, new Long(j), new Integer(i), obj, superviseData});
        }
    }
}
