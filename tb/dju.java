package tb;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(935751076);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null || Build.VERSION.SDK_INT < 16) {
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public static void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{view, str});
        } else if (view == null) {
        } else {
            a(view);
            if (TextUtils.isEmpty(str)) {
                str = "图片识别中";
            }
            view.setContentDescription(str);
        }
    }

    public static void b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e25fbd3", new Object[]{view, str});
        } else if (view == null) {
        } else {
            a(view);
            if (TextUtils.isEmpty(str)) {
                str = "图片识别失败";
            }
            view.setContentDescription(str);
        }
    }

    public static void c(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b30f2", new Object[]{view, str});
        } else if (view == null) {
        } else {
            a(view);
            view.setContentDescription(str);
        }
    }
}
