package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.c;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ign {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f29013a;

    static {
        kge.a(-2041910004);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        igp.a(context);
        if (!igp.a()) {
            return;
        }
        igo.a("qualityController", "TBQuality start init Controller");
        this.f29013a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!igp.a() || !a((String) c.a("appVersion", null))) {
        } else {
            b();
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str != null && str.split("\\.").length > 3;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.alibaba.flexa.compat.c.a("com.taobao.android.qualityremote.adapter.Initializer", new c.a() { // from class: tb.ign.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    igo.a("qualityController", "TBQuality awakenRemoteTestModule success");
                    try {
                        Method method = cls.getMethod("init", new Class[0]);
                        method.setAccessible(true);
                        method.invoke(null, new Object[0]);
                    } catch (Exception e) {
                        Log.e("qualityController", e.toString());
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        igo.a("qualityController", "TBQuality awakenRemoteTestModule error: classNotFound");
                    }
                }
            });
        }
    }
}
