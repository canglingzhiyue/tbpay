package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class gty {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WELCOME_NAME = "com.taobao.tao.welcome.Welcome";

    /* renamed from: a  reason: collision with root package name */
    private static a f28454a;

    /* loaded from: classes.dex */
    public static final class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f28455a;

        public a(b bVar) {
            this.f28455a = bVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac13492", new Object[]{this, sharedPreferences, str});
            } else if (!"shouldcreateprovision".equals(str) || !gty.a(sharedPreferences)) {
            } else {
                this.f28455a.b();
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b();
    }

    public static /* synthetic */ boolean a(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25d70980", new Object[]{sharedPreferences})).booleanValue() : b(sharedPreferences);
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac6b1a6", new Object[]{context, bVar});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        if (f28454a == null) {
            f28454a = new a(bVar);
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(f28454a);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : !a(context, "shouldcreateprovision", true);
    }

    private static boolean b(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cf4fa5f", new Object[]{sharedPreferences})).booleanValue() : !a(sharedPreferences, "shouldcreateprovision", true);
    }

    private static boolean a(SharedPreferences sharedPreferences, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d96ef52", new Object[]{sharedPreferences, str, new Boolean(z)})).booleanValue() : sharedPreferences.getBoolean(str, z);
    }

    private static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue() : a(context.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0), str, z);
    }
}
