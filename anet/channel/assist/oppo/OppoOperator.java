package anet.channel.assist.oppo;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Pair;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.assist.ICapability;
import anet.channel.assist.IOperator;
import anet.channel.assist.WorkExecutor;
import anet.channel.assist.oppo.OppoOlkUnifyApi;
import anet.channel.assist.stat.RegisterStat;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.oplus.network.OlkManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class OppoOperator implements IOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AUTH_URI = "content://com.oplus.ocs.out.OpenCapabilityThirdProvider/oplus";
    private static final int CAP_DUAL_WIFI = 8;
    private static final int CAP_NET_BASE = 1;
    private static final int CAP_QOS_PRELOAD = 4;
    private static final int CAP_SOCKET_BOOST = 2;
    private static final int CAP_WIFI_FEATURE_STATE = 32;
    private static final int CAP_WIFI_QOS_MONITOR = 16;
    private static final String TAG = "anet.OppoAssist";
    private Context mContext;
    private boolean isValid = false;
    private Map<Integer, ICapability> supportCapabilities = new ConcurrentHashMap();
    private RegisterStat registerStat = new RegisterStat("oppo");
    private final Messenger authMessenger = new Messenger(new Handler(Looper.getMainLooper()) { // from class: anet.channel.assist.oppo.OppoOperator.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            final int i = message.getData().getInt("result_code");
            WorkExecutor.submitTask(new Runnable() { // from class: anet.channel.assist.oppo.OppoOperator.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        OppoOperator.access$000(OppoOperator.this, i);
                    }
                }
            });
        }
    });
    private final OppoOlkUnifyApi.ScoreCb scoreCb = new OppoOlkUnifyApi.ScoreCb() { // from class: anet.channel.assist.oppo.OppoOperator.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.assist.oppo.OppoOlkUnifyApi.ScoreCb
        public void onScoreChange(Network network, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("107ea0e8", new Object[]{this, network, new Integer(i)});
            } else {
                ALog.e(OppoOperator.TAG, "[onScoreChange]", null, "network", network, "score", Integer.valueOf(i));
            }
        }

        @Override // anet.channel.assist.oppo.OppoOlkUnifyApi.ScoreCb
        public void onPreLoadChange(boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7ebe373", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            } else {
                ALog.e(OppoOperator.TAG, "[onPreLoadChange]", null, "enable", Boolean.valueOf(z), "beforeEnter", Integer.valueOf(i), "beforeExit", Integer.valueOf(i2));
            }
        }
    };

    public static /* synthetic */ void access$000(OppoOperator oppoOperator, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1781f2a5", new Object[]{oppoOperator, new Integer(i)});
        } else {
            oppoOperator.handleAuthResult(i);
        }
    }

    @Override // anet.channel.assist.IOperator
    public void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
            return;
        }
        ALog.e(TAG, "init start.", null, new Object[0]);
        try {
            this.mContext = context;
            if (OlkManager.getInstance(context) == null) {
                ALog.e(TAG, "register error, olkManager is null", null, new Object[0]);
                throw new Exception("olkManager is null");
            }
            Bundle bundle = new Bundle();
            bundle.putBinder("callback", this.authMessenger.getBinder());
            context.getContentResolver().call(Uri.parse(AUTH_URI), "auth", "OLK_CLIENT", bundle);
        } catch (Throwable th) {
            this.registerStat.errorCode = -1;
            AppMonitor.getInstance().commitStat(this.registerStat);
            ALog.e(TAG, "register error", null, "msg", th.getMessage());
        }
    }

    private void handleAuthResult(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900ca74f", new Object[]{this, new Integer(i)});
            return;
        }
        boolean z = i == 1001;
        ALog.e(TAG, "[handleAuthResult]", null, "result_code", Integer.valueOf(i), "isAuthSuccess", Boolean.valueOf(z));
        if (!z) {
            this.registerStat.errorCode = i;
            return;
        }
        try {
            OppoOlkUnifyApi.registerCb(this.mContext, this.scoreCb);
            Pair<Integer, Integer> sysCapabilities = OppoOlkUnifyApi.getSysCapabilities(this.mContext);
            if (((Integer) sysCapabilities.first).intValue() != 0) {
                ALog.e(TAG, "getSysCapabilities failed.", null, new Object[0]);
                this.registerStat.errorCode = -3;
            } else {
                List<String> parseCapabilities = parseCapabilities(((Integer) sysCapabilities.second).intValue());
                ALog.e(TAG, "getSysCapabilities success.", null, "capabilities", parseCapabilities);
                this.isValid = true;
                this.registerStat.enable = 1;
                this.registerStat.capabilities = parseCapabilities.toString();
            }
        } catch (Throwable th) {
            try {
                this.registerStat.errorCode = -2;
                ALog.e(TAG, "[handleAuthResult] error", null, th, new Object[0]);
            } finally {
                AppMonitor.getInstance().commitStat(this.registerStat);
            }
        }
    }

    @Override // anet.channel.assist.IOperator
    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.isValid;
    }

    @Override // anet.channel.assist.IOperator
    public ICapability getCapability(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICapability) ipChange.ipc$dispatch("25bc8e05", new Object[]{this, new Integer(i)}) : this.supportCapabilities.get(Integer.valueOf(i));
    }

    private List<String> parseCapabilities(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("df3edaf4", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("CAP_NET_BASE");
            this.supportCapabilities.put(3, new OppoSysNetworkCapability());
        }
        if ((i & 2) != 0) {
            arrayList.add("CAP_SOCKET_BOOST");
            this.supportCapabilities.put(1, new OppoSocketBoostCapability());
        }
        if ((i & 4) != 0) {
            arrayList.add("CAP_QOS_PRELOAD");
        }
        if ((i & 8) != 0) {
            arrayList.add("CAP_DUAL_WIFI");
            this.supportCapabilities.put(2, new OppoDualWifiCapability());
        }
        if ((i & 16) != 0) {
            arrayList.add("CAP_WIFI_QOS_MONITOR");
        }
        if ((i & 32) != 0) {
            arrayList.add("CAP_WIFI_FEATURE_STATE");
        }
        return arrayList;
    }
}
