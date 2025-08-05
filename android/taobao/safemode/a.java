package android.taobao.safemode;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import java.io.File;
import java.util.ArrayList;
import tb.rfx;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f1515a = new ArrayList<>();
    private Context b;

    public a(Context context) {
        this.b = context;
        String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
        this.f1515a.add(String.format("%s/%s", absolutePath, "lib"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/deviceId_store.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/userinfo.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/userinfo_backup.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/com.taobao.tao.welcome.Welcome.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "app_tombstone"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/instant_patch.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/safemode_sp.xml"));
        this.f1515a.add(String.format("%s/%s", absolutePath, "shared_prefs/SafeModeOrange.xml"));
        try {
            File externalCacheDir = this.b.getExternalCacheDir();
            if (externalCacheDir != null) {
                this.f1515a.add(new File(externalCacheDir, rfx.HOTPATCH).getAbsolutePath());
            }
            File filesDir = this.b.getFilesDir();
            if (filesDir == null) {
                return;
            }
            this.f1515a.add(new File(filesDir, "instant-patch").getAbsolutePath());
            this.f1515a.add(new File(filesDir, "swallows").getAbsolutePath());
            this.f1515a.add(new File(filesDir, "splitcompat").getAbsolutePath());
        } catch (Exception unused) {
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            InstantPatcher.create(this.b).purge();
            c(new File(new File(this.b.getFilesDir().getParentFile(), "shared_prefs"), "instant_patch.xml"));
            File file = new File(this.b.getExternalCacheDir(), rfx.HOTPATCH);
            if (file.exists()) {
                a(file);
            }
            File file2 = new File(this.b.getFilesDir(), "instant-patch");
            if (!file2.exists()) {
                return;
            }
            a(file2);
        } catch (Exception unused) {
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b(this.b.getFilesDir().getParentFile());
        try {
            File externalCacheDir = this.b.getExternalCacheDir();
            if (externalCacheDir == null || externalCacheDir.getParentFile() == null) {
                return;
            }
            File parentFile = externalCacheDir.getParentFile();
            b(parentFile);
            parentFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f1515a.contains(str);
    }

    private void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    c(file2);
                    String str = "delete1:" + file2.toString();
                } else {
                    a(file2);
                    file2.delete();
                    String str2 = "delete2:" + file2.toString();
                }
            }
        }
    }

    private void b(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{this, file});
        } else if (file != null && file.exists() && !file.isFile() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    if (a(file2.getAbsolutePath())) {
                        Log.e("Clear", "keep:" + file2.getAbsolutePath());
                    } else {
                        c(file2);
                        String str = "delete1:" + file2.toString();
                    }
                } else if (a(file2.getAbsolutePath())) {
                    Log.e("Clear", "keep:" + file2.getAbsolutePath());
                } else {
                    b(file2);
                    file2.delete();
                    String str2 = "delete2:" + file2.toString();
                }
            }
        }
    }

    private static void c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        File file2 = new File(file.getAbsolutePath() + "tmp");
        file.renameTo(file2);
        file2.delete();
        Log.e("Clear", "delete2:" + file.getAbsolutePath());
    }
}
