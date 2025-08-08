package tb;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class jdy extends jdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f29490a;
    private jdv b = new jdv(new HashMap());

    public jdy(Application application) {
        this.f29490a = application;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : this.f29490a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String a2 = a("APP_VERSION", "");
        return StringUtils.isEmpty(a2) ? jgr.a(this.f29490a) : a2;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        String a2 = a(SessionManager.CURRENT_PROCESS, "");
        return StringUtils.isEmpty(a2) ? jgr.b(this.f29490a) : a2;
    }

    public jdv d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdv) ipChange.ipc$dispatch("261b4a3f", new Object[]{this}) : this.b;
    }

    public void a(jdv jdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e72dc", new Object[]{this, jdvVar});
        } else {
            this.b = jdvVar;
        }
    }
}
