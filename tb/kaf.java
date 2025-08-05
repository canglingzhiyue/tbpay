package tb;

import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.proxy.ClientServiceProxy;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import java.util.List;

/* loaded from: classes.dex */
public class kaf extends kad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IClientService f29904a;

    static {
        kge.a(-772366086);
    }

    public kaf(IBinder iBinder) {
        this.f29904a = ClientServiceProxy.getProxy(iBinder);
    }

    @Override // tb.kah
    public void b(List<String> list) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        try {
            this.f29904a.recycle(list);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            if (e instanceof RemoteException) {
                throw new IPCException(27, e);
            }
            throw new IPCException(9, e);
        }
    }

    @Override // tb.kad
    public Reply b(Callback callback) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reply) ipChange.ipc$dispatch("835fcbb8", new Object[]{this, callback});
        }
        try {
            return this.f29904a.sendCallback(callback);
        } catch (Exception e) {
            if (e instanceof IPCException) {
                throw ((IPCException) e);
            }
            if (e instanceof RemoteException) {
                throw new IPCException(2, e);
            }
            throw new IPCException(9, e);
        }
    }
}
