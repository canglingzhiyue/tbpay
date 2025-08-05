package com.mobile.auth;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class OOO0OO0 {
    private static OOO0OO0 O00000oo;
    private Network O000000o = null;
    private ConnectivityManager.NetworkCallback O00000Oo = null;
    private ConnectivityManager O00000o0 = null;
    private List<O000000o> O00000o = new ArrayList();
    private Timer O00000oO = null;

    /* loaded from: classes4.dex */
    public interface O000000o {
        void O000000o(boolean z, Object obj);
    }

    private OOO0OO0() {
    }

    static /* synthetic */ Network O000000o(OOO0OO0 ooo0oo0) {
        try {
            return ooo0oo0.O000000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    static /* synthetic */ Network O000000o(OOO0OO0 ooo0oo0, Network network) {
        try {
            ooo0oo0.O000000o = network;
            return network;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static OOO0OO0 O000000o() {
        try {
            if (O00000oo == null) {
                synchronized (OOO0OO0.class) {
                    if (O00000oo == null) {
                        O00000oo = new OOO0OO0();
                    }
                }
            }
            return O00000oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private synchronized void O000000o(O000000o o000000o) {
        try {
            this.O00000o.add(o000000o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void O000000o(OOO0OO0 ooo0oo0, boolean z, Network network) {
        try {
            ooo0oo0.O000000o(z, network);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    private synchronized void O000000o(boolean z, Network network) {
        try {
            if (this.O00000oO != null) {
                this.O00000oO.cancel();
                this.O00000oO = null;
            }
            for (O000000o o000000o : this.O00000o) {
                o000000o.O000000o(z, network);
            }
            this.O00000o.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ ConnectivityManager O00000Oo(OOO0OO0 ooo0oo0) {
        try {
            return ooo0oo0.O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public final synchronized void O000000o(Context context, O000000o o000000o) {
        if (this.O000000o != null) {
            o000000o.O000000o(true, this.O000000o);
            return;
        }
        O000000o(o000000o);
        if (this.O00000Oo != null && this.O00000o.size() >= 2) {
            return;
        }
        try {
            this.O00000o0 = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            NetworkRequest build = builder.build();
            this.O00000Oo = new ConnectivityManager.NetworkCallback() { // from class: com.mobile.auth.OOO0OO0.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
                    try {
                        super.onAvailable(network);
                        OOO0o0.O00000o0("Network onAvailable");
                        OOO0OO0.O000000o(OOO0OO0.this, network);
                        OOO0OO0.O000000o(OOO0OO0.this, true, network);
                        try {
                            String extraInfo = OOO0OO0.O00000Oo(OOO0OO0.this).getNetworkInfo(OOO0OO0.O000000o(OOO0OO0.this)).getExtraInfo();
                            if (TextUtils.isEmpty(extraInfo)) {
                                return;
                            }
                            OOO.O00000oO(extraInfo);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ExceptionProcessor.processException(th);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    try {
                        super.onLost(network);
                        OOO0o0.O00000o0("Network onLost");
                        OOO0OO0.this.O00000Oo();
                    } catch (Throwable th) {
                        ExceptionProcessor.processException(th);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onUnavailable() {
                    try {
                        super.onUnavailable();
                        OOO0o0.O00000o0("Network onUnavailable");
                        OOO0OO0.O000000o(OOO0OO0.this, false, null);
                        OOO0OO0.this.O00000Oo();
                    } catch (Throwable th) {
                        ExceptionProcessor.processException(th);
                    }
                }
            };
            int i = 3000;
            if (OOO.O0000O0o() < 3000) {
                i = 2000;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                this.O00000o0.requestNetwork(build, this.O00000Oo, i);
                return;
            }
            this.O00000oO = new Timer();
            this.O00000oO.schedule(new TimerTask() { // from class: com.mobile.auth.OOO0OO0.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
                        OOO0OO0.O000000o(OOO0OO0.this, false, null);
                    } catch (Throwable th) {
                        ExceptionProcessor.processException(th);
                    }
                }
            }, i);
            this.O00000o0.requestNetwork(build, this.O00000Oo);
        } catch (Exception e) {
            e.printStackTrace();
            O000000o(false, (Network) null);
        }
    }

    public final synchronized void O00000Oo() {
        try {
            if (this.O00000oO != null) {
                this.O00000oO.cancel();
                this.O00000oO = null;
            }
            if (Build.VERSION.SDK_INT >= 21 && this.O00000o0 != null && this.O00000Oo != null) {
                this.O00000o0.unregisterNetworkCallback(this.O00000Oo);
            }
            this.O00000o0 = null;
            this.O00000Oo = null;
            this.O000000o = null;
            this.O00000o.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
