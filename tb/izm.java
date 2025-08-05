package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.megadesign.dx.view.a;
import com.taobao.android.megadesign.dx.view.b;
import com.taobao.android.megadesign.dx.view.c;
import com.taobao.android.megadesign.dx.view.d;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class izm implements amk<ak> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String NAME_SPACE_MEGA_DESIGN = "NAME_SPACE_MEGA_DESIGN";

    static {
        kge.a(1945357307);
        kge.a(198462063);
        Companion = new a(null);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(868039043);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.amk
    public Map<String, ak> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        try {
            return ai.a(j.a(String.valueOf(c.Companion.a()), new c.a()), j.a(String.valueOf((long) com.taobao.android.megadesign.dx.view.a.DXMALOTTIEVIEW_MALOTTIEVIEW), new a.C0549a()), j.a(String.valueOf((long) b.DXORDERMARQUEETEXTVIEW_ORDERMARQUEETEXTVIEW), new b.a()), j.a(String.valueOf((long) d.DXTBORDERSCROLLERLAYOUT_TBORDERSCROLLERLAYOUT), new d.a()));
        } catch (NoClassDefFoundError unused) {
            return ai.a();
        }
    }
}
