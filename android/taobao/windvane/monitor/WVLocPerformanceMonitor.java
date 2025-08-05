package android.taobao.windvane.monitor;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.kge;

/* loaded from: classes2.dex */
public class WVLocPerformanceMonitor implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APP_STATUS = 1;
    public static final int LOADURL_STATUS = 3;
    private static String TAG = null;
    public static final int WEBVIEW_STATUS = 2;
    private static WVLocPerformanceMonitor instance;
    private static boolean isOpenLocPerformanceMonitor;
    private HashMap<String, Object> monitorData;
    public float cpu_app = 0.0f;
    public float mem_app = 0.0f;
    public float cpu_webview = 0.0f;
    public float mem_webview = 0.0f;
    private long time_webview_start = 0;
    private long time_webview = 0;
    public float cpu_loadurl = 0.0f;
    public float mem_loadurl = 0.0f;
    private long time_load_start = 0;
    private long time_load = 0;
    private boolean isInit = false;

    static {
        kge.a(1322401490);
        kge.a(1845411121);
        TAG = WVLocPerformanceMonitor.class.getSimpleName();
        isOpenLocPerformanceMonitor = false;
        instance = null;
    }

    public static WVLocPerformanceMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVLocPerformanceMonitor) ipChange.ipc$dispatch("8c1f3cb1", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVLocPerformanceMonitor.class) {
                instance = new WVLocPerformanceMonitor();
            }
        }
        return instance;
    }

    public void setCpuAndMemery(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8bcea", new Object[]{this, context, new Integer(i)});
        } else if (!isOpenLocPerformanceMonitor()) {
            android.taobao.windvane.util.m.b(TAG, "非debug状态，不开启性能数据采集模式");
        } else {
            if (i == 1) {
                this.cpu_app = 0.0f;
                this.mem_app = 0.0f;
            } else if (i == 2) {
                this.cpu_webview = 0.0f;
                this.mem_webview = 0.0f;
            } else if (i == 3) {
                this.cpu_loadurl = 0.0f;
                this.mem_loadurl = 0.0f;
            }
            this.isInit = true;
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.cpu_app = 0.0f;
        this.mem_app = 0.0f;
        this.cpu_webview = 0.0f;
        this.mem_webview = 0.0f;
        this.time_webview = 0L;
        this.cpu_loadurl = 0.0f;
        this.mem_loadurl = 0.0f;
        this.time_load = 0L;
        this.isInit = false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.isInit) {
            try {
                String jSONString = JSON.toJSONString(getInstance());
                String str = TAG;
                android.taobao.windvane.util.m.b(str, ResponseProtocolType.DATA + jSONString);
                return jSONString;
            } catch (Exception e) {
                e.printStackTrace();
                String str2 = TAG;
                android.taobao.windvane.util.m.b(str2, "性能数据采集失败，json解析异常 json 解析异常：" + e.getMessage());
                return null;
            }
        }
        android.taobao.windvane.util.m.b(TAG, "性能数据未初始化");
        return null;
    }

    public HashMap<String, Object> getMonitorData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("61276a98", new Object[]{this}) : this.monitorData;
    }

    public void setMonitorData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400ed2a", new Object[]{this, hashMap});
            return;
        }
        this.monitorData = hashMap;
        setCpuAndMemery(android.taobao.windvane.config.a.f, 3);
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (3009 == i) {
            setCpuAndMemery(android.taobao.windvane.config.a.f, 1);
            return null;
        } else if (3008 == i) {
            this.time_webview_start = System.currentTimeMillis();
            return null;
        } else if (3010 == i) {
            this.time_load_start = System.currentTimeMillis();
            this.time_webview = this.time_load_start - this.time_webview_start;
            setCpuAndMemery(android.taobao.windvane.config.a.f, 2);
            return null;
        } else if (1001 == i) {
            this.time_load_start = System.currentTimeMillis();
            return null;
        } else if (1002 != i) {
            return null;
        } else {
            try {
                this.time_load = System.currentTimeMillis() - this.time_load_start;
                setCpuAndMemery(android.taobao.windvane.config.a.f, 3);
                IWVWebView.JsbridgeHis.clear();
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static boolean isOpenLocPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57da9c1", new Object[0])).booleanValue() : isOpenLocPerformanceMonitor;
    }

    public static void setOpenLocPerformanceMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26497def", new Object[]{new Boolean(z)});
        } else {
            isOpenLocPerformanceMonitor = z;
        }
    }
}
