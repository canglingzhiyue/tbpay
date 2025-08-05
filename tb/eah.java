package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.datasdk.model.viewmodel.main.a;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.epl;

/* loaded from: classes4.dex */
public class eah extends c<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View g;
    private View h;
    private View i;
    private View j;
    private TextView k;
    private TextView l;
    private LinearLayout m;

    static {
        kge.a(-192725239);
    }

    public static /* synthetic */ Object ipc$super(eah eahVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.DivisionViewHolder";
    }

    public eah(Context context) {
        super(context);
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58395532", new Object[]{this, aVar});
            return;
        }
        if (aVar.b == 4) {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
        }
        if (aVar.f10065a == 1) {
            this.g.setVisibility(0);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.h.setVisibility(8);
            this.l.setVisibility(8);
        } else if (aVar.f10065a == 2) {
            this.i.setVisibility(0);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
        } else {
            String str = "";
            if (aVar.f10065a == 3) {
                this.k.setVisibility(8);
                RelativeLayout relativeLayout = (RelativeLayout) d.b(this.f9568a, R.layout.x_detail_divider_with_text_and_icon);
                DetailImageView detailImageView = (DetailImageView) relativeLayout.findViewById(R.id.divider_logo);
                if (!TextUtils.isEmpty(aVar.f)) {
                    epj.b().a(aVar.f, detailImageView, new epl.a().a(true).a());
                    detailImageView.setVisibility(0);
                } else {
                    detailImageView.setVisibility(8);
                }
                this.m.addView(relativeLayout, new LinearLayout.LayoutParams(-1, epo.b(40)));
                if (aVar.e != null) {
                    str = aVar.e;
                }
                TextView textView = (TextView) relativeLayout.findViewById(R.id.divider_text);
                textView.setText(str);
                if (!TextUtils.isEmpty(aVar.g)) {
                    textView.setTextColor(com.taobao.android.detail.core.utils.c.a(aVar.g));
                }
            } else if (aVar.f10065a == 4) {
                this.k.setVisibility(8);
                this.i.setVisibility(8);
                this.j.setVisibility(8);
                this.l.setVisibility(0);
                if (aVar.e != null) {
                    str = aVar.e;
                }
                this.l.setText(str);
            } else if (aVar.f10065a == 5) {
                this.j.setVisibility(0);
                this.i.setVisibility(0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, epo.b(6));
                } else {
                    layoutParams.height = epo.b(6);
                }
                this.i.setLayoutParams(layoutParams);
                this.k.setVisibility(8);
                this.l.setVisibility(8);
                this.m.setBackgroundColor(this.f9568a.getResources().getColor(R.color.detail_e));
            } else if (aVar.f10065a == 6) {
                this.k.setVisibility(8);
                View inflate = View.inflate(this.f9568a, R.layout.x_detail_highlight_divider, null);
                DetailImageView detailImageView2 = (DetailImageView) inflate.findViewById(R.id.divider_logo);
                if (!TextUtils.isEmpty(aVar.f)) {
                    epj.b().a(aVar.f, detailImageView2, new epl.a().a(true).a());
                    detailImageView2.setVisibility(0);
                } else {
                    detailImageView2.setVisibility(8);
                }
                this.m.addView(inflate, new LinearLayout.LayoutParams(-1, epo.b(42)));
                if (aVar.e != null) {
                    str = aVar.e;
                }
                TextView textView2 = (TextView) inflate.findViewById(R.id.divider_text);
                textView2.setText(str);
                View findViewById = inflate.findViewById(R.id.left_line);
                View findViewById2 = inflate.findViewById(R.id.right_line);
                if (!TextUtils.isEmpty(aVar.g)) {
                    int a2 = com.taobao.android.detail.core.utils.c.a(aVar.g);
                    textView2.setTextColor(a2);
                    findViewById.setBackgroundColor(a2);
                    findViewById2.setBackgroundColor(a2);
                }
            }
        }
        c(aVar);
    }

    private void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc8d973", new Object[]{this, aVar});
            return;
        }
        View view = this.i;
        if (view != null && view.getVisibility() == 0) {
            dzi.a(this.i, aVar, "Div");
        } else {
            dzi.a(this.m, aVar, "Div");
        }
        if (com.taobao.android.detail.core.detail.kit.utils.c.b()) {
            dzi.a(this.g, aVar, "DivLine");
        } else {
            dzi.a(this.g, aVar, "line");
        }
        dzi.a(this.h, aVar, "DivLine");
        dzi.a(this.k, aVar, "DivText");
        dzi.a(this.l, aVar, "DivText");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.m = (LinearLayout) d.b(context, R.layout.x_detail_main_divider);
        this.g = this.m.findViewById(R.id.detail_main_divider_line_top);
        this.j = this.m.findViewById(R.id.detail_main_divider_bolang_line);
        this.h = this.m.findViewById(R.id.detail_main_divider_line_bottom);
        this.i = this.m.findViewById(R.id.detail_main_divider_blank);
        this.i.setBackgroundColor(this.f9568a.getResources().getColor(R.color.detail_e));
        this.k = (TextView) this.m.findViewById(R.id.detail_main_divider_text);
        this.l = (TextView) this.m.findViewById(R.id.detail_main_divider_no_line_text);
        return this.m;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a9d0f1", new Object[]{this, aVar});
        } else {
            b(aVar);
        }
    }
}
