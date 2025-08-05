package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.network.domain.b;

/* loaded from: classes9.dex */
public class rzw implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33445a;
    public Map<String, List<String>> b;
    public ryn c;
    public ryp d;
    public String e;

    public rzw(ryn rynVar, ryp rypVar, String str) {
        this.c = rynVar;
        this.d = rypVar;
        this.e = str;
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
        } else {
            this.d.onResponse(this.c, new b.a().a(this.c.a()).a(this.f33445a).a(finishEvent.getDesc()).a(this.b).a(ryr.a(finishEvent.getStatisticData())).a());
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
        } else if (progressEvent == null || progressEvent.getBytedata() == null || !(this.d instanceof rzu)) {
        } else {
            ((rzu) this.d).a(Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize()));
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.f33445a = i;
        this.b = map;
        ryp rypVar = this.d;
        if (rypVar instanceof rzu) {
            ((rzu) rypVar).a(i, map);
        }
        return true;
    }
}
