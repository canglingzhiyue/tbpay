package android.taobao.windvane.extra.uc;

import android.taobao.windvane.util.p;
import android.webkit.ValueCallback;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.am;
import com.taobao.android.weex_framework.util.a;
import com.uc.webview.export.extension.Sdk2CoreHost;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.adj;
import tb.kge;

/* loaded from: classes2.dex */
public class UCCoreController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCCoreController";
    private static final AtomicBoolean sRegisteredThreadANRCallback;

    static {
        kge.a(-1392082841);
        sRegisteredThreadANRCallback = new AtomicBoolean(false);
    }

    public static void registerThreadANRCallback(final adj adjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("546d76ed", new Object[]{adjVar});
        } else if (!sRegisteredThreadANRCallback.compareAndSet(false, true)) {
        } else {
            adjVar.b("registerThreadANRCallback");
            Sdk2CoreHost.instance().setThreadNotRespondingCallback(new ValueCallback<Map<String, Object>>() { // from class: android.taobao.windvane.extra.uc.UCCoreController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc3b1331", new Object[]{this, map});
                        return;
                    }
                    try {
                        String str = "ThreadWatchdog get callback. pid: " + ((Integer) map.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).intValue() + ", tid: " + ((Integer) map.get("tid")).intValue() + ", threadName: " + ((String) map.get(am.THREAD_NAME)) + ", state: " + ((String) map.get("state")) + ", type: " + ((String) map.get("type")) + ", url: " + ((String) map.get("url")) + ", webviewCount: " + ((Integer) map.get("webviewCount")).intValue() + ", taskInfo: " + ((String) map.get("taskInfo")) + ", elapseInMs: " + ((Integer) map.get("elapseInMs")).intValue() + ", alarmInMs: " + ((Integer) map.get("alarmInMs")).intValue() + ", stack: " + ((String) map.get(a.ATOM_stack));
                        adj.this.b(str);
                        android.taobao.windvane.monitor.a.commitFail("ThreadWatchdog", 0, p.i((String) map.get("url")), str);
                    } catch (Throwable th) {
                        android.taobao.windvane.monitor.a.commitFail("ThreadWatchdog", 1, p.i((String) map.get("url")), "err:" + th + " StackTrace::" + android.taobao.windvane.util.a.a(th));
                    }
                }
            });
        }
    }
}
