package com.taobao.ptr.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.h;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class PtrWebView extends WebView implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final PtrBase.a defaultOnRefreshListener;
    private final WebChromeClient defaultWebChromeClient;
    private final WebViewClient defaultWebViewClient;
    private int lagThreshold;
    private PtrBase mParent;

    static {
        kge.a(1404679008);
        kge.a(-1419130634);
    }

    public static /* synthetic */ Object ipc$super(PtrWebView ptrWebView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    public static /* synthetic */ PtrBase access$000(PtrWebView ptrWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrBase) ipChange.ipc$dispatch("6a70ed50", new Object[]{ptrWebView}) : ptrWebView.mParent;
    }

    public PtrWebView(Context context) {
        super(context);
        this.defaultOnRefreshListener = new PtrBase.a() { // from class: com.taobao.ptr.views.PtrWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                } else {
                    PtrWebView.this.reload();
                }
            }
        };
        this.defaultWebChromeClient = new WebChromeClient() { // from class: com.taobao.ptr.views.PtrWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 384496945) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
                    return;
                }
                super.onProgressChanged(webView, i);
                if (i < 100 || PtrWebView.access$000(PtrWebView.this) == null) {
                    return;
                }
                PtrWebView.access$000(PtrWebView.this).refreshComplete(PtrWebView.this.getResources().getString(R.string.ptr_complete_label));
            }
        };
        this.defaultWebViewClient = new WebViewClient() { // from class: com.taobao.ptr.views.PtrWebView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -1517546125) {
                    super.onScaleChanged((WebView) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView webView, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a58c1573", new Object[]{this, webView, new Float(f), new Float(f2)});
                } else {
                    super.onScaleChanged(webView, f, f2);
                }
            }
        };
        init();
        removeDefaultJsInterface();
    }

    public PtrWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.defaultOnRefreshListener = new PtrBase.a() { // from class: com.taobao.ptr.views.PtrWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                } else {
                    PtrWebView.this.reload();
                }
            }
        };
        this.defaultWebChromeClient = new WebChromeClient() { // from class: com.taobao.ptr.views.PtrWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 384496945) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i)});
                    return;
                }
                super.onProgressChanged(webView, i);
                if (i < 100 || PtrWebView.access$000(PtrWebView.this) == null) {
                    return;
                }
                PtrWebView.access$000(PtrWebView.this).refreshComplete(PtrWebView.this.getResources().getString(R.string.ptr_complete_label));
            }
        };
        this.defaultWebViewClient = new WebViewClient() { // from class: com.taobao.ptr.views.PtrWebView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -1517546125) {
                    super.onScaleChanged((WebView) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView webView, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a58c1573", new Object[]{this, webView, new Float(f), new Float(f2)});
                } else {
                    super.onScaleChanged(webView, f, f2);
                }
            }
        };
        init();
        removeDefaultJsInterface();
    }

    public PtrWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defaultOnRefreshListener = new PtrBase.a() { // from class: com.taobao.ptr.views.PtrWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                } else {
                    PtrWebView.this.reload();
                }
            }
        };
        this.defaultWebChromeClient = new WebChromeClient() { // from class: com.taobao.ptr.views.PtrWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 384496945) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16eaf531", new Object[]{this, webView, new Integer(i2)});
                    return;
                }
                super.onProgressChanged(webView, i2);
                if (i2 < 100 || PtrWebView.access$000(PtrWebView.this) == null) {
                    return;
                }
                PtrWebView.access$000(PtrWebView.this).refreshComplete(PtrWebView.this.getResources().getString(R.string.ptr_complete_label));
            }
        };
        this.defaultWebViewClient = new WebViewClient() { // from class: com.taobao.ptr.views.PtrWebView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == -1517546125) {
                    super.onScaleChanged((WebView) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebViewClient
            public void onScaleChanged(WebView webView, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a58c1573", new Object[]{this, webView, new Float(f), new Float(f2)});
                } else {
                    super.onScaleChanged(webView, f, f2);
                }
            }
        };
        init();
        removeDefaultJsInterface();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setWebViewClient(this.defaultWebViewClient);
        setWebChromeClient(this.defaultWebChromeClient);
    }

    public void removeDefaultJsInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21888f9a", new Object[]{this});
            return;
        }
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibilityTraversal");
            removeJavascriptInterface("accessibility");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initPtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb67145", new Object[]{this});
            return;
        }
        PtrBase ptrBase = this.mParent;
        if (ptrBase == null) {
            return;
        }
        ptrBase.setOnRefreshListener(this.defaultOnRefreshListener);
    }

    public void setLagThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5267fc1", new Object[]{this, new Integer(i)});
        } else {
            this.lagThreshold = i;
        }
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : getScrollY() <= this.lagThreshold;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue() : ((float) (getScrollY() + this.lagThreshold)) >= ((float) Math.floor((double) (((float) getContentHeight()) * getScale()))) - ((float) getHeight());
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            this.mParent = (PtrBase) pullBase;
            initPtr();
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            this.mParent.setOnRefreshListener(null);
            this.mParent = null;
        }
    }
}
