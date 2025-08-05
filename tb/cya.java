package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.nb.searchmanager.utils.logger.DSLog;

/* loaded from: classes4.dex */
public class cya {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26593a;
    private final String c;
    private final String d;
    private cxz f;
    private ServiceConnection g;
    private final String b = null;
    private IBinder e = null;

    public cya(Context context, String str, String str2) {
        this.f26593a = context;
        this.c = str;
        this.d = str2;
        DSLog.it("RemoteServiceConnection", "create search ServiceConnection with package name", new Object[0]);
    }

    private Intent a(String str, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        return intent;
    }

    public boolean a(cxz cxzVar) {
        String str;
        this.f = cxzVar;
        String str2 = this.c;
        if (str2 == null || (str = this.d) == null) {
            DSLog.et("RemoteServiceConnection", "Cannot create intent by action, should provide service package and service class name.", new Object[0]);
            DSLog.et("RemoteServiceConnection", "Failed to find the given search service action.", new Object[0]);
            return false;
        }
        Intent a2 = a(str2, str);
        a2.setType(GrsBaseInfo.CountryCodeSource.APP);
        if (this.d.equals("com.huawei.searchservice.service.SearchService")) {
            a2.setType("HOSP");
        }
        try {
            this.g = new cyb(this.e, this.f);
            if (this.f26593a.bindService(a2, this.g, 1)) {
                return true;
            }
            DSLog.et("RemoteServiceConnection", "Failed to connect to search service.", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            DSLog.et("RemoteServiceConnection", "Failed to bind search service.", new Object[0]);
            return false;
        }
    }
}
