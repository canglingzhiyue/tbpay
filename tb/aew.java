package tb;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;

/* loaded from: classes2.dex */
public interface aew {
    boolean isNeedupdateURLRule(boolean z);

    boolean isOpenURLIntercept();

    boolean shouldOverrideUrlLoading(Context context, IWVWebView iWVWebView, String str);

    void updateURLRule();
}
