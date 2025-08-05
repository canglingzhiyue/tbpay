package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.provider.TBActivityProvider;
import com.taobao.android.detail.provider.TBAppProvider;
import com.taobao.android.detail.provider.TBNavProvider;
import com.taobao.android.detail.provider.TBShareProvider;
import com.taobao.android.detail.provider.TBTrackProvider;
import com.taobao.android.detail.provider.b;
import com.taobao.android.detail.provider.c;
import com.taobao.android.detail.provider.d;
import com.taobao.android.detail.provider.e;
import com.taobao.android.detail.provider.f;
import com.taobao.android.detail.provider.g;
import com.taobao.tao.Globals;

/* loaded from: classes3.dex */
public class car {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(523355526);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b(context);
        }
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        a();
        ezw.a(Globals.getApplication());
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (euy.a()) {
        } else {
            euy.a(new TBAppProvider());
            euy.a(new TBActivityProvider());
            euy.a(new TBNavProvider());
            euy.a(new TBShareProvider());
            euy.a(new TBTrackProvider());
            euy.a(new b());
            euy.a(new f());
            euy.a(new d());
            euy.a(new g());
            euy.a(new e());
            try {
                euy.a(new c());
            } catch (Exception e) {
                e.printStackTrace();
            }
            euy.a(true);
        }
    }
}
