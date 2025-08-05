package com.taobao.android.lightvane.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gwo;
import tb.kge;

/* loaded from: classes.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isAlive = true;
    public Context mContext;
    public com.taobao.android.lightvane.webview.a mWebView;
    public Object paramObj;

    static {
        kge.a(-978058096);
    }

    public abstract boolean execute(String str, String str2, d dVar);

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void initialize(Context context, com.taobao.android.lightvane.webview.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758ec61f", new Object[]{this, context, aVar});
            return;
        }
        this.mContext = context;
        this.mWebView = aVar;
    }

    public void initialize(Context context, com.taobao.android.lightvane.webview.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528f0c3b", new Object[]{this, context, aVar, obj});
            return;
        }
        initialize(context, aVar);
        this.paramObj = obj;
    }

    public void initialize(Context context, com.taobao.android.lightvane.webview.a aVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526dbd45", new Object[]{this, context, aVar, obj, str});
        } else {
            initialize(context, aVar, obj);
        }
    }

    public boolean executeSafe(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af76e757", new Object[]{this, str, str2, dVar})).booleanValue();
        }
        try {
            return execute(str, str2, dVar);
        } catch (Throwable th) {
            gwo.a(6, "LVJsBridge", Log.getStackTraceString(th));
            return false;
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.isAlive = false;
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.isAlive = false;
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.isAlive = true;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.mContext;
        return context instanceof MutableContextWrapper ? ((MutableContextWrapper) context).getBaseContext() : context;
    }
}
