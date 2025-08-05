package tb;

import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.f;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class acy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25256a;
    public static boolean b;
    public static acy c;
    public f d = null;

    public static /* synthetic */ void a(acy acyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc61ae1", new Object[]{acyVar});
        } else {
            acyVar.f();
        }
    }

    public static /* synthetic */ void b(acy acyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce492162", new Object[]{acyVar});
        } else {
            acyVar.e();
        }
    }

    public static /* synthetic */ void c(acy acyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccc27e3", new Object[]{acyVar});
        } else {
            acyVar.d();
        }
    }

    public static /* synthetic */ void d(acy acyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4f2e64", new Object[]{acyVar});
        } else {
            acyVar.c();
        }
    }

    static {
        kge.a(582719789);
        f25256a = false;
        b = true;
        c = new acy();
    }

    public static acy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (acy) ipChange.ipc$dispatch("f023f67", new Object[0]) : c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String[] strArr = {onj.groupName};
        this.d = new f() { // from class: tb.acy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.f
            public void onConfigUpdate(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str});
                    return;
                }
                acy.a(acy.this);
                acy.b(acy.this);
                acy.c(acy.this);
                acy.d(acy.this);
            }
        };
        OrangeConfig.getInstance().registerListener(strArr, this.d);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(onj.groupName, "memory_trigger_rate", "8");
            String config2 = OrangeConfig.getInstance().getConfig(onj.groupName, "memory_trigger_max", "8");
            String config3 = OrangeConfig.getInstance().getConfig(onj.groupName, "memory_trigger_enable", "true");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.putString("memory_trigger_rate", config);
            edit.putString("memory_trigger_max", config2);
            edit.putString("memory_trigger_enable", config3);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(onj.groupName, "fpsmonitor", "true");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.putString("fpsmonitor", config);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(onj.groupName, "sellerTalk", "false");
            if (!TextUtils.isEmpty(config)) {
                z = "true".equals(config);
            }
        } catch (Exception unused) {
        }
        f25256a = z;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(onj.groupName, "video_close", "false");
        boolean equals = !TextUtils.isEmpty(config) ? "true".equals(config) : false;
        if (!equals) {
            equals = a("video_close_phone");
        }
        if (equals) {
            z = false;
        }
        b = z;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig(onj.groupName, str, "");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        return config.contains(Build.BRAND + ":" + Build.MODEL);
    }
}
