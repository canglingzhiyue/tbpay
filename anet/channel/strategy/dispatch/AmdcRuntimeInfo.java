package anet.channel.strategy.dispatch;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class AmdcRuntimeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AmdcRuntimeInfo";
    private static volatile int amdcLimitLevel;
    private static volatile long amdcLimitTime;
    public static volatile String appChannel;
    public static volatile String appName;
    public static volatile String appVersion;
    private static volatile Context context;
    private static volatile List<String> controlList;
    private static volatile int controlMode;
    private static IAmdcSign iSign;
    public static volatile double latitude;
    public static volatile double longitude;
    private static Map<String, String> params;
    private static volatile boolean updateModeEnable;

    /* loaded from: classes2.dex */
    public interface ControlMode {
        public static final int CONTROL_MODE_BLACK = 2;
        public static final int CONTROL_MODE_NONE = 0;
        public static final int CONTROL_MODE_WHITE = 1;
    }

    static {
        kge.a(-268552541);
        amdcLimitLevel = 0;
        amdcLimitTime = 0L;
        iSign = null;
        latitude = mto.a.GEO_NOT_SUPPORT;
        longitude = mto.a.GEO_NOT_SUPPORT;
        appChannel = null;
        appName = null;
        appVersion = null;
        params = null;
        controlMode = 0;
        updateModeEnable = false;
    }

    public static void updateAmdcLimit(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c127ee", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        ALog.i(TAG, "set amdc limit", null, "level", Integer.valueOf(i), "time", Integer.valueOf(i2));
        if (i < 0 || i > 3) {
            return;
        }
        amdcLimitLevel = i;
        amdcLimitTime = System.currentTimeMillis() + (i2 * 1000);
    }

    public static int getAmdcLimitLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3c0b904", new Object[0])).intValue();
        }
        if (amdcLimitLevel > 0 && System.currentTimeMillis() - amdcLimitTime > 0) {
            amdcLimitTime = 0L;
            amdcLimitLevel = 0;
        }
        return amdcLimitLevel;
    }

    public static void setContext(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context2});
        } else {
            context = context2;
        }
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[0]) : context;
    }

    public static void setSign(IAmdcSign iAmdcSign) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7905ddc", new Object[]{iAmdcSign});
            return;
        }
        ALog.e(TAG, "amdc set sign！1", null, new Object[0]);
        iSign = iAmdcSign;
    }

    public static IAmdcSign getSign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAmdcSign) ipChange.ipc$dispatch("949a5ff2", new Object[0]) : iSign;
    }

    public static void updateLocation(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f423ba5", new Object[]{new Double(d), new Double(d2)});
            return;
        }
        latitude = d;
        longitude = d2;
    }

    public static void setAppInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f388bc92", new Object[]{str, str2, str3});
            return;
        }
        appName = str;
        appVersion = str2;
        appChannel = str3;
    }

    public static synchronized void setParam(String str, String str2) {
        synchronized (AmdcRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc6ab466", new Object[]{str, str2});
                return;
            }
            if (params == null) {
                params = new HashMap();
            }
            params.put(str, str2);
        }
    }

    public static synchronized Map<String, String> getParams() {
        synchronized (AmdcRuntimeInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f10013f8", new Object[0]);
            } else if (params == null) {
                return Collections.EMPTY_MAP;
            } else {
                return new HashMap(params);
            }
        }
    }

    public static void setControlMode(int i, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c95942f", new Object[]{new Integer(i), list});
        } else if ((i != 1 && i != 2) || list == null || list.isEmpty()) {
            controlMode = 0;
            ALog.e(TAG, "[setControlMode]", null, "mode", Integer.valueOf(controlMode));
        } else {
            controlMode = i;
            controlList = new ArrayList(list);
            ALog.e(TAG, "[setControlMode]", null, "mode", Integer.valueOf(controlMode), "list", controlList);
        }
    }

    public static boolean isAllowAmdcRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a630317a", new Object[]{str})).booleanValue();
        }
        if (controlMode != 0 && controlList != null && !controlList.isEmpty() && !StringUtils.isEmpty(str)) {
            if (controlMode == 1) {
                return controlList.contains(str);
            }
            return controlMode != 2 || !controlList.contains(str);
        }
        return true;
    }

    public static boolean isUpdateModeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd965004", new Object[0])).booleanValue() : updateModeEnable;
    }

    public static void setUpdateModeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a6e69c", new Object[]{new Boolean(z)});
        } else {
            updateModeEnable = z;
        }
    }
}
