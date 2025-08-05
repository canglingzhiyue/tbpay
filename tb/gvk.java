package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.taobao.safemode.k;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Set;

/* loaded from: classes.dex */
public class gvk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_UNKNOWN = "UNKNOWN";
    public static final String EXTRA_KEY_DEATH_RECOVERY = "deathRecovery";
    public static final String FLAG_UNKNOWN = "UNKNOWN";
    private static gvk d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28515a;
    public final Intent b;
    public final boolean c;
    private final String e;

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final gvk f28516a = new gvk(false, new Intent().putExtra("originStartupContextEmpty", true), null, false);

        public static /* synthetic */ gvk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gvk) ipChange.ipc$dispatch("f053f42", new Object[0]) : f28516a;
        }
    }

    private gvk(boolean z, Intent intent, String str, boolean z2) {
        this.f28515a = z;
        this.b = intent;
        this.e = str;
        this.c = z2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SimpleContext{fromActivity=" + this.f28515a + ", intent=" + this.b + ", source=" + this.e + ", deathRecovery=" + this.c + '}';
    }

    private static String a(String str, String str2, String str3) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        String str4 = str2 + "=";
        int indexOf2 = str.indexOf("Intent {");
        if (indexOf2 < 0) {
            indexOf2 = 0;
        }
        int indexOf3 = str.indexOf(str4, indexOf2);
        return (indexOf3 >= 0 && (indexOf = str.indexOf(" ", str4.length() + indexOf3)) >= 0) ? str.substring(indexOf3 + str4.length(), indexOf) : str3;
    }

    public static int a(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb088fef", new Object[]{gvkVar})).intValue();
        }
        if (gvkVar != null) {
            return gvkVar.b();
        }
        return Integer.MIN_VALUE;
    }

    public static boolean f(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9397b085", new Object[]{gvkVar})).booleanValue();
        }
        if (gvkVar != null) {
            return gvkVar.b.getBooleanExtra("originStartupContextEmpty", false);
        }
        return false;
    }

    public static int b(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d98b9670", new Object[]{gvkVar})).intValue();
        }
        if (gvkVar == null) {
            return 0;
        }
        return gvkVar.c ? 2 : 1;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        TLog.loge(gve.MODULE, "startup_context", "context: " + this);
        if (!this.f28515a) {
            return this.b.getIntExtra("mode", -1);
        }
        if (a(this.b)) {
            return 1;
        }
        Uri data = this.b.getData();
        if (data == null || !"tbopen".equals(data.getScheme())) {
            return 2;
        }
        return this.b.getIntExtra("mode", 0);
    }

    private static boolean a(Intent intent) {
        Set<String> categories;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue() : "android.intent.action.MAIN".equals(intent.getAction()) && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER");
    }

    public static String c(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd753362", new Object[]{gvkVar}) : gvkVar == null ? "UNKNOWN" : gvkVar.d();
    }

    public static String d(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce21df01", new Object[]{gvkVar}) : gvkVar == null ? "UNKNOWN" : gvkVar.c();
    }

    private String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : !TextUtils.isEmpty(this.e) ? a(this.e, "flg", "UNKNOWN") : String.format("0x%08X", Integer.valueOf(this.b.getFlags()));
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.e)) {
            String a2 = a(this.e, "cmp", null);
            if (a2 != null) {
                return a2;
            }
            String str = this.e;
            return a(str, "className", str);
        }
        ComponentName component = this.b.getComponent();
        if (component == null) {
            return "UNKNOWN";
        }
        return component.getPackageName() + "/" + component.getClassName();
    }

    public static gvk a(k kVar) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gvk) ipChange.ipc$dispatch("cccc4dde", new Object[]{kVar});
        }
        if (kVar == null) {
            return a.a();
        }
        if (kVar.e != null) {
            Intent intent2 = kVar.e;
            intent2.setExtrasClassLoader(gvk.class.getClassLoader());
            intent = intent2.cloneFilter();
            intent.setFlags(intent2.getFlags());
        } else {
            intent = new Intent();
        }
        intent.setExtrasClassLoader(gvk.class.getClassLoader());
        intent.putExtra(EXTRA_KEY_DEATH_RECOVERY, kVar.g);
        return new gvk(kVar.f1531a, intent, kVar.f, kVar.g);
    }

    public static gvk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gvk) ipChange.ipc$dispatch("f053f42", new Object[0]) : d;
    }

    public static void e(gvk gvkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a514aa00", new Object[]{gvkVar});
            return;
        }
        gvk gvkVar2 = d;
        if (gvkVar2 != null && gvkVar != null) {
            gvkVar.b.putExtra("originStartupContextEmpty", gvkVar2.b.getBooleanExtra("originStartupContextEmpty", false));
        }
        d = gvkVar;
    }
}
