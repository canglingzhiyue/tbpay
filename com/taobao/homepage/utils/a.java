package com.taobao.homepage.utils;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2104545647);
    }

    public static boolean a(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean b(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled() && c(context);
    }

    private static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        Intent intent = new Intent("android.accessibilityservice.AccessibilityService");
        intent.addCategory("android.accessibilityservice.category.FEEDBACK_SPOKEN");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 15) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Cursor query = contentResolver.query(Uri.parse("content://" + it.next().serviceInfo.packageName + ".providers.StatusProvider"), null, null, null, null);
                if (query != null && query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    if (i == 1) {
                        z2 |= true;
                    }
                }
            }
            return z2;
        } else if (Build.VERSION.SDK_INT >= 26) {
            boolean z3 = false;
            for (ResolveInfo resolveInfo : queryIntentServices) {
                z3 |= a(context, resolveInfo.serviceInfo.packageName + "/" + resolveInfo.serviceInfo.name);
            }
            return z3;
        } else {
            ArrayList arrayList = new ArrayList();
            for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
                arrayList.add(runningServiceInfo.service.getPackageName());
            }
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                if (arrayList.contains(resolveInfo2.serviceInfo.packageName)) {
                    z |= true;
                }
            }
            return z;
        }
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(riy.CONDITION_IF_MIDDLE);
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
        if (string != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
