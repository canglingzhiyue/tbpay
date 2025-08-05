package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSPageRootView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RPCDataItems.SWITCH_TAG_LOG, "", "mEnableNewAdjustInput", "", "mNeedRestoreWindowInsets", "mStatusBarHeight", "mWindowInsetBottom", "init", "", "isFullScreen", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "onAttachedToWindow", "onDetachedFromWindow", "requestApplyInsetsCompat", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSPageRootView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG;
    private boolean mEnableNewAdjustInput;
    private boolean mNeedRestoreWindowInsets;
    private int mStatusBarHeight;
    private int mWindowInsetBottom;

    static {
        kge.a(1663289218);
    }

    public static /* synthetic */ Object ipc$super(TMSPageRootView tMSPageRootView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 880921750) {
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }
        return super.onApplyWindowInsets((WindowInsets) objArr[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPageRootView(Context context) {
        super(context);
        q.d(context, "context");
        this.TAG = "TMSPageRootView@";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSPageRootView(Context context, AttributeSet attrs) {
        super(context, attrs);
        q.d(context, "context");
        q.d(attrs, "attrs");
        this.TAG = "TMSPageRootView@";
    }

    public TMSPageRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "TMSPageRootView@";
    }

    public final void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        q.d(context, "context");
        String str = this.TAG;
        this.TAG = str + hashCode();
        setFitsSystemWindows(true);
        if (z) {
            this.mEnableNewAdjustInput = false;
        }
        if (!this.mEnableNewAdjustInput) {
            return;
        }
        this.mStatusBarHeight = k.b(context);
        if (!(context instanceof Activity)) {
            return;
        }
        ((Activity) context).getWindow().setSoftInputMode(16);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.mEnableNewAdjustInput || !this.mNeedRestoreWindowInsets) {
            return;
        }
        requestApplyInsetsCompat();
        this.mNeedRestoreWindowInsets = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (!this.mEnableNewAdjustInput || this.mWindowInsetBottom <= 0) {
            return;
        }
        this.mNeedRestoreWindowInsets = true;
    }

    private final void requestApplyInsetsCompat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7f12de", new Object[]{this});
        } else if (Build.VERSION.SDK_INT > 19) {
            requestApplyInsets();
        } else {
            requestFitSystemWindows();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, insets});
        }
        q.d(insets, "insets");
        if (!this.mEnableNewAdjustInput) {
            return super.onApplyWindowInsets(insets);
        }
        if (Build.VERSION.SDK_INT > 19) {
            int systemWindowInsetTop = insets.getSystemWindowInsetTop() - this.mStatusBarHeight;
            if (systemWindowInsetTop < 0) {
                systemWindowInsetTop = 0;
            }
            int systemWindowInsetLeft = insets.getSystemWindowInsetLeft();
            int systemWindowInsetRight = insets.getSystemWindowInsetRight();
            int systemWindowInsetBottom = insets.getSystemWindowInsetBottom();
            this.mWindowInsetBottom = systemWindowInsetBottom;
            insets = insets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            q.b(insets, "insets.replaceSystemWind…left, top, right, bottom)");
        }
        return super.onApplyWindowInsets(insets);
    }
}
