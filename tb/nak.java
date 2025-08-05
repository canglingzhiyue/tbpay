package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class nak extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nap f31356a;

    static {
        kge.a(2020453516);
    }

    public static /* synthetic */ Object ipc$super(nak nakVar, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public nak(nap napVar, Looper looper) {
        super(looper);
        this.f31356a = napVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        super.handleMessage(message);
        switch (message.what) {
            case 1001:
                try {
                    this.f31356a.c((String) message.obj);
                    return;
                } catch (JSONException e) {
                    TLog.logd("tmgcashier", "TMGCashierMSGCenter", "MSG_WHAT_FRESHPAGE" + e.getMessage());
                    return;
                }
            case 1002:
                this.f31356a.b();
                return;
            case 1003:
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    String string = jSONObject.getString("url");
                    if (jSONObject.has("isNewContainer") && jSONObject.getBoolean("isNewContainer")) {
                        this.f31356a.b(string);
                        return;
                    } else {
                        this.f31356a.a(string);
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 1004:
                try {
                    this.f31356a.d((String) message.obj);
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            case 1005:
                this.f31356a.a();
                return;
            case 1006:
                try {
                    this.f31356a.e((String) message.obj);
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 1007:
                this.f31356a.a((WVCallBackContext) message.obj);
                return;
            default:
                return;
        }
    }
}
