package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.Initializer.kernel.TMSInitTaskExecutorType;
import com.taobao.themis.inside.Initializer.kernel.a;
import com.taobao.zcache.r;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class sxm extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1700656902);
    }

    public static /* synthetic */ Object ipc$super(sxm sxmVar, String str, Object... objArr) {
        if (str.hashCode() == -201653539) {
            super.b((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "ZCache.setup";
    }

    public sxm(String str) {
        super(str);
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public TMSInitTaskExecutorType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSInitTaskExecutorType) ipChange.ipc$dispatch("5b3e1145", new Object[]{this}) : TMSInitTaskExecutorType.NORMAL;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        super.b(application, hashMap);
        r.a(true);
    }
}
