package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class OOO0oO {
    public static boolean O000000o(Context context, String str) {
        try {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return false;
                }
                NetworkInfo.State state = connectivityManager.getNetworkInfo(5).getState();
                OOO0o0.O00000o0("TYPE_MOBILE_HIPRI network state: ".concat(String.valueOf(state)));
                if (state.compareTo(NetworkInfo.State.CONNECTED) != 0 && state.compareTo(NetworkInfo.State.CONNECTING) != 0) {
                    Method method = ConnectivityManager.class.getMethod("startUsingNetworkFeature", Integer.TYPE, String.class);
                    method.setAccessible(true);
                    int intValue = ((Integer) method.invoke(connectivityManager, 0, "enableHIPRI")).intValue();
                    OOO0o0.O00000o0("startUsingNetworkFeature for enableHIPRI result: ".concat(String.valueOf(intValue)));
                    if (-1 == intValue) {
                        OOO0o0.O00000o0("Wrong result of startUsingNetworkFeature, maybe problems");
                        return false;
                    } else if (intValue == 0) {
                        OOO0o0.O00000o0("No need to perform additional network settings");
                        return true;
                    } else {
                        int O00000Oo = OOOO00O.O00000Oo(str);
                        if (-1 == O00000Oo) {
                            OOO0o0.O00000o0("Wrong host address transformation, result was -1");
                            return false;
                        }
                        for (int i = 0; i < 5; i++) {
                            try {
                                if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                                    break;
                                }
                                Thread.sleep(500L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                                return false;
                            }
                        }
                        Method method2 = ConnectivityManager.class.getMethod("requestRouteToHost", Integer.TYPE, Integer.TYPE);
                        method2.setAccessible(true);
                        boolean booleanValue = ((Boolean) method2.invoke(connectivityManager, 5, Integer.valueOf(O00000Oo))).booleanValue();
                        OOO0o0.O00000o0("requestRouteToHost result: ".concat(String.valueOf(booleanValue)));
                        return booleanValue;
                    }
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }
}
