package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.tao.favorite.aidl.IFavContent;
import com.taobao.tao.favorite.aidl.IFavContentCallBack;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class odw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "com.taobao.tao.mytaobao.FavoriteContent";

    static {
        kge.a(-958367852);
    }

    public static /* synthetic */ void a(IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1389817", new Object[]{iFavContentCallBack});
        } else {
            b(iFavContentCallBack);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.odw$1] */
    public static void a(final Activity activity, final Bundle bundle, final IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a54c09", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            b(iFavContentCallBack);
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.odw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IFavContent iFavContent;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        iFavContent = (IFavContent) Services.get((Context) activity, (Class<IInterface>) IFavContent.class);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    if (iFavContent == null) {
                        odw.a(iFavContentCallBack);
                        return null;
                    }
                    iFavContent.addFavContent(bundle, iFavContentCallBack);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.odw$2] */
    public static void b(final Activity activity, final Bundle bundle, final IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72713e8", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            b(iFavContentCallBack);
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.odw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IFavContent iFavContent;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        iFavContent = (IFavContent) Services.get((Context) activity, (Class<IInterface>) IFavContent.class);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    if (iFavContent == null) {
                        odw.a(iFavContentCallBack);
                        return null;
                    }
                    iFavContent.deleteFavContent(bundle, iFavContentCallBack);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.odw$3] */
    public static void c(final Activity activity, final Bundle bundle, final IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a8dbc7", new Object[]{activity, bundle, iFavContentCallBack});
        } else if (activity == null) {
            b(iFavContentCallBack);
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.odw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IFavContent iFavContent;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    try {
                        iFavContent = (IFavContent) Services.get((Context) activity, (Class<IInterface>) IFavContent.class);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    if (iFavContent == null) {
                        odw.a(iFavContentCallBack);
                        return null;
                    }
                    iFavContent.isFavContent(bundle, iFavContentCallBack);
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    private static void b(IFavContentCallBack iFavContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8ced58", new Object[]{iFavContentCallBack});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("com.taobao.tao.mytaobao.favContent.result", "fail");
            iFavContentCallBack.onResult(hashMap);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
