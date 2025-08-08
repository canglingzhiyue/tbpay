package com.taobao.pha.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.tao.util.Constants;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import java.io.File;
import java.util.Arrays;
import tb.keu;
import tb.kge;
import tb.ngc;
import tb.ngf;
import tb.ngr;

/* loaded from: classes7.dex */
public class b extends WVUCWebChromeClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18847a;
    private final ngc b;
    private final ngf c;
    private PHAWVUCWebView d;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2015964955:
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            case -1785166098:
                super.onReceivedTouchIconUrl((WebView) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -1540056808:
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -634514222:
                return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
            case 1506089812:
                super.onReceivedIcon((WebView) objArr[0], (Bitmap) objArr[1]);
                return null;
            case 2060440615:
                return new Boolean(super.onShowFileChooser((WebView) objArr[0], (ValueCallback) objArr[1], (WebChromeClient.FileChooserParams) objArr[2]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ PHAWVUCWebView a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PHAWVUCWebView) ipChange.ipc$dispatch("33831fa3", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f18847a;
    }

    static {
        kge.a(-1208700673);
        f18847a = b.class.getSimpleName();
    }

    public b(Context context, ngc ngcVar, ngf ngfVar) {
        super(context);
        this.b = ngcVar;
        this.c = ngfVar;
        if (ngfVar.f() instanceof PHAWVUCWebView) {
            this.d = (PHAWVUCWebView) ngfVar.f();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
            return;
        }
        super.onReceivedTitle(webView, str);
        PHAWVUCWebView pHAWVUCWebView = this.d;
        if (pHAWVUCWebView == null || pHAWVUCWebView.getOutHandler() == null) {
            return;
        }
        String title = webView.getTitle();
        if (title == null || StringUtils.isEmpty(title) || title.equals("0")) {
            title = str;
        }
        if (p.b(title)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = title;
        obtain.what = 1104;
        this.d.getOutHandler().sendMessage(obtain);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
        }
        if (!this.b.a(consoleMessage)) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
            return;
        }
        super.onProgressChanged(webView, i);
        this.b.a(this.c, i);
        PHAWVUCWebView pHAWVUCWebView = this.d;
        if (pHAWVUCWebView == null) {
            return;
        }
        if (i >= 70 && !pHAWVUCWebView.getProgessLoaded()) {
            if (this.d.filter != null) {
                Message obtain = Message.obtain();
                obtain.what = 1103;
                this.d.filter.a(obtain);
                this.d.setProgessLoaded(true);
            }
        } else {
            this.d.setProgessLoaded(false);
        }
        if (this.d.filter == null) {
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.what = 1125;
        obtain2.arg1 = i;
        this.d.filter.a(obtain2);
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c51b54", new Object[]{this, webView, bitmap});
        } else {
            super.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // com.uc.webview.export.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959886ee", new Object[]{this, webView, str, new Boolean(z)});
        } else {
            super.onReceivedTouchIconUrl(webView, str, z);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7acfd427", new Object[]{this, webView, valueCallback, fileChooserParams})).booleanValue();
        }
        String arrays = Arrays.toString(fileChooserParams.getAcceptTypes());
        e.a(RVLLevel.Info, "onShowFileChooser", "AcceptTypes:" + arrays + ", Mode:" + fileChooserParams.getMode() + ", Hint:" + fileChooserParams.getFilenameHint());
        this.d.setUploadMsgAboveL(valueCallback);
        final Context context = this.d.getContext();
        if (context != null && (context instanceof Activity)) {
            try {
                final String a2 = android.taobao.windvane.cache.a.a().a(true);
                if (a2 == null) {
                    return true;
                }
                File file = new File(a2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                final boolean contains = arrays.contains("image/");
                final boolean contains2 = arrays.contains("video/");
                if (fileChooserParams.isCaptureEnabled() && (contains || contains2)) {
                    android.taobao.windvane.runtimepermission.b.a(context, new String[]{com.taobao.speech.util.e.CAMERA}).a(new Runnable() { // from class: com.taobao.pha.webview.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (contains) {
                                Uri a3 = android.taobao.windvane.file.c.a(context, new File(a2 + File.separator + "IMAGE_" + System.currentTimeMillis() + ".jpg"));
                                b.a(b.this).setUploadUriAboveL(a3);
                                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.addFlags(1);
                                }
                                intent.putExtra(NetConfig.OUPUT_KEY, a3);
                                ((Activity) context).startActivityForResult(intent, Constants.FILECHOOSER_REQ_CODE);
                            } else if (!contains2) {
                            } else {
                                Uri a4 = android.taobao.windvane.file.c.a(context, new File(a2 + File.separator + "VIDEO_" + System.currentTimeMillis() + keu.SUFFIX_MP4));
                                b.a(b.this).setUploadUriAboveL(a4);
                                Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent2.addFlags(1);
                                }
                                intent2.putExtra(NetConfig.OUPUT_KEY, a4);
                                ((Activity) context).startActivityForResult(intent2, Constants.FILECHOOSER_REQ_CODE);
                            }
                        }
                    }).b(new Runnable() { // from class: com.taobao.pha.webview.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ngr.b(b.a(), "Permission Denied");
                            }
                        }
                    }).b();
                } else {
                    return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
            } catch (Throwable th) {
                ngr.b(f18847a, th.getMessage());
            }
        }
        return true;
    }
}
