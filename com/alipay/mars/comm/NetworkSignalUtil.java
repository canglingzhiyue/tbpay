package com.alipay.mars.comm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.alipay.bifrost.Bifrost;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkSignalUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "bifrost.NetworkSignalUtil";

    /* renamed from: a  reason: collision with root package name */
    private static long f5324a = 10000;
    private static Context b;
    private static HandlerThread c;

    public static long getNetworkSignalStrength(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("721f00a0", new Object[]{new Boolean(z)})).longValue();
        }
        return 0L;
    }

    public static long getWifiSignalStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a64f9ef", new Object[0])).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ void a(SignalStrength signalStrength) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad201b7", new Object[]{signalStrength});
        } else {
            b(signalStrength);
        }
    }

    public static void InitNetworkSignalUtil(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fea1d9", new Object[]{context});
            return;
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
                if (context == null) {
                    return;
                }
            } catch (Throwable th) {
                LogCatUtil.error("MNET", "NetworkSignalUtil: ", th);
                c = null;
                return;
            }
        }
        b = context;
        if (!Bifrost.getSwchmng().enableListenNetworkSignalStrength()) {
            LogCatUtil.warn(TAG, "do not listen network signal strength");
            return;
        }
        final TelephonyManager telephonyManager = (TelephonyManager) b.getSystemService("phone");
        synchronized (NetworkSignalUtil.class) {
            if (c != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("BifrostSignalThread");
            c = handlerThread;
            handlerThread.start();
            new Handler(c.getLooper()).post(new Runnable() { // from class: com.alipay.mars.comm.NetworkSignalUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        telephonyManager.listen(new PhoneStateListener() { // from class: com.alipay.mars.comm.NetworkSignalUtil.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(C01831 c01831, String str, Object... objArr) {
                                if (str.hashCode() == -2058329889) {
                                    super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
                                    return null;
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                            }

                            @Override // android.telephony.PhoneStateListener
                            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("855060df", new Object[]{this, signalStrength});
                                    return;
                                }
                                super.onSignalStrengthsChanged(signalStrength);
                                NetworkSignalUtil.a(signalStrength);
                            }
                        }, 256);
                    }
                }
            });
        }
    }

    public static long getGSMSignalStrength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b41102f", new Object[0])).longValue() : f5324a;
    }

    private static void b(SignalStrength signalStrength) {
        int cdmaDbm;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d2f8f8", new Object[]{signalStrength});
            return;
        }
        try {
            if (signalStrength.isGsm()) {
                cdmaDbm = signalStrength.getGsmSignalStrength();
            } else {
                cdmaDbm = (signalStrength.getCdmaDbm() + 113) / 2;
            }
            long j = 0;
            if (signalStrength.isGsm() && cdmaDbm == 99) {
                f5324a = 0L;
                return;
            }
            long j2 = cdmaDbm * 3.2258065f;
            f5324a = j2;
            long j3 = 100;
            if (j2 <= 100) {
                j3 = f5324a;
            }
            f5324a = j3;
            if (j3 >= 0) {
                j = f5324a;
            }
            f5324a = j;
        } catch (Throwable th) {
            LogCatUtil.error("bifrost", "calSignalStrength:", th);
        }
    }
}
