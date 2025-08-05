package com.uc.webview.export.extension;

import android.net.http.SslError;
import android.util.SparseBooleanArray;
import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class UCClient implements IExtender {
    public static final int FORM_PROMPT_TYPE_COVER = 1;
    public static final int FORM_PROMPT_TYPE_SAVE = 0;
    public static final String PLUGIN_ENABLE_STATUS = "ENABLE_STATUS";
    public static final String PLUGIN_MIME_TYPE = "MIME_TYPE";
    public static final String PLUGIN_PROMPT_VERIFY = "PROMPT_VERIFY";
    public static final String PLUGIN_SIGNATURE = "SIGNATURE";
    public static final int PLUGIN_VERIFY_RESULT_OK = 0;
    public static final String PLUGIN_VERIFY_STATUS = "VERIFY_STATUS";
    public static final int UC_MEDIA_HAD_SET_ORIENTATION = 1;
    public static final int UC_MEDIA_HAD_SET_SYSTEM_UI_FULLECREEN = 2;
    public static final String UI_PARAMS_KEY_BROWSER_MODE = "browsermode";
    public static final String UI_PARAMS_KEY_FULL_SCREEN = "full-screen";
    public static final String UI_PARAMS_KEY_GESTURE = "gesture";
    public static final String UI_PARAMS_KEY_LONGPRESS_MENU = "longpressMenu";
    public static final String UI_PARAMS_KEY_SCREEN_ORIENTATION = "screen-orientation";
    public static final int WEBVIEW_EVENT_TYPE_ADBLOCK_CSS_RULE_MATCHED = 201;
    public static final int WEBVIEW_EVENT_TYPE_AUDIO_DATA_USED = 105;
    public static final int WEBVIEW_EVENT_TYPE_BASE_COLOR_EMPTY_SCREEN = 16;
    public static final int WEBVIEW_EVENT_TYPE_BEFORE_NAVIGATION = 25;
    public static final int WEBVIEW_EVENT_TYPE_BLOCK_WINDOW = 0;
    public static final int WEBVIEW_EVENT_TYPE_DETACHED_FROM_WINDOW = 24;
    public static final int WEBVIEW_EVENT_TYPE_EMPTY_SCREEN = 9;
    public static final int WEBVIEW_EVENT_TYPE_EMPTY_SCREEN_INFO = 15;
    public static final int WEBVIEW_EVENT_TYPE_FIRST_PAINT = 17;
    public static final int WEBVIEW_EVENT_TYPE_GETJS_URL = 22;
    public static final int WEBVIEW_EVENT_TYPE_HIDE_SOFTKEYBOARD = 1;
    public static final int WEBVIEW_EVENT_TYPE_LINKID_NOTIFICATION = 20;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_OTHER_TRIGGER = 11;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_START = 4;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T0 = 5;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T1 = 6;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T2 = 7;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T2_PAINT = 13;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T2_TRACE = 14;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_STATUS_T3 = 8;
    public static final int WEBVIEW_EVENT_TYPE_LOADING_USER_TRIGGER = 10;
    public static final int WEBVIEW_EVENT_TYPE_MEDIA_MESSAGE_STATS = 103;
    public static final int WEBVIEW_EVENT_TYPE_MULTI_COLOR_EMPTY_SCREEN = 23;
    public static final int WEBVIEW_EVENT_TYPE_NETWORK_IP_RESOLVED = 12;
    public static final int WEBVIEW_EVENT_TYPE_NO_MATCH_IMG_DECODER = 21;
    public static final int WEBVIEW_EVENT_TYPE_ON_RENDER_PROCESS_READY = 107;
    public static final int WEBVIEW_EVENT_TYPE_SHARE_VIDEO = 2;
    public static final int WEBVIEW_EVENT_TYPE_SHOW_VIDEO_GESTURE_GUIDE = 3;
    public static final int WEBVIEW_EVENT_TYPE_VIDEO_DATA_USED = 104;
    public static final int WEBVIEW_EVENT_TYPE_VIDEO_ENTER_FULLSCREEN = 101;
    public static final int WEBVIEW_EVENT_TYPE_VIDEO_EXIT_FULLSCREEN = 102;
    public static final int WEBVIEW_EVENT_TYPE_WEBGL_ERROR_STATE = 19;
    public static final int WEBVIEW_EVENT_TYPE_WEBGL_JS_ERROR = 18;

    /* loaded from: classes9.dex */
    public enum MediaMessageType {
        UNDEFINED(-1),
        MIN_VALUE(0),
        BEFORE_PLAY_MEDIA(0),
        FOUND_VIDEO(1),
        DESTROY_VIDEO(2),
        ENTER_FULLSCREEN(3),
        EXIT_FULLSCREEN(4),
        ADD_TEXT_TRACK(5),
        NOTIFY_STATS(6),
        START_PRELOAD_VIDEO_SOURCE(7),
        CANCEL_PRELOAD_VIDEO_SOURCE(8),
        CAN_PLAY_IF_ENOUGH_DATA(9),
        MAX_VALUE(10);
        
        private static int INDEX_OFFSET = 2;
        private int value;

        MediaMessageType(int i) {
            this.value = i;
        }

        public static MediaMessageType convert(int i) {
            return (i > MAX_VALUE.value() || i < MIN_VALUE.value()) ? UNDEFINED : values()[i + INDEX_OFFSET];
        }

        public final int value() {
            return this.value;
        }
    }

    public boolean closeColorChooser() {
        return false;
    }

    public boolean closeListBox(WebView webView) {
        return false;
    }

    public void didOverscroll(int i, int i2) {
    }

    public String getCachedFilePath(String str) {
        return null;
    }

    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        return null;
    }

    public int getTitlebarHeight() {
        return 0;
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public void onContentSizeChanged(WebView webView, int i, int i2, int i3, int i4) {
    }

    public void onDidBlockNavigation(String str, String str2, int i) {
    }

    public void onFillFormDataPrompt(String[] strArr, String[] strArr2, ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(0);
    }

    public void onFirstLayoutFinished(boolean z, String str) {
    }

    public void onFirstVisuallyNonEmptyDraw() {
    }

    public void onFirstWebkitDraw() {
    }

    public void onGeneralPermissionsShowPrompt(Map<String, String> map, ValueCallback<Map<String, String>> valueCallback) {
    }

    public void onGpuProcessGone(WebView webView, int i) {
    }

    public String onJsCommand(String str, String str2, String[] strArr) {
        return null;
    }

    public Object onMediaMessage(WebView webView, MediaMessageType mediaMessageType, Object obj, ValueCallback<Object> valueCallback) {
        return Boolean.FALSE;
    }

    public void onPageCustomInfo(WebView webView, String str, String str2) {
    }

    public void onPageStartedEx(WebView webView, String str) {
    }

    public void onPageUIControlParamsChanged(HashMap<String, String> hashMap) {
    }

    public void onReceivedSubResourceSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
    }

    public void onRenderFrameCreated(IRouteID iRouteID) {
    }

    public void onRenderFrameDeleted(IRouteID iRouteID) {
    }

    public void onSaveFormDataPrompt(int i, ValueCallback<Boolean> valueCallback) {
    }

    public void onSaveFormDataPrompt(int i, String str, String str2, String str3, ValueCallback<Boolean> valueCallback) {
        onSaveFormDataPrompt(i, valueCallback);
    }

    public void onWebViewEvent(WebView webView, int i, Object obj) {
    }

    public boolean openColorChooser(int i, boolean z, ValueCallback<Integer> valueCallback) {
        return false;
    }

    public String populateErrorPage(WebView webView, String str, int i, String str2) {
        return null;
    }

    public String populateErrorPageForHttpStatusError(WebView webView, String str, int i) {
        return null;
    }

    public boolean requestListBox(WebView webView, String[] strArr, int[] iArr, int i, ValueCallback<Integer> valueCallback) {
        return false;
    }

    public boolean requestListBox(WebView webView, String[] strArr, int[] iArr, int[] iArr2, ValueCallback<SparseBooleanArray> valueCallback) {
        return false;
    }
}
