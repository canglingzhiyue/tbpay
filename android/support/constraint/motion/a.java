package android.support.constraint.motion;

import android.content.Context;
import android.view.View;
import tb.riy;

/* loaded from: classes2.dex */
public class a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + riy.BRACKET_END_STR;
    }

    public static String a(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return "?" + i;
            }
        }
        return "UNKNOWN";
    }

    public static String a(MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void a(String str, String str2, int i) {
        StackTraceElement[] stackTrace;
        String str3 = " ";
        for (int i2 = 1; i2 <= Math.min(i, new Throwable().getStackTrace().length - 1); i2++) {
            str3 = str3 + " ";
            String str4 = str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str3;
        }
    }
}
