package tb;

import android.content.Context;
import android.support.v7.app.AppCompatDelegate;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.b;

/* loaded from: classes8.dex */
public class sen implements seo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1598054599);
        kge.a(470922778);
    }

    @Override // tb.seo
    public void a(AppCompatDelegate appCompatDelegate, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10bf13d", new Object[]{this, appCompatDelegate, context});
            return;
        }
        int max = Math.max(b.b(context) / 2, b.a(context, 375.0f));
        FrameLayout frameLayout = (FrameLayout) appCompatDelegate.a(R.id.container);
        if (frameLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = max;
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
    }
}
