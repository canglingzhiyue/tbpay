package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.k;
import com.taobao.android.detail.core.detail.kit.utils.m;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.model.viewmodel.main.f;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eaj extends c<f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AbsoluteSizeSpan i;
    private static ForegroundColorSpan j;
    private TextView g;
    private LinearLayout h;

    public static /* synthetic */ Object ipc$super(eaj eajVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.ShopInfoItemViewHolder";
    }

    static {
        kge.a(254988883);
        i = new AbsoluteSizeSpan(16, true);
    }

    public eaj(Context context) {
        super(context);
        j = new ForegroundColorSpan(epo.c().getColor(R.color.detail_text_default));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.h = (LinearLayout) LayoutInflater.from(this.f9568a).inflate(R.layout.x_detail_main_shop_item, (ViewGroup) null);
        this.g = (TextView) this.h.findViewById(R.id.detail_main_item_tv);
        this.g.setLineSpacing(epo.d, 1.0f);
        return this.h;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270c7593", new Object[]{this, fVar});
        } else if (fVar == null || !fVar.isValid()) {
            this.h.setVisibility(8);
            c();
        } else {
            String str = fVar.f9769a;
            String str2 = fVar.b;
            if (fVar.c) {
                try {
                    str2 = m.a(Integer.parseInt(str2));
                } catch (Throwable unused) {
                    str2 = fVar.b;
                }
            }
            String str3 = str2 + "\n";
            SpannableString spannableString = new SpannableString(str3 + str);
            spannableString.setSpan(i, 0, str3.length(), 33);
            spannableString.setSpan(j, 0, str3.length(), 33);
            if (k.a(fVar.b) <= 0) {
                this.h.setBackgroundResource(0);
                this.h.setOnClickListener(null);
            }
            this.g.setText(spannableString);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.h;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
    }
}
