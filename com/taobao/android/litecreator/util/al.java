package com.taobao.android.litecreator.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.SimpleArrayMap;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.d;
import com.taobao.taobao.R;
import java.util.Arrays;
import tb.hnl;
import tb.kge;
import tb.nml;

/* loaded from: classes5.dex */
public class al {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] PERMISSION_ALBUM;
    public static final String[] PERMISSION_ALBUM_ABOVE_14;
    public static final String[] PERMISSION_CAMERA;
    public static final String[] PERMISSION_MIC;
    public static final String[] PERMISSION_STORAGE;
    public static final String READ_MEDIA_IMAGES = "android.permission.READ_MEDIA_IMAGES";
    public static final String READ_MEDIA_VIDEO = "android.permission.READ_MEDIA_VIDEO";
    public static final String READ_MEDIA_VISUAL_USER_SELECTED = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
    public static final String TB_GUANGGUANG = "TB_GUANGGUANG";

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleArrayMap<String, Integer> f13484a;

    static {
        kge.a(-858671898);
        PERMISSION_CAMERA = new String[]{com.taobao.speech.util.e.CAMERA};
        PERMISSION_STORAGE = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        PERMISSION_MIC = new String[]{"android.permission.RECORD_AUDIO"};
        PERMISSION_ALBUM = new String[]{READ_MEDIA_IMAGES, READ_MEDIA_VIDEO};
        PERMISSION_ALBUM_ABOVE_14 = new String[]{READ_MEDIA_IMAGES, READ_MEDIA_VIDEO, READ_MEDIA_VISUAL_USER_SELECTED};
        SimpleArrayMap<String, Integer> simpleArrayMap = new SimpleArrayMap<>(8);
        f13484a = simpleArrayMap;
        simpleArrayMap.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        f13484a.put("android.permission.BODY_SENSORS", 20);
        f13484a.put("android.permission.READ_CALL_LOG", 16);
        f13484a.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        f13484a.put("android.permission.USE_SIP", 9);
        f13484a.put("android.permission.WRITE_CALL_LOG", 16);
        f13484a.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        f13484a.put("android.permission.WRITE_SETTINGS", 23);
    }

    public static boolean a(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2be7ab9", new Object[]{context, str, strArr})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!a(context, str, str2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue() : b(context, str, str2) == 0;
    }

    public static int b(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be7ff669", new Object[]{context, str, strArr})).intValue();
        }
        for (String str2 : strArr) {
            int b = b(context, str, str2);
            if (b != 0) {
                return b;
            }
        }
        return 0;
    }

    private static int b(Context context, String str, String str2) {
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bbd7186", new Object[]{context, str, str2})).intValue();
        }
        try {
            a2 = com.taobao.runtimepermission.f.a(context, str, new String[]{str2});
        } catch (RuntimeException unused) {
        }
        if (a2 == null) {
            return -1;
        }
        int[] iArr = a2.b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public static String[] a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("9c85bf09", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 34 && j.c(activity) && s.C()) {
            return PERMISSION_ALBUM_ABOVE_14;
        }
        if (j.d(activity) && j.c(activity)) {
            return PERMISSION_ALBUM;
        }
        return PERMISSION_STORAGE;
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        boolean p = s.p();
        return Build.VERSION.SDK_INT >= 34 && j.c(activity) && a(p, activity, READ_MEDIA_VISUAL_USER_SELECTED) && !a(p, activity, READ_MEDIA_IMAGES);
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (!c(activity)) {
            return d(activity);
        }
        u.d("LCPermission", "Android 14 part Granted");
        return true;
    }

    public static boolean d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27d5801", new Object[]{activity})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        boolean p = s.p();
        String[] a2 = a(activity);
        if (Build.VERSION.SDK_INT >= 34 && s.D()) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            int i = 0;
            for (String str : a2) {
                boolean a3 = a(p, activity, str);
                u.d("LCPermission", "permission = " + str + ",result = " + a3 + ", useBiz = " + p);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("=");
                sb2.append(a3);
                sb2.append(";");
                sb.append(sb2.toString());
                if (a3) {
                    i++;
                    z = true;
                }
            }
            if (z && i < 3) {
                ((hnl) com.taobao.android.litecreator.service.b.a(hnl.class, new Object[0])).commitWarning("onion_album", "9009", "album_permission_error", sb.toString(), "", null);
            }
            return z;
        }
        for (String str2 : a2) {
            if (!a(p, activity, str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebce68c2", new Object[]{activity})).booleanValue();
        }
        for (String str : PERMISSION_ALBUM) {
            if (!a(s.p(), activity, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(boolean z, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("763e280c", new Object[]{new Boolean(z), activity, str})).booleanValue() : z ? a(activity, TB_GUANGGUANG, str) : ContextCompat.checkSelfPermission(activity, str) == 0;
    }

    public static void a(final Activity activity, final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ae0db6", new Object[]{activity, runnable, runnable2});
            return;
        }
        SpannableString spannableString = new SpannableString(com.alibaba.ability.localization.b.a(R.string.gg_pub_confirm_album_permission));
        spannableString.setSpan(new TextAppearanceSpan(null, 1, e.a(activity.getApplicationContext(), 16.0f), ColorStateList.valueOf(-1), null), 6, 8, 33);
        com.taobao.runtimepermission.f.a(activity, a(activity)).a(spannableString.toString()).b(false).a(1L).b(new Runnable() { // from class: com.taobao.android.litecreator.util.al.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                u.d("LCPermission", "deny, permission = " + Arrays.toString(al.a(activity)));
                if (al.b(activity)) {
                    Runnable runnable3 = runnable;
                    if (runnable3 == null) {
                        return;
                    }
                    runnable3.run();
                    return;
                }
                Runnable runnable4 = runnable2;
                if (runnable4 == null) {
                    return;
                }
                runnable4.run();
            }
        }).a(runnable2).a(new nml() { // from class: com.taobao.android.litecreator.util.al.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nml
            public void a(d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                } else if (dVar == null || dVar.b == null || dVar.f18987a == null || dVar.c == null) {
                } else {
                    int i = 0;
                    while (i < dVar.f18987a.length) {
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("permission =");
                        sb.append(dVar.f18987a[i]);
                        sb.append(",result = ");
                        sb.append(i < dVar.b.length ? dVar.b[i] : -1000);
                        sb.append(",msg = ");
                        sb.append(i < dVar.c.length ? dVar.c[i] : "");
                        objArr[0] = sb.toString();
                        u.d("LCPermission", objArr);
                        i++;
                    }
                }
            }
        }).a(true).a();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e) {
            u.d("LCPermission", "open setting page error: " + e.getMessage());
        }
    }
}
