package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fjr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FEATURE_DISABLE_SCREEN_RECORD = "disableScreenCapture";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28005a;

    public static /* synthetic */ void a(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c26e0", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else {
            c(context, z, z2);
        }
    }

    static {
        kge.a(-888446735);
        f28005a = false;
    }

    private static void b(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149c66bf", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else if (!(context instanceof Activity)) {
            fjt.a(fjt.TAG_IGNORE_ERROR, "changeRecordFlags 缺少 context 或非 Activity 。 忽略本次调用。" + context);
        } else {
            Activity activity = (Activity) context;
            try {
                if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                    return;
                }
                if (z) {
                    if (!z2 && !f28005a) {
                        fjt.a("NdScreenRecordUtil", "changeRecordFlags 开启录屏 - 忽略本次操作。");
                        return;
                    }
                    fjt.a("NdScreenRecordUtil", "changeRecordFlags 开启录屏。");
                    activity.getWindow().clearFlags(8192);
                    return;
                }
                f28005a = true;
                fjt.a("NdScreenRecordUtil", "changeRecordFlags 禁止录屏。");
                activity.getWindow().addFlags(8192);
            } catch (Throwable th) {
                fjt.a(fjt.TAG_UNKNOWN_ERROR, "changeRecordFlags 遇到不兼容的机型 。 忽略本次调用。" + context + " enableScreenRecord = " + z, th);
            }
        }
    }

    private static void c(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccca69e", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else if (!(context instanceof Activity)) {
        } else {
            Activity activity = (Activity) context;
            try {
                if (activity.isFinishing()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                    return;
                }
                if (z) {
                    if ((activity.getWindow().getAttributes().flags & 8192) != 0) {
                        b(context, true, z2);
                    } else {
                        fjt.a("NdScreenRecordUtil", "changeRecordFlags 检查成功 enableScreenRecord true , 且忽略本次操作。");
                    }
                } else if ((activity.getWindow().getAttributes().flags & 8192) == 0) {
                    b(context, false, z2);
                } else {
                    fjt.a("NdScreenRecordUtil", "changeRecordFlags 检查成功 enableScreenRecord false , 且忽略本次操作。");
                }
            } catch (Throwable th) {
                fjt.a(fjt.TAG_UNKNOWN_ERROR, "checkAndAppendFlags 检查时遇到不兼容的机型。忽略本次调用。" + context + " enableScreenRecord = " + z, th);
            }
        }
    }

    private static void d(final Context context, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24fce67d", new Object[]{context, new Boolean(z), new Boolean(z2)});
            return;
        }
        b(context, z, z2);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.fjr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    fjr.a(context, z, z2);
                }
            }
        }, 500L);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            d(context, true, false);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            b(context, true, false);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            d(context, false, false);
        }
    }
}
