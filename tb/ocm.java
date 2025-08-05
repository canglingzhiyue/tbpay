package tb;

import com.alibaba.android.split.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.bsdiff.Bsdiff;
import java.io.File;

/* loaded from: classes8.dex */
public class ocm implements xil<xik> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private xin f31915a = (xin) a.a((Class<? extends Object>) xin.class, new Object[0]);

    static {
        kge.a(984723179);
        kge.a(-2055299424);
    }

    @Override // tb.xil
    public void a(File file, File file2, xik xikVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ecbdac", new Object[]{this, file, file2, xikVar});
        } else if (file == null || !file.exists() || !this.f31915a.a(file.getAbsolutePath()).equals(xikVar.e)) {
            xikVar.f34312a = false;
            xikVar.b = -100;
            xikVar.c = "baseFile is misMatch";
        } else if (file2 == null || !file2.exists()) {
            xikVar.f34312a = false;
            xikVar.b = -101;
            xikVar.c = "patchFile is not exit";
        } else if (xikVar.d != null && xikVar.d.exists() && this.f31915a.a(xikVar.d.getAbsolutePath()).equals(xikVar.f)) {
            xikVar.f34312a = true;
        } else {
            try {
                i = Bsdiff.patch(file.getAbsolutePath(), file2.getAbsolutePath(), xikVar.d.getAbsolutePath());
            } catch (Throwable unused) {
                i = -1;
            }
            if (i == 0 && xikVar.d.exists() && this.f31915a.a(xikVar.d.getAbsolutePath()).equals(xikVar.f)) {
                xikVar.f34312a = true;
                file2.delete();
                return;
            }
            xikVar.f34312a = false;
            xikVar.b = i;
            xikVar.c = "native patch failed";
        }
    }
}
