package com.ali.user.mobile.ui;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.service.UIService;
import com.ali.user.mobile.webview.WebViewActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import tb.kge;

/* loaded from: classes2.dex */
public class UIServiceImpl implements UIService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1068281902);
        kge.a(662608511);
    }

    @Override // com.ali.user.mobile.service.UIService
    public boolean finishWebViewActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec4d9410", new Object[]{this, context})).booleanValue();
        }
        if (!(context instanceof WebViewActivity)) {
            return false;
        }
        ((WebViewActivity) context).finish();
        return true;
    }

    @Override // com.ali.user.mobile.service.UIService
    public boolean isWebViewActivity(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3556ce27", new Object[]{this, context})).booleanValue() : context instanceof WebViewActivity;
    }

    @Override // com.ali.user.mobile.service.UIService
    public void switchWebViewTitleBarRightButton(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3783192b", new Object[]{this, context, new Boolean(z), str});
        } else if (!(context instanceof WebViewActivity)) {
        } else {
            WebViewActivity webViewActivity = (WebViewActivity) context;
            if (TextUtils.equals(str, d.CLOSE_TYPE_SKIP)) {
                webViewActivity.switchSkipMenu(z);
            } else {
                webViewActivity.switchHelpMenu(z, str);
            }
        }
    }

    @Override // com.ali.user.mobile.service.UIService
    public void setWebViewTitleBarVisibility(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92411497", new Object[]{this, context, new Boolean(z)});
        } else if (!(context instanceof WebViewActivity)) {
        } else {
            setVisible(z, (WebViewActivity) context);
        }
    }

    public void setVisible(boolean z, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaa1067", new Object[]{this, new Boolean(z), baseActivity});
        } else if (baseActivity == null) {
        } else {
            try {
                if (baseActivity.getSupportActionBar() != null) {
                    if (z) {
                        baseActivity.getSupportActionBar().d();
                    } else {
                        baseActivity.getSupportActionBar().e();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
