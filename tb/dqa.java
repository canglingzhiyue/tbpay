package tb;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes7.dex */
public class dqa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int A_TYPE_AFTER_BUY_DEFAULT = 5001;
    public static final int A_TYPE_IS_DEFAULT = -1;
    public static final int A_TYPE_LITE_DETAIL_IS_GUIDE_VIDEO = 4001;
    public static final int A_TYPE_LITE_DETAIL_IS_TU_WEN = 4002;
    public static final int A_TYPE_LIVE_TYPE_IS_ZHI_BO = 3001;
    public static final int A_TYPE_NEW_DETAIL = 1001;

    /* renamed from: a  reason: collision with root package name */
    public String f26902a;
    public boolean b;
    public boolean c;
    public View d;
    public Drawable e;
    public boolean f;
    public int g;
    public int h = -1;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        kge.a(-1094424840);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.f26902a;
        if (str2 != null && str != null) {
            return str2.contains(str);
        }
        return false;
    }

    public static Bundle a(dqa dqaVar, Nav nav, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("caff4749", new Object[]{dqaVar, nav, bundle});
        }
        if (dqaVar != null && nav != null && dqaVar.c) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("extraEnableTransition", Boolean.TRUE.booleanValue());
            if (dqaVar.k) {
                bundle.putBoolean("extraEnableTraNoData", Boolean.TRUE.booleanValue());
            }
            if (dqaVar.l) {
                bundle.putBoolean("extraEnableTraStyleData", Boolean.TRUE.booleanValue());
            }
            View view = dqaVar.d;
            if (view != null) {
                if (dqaVar.j) {
                    if (ldj.a("orange_key_enable_only_source_location", true)) {
                        nav.withSourceViewLocation(dqaVar.d);
                        bundle.putString("extraFrameAnimReason", "animSuccess-withSourceViewLocation-running");
                    } else {
                        ldf.d("buildNavFromAnimParams", "withSharedElement . screenshotAsync false.");
                        nav.withSharedElement(dqaVar.d, false);
                        bundle.putString("extraFrameAnimReason", "animSuccess-withSharedElement-running");
                    }
                } else {
                    nav.withSharedElement(view);
                    bundle.putString("extraFrameAnimReason", "animSuccess-withSharedElement");
                }
            }
            if (dqaVar.f) {
                nav.disableTransition();
            }
            Drawable drawable = dqaVar.e;
            if (drawable != null) {
                nav.withSourceViewDrawable(drawable);
            }
            int i = dqaVar.g;
            if (i > 0) {
                bundle.putFloat("anim_main_image_view_height", i);
            }
            ldf.d("buildNavFromAnimParams", "命中无极缩放跳转动画，默认导航动画已禁用。");
        }
        return bundle;
    }
}
