package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.taobao.R;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class npg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-655011068);
    }

    public static final void a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628634d8", new Object[]{activity, view});
            return;
        }
        q.c(activity, "activity");
        q.c(view, "view");
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        if (fVar == null || !fVar.g()) {
            return;
        }
        view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        ((TextView) view.findViewById(R.id.tipTitle)).setTextColor(-1);
        ((TextView) view.findViewById(R.id.tipContent)).setTextColor(-1);
        ((TextView) view.findViewById(R.id.expandBtn)).setTextColor(-1);
        ((TextView) view.findViewById(R.id.expandBtn)).setBackgroundResource(R.drawable.tbsearch_rounded_corner_reload_dk);
    }

    public static final void a(Context activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{activity, view});
            return;
        }
        q.c(activity, "activity");
        q.c(view, "view");
        if (!(activity instanceof f)) {
            activity = null;
        }
        f fVar = (f) activity;
        if (fVar != null && fVar.g()) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
            TextView textView = (TextView) view.findViewById(R.id.tv_loading);
            if (textView == null) {
                return;
            }
            textView.setTextColor(-1);
            return;
        }
        int parseColor = Color.parseColor("#999999");
        view.setBackgroundColor(-1);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_loading);
        if (textView2 == null) {
            return;
        }
        textView2.setTextColor(parseColor);
    }
}
