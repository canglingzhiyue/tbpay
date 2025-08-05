package android.taobao.windvane.extra.uc;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.runtimepermission.b;
import android.taobao.windvane.util.a;
import android.taobao.windvane.util.e;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.n;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.IWVWebView;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.uc.webview.export.GeolocationPermissions;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hux;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUCWebChromeClient extends WebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FilePathCallbackID = 15;
    private static final String KEY_CANCEL;
    private static final String KEY_CONFIRM;
    private static final String KEY_FROM;
    private static final String TAG = "WVUCWebChromeClient";
    public Context mContext;
    public IWVWebView mWebView = null;
    public ValueCallback<Uri[]> mFilePathCallback = null;

    /* renamed from: android.taobao.windvane.extra.uc.WVUCWebChromeClient$11  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass11 {
        public static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = new int[ConsoleMessage.MessageLevel.values().length];

        static {
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WVUCWebChromeClient wVUCWebChromeClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2015964955:
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -1625848766:
                super.openFileChooser((ValueCallback) objArr[0]);
                return null;
            case -1540056808:
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -634514222:
                return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
            case 1295923417:
                super.onGeolocationPermissionsShowPrompt((String) objArr[0], (GeolocationPermissions.Callback) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$001(WVUCWebChromeClient wVUCWebChromeClient, ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb4ff1f", new Object[]{wVUCWebChromeClient, valueCallback});
        } else {
            super.openFileChooser(valueCallback);
        }
    }

    static {
        kge.a(-1418687346);
        KEY_FROM = e.c() ? "来自于：" : "From: ";
        KEY_CONFIRM = hux.a(ILocalizationService.CONFIRM);
        KEY_CANCEL = hux.a(ILocalizationService.CANCEL);
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void openFileChooser(final ValueCallback<Uri> valueCallback) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f178442", new Object[]{this, valueCallback});
            return;
        }
        m.b(TAG, " openFileChooser");
        if (this.mWebView == null) {
            m.e(TAG, "context is null");
            return;
        }
        Context a2 = n.a(this.mContext);
        if (a2 instanceof Application) {
            m.e(TAG, "context can not be application");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 33) {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", com.taobao.speech.util.e.CAMERA};
            } else {
                strArr = new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VIDEO, com.taobao.speech.util.e.CAMERA};
            }
            b.a(a2, strArr).a(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    m.b(WVUCWebChromeClient.TAG, " openFileChooser permission granted");
                    WVUCWebChromeClient.access$001(WVUCWebChromeClient.this, valueCallback);
                }
            }).b(new Runnable() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        m.b(WVUCWebChromeClient.TAG, " openFileChooser permission denied");
                    }
                }
            }).b();
        } catch (Exception e) {
            m.e(TAG, e.getMessage());
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7acfd427", new Object[]{this, webView, valueCallback, fileChooserParams})).booleanValue();
        }
        m.b(TAG, " onShowFileChooser");
        if (fileChooserParams != null && valueCallback != null) {
            this.mFilePathCallback = valueCallback;
            try {
                Intent createIntent = fileChooserParams.createIntent();
                Context a2 = n.a(webView.getContext());
                if (a2 instanceof Activity) {
                    ((Activity) a2).startActivityForResult(Intent.createChooser(createIntent, "choose"), 15);
                }
                return true;
            } catch (Throwable th) {
                m.e(TAG, th.getMessage());
                th.printStackTrace();
            }
        }
        return false;
    }

    public WVUCWebChromeClient() {
    }

    public WVUCWebChromeClient(Context context) {
        this.mContext = context;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3e38d9", new Object[]{this, str, callback});
            return;
        }
        callback.invoke(str, true, false);
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            m.e(TAG, "cannot call [onJsAlert], for webview has been destroyed");
            return true;
        }
        Context a2 = n.a(webView.getContext());
        if ((a2 instanceof Activity) && ((Activity) a2).isFinishing()) {
            jsResult.confirm();
            return true;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(a2);
            String host = Uri.parse(str).getHost();
            builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        jsResult.confirm();
                    }
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else {
                        jsResult.cancel();
                    }
                }
            });
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable th) {
            m.e(TAG, th.getMessage());
            jsResult.confirm();
        }
        return true;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af8e0ca", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            m.e(TAG, "cannot call [onJsConfirm], for webview has been destroyed");
            return true;
        }
        Context a2 = n.a(webView.getContext());
        if ((a2 instanceof Activity) && ((Activity) a2).isFinishing()) {
            jsResult.confirm();
            return true;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(a2);
            String host = Uri.parse(str).getHost();
            builder.setTitle(KEY_FROM + host).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        jsResult.confirm();
                    }
                }
            }).setNeutralButton(KEY_CANCEL, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        jsResult.cancel();
                    }
                }
            });
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else {
                        jsResult.cancel();
                    }
                }
            });
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable th) {
            m.e(TAG, th.getMessage());
            jsResult.confirm();
        }
        return true;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
        }
        if (webView.isDestroied()) {
            m.e(TAG, "cannot call [onJsPrompt], for webview has been destroyed");
            return true;
        }
        Context a2 = n.a(webView.getContext());
        if ((a2 instanceof Activity) && ((Activity) a2).isFinishing()) {
            jsPromptResult.confirm();
            return true;
        } else if (str3 != null && str3.equals("wv_hybrid:")) {
            m.e(TAG, "Call from console.prompt");
            l.b().a((IWVWebView) webView, str2, (WVUCWebView) webView);
            jsPromptResult.confirm("");
            return true;
        } else {
            try {
                final EditText editText = new EditText(a2);
                editText.setText(str3);
                String host = Uri.parse(str).getHost();
                AlertDialog.Builder builder = new AlertDialog.Builder(a2);
                AlertDialog create = builder.setTitle(KEY_FROM + host).setView(editText).setMessage(str2).setPositiveButton(KEY_CONFIRM, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (editText.getText() != null) {
                            jsPromptResult.confirm(editText.getText().toString());
                        } else {
                            jsPromptResult.confirm();
                        }
                    }
                }).setNegativeButton(KEY_CANCEL, new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: android.taobao.windvane.extra.uc.WVUCWebChromeClient.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        } else {
                            jsPromptResult.cancel();
                        }
                    }
                }).create();
                create.setCanceledOnTouchOutside(false);
                create.show();
            } catch (Throwable th) {
                m.e(TAG, th.getMessage());
                jsPromptResult.confirm();
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    @Override // com.uc.webview.export.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onConsoleMessage(android.webkit.ConsoleMessage r13) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCWebChromeClient.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
    }

    private boolean tryToUploadTimeout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772acd3f", new Object[]{this, str})).booleanValue();
        }
        if (str.startsWith("{\"WVReport.HY_TIMEOUT\":\"")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (o.getJsBridgeMonitor() != null) {
                    o.getJsBridgeMonitor().onJsBridgeReturn(jSONObject.optString("name"), jSONObject.optString("WVReport.HY_TIMEOUT"), "WVReport.HY_TIMEOUT", jSONObject.optString("param"), jSONObject.optString("url"));
                }
                m.e(TAG, jSONObject.toString());
                return true;
            } catch (JSONException e) {
                m.e(TAG, a.a(e));
            }
        }
        return false;
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
        } else {
            super.onProgressChanged(webView, i);
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
        } else if (!p.b(str)) {
            super.onReceivedTitle(webView, str);
        } else {
            m.c(TAG, "ignore default title : " + str);
        }
    }
}
