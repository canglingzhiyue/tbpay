package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes7.dex */
public class kte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MTOP_BIZ_CODE = 99;

    public RemoteBusiness a(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("e7053303", new Object[]{this, mtopRequest}) : RemoteBusiness.build(mtopRequest).mo1340setBizId(99);
    }

    public void a(MtopRequest mtopRequest, IRemoteBaseListener iRemoteBaseListener, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77da0da", new Object[]{this, mtopRequest, iRemoteBaseListener, cls});
        } else {
            a(mtopRequest).registeListener((IRemoteListener) iRemoteBaseListener).startRequest(cls);
        }
    }
}
