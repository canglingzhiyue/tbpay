package com.taobao.android.tb3dspaceprocessor.web;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class HybridWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HybridWebView";

    public static /* synthetic */ Object ipc$super(HybridWebView hybridWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode != -1185152872) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.addJavascriptInterface(objArr[0], (String) objArr[1]);
            return null;
        }
    }

    public HybridWebView(Context context) {
        super(context);
        init();
    }

    public HybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        clearCache();
        setBackgroundColor(0);
        getSettings().setJavaScriptEnabled(true);
        removeJavascriptInterface("searchBoxJavaBridge_");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        } else if ("accessibility".equals(str) || "accessibilityTraversal".equals(str)) {
        } else {
            super.addJavascriptInterface(obj, str);
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.context = null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : super.onTouchEvent(motionEvent);
    }
}
