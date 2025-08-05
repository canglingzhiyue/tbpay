package com.ali.user.open.ucc.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.WebViewOption;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.StatusBarService;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.webview.IWebViewProxy;
import com.ali.user.open.core.webview.SystemWebViewProxy;
import com.ali.user.open.core.webview.WVUcWebViewProxy;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WebViewDialogActivity extends UccWebViewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ucc.webdialog";
    private String page = "page_usercenterbind";

    static {
        kge.a(-427689216);
    }

    public static /* synthetic */ Object ipc$super(WebViewDialogActivity webViewDialogActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void setActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef9b2c2", new Object[]{this});
        }
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity
    public void showTitleBar(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd7dde8", new Object[]{this, uri});
        }
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (AliMemberSDK.getService(StatusBarService.class) != null && ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getWebDialogLayout() > 0) {
            return ((StatusBarService) AliMemberSDK.getService(StatusBarService.class)).getWebDialogLayout();
        }
        return R.layout.member_sdk_ucc_dialog_layout;
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public void initViews(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002b7ef", new Object[]{this, bundle});
            return;
        }
        setContentView(getLayout());
        setActionBar();
        this.memberWebView = createWebView();
        ((FrameLayout) findViewById(R.id.ali_user_webview_container)).addView(this.memberWebView.getWebView(), new FrameLayout.LayoutParams(-1, -1));
        try {
            str = getIntent().getStringExtra("url");
        } catch (Throwable th) {
            th.printStackTrace();
            str = "";
        }
        ImageView imageView = (ImageView) findViewById(R.id.ali_ucc_close);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.open.ucc.webview.WebViewDialogActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        WebViewDialogActivity.this.onBackHistory();
                    }
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.ali_ucc_bind_title);
        if (!TextUtils.isEmpty(ConfigManager.getInstance().getBindTitle()) && textView != null) {
            textView.setText(ConfigManager.getInstance().getBindTitle());
        }
        SDKLogger.d("ucc.webdialog", "onCreate url=" + str);
        if (KernelContext.checkServiceValid()) {
            if (!CommonUtils.isNetworkAvailable()) {
                CommonUtils.toast("member_sdk_network_not_available_message");
                return;
            }
            try {
                this.memberWebView.resumeTimers();
                this.memberWebView.onResume();
            } catch (Exception unused) {
            }
            loadUrl(str);
            return;
        }
        finish();
    }

    @Override // com.ali.user.open.core.webview.BaseWebViewActivity
    public IWebViewProxy createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWebViewProxy) ipChange.ipc$dispatch("d6765a09", new Object[]{this});
        }
        if (ConfigManager.getInstance().getWebViewOption() == WebViewOption.UC) {
            if (checkWindVaneExist()) {
                return new WVUcWebViewProxy(this);
            }
            return new SystemWebViewProxy(this, "#25252B");
        }
        return new SystemWebViewProxy(this, "#25252B");
    }

    @Override // com.ali.user.open.ucc.webview.UccWebViewActivity, com.ali.user.open.core.webview.BaseWebViewActivity
    public void onBackHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922dabd5", new Object[]{this});
        } else if (this.memberWebView.canGoBack() && (this.memberWebView.getUrl().contains("authorization-notice") || this.memberWebView.getUrl().contains("agreement"))) {
            this.memberWebView.goBack();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("spm", "a2h21.13789771.close.1");
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).sendControl(this.page, "close", "", hashMap);
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Cancel", this.mUccParams, new HashMap());
            UccCallback uccCallback = (UccCallback) CallbackManager.getCallback(Integer.valueOf(UccConstants.UCC_H5_CALLBACK_TYPE));
            if (uccCallback != null) {
                if (this.mUccParams == null) {
                    this.mUccParams = new UccParams();
                }
                uccCallback.onFail(this.mUccParams.bindSite, 1403, getResources().getString(R.string.member_sdk_cancel));
                CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
            }
            finish();
        }
    }
}
