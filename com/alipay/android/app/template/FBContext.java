package com.alipay.android.app.template;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public interface FBContext {
    public static final String OPTION_DEFER_DOWNLOAD = "deferDownload";
    public static final String OPTION_DEFER_DOWNLOAD_FILTER = "deferDownloadFilter";
    public static final String OPTION_DESTROY_ONLY_SINGLE_VIEW = "destroyOnlySingleView";

    /* loaded from: classes3.dex */
    public interface JsExecCallback {
        public static final int STATE_FAILED_NO_REASON = 100;
        public static final int STATE_FAILED_WAIT_TIMEOUT = 101;
        public static final int STATE_OK = 1;

        /* loaded from: classes3.dex */
        public @interface STATE {
        }

        void onJsExecuted(int i, String str);
    }

    /* loaded from: classes3.dex */
    public static final class JsExecOptions {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ASYNC_MODE_AVOID_SCHEDULE = 1;
        public static final int ASYNC_MODE_ONLY_ASYNC = 0;
        public static final int ASYNC_MODE_ONLY_SYNC = 2;
        public static final int CALLBACK_MODE_AVOID_SCHEDULE = 2;
        public static final int CALLBACK_MODE_NO_CALLBACK = 0;
        public static final int CALLBACK_MODE_UI = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f4444a = 0;
        public int b = 0;
        public int c = 10000;

        /* loaded from: classes3.dex */
        public @interface ASYNC_MODE {
        }

        /* loaded from: classes3.dex */
        public @interface CALLBACK_MODE {
        }

        private JsExecOptions() {
        }

        public static JsExecOptions create() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JsExecOptions) ipChange.ipc$dispatch("bc1eb1b1", new Object[0]) : new JsExecOptions();
        }

        public int getAsyncMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ec81b83", new Object[]{this})).intValue() : this.f4444a;
        }

        public int getBlockTimeoutMs() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c797964a", new Object[]{this})).intValue() : this.c;
        }

        public int getCallbackMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84be0b78", new Object[]{this})).intValue() : this.b;
        }

        public JsExecOptions setAsyncMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JsExecOptions) ipChange.ipc$dispatch("85b077ad", new Object[]{this, new Integer(i)});
            }
            this.f4444a = i;
            return this;
        }

        public JsExecOptions setBlockTimeoutMs(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JsExecOptions) ipChange.ipc$dispatch("f094362e", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public JsExecOptions setCallbackMode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JsExecOptions) ipChange.ipc$dispatch("dd5fd5c0", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "JsExecOptions{asyncMode=" + this.f4444a + ", callbackMode=" + this.b + ", blockTimeoutMs=" + this.c + '}';
        }
    }

    /* loaded from: classes3.dex */
    public interface NavbarInterface {
        ViewGroup getLeftElement();

        ViewGroup getMiddleElemenet();

        ViewGroup getRightElement();
    }

    /* loaded from: classes3.dex */
    public enum ReloadResult {
        OK,
        INVALID_PARAM,
        INVALID_STATE
    }

    @Deprecated
    int callJsMethod(long j, Object[] objArr);

    void destroy();

    void destroy(Map<String, Object> map);

    @Deprecated
    int executeJs(String str);

    @Deprecated
    String executeJsWithResult(String str);

    FBFocusable getAutoFocusable();

    float getBodyOpacity();

    /* renamed from: getBodyView */
    Object mo650getBodyView();

    View getContentView();

    TemplateKeyboardService getDefaultKeyboardService();

    /* renamed from: getNav */
    NavbarInterface mo651getNav();

    Object getParameter(String str, Object obj);

    Map<String, ?> getParameters();

    Dialog getShowingDialog();

    TemplateKeyboardService getTemplateKeyboardService();

    boolean hasInput();

    boolean isFullscreen();

    boolean isJsDebuggerEnabled();

    boolean isOnloadFinish();

    void layoutNodeWithDimensions(long j, int i, int i2);

    View queryView(String str);

    void reloadData(String str);

    ReloadResult reloadDataWithResult(String str);

    void safeCallJsMethod(long j, Object[] objArr, JsExecOptions jsExecOptions, JsExecCallback jsExecCallback);

    void safeExecuteJs(String str, JsExecOptions jsExecOptions, JsExecCallback jsExecCallback);

    void setAutoFocusable(FBFocusable fBFocusable);

    void setHasInput(boolean z);

    void setParameter(String str, Object obj);
}
