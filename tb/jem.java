package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes6.dex */
public class jem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final jdy f29503a;
    private final a b;
    private final String d;

    /* loaded from: classes6.dex */
    public interface a {
        void b(String str);
    }

    public static /* synthetic */ void lambda$u3zzg8gCwkeWPZ4Xp7z4TEQtqTM(jem jemVar) {
        jemVar.b();
    }

    public static jem a(jdy jdyVar, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jem) ipChange.ipc$dispatch("f278dcfa", new Object[]{jdyVar, aVar}) : new jem(jdyVar, "/data/anr", aVar);
    }

    private jem(jdy jdyVar, String str, a aVar) {
        this.f29503a = jdyVar;
        this.b = aVar;
        this.d = str;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        File file = new File(str);
        if (file.exists()) {
            return new jen(this.f29503a.a(), file).a();
        }
        return false;
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        synchronized (aVar) {
            if (str.contains("trace") && a(str)) {
                this.b.b(str);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            jdu.a().b().execute(new Runnable() { // from class: tb.-$$Lambda$jem$u3zzg8gCwkeWPZ4Xp7z4TEQtqTM
                @Override // java.lang.Runnable
                public final void run() {
                    jem.lambda$u3zzg8gCwkeWPZ4Xp7z4TEQtqTM(jem.this);
                }
            });
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        b(this.d + "/traces.txt");
    }
}
