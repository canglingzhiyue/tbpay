package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class kls implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kmb f30141a;

    public kls(kmb kmbVar) {
        this.f30141a = kmbVar;
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
        } else if (finishEvent == null) {
        } else {
            this.f30141a.a(finishEvent.getHttpCode(), finishEvent.getDesc());
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue() : this.f30141a.a(i, map, obj);
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
        } else if (progressEvent == null) {
        } else {
            kmc kmcVar = new kmc();
            kmcVar.c = progressEvent.getBytedata();
            kmcVar.d = progressEvent.getIndex();
            kmcVar.e = progressEvent.getFragmentIndex();
            kmcVar.f30155a = progressEvent.getSize();
            kmcVar.b = progressEvent.getTotal();
            this.f30141a.a(kmcVar, obj);
        }
    }
}
