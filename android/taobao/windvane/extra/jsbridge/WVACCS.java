package android.taobao.windvane.extra.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVACCS extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String serviceClassName = "android.taobao.windvane.extra.jsbridge.WVACCSService";
    private static final String serviceIdDefault = "windvane";
    public ArrayList<String> serviceIdList = new ArrayList<>();

    static {
        kge.a(913264843);
    }

    public static /* synthetic */ Object ipc$super(WVACCS wvaccs, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static class ACCSWVEventListener implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<IWVWebView> webview;

        static {
            kge.a(1728943396);
            kge.a(1845411121);
        }

        public ACCSWVEventListener(IWVWebView iWVWebView) {
            this.webview = new WeakReference<>(iWVWebView);
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            IWVWebView iWVWebView = this.webview.get();
            if (iWVWebView == null) {
                if (m.a()) {
                    m.e("ACCS", "webview is recycled");
                }
                return null;
            }
            switch (i) {
                case 5001:
                    String str = (String) objArr[0];
                    String str2 = new String((byte[]) objArr[1]);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("serviceId", str);
                        jSONObject.put("resultData", str2);
                        String jSONObject2 = jSONObject.toString();
                        iWVWebView.fireEvent("WV.Event.ACCS.OnData", jSONObject2);
                        if (m.a()) {
                            m.c("ACCS", jSONObject2);
                            break;
                        }
                    } catch (Throwable unused) {
                        break;
                    }
                    break;
                case 5002:
                    iWVWebView.fireEvent("WV.Event.ACCS.OnConnected", "{}");
                    if (m.a()) {
                        m.e("ACCS", "ACCS connect");
                        break;
                    }
                    break;
                case 5003:
                    iWVWebView.fireEvent("WV.Event.ACCS.OnDisConnected", "{}");
                    if (m.a()) {
                        m.e("ACCS", "ACCS disconnect");
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            aem.a().a(new ACCSWVEventListener(this.mWebView));
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bindService".equals(str)) {
            bindService(wVCallBackContext, str2);
        } else if ("unBindService".equals(str)) {
            unBindService(wVCallBackContext, str2);
        } else if ("setData".equals(str)) {
            setData(wVCallBackContext, str2);
        } else if (!"connectionState".equals(str)) {
            return false;
        } else {
            connectionState(wVCallBackContext, str2);
        }
        return true;
    }

    private void bindService(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58028cc6", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = null;
        try {
            str2 = new JSONObject(str).optString("serviceId", "");
        } catch (JSONException unused) {
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
        }
        if (TextUtils.isEmpty(str2)) {
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
            return;
        }
        if (this.serviceIdList == null) {
            try {
                this.serviceIdList = new ArrayList<>();
                this.serviceIdList.add("windvane");
                ACCSManager.registerSerivce(this.mContext.getApplicationContext(), "windvane", serviceClassName);
            } catch (Exception unused2) {
            }
        }
        if (this.serviceIdList.contains(str2)) {
            wVCallBackContext.success();
        } else if (this.mContext != null) {
            this.serviceIdList.add(str2);
            ACCSManager.registerSerivce(this.mContext.getApplicationContext(), "windvane", serviceClassName);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private void unBindService(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97a5fad", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = null;
        try {
            str2 = new JSONObject(str).optString("serviceId", "");
        } catch (JSONException unused) {
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
        }
        if (TextUtils.isEmpty(str2)) {
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
            return;
        }
        if (this.serviceIdList == null) {
            this.serviceIdList = new ArrayList<>();
        }
        if (!this.serviceIdList.contains(str2)) {
            wVCallBackContext.success();
        } else if (this.mContext != null) {
            this.serviceIdList.remove(str2);
            ACCSManager.unregisterService(this.mContext.getApplicationContext(), str2);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setData(android.taobao.windvane.jsbridge.WVCallBackContext r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.WVACCS.setData(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }

    private void connectionState(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af1f3a1", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        try {
            if (ACCSManager.getChannelState(this.mContext) == null) {
                rVar.a("status", "false");
                wVCallBackContext.error();
            }
        } catch (Exception unused) {
            rVar.a("status", "false");
            wVCallBackContext.error();
        }
        rVar.a("status", "true");
        wVCallBackContext.success(rVar);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.mContext != null && this.serviceIdList != null) {
            for (int i = 0; i < this.serviceIdList.size(); i++) {
                ACCSManager.unregisterService(this.mContext.getApplicationContext(), this.serviceIdList.get(i));
            }
            this.serviceIdList.clear();
            this.serviceIdList = null;
        }
        super.onDestroy();
    }
}
