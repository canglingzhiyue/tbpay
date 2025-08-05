package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import tb.igz;

/* loaded from: classes.dex */
public class ihe implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Object> f29021a;

    public static /* synthetic */ HashMap a(ihe iheVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e9209ad5", new Object[]{iheVar}) : iheVar.f29021a;
    }

    public ihe(HashMap<String, Object> hashMap) {
        this.f29021a = hashMap;
    }

    @Override // tb.igy
    public void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            igz.a(application, "applicationmonitor_olympic", "com.taobao.monitor.olympic.OlympicLauncher", new igz.a() { // from class: tb.ihe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.igz.a
                public void a(Class<?> cls) {
                    try {
                        Constructor<?> constructor = cls.getConstructor(Application.class, Map.class);
                        constructor.setAccessible(true);
                        ((Runnable) constructor.newInstance(application, ihe.a(ihe.this))).run();
                        ihc.a("OlympicCommand succ", new Object[0]);
                    } catch (Throwable th) {
                        ihc.a(th);
                    }
                }

                @Override // tb.igz.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ihc.a("OlympicCommand failed", new Object[0]);
                    }
                }
            });
        }
    }
}
