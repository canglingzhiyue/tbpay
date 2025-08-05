package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;

/* loaded from: classes4.dex */
public abstract class dbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Application mApplication;
    public IRemoteBaseListener mRemoteListener;

    static {
        kge.a(-1433525675);
    }

    public dbz(Application application) {
        this.mApplication = application;
    }

    public void registerRemoteListener(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8eb052", new Object[]{this, iRemoteBaseListener});
        } else {
            this.mRemoteListener = iRemoteBaseListener;
        }
    }
}
