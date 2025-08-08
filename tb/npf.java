package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.srp.ui.list.a;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.search.common.util.r;
import com.taobao.search.refactor.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class npf implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final npd f31622a;
    private final Activity b;

    static {
        kge.a(589261883);
        kge.a(-675779691);
    }

    public npf(Activity activity) {
        q.c(activity, "activity");
        this.b = activity;
        this.f31622a = new npd();
    }

    @Override // com.taobao.android.meta.srp.ui.list.a
    public View a(com.taobao.android.meta.data.a combo, View.OnClickListener clickListener) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42009657", new Object[]{this, combo, clickListener});
        }
        q.c(combo, "combo");
        q.c(clickListener, "clickListener");
        if (r.cy()) {
            TBErrorView tBErrorView = new TBErrorView(this.b);
            tBErrorView.setStatus(TBErrorView.Status.STATUS_EMPTY);
            nvr y = ((e) combo).y();
            if (y != null) {
                if (!StringUtils.isEmpty(y.c)) {
                    tBErrorView.setIconUrl(y.c);
                }
                if (!StringUtils.isEmpty(y.f31791a)) {
                    tBErrorView.setTitle(y.f31791a);
                }
                if (!StringUtils.isEmpty(y.b)) {
                    tBErrorView.setSubTitle(y.b);
                }
                if (y.d) {
                    tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.app_refresh), clickListener);
                } else {
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
                    tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                }
            }
            return tBErrorView;
        }
        View view = LayoutInflater.from(this.b).inflate(R.layout.sf_tbsearch_ms_error, (ViewGroup) null, false);
        Activity activity = this.b;
        q.a((Object) view, "view");
        npg.a(activity, view);
        String str = "https://gw.alicdn.com/tfs/TB1uI.xbLJNTKJjSspoXXc6mpXa-330-330.png";
        String a2 = b.a(R.string.taobao_app_1005_1_16692);
        q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16692)");
        String a3 = b.a(R.string.taobao_app_1005_1_16676);
        q.a((Object) a3, "Localization.localizedSt….taobao_app_1005_1_16676)");
        nvr y2 = ((e) combo).y();
        if (y2 != null) {
            if (!StringUtils.isEmpty(y2.c)) {
                str = y2.c;
                q.a((Object) str, "it.imageUrl");
            }
            if (!StringUtils.isEmpty(y2.f31791a)) {
                a2 = y2.f31791a;
                q.a((Object) a2, "it.title");
            }
            if (!StringUtils.isEmpty(y2.b)) {
                a3 = y2.b;
                q.a((Object) a3, "it.subTitle");
            }
            z = y2.d;
        } else {
            z = false;
        }
        View findViewById = view.findViewById(R.id.tipLogo);
        q.a((Object) findViewById, "view.findViewById<TUrlImageView>(R.id.tipLogo)");
        ((TUrlImageView) findViewById).setImageUrl(str);
        View findViewById2 = view.findViewById(R.id.tipTitle);
        q.a((Object) findViewById2, "view.findViewById<TextView>(R.id.tipTitle)");
        ((TextView) findViewById2).setText(a2);
        View findViewById3 = view.findViewById(R.id.tipContent);
        q.a((Object) findViewById3, "view.findViewById<TextView>(R.id.tipContent)");
        ((TextView) findViewById3).setText(a3);
        TextView textView = (TextView) view.findViewById(R.id.expandBtn);
        if (textView != null) {
            if (z) {
                textView.setVisibility(0);
                textView.setText(b.a(R.string.app_reload));
                textView.setOnClickListener(clickListener);
            } else {
                textView.setVisibility(8);
                textView.setOnClickListener(null);
            }
        }
        return view;
    }

    @Override // com.taobao.android.meta.srp.ui.list.a
    public View b(com.taobao.android.meta.data.a combo, View.OnClickListener clickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79f17176", new Object[]{this, combo, clickListener});
        }
        q.c(combo, "combo");
        q.c(clickListener, "clickListener");
        npd npdVar = this.f31622a;
        Activity activity = this.b;
        ResultError resultError = null;
        if (!(combo instanceof e)) {
            combo = null;
        }
        e eVar = (e) combo;
        if (eVar != null) {
            resultError = eVar.i();
        }
        return npdVar.a(activity, resultError, clickListener);
    }

    @Override // com.taobao.android.meta.srp.ui.list.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View view = LayoutInflater.from(this.b).inflate(R.layout.sf_tbsearch_ms_loading, (ViewGroup) null, false);
        q.a((Object) view, "view");
        npg.a((Context) this.b, view);
        return view;
    }
}
