package com.taobao.android.purchase.aura.utils;

import android.app.Activity;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import tb.bat;
import tb.kge;

/* loaded from: classes6.dex */
public class UToastService implements bat.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1358069548);
        kge.a(-1600120812);
    }

    @Override // tb.bat.a
    public void showToast(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af33ec4d", new Object[]{this, activity, str});
        } else if ("true".equals(OrangeConfig.getInstance().getConfig("aura_purchase", "useSystemToast", "false"))) {
            showSystemToast(activity, str);
        } else {
            showUToast(activity, str);
        }
    }

    private void showSystemToast(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0ecb9e", new Object[]{this, activity, str});
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.taobao.android.purchase.aura.utils.UToastService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(activity, str, 0).show();
                    }
                }
            });
        }
    }

    private void showUToast(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc543b2", new Object[]{this, activity, str});
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.taobao.android.purchase.aura.utils.UToastService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        TBToast.makeText(activity, str, 3000L).show();
                    } catch (Exception unused) {
                        Toast.makeText(activity, str, 0).show();
                    }
                }
            });
        }
    }
}
