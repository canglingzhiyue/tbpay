package com.huawei.hms.push;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class f {
    private static int a(Context context) {
        int i = context.getApplicationInfo().icon;
        if (i == 0) {
            int identifier = context.getResources().getIdentifier("btn_star_big_on", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "android");
            HMSLog.d("PushSelfShowLog", "icon is btn_star_big_on ");
            if (identifier != 0) {
                return identifier;
            }
            HMSLog.d("PushSelfShowLog", "icon is sym_def_app_icon ");
            return 17301651;
        }
        return i;
    }

    public static Bitmap a(Context context, m mVar) {
        String str;
        if (context == null || mVar == null) {
            return null;
        }
        try {
            if (HwBuildEx.VERSION.EMUI_SDK_INT >= 11) {
                HMSLog.i("PushSelfShowLog", "huawei phone, and emui5.0, need not show large icon.");
                return null;
            } else if ("com.huawei.android.pushagent".equals(mVar.k())) {
                return null;
            } else {
                HMSLog.i("PushSelfShowLog", "get left bitmap from " + mVar.k());
                return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(mVar.k())).getBitmap();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str = "build left icon occur NameNotFoundException.";
            HMSLog.e("PushSelfShowLog", str);
            return null;
        } catch (Exception unused2) {
            str = "build left icon occur Exception.";
            HMSLog.e("PushSelfShowLog", str);
            return null;
        }
    }

    public static void a(Context context, Notification.Builder builder, m mVar) {
        if (context == null || builder == null || mVar == null) {
            HMSLog.e("PushSelfShowLog", "msg is null");
        } else {
            builder.setSmallIcon(b(context, mVar));
        }
    }

    private static int b(Context context, m mVar) {
        int i = 0;
        if (context == null || mVar == null) {
            HMSLog.i("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
            return 0;
        }
        if (!TextUtils.isEmpty(mVar.m())) {
            String[] split = mVar.m().split("/");
            if (split.length == 3) {
                i = q.a(context, split[1], split[2]);
            }
        }
        if (i == 0) {
            i = q.a(context, "com.huawei.messaging.default_notification_icon");
        }
        return i == 0 ? a(context) : i;
    }
}
