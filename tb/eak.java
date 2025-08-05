package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.b;
import com.taobao.android.detail.core.detail.kit.view.holder.d;
import com.taobao.android.detail.core.model.viewmodel.main.g;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eak extends d<g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView g;

    static {
        kge.a(107418117);
    }

    public static /* synthetic */ Object ipc$super(eak eakVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.SysButtonViewHolder";
    }

    public eak(Context context) {
        super(context);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = (TextView) View.inflate(context, R.layout.x_detail_main_sys_button, null);
        return this.g;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270ce9f2", new Object[]{this, gVar});
        } else if (gVar == null || !gVar.isValid()) {
            this.g.setVisibility(8);
            d();
        } else {
            String str = gVar.f9770a;
            String str2 = gVar.d;
            String str3 = gVar.b;
            boolean z = gVar.c;
            if (TextUtils.isEmpty(str)) {
                this.g.setText(str3);
            } else {
                this.g.setText(str);
            }
            this.g.setEnabled(z);
            c();
            if (!TextUtils.isEmpty(str2)) {
                a(str2);
            }
            this.g.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (((g) this.c).dmComponent != null && ((g) this.c).dmComponent.getFields() != null) {
            String string = ((g) this.c).dmComponent.getFields().getString("styleId");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            TextView textView = this.g;
            T t = this.c;
            dzi.a(textView, t, "SysBtn" + string);
        } else {
            dzi.a(this.g, this.c, "SysBtn");
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
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.g = null;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        SpannableString spannableString = new SpannableString(((Object) this.g.getText()) + "\n" + str);
        spannableString.setSpan(new AbsoluteSizeSpan(b.a(this.f9568a, (float) ((g) this.c).e)), this.g.getText().length() + 1, this.g.getText().length() + str.length() + 1, 18);
        this.g.setText(spannableString);
    }
}
