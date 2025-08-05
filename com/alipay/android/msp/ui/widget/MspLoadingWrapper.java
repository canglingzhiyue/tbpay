package com.alipay.android.msp.ui.widget;

import android.content.Context;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspLoadingWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MiniProgressDialog f5057a;
    private volatile boolean b;
    private boolean c;

    public MspLoadingWrapper(Context context, String str, boolean z) {
        this(context, str, z, -1);
    }

    public MspLoadingWrapper(Context context, String str, boolean z, int i) {
        this.c = false;
        this.b = false;
        if (this.f5057a == null) {
            this.f5057a = new MiniProgressDialog(context, i);
            this.f5057a.setCancelable(z);
            this.f5057a.setMessage(str);
        }
        this.c = DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_MSP_LOADING_SHOW_FIX, false, context);
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspLoadingWrapper:showLoading", "");
        MiniProgressDialog miniProgressDialog = this.f5057a;
        if (miniProgressDialog == null) {
            return;
        }
        try {
            miniProgressDialog.show();
            this.b = true;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspLoadingWrapper:dismissLoading", "");
        MiniProgressDialog miniProgressDialog = this.f5057a;
        if (miniProgressDialog != null && miniProgressDialog.isShowing()) {
            this.f5057a.dismiss();
            this.b = false;
            return;
        }
        LogUtil.record(2, "MspLoadingWrapper:dismissLoading", "mProgress=" + this.f5057a);
    }

    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        LogUtil.record(2, "MspLoadingWrapper:isShowing", "dialog.isShowing=" + this.f5057a.isShowing() + " isShowingLoading:" + this.b);
        MiniProgressDialog miniProgressDialog = this.f5057a;
        if (miniProgressDialog == null) {
            return false;
        }
        if (this.c) {
            return miniProgressDialog.isShowing();
        }
        return this.b;
    }

    public CharSequence getLoadingsMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1d1363f9", new Object[]{this});
        }
        MiniProgressDialog miniProgressDialog = this.f5057a;
        return miniProgressDialog != null ? miniProgressDialog.getProgressMessage() : "";
    }

    public void setLoadingMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4f7afe", new Object[]{this, str});
            return;
        }
        MiniProgressDialog miniProgressDialog = this.f5057a;
        if (miniProgressDialog == null) {
            return;
        }
        miniProgressDialog.setMessage(str);
    }

    public void stopLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e839159e", new Object[]{this});
            return;
        }
        MiniProgressDialog miniProgressDialog = this.f5057a;
        if (miniProgressDialog != null) {
            miniProgressDialog.stopProgressCountDown();
        } else {
            LogUtil.record(2, "MspLoadingWrapper:stopLoadingCountDown", "mProgress=null");
        }
    }
}
