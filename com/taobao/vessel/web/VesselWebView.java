package com.taobao.vessel.web;

import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.base.VesselBaseView;
import com.taobao.vessel.base.b;
import java.util.Map;
import tb.kge;
import tb.rgv;

/* loaded from: classes9.dex */
public class VesselWebView extends VesselBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private boolean mDoNotCallCoreDestroy;
    private String mOriginJsData;
    private String mUrl;
    private WVUCWebView mWebView;
    private WVUCWebViewClient mWebclient;

    public static /* synthetic */ Object ipc$super(VesselWebView vesselWebView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rgx
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.rgx
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ WVUCWebView access$000(VesselWebView vesselWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("dcc8ed8f", new Object[]{vesselWebView}) : vesselWebView.mWebView;
    }

    public static /* synthetic */ rgv access$100(VesselWebView vesselWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgv) ipChange.ipc$dispatch("9a6469e", new Object[]{vesselWebView}) : vesselWebView.mScrollViewListener;
    }

    public static /* synthetic */ rgv access$200(VesselWebView vesselWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgv) ipChange.ipc$dispatch("4d31645f", new Object[]{vesselWebView}) : vesselWebView.mScrollViewListener;
    }

    static {
        kge.a(1601693442);
        TAG = VesselWebView.class.getSimpleName();
    }

    public VesselWebView(Context context) {
        this(context, null);
    }

    public VesselWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VesselWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWebclient = null;
        this.mDoNotCallCoreDestroy = false;
        init();
    }

    public void setDoNotCallCoreDestroy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc3e756", new Object[]{this, new Boolean(z)});
        } else {
            this.mDoNotCallCoreDestroy = z;
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (com.taobao.vessel.a.a().c() != null) {
            this.mWebView = com.taobao.vessel.a.a().c();
        } else {
            this.mWebView = com.taobao.vessel.utils.a.b() ? new BrowserHybridWebView(getContext()) : new WVUCWebView(getContext());
        }
        b.a().a(this.mWebView, this);
        this.mWebView.setWebViewClient(new a(getContext(), this));
        this.mWebView.setWebChromeClient(new WVUCWebChromeClient(getContext()));
        this.mWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.vessel.web.VesselWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (Math.abs(VesselWebView.access$000(VesselWebView.this).getContentHeight() - VesselWebView.access$000(VesselWebView.this).getHeight()) == 0.0f && VesselWebView.access$100(VesselWebView.this) != null) {
                    VesselWebView.access$200(VesselWebView.this).onScrollEnabled(VesselWebView.access$000(VesselWebView.this), false);
                }
                return false;
            }
        });
        if (this.mWebView.getParent() != null) {
            ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
        }
        addView(this.mWebView, layoutParams);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.fireEvent(str, com.taobao.vessel.utils.b.a((Object) map));
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadUrl(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
            return;
        }
        this.mUrl = str;
        hideErrorPage();
        this.mWebView.loadUrl(str);
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void loadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd1c41", new Object[]{this, str});
            return;
        }
        hideErrorPage();
        this.mOriginJsData = str;
        this.mWebView.loadData(str, "text/html", "utf-8");
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float contentHeight = this.mWebView.getContentHeight();
        float height = this.mWebView.getHeight() + this.mWebView.getScrollY();
        if (this.mScrollViewListener == null) {
            return;
        }
        if (Math.abs(contentHeight - height) < 1.0f) {
            this.mScrollViewListener.onScrollToBottom(this.mWebView, i, i2);
        } else if (this.mWebView.getScrollY() == 0) {
            this.mScrollViewListener.onScrollToTop(this.mWebView, i, i2);
        } else {
            this.mScrollViewListener.onScrollChanged(this.mWebView, i, i2, i3, i4);
        }
    }

    @Deprecated
    public void setWebViewClient(WVUCWebViewClient wVUCWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a058df", new Object[]{this, wVUCWebViewClient});
        } else if (wVUCWebViewClient == null) {
        } else {
            this.mWebclient = wVUCWebViewClient;
            WVUCWebView wVUCWebView = this.mWebView;
            if (wVUCWebView == null) {
                return;
            }
            wVUCWebView.setWebViewClient(this.mWebclient);
        }
    }

    @Override // tb.rgx
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        b.a().a(this.mWebView);
        this.mWebView.setVisibility(8);
        this.mWebView.removeAllViews();
        if (this.mWebView.getParent() != null) {
            ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
        }
        if (this.mDoNotCallCoreDestroy || com.taobao.vessel.utils.a.d()) {
            this.mWebView.destroy();
            TLog.logd(TAG, "destroy");
        } else {
            this.mWebView.coreDestroy();
            TLog.logd(TAG, "coreDestroy");
        }
        this.mScrollViewListener = null;
    }

    @Override // android.view.View
    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.mWebView;
    }

    private void hideErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null || !wVUCWebView.getWvUIModel().getErrorView().isShown()) {
            return;
        }
        this.mWebView.getWvUIModel().hideErrorPage();
    }

    private void showErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1648dc1", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null || wVUCWebView.getWvUIModel().getErrorView().isShown()) {
            return;
        }
        this.mWebView.getWvUIModel().loadErrorPage();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public boolean refresh(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a612d42", new Object[]{this, obj})).booleanValue();
        }
        if (this.mWebView == null) {
            return false;
        }
        if (!TextUtils.isEmpty(this.mUrl)) {
            this.mWebView.loadUrl(this.mUrl);
        } else if (!TextUtils.isEmpty(this.mOriginJsData)) {
            this.mWebView.loadData(this.mOriginJsData, "text/html", "utf-8");
        }
        return true;
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void releaseMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01c06f", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.removeAllViews();
            this.mWebView = null;
        }
        removeAllViews();
        onDestroy();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public View getChildView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("5d844df4", new Object[]{this}) : this.mWebView;
    }

    @Override // tb.rgx
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null || !wVUCWebView.isLive()) {
            return;
        }
        this.mWebView.onResume();
    }

    @Override // tb.rgx
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null || !wVUCWebView.isLive()) {
            return;
        }
        this.mWebView.onPause();
    }

    @Override // com.taobao.vessel.base.VesselBaseView
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.mWebView.onActivityResult(i, i2, intent);
        }
    }
}
