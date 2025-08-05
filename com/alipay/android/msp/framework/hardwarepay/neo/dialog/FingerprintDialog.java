package com.alipay.android.msp.framework.hardwarepay.neo.dialog;

import android.app.Activity;
import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.base.FpFullViewDialog;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.FpDefaultDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FingerprintDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_CANCEL = 0;
    public static final int ACTION_TO_PWD = 2;

    /* renamed from: a  reason: collision with root package name */
    private IHardwarePayDialog f4726a;

    public static /* synthetic */ IHardwarePayDialog a(FingerprintDialog fingerprintDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHardwarePayDialog) ipChange.ipc$dispatch("95ccb031", new Object[]{fingerprintDialog}) : fingerprintDialog.f4726a;
    }

    public FingerprintDialog(Context context, VerifyEnum verifyEnum) {
        if (a(context)) {
            this.f4726a = new FpFullViewDialog(verifyEnum);
        } else {
            this.f4726a = new FpDefaultDialog(verifyEnum);
        }
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintDialog");
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        int i = -1;
        try {
            i = new JSONObject(PhoneCashierMspEngine.getMspViSec().getFpInfo(context)).optInt("type", -1);
        } catch (Throwable unused) {
        }
        return i == 0;
    }

    public void showDialog(final Activity activity, final String str, final IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e577c0", new Object[]{this, activity, str, iDialogActionListener});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FingerprintDialog.a(FingerprintDialog.this).showDialog(activity, str, iDialogActionListener);
                    }
                }
            });
        }
    }

    public void updateMsg(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.f4726a.updateMsg(str, i, i2);
        }
    }

    public boolean isShown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue() : this.f4726a.isShown();
    }

    public void showAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
        } else {
            this.f4726a.showAnimation();
        }
    }

    public void setAllButtonsGone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede53c68", new Object[]{this});
        } else {
            this.f4726a.setAllButtonsGone();
        }
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            this.f4726a.dismiss(0);
        }
    }

    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else {
            this.f4726a.dismiss(i);
        }
    }
}
