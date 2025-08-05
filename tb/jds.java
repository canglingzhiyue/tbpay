package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.data.g;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.h;
import com.alibaba.triver.triver_shop.newShop.view.provider.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class jds extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f29483a;
    private final FrameLayout b;

    static {
        kge.a(-1266744953);
    }

    public static /* synthetic */ Object ipc$super(jds jdsVar, String str, Object... objArr) {
        if (str.hashCode() == 464789524) {
            return super.a((Context) objArr[0], (Fragment) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jds(g tabBarItemDataModel) {
        super(tabBarItemDataModel);
        d.c bc;
        d.c bc2;
        q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f29483a = tabBarItemDataModel;
        d g = this.f29483a.g();
        q.a(g);
        Context am = g.am();
        q.a(am);
        FrameLayout frameLayout = new FrameLayout(am);
        int i = 0;
        if (this.f29483a.a() <= 1) {
            FrameLayout frameLayout2 = frameLayout;
            o.g(frameLayout2);
            d g2 = this.f29483a.g();
            o.g(frameLayout2, (g2 == null || (bc2 = g2.bc()) == null) ? 0 : bc2.i());
        }
        FrameLayout frameLayout3 = frameLayout;
        d g3 = this.f29483a.g();
        if (g3 != null && (bc = g3.bc()) != null) {
            i = bc.i();
        }
        o.a((View) frameLayout3, true, i / 2);
        t tVar = t.INSTANCE;
        this.b = frameLayout;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.provider.a, tb.cel
    public View a(Context context, Fragment outerFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bb42014", new Object[]{this, context, outerFragment});
        }
        q.d(outerFragment, "outerFragment");
        View a2 = super.a(context, outerFragment);
        if (a2 != null) {
            o.a(this.b, a2);
        }
        return this.b;
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        h g = g();
        if (g == null) {
            return;
        }
        g.a(f);
    }
}
