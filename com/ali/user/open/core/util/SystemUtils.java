package com.ali.user.open.core.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ali.user.open.core.context.KernelContext;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import tb.kge;

/* loaded from: classes2.dex */
public class SystemUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1453890117);
    }

    public static String getApkPublicKeyDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("709bdea5", new Object[0]);
        }
        try {
            PackageInfo packageInfo = KernelContext.getApplicationContext().getPackageManager().getPackageInfo(KernelContext.getApplicationContext().getPackageName(), 64);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getPublicKey().toString().getBytes());
            return CommonUtils.getHashString(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    public static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isAppsInstalled(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("758ed4d1", new Object[]{context, str})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getPackageInfo(str, 256);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }
}
