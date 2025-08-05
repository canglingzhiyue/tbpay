package com.alibaba.poplayer.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.result.Result;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.lang.ref.WeakReference;
import java.util.Objects;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f3222a;

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue() : Objects.equals(obj, obj2);
    }

    public static <T> T a(WeakReference<T> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7adabc", new Object[]{weakReference});
        }
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equals("*") || str.equals("-")) {
            return true;
        }
        try {
            h hVar = new h(str2);
            if (str.contains("|")) {
                try {
                    int indexOf = str.indexOf("|");
                    String substring = str.substring(0, indexOf);
                    String[] split = str.substring(indexOf + 1).split(",");
                    if (split.length > 0) {
                        for (String str3 : split) {
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    if (new h(str3).equals(hVar)) {
                                        return false;
                                    }
                                } catch (IllegalArgumentException e) {
                                    c.a("CommonConfigRule.versionCheck.check enum version error.", e);
                                    return false;
                                }
                            }
                        }
                    }
                    str = substring;
                } catch (Throwable th) {
                    c.a("CommonConfigRule.versionCheck.check enum version error.", th);
                    return false;
                }
            } else {
                c.a("CommonConfigRule.versionCheck.no exclude info.", new Object[0]);
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (!str.contains("-")) {
                String[] split2 = str.split(",");
                if (split2.length > 0) {
                    for (String str4 : split2) {
                        try {
                        } catch (IllegalArgumentException e2) {
                            c.a("CommonConfigRule.versionCheck.check enum version error.", e2);
                        }
                        if (new h(str4).equals(hVar)) {
                            c.a("CommonConfigRule.versionCheck.enum.success", new Object[0]);
                            return true;
                        }
                        continue;
                    }
                }
            } else {
                String[] split3 = str.split("-");
                boolean endsWith = str.endsWith("-");
                String str5 = Result.MSG_SUCCESS;
                if (endsWith && split3.length == 1) {
                    try {
                        if (hVar.a(new h(split3[0])) < 0) {
                            z = false;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("CommonConfigRule.versionCheck.Interval.Start.");
                        if (!z) {
                            str5 = "Fail";
                        }
                        sb.append(str5);
                        c.a(sb.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e3) {
                        c.a("CommonConfigRule.versionCheck.check end version error.", e3);
                    }
                } else if (str.startsWith("-") && split3.length == 2) {
                    try {
                        if (hVar.a(new h(split3[1])) > 0) {
                            z = false;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CommonConfigRule.versionCheck.Interval.End.");
                        if (!z) {
                            str5 = "Fail";
                        }
                        sb2.append(str5);
                        c.a(sb2.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e4) {
                        c.a("CommonConfigRule.versionCheck.check start version error.", e4);
                    }
                } else if (split3.length == 2) {
                    try {
                        h hVar2 = new h(split3[0]);
                        h hVar3 = new h(split3[1]);
                        if (hVar2.a(hVar3) > 0 || hVar.a(hVar3) > 0 || hVar.a(hVar2) < 0) {
                            z = false;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("CommonConfigRule.versionCheck.Interval.End.");
                        if (!z) {
                            str5 = "Fail";
                        }
                        sb3.append(str5);
                        c.a(sb3.toString(), new Object[0]);
                        return z;
                    } catch (IllegalArgumentException e5) {
                        c.a("CommonConfigRule.versionCheck.check start end version error.", e5);
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e6) {
            c.a(true, "CommonConfigRule.versionCheck.format curVersion error.", (Throwable) e6);
            return false;
        }
    }

    static {
        kge.a(1126259301);
        f3222a = 0;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            if (f3222a > 0) {
                return f3222a;
            }
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                f3222a = resources.getDimensionPixelSize(identifier);
            }
            return f3222a;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
                return ((systemUiVisibility & 1024) == 1024) || ((systemUiVisibility & 512) == 512);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue() : com.alibaba.poplayer.layermanager.f.f3197a && activity.isChild() && (activity.getParent() instanceof Activity);
    }

    public static String a(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            c.a("Utils.convertStreamToString.InMainThread!!!");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                a(fileInputStream);
                return new String(bArr);
            } catch (Throwable th2) {
                th = th2;
                try {
                    c.a("Utils.convertStreamToString.error.", th);
                    return "";
                } finally {
                    a(fileInputStream);
                }
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public static void b(String str, String str2) {
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            c.a("Utils.saveStringToFile.InMainThread!!!");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                file.delete();
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            a(bufferedWriter);
            a(bufferedWriter);
        } catch (Throwable th2) {
            bufferedWriter2 = bufferedWriter;
            th = th2;
            try {
                c.a("Utils.saveStringToFile.error.", th);
            } finally {
                a(bufferedWriter2);
            }
        }
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue() : (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{context, new Float(f)})).floatValue() : a(context, f, true);
    }

    public static float a(Context context, float f, boolean z) {
        float intValue;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c630f64", new Object[]{context, new Float(f), new Boolean(z)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        Pair<Integer, Integer> a2 = e.a(context);
        if (z) {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = 750.0f;
        } else {
            intValue = f * ((Integer) a2.first).intValue();
            f2 = 1300.0f;
        }
        float f3 = intValue / f2;
        double d = f3;
        if (d > 0.005d && f3 < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }

    public static float b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a785791", new Object[]{context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float intValue = (f * 750.0f) / ((Integer) e.a(context).first).intValue();
        double d = intValue;
        if (d > 0.005d && intValue < 1.0f) {
            return 1.0f;
        }
        return (float) Math.rint(d);
    }
}
