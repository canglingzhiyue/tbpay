package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.Initializer.kernel.TMSInitTaskExecutorType;
import com.taobao.themis.inside.Initializer.kernel.a;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class sxf extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1387156184);
    }

    public static /* synthetic */ Object ipc$super(sxf sxfVar, String str, Object... objArr) {
        if (str.hashCode() == -201653539) {
            super.b((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "Triver.init";
    }

    public sxf(String str) {
        super(str);
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public TMSInitTaskExecutorType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSInitTaskExecutorType) ipChange.ipc$dispatch("5b3e1145", new Object[]{this}) : TMSInitTaskExecutorType.IDLE;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public void b(Application application, HashMap<String, Object> hashMap) {
        super.b(application, hashMap);
        try {
            Class.forName("com.alibaba.triver.TriverInitializerNew").getDeclaredMethod("init", Application.class, HashMap.class).invoke(null, application, hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
