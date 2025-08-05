package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.model.viewmodel.main.h;
import com.taobao.android.detail.core.open.ProtocolType;
import com.taobao.android.detail.core.open.n;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eal extends c<h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private TextView h;

    static {
        kge.a(656049921);
    }

    public static /* synthetic */ Object ipc$super(eal ealVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.TipViewHolder";
    }

    public eal(Context context) {
        super(context);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        if (n.a(context).a() == ProtocolType.TYPE_ULTRON) {
            return c();
        }
        this.g = new LinearLayout(context);
        this.g.setGravity(16);
        this.h = new TextView(this.f9568a);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity(1);
        this.h.setPadding(this.f9568a.getResources().getDimensionPixelOffset(R.dimen.detail_d10), 0, 0, 0);
        this.g.addView(this.h);
        return this.g;
    }

    private View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        this.g = (LinearLayout) View.inflate(this.f9568a, R.layout.x_detail_main_tip, null);
        this.g.setGravity(16);
        this.h = (TextView) this.g.findViewById(R.id.detail_main_tip_text);
        this.h.setTextSize(1, 12.0f);
        this.h.setGravity(16);
        this.h.setPadding(this.f9568a.getResources().getDimensionPixelOffset(R.dimen.detail_d10), 0, 0, 0);
        return this.g;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270d5e51", new Object[]{this, hVar});
        } else if (hVar == null || !hVar.isValid()) {
            this.g.setVisibility(8);
            d();
        } else {
            this.h.setText(hVar.f9771a);
            b(hVar);
        }
    }

    private void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1129b0", new Object[]{this, hVar});
            return;
        }
        dzi.a(this.h, hVar, "TipText");
        dzi.a(this.g, hVar, "Tip");
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
            return;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.g = null;
    }
}
