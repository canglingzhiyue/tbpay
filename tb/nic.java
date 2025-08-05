package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.d;
import com.taobao.phenix.cache.c;
import com.taobao.phenix.cache.memory.b;

/* loaded from: classes.dex */
public class nic implements nid<nhy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nhy f31475a;
    private Integer b;
    private boolean c;

    static {
        kge.a(1071908880);
        kge.a(-1709620101);
    }

    public synchronized nhy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nhy) ipChange.ipc$dispatch("f083aff", new Object[]{this});
        } else if (d.c()) {
            return null;
        } else {
            if (this.c && this.f31475a != null) {
                return this.f31475a;
            }
            this.c = true;
            if (this.f31475a == null) {
                c<String, b> a2 = com.taobao.phenix.intf.b.h().a().a();
                if (Build.VERSION.SDK_INT >= 19 && (a2 instanceof nhy)) {
                    this.f31475a = (nhy) a2;
                    this.f31475a.a(this.b != null ? this.b.intValue() : a2.c() / 4);
                }
            } else if (this.b != null) {
                this.f31475a.a(this.b.intValue());
            }
            return this.f31475a;
        }
    }
}
