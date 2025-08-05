package com.taobao.message.uikit.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes7.dex */
public class ActivityJumpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LANDING_URL = "landingUrl";

    static {
        kge.a(-2145237916);
    }

    public static void jumpToActivity(final Activity activity, final Intent intent, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed18718", new Object[]{activity, intent, str});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.message.uikit.util.ActivityJumpUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("jumpToActivity", "newActivityActionName");
                try {
                    Intent intent2 = new Intent();
                    intent2.setData(intent.getData());
                    if (intent.getExtras() != null) {
                        intent2.putExtras(intent);
                    }
                    intent2.setClassName(activity.getPackageName(), str);
                    intent2.setAction(str);
                    activity.startActivity(intent2);
                } catch (Exception e) {
                    e.printStackTrace();
                    TLog.loge("jumpToActivity", "error", e.toString());
                }
                activity.finish();
            }
        };
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            runnable.run();
        } else {
            UIHandler.post(runnable);
        }
    }

    public static boolean navLandingUrlWhenMessageNotLoad(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24719ae8", new Object[]{context, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !BundleSplitUtil.INSTANCE.isMsgBundleReady() && str.contains(LANDING_URL)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(LANDING_URL);
                if (TextUtils.isEmpty(queryParameter)) {
                    return false;
                }
                Nav.from(context).toUri(queryParameter);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
