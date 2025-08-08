package com.ali.user.mobile.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.io.File;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class NetworkUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = null;
    private static final int TIMEOUT_MS = 5000;
    private static ConnectivityManager sConnectivityManager;
    private static ConnectivityManager.NetworkCallback sNetworkCallback;
    private static Runnable sTimeoutRunnable;

    /* loaded from: classes2.dex */
    public interface IRequestBy4GCallback {
        void fail(String str);

        void success(String str);
    }

    public static /* synthetic */ Runnable access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("fae3e4bd", new Object[0]) : sTimeoutRunnable;
    }

    public static /* synthetic */ Runnable access$002(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e592e1bd", new Object[]{runnable});
        }
        sTimeoutRunnable = runnable;
        return runnable;
    }

    public static /* synthetic */ ConnectivityManager access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnectivityManager) ipChange.ipc$dispatch("6ac880a5", new Object[0]) : sConnectivityManager;
    }

    public static /* synthetic */ ConnectivityManager.NetworkCallback access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnectivityManager.NetworkCallback) ipChange.ipc$dispatch("e8a7ff7", new Object[0]) : sNetworkCallback;
    }

    public static boolean checkEnv(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc8080", new Object[]{context})).booleanValue() : hasSimCard(context) && !isAirModeEnable(context) && isMobileNetworkOpen(context);
    }

    public static boolean hasSimCard(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc8d37b8", new Object[]{context})).booleanValue() : ((TelephonyManager) context.getSystemService("phone")).getSimState() == 5;
    }

    public static boolean isAirModeEnable(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbfeb1ff", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1) {
                z = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    public static boolean isMobileNetworkOpen(Context context) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean isNetworkConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("614c23d0", new Object[0])).booleanValue();
        }
        try {
            return NetworkStatusHelper.isConnected();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static String getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connectivityManager == null) {
            return "none";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && NetworkInfo.State.CONNECTED == networkInfo.getState()) {
            return "wifi";
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null) {
            if (NetworkInfo.State.CONNECTED == networkInfo2.getState()) {
                return "gprs";
            }
        }
        return "none";
    }

    public static int getNetworkInfoType(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fa9cdf4", new Object[]{context})).intValue();
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "requestBy4G getNetworkInfoType error:", th);
        }
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() != 0) {
                if (activeNetworkInfo.getType() == 1) {
                    i = 2;
                }
            }
            String str = TAG;
            LoginTLogAdapter.e(str, "requestBy4G getNetworkInfoType type:" + i);
            return i;
        }
        i = 0;
        String str2 = TAG;
        LoginTLogAdapter.e(str2, "requestBy4G getNetworkInfoType type:" + i);
        return i;
    }

    public static boolean isWifiConnected(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c843cafb", new Object[]{context})).booleanValue() : getNetworkInfoType(context) == 2;
    }

    static {
        kge.a(1789113002);
        TAG = "login.util";
    }

    public static boolean isSuEnable() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b89fada", new Object[0])).booleanValue();
        }
        try {
            for (String str : new String[]{"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/sd/xbin/su"}) {
                File file = new File(str + "su");
                if (file.exists() && file.canExecute()) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void requestBy4G(Context context, final String str, final IRequestBy4GCallback iRequestBy4GCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b42992", new Object[]{context, str, iRequestBy4GCallback});
            return;
        }
        String str2 = TAG;
        LoginTLogAdapter.e(str2, "requestBy4G request:" + str);
        if (StringUtils.isEmpty(str)) {
            LoginTLogAdapter.e(TAG, "url is null");
            ThreadHelper.getInstance().executeInUI(new Runnable() { // from class: com.ali.user.mobile.utils.NetworkUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IRequestBy4GCallback iRequestBy4GCallback2 = IRequestBy4GCallback.this;
                    if (iRequestBy4GCallback2 == null) {
                        return;
                    }
                    iRequestBy4GCallback2.fail("url is null");
                }
            });
            return;
        }
        try {
            sConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
            sNetworkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.ali.user.mobile.utils.NetworkUtil.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                    int hashCode = str3.hashCode();
                    if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode != 2071672155) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                    } else {
                        super.onLost((Network) objArr[0]);
                        return null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:67:0x014b A[Catch: Exception -> 0x0159, TryCatch #3 {Exception -> 0x0159, blocks: (B:65:0x0142, B:67:0x014b, B:69:0x0150, B:71:0x0155), top: B:76:0x0142 }] */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0150 A[Catch: Exception -> 0x0159, TryCatch #3 {Exception -> 0x0159, blocks: (B:65:0x0142, B:67:0x014b, B:69:0x0150, B:71:0x0155), top: B:76:0x0142 }] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[Catch: Exception -> 0x0159, TRY_LEAVE, TryCatch #3 {Exception -> 0x0159, blocks: (B:65:0x0142, B:67:0x014b, B:69:0x0150, B:71:0x0155), top: B:76:0x0142 }] */
                @Override // android.net.ConnectivityManager.NetworkCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onAvailable(android.net.Network r9) {
                    /*
                        Method dump skipped, instructions count: 352
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.utils.NetworkUtil.AnonymousClass2.onAvailable(android.net.Network):void");
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    handleError("requestBy4G request onLost");
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("390e04f8", new Object[]{this});
                        return;
                    }
                    super.onUnavailable();
                    handleError("requestBy4G request onUnavailable");
                }

                private void handleError(final String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b2533751", new Object[]{this, str3});
                        return;
                    }
                    LoginTLogAdapter.e(NetworkUtil.TAG, str3);
                    if (NetworkUtil.access$000() != null) {
                        ThreadHelper.getInstance().removeBgCallbacks(NetworkUtil.access$000());
                        NetworkUtil.access$002(null);
                    }
                    ThreadHelper.getInstance().executeInUI(new Runnable() { // from class: com.ali.user.mobile.utils.NetworkUtil.2.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (iRequestBy4GCallback == null) {
                            } else {
                                iRequestBy4GCallback.fail(str3);
                            }
                        }
                    });
                    NetworkUtil.access$100().unregisterNetworkCallback(this);
                }
            };
            if (Build.VERSION.SDK_INT >= 26) {
                LoginTLogAdapter.e(TAG, "requestBy4G start");
                sConnectivityManager.requestNetwork(build, sNetworkCallback, 5000);
                return;
            }
            sTimeoutRunnable = new Runnable() { // from class: com.ali.user.mobile.utils.NetworkUtil.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LoginTLogAdapter.e(NetworkUtil.TAG, "requestBy4G handler timeout");
                        ThreadHelper.getInstance().executeInUI(new Runnable() { // from class: com.ali.user.mobile.utils.NetworkUtil.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (IRequestBy4GCallback.this == null) {
                                } else {
                                    IRequestBy4GCallback.this.fail("requestBy4G handler timeout");
                                }
                            }
                        });
                        if (NetworkUtil.access$100() == null || NetworkUtil.access$200() == null) {
                            return;
                        }
                        NetworkUtil.access$100().unregisterNetworkCallback(NetworkUtil.access$200());
                    } catch (Exception e) {
                        LoginTLogAdapter.e(NetworkUtil.TAG, "requestBy4G handler error", e);
                    }
                }
            };
            LoginTLogAdapter.e(TAG, "requestBy4G handler start");
            ThreadHelper.getInstance().executeDelayedInBg(5000L, sTimeoutRunnable);
            sConnectivityManager.requestNetwork(build, sNetworkCallback);
        } catch (Exception unused) {
            String str3 = TAG;
            LoginTLogAdapter.e(str3, "requestBy4G error:" + str);
            if (sTimeoutRunnable == null) {
                return;
            }
            ThreadHelper.getInstance().removeBgCallbacks(sTimeoutRunnable);
            sTimeoutRunnable = null;
        }
    }
}
