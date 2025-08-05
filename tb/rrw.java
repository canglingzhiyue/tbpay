package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.zui.deviceidservice.IDeviceidInterface;

/* loaded from: classes9.dex */
public class rrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String c;
    private static boolean d;
    private IDeviceidInterface b;
    private ServiceConnection e;

    /* renamed from: a  reason: collision with root package name */
    private Context f33344a = null;
    private a f = null;

    /* loaded from: classes9.dex */
    public interface a<T> {
    }

    public static /* synthetic */ void a(rrw rrwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55afb0cb", new Object[]{rrwVar, str});
        }
    }

    public static /* synthetic */ IDeviceidInterface a(rrw rrwVar, IDeviceidInterface iDeviceidInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDeviceidInterface) ipChange.ipc$dispatch("579787f5", new Object[]{rrwVar, iDeviceidInterface});
        }
        rrwVar.b = iDeviceidInterface;
        return iDeviceidInterface;
    }

    public static /* synthetic */ a a(rrw rrwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e72fecf1", new Object[]{rrwVar}) : rrwVar.f;
    }

    static {
        kge.a(1764083545);
        c = "OpenDeviceId library";
        d = false;
    }

    public int a(Context context, a<String> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643d030f", new Object[]{this, context, aVar})).intValue();
        }
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f33344a = context;
        this.f = aVar;
        this.e = new ServiceConnection() { // from class: tb.rrw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ServiceConnection
            public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                rrw.a(rrw.this, IDeviceidInterface.Stub.asInterface(iBinder));
                if (rrw.a(rrw.this) != null) {
                    rrw.a(rrw.this);
                }
                rrw.a(rrw.this, "Service onServiceConnected");
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                rrw.a(rrw.this, (IDeviceidInterface) null);
                rrw.a(rrw.this, "Service onServiceDisconnected");
            }
        };
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        return this.f33344a.bindService(intent, this.e, 1) ? 1 : -1;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.f33344a == null) {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
        try {
            if (this.b == null) {
                return null;
            }
            return this.b.getOAID();
        } catch (RemoteException e) {
            a("getOAID error, RemoteException!");
            e.printStackTrace();
            return null;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            if (this.b == null) {
                return false;
            }
            return this.b.isSupport();
        } catch (RemoteException unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!d) {
        } else {
            Log.e(c, str);
        }
    }
}
