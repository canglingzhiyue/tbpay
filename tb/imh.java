package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.a;
import com.taobao.android.revisionswitch.core.b;
import com.taobao.android.revisionswitch.core.g;
import com.taobao.android.revisionswitch.utils.LocationHelper;

/* loaded from: classes.dex */
public class imh implements imi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ilw f29152a;
    private ilw b;
    private ilw c;
    private Context d;

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : ilw.KEY_MAIN_ARCH_UPGRADE;
    }

    public imh(g gVar) {
        this.f29152a = gVar.b();
        this.b = gVar.c();
        this.c = gVar.g();
        this.d = gVar.d();
    }

    @Override // tb.imi
    public boolean a() {
        a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (LocationHelper.a(this.d) != 1) {
            return this.f29152a.a(ilw.KEY_NEW_FACE_ENABLE) && this.f29152a.a(b()) && this.b.a(ilw.KEY_NEW_FACE_ENABLE) && this.b.a(b());
        }
        ilw ilwVar = this.f29152a;
        return (ilwVar instanceof b) && (c = ((b) ilwVar).c()) != null && c.b(b()) && this.b.a(b());
    }
}
