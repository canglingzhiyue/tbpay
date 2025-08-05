package tb;

import android.util.Log;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.common.b;

/* loaded from: classes4.dex */
public class dpy implements b, dpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BridgeCallback b;
    private BaseEmbedView c;

    static {
        kge.a(232832036);
        kge.a(1746683331);
        kge.a(823402558);
    }

    public dpy(BaseEmbedView baseEmbedView, BridgeCallback bridgeCallback) {
        this.b = bridgeCallback;
        this.c = baseEmbedView;
    }

    @Override // tb.dpx
    public void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        BridgeCallback bridgeCallback = this.b;
        if (bridgeCallback == null) {
            return;
        }
        bridgeCallback.sendJSONResponse(jSONObject, z);
    }

    @Override // com.taobao.android.artry.common.b
    public void a(int i, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
        } else if (this.c == null) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject == null || !jSONObject.containsKey("download_progress_key")) {
                    str = null;
                } else {
                    str = jSONObject.getString("download_progress_key");
                    jSONObject2.put("key", (Object) str);
                }
                jSONObject2.put("progress", (Object) Integer.valueOf(i));
                a aVar = new a();
                this.c.sendEvent("progress", jSONObject2, aVar);
                aVar.a();
                String str2 = "the progress of downloading resource[" + str + "] is " + i + riy.MOD;
            } catch (Throwable th) {
                Log.e("MiniAPPResultSender", "some exceptions happened, when send progress...", th);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements IEmbedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f26901a;
        private boolean b;

        static {
            kge.a(1092293962);
            kge.a(1427173061);
        }

        private a() {
            this.f26901a = new Object();
            this.b = false;
        }

        @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
        public void onResponse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
                return;
            }
            synchronized (this.f26901a) {
                this.b = true;
                this.f26901a.notifyAll();
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            synchronized (this.f26901a) {
                try {
                    if (!this.b) {
                        this.f26901a.wait(1000L);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
