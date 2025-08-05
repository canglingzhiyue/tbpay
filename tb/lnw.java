package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lnv;

/* loaded from: classes7.dex */
public class lnw extends lnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(85377294);
    }

    public static /* synthetic */ Object ipc$super(lnw lnwVar, String str, Object... objArr) {
        if (str.hashCode() == -2041972450) {
            return super.a(((Number) objArr[0]).longValue(), ((Boolean) objArr[1]).booleanValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lnw(Context context, lnv.a aVar) {
        super(context, aVar);
    }

    @Override // tb.lnu
    public Animation a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("8649f91e", new Object[]{this, new Long(j), new Boolean(z)});
        }
        Rect rect = new Rect();
        View view = this.b.get();
        if (!z && view != null && view.getGlobalVisibleRect(rect)) {
            ldf.a("IconGuidAnimeScale", rect.toString());
            if (a(rect, view)) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, rect.centerX(), 0, rect.centerY());
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(j);
                return scaleAnimation;
            }
        }
        ldf.d("IconGuidAnimeScale", "targetView not visible.check homepage sever response!");
        return super.a(j, z);
    }

    private boolean a(Rect rect, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c29d005", new Object[]{this, rect, view})).booleanValue() : ((double) (((float) rect.width()) / ((float) view.getWidth()))) > 0.5d && ((double) (((float) rect.height()) / ((float) view.getHeight()))) > 0.5d;
    }
}
