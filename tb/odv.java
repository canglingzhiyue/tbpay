package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.aidl.IFavContent;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;

/* loaded from: classes8.dex */
public class odv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static odv f31959a;
    private Context b;
    private int d;
    private long e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private IFavContentCallBack k;
    private IFavContent m;
    private boolean c = false;
    private int l = 0;
    private ServiceConnection n = new ServiceConnection() { // from class: tb.odv.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            } else {
                odv.a(odv.this, (IFavContent) null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            odv.a(odv.this, IFavContent.Stub.asInterface(iBinder));
            odv.a(odv.this, true);
            int a2 = odv.a(odv.this);
            if (a2 == 1) {
                if (odv.b(odv.this) == null) {
                    return;
                }
                try {
                    odv.b(odv.this).newIsFavoriteContent(odv.c(odv.this), odv.d(odv.this), odv.e(odv.this), odv.f(odv.this), odv.g(odv.this));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else if (a2 == 2) {
                if (odv.b(odv.this) == null) {
                    return;
                }
                try {
                    odv.b(odv.this).newAddFavoriteContent(odv.c(odv.this), odv.d(odv.this), odv.e(odv.this), odv.h(odv.this), odv.i(odv.this), odv.j(odv.this), odv.f(odv.this), odv.g(odv.this));
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            } else if (a2 != 3 || odv.b(odv.this) == null) {
            } else {
                try {
                    odv.b(odv.this).newDeleteFavoriteContent(odv.c(odv.this), odv.d(odv.this), odv.e(odv.this), odv.f(odv.this), odv.g(odv.this));
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                }
            }
        }
    };

    static {
        kge.a(428747986);
    }

    public static /* synthetic */ int a(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7b6adea", new Object[]{odvVar})).intValue() : odvVar.l;
    }

    public static /* synthetic */ IFavContent a(odv odvVar, IFavContent iFavContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFavContent) ipChange.ipc$dispatch("75085b7f", new Object[]{odvVar, iFavContent});
        }
        odvVar.m = iFavContent;
        return iFavContent;
    }

    public static /* synthetic */ boolean a(odv odvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff1fc3c1", new Object[]{odvVar, new Boolean(z)})).booleanValue();
        }
        odvVar.c = z;
        return z;
    }

    public static /* synthetic */ IFavContent b(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFavContent) ipChange.ipc$dispatch("68adc332", new Object[]{odvVar}) : odvVar.m;
    }

    public static /* synthetic */ int c(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4bcbaec", new Object[]{odvVar})).intValue() : odvVar.d;
    }

    public static /* synthetic */ long d(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c33fc16e", new Object[]{odvVar})).longValue() : odvVar.e;
    }

    public static /* synthetic */ String e(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3586c205", new Object[]{odvVar}) : odvVar.f;
    }

    public static /* synthetic */ boolean f(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a045ce80", new Object[]{odvVar})).booleanValue() : odvVar.j;
    }

    public static /* synthetic */ IFavContentCallBack g(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFavContentCallBack) ipChange.ipc$dispatch("72822268", new Object[]{odvVar}) : odvVar.k;
    }

    public static /* synthetic */ String h(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("378cc4e2", new Object[]{odvVar}) : odvVar.g;
    }

    public static /* synthetic */ String i(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38397081", new Object[]{odvVar}) : odvVar.h;
    }

    public static /* synthetic */ String j(odv odvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38e61c20", new Object[]{odvVar}) : odvVar.i;
    }

    public static odv a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odv) ipChange.ipc$dispatch("34c74105", new Object[]{context});
        }
        odv odvVar = f31959a;
        if (odvVar == null || odvVar.b == null) {
            f31959a = new odv(context);
        }
        return f31959a;
    }

    private odv(Context context) {
        this.b = context;
    }

    public void a(int i, long j, String str, String str2, String str3, String str4, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4542232", new Object[]{this, new Integer(i), new Long(j), str, str2, str3, str4, new Boolean(z), iFavContentCallBack});
        } else if (this.b == null) {
        } else {
            this.d = i;
            this.e = j;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
            this.j = z;
            this.k = iFavContentCallBack;
            this.l = 2;
            if (!this.c) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent, this.n, 1);
                return;
            }
            try {
                if (this.m != null) {
                    this.m.newAddFavoriteContent(i, j, str, str2, str3, str4, z, iFavContentCallBack);
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent2.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent2, this.n, 1);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void a(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d761090", new Object[]{this, new Integer(i), new Long(j), str, new Boolean(z), iFavContentCallBack});
        } else if (this.b == null) {
        } else {
            this.d = i;
            this.e = j;
            this.f = str;
            this.j = z;
            this.k = iFavContentCallBack;
            this.l = 3;
            if (!this.c) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent, this.n, 1);
                return;
            }
            try {
                if (this.m != null) {
                    this.m.newDeleteFavoriteContent(i, j, str, z, iFavContentCallBack);
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent2.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent2, this.n, 1);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void b(int i, long j, String str, boolean z, IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8d3def", new Object[]{this, new Integer(i), new Long(j), str, new Boolean(z), iFavContentCallBack});
        } else if (this.b == null) {
        } else {
            this.d = i;
            this.e = j;
            this.f = str;
            this.j = z;
            this.k = iFavContentCallBack;
            this.l = 1;
            if (!this.c) {
                Intent intent = new Intent();
                intent.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent, this.n, 1);
                return;
            }
            try {
                if (this.m != null) {
                    this.m.newIsFavoriteContent(i, j, str, z, iFavContentCallBack);
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setAction("com.taobao.tao.favorite.aidl.IFavContent");
                intent2.setPackage(this.b.getApplicationContext().getPackageName());
                this.b.bindService(intent2, this.n, 1);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.k = null;
    }
}
