package android.taobao.windvane.extra.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.a;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import org.json.JSONException;
import tb.alo;
import tb.alq;
import tb.alu;
import tb.kge;

/* loaded from: classes2.dex */
public class WVMega extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private alu adapter;

    static {
        kge.a(913656139);
    }

    public static /* synthetic */ Object ipc$super(WVMega wVMega, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(WVMega wVMega, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb4aa34a", new Object[]{wVMega, str, wVCallBackContext})).booleanValue() : wVMega.callOnUIThread(str, wVCallBackContext);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (!(iWVWebView instanceof WVUCWebView)) {
            return;
        }
        this.adapter = ((WVUCWebView) iWVWebView).getAbilityHubAdapter();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"call".equals(str)) {
            return true;
        }
        return call(str2, wVCallBackContext);
    }

    private boolean call(final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2c1d830", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String str2 = wVCallBackContext.currentUrlFromAsyncChannel;
        if (StringUtils.isEmpty(str2)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return callOnUIThread(str, wVCallBackContext);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.WVMega.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVMega.access$000(WVMega.this, str, wVCallBackContext);
                    }
                }
            });
        } else {
            megaCall(str, wVCallBackContext, str2);
        }
        return true;
    }

    private boolean callOnUIThread(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39cdcb2d", new Object[]{this, str, wVCallBackContext})).booleanValue() : megaCall(str, wVCallBackContext, wVCallBackContext.getWebview().getUrl());
    }

    private boolean megaCall(String str, final WVCallBackContext wVCallBackContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ea90f8c", new Object[]{this, str, wVCallBackContext, str2})).booleanValue();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString(MUSMonitor.MODULE_DIM_ABILITY);
            String string2 = parseObject.getString("action");
            JSONObject jSONObject = parseObject.getJSONObject("options");
            alq alqVar = new alq();
            String str3 = null;
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview != null) {
                alqVar.a("url", str2);
                alqVar.a("pageId", wVCallBackContext.getPid());
                if (webview instanceof WVUCWebView) {
                    alqVar.a((View) ((WVUCWebView) webview));
                    str3 = ((WVUCWebView) webview).getWebViewContext().getCustomMegaBizId();
                }
            }
            if (j.commonConfig.da) {
                alqVar.a(a.a(str2, str3, this.mContext));
            }
            this.adapter.b(string, string2, alqVar, jSONObject, new alo() { // from class: android.taobao.windvane.extra.jsbridge.WVMega.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                        return;
                    }
                    if (executeResult.d() == 99) {
                        z = false;
                    }
                    r rVar = new r();
                    rVar.a(z);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("data", new org.json.JSONObject(executeResult.c()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    rVar.a(jSONObject2);
                    wVCallBackContext.onSuccess(rVar);
                }
            });
        } catch (Throwable th) {
            r rVar = new r();
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("data", a$a.c(th.getMessage()).c());
                rVar.a(jSONObject2);
                wVCallBackContext.error(rVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
