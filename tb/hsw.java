package tb;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/megautils/MiuiUtils;", "", "()V", "OPS_NFC", "", "getMIUIPermissionIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "hasMIUINfcPermission", "", "hasPermission", "ops", "isMIUI", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class hsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hsw INSTANCE = new hsw();

    private hsw() {
    }

    public final Intent a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41646cb3", new Object[]{this, context});
        }
        q.d(context, "context");
        try {
            try {
                Intent intent = new Intent();
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", context.getPackageName());
                return intent;
            } catch (Exception unused) {
                Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                intent2.putExtra("extra_pkgname", context.getPackageName());
                return intent2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private final boolean a(Context context, int i) {
        if (!a()) {
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT < 19) {
                return false;
            }
            Object systemService = context.getSystemService("appops");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
            }
            AppOpsManager appOpsManager = (AppOpsManager) systemService;
            Method checkOpNoThrow = appOpsManager.getClass().getDeclaredMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            q.b(checkOpNoThrow, "checkOpNoThrow");
            checkOpNoThrow.setAccessible(true);
            Object invoke = checkOpNoThrow.invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Process.myUid()), context.getPackageName());
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            Integer num = (Integer) invoke;
            return num != null && num.intValue() == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : n.a("xiaomi", Build.MANUFACTURER, true);
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        q.d(context, "context");
        return hsx.INSTANCE.a(context) & a(context, 10016);
    }
}
