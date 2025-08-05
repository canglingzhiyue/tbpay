package tb;

import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.animate.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes7.dex */
public class ohx implements ViewTreeObserver.OnPreDrawListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TUrlImageView f32075a;

    static {
        kge.a(20133943);
        kge.a(-1854242693);
    }

    public ohx(TUrlImageView tUrlImageView) {
        this.f32075a = tUrlImageView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        Drawable drawable = this.f32075a.getDrawable();
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            if (onq.b()) {
                if (bVar.c()) {
                    this.f32075a.setTag(R.id.tag_image_view_animation_state_on_level_page, true);
                    bVar.f();
                }
            } else {
                Object tag = this.f32075a.getTag(R.id.tag_image_view_animation_state_on_level_page);
                if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue() && !bVar.c()) {
                    this.f32075a.setTag(R.id.tag_image_view_animation_state_on_level_page, null);
                    bVar.b();
                }
            }
        }
        return true;
    }
}
