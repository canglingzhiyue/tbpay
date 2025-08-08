package com.taobao.adaemon;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;
import com.taobao.atools.StaticHook;
import com.xiaomi.mipush.sdk.Constants;
import mtopsdk.common.util.SymbolExpUtil;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361e", new Object[]{context, str})).longValue();
        }
        ApplicationExitInfo c = c(context, str);
        if (c == null) {
            return 0L;
        }
        int reason = c.getReason();
        int a2 = a(c);
        String description = c.getDescription();
        if (StringUtils.isEmpty(description)) {
            return 0L;
        }
        if (description.contains("remove task")) {
            return c.getTimestamp();
        }
        String str2 = Build.BRAND;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1675632421:
                if (str2.equals("Xiaomi")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2432928:
                if (str2.equals("OPPO")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3620012:
                if (str2.equals("vivo")) {
                    c2 = 4;
                    break;
                }
                break;
            case 68924490:
                if (str2.equals("HONOR")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2141820391:
                if (str2.equals("HUAWEI")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0 ? !(reason != 10 || a2 != 22 || !description.contains("remove task")) : !(c2 == 1 ? reason != 10 || a2 != 21 || !description.contains("due to SwipeUpClean") : c2 == 2 ? reason != 10 || a2 != 0 || !description.contains("iAwareF[SystemManager]") : c2 == 3 ? reason != 10 || a2 != 21 || !description.contains("iAwareF[SystemManager]") : c2 != 4 || reason != 10 || a2 != 0 || !description.contains("due to single-cleaner"))) {
            z = true;
        }
        if (!z) {
            return 0L;
        }
        return c.getTimestamp();
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str});
        }
        ApplicationExitInfo c = c(context, str);
        g.b bVar = null;
        if (c == null) {
            return null;
        }
        String replaceAll = StringUtils.isEmpty(c.getDescription()) ? "" : c.getDescription().replaceAll(SymbolExpUtil.SYMBOL_VERTICALBAR, Constants.WAVE_SEPARATOR);
        if (l.l(context)) {
            bVar = g.b().o();
        }
        StringBuilder sb = new StringBuilder(1024);
        sb.append(c.getTimestamp());
        sb.append("|");
        sb.append(c.getPid());
        sb.append("|");
        sb.append(c.getRealUid());
        sb.append("|");
        sb.append(c.getProcessName());
        sb.append("|");
        sb.append(c.getReason());
        sb.append("|");
        sb.append(a(c));
        sb.append("|");
        sb.append(c.getImportance());
        sb.append("|");
        sb.append(c.getPss());
        sb.append("|");
        sb.append(c.getRss());
        sb.append("|");
        sb.append(c.getStatus());
        sb.append("|");
        sb.append(replaceAll);
        if (bVar != null && bVar.f8358a == c.getPid()) {
            sb.append("|");
            sb.append(bVar.g);
            sb.append("|");
            sb.append(bVar.b);
            sb.append("|");
            sb.append(bVar.e);
            sb.append("|");
            sb.append(bVar.f);
            sb.append("|");
            sb.append(bVar.c);
            sb.append("|");
            sb.append(bVar.d);
        }
        return sb.toString();
    }

    private static ApplicationExitInfo c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplicationExitInfo) ipChange.ipc$dispatch("db78f42b", new Object[]{context, str});
        }
        ApplicationExitInfo applicationExitInfo = null;
        for (ApplicationExitInfo applicationExitInfo2 : ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 16)) {
            if (str.equals(applicationExitInfo2.getProcessName()) && (applicationExitInfo == null || applicationExitInfo2.getTimestamp() > applicationExitInfo.getTimestamp())) {
                applicationExitInfo = applicationExitInfo2;
            }
        }
        return applicationExitInfo;
    }

    private static int a(ApplicationExitInfo applicationExitInfo) {
        try {
            return ((Integer) StaticHook.a(ApplicationExitInfo.class, "getSubReason", new Class[0]).invoke(applicationExitInfo, new Object[0])).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }
}
