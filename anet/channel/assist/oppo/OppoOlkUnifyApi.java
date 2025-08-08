package anet.channel.assist.oppo;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.oplus.network.OlkManager;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Field;
import tb.sft;

/* loaded from: classes2.dex */
public class OppoOlkUnifyApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.OlkApi";
    private static OlkManager.IOlkCallback callback = new OlkManager.IOlkCallback() { // from class: anet.channel.assist.oppo.OppoOlkUnifyApi.1
        public void onChanged(Bundle bundle) {
            ALog.d(OppoOlkUnifyApi.TAG, "onChanged", null, new Object[0]);
            String string = bundle.getString(a.ATOM_function);
            if (string.equals("network_score")) {
                int i = bundle.getInt("score");
                ALog.d(OppoOlkUnifyApi.TAG, "onChanged", null, "score", Integer.valueOf(i), "better", Boolean.valueOf(bundle.getBoolean("better")));
                OppoOlkUnifyApi.access$000().onScoreChange((Network) bundle.getParcelable("network"), i);
            } else if (!string.equals("preload")) {
                ALog.d(OppoOlkUnifyApi.TAG, "unknown", null, a.ATOM_function, string);
            } else {
                boolean z = bundle.getBoolean("enable");
                int i2 = bundle.getInt("before_enter");
                int i3 = bundle.getInt("before_exit");
                ALog.d(OppoOlkUnifyApi.TAG, "preload", null, "return", Boolean.valueOf(z), "beforeEnter", Integer.valueOf(i2), "beforeExit", Integer.valueOf(i3));
                OppoOlkUnifyApi.access$000().onPreLoadChange(z, i2, i3);
            }
        }
    };
    private static ScoreCb mCb;

    /* loaded from: classes2.dex */
    public interface ScoreCb {
        void onPreLoadChange(boolean z, int i, int i2);

        void onScoreChange(Network network, int i);
    }

    public static /* synthetic */ ScoreCb access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScoreCb) ipChange.ipc$dispatch("8a7265a4", new Object[0]) : mCb;
    }

    public static Pair<Integer, Integer> getSysCapabilities(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e3575c9e", new Object[]{context});
        }
        try {
            context.getSystemService("connectivity");
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "getSysCapabilities");
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return new Pair<>(-1, 0);
            }
            return new Pair<>(Integer.valueOf(request.getInt("result", -1)), Integer.valueOf(request.getInt("capabilities")));
        } catch (Exception unused) {
            return new Pair<>(-1, 0);
        }
    }

    public static int setApState(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b0248a6", new Object[]{context, new Boolean(z)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("delay", z);
            bundle.putString(a.ATOM_function, "setApState");
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            ALog.d(TAG, "callAppState ", null, "result", Integer.valueOf(request.getInt("result")));
            return request.getInt("result");
        } catch (Exception e) {
            ALog.e(TAG, "exception:", null, e, new Object[0]);
            return -1;
        }
    }

    public static int setApBandwidth(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2835b5b4", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "setApBandwidth");
            bundle.putInt("rxBw", i);
            bundle.putInt("txBw", i2);
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            ALog.d(TAG, "setNeedBw", null, "result", Integer.valueOf(request.getInt("result")));
            return request.getInt("result");
        } catch (Exception e) {
            ALog.e(TAG, "exception", null, e, new Object[0]);
            return -1;
        }
    }

    public static int setSocketPriority(Context context, String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f98a353", new Object[]{context, str, new Integer(i), new Boolean(z), new Integer(i2)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "setSocketPriority");
            bundle.putString("dstip", str);
            bundle.putInt("dstport", i);
            bundle.putInt("protocol", z ? 6 : 17);
            if (i2 >= 0 && i2 <= 16) {
                bundle.putInt("priority", i2);
            }
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            ALog.d(TAG, "setSocketPriority", null, "result", Integer.valueOf(request.getInt("result")));
            return request.getInt("result");
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int clearSocketPriority(Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("767144ab", new Object[]{context, str, new Integer(i), new Boolean(z)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "clearSocketPriority");
            bundle.putString("dstip", str);
            bundle.putInt("dstport", i);
            bundle.putInt("protocol", z ? 6 : 17);
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            ALog.d(TAG, "clearSocketPriority", null, "result", Integer.valueOf(request.getInt("result")));
            return request.getInt("result");
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Pair<Integer, Pair<Network, Integer>> getNetworkQuality(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4326b72e", new Object[]{context, str});
        }
        try {
            ALog.d(TAG, "getNetworkQuality", null, DispatchConstants.NETWORK_ID, str);
            Network activeNetwork = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetwork();
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "getNetworkQuality");
            if (StringUtils.isEmpty(str)) {
                bundle.putParcelable("network", activeNetwork);
            } else {
                int parseInt = Integer.parseInt(str);
                setNetworkId(activeNetwork, parseInt);
                bundle.putParcelable("network", activeNetwork);
                ALog.d(TAG, "getNetworkQuality", null, "netid ", Integer.valueOf(parseInt));
            }
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return new Pair<>(-1, new Pair(activeNetwork, -1));
            }
            ALog.d(TAG, "getNetworkQuality", null, "network", (Network) request.getParcelable("network"), "result", Integer.valueOf(request.getInt("result")), "score", Integer.valueOf(request.getInt("score")));
            return new Pair<>(Integer.valueOf(request.getInt("result")), new Pair((Network) request.getParcelable("network"), Integer.valueOf(request.getInt("score"))));
        } catch (Exception e) {
            ALog.e(TAG, "exception", null, e, new Object[0]);
            return new Pair<>(-1, new Pair(null, -1));
        }
    }

    public static int setRealTimeEvent(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5cf47c2", new Object[]{context, new Integer(i)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "setRealTimeEvent");
            bundle.putInt("event", i);
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            ALog.d(TAG, "setRealTimeEvent", null, "result", Integer.valueOf(request.getInt("result")));
            return request.getInt("result");
        } catch (Exception unused) {
            return -1;
        }
    }

    public static void setNetworkId(Network network, int i) {
        try {
            Field declaredField = Network.class.getDeclaredField("netId");
            declaredField.setAccessible(true);
            declaredField.setInt(network, i);
        } catch (Exception unused) {
        }
    }

    public static int updateCellularEnable(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51347bfc", new Object[]{context, new Boolean(z)})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "updateCellularEnable");
            bundle.putBoolean("enable", z);
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            return request.getInt("result", -2);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean getDualStaEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8687d4", new Object[]{context})).booleanValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "getDualStaEnable");
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return false;
            }
            return request.getBoolean("isDualStaReady", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int requestDualSta(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34212abf", new Object[]{context})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "requestDualSta");
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            return request.getInt("result", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int releaseDualSta(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8480437", new Object[]{context})).intValue();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(a.ATOM_function, "releaseDualSta");
            Bundle request = OlkManager.getInstance(context).request(bundle);
            if (request == null) {
                ALog.d(TAG, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR, null, new Object[0]);
                return -1;
            }
            return request.getInt("result", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static void registerCb(Context context, ScoreCb scoreCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897cf2e4", new Object[]{context, scoreCb});
            return;
        }
        try {
            mCb = scoreCb;
            ALog.d(TAG, "registerCb", null, "result", Integer.valueOf(OlkManager.getInstance(context).registerCallback(3, callback)));
        } catch (Exception e) {
            ALog.e(TAG, "registerCb failed.", null, e, new Object[0]);
        }
    }
}
