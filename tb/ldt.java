package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.h;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.phenix.intf.b;

/* loaded from: classes7.dex */
public class ldt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1042980178);
    }

    public boolean a(ljs ljsVar, String str, View view) {
        Activity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("233318a9", new Object[]{this, ljsVar, str, view})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 21 || !a(ljsVar) || (a2 = a(view)) == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("image");
            String queryParameter2 = parse.getQueryParameter("transition");
            if (!TextUtils.isEmpty(queryParameter) && TextUtils.equals("scale", queryParameter2)) {
                ViewCompat.setTransitionName(view, "similar_activity_transition");
                b.h().a(queryParameter).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "5401").fetch();
                if (((RecyclerView) view.getParent()).getItemAnimator().isRunning()) {
                    ldf.d("CustomAnimationNav", "======= getItemAnimator isRunning =========");
                    ((RecyclerView) view.getParent()).getItemAnimator().endAnimations();
                }
                final Bundle bundle = new Bundle();
                bundle.putString("transition", queryParameter2);
                bundle.putString("imageUrl", queryParameter);
                final ActivityOptionsCompat makeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(a2, view, "similar_activity_transition");
                h.a aVar = new h.a() { // from class: tb.ldt.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
                    public /* synthetic */ int c() {
                        return h.a.CC.$default$c(this);
                    }

                    @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
                    public /* synthetic */ Fragment d() {
                        return h.a.CC.$default$d(this);
                    }

                    @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
                    public /* synthetic */ boolean e() {
                        return h.a.CC.$default$e(this);
                    }

                    @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
                    public Bundle a() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Bundle) ipChange2.ipc$dispatch("d1a37f2c", new Object[]{this}) : makeSceneTransitionAnimation.toBundle();
                    }

                    @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
                    public Bundle b() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Bundle) ipChange2.ipc$dispatch("1bd5186d", new Object[]{this}) : bundle;
                    }
                };
                ldi.a(a2, aVar, str + "&wx_mute_loading_indicator=true");
                return true;
            }
            return false;
        } catch (Throwable th) {
            ldf.a("CustomAnimationNav", "handleScaleNav error", th);
            return false;
        }
    }

    private boolean a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eb5407", new Object[]{this, ljsVar})).booleanValue();
        }
        int b = b(ljsVar);
        int a2 = a();
        ldf.a("CustomAnimationNav", "isSupportTransition: configScore=" + b + ", deviceScore=" + a2);
        return a2 >= b;
    }

    private int b(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16e5a77", new Object[]{this, ljsVar})).intValue();
        }
        IConfigService iConfigService = (IConfigService) ljsVar.a(IConfigService.class);
        if (iConfigService == null) {
            ldf.d("CustomAnimationNav", "configService is null.");
            return 40;
        }
        return iConfigService.getIntValue("transitionScore", 40);
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        Integer b = ldc.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    private Activity a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c7b91d7e", new Object[]{this, view});
        }
        Context context = view.getContext();
        while (context != null && !(context instanceof Activity)) {
            boolean z = context instanceof fpz;
            if (z) {
                context = ((fpz) context).a();
            } else {
                context = z ? ((fpz) context).a() : null;
            }
        }
        if (context != null) {
            return (Activity) context;
        }
        return null;
    }
}
