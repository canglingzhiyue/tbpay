package com.huawei.hms.push;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class q {
    public static int a(Context context, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle.getInt(str);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.w("ResourceLoader", "load meta data resource failed.");
            return 0;
        }
    }

    public static int a(Context context, String str, String str2) {
        StringBuilder sb;
        String str3;
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier == 0) {
                Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
                identifier = Integer.parseInt(field.get(field.getName()).toString());
                if (identifier == 0) {
                    HMSLog.i("ResourceLoader", "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + identifier);
                }
            }
            return identifier;
        } catch (ClassNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str3 = "!!!! ResourceLoader: ClassNotFoundException-resourceType=";
            sb.append(str3);
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            HMSLog.e("ResourceLoader", sb.toString(), e);
            return 0;
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            str3 = "!!!! ResourceLoader: IllegalAccessException-resourceType=";
            sb.append(str3);
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            HMSLog.e("ResourceLoader", sb.toString(), e);
            return 0;
        } catch (NumberFormatException e3) {
            e = e3;
            sb = new StringBuilder();
            str3 = "!!!! ResourceLoader: NumberFormatException-resourceType=";
            sb.append(str3);
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            HMSLog.e("ResourceLoader", sb.toString(), e);
            return 0;
        } catch (IllegalArgumentException e4) {
            e = e4;
            sb = new StringBuilder();
            str3 = "!!!! ResourceLoader: IllegalArgumentException-resourceType=";
            sb.append(str3);
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            HMSLog.e("ResourceLoader", sb.toString(), e);
            return 0;
        } catch (NoSuchFieldException e5) {
            e = e5;
            sb = new StringBuilder();
            str3 = "!!!! ResourceLoader: NoSuchFieldException-resourceType=";
            sb.append(str3);
            sb.append(str);
            sb.append("--resourceName=");
            sb.append(str2);
            HMSLog.e("ResourceLoader", sb.toString(), e);
            return 0;
        }
    }
}
