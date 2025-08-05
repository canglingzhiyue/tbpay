package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import com.taobao.highway.config.a;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class kti implements kth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1466726403);
        kge.a(-108070077);
    }

    public kti() {
        ktj.a();
    }

    @Override // tb.kth
    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09697e0", new Object[]{this, str, jSONObject, str2, str3});
        } else {
            a(str, ktk.a(str), jSONObject, str2, str3);
        }
    }

    @Override // tb.kth
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3502d8cc", new Object[]{this, str, jSONObject});
        } else {
            a(str, false, jSONObject, "EMPTY_SOL", "EMPTY_TRI");
        }
    }

    public void a(String str, boolean z, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2cdd30", new Object[]{this, str, new Boolean(z), jSONObject, str2, str3});
            return;
        }
        try {
            b(str, z, jSONObject, str2, str3);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "send event: doSendEvent error");
        }
    }

    private void b(String str, boolean z, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa63331", new Object[]{this, str, new Boolean(z), jSONObject, str2, str3});
        } else if (!a.a().c() || !a.a().d()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else if (jSONObject == null) {
                Log.e("HighwayClientImpl", "sendEvent: param is null");
            } else {
                DataHighwayNative.a(str, jSONObject, Boolean.valueOf(z), str2, str3);
            }
        }
    }

    @Override // tb.kth
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            c(str);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendBatchEvents: doSendBatchEvents error");
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!a.a().c() || !a.a().d()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else {
                DataHighwayNative.a(str);
            }
        }
    }

    @Override // tb.kth
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            b(str, null);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendSceneEvents: doSendSceneEvents error");
        }
    }

    @Override // tb.kth
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            b(str, str2);
        } catch (Throwable unused) {
            Log.e("HighwayClientImpl", "sendSceneEvents: doSendSceneEvents error");
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!a.a().c() || !a.a().d()) {
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.e("HighwayClientImpl", "sendEvent: name is empty");
            } else {
                DataHighwayNative.a(str, str2);
            }
        }
    }
}
