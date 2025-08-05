package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jfx implements jft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jfs f29529a;
    private final a c;
    private final jdy d;
    private final jgd e;

    /* loaded from: classes6.dex */
    public interface a {
        boolean a(jfv jfvVar);
    }

    public jfx(jdy jdyVar) {
        this(jdyVar, null);
    }

    public jfx(jdy jdyVar, a aVar) {
        this.d = jdyVar;
        this.f29529a = new jfu(jdyVar);
        this.c = aVar;
        this.e = new jgd(jdyVar.a(), jdyVar.c());
    }

    private jfv b(jfv jfvVar) {
        File a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfv) ipChange.ipc$dispatch("571f11cd", new Object[]{this, jfvVar}) : (this.e.a(jfvVar.a()) || (a2 = jgu.a(this.d, jfvVar.a(), jfvVar.b())) == null) ? jfvVar : new jfv(a2, jfvVar.b());
    }

    private void c(final jfv jfvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc50aee0", new Object[]{this, jfvVar});
        } else {
            this.f29529a.a(jfvVar.a(), jfvVar.b(), new jfy() { // from class: tb.jfx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jfs.a
                public void a(File file, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c85d0ed5", new Object[]{this, file, new Boolean(z)});
                        return;
                    }
                    jgj.a("FileSender", Boolean.valueOf(z), file.getAbsolutePath());
                    if (z) {
                        jfr.a().a("STAGE_ANR_HAPPENED_SEND_SUCC", "TCrash", jfvVar.b());
                        jgl.b(file);
                        return;
                    }
                    jfr.a().a("STAGE_ANR_HAPPENED_SEND_FAIL", "TCrash", jfvVar.b());
                    jfj.b("send failed", file.getAbsolutePath());
                }
            });
        }
    }

    @Override // tb.jft
    public void a(jfv jfvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4aa1de", new Object[]{this, jfvVar});
            return;
        }
        File a2 = jfvVar.a();
        if (a2 == null || !a2.exists()) {
            jfj.b("FileSender", "invalid file");
        } else if (a2.length() <= 0) {
            jfj.b("FileSender", "empty file");
            jgl.b(a2);
        } else {
            a aVar = this.c;
            if (aVar != null && aVar.a(jfvVar)) {
                jfr.a().a("STAGE_ANR_SEND_INTERRUPT", "TCrash", jfvVar.b());
            } else {
                c(b(jfvVar));
            }
        }
    }
}
