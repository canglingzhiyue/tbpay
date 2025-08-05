package com.uc.webview.internal.interfaces;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.print.PrintDocumentAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.extension.IBackForwardListListener;
import com.uc.webview.export.extension.ISoftKeyboardListener;
import com.uc.webview.export.extension.OnSoftKeyboardListener;
import com.uc.webview.export.extension.UCClient;
import com.uc.webview.export.extension.UCExtension;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IWebViewExtension extends IExtender, IPrerenderHandler, ITextSelectionExtension {
    public static final int CORE_STATUS_IS_SUPPORT_HEVC = 100;
    public static final int MATCH_URL_EXACTLY = 0;
    public static final int MATCH_URL_WITHOUT_PARAM_RETURN_ALL = 2;
    public static final int MATCH_URL_WITHOUT_PARAM_RETURN_FIRST = 1;
    public static final int MOVE_CURSOR_STEP_NEXT = 101;
    public static final int MOVE_CURSOR_STEP_PREV = 102;
    public static final String SNAPSHOT_BUNDLE_KEY_BITMAP = "bitmap";
    public static final String SNAPSHOT_BUNDLE_KEY_SUCCEED = "succeed";
    public static final int TYPE_PAGE_STORAGE_ALL = 2;
    public static final int TYPE_PAGE_STORAGE_MHTML = 3;
    public static final int TYPE_PAGE_STORAGE_ONLY_HTML = 0;
    public static final int TYPE_PAGE_STORAGE_PDF = 4;
    public static final int TYPE_PAGE_STORAGE_TEXT = 1;

    /* loaded from: classes9.dex */
    public interface IExtenderID {
        public static final int CREATE_CONTEXT_SNAPSHOT = 1;
        public static final int GET_DEVTOOLS = 2;
        public static final int IS_SUPPORT_WEBVIEW_COREDRAW = 3;
    }

    PrintDocumentAdapter createPrintDocumentAdapter(String str);

    void evaluateJavascriptInAllFrame(String str, ValueCallback<String> valueCallback);

    void evaluateJavascriptInIsolateContext(String str, ValueCallback<String> valueCallback);

    void forceUpdateTopControlsOffset(boolean z);

    String getBackUrl();

    boolean getCurrentPageFullSnapshot(Bitmap.Config config, int i, int i2, ValueCallback<Bitmap> valueCallback);

    boolean getCurrentPageFullSnapshot(Bitmap.Config config, ValueCallback<Bitmap> valueCallback);

    boolean getCurrentPageSnapshot(Rect rect, Rect rect2, Bitmap bitmap, boolean z, int i);

    boolean getDomSnapshot(String str, Bitmap.Config config, ValueCallback<Bitmap> valueCallback);

    String getForwardUrl();

    IPrerenderHandler getPrerenderHandler();

    IWebSettingsExtension getSettingsExtension();

    WebChromeClient getWebChromeClient();

    boolean isLoadFromCachedPage();

    boolean isMobileType();

    void loadRequest(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, byte[] bArr);

    void markTnStart(long j, int i);

    void notifyPreRenderLoadStart();

    void placeRenderView(ViewGroup viewGroup);

    void pruneForwardHistory();

    void removeImageInfoListener(IImageInfoListener iImageInfoListener);

    void requestImageByUrl(String str, int i, ValueCallback<Bundle> valueCallback);

    ISnapshotRequestResult requestSnapshot(int i, boolean z, boolean z2, Rect rect, Bitmap bitmap, ValueCallback<Bundle> valueCallback);

    @Override // com.uc.webview.internal.interfaces.IPrerenderHandler
    boolean requestSnapshot(String str, Bitmap bitmap);

    boolean saveWebPage(int i, boolean z, int i2, int i3, ValueCallback<byte[]> valueCallback);

    void serializeFirstScreenTimings(ValueCallback<String> valueCallback);

    void setBackForwardListListener(IBackForwardListListener iBackForwardListListener);

    void setClient(UCClient uCClient);

    void setEmbeddedTitleBar(View view);

    void setImageInfoListener(IImageInfoListener iImageInfoListener, int i, int i2, int i3, int i4);

    void setInjectJSProvider(UCExtension.InjectJSProvider injectJSProvider, int i);

    void setInputEnhanceControllerHeight(int i);

    void setIsPreRender(boolean z);

    void setSoftKeyboardListener(ISoftKeyboardListener iSoftKeyboardListener);

    void setSoftKeyboardListener(OnSoftKeyboardListener onSoftKeyboardListener);

    void setTopControls(View view);

    void setTopControlsHeight(int i);

    void setTopControlsListener(ITopControlsListener iTopControlsListener);
}
