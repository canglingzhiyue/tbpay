package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.adapter.factory.FastSpFactory;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import com.taobao.android.boutique.fastsp.face.factory.SysSharedPreferencesFactory;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class kgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1095069496);
    }

    public Object a(Context context) {
        SharedPreferencesFactory sharedPreferencesFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c902fed2", new Object[]{this, context});
        }
        try {
            File filesDir = context.getFilesDir();
            File file = new File("/data/local/tmp/fastsp.db");
            boolean exists = file.exists();
            tco.a(exists);
            if (!exists) {
                file = new File(filesDir, "fastsp.db");
            }
            kgm kgmVar = new kgm(kgn.a().a(file));
            if (kgmVar.a("useOptSp", true)) {
                a(kgmVar);
                String[] split = kgmVar.a("writeOnceSet", "").split(";");
                HashSet hashSet = new HashSet();
                for (String str : split) {
                    hashSet.add(str);
                }
                sharedPreferencesFactory = new FastSpFactory(hashSet);
            } else {
                sharedPreferencesFactory = null;
            }
            if (sharedPreferencesFactory == null) {
                sharedPreferencesFactory = new SysSharedPreferencesFactory();
            }
            return kgmVar.a("useMonitor", false) ? new jml(sharedPreferencesFactory) : sharedPreferencesFactory;
        } catch (Throwable th) {
            tco.a(th);
            tco.c("SharedPreferencesFactoryRef", "init");
            return new SysSharedPreferencesFactory();
        }
    }

    private void a(kgm kgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1097aa7", new Object[]{this, kgmVar});
        } else if (!kgmVar.a("closeDoubleWrite", false)) {
        } else {
            qmx.f32948a = false;
        }
    }
}
