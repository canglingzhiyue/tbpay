package com.taobao.message.notification.badge;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class NewHornorHomeBadger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1274437825);
    }

    public static boolean executeBadge(Context context, ComponentName componentName, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e71d2b", new Object[]{context, componentName, new Integer(i)})).booleanValue();
        }
        try {
            String str = MsgShortcutBadger.TAG;
            TLog.loge(str, "executeBadge " + componentName + " with " + i);
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
            return true;
        } catch (Throwable th) {
            TLog.loge(MsgShortcutBadger.TAG, Log.getStackTraceString(th));
            return false;
        }
    }

    public static List<String> getSupportLaunchers() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65b9fb66", new Object[0]) : Arrays.asList("com.hihonor.android.launcher");
    }
}
