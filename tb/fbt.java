package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.AutoWrapLineLayout;
import com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fbt extends c<fce> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private AutoWrapLineLayout h;
    private LinearLayout i;
    private LinearLayout j;

    static {
        kge.a(1600265445);
    }

    public static /* synthetic */ Object ipc$super(fbt fbtVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fbt(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.MultiStageViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = (LinearLayout) View.inflate(context, R.layout.x_detail_main_mul_stage, null);
        this.h = (AutoWrapLineLayout) this.g.findViewById(R.id.detail_mulstage_container);
        this.h.setLineSpacing(context.getResources().getDimensionPixelSize(R.dimen.detail_d6));
        return this.g;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8453e90", new Object[]{this, fceVar});
            return;
        }
        b(fceVar);
        dzi.a(this.g, this.c, "MultistageBg");
    }

    private void b(fce fceVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c84511", new Object[]{this, fceVar});
        } else if (fceVar == null || fceVar.f27787a == null || fceVar.f27787a.size() == 0) {
        } else {
            if (this.h.getChildCount() > 0) {
                this.h.removeAllViews();
            }
            this.h.setSimplifiedMode(true, 2);
            int size = fceVar.f27787a.size();
            this.i = new LinearLayout(this.f9568a);
            this.i.setOrientation(0);
            this.i.setGravity(16);
            this.j = new LinearLayout(this.f9568a);
            this.j.setOrientation(0);
            this.j.setGravity(16);
            int i2 = -2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.i.setPadding(epo.l, epo.f, epo.l, epo.f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            this.j.setPadding(epo.g, 0, epo.g, 0);
            int i3 = 0;
            while (i3 < size) {
                ShippingNode.b bVar = fceVar.f27787a.get(i3);
                if (bVar != null) {
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, epo.b(i));
                    layoutParams4.weight = 1.0f;
                    DetailImageView detailImageView = new DetailImageView(this.f9568a);
                    epj.b();
                    detailImageView.setMaxHeight(epo.b(25));
                    detailImageView.setAdjustViewBounds(z);
                    detailImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    View view = new View(this.f9568a);
                    if (!StringUtils.isEmpty(bVar.f10036a)) {
                        a(bVar.f10036a, null, detailImageView);
                    }
                    TextView textView = new TextView(this.f9568a);
                    textView.setTextSize(12.0f);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams5.weight = 1.0f;
                    if (!StringUtils.isEmpty(bVar.c)) {
                        textView.setText(bVar.c);
                    }
                    textView.setClickable(false);
                    detailImageView.setClickable(false);
                    if (i3 == 0) {
                        textView.setGravity(19);
                    } else if (i3 == size - 1) {
                        this.i.addView(view, layoutParams4);
                        textView.setGravity(21);
                    } else {
                        this.i.addView(view, layoutParams4);
                        textView.setGravity(17);
                    }
                    this.i.addView(detailImageView, layoutParams3);
                    this.j.addView(textView, layoutParams5);
                    dzi.a(textView, this.c, "MultistageText");
                    dzi.a(view, this.c, "MultistageLine");
                    if (bVar.b) {
                        view.setBackgroundColor(((fce) this.c).c);
                        textView.setTextColor(((fce) this.c).e);
                    } else {
                        view.setBackgroundColor(((fce) this.c).b);
                        textView.setTextColor(((fce) this.c).d);
                    }
                }
                i3++;
                i = 2;
                z = true;
                i2 = -2;
            }
            this.h.addView(this.i, layoutParams);
            this.h.addView(this.j, layoutParams2);
            this.i.setClickable(false);
            this.j.setClickable(false);
            this.h.setClickable(false);
        }
    }

    public void a(String str, epm epmVar, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447901", new Object[]{this, str, epmVar, detailImageView});
        } else {
            f.a(this.f9568a).a(detailImageView, str, epmVar);
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
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.g = null;
    }
}
