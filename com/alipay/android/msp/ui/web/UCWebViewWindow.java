package com.alipay.android.msp.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.ImageLoadCallback;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.HtmlParse;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.lang.reflect.Method;
import tb.riy;

/* loaded from: classes3.dex */
public class UCWebViewWindow extends LinearLayout implements IWebViewWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private TextView oi;
    private ProgressBar oj;
    private ImageView ok;
    private ImageView ol;
    private String om;
    private WebView on;
    private View oo;
    private String op;
    private JSONObject oq;

    public UCWebViewWindow(Context context) {
        super(context);
        this.oq = null;
        this.mContext = context;
        LayoutInflater.from(this.mContext).inflate(R.layout.mini_web_view_child, (ViewGroup) this, true);
        this.oo = findViewById(R.id.title_back_layout);
        this.oo.setContentDescription(LanguageHelper.localizedStringForKey("accessibilty_back_button", context.getString(R.string.accessibilty_back_button), new Object[0]));
        this.oi = (TextView) findViewById(R.id.mini_web_title);
        this.oj = (ProgressBar) findViewById(R.id.mini_web_progressbar);
        this.ok = (ImageView) findViewById(R.id.mini_web_refresh);
        this.ol = (ImageView) findViewById(R.id.mini_web_help);
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showTip(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bfa920", new Object[]{this, str, str2, onClickListener});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tip_container);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mContext == null) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ImageLoader.getInstance().loadImage((ImageView) findViewById(R.id.tip_icon), str, ImageLoader.LoadAction.Background, (ImageLoader.ClipsInfo) null, this.mContext, (ImageLoadCallback) null);
        try {
            ((TextView) findViewById(R.id.tip_text)).setText(HtmlParse.parseHtml(this.mContext, str2));
            linearLayout.setOnClickListener(onClickListener);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            linearLayout.setVisibility(8);
        }
    }

    public void setBackAction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b69aaa", new Object[]{this, jSONObject});
        } else {
            this.oq = jSONObject;
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public JSONObject getBackDlg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fca0e9", new Object[]{this}) : this.oq;
    }

    public void init(boolean z, String str, String str2) {
        this.on = new WebView(this.mContext);
        this.om = str;
        this.op = str2;
        ((FrameLayout) findViewById(R.id.mini_webView_frame)).addView(this.on);
        this.on.getSettings().setUseWideViewPort(true);
        this.on.getSettings().setJavaScriptEnabled(true);
        this.on.getSettings().setSavePassword(false);
        this.on.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.on.setVerticalScrollbarOverlay(true);
        this.on.getSettings().setAllowFileAccess(false);
        Context context = this.mContext;
        if (context != null && !DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_WEBVIEW_TEXT_ZOOM, false, this.mContext)) {
            this.on.getSettings().setTextZoom(100);
        }
        if (z) {
            WebSettings settings = this.on.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!TextUtils.isEmpty(userAgentString) && userAgentString.contains(riy.BRACKET_START_STR)) {
                String substring = userAgentString.substring(0, userAgentString.indexOf(riy.BRACKET_START_STR));
                settings.setUserAgentString(substring + MspConfig.getInstance().getSdkUserAgent(this.mContext.getApplicationContext()));
                settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            }
        }
        try {
            Method method = this.on.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
            if (method != null) {
                method.invoke(this.on.getSettings(), Boolean.TRUE);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            Method method2 = this.on.getClass().getMethod("removeJavascriptInterface", new Class[0]);
            if (method2 != null) {
                method2.invoke(this.on, "searchBoxJavaBridge_");
                method2.invoke(this.on, "accessibility");
                method2.invoke(this.on, "accessibilityTraversal");
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (TextUtils.equals("help", this.op)) {
            this.ol.setVisibility(0);
            this.ok.setVisibility(8);
        } else if (TextUtils.equals("refresh", this.op)) {
            this.ol.setVisibility(8);
            this.ok.setVisibility(0);
        } else if (TextUtils.equals("none", this.op)) {
            this.ol.setVisibility(8);
            this.ok.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.om)) {
            this.ol.setVisibility(0);
            this.ok.setVisibility(8);
        }
        if (this.on.getUCExtension() != null) {
            LogUtil.d("UCWebViewWindow", "init", "uc web init");
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public TextView getTitleView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("91d40de2", new Object[]{this}) : this.oi;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getHelpView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("a4624f6d", new Object[]{this}) : this.ol;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ProgressBar getProgressBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("98fa86b3", new Object[]{this}) : this.oj;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public ImageView getFreshView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("f545e3cc", new Object[]{this}) : this.ok;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void showReFreshView(boolean z) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed484a", new Object[]{this, new Boolean(z)});
            return;
        }
        int i = 8;
        if (TextUtils.equals(this.op, "refresh")) {
            ImageView imageView2 = this.ok;
            if (z) {
                i = 0;
            }
            imageView2.setVisibility(i);
        } else if (!TextUtils.isEmpty(this.op)) {
        } else {
            if (!TextUtils.isEmpty(this.om)) {
                imageView = this.ok;
            } else {
                imageView = this.ok;
                if (z) {
                    i = 0;
                }
            }
            imageView.setVisibility(i);
        }
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public View getBackView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7ce4092b", new Object[]{this}) : this.oo;
    }

    public WebView getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ipChange.ipc$dispatch("eec1fcf4", new Object[]{this}) : this.on;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WebView webView = this.on;
        if (webView == null) {
            return;
        }
        webView.setDownloadListener(null);
        this.on.removeAllViews();
        if (this.on.getParent() != null) {
            ((ViewGroup) this.on.getParent()).removeView(this.on);
        }
        this.on.destroy();
        this.on = null;
        this.mContext = null;
    }

    @Override // com.alipay.android.msp.ui.web.IWebViewWindow
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        WebView webView = this.on;
        if (webView == null) {
            return;
        }
        webView.reload();
    }
}
