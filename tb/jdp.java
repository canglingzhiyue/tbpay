package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private File f29480a;

    public static jdp a(jdy jdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdp) ipChange.ipc$dispatch("1ec800b7", new Object[]{jdyVar});
        }
        String c = jdyVar.c();
        try {
            Application a2 = jdyVar.a();
            File dir = a2.getDir("anr_" + c, 0);
            if (!dir.exists()) {
                dir.mkdir();
            }
            return new jdp(dir);
        } catch (Exception e) {
            jfj.b(e);
            return new jdp(null);
        }
    }

    private jdp(File file) {
        File file2;
        if (file != null) {
            try {
                file2 = new File(file, "anr.idle");
            } catch (Exception e) {
                jfj.b(e);
                return;
            }
        } else {
            file2 = null;
        }
        this.f29480a = file2;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            if (this.f29480a != null) {
                return this.f29480a.exists();
            }
        } catch (Exception e) {
            jfj.b(e);
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.f29480a == null || this.f29480a.exists()) {
                return;
            }
            this.f29480a.createNewFile();
        } catch (Exception e) {
            jfj.b(e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.f29480a == null || !this.f29480a.exists()) {
                return;
            }
            this.f29480a.delete();
        } catch (Exception e) {
            jfj.b(e);
        }
    }
}
