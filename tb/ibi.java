package tb;

import com.alibaba.security.realidentity.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class ibi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTL_REFL_TYPE_CUBE_BACK = "cube_back";
    public static final String MTL_REFL_TYPE_CUBE_BOTTOM = "cube_bottom";
    public static final String MTL_REFL_TYPE_CUBE_FRONT = "cube_front";
    public static final String MTL_REFL_TYPE_CUBE_LEFT = "cube_left";
    public static final String MTL_REFL_TYPE_CUBE_RIGHT = "cube_right";
    public static final String MTL_REFL_TYPE_CUBE_TOP = "cube_top";
    public static final String MTL_REFL_TYPE_SPHERE = "sphere";

    /* renamed from: a  reason: collision with root package name */
    public ibh f28891a;
    private Logger c = Logger.getLogger(ibi.class.getName());
    public File b = null;

    static {
        kge.a(1682605474);
    }

    public ibi(ibh ibhVar, String str, BufferedReader bufferedReader) throws IOException {
        this.f28891a = null;
        this.f28891a = ibhVar;
        ibhVar.a(str);
        a(bufferedReader);
        ibhVar.e(str);
    }

    private void a(BufferedReader bufferedReader) throws IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda20159", new Object[]{this, bufferedReader});
            return;
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String trim = readLine.trim();
                if (trim.length() != 0 && !trim.startsWith("#")) {
                    if (trim.startsWith("vt")) {
                        b(trim);
                    } else if (trim.startsWith("vn")) {
                        c(trim);
                    } else if (trim.startsWith("v")) {
                        a(trim);
                    } else if (trim.startsWith("f")) {
                        d(trim);
                    } else if (trim.startsWith(at.f)) {
                        e(trim);
                    } else if (trim.startsWith(o.b)) {
                        f(trim);
                    } else if (trim.startsWith("s")) {
                        g(trim);
                    } else if (trim.startsWith("p")) {
                        h(trim);
                    } else if (trim.startsWith("l")) {
                        i(trim);
                    } else if (trim.startsWith("maplib")) {
                        k(trim);
                    } else if (trim.startsWith("usemap")) {
                        l(trim);
                    } else if (trim.startsWith("usemtl")) {
                        j(trim);
                    } else if (!trim.startsWith("mtllib")) {
                        Logger logger = this.c;
                        Level level = Level.WARNING;
                        logger.log(level, "line " + i + " unknown line |" + trim + "|");
                    }
                    i++;
                }
            } else {
                bufferedReader.close();
                Logger logger2 = this.c;
                Level level2 = Level.INFO;
                logger2.log(level2, "Loaded " + i + " lines");
                return;
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        float[] a2 = ibj.a(3, str, 1);
        this.f28891a.a(a2[0], a2[1], a2[2]);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        float[] a2 = ibj.a(2, str, 2);
        this.f28891a.a(a2[0], a2[1]);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        float[] a2 = ibj.a(3, str, 2);
        this.f28891a.b(a2[0], a2[1], a2[2]);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f28891a.c(ibj.a(str.substring(1).trim(), 3));
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f28891a.a(ibj.a(str.substring(1).trim()));
        }
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.f28891a.b(str.substring(1).trim());
        }
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        String trim = str.substring(1).trim();
        if (!trim.equalsIgnoreCase("off")) {
            i = Integer.parseInt(trim);
        }
        this.f28891a.a(i);
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.f28891a.a(ibj.a(str.substring(1).trim(), 1));
        }
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            this.f28891a.b(ibj.a(str.substring(1).trim(), 2));
        }
    }

    private void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.f28891a.d(str.substring(6).trim());
        }
    }

    private void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            this.f28891a.b(ibj.a(str.substring(6).trim()));
        }
    }

    private void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            this.f28891a.c(str.substring(6).trim());
        }
    }
}
