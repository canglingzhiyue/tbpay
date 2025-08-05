package org.android.agoo.intent;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.kge;

/* loaded from: classes.dex */
public final class IntentUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_COMMAND = "command";
    private static final String INTENT_FROM_AGOO_COMMAND = ".intent.action.COMMAND";
    private static final String INTENT_FROM_STARTACTIVITY_COMMAND = ".intent.action.startActivity.COMMAND";
    private static final String INTENT_FROM_THIRDPUSH_COMMAND = ".intent.thirdPush.action.COMMAND";
    private static final String TAG = "IntentUtil";

    static {
        kge.a(-825091821);
    }

    public static final Intent createActivityIntent(Context context, String str, Intent intent) {
        Intent intent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("7785cd12", new Object[]{context, str, intent});
        }
        try {
            intent2 = new Intent();
        } catch (Throwable th) {
            th = th;
            intent2 = null;
        }
        try {
            intent2.setAction(context.getPackageName() + INTENT_FROM_STARTACTIVITY_COMMAND);
            intent2.setPackage(context.getPackageName());
            intent2.setClassName(context, "com.taobao.agoo.AgooStartActivityService");
            intent2.putExtra("command", str);
            intent2.putExtras(intent.getExtras());
        } catch (Throwable th2) {
            th = th2;
            ALog.w(TAG, "createComandIntent", th, new Object[0]);
            return intent2;
        }
        return intent2;
    }

    public static final Intent createComandIntent(Context context, String str) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("6be63396", new Object[]{context, str});
        }
        try {
            intent = new Intent();
        } catch (Throwable th) {
            th = th;
            intent = null;
        }
        try {
            intent.setAction(context.getPackageName() + INTENT_FROM_AGOO_COMMAND);
            intent.setPackage(context.getPackageName());
            intent.putExtra("command", str);
        } catch (Throwable th2) {
            th = th2;
            ALog.e(TAG, "createComandIntent", th, new Object[0]);
            return intent;
        }
        return intent;
    }

    public static final Intent createThirdpushComandIntent(Context context, String str) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("47bd65bf", new Object[]{context, str});
        }
        try {
            intent = new Intent();
        } catch (Throwable th) {
            th = th;
            intent = null;
        }
        try {
            intent.setAction(getThirdPushCommand(context));
            intent.setPackage(context.getPackageName());
            intent.putExtra("command", str);
        } catch (Throwable th2) {
            th = th2;
            ALog.w(TAG, "createComandIntent", th, new Object[0]);
            return intent;
        }
        return intent;
    }

    public static final String getAgooCommand(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c5960e", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_AGOO_COMMAND;
        } catch (Throwable th) {
            ALog.w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }

    public static final String getThirdPushCommand(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("960a9fff", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName() + INTENT_FROM_THIRDPUSH_COMMAND;
        } catch (Throwable th) {
            ALog.w(TAG, "getAgooCommand", th, new Object[0]);
            return null;
        }
    }
}
