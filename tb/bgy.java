package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import com.alibaba.android.split.k;
import com.alibaba.android.split.q;
import com.alibaba.android.split.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.model.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class bgy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APK_EXTENSION = ".apk";
    public static final String SO_EXTENSION = ".so";

    /* renamed from: a  reason: collision with root package name */
    private final File f25889a;
    private final boolean b;
    private boolean c;
    private final String d;
    private String e;
    private final bgz f;
    private final Context g;
    private final int h;

    static {
        kge.a(-944050033);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    public bgy(Context context) throws PackageManager.NameNotFoundException {
        this(context, true);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
    }

    public bgz j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgz) ipChange.ipc$dispatch("54419340", new Object[]{this}) : this.f;
    }

    public bgy(Context context, boolean z) throws PackageManager.NameNotFoundException {
        this(context, z, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
    }

    public bgy(Context context, boolean z, String str) throws PackageManager.NameNotFoundException {
        this.c = false;
        if (z) {
            this.f25889a = context.getFilesDir();
        } else {
            this.f25889a = context.getExternalFilesDir(null);
        }
        this.d = str;
        this.h = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        this.e = PreferenceManager.getDefaultSharedPreferences(context).getString("flexaLastInstalledVersionName", "");
        this.g = context;
        this.f = new bgz(this);
        this.b = true;
    }

    public bgy(Context context, boolean z, String str, boolean z2) throws PackageManager.NameNotFoundException {
        this.c = false;
        if (z) {
            this.f25889a = context.getFilesDir();
        } else {
            this.f25889a = context.getExternalFilesDir(null);
        }
        this.d = str;
        this.h = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        this.e = PreferenceManager.getDefaultSharedPreferences(context).getString("flexaLastInstalledVersionName", "");
        this.g = context;
        this.f = new bgz(this);
        this.b = z2;
    }

    public final synchronized void v() throws IOException {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        try {
            b = k.a().b().b();
            if (!b.equals(this.d)) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        File p = p();
        File[] listFiles = p.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new Comparator<File>() { // from class: tb.bgy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public /* synthetic */ int compare(File file, File file2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue() : a(file, file2);
                }

                public int a(File file, File file2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a3abf709", new Object[]{this, file, file2})).intValue() : new goo().a(file2.getName(), file.getName());
                }
            });
            for (File file : listFiles) {
                String name = file.getName();
                if (!name.equals(this.d) && !m(name) && !l(name) && !k(name)) {
                    File file2 = new File(p, name);
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 118);
                    sb.append("FileStorage: removing directory for different version name (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version Name = ");
                    sb.append(this.d);
                    sb.append(riy.BRACKET_END_STR);
                    Log.e(bgu.MODULE, sb.toString());
                    c(file2);
                }
            }
        }
        if (!b.equals(s())) {
            this.c = true;
            i(b);
        }
    }

    private boolean k(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d99648c0", new Object[]{this, str})).booleanValue() : str.contains("-") && (split = str.split("-")) != null && split[0].equals(b());
    }

    private boolean l(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23c7e201", new Object[]{this, str})).booleanValue() : str.contains("-") && (split = str.split("-")) != null && split[1].equals(b());
    }

    private boolean m(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6df97b42", new Object[]{this, str})).booleanValue() : this.f.b(str) && this.f.c(str);
    }

    public final File b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("36a9927a", new Object[]{this, str}) : new File(m(), o(str));
    }

    public final File c(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("aae8cad9", new Object[]{this, str}) : new File(d(), o(str));
    }

    public File a(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("cac70111", new Object[]{this, str, str2}) : new File(d(str), str2);
    }

    public final File k() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("4e1396db", new Object[]{this}) : new File(o(), "lock.tmp");
    }

    public final File l() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("12a578fa", new Object[]{this}) : new File(o(), a.COL_MARK);
    }

    public final File m() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("d7375b19", new Object[]{this}) : b(new File(o(), "unverified-splits"));
    }

    public final File n() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("9bc93d38", new Object[]{this}) : b(new File(o(), "downloaded-splits"));
    }

    public File d() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("ee166802", new Object[]{this}) : b(new File(o(), "verified-splits"));
    }

    public File a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str}) : b(new File(b(new File(o(), "dex")), str));
    }

    public final File o() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("605b1f57", new Object[]{this}) : b(new File(p(), this.d));
    }

    public final File p() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("24ed0176", new Object[]{this}) : b(new File(this.f25889a, "splitcompat"));
    }

    public File c() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("298485e3", new Object[]{this}) : b(new File(o(), "native-libraries"));
    }

    public File f() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("773a2c40", new Object[]{this}) : b(new File(o(), "status"));
    }

    private File n(String str) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a9a036ee", new Object[]{this, str}) : b(new File(f(), str));
    }

    public File d(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1f280338", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 23) {
            return b(new File(c(), AgooConstants.REPORT_DUPLICATE_FAIL));
        }
        return b(new File(c(), str));
    }

    public Set<q> q() throws IOException {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("7abd8e67", new Object[]{this});
        }
        File d = d();
        HashSet hashSet = new HashSet();
        File[] listFiles = d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(APK_EXTENSION)) {
                    hashSet.add(new r(file, file.getName().substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public Set<q> a(List<String> list) throws IOException {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("71463588", new Object[]{this, list});
        }
        File d = d();
        HashSet hashSet = new HashSet();
        File[] listFiles = d.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(APK_EXTENSION)) {
                    String substring = file.getName().substring(0, name.length() - 4);
                    if (list.contains(substring)) {
                        hashSet.add(new r(file, substring));
                    }
                }
            }
        }
        return hashSet;
    }

    public List r() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c435452e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = c().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public void e(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            c(d(str));
        }
    }

    public final void a(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
        } else {
            c(file);
        }
    }

    public Set<File> f(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("21880a26", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        File[] listFiles = d(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    private static String o(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd967ee0", new Object[]{str}) : str.concat(APK_EXTENSION);
    }

    public static File b(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ce89676d", new Object[]{file});
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
            return file;
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        String absolutePath = file.getAbsolutePath();
        throw new IOException(absolutePath.length() != 0 ? "Unable to create directory: ".concat(absolutePath) : new String("Unable to create directory: "));
    }

    public static void c(File file) throws IOException {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        if (!file.exists()) {
            return;
        }
        file.delete();
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        try {
            File file = new File(n(str), "emulated");
            if (file.exists()) {
                return;
            }
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue();
        }
        try {
            return new File(n(str), "emulated").exists();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.e;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            PreferenceManager.getDefaultSharedPreferences(this.g).edit().putString("flexaLastInstalledVersionName", str).commit();
        }
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{str});
        }
        if (str.endsWith(APK_EXTENSION)) {
            return str.substring(0, str.length() - 4);
        }
        return str.endsWith(SO_EXTENSION) ? str.substring(3, str.length() - 3) : str;
    }

    public Context t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("868208f3", new Object[]{this}) : this.g;
    }
}
