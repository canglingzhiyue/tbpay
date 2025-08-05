package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.igz;

/* loaded from: classes6.dex */
public class ihf implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            igz.a(application, "applicationmonitor_olympic", "com.taobao.monitor.olympic.OlympicOrangeLauncher", new igz.a() { // from class: tb.ihf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.igz.a
                public void a(Class<?> cls) {
                    try {
                        Constructor<?> constructor = cls.getConstructor(new Class[0]);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(new Object[0]);
                        Method declaredMethod = cls.getDeclaredMethod("init", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(newInstance, new Object[0]);
                        ihc.a("OlympicOrangeCommand succ", new Object[0]);
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
                        ihc.a("OlympicOrangeCommand failed", new Object[0]);
                    }
                }
            });
        }
    }
}
