package android.taobao.windvane.jsbridge.api;

import android.media.ToneGenerator;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVNotification extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVNotification";

    static {
        kge.a(-1167069480);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"beep".equals(str)) {
            return false;
        }
        beep(str2, wVCallBackContext);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.taobao.windvane.jsbridge.api.WVNotification$1] */
    public final void beep(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd10edfc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final int parseInt = Integer.parseInt(new JSONObject(str).optString("count"));
            new Thread(TAG) { // from class: android.taobao.windvane.jsbridge.api.WVNotification.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ToneGenerator toneGenerator = new ToneGenerator(1, 100);
                    for (int i = 0; i < parseInt; i++) {
                        toneGenerator.startTone(24);
                        try {
                            Thread.sleep(500L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    toneGenerator.stopTone();
                    toneGenerator.release();
                }
            }.start();
            wVCallBackContext.success("{}");
        } catch (JSONException unused) {
            m.e(TAG, "openWindow: param parse to JSON error, param=" + str);
            wVCallBackContext.error("param error");
        }
    }
}
