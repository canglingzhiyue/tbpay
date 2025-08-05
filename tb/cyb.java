package tb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.nb.searchmanager.utils.logger.DSLog;

/* loaded from: classes4.dex */
public class cyb implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private IBinder f26594a;
    private cxz b;

    public cyb(IBinder iBinder, cxz cxzVar) {
        this.f26594a = iBinder;
        this.b = cxzVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f26594a = iBinder;
        cxz cxzVar = this.b;
        if (cxzVar != null) {
            cxzVar.b(this.f26594a);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f26594a != null) {
            this.f26594a = null;
            cxz cxzVar = this.b;
            if (cxzVar != null) {
                cxzVar.b();
            }
            DSLog.et("SearchServiceConnection", "Connection to search service is disconnected unexpectedly.", new Object[0]);
        }
    }
}
