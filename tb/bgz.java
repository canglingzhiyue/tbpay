package tb;

import android.text.TextUtils;
import com.alibaba.android.split.a;
import com.alibaba.android.split.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class bgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25891a;
    private bgy b;
    private bgu f = (bgu) a.b(bgu.class, "SplitFileSyncer");
    private String d = null;
    private idj e = new goo();
    private j c = (j) a.a((Class<? extends Object>) j.class, new Object[0]);

    static {
        kge.a(1009062263);
    }

    public bgz(bgy bgyVar) {
        this.b = bgyVar;
        this.f25891a = this.b.s();
    }

    public final File a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str});
        }
        try {
            File[] listFiles = this.b.p().listFiles();
            if (listFiles == null) {
                return null;
            }
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].getName().contains("-") && (split = listFiles[i].getName().split("-")) != null && split.length == 2 && split[1].equals(str)) {
                    return listFiles[i];
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !str.contains(".") || str.split("\\.").length < 4;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            try {
                this.b.v();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this.d;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        bgu bguVar = this.f;
        bguVar.d("SplitFileSyncer", "LastestAppVersion:" + b.a().h() + "-------" + str);
        if (b.a().h().contains(str)) {
            if (TextUtils.isEmpty(this.d)) {
                this.d = str;
                return true;
            } else if (this.d.equals(str)) {
                return true;
            } else {
                if (this.e.a(str, this.d) >= 0) {
                    this.d = str;
                    return true;
                }
            }
        }
        return false;
    }
}
