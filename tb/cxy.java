package tb;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.nb.searchmanager.utils.logger.DSLog;
import com.huawei.searchservice.service.IHOSPSearchServiceCall;

/* loaded from: classes4.dex */
public class cxy implements cxz {

    /* renamed from: a  reason: collision with root package name */
    private volatile IHOSPSearchServiceCall f26592a;
    private volatile cxv b;
    private IBinder c;
    private Context d;

    private void a(boolean z) {
        if (z) {
            if (this.b == null) {
                return;
            }
            DSLog.it("AbilityConnectionListener", "connectCallback.onConnect", new Object[0]);
            this.b.a();
        } else if (this.b == null) {
        } else {
            DSLog.it("AbilityConnectionListener", "connectCallback.onDisconnect", new Object[0]);
            this.b.b();
        }
    }

    public IHOSPSearchServiceCall a() {
        return this.f26592a;
    }

    public void a(Context context) {
        this.d = context;
    }

    public void a(IBinder iBinder) {
        this.c = iBinder;
    }

    public void a(cxv cxvVar) {
        this.b = cxvVar;
    }

    @Override // tb.cxz
    public void b() {
        this.f26592a = null;
        DSLog.it("AbilityConnectionListener", "async connection to search service is broken down.", new Object[0]);
        a(false);
    }

    @Override // tb.cxz
    public void b(IBinder iBinder) {
        if (iBinder != null) {
            this.f26592a = IHOSPSearchServiceCall.Stub.asInterface(iBinder);
            try {
                this.f26592a.registerClientDeathBinder(this.c, this.d.getPackageName());
            } catch (RemoteException e) {
                DSLog.et("AbilityConnectionListener", "registerClientDeathBinder RemoteException: " + e.getMessage(), new Object[0]);
            }
            DSLog.it("AbilityConnectionListener", "Succeed async connect search service", new Object[0]);
            a(true);
        }
    }
}
