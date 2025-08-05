package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes7.dex */
public class nku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1276082124);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (z) {
            b(context);
        } else {
            String lowerCase = Build.BRAND.toLowerCase();
            c.a("jumpPermissionPage --- BRAND : " + lowerCase, new Object[0]);
            char c = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != -759499589) {
                if (hashCode != 3620012) {
                    if (hashCode == 108389869 && lowerCase.equals(l.REDMI_MANUFACTURE_LOWER_CASE)) {
                        c = 2;
                    }
                } else if (lowerCase.equals("vivo")) {
                    c = 0;
                }
            } else if (lowerCase.equals("xiaomi")) {
                c = 1;
            }
            if (c == 0) {
                c(context);
            } else if (c == 1 || c == 2) {
                a(context);
            } else {
                b(context);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0062: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0062 */
    private static String a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        BufferedReader bufferedReader3 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
            } catch (IOException e) {
                e = e;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                try {
                    bufferedReader3.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return readLine;
            } catch (IOException e4) {
                e = e4;
                e.printStackTrace();
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader3 = bufferedReader2;
            bufferedReader3.close();
            throw th;
        }
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            String a2 = a();
            c.a("goMiaoMiMainager --- rom : " + a2, new Object[0]);
            Intent intent = new Intent();
            intent.setFlags(268435456);
            if (!"V6".equals(a2) && !"V7".equals(a2)) {
                if (!"V8".equals(a2) && !"V9".equals(a2) && !"V10".equals(a2) && !"V11".equals(a2) && !"V12".equals(a2)) {
                    b(context);
                    context.startActivity(intent);
                }
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", "com.taobao.taobao");
                context.startActivity(intent);
            }
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", "com.taobao.taobao");
            context.startActivity(intent);
        } catch (Throwable th) {
            c.a("PermissionPageUtils.goXiaoMiMainager.failed", th);
        }
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.taobao.taobao", null));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th) {
            c.a("PermissionPageUtils.goIntentSetting.failed", th);
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            intent.setAction("secure.intent.action.softPermissionDetail");
            intent.putExtra(NewHtcHomeBadger.PACKAGENAME, "com.taobao.taobao");
            intent.setFlags(268435456);
            if (a(context, intent)) {
                context.startActivity(intent);
            } else {
                b(context);
            }
        } catch (Throwable th) {
            c.a("PermissionPageUtils.goVivoMainager.failed", th);
            b(context);
        }
    }

    private static boolean a(Context context, Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        try {
            z = intent.resolveActivity(context.getPackageManager()) != null;
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            c.a("PermissionPageUtils.isIntentValid=%s", Boolean.valueOf(z));
        } catch (Throwable th2) {
            th = th2;
            c.a("PermissionPageUtils.isIntentValid.error.", th);
            return z;
        }
        return z;
    }
}
