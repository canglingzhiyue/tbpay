package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;

/* loaded from: classes.dex */
public class jzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1559108316);
    }

    public static jzx a(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzx) ipChange.ipc$dispatch("2c7d634b", new Object[]{call});
        }
        int type = call.getServiceWrapper().getType();
        if (type == 0) {
            return new kab(call);
        }
        if (type == 1) {
            return new jzz(call);
        }
        if (type == 3) {
            return new kaa(call);
        }
        if (type == 4 || type == 5) {
            return new xke(call);
        }
        throw new IPCException(13, "Type " + call.getServiceWrapper().getType() + " is not supported.");
    }
}
