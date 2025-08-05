package mtopsdk.xstate;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.xstate.aidl.IXState;
import tb.kge;

/* loaded from: classes.dex */
public class XStateService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IXState.Stub f25042a = null;
    public Object b = new Object();

    static {
        kge.a(550640995);
    }

    public static /* synthetic */ Object ipc$super(XStateService xStateService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        synchronized (this.b) {
            if (this.f25042a == null) {
                this.f25042a = new XStateStub();
                try {
                    this.f25042a.init();
                } catch (RemoteException e) {
                    TBSdkLog.e("mtopsdk.XStateService", "[onBind]init() exception", e);
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.XStateService", "[onBind]init() error", th);
                }
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.XStateService", "[onBind] XStateService  stub= " + this.f25042a.hashCode());
        }
        return this.f25042a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        synchronized (this.b) {
            if (this.f25042a != null) {
                try {
                    this.f25042a.unInit();
                } catch (RemoteException e) {
                    TBSdkLog.e("mtopsdk.XStateService", "[onDestroy]unInit() exception", e);
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.XStateService", "[onDestroy]unInit() error", th);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    class XStateStub extends IXState.Stub {
        static {
            kge.a(-2048758456);
        }

        public XStateStub() {
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public String removeKey(String str) throws RemoteException {
            return b.b(str);
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void setValue(String str, String str2) throws RemoteException {
            b.a(str, str2);
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void init() throws RemoteException {
            b.a(XStateService.this.getBaseContext());
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public void unInit() throws RemoteException {
            b.a();
        }

        @Override // mtopsdk.xstate.aidl.IXState
        public String getValue(String str) throws RemoteException {
            return b.a(str);
        }
    }
}
