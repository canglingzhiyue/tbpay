package com.uc.webview.export.extension;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.devtools.DevTools;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import com.uc.webview.internal.stats.b;

/* loaded from: classes9.dex */
public class UCExtension {
    public static final int COORDINATE_BASE_MAIN_DOCUMENT = 1;
    public static final int COORDINATE_BASE_WEBVIEW = 0;
    @Deprecated(forRemoval = true, since = "u4 5.0")
    public static final int CORE_STATUS_CHILD_PROCESS_INFO = 2;
    @Deprecated(forRemoval = true, since = "u4 5.0")
    public static final int CORE_STATUS_PROCESS_MODE = 1;
    public static final int EXTEND_INPUT_TYPE_DIGIT = 16777216;
    public static final int EXTEND_INPUT_TYPE_IDCARD = 33554432;
    public static final int EXTEND_INPUT_TYPE_MASK = -16777216;
    public static final int LAYOUT_STYLE_ADAPT_SCREEN = 2;
    public static final int LAYOUT_STYLE_MOBILE_OPTIMUM = 4;
    public static final int LAYOUT_STYLE_ZOOM_OPTIMUM = 1;
    public static final String MOVE_CURSOR_KEY_NEXT_ENABLE = "next_enable";
    public static final String MOVE_CURSOR_KEY_PREVIOUS_ENABLE = "previous_enable";
    public static final String MOVE_CURSOR_KEY_SUCCEED = "succeed";
    public static final int PERFORMANCE_TIMINGS_DATAFORMAT_JSON = 1;
    public static final int PERFORMANCE_TIMINGS_DATAFORMAT_KEY_VALUE = 0;
    public static final int PERFORMANCE_TIMINGS_TYPE_FIRST_SCREEN = 2;
    public static final int PERFORMANCE_TIMINGS_TYPE_STARTUP = 1;
    private static final String TAG = "UCExtension";
    public static final int TYPE_PAGE_STORAGE_ALL = 2;
    public static final int TYPE_PAGE_STORAGE_MHTML = 3;
    public static final int TYPE_PAGE_STORAGE_ONLY_HTML = 0;
    public static final int TYPE_PAGE_STORAGE_PDF = 4;
    public static final int TYPE_PAGE_STORAGE_TEXT = 1;
    public static final int WEB_VIEW_TYPE_EMBEDDED = 1;
    public static final int WEB_VIEW_TYPE_HIDDEN = 5;
    public static final int WEB_VIEW_TYPE_HOME_PAGE = 2;
    public static final int WEB_VIEW_TYPE_NORMAL = 0;
    public static final int WEB_VIEW_TYPE_POPLAYER = 6;
    public static final int WEB_VIEW_TYPE_WEB_WINDOW_PAGE = 4;
    private IWebViewExtension mImpl;
    private PrerenderHandler mPrerenderHandler;
    private TextSelectionExtension mTextSelectionExtension;
    private UCSettings mUCSettings;

    /* loaded from: classes9.dex */
    public interface InjectJSProvider {
        public static final int TYPE_HEAD_START = 1;
        public static final int TYPE_HEAD_START_NODES = 16;

        String getJS(int i, String str);
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public interface OnSoftKeyboardListener {
        boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback);

        boolean hideSoftKeyboard();

        boolean onFinishComposingText();
    }

    /* loaded from: classes9.dex */
    public interface TnOptions {
        public static final int FIX_T1 = 1;
        public static final int FIX_URL = 2;
        public static final int NONE = 0;
    }

    public UCExtension(IWebView iWebView) {
        this.mImpl = iWebView.getExtension();
        this.mUCSettings = new UCSettings(this.mImpl.getSettingsExtension());
        this.mTextSelectionExtension = new TextSelectionExtension(this.mImpl);
        this.mPrerenderHandler = new PrerenderHandler(this.mImpl);
    }

    public void createContextSnapshot(ValueCallback<Boolean> valueCallback) {
        try {
            this.mImpl.invoke(1, new Object[]{valueCallback});
        } catch (Exception e) {
            Log.e("v8snapshot", "createContextSnapshot", e);
        }
    }

    public void evaluateJavascriptInAllFrame(String str, ValueCallback<String> valueCallback) {
        this.mImpl.evaluateJavascriptInAllFrame(str, valueCallback);
    }

    @Deprecated(forRemoval = true, since = "u4 5.0")
    public void getCoreStatus(int i, ValueCallback<Object> valueCallback) {
    }

    public boolean getCurrentPageFullSnapshot(Bitmap.Config config, int i, int i2, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getCurrentPageFullSnapshot(config, i, i2, valueCallback);
    }

    public boolean getCurrentPageFullSnapshot(Bitmap.Config config, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getCurrentPageFullSnapshot(config, -1, 20000, valueCallback);
    }

    public boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i) {
        return this.mImpl.getCurrentPageSnapshot(rect, rect2, bitmap, z, i);
    }

    public DevTools getDevTools() {
        try {
            return (DevTools) this.mImpl.invoke(2, new Object[0]);
        } catch (Exception e) {
            Log.e("u4 devtools", "getDevTools", e);
            return null;
        }
    }

    public boolean getDomSnapshot(String str, Bitmap.Config config, ValueCallback<Bitmap> valueCallback) {
        return this.mImpl.getDomSnapshot(str, config, valueCallback);
    }

    public PrerenderHandler getPrerenderHandler() {
        return this.mPrerenderHandler;
    }

    @Deprecated
    public void getStartupPerformanceStatistics(ValueCallback<String> valueCallback) {
        serializePerformanceTimings(3, 0, valueCallback);
    }

    public TextSelectionExtension getTextSelectionExtension() {
        return this.mTextSelectionExtension;
    }

    public UCSettings getUCSettings() {
        return this.mUCSettings;
    }

    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    public IWebViewExtension impl() {
        return this.mImpl;
    }

    public boolean isLoadFromCachedPage() {
        return this.mImpl.isLoadFromCachedPage();
    }

    public void markTnStart(long j, int i) {
        if (j < 0 || i < 0) {
            return;
        }
        this.mImpl.markTnStart(j, i);
    }

    public void notifyPreRenderLoadStart() {
        this.mImpl.notifyPreRenderLoadStart();
    }

    public boolean saveWebPage(int i, boolean z, int i2, int i3, ValueCallback<byte[]> valueCallback) {
        if (i == 4) {
            return this.mImpl.saveWebPage(i, z, i2, i3, valueCallback);
        }
        return false;
    }

    public void serializePerformanceTimings(int i, int i2, ValueCallback<String> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        b.a(i, i2, valueCallback, this);
    }

    public void setClient(UCClient uCClient) {
        this.mImpl.setClient(uCClient);
    }

    public void setInjectJSProvider(InjectJSProvider injectJSProvider, int i) {
        StringBuilder sb = new StringBuilder("UCExtension#setInjectJSProvider, type=");
        sb.append(i);
        sb.append(", provider=");
        sb.append(injectJSProvider != null ? injectJSProvider.hashCode() : -1);
        Log.i("U4_INJECT_JS", sb.toString());
        this.mImpl.setInjectJSProvider(injectJSProvider, i);
    }

    public void setIsPreRender(boolean z) {
        this.mImpl.setIsPreRender(z);
    }

    public void setSoftKeyboardListener(ISoftKeyboardListener iSoftKeyboardListener) {
        this.mImpl.setSoftKeyboardListener(iSoftKeyboardListener);
    }

    @Deprecated
    public void setSoftKeyboardListener(final com.uc.webview.export.extension.OnSoftKeyboardListener onSoftKeyboardListener) {
        setSoftKeyboardListener(new ISoftKeyboardListener() { // from class: com.uc.webview.export.extension.UCExtension.2
            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback) {
                return onSoftKeyboardListener.displaySoftKeyboard(str, i, valueCallback);
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean hideSoftKeyboard() {
                return onSoftKeyboardListener.hideSoftKeyboard();
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean onFinishComposingText() {
                return onSoftKeyboardListener.onFinishComposingText();
            }
        });
    }

    @Deprecated
    public void setSoftKeyboardListener(final OnSoftKeyboardListener onSoftKeyboardListener) {
        setSoftKeyboardListener(new ISoftKeyboardListener() { // from class: com.uc.webview.export.extension.UCExtension.1
            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean displaySoftKeyboard(String str, int i, ValueCallback<String> valueCallback) {
                return onSoftKeyboardListener.displaySoftKeyboard(str, i, valueCallback);
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean hideSoftKeyboard() {
                return onSoftKeyboardListener.hideSoftKeyboard();
            }

            @Override // com.uc.webview.export.extension.ISoftKeyboardListener
            public final boolean onFinishComposingText() {
                return onSoftKeyboardListener.onFinishComposingText();
            }
        });
    }
}
