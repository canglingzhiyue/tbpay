package anet.channel.status;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.HandoverSignalStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.base.cyclone.BSError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes2.dex */
public class HandoverSignalMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HandoverSignalMonitor";
    private static CopyOnWriteArraySet<HandoverSignalListener> listeners;
    private static Context mContext;
    private static PhoneStateListener mPhoneStateListener;
    private static TelephonyManager mTelephonyManager;
    private static int signalDBM;

    /* loaded from: classes2.dex */
    public interface HandoverSignalListener {
        void onServiceStateChanged(boolean z);

        void onSignalStrengthsChanged(int i, int i2);
    }

    private static int dueToGsmSignalCall(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23bfdc97", new Object[]{new Integer(i)})).intValue();
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return -2;
    }

    private static int dueToSignalLevelCall(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb1e3784", new Object[]{new Integer(i)})).intValue();
        }
        if (i >= 0 && i <= 5) {
            return i;
        }
        return -2;
    }

    public static /* synthetic */ int access$000(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddeb5a5f", new Object[]{new Integer(i)})).intValue() : dueToSignalLevelCall(i);
    }

    public static /* synthetic */ int access$102(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4936387c", new Object[]{new Integer(i)})).intValue();
        }
        signalDBM = i;
        return i;
    }

    public static /* synthetic */ int access$200(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adadb41d", new Object[]{new Integer(i)})).intValue() : dueToGsmSignalCall(i);
    }

    public static /* synthetic */ void access$300(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4db31a", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            onSignalChanged(i, i2);
        }
    }

    public static /* synthetic */ void access$400(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d704db9", new Object[]{new Boolean(z)});
        } else {
            onServiceChanged(z);
        }
    }

    public static /* synthetic */ CopyOnWriteArraySet access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("72fb0a0d", new Object[0]) : listeners;
    }

    static {
        kge.a(-982773711);
        mTelephonyManager = null;
        mPhoneStateListener = null;
        mContext = null;
        signalDBM = Integer.MIN_VALUE;
        listeners = new CopyOnWriteArraySet<>();
    }

    public static void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else if (!AwcnConfig.isHandoverSignalOpened()) {
        } else {
            handoverSignalListener(context);
        }
    }

    public static void registerHandoverSignalListener(HandoverSignalListener handoverSignalListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779ee186", new Object[]{handoverSignalListener});
        } else if (handoverSignalListener == null) {
        } else {
            listeners.add(handoverSignalListener);
        }
    }

    public static void unregisterHandoverSignalListener(HandoverSignalListener handoverSignalListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d800f9f", new Object[]{handoverSignalListener});
        } else {
            listeners.remove(handoverSignalListener);
        }
    }

    private static void handoverSignalListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e18d62", new Object[]{context});
            return;
        }
        final HandoverSignalStatistic handoverSignalStatistic = new HandoverSignalStatistic("handover_signal");
        try {
            mContext = context;
            if (mTelephonyManager == null) {
                if (mContext == null) {
                    Context context2 = GlobalAppRuntimeInfo.getContext();
                    mContext = context2;
                    if (context2 == null) {
                        return;
                    }
                }
                mTelephonyManager = (TelephonyManager) mContext.getSystemService("phone");
            }
            if (mPhoneStateListener == null) {
                mPhoneStateListener = new PhoneStateListener() { // from class: anet.channel.status.HandoverSignalMonitor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == -2058329889) {
                            super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
                            return null;
                        } else if (hashCode != 1850844796) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        } else {
                            super.onServiceStateChanged((ServiceState) objArr[0]);
                            return null;
                        }
                    }

                    @Override // android.telephony.PhoneStateListener
                    public void onSignalStrengthsChanged(final SignalStrength signalStrength) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("855060df", new Object[]{this, signalStrength});
                            return;
                        }
                        super.onSignalStrengthsChanged(signalStrength);
                        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.HandoverSignalMonitor.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                HandoverSignalStatistic.this.isSignalChanged = 1;
                                HandoverSignalStatistic.this.brand = Build.BRAND;
                                if (Build.VERSION.SDK_INT >= 23) {
                                    HandoverSignalStatistic.this.oriSignalLevel = signalStrength.getLevel();
                                    HandoverSignalStatistic.this.signalLevel = HandoverSignalMonitor.access$000(HandoverSignalStatistic.this.oriSignalLevel);
                                }
                                HandoverSignalStatistic.this.oriGsmSignalLevel = signalStrength.getGsmSignalStrength();
                                HandoverSignalMonitor.access$102((HandoverSignalStatistic.this.oriGsmSignalLevel * 2) + BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
                                HandoverSignalStatistic.this.gsmSignalLevel = HandoverSignalMonitor.access$200(HandoverSignalStatistic.this.oriGsmSignalLevel);
                                HandoverSignalMonitor.access$300(HandoverSignalStatistic.this.signalLevel, HandoverSignalStatistic.this.gsmSignalLevel);
                                ALog.e(HandoverSignalMonitor.TAG, "onSignalStrengthsChanged", null, "globalSignalLevel", Integer.valueOf(HandoverSignalStatistic.this.gsmSignalLevel));
                                AppMonitor.getInstance().commitStat(HandoverSignalStatistic.this);
                            }
                        });
                    }

                    @Override // android.telephony.PhoneStateListener
                    public void onServiceStateChanged(final ServiceState serviceState) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6e51a67c", new Object[]{this, serviceState});
                            return;
                        }
                        super.onServiceStateChanged(serviceState);
                        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.HandoverSignalMonitor.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                boolean z = false;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                HandoverSignalStatistic handoverSignalStatistic2 = new HandoverSignalStatistic("handover_signal_state");
                                handoverSignalStatistic2.handoverSignalState = 1;
                                handoverSignalStatistic2.brand = Build.BRAND;
                                if (serviceState.getState() == 0) {
                                    z = true;
                                }
                                int i = z ? 1 : 0;
                                int i2 = z ? 1 : 0;
                                handoverSignalStatistic2.isServiceState = i;
                                HandoverSignalMonitor.access$400(z);
                                AppMonitor.getInstance().commitStat(handoverSignalStatistic2);
                            }
                        });
                    }
                };
            }
            mTelephonyManager.listen(mPhoneStateListener, 257);
        } catch (Exception e) {
            handoverSignalStatistic.errorMsg = "handover_error";
            ALog.e(TAG, "handoverSignalListener fail, e=" + e.toString(), null, new Object[0]);
            AppMonitor.getInstance().commitStat(handoverSignalStatistic);
        }
    }

    private static void onServiceChanged(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894ff7ef", new Object[]{new Boolean(z)});
            return;
        }
        ALog.e(TAG, "onServiceStateChanged", null, "serviceState", Boolean.valueOf(z));
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.HandoverSignalMonitor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Iterator it = HandoverSignalMonitor.access$500().iterator();
                while (it.hasNext()) {
                    try {
                        ((HandoverSignalListener) it.next()).onServiceStateChanged(z);
                    } catch (Exception e) {
                        ALog.e(HandoverSignalMonitor.TAG, "onServiceChanged exception.", null, e, new Object[0]);
                    }
                }
            }
        });
    }

    private static void onSignalChanged(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7994b4", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.HandoverSignalMonitor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = HandoverSignalMonitor.access$500().iterator();
                    while (it.hasNext()) {
                        try {
                            ((HandoverSignalListener) it.next()).onSignalStrengthsChanged(i, i2);
                        } catch (Exception e) {
                            ALog.e(HandoverSignalMonitor.TAG, "onSignalChanged exception.", null, e, new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public static int signalDBM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5270e1", new Object[0])).intValue();
        }
        ALog.e(TAG, "[RUM] ", null, "signalDBM", Integer.valueOf(signalDBM));
        return signalDBM;
    }
}
