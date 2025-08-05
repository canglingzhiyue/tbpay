package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.ResourceManager;
import com.taobao.android.artry.tblife.WVARCameraView;
import com.taobao.android.artry.utils.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dqe;
import tb.kge;

/* loaded from: classes4.dex */
public class BaseWVApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DOWNLOAD_RESOURCE = "downloadResources";
    private static final String IS_SUPPORT = "isSupport";
    public static final String RESOURCE_LIST_KEY = "resourceList";
    public static final String RESULT_CODE = "resultCode";
    private static final String TAG = "BaseWVApiPlugin";
    private static final String WV_PLUGIN_NAME = "ARTry";
    private static final String WV_PLUGIN_SKIN_ANALYSIS = "ARSkinAnalysis";
    private static Map<String, b> mWVActionListenerMap;
    private static BaseWVApiPlugin sInstance;

    static {
        kge.a(1012661410);
    }

    public static /* synthetic */ Object ipc$super(BaseWVApiPlugin baseWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private BaseWVApiPlugin() {
    }

    public static void addWVActionListener(IWVWebView iWVWebView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd26bdd", new Object[]{iWVWebView, bVar});
        } else if (iWVWebView == null || bVar == null) {
        } else {
            if (mWVActionListenerMap == null) {
                mWVActionListenerMap = new HashMap();
                sInstance = new BaseWVApiPlugin();
                q.a(WV_PLUGIN_NAME, sInstance);
                q.a(WV_PLUGIN_SKIN_ANALYSIS, sInstance);
                q.a(WVARCameraView.AR_CAMERA_WV_PLUGIN_TYPE, sInstance);
            }
            Map<String, b> map = mWVActionListenerMap;
            map.put(iWVWebView.hashCode() + "", bVar);
        }
    }

    public static void removeWVActionListener(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ab4df8", new Object[]{iWVWebView});
        } else if (iWVWebView == null || d.a(mWVActionListenerMap)) {
        } else {
            Map<String, b> map = mWVActionListenerMap;
            map.remove(iWVWebView.hashCode() + "");
            if (!d.a(mWVActionListenerMap)) {
                return;
            }
            q.b(WV_PLUGIN_NAME);
            q.b(WV_PLUGIN_SKIN_ANALYSIS);
            q.b(WVARCameraView.AR_CAMERA_WV_PLUGIN_TYPE);
            mWVActionListenerMap = null;
            sInstance = null;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IWVWebView webview;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, DOWNLOAD_RESOURCE)) {
            try {
                downloadResource(this.mContext, d.b(str2), wVCallBackContext);
            } catch (Throwable th) {
                Log.e(TAG, "failed to invoke the downloadResource..." + th);
            }
            return true;
        } else if (TextUtils.equals(str, IS_SUPPORT)) {
            try {
                JSONObject a2 = c.a(false, d.b(str2));
                r rVar = new r("HY_SUCCESS");
                rVar.a(d.a(a2));
                invokeWVCallbackSafety(true, rVar, wVCallBackContext);
            } catch (Throwable th2) {
                Log.e(TAG, "failed to invoke the downloadResource..." + th2);
            }
            return true;
        } else {
            if (wVCallBackContext != null && (webview = wVCallBackContext.getWebview()) != null) {
                String str3 = webview.hashCode() + "";
                if (!d.a(mWVActionListenerMap) && mWVActionListenerMap.containsKey(str3)) {
                    try {
                        b bVar = mWVActionListenerMap.get(str3);
                        if (bVar != null) {
                            return bVar.onAction(str, str2, wVCallBackContext);
                        }
                    } catch (Throwable th3) {
                        Log.e(TAG, "failed to invoke the IWVActionListener..." + th3);
                    }
                }
            }
            return false;
        }
    }

    private void downloadResource(Context context, JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8864c2e2", new Object[]{this, context, jSONObject, wVCallBackContext});
            return;
        }
        JSONArray jSONArray = null;
        String string = jSONObject == null ? null : jSONObject.getString("bizCode");
        if (jSONObject != null) {
            jSONArray = jSONObject.getJSONArray(RESOURCE_LIST_KEY);
        }
        if (TextUtils.isEmpty(string) || d.a(jSONArray)) {
            r rVar = new r("HY_FAILED");
            rVar.a("resultCode", ResultCode.FAILURE_INVALIDATE_PARAM.name());
            invokeWVCallbackSafety(false, rVar, wVCallBackContext);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                String obj = next.toString();
                if (d.a(obj) && !arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        ResourceManager.a().a(context);
        ResourceManager.a().a(string, arrayList);
        r rVar2 = new r("HY_SUCCESS");
        rVar2.a("resultCode", ResultCode.SUCCESS.name());
        invokeWVCallbackSafety(true, rVar2, wVCallBackContext);
    }

    public static void invokeWVCallbackSafety(boolean z, r rVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70abe092", new Object[]{new Boolean(z), rVar, wVCallBackContext});
        } else {
            new a(z, rVar, wVCallBackContext).run();
        }
    }

    public static void fireWVEventSafety(String str, String str2, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da4aaf6", new Object[]{str, str2, iWVWebView});
        } else {
            new a(str, str2, iWVWebView).run();
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f9052a;
        private r b;
        private WVCallBackContext c;
        private String d;
        private String e;
        private IWVWebView f;

        static {
            kge.a(787144387);
            kge.a(-1390502639);
        }

        private a(boolean z, r rVar, WVCallBackContext wVCallBackContext) {
            this.f9052a = z;
            this.b = rVar;
            this.c = wVCallBackContext;
        }

        private a(String str, String str2, IWVWebView iWVWebView) {
            this.d = str;
            this.e = str2;
            this.f = iWVWebView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (d.a()) {
                try {
                    if (this.c != null && this.b != null) {
                        if (this.f9052a) {
                            this.c.success(this.b);
                        } else {
                            this.c.error(this.b);
                        }
                    }
                    if (this.f == null || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) {
                        return;
                    }
                    WVCallBackContext.fireEvent(this.f, this.d, this.e);
                } catch (Throwable th) {
                    Log.e(BaseWVApiPlugin.TAG, "failed to invoke wv call back..." + th);
                }
            } else {
                dqe.a().post(this);
            }
        }
    }
}
