package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.android.split.a;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.android.split.t;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes.dex */
public class bhw implements bhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bgy f25917a;
    private String b;

    public bhw(String str) {
        this.b = str;
    }

    @Override // tb.bhv
    public boolean a(String str) {
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!v.d(k.a().b().t(), str) && (a2 = k.a().b().j().a(this.b)) != null && a2.exists()) {
                this.f25917a = new bgy(k.a().b().t(), true, a2.getName(), false);
                return this.f25917a.c(str).exists();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override // tb.bhv
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        bgy bgyVar = this.f25917a;
        if (bgyVar == null) {
            return null;
        }
        String b = bgyVar.b();
        if (!b.contains("-")) {
            return null;
        }
        return b.split("-")[0];
    }

    @Override // tb.bhv
    public boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Log.e("FeatureSourceStrategy", "installPreloadFeature:" + str);
            if (k.a().a(context, true, this.f25917a, str) && p.a() != null && p.a().a().contains(str)) {
                t.a().b(str, "preload");
                ((j) a.a((Class<? extends Object>) j.class, new Object[0])).a(str, true, "install_preload_" + this.f25917a.b(), System.currentTimeMillis() - currentTimeMillis, 0, "", this.f25917a.a());
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
