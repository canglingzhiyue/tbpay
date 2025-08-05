package com.ali.user.mobile.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.Calendar;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class DeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.DeviceUtils";

    static {
        kge.a(-2117385387);
    }

    public static boolean shouldReportSample(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed5c6d26", new Object[]{str})).booleanValue();
        }
        try {
            if (LoginSwitch.isInABTestRegion("prefetch_autologin", 10000) || LoginSwitch.getSwitch("force_prefetch_autologin", "false")) {
                return shouldReportSample(str, Calendar.getInstance().get(6));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean shouldReportSample(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be31aa25", new Object[]{str, new Integer(i)})).booleanValue();
        }
        int i2 = LoginSwitch.getSwitch("sample_rate", 60);
        if (i2 < 10) {
            i2 = 10;
        }
        int abs = Math.abs(str.hashCode()) % i2;
        int i3 = i % i2;
        Log.e(TAG, "shouldSample inner utdid=" + str + ",hashMode=" + abs + ",sample=" + i3);
        return abs == i3;
    }

    public static boolean isTablet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{context})).booleanValue();
        }
        boolean isPad = ScreenUtil.isPad(context);
        try {
            isPad = l.b(context);
            LoginTLogAdapter.e(TAG, "isTablet value:" + isPad);
            return isPad;
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "isTablet dump", th);
            return isPad;
        }
    }

    public static boolean isFoldDevice(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                z = l.d(context);
            }
            LoginTLogAdapter.e(TAG, "isFoldDevice value:" + z);
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "isFoldDevice dump", th);
        }
        return z;
    }

    public static boolean isPortraitStatus(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b57dfd4e", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                z = h.a().b(context);
            }
            LoginTLogAdapter.e(TAG, "isTaobaoLargeScreen value:" + z);
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, "isTaobaoLargeScreen dump", th);
        }
        return z;
    }

    public static boolean isFoldDeviceExpand(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d13de8a", new Object[]{context})).booleanValue() : isFoldDevice(context) && !isPortraitStatus(context);
    }

    public static void adapterLoginDialogUIOnDevice(Context context, Dialog dialog, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3343d9dd", new Object[]{context, dialog, view, new Float(f)});
        } else {
            adapterLoginDialogUIOnDevice(context, dialog, view, f, -1, -1);
        }
    }

    public static void adapterLoginDialogUIOnDevice(Context context, Dialog dialog, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("353931e3", new Object[]{context, dialog, view, new Integer(i), new Integer(i2)});
        } else {
            adapterLoginDialogUIOnDevice(context, dialog, view, 1.0f, i, i2);
        }
    }

    public static void adapterLoginDialogUIOnDevice(Context context, Dialog dialog, View view, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c336fd", new Object[]{context, dialog, view, new Float(f), new Integer(i), new Integer(i2)});
        } else if (dialog == null || context == null || !(context instanceof Activity)) {
        } else {
            try {
                Activity activity = (Activity) context;
                if (f < 0.0f || f > 1.0f) {
                    f = 1.0f;
                }
                if (i <= 0) {
                    i = 335;
                }
                if (i2 <= 0) {
                    i2 = 670;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                Window window = dialog.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.setLayout(displayMetrics.widthPixels, attributes.height);
                attributes.gravity = 17;
                window.setAttributes(attributes);
                if (view == null) {
                    return;
                }
                int min = (int) Math.min(ScreenUtil.dip2px(context, i), displayMetrics.widthPixels * f);
                int dip2px = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), i2);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!isPortraitStatus(context) && !isFoldDevice(context)) {
                    layoutParams.width = dip2px;
                    layoutParams.height = -2;
                    view.setLayoutParams(layoutParams);
                }
                layoutParams.width = min;
                layoutParams.height = -2;
                view.setLayoutParams(layoutParams);
            } catch (Throwable th) {
                LoginTLogAdapter.e(TAG, "adapterLoginDialogUIOnDevice error dump:", th);
            }
        }
    }

    public static void adapterLoginUIOnDevice(List<View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda2b09b", new Object[]{list});
        } else if (list != null) {
            for (View view : list) {
                adapterLoginUIOnDevice(view);
            }
        }
    }

    public static void adapterLoginUIOnDevice(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac0fce8", new Object[]{view});
        } else if (view == null) {
        } else {
            try {
                Context context = view.getContext();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                boolean isPortraitStatus = isPortraitStatus(context);
                AdapterForTLog.loge(TAG, "adapterLoginUIOnDevice isPortrait:" + isPortraitStatus);
                if (isTablet(context)) {
                    AdapterForTLog.loge(TAG, "adapterLoginUIOnDevice isTablet");
                    if (isPortraitStatus) {
                        layoutParams.width = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), 660.0f);
                    } else {
                        layoutParams.width = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), 660.0f);
                    }
                } else if (isFoldDevice(context)) {
                    AdapterForTLog.loge(TAG, "adapterLoginUIOnDevice isFoldDevice");
                    if (isPortraitStatus) {
                        layoutParams.width = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), 660.0f);
                    } else {
                        layoutParams.width = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), 660.0f);
                    }
                } else {
                    AdapterForTLog.loge(TAG, "adapterLoginUIOnDevice isPhone");
                    layoutParams.width = -1;
                }
                view.setLayoutParams(layoutParams);
            } catch (Exception e) {
                AdapterForTLog.loge(TAG, "adapterLoginUIOnDevice error" + e.getMessage());
            }
        }
    }
}
