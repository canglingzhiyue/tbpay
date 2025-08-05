package com.taobao.android.lightvane.webview;

import android.content.Context;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gwo;
import tb.gwp;
import tb.kge;

/* loaded from: classes5.dex */
public class LVWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LVWebChromeClient";
    private Context context;

    static {
        kge.a(911409551);
    }

    public static /* synthetic */ Object ipc$super(LVWebChromeClient lVWebChromeClient, String str, Object... objArr) {
        if (str.hashCode() == -634514222) {
            return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LVWebChromeClient(Context context) {
        this.context = context;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        String message = consoleMessage.message();
        if (message != null && message.startsWith("lvNativeCallback")) {
            String substring = message.substring(message.indexOf("/") + 1);
            int indexOf = substring.indexOf("/");
            String substring2 = substring.substring(0, indexOf);
            String substring3 = substring.substring(indexOf + 1);
            ValueCallback<String> a2 = gwp.a(substring2);
            if (a2 != null) {
                a2.onReceiveValue(substring3);
                gwp.b(substring2);
            } else {
                gwo.a(TAG, "NativeCallback failed: " + substring3);
            }
            return true;
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
