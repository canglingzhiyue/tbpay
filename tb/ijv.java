package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ijv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f29101a;
    private final iju b;

    public ijv(Application application, iju ijuVar) {
        this.f29101a = application;
        this.b = ijuVar;
    }

    public File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.f29101a.getDir("swallows", 0);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return this.f29101a.getFilesDir().getPath() + File.separator + "swallows";
    }

    public List<File> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        try {
            ArrayList<File> arrayList = new ArrayList();
            iku.a(new File(b()), arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (File file : arrayList) {
                iku.a(file, arrayList2);
            }
            return arrayList2;
        } catch (Throwable th) {
            ikq.a("StorageManager->listLibDirPath", th);
            return Collections.emptyList();
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (ikw.a((CharSequence) str)) {
            throw RSoException.error(7001, "libStorageKey is empty");
        }
        return b() + File.separator + this.b.b() + File.separator + str;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String a2 = a(str2);
        return a2 + File.separator + str;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (ikw.a((CharSequence) str)) {
            ikq.a("getAvailableLibPath", "localFileName = " + str + ", libStorageKey = " + str2);
            return null;
        }
        try {
            File file = new File(a(str, str2));
            if (!file.exists()) {
                RSoLog.c("storage -> " + str + "  " + str2 + " not found");
                return null;
            } else if (!file.isFile()) {
                ikq.a("storage,getLibPath,file.isFile=false", "storage -> target so file is not a file" + file.getPath());
                return null;
            } else if (file.length() < 1) {
                ikq.a("storage,getLibPath,file.length() < 1", "storage -> target so file is not a file" + file.getPath());
                return null;
            } else {
                return file.getPath();
            }
        } catch (Throwable th) {
            ikq.a("storage ->  error ", th);
            return null;
        }
    }
}
