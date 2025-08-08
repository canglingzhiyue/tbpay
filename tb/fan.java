package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.detail.kit.view.widget.desc.WavingSymbolView;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.epl;
import tb.fbd;

/* loaded from: classes5.dex */
public class fan extends b<fbd> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private DetailImageView l;
    private LinearLayout m;
    private TextView n;
    private Activity o;
    private int p;
    private int q;
    private int r;
    private epl s;

    static {
        kge.a(-204639427);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(fan fanVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(fbd fbdVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(fbd fbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6b9b935", new Object[]{this, fbdVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbd fbdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbdVar})).booleanValue() : b2(fbdVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbd fbdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbdVar}) : a2(fbdVar);
    }

    public fan(Activity activity) {
        super(activity);
        this.o = activity;
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_goodsmatching, null);
        this.l = (DetailImageView) this.k.findViewById(R.id.mainImg);
        this.m = (LinearLayout) this.k.findViewById(R.id.matchingContainer);
        this.n = (TextView) this.k.findViewById(R.id.tvTitle);
        this.p = epo.b;
        this.q = (int) (epo.b * 1.2d);
        this.r = this.i.getDimensionPixelOffset(R.dimen.detail_desc_goodsmatching_itempicwidth);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(this.p, this.q);
        } else {
            layoutParams.width = this.p;
            layoutParams.height = this.q;
        }
        this.l.setLayoutParams(layoutParams);
        this.m.getBackground().setAlpha(127);
        this.s = new epl.a().b(R.drawable.detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).a(R.drawable.detail_img_load_fail).a(ImageView.ScaleType.CENTER_INSIDE).c(ImageView.ScaleType.CENTER_CROP).a();
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.GoodsMatchingViewHolder");
    }

    private View a(fbd.a aVar, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2c626d38", new Object[]{this, aVar, new Boolean(z), num});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.g);
        DetailImageView detailImageView = new DetailImageView(this.g);
        detailImageView.setId(aVar.hashCode());
        detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i = this.r;
        detailImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        detailImageView.setTag(aVar.c);
        String str = aVar.f27736a;
        int i2 = this.r;
        a(detailImageView, str, new epm(i2, i2), null, this.s);
        detailImageView.setTag(R.id.goodsmatching_position, num);
        detailImageView.setOnClickListener(this);
        relativeLayout.addView(detailImageView);
        WavingSymbolView wavingSymbolView = new WavingSymbolView(this.g);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(5, detailImageView.getId());
        layoutParams.addRule(8, detailImageView.getId());
        layoutParams.leftMargin = epo.i;
        layoutParams.bottomMargin = epo.i;
        relativeLayout.addView(wavingSymbolView, layoutParams);
        if (!z) {
            return relativeLayout;
        }
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setOrientation(1);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.g);
        tIconFontTextView.setGravity(1);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setText(this.i.getString(R.string.taodetail_iconfont_add));
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        tIconFontTextView.setTextColor(-1);
        tIconFontTextView.setTextSize(1, 18.0f);
        tIconFontTextView.setPadding(0, (int) (epo.f27511a * 9.0f), 0, (int) (epo.f27511a * 9.0f));
        linearLayout.addView(tIconFontTextView, layoutParams2);
        linearLayout.addView(relativeLayout);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof ImageView)) {
        } else {
            Object tag = view.getTag(R.id.goodsmatching_position);
            int intValue = (tag == null || !(tag instanceof Integer)) ? -1 : ((Integer) tag).intValue();
            if (intValue != -1) {
                Activity activity = this.o;
                dzh.f(activity, ((fbd) this.c).y + "." + intValue, ((fbd) this.c).z);
            } else {
                dzh.f(this.o, ((fbd) this.c).y, ((fbd) this.c).z);
            }
            String obj = view.getTag().toString();
            if (StringUtils.isEmpty(obj)) {
                return;
            }
            epq.a(this.g, obj);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbd fbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4ffef2", new Object[]{this, fbdVar});
        }
        if (fbdVar == null) {
            return this.k;
        }
        if (fbdVar.e > 0 && fbdVar.d > 0) {
            this.q = (this.p * fbdVar.d) / fbdVar.e;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.height = this.q;
            this.l.setLayoutParams(layoutParams);
        }
        a(this.l, fbdVar.b, new epm(this.p, this.q), null, new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(this.l.getScaleType()).a());
        if (StringUtils.isEmpty(fbdVar.f27734a)) {
            this.n.setVisibility(8);
        } else {
            this.n.setText(fbdVar.f27734a);
        }
        for (fbd.a aVar : fbdVar.c) {
            int indexOf = fbdVar.c.indexOf(aVar);
            if (indexOf == 0) {
                this.m.addView(a(aVar, false, Integer.valueOf(indexOf)));
            } else {
                this.m.addView(a(aVar, true, Integer.valueOf(indexOf)));
            }
        }
        return this.k;
    }
}
