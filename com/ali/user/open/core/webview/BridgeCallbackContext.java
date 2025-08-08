package com.ali.user.open.core.webview;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.webkit.WebView;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.service.MemberExecutorService;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class BridgeCallbackContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int requestId;
    public WebView webView;

    static {
        kge.a(-1696080389);
    }

    public static /* synthetic */ String access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str}) : formatJsonString(str);
    }

    public static /* synthetic */ void access$100(BridgeCallbackContext bridgeCallbackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742ae716", new Object[]{bridgeCallbackContext, str});
        } else {
            bridgeCallbackContext.callback(str);
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : (Activity) this.webView.getContext();
    }

    public void success(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else {
            ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.core.webview.BridgeCallbackContext.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BridgeCallbackContext.access$100(BridgeCallbackContext.this, StringUtils.isEmpty(str) ? String.format("javascript:window.HavanaBridge.onSuccess(%s);", Integer.valueOf(BridgeCallbackContext.this.requestId)) : String.format("javascript:window.HavanaBridge.onSuccess(%s,'%s');", Integer.valueOf(BridgeCallbackContext.this.requestId), BridgeCallbackContext.access$000(str)));
                    }
                }
            });
        }
    }

    public void onFailure(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            onFailure(jSONObject.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void onFailure(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
        } else {
            ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.core.webview.BridgeCallbackContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BridgeCallbackContext.access$100(BridgeCallbackContext.this, StringUtils.isEmpty(str) ? String.format("javascript:window.HavanaBridge.onFailure(%s,'');", Integer.valueOf(BridgeCallbackContext.this.requestId)) : String.format("javascript:window.HavanaBridge.onFailure(%s,'%s');", Integer.valueOf(BridgeCallbackContext.this.requestId), BridgeCallbackContext.access$000(str)));
                    }
                }
            });
        }
    }

    private void callback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1da916", new Object[]{this, str});
            return;
        }
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.getSettings().setSavePassword(false);
        this.webView.loadUrl(str);
    }

    private static String formatJsonString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6f939bf", new Object[]{str}) : str.replace("\\", "\\\\");
    }
}
