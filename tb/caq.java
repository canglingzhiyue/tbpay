package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alibaba.android.split.a;
import com.alibaba.android.split.s;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class caq implements cap {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";
    public static final String FEATURES_SHOULD_REMOTE_DOWNLOAD = "features_should_remote_download";

    /* renamed from: a  reason: collision with root package name */
    private bgu f26240a = (bgu) a.b(bgu.class, "SplitSourceInternal");
    private xin b = (xin) a.a((Class<? extends Object>) xin.class, new Object[0]);

    @Override // tb.cap
    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        if (b(context, str) && !c(context, str)) {
            i = 0;
        }
        return context.getSharedPreferences("split_install_source", 0).getInt(f(context, str), i);
    }

    @Override // tb.cap
    public boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{this, context, str})).booleanValue() : d(context, str);
    }

    private boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f161bcb", new Object[]{this, context, str})).booleanValue() : EVO.isSwitchOpened(context, b(str)) || e(context, str);
    }

    private boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e0bdaa", new Object[]{this, context, str})).booleanValue();
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
            return sharedPreferences.getStringSet("features_should_remote_download_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, new HashSet()).contains(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // tb.cap
    public boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{this, context, str})).booleanValue();
        }
        File file = new File(context.getApplicationInfo().nativeLibraryDir, a(str));
        if (file.exists() && a(file, str)) {
            bgu bguVar = this.f26240a;
            bguVar.d("local splitFile exited:" + str, new Object[0]);
            return true;
        }
        bgu bguVar2 = this.f26240a;
        bguVar2.d("local splitFile not exited:" + str, new Object[0]);
        return false;
    }

    private boolean a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{this, file, str})).booleanValue();
        }
        String str2 = ((s) a.a((Class<? extends Object>) s.class, new Object[0])).a(str).md5;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(this.b.a(file.getAbsolutePath()));
    }

    @Override // tb.cap
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return "lib" + str + bgy.SO_EXTENSION;
    }

    @Override // tb.cap
    public void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{this, context, str, new Integer(i)});
        } else {
            context.getSharedPreferences("split_install_source", 0).edit().putInt(f(context, str), i).commit();
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "ab_switch_" + str;
    }

    private String f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a2efbb", new Object[]{this, context, str});
        }
        try {
            return "installFromLocal_" + str + "_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "installFromLocal_" + str;
        }
    }
}
