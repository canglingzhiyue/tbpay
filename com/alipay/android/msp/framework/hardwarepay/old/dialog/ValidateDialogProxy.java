package com.alipay.android.msp.framework.hardwarepay.old.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.IHardwarePayDialog;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.impl.HardwarePayValidateDialog;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ValidateDialogProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IHardwarePayDialog f4756a;

    public ValidateDialogProxy(int i, Context context) {
        if (i == 1) {
            if (a(context)) {
                this.f4756a = new FpFullViewDialog();
                return;
            } else {
                this.f4756a = new HardwarePayValidateDialog();
                return;
            }
        }
        this.f4756a = new HardwarePayValidateDialog();
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        int i = -1;
        try {
            i = JSON.parseObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).getIntValue("type");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return i == 0;
    }

    public Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("f0603f56", new Object[]{this, activity, new Integer(i), str, iDialogActionListener}) : this.f4756a.showDialog(activity, i, str, iDialogActionListener);
    }

    public void updateMsg(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f4756a.updateMsg(str, i, i2);
        }
    }

    public boolean isShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue() : this.f4756a.isShown();
    }

    public void setValidateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86874278", new Object[]{this, new Boolean(z)});
        } else {
            this.f4756a.setValidateResult(z);
        }
    }

    public boolean isValidateOk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b8f28e7", new Object[]{this})).booleanValue() : this.f4756a.isValidateOk();
    }

    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        } else {
            this.f4756a.showAnimation();
        }
    }

    public void showLoadingSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd03a60b", new Object[]{this});
        } else {
            this.f4756a.showLoadingSuccess();
        }
    }

    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else {
            this.f4756a.setAllButtonsGone();
        }
    }

    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else {
            this.f4756a.dismiss(i);
        }
    }
}
