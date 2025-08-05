package tb;

import android.taobao.safemode.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.OnFileCreatedListener;
import java.io.File;
import java.util.Map;

/* loaded from: classes6.dex */
public class sfd implements OnFileCreatedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jdy f33518a;
    private final jgh b;

    public sfd(jdy jdyVar, jgh jghVar) {
        this.f33518a = jdyVar;
        this.b = jghVar;
    }

    @Override // com.taobao.android.tcrash.OnFileCreatedListener
    public void onFileCreated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
            return;
        }
        jdv d = this.f33518a.d();
        if (!d.a("OpenLitSafe", this.b.a())) {
            return;
        }
        if (!str.endsWith("jni.log") && !str.endsWith("java.log") && !str.endsWith("native.log")) {
            return;
        }
        try {
            jfj.b("LiteSafeExtra", "lite safe clean");
            if (b() <= d.a("LiteSafeCnt", 1)) {
                return;
            }
            jfr.a().a("", "clean", str);
            c();
            a();
        } catch (Throwable th) {
            jfj.b(th);
        }
    }

    private int b() throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        File file = new File(this.f33518a.a().getFilesDir(), "LiteSafe.db");
        sfe a2 = sfe.a();
        Map<String, String> a3 = a2.a(file);
        String str = a3.get("HisLiteSafeCnt");
        String valueOf = str == null ? "1" : String.valueOf(Integer.parseInt(str) + 1);
        a3.put("HisLiteSafeCnt", valueOf);
        a2.a(a3, file);
        return Integer.parseInt(valueOf);
    }

    private void c() throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        jfj.b("LiteSafeExtra", "cleanFiles");
        new a(this.f33518a.a()).b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            File file = new File(this.f33518a.a().getFilesDir(), "LiteSafe.db");
            if (!file.exists()) {
                return;
            }
            jfj.b("LiteSafeExtra", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear);
            file.delete();
        } catch (Throwable th) {
            jfj.b(th);
        }
    }
}
