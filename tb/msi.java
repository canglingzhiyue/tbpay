package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.e;
import com.taobao.mrt.utils.a;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes7.dex */
public class msi extends msj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashSet<String> b;

    static {
        kge.a(526841893);
        b = new HashSet<>();
    }

    public msi(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    @Override // tb.msj
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            a.d("MRTPythonLibsOperation", "python lib unzip error, download path null");
            return false;
        }
        File file = new File(this.f31221a.resourceRootDirectory, this.f31221a.resourceName);
        if (file.exists()) {
            e.d(file);
        }
        e.a(new File(str), new File(this.f31221a.resourceRootDirectory));
        return true;
    }

    @Override // tb.msj
    public boolean a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f31221a != null && (this.f31221a instanceof MRTPythonLibDescription)) {
            MRTPythonLibDescription mRTPythonLibDescription = (MRTPythonLibDescription) this.f31221a;
            String str = this.f31221a.resourceRootDirectory + "/" + this.f31221a.resourceName;
            File file = new File(str);
            if (file.isDirectory() && file.exists()) {
                if (!e.a(mRTPythonLibDescription.mmd5, str)) {
                    a.d("MRTPythonLibsOperation", "python lib mmd5 error!!!" + str);
                    return false;
                }
                b();
                return true;
            }
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if ("core".equalsIgnoreCase(this.f31221a.resourceName)) {
            String str = this.f31221a.resourceRootDirectory + "/" + this.f31221a.resourceName;
            try {
                if (!c(str)) {
                    AliNNPython.addPythonPath(str);
                    b(str);
                    a.a("MRTPythonLibsOperation", "python lib addPath success!!! " + str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            File file = new File(str, "innerlib");
            if (!file.exists()) {
                return;
            }
            try {
                if (c(file.getAbsolutePath())) {
                    return;
                }
                AliNNPython.addPythonPath(file.getAbsolutePath());
                b(file.getAbsolutePath());
                a.a("MRTPythonLibsOperation", "python lib addPath success!!! " + file.getAbsolutePath());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            String str2 = this.f31221a.resourceRootDirectory + "/" + this.f31221a.resourceName;
            try {
                if (!c(str2)) {
                    AliNNPython.addPythonPath(str2);
                    b(str2);
                    a.a("MRTPythonLibsOperation", "python lib addPath success!!! " + str2);
                    return;
                }
                a.a("MRTPythonLibsOperation", "python lib had add path success!!! " + str2);
            } catch (Exception e3) {
                a.a("MRTPythonLibsOperation", "python lib addPath error!!! " + str2);
                e3.printStackTrace();
            }
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        synchronized (msi.class) {
            b.add(str);
        }
    }

    private static boolean c(String str) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        synchronized (msi.class) {
            contains = b.contains(str);
        }
        return contains;
    }
}
