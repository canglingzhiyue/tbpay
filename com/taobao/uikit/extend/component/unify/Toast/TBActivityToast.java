package com.taobao.uikit.extend.component.unify.Toast;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.utils.DeviceUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class TBActivityToast extends TBToast {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WindowManager.LayoutParams mWindowManagerParams;

    static {
        kge.a(-717255537);
    }

    public TBActivityToast(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public WindowManager.LayoutParams getWindowManagerParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager.LayoutParams) ipChange.ipc$dispatch("4843f764", new Object[]{this}) : this.mWindowManagerParams;
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : (Activity) this.mContext;
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public WindowManager getWindowManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowManager) ipChange.ipc$dispatch("4c2eee04", new Object[]{this}) : getActivity().getWindowManager();
    }

    @Override // com.taobao.uikit.extend.component.unify.Toast.TBToast
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            if (DeviceUtils.isHUWEIDevice() && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 29 && !NotificationManagerCompat.from(getActivity()).areNotificationsEnabled()) {
                this.mWindowManagerParams = new WindowManager.LayoutParams();
                this.mWindowManagerParams.flags = 8;
                this.mWindowManagerParams.format = -3;
                this.mWindowManagerParams.height = -2;
                this.mWindowManagerParams.width = -2;
                this.mWindowManagerParams.windowAnimations = 16973828;
                this.mWindowManagerParams.gravity = 81;
                this.mWindowManagerParams.x = 0;
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                this.mWindowManagerParams.y = (int) (point.y * 0.1f);
                getTextView().setMaxLines(20);
                TBToastManager.getInstance().add(this);
                return;
            }
            Toast.makeText(this.mContext, getText(), 0).show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
