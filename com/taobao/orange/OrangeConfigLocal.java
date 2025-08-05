package com.taobao.orange;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.aidl.OrangeConfigListenerStub;
import com.taobao.orange.util.OLog;
import java.util.List;
import java.util.Map;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class OrangeConfigLocal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OrangeConfigLocal";
    private static OrangeConfigLocal mInstance;

    static {
        kge.a(1828438445);
        mInstance = new OrangeConfigLocal();
    }

    private OrangeConfigLocal() {
    }

    @Deprecated
    public static OrangeConfigLocal getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrangeConfigLocal) ipChange.ipc$dispatch("92ae936", new Object[0]) : mInstance;
    }

    @Deprecated
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            init(context, null, null);
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72712a5", new Object[]{this, context, str, str2});
        } else {
            init(context, str, str2, OConstant.ENV.ONLINE.getEnvMode());
        }
    }

    @Deprecated
    public void init(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbbb4fe", new Object[]{this, context, str, str2, new Integer(i)});
            return;
        }
        OLog.e(TAG, "OrangeConfigLocal.init", "@Deprecated please use OrangeConfig");
        if (context == null) {
            return;
        }
        a.b = com.taobao.orange.util.a.a(context);
    }

    @Deprecated
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3}) : !a.b ? str3 : ConfigCenter.getInstance().getConfig(str, str2, str3);
    }

    @Deprecated
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        if (a.b) {
            return ConfigCenter.getInstance().getConfigs(str);
        }
        return null;
    }

    @Deprecated
    public void registerListener(String[] strArr, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f34e08", new Object[]{this, strArr, fVar});
        } else if (strArr != null && strArr.length != 0 && fVar != null) {
            for (String str : strArr) {
                ConfigCenter.getInstance().registerListener(str, new OrangeConfigListenerStub(fVar), true);
            }
        }
    }

    @Deprecated
    public void registerListener(String[] strArr, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f3c267", new Object[]{this, strArr, gVar});
        } else if (strArr != null && strArr.length != 0 && gVar != null) {
            for (String str : strArr) {
                ConfigCenter.getInstance().registerListener(str, new OrangeConfigListenerStub(gVar), true);
            }
        }
    }

    @Deprecated
    public void unregisterListener(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca95a28", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                ConfigCenter.getInstance().unregisterListeners(str);
            }
        }
    }

    @Deprecated
    public void enterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1a8d42", new Object[]{this});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.forceCheckUpdate", "@Deprecated please use OrangeConfig");
        }
    }

    @Deprecated
    public void enterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436c8bad", new Object[]{this});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.enterBackground", "@Deprecated please use OrangeConfig");
        }
    }

    @Deprecated
    public void setIndexUpdateMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722e0920", new Object[]{this, new Integer(i)});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.setIndexUpdateMode", "@Deprecated please use OrangeConfig");
        }
    }

    @Deprecated
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.setUserId", "@Deprecated please use OrangeConfig");
        }
    }

    @Deprecated
    public void setHosts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6450581", new Object[]{this, list});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.setHosts", "@Deprecated please use OrangeConfig");
        }
    }

    @Deprecated
    public void setAppSecret(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6199740", new Object[]{this, str});
        } else {
            OLog.e(TAG, "OrangeConfigLocal.setAppSecret", "@Deprecated please use OrangeConfig");
        }
    }
}
