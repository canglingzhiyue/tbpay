package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.Initializer.kernel.TMSInitTaskExecutorType;
import com.taobao.themis.inside.Initializer.kernel.a;
import com.taobao.zcache.r;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class sxj extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1086130957);
    }

    public static /* synthetic */ Object ipc$super(sxj sxjVar, String str, Object... objArr) {
        if (str.hashCode() == -201653539) {
            super.b((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "ZCache.startUpdate";
    }

    public sxj(String str) {
        super(str);
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public TMSInitTaskExecutorType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSInitTaskExecutorType) ipChange.ipc$dispatch("5b3e1145", new Object[]{this}) : TMSInitTaskExecutorType.IDLE;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : com.taobao.themis.inside.Initializer.a.c().get() == 0 || com.taobao.themis.inside.Initializer.a.c().get() == 1;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        super.b(application, hashMap);
        f();
        com.taobao.themis.inside.Initializer.a.c().set(1);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            r.b();
        }
    }
}
