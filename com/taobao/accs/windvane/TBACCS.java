package com.taobao.accs.windvane;

import android.content.Context;
import android.taobao.windvane.extra.jsbridge.WVACCS;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.base.AccsConnectStateListener2;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.m;
import com.taobao.android.behavix.feature.a;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.aranger.exception.IPCException;
import com.uc.webview.export.media.MessageID;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.nog;

/* loaded from: classes.dex */
public class TBACCS extends WVACCS {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBWVACCS";
    private static boolean connListenerRegistered = false;
    public static WeakReference<IWVWebView> mWeb = null;
    private static final String serviceClassName = "com.taobao.accs.windvane.BrowserACCSService";
    private static final String serviceIdDefault = "windvane";
    private AccsConnectStateListener2 connListener = new AccsConnectStateListener2() { // from class: com.taobao.accs.windvane.TBACCS.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.base.AccsConnectStateListener2
        public void onConnectFail(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bfd2647", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$000(TBACCS.this) == null || connectInfo == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("connected", false);
                jSONObject.put("err_code", connectInfo.errorCode);
                jSONObject.put("err_detail", connectInfo.errordetail);
                String jSONObject2 = jSONObject.toString();
                TBACCS.access$100(TBACCS.this).fireEvent("WV.Event.ACCS.OnConnectResult", jSONObject2);
                ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnConnectResult", "data", jSONObject2);
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "onConnectFail err", e, new Object[0]);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$200(TBACCS.this) == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("connected", true);
                String jSONObject2 = jSONObject.toString();
                TBACCS.access$300(TBACCS.this).fireEvent("WV.Event.ACCS.OnConnectResult", jSONObject2);
                ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnConnectResult", "data", jSONObject2);
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "onConnected err", e, new Object[0]);
            }
        }

        @Override // com.taobao.accs.base.AccsConnectStateListener2, com.taobao.accs.base.AccsConnectStateListener
        public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
                return;
            }
            try {
                if (TBACCS.access$400(TBACCS.this) == null) {
                    return;
                }
                TBACCS.access$500(TBACCS.this).fireEvent("WV.Event.ACCS.OnDisConnected", "{}");
                ALog.e(TBACCS.TAG, "WV.Event.ACCS.OnDisConnected", new Object[0]);
            } catch (Exception e) {
                ALog.e(TBACCS.TAG, "OnDisConnected err", e, new Object[0]);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(TBACCS tbaccs, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1126948911) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
    }

    public static /* synthetic */ IWVWebView access$000(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("1de8b4cb", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$100(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("c5648e8c", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$200(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("6ce0684d", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$300(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("145c420e", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$400(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("bbd81bcf", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    public static /* synthetic */ IWVWebView access$500(TBACCS tbaccs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("6353f590", new Object[]{tbaccs}) : tbaccs.mWebView;
    }

    static {
        kge.a(1861902907);
        connListenerRegistered = false;
        mWeb = null;
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        mWeb = new WeakReference<>(iWVWebView);
    }

    public static IWVWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWVWebView) ipChange.ipc$dispatch("a50a9e10", new Object[0]);
        }
        WeakReference<IWVWebView> weakReference = mWeb;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ALog.d(TAG, e.RECORD_EXECUTE, "action", str, "params", str2);
        if ("bindService".equals(str)) {
            bindService(wVCallBackContext, str2);
            return true;
        } else if ("isConnect".equals(str)) {
            isConnect(str2, wVCallBackContext);
            return true;
        } else if ("registerConnListener".equals(str)) {
            try {
                registerConnListener();
                wVCallBackContext.success();
            } catch (Exception e) {
                ALog.e(TAG, "registerConnListener err", e, new Object[0]);
            }
            return true;
        } else if ("isFeatureOpened".equals(str)) {
            return isFeatureOpened(str2, wVCallBackContext);
        } else {
            if ("getConnectionUnitInfo".equals(str)) {
                return getConnectionUnitInfo(str2, wVCallBackContext);
            }
            try {
                return super.execute(str, str2, wVCallBackContext);
            } catch (Throwable th) {
                ALog.e(TAG, "super.execute err", th, new Object[0]);
                return true;
            }
        }
    }

    private void isConnect(String str, WVCallBackContext wVCallBackContext) {
        String str2 = AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff05f3ae", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ALog.e(TAG, "isConnect()", "params", str);
        try {
            r rVar = new r();
            String str3 = null;
            try {
                if (!str2.equals(new JSONObject(str).optString("tag", ""))) {
                    str2 = "default";
                }
                str3 = str2;
            } catch (JSONException unused) {
                ALog.e(TAG, "isConnect json err", new Object[0]);
            }
            rVar.a("status", Boolean.valueOf(ACCSClient.getAccsClient(str3).isAccsConnected()));
            wVCallBackContext.success(rVar);
        } catch (Exception e) {
            ALog.e(TAG, "isConnect err", e, new Object[0]);
        }
    }

    private boolean isFeatureOpened(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe9ccb07", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            if ("accs_v2".equals(new JSONObject(str).optString(a.FEATURE_NAME, ""))) {
                rVar.a("status", Boolean.valueOf(m.b()));
            } else {
                rVar.a("status", (Object) true);
            }
        } catch (JSONException e) {
            ALog.e(TAG, "isFeatureOpened err", e, new Object[0]);
        }
        wVCallBackContext.success(rVar);
        return true;
    }

    private boolean getConnectionUnitInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8145f318", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            String optString = new JSONObject(str).optString("tag", "");
            if (!StringUtils.isEmpty(optString)) {
                rVar.a(nog.PRICE_UNIT, ACCSClient.getAccsClient(optString).getConnectionUnitInfo());
            }
        } catch (Throwable th) {
            ALog.e(TAG, "getConnectionUnitInfo err", th, new Object[0]);
        }
        wVCallBackContext.success(rVar);
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
            ALog.e(TAG, "bindService json err", new Object[0]);
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
        }
        if (StringUtils.isEmpty(str2)) {
            ALog.e(TAG, "bindService id empty", new Object[0]);
            wVCallBackContext.error(new r("HY_PARAM_ERR"));
            return;
        }
        ALog.e(TAG, "wv bindService", "serviceId", str2);
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
            ACCSManager.registerSerivce(this.mContext.getApplicationContext(), str2, serviceClassName);
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private synchronized void registerConnListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d63d4a", new Object[]{this});
            return;
        }
        if (!connListenerRegistered) {
            try {
                ACCSClient.getAccsClient().registerConnectStateListener(this.connListener);
                connListenerRegistered = true;
            } catch (AccsException e) {
                ALog.e(TAG, "registerConnListener err", e, new Object[0]);
            }
        }
    }

    @Override // android.taobao.windvane.extra.jsbridge.WVACCS, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ALog.e(TAG, MessageID.onDestroy, new Object[0]);
        super.onDestroy();
        if (!connListenerRegistered) {
            return;
        }
        try {
            ACCSClient.getAccsClient().unRegisterConnectStateListener(this.connListener);
            connListenerRegistered = false;
        } catch (Exception e) {
            ALog.e(TAG, "onDestroy err", e, new Object[0]);
        }
    }
}
