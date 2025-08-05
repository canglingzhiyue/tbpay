package tb;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.inside.Initializer.kernel.TMSInitTaskExecutorType;
import com.taobao.themis.inside.Initializer.kernel.a;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class sxh extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1924382347);
    }

    public static /* synthetic */ Object ipc$super(sxh sxhVar, String str, Object... objArr) {
        if (str.hashCode() == -201653539) {
            super.b((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "Weex2.init";
    }

    public sxh(String str) {
        super(str);
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public TMSInitTaskExecutorType a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSInitTaskExecutorType) ipChange.ipc$dispatch("5b3e1145", new Object[]{this}) : TMSInitTaskExecutorType.NORMAL;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : com.taobao.themis.inside.Initializer.a.a().get() == 0 || com.taobao.themis.inside.Initializer.a.a().get() == 1;
    }

    @Override // com.taobao.themis.inside.Initializer.kernel.a
    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        super.b(application, hashMap);
        b(application);
    }

    private void b(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
            return;
        }
        v c = t.c(application.getApplicationContext(), "postDelayInitWeexV2");
        if (c.b() && c.d() != 0) {
            Handler c2 = com.taobao.themis.kernel.utils.a.c();
            TMSLogger.d(a.TAG, "Weex2InitTask postDelay index: " + c.d());
            if (c2 != null) {
                c2.postDelayed(new Runnable() { // from class: tb.sxh.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        sxh.a(application);
                        com.taobao.themis.inside.Initializer.a.a().set(1);
                    }
                }, c.d() * 1000);
            }
        } else {
            a(application);
            com.taobao.themis.inside.Initializer.a.a().set(1);
        }
        s.f18233a.d().a("postDelayInitWeexV2", c.a());
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            e.a().a(application);
        }
    }
}
