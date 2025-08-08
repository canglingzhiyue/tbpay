package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.List;

/* loaded from: classes8.dex */
public class tjs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static tjs f34161a;

    public static tjs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tjs) ipChange.ipc$dispatch("f0afc01", new Object[0]);
        }
        if (f34161a == null) {
            synchronized (tjs.class) {
                if (f34161a == null) {
                    f34161a = new tjs();
                }
            }
        }
        return f34161a;
    }

    private tjs() {
    }

    public void a(tjt tjtVar, Context context) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438bd7ae", new Object[]{this, tjtVar, context});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true");
        if (!tgc.a() && !StringUtils.equals(config, "true")) {
            return;
        }
        if (tjtVar == null || context == null) {
            Log.e("FontSizeAdapter", "updateFontSize: params is null!");
            return;
        }
        List<TextView> b = tjtVar.b();
        if (b == null) {
            Log.e("FontSizeAdapter", "updateFontSize: There is no TextView that needs to change font size!");
            return;
        }
        int a2 = tdy.a(context);
        int a3 = tjtVar.a();
        if (a2 == a3) {
            return;
        }
        float f = tdy.fontSizeFactors[a2] / tdy.fontSizeFactors[a3];
        for (TextView textView : b) {
            if (textView != null) {
                textView.setTextSize(2, (textView.getTextSize() / context.getResources().getDisplayMetrics().scaledDensity) * f);
            }
        }
        tjtVar.a(a2);
        List<ViewGroup> c = tjtVar.c();
        if (c == null) {
            return;
        }
        for (ViewGroup viewGroup : c) {
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (layoutParams.height * f);
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }
}
