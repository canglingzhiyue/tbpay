package com.taobao.pha.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.webview.IWVWebView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.uc.webview.export.WebView;
import java.util.Map;
import tb.kge;
import tb.ngi;
import tb.ngr;
import tb.nhw;

/* loaded from: classes7.dex */
public class PHAWVUCWebView extends PreRenderWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    public nhw filter;
    private AppController mAppController;
    private final Context mContext;
    private boolean mEnableShowErrorView;
    private boolean mIsProgessLoaded;
    public ngi mListener;
    private Handler mOutHandler;
    public long mPreloadPageFinishedLoad;
    public long mPreloadPageStartLoad;
    public long mPreloadStartLoad;
    public String mPreloadUrl;
    @Deprecated
    private ValueCallback<Uri> mUploadMsg;
    private ValueCallback<Uri[]> mUploadMsgAboveL;
    private Uri mUploadUriAboveL;

    public static /* synthetic */ Object ipc$super(PHAWVUCWebView pHAWVUCWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1253202540:
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            case -670282598:
                super.preRenderInit((String) objArr[0]);
                return null;
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String getData2H5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a93bcbda", new Object[]{this});
        }
        return null;
    }

    public void setData2H5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85413844", new Object[]{this, str});
        }
    }

    static {
        kge.a(1393999218);
        TAG = PHAWVUCWebView.class.getSimpleName();
    }

    public PHAWVUCWebView(Context context) {
        super(context);
        this.mPreloadStartLoad = SystemClock.uptimeMillis();
        this.mContext = context;
        init();
    }

    public PHAWVUCWebView(Context context, Map<String, String> map) {
        super(context, map);
        this.mPreloadStartLoad = SystemClock.uptimeMillis();
        this.mContext = context;
        init();
    }

    public void setEnableShowErrorView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbffa442", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mEnableShowErrorView = z;
        if (!z) {
            return;
        }
        setWvUIModel(new a(this.mContext, this));
    }

    public void setAppController(AppController appController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be974bf0", new Object[]{this, appController});
        } else {
            this.mAppController = appController;
        }
    }

    public static AppController getAppController(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppController) ipChange.ipc$dispatch("2e5c8312", new Object[]{iWVWebView});
        }
        if (!(iWVWebView instanceof PHAWVUCWebView)) {
            return null;
        }
        return ((PHAWVUCWebView) iWVWebView).mAppController;
    }

    public void setScrollListener(ngi ngiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fd874a", new Object[]{this, ngiVar});
        } else {
            this.mListener = ngiVar;
        }
    }

    @Override // android.taobao.windvane.extra.uc.preRender.PreRenderWebView
    public void preRenderInit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80c4c9a", new Object[]{this, str});
            return;
        }
        super.preRenderInit(str);
        this.mPreloadUrl = str;
        setWebViewClient(new WVUCWebViewClient(getContext()) { // from class: com.taobao.pha.webview.PHAWVUCWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                int hashCode = str2.hashCode();
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 534767588) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                } else {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str2, bitmap});
                    return;
                }
                PHAWVUCWebView.this.mPreloadPageStartLoad = SystemClock.uptimeMillis();
                super.onPageStarted(webView, str2, bitmap);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str2});
                    return;
                }
                super.onPageFinished(webView, str2);
                PHAWVUCWebView.this.mPreloadPageFinishedLoad = SystemClock.uptimeMillis();
                PHAWVUCWebView.this.fireEvent(BasePreInitManager.ONLOAD_EVENT);
            }
        });
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            setImportantForAccessibility(2);
        }
    }

    public boolean getProgessLoaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfbfd3a5", new Object[]{this})).booleanValue() : this.mIsProgessLoaded;
    }

    public void setProgessLoaded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af66d55f", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsProgessLoaded = z;
        }
    }

    @Deprecated
    public void setUploadMsg(ValueCallback<Uri> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621dae0b", new Object[]{this, valueCallback});
        } else {
            this.mUploadMsg = valueCallback;
        }
    }

    public void setUploadMsgAboveL(ValueCallback<Uri[]> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a3983a", new Object[]{this, valueCallback});
        } else {
            this.mUploadMsgAboveL = valueCallback;
        }
    }

    public void setUploadUriAboveL(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5cbf88", new Object[]{this, uri});
        } else {
            this.mUploadUriAboveL = uri;
        }
    }

    public Handler getOutHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a8b37e8d", new Object[]{this}) : this.mOutHandler;
    }

    public void setOutHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cba8255", new Object[]{this, handler});
        } else {
            this.mOutHandler = handler;
        }
    }

    public void setFilter(nhw nhwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb86c54", new Object[]{this, nhwVar});
        } else {
            this.filter = nhwVar;
        }
    }

    public nhw getUrlFilter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nhw) ipChange.ipc$dispatch("8e0a4e11", new Object[]{this}) : this.filter;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != 2688) {
            if (i != 7000 || intent == null) {
                return;
            }
            try {
                setDataOnActive(intent.getStringExtra("data"));
                return;
            } catch (Exception e) {
                ngr.b(TAG, e.getMessage());
                return;
            }
        }
        ValueCallback<Uri[]> valueCallback = this.mUploadMsgAboveL;
        if (valueCallback != null) {
            if (i2 != -1 || (uri = this.mUploadUriAboveL) == null) {
                this.mUploadMsgAboveL.onReceiveValue(null);
            } else {
                valueCallback.onReceiveValue(new Uri[]{uri});
            }
            this.mUploadMsgAboveL = null;
            this.mUploadUriAboveL = null;
        } else if (this.mUploadMsg == null) {
        } else {
            this.mUploadMsg.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
            this.mUploadMsg = null;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            ViewParent findViewParentIfNeeds = findViewParentIfNeeds(this);
            if (findViewParentIfNeeds instanceof ViewPager) {
                findViewParentIfNeeds.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        ViewParent findViewParentIfNeeds = findViewParentIfNeeds(this);
        if (findViewParentIfNeeds instanceof ViewPager) {
            findViewParentIfNeeds.requestDisallowInterceptTouchEvent(false);
        }
        if (this.mListener != null) {
            if (i2 < 0) {
                z2 = false;
                z3 = true;
            }
            this.mListener.a(i3, i4, z2, z3);
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    private ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        ViewParent parent = view.getParent();
        return (!(parent instanceof ViewPager) && (parent instanceof View)) ? findViewParentIfNeeds((View) parent) : parent;
    }
}
