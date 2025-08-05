package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.infoflow.core.engine.env.protocol.h;

/* loaded from: classes.dex */
public class lma implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";

    static {
        kge.a(-2084190121);
        kge.a(-837295658);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.h
    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        Context a2 = swc.a(context);
        if (a2 != null) {
            context = a2;
        }
        return Nav.from(context).toUri(str);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.h
    public boolean a(Context context, h.a aVar, String str, View view, dqa dqaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9faed26", new Object[]{this, context, aVar, str, view, dqaVar})).booleanValue();
        }
        Context a2 = swc.a(context);
        if (a2 != null) {
            context = a2;
        }
        Nav from = Nav.from(context);
        Bundle a3 = aVar.a();
        Bundle b = aVar.b();
        dqa.a(dqaVar, from, b);
        if (a3 != null) {
            from.withOptions(a3);
        }
        if (aVar.e()) {
            a(from, b);
        }
        if (b != null) {
            from.withExtras(b);
        }
        if (aVar.c() > 0) {
            if (aVar.d() != null) {
                from.withFragment(aVar.d());
            }
            try {
                from.forResult(aVar.c());
            } catch (Exception e) {
                ldf.a("TbDefaultInfoFlowNav", "nav for result error", e);
            }
        }
        if (aVar.e()) {
            return from.toUriSimple(Uri.parse(str));
        }
        return from.toUri(str);
    }

    private void a(Nav nav, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88921c1", new Object[]{this, nav, bundle});
        } else if (nav == null || bundle == null) {
        } else {
            nav.withOptions(bundle);
            bundle.putBoolean("ndExtraDataHasAppend", true);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.h
    public boolean a(Context context, h.a aVar, String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd394f2", new Object[]{this, context, aVar, str, view, new Boolean(z)})).booleanValue();
        }
        Context a2 = swc.a(context);
        if (a2 != null) {
            context = a2;
        }
        Nav from = Nav.from(context);
        Bundle a3 = aVar.a();
        Bundle b = aVar.b();
        if (aVar.c() > 0) {
            if (aVar.d() != null) {
                from.withFragment(aVar.d());
            }
            try {
                from.forResult(aVar.c());
            } catch (Exception e) {
                ldf.a("TbDefaultInfoFlowNav", "nav for result error", e);
            }
        }
        if (aVar.e()) {
            a(from, b);
        }
        if (a3 != null) {
            from.withOptions(aVar.a());
        }
        if (b != null) {
            from.withExtras(aVar.b());
            if (z && view != null) {
                try {
                    b.putString("extraFrameAnimReason", "animSuccess-withSharedElement");
                    from.withSharedElement(view).disableTransition();
                    ldf.d("TbDefaultInfoFlowNav", "命中无极缩放跳转动画，默认导航动画已禁用。");
                    if (aVar.e()) {
                        return from.toUriSimple(str);
                    }
                    return from.toUri(str);
                } catch (Throwable th) {
                    sfo.a(b);
                    ldf.d("TbDefaultInfoFlowNav", "未知异常。新动画跳转失败，将自动降级。");
                    b.putString("extraFrameAnimReason", "animError:" + th.getCause());
                }
            }
        }
        if (aVar.e()) {
            return from.toUriSimple(Uri.parse(str));
        }
        return from.toUri(str);
    }
}
