package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;

/* loaded from: classes4.dex */
public class O0OOO00 {
    private static O0OOO00 O000000o;
    private ConnectivityManager O00000Oo;
    private ConnectivityManager.NetworkCallback O00000o;
    private Network O00000o0;
    private boolean O00000oO;

    /* loaded from: classes4.dex */
    public interface O000000o {
        void O000000o(Network network);
    }

    private O0OOO00(Context context) {
        try {
            this.O00000Oo = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static O0OOO00 O000000o(Context context) {
        if (O000000o == null) {
            synchronized (O0OOO00.class) {
                if (O000000o == null) {
                    O000000o = new O0OOO00(context);
                }
            }
        }
        return O000000o;
    }

    public synchronized void O000000o(final O000000o o000000o) {
        NetworkInfo networkInfo;
        if (this.O00000Oo == null) {
            O0O000o.O000000o("WifiNetworkUtils", "mConnectivityManager 为空");
            o000000o.O000000o(null);
        } else if (this.O00000o0 != null && !this.O00000oO && (networkInfo = this.O00000Oo.getNetworkInfo(this.O00000o0)) != null && networkInfo.isAvailable()) {
            O0O000o.O000000o("HttpUtils", "reuse network: ");
            o000000o.O000000o(this.O00000o0);
        } else {
            if (this.O00000o != null) {
                try {
                    this.O00000Oo.unregisterNetworkCallback(this.O00000o);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.O00000o = null;
                }
                O0O000o.O000000o("HttpUtils", "clear: ");
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            this.O00000o = new ConnectivityManager.NetworkCallback() { // from class: com.mobile.auth.O0OOO00.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    try {
                        if (O0OOO00.this.O00000Oo.getNetworkCapabilities(network).hasTransport(0)) {
                            O0OOO00.this.O00000o0 = network;
                            o000000o.O000000o(network);
                            O0OOO00.this.O00000oO = false;
                            return;
                        }
                        O0O000o.O000000o("WifiNetworkUtils", "切换失败，未开启数据网络");
                        O0OOO00.this.O00000o0 = null;
                        o000000o.O000000o(null);
                        O0OOO00.this.O00000Oo.unregisterNetworkCallback(O0OOO00.this.O00000o);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        O0OOO00.this.O00000o0 = null;
                        o000000o.O000000o(null);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    O0OOO00.this.O00000oO = true;
                }
            };
            try {
                this.O00000Oo.requestNetwork(build, this.O00000o);
            } catch (Exception e2) {
                e2.printStackTrace();
                o000000o.O000000o(null);
            }
        }
    }

    public boolean O000000o() {
        return Build.VERSION.SDK_INT >= 21 && this.O00000o0 != null;
    }

    public synchronized void O00000Oo() {
        if (this.O00000Oo == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.O00000o == null) {
                    return;
                }
                O0O000o.O00000Oo("WifiNetworkUtils", "unregisterNetwork");
                this.O00000Oo.unregisterNetworkCallback(this.O00000o);
                this.O00000o = null;
                this.O00000o0 = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
