package android.taobao.windvane.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static i f1561a;
    private h b;
    private boolean c;

    static {
        kge.a(37183566);
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f82546fd", new Object[0]);
        }
        if (f1561a == null) {
            synchronized (i.class) {
                if (f1561a == null) {
                    f1561a = new i();
                }
            }
        }
        return f1561a;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10fe258", new Object[]{this, hVar});
        } else if (hVar == null || TextUtils.isEmpty(hVar.e) || TextUtils.isEmpty(hVar.h)) {
        } else {
            this.b = hVar;
            this.c = true;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }
}
