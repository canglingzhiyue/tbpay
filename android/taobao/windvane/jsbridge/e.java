package android.taobao.windvane.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.taobao.windvane.extra.performance2.IPerformance;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_MULTI_PICK_PHOTO = 4003;
    public static final int REQUEST_PICK_PHONE = 4003;
    public static final int REQUEST_PICK_PHONE_WITHOUT_PERMISSION = 4004;
    public static final int REQUEST_PICK_PHOTO = 4002;
    public static final int REQUEST_TAKE_PHOTO = 4001;
    public boolean isAlive = true;
    public Context mContext;
    public IWVWebView mWebView;
    public Object paramObj;
    public IPerformance performance;

    static {
        kge.a(1429012245);
    }

    public abstract boolean execute(String str, String str2, WVCallBackContext wVCallBackContext);

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

    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mContext = context;
        this.mWebView = iWVWebView;
    }

    @Deprecated
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7f251", new Object[]{this, context, iWVWebView, obj});
        } else {
            initialize(context, iWVWebView);
        }
    }

    public void initialize(Context context, IWVWebView iWVWebView, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823d89db", new Object[]{this, context, iWVWebView, obj, str});
        } else {
            initialize(context, iWVWebView, obj);
        }
    }

    public void initialize(Context context, IPerformance iPerformance, IWVWebView iWVWebView, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4f7569", new Object[]{this, context, iPerformance, iWVWebView, obj, str});
            return;
        }
        this.paramObj = obj;
        this.performance = iPerformance;
        initialize(context, iWVWebView, obj, str);
    }

    public boolean executeSafe(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50c537e", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            return execute(str, str2, wVCallBackContext);
        } catch (Throwable th) {
            android.taobao.windvane.util.m.e("WVJsBridge", android.taobao.windvane.util.a.a(th));
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
