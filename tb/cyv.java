package tb;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public class cyv {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26606a = "h";

    public static String a(String str) {
        String str2;
        StringBuilder sb;
        String message;
        Context a2 = cyr.a();
        if (a2 == null) {
            return "";
        }
        try {
            return a2.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str2 = f26606a;
            sb = new StringBuilder();
            sb.append("getVersion NameNotFoundException : ");
            message = e.getMessage();
            sb.append(message);
            cyu.c(str2, sb.toString());
            return "";
        } catch (Exception e2) {
            str2 = f26606a;
            sb = new StringBuilder();
            sb.append("getVersion: ");
            message = e2.getMessage();
            sb.append(message);
            cyu.c(str2, sb.toString());
            return "";
        } catch (Throwable unused) {
            cyu.c(f26606a, "throwable");
            return "";
        }
    }
}
