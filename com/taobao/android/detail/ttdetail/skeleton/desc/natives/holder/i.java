package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.detail.ttdetail.widget.desc.WavingSymbolView;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private DetailImageView h;
    private LinearLayout i;
    private TextView j;
    private Context k;
    private int l;
    private int m;
    private int n;
    private com.taobao.android.detail.ttdetail.widget.desc.image.d o;

    static {
        kge.a(-497133757);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i iVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19d6160", new Object[]{this, iVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, iVar})).booleanValue() : b2(iVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, iVar}) : a2(iVar);
    }

    public i(Context context) {
        super(context);
        this.k = context;
        this.g = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_goodsmatching, (ViewGroup) null);
        this.h = (DetailImageView) this.g.findViewById(R.id.mainImg);
        this.i = (LinearLayout) this.g.findViewById(R.id.matchingContainer);
        this.j = (TextView) this.g.findViewById(R.id.tvTitle);
        this.l = com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a);
        this.m = (int) (com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) * 1.2d);
        this.n = this.c.getDimensionPixelOffset(R.dimen.tt_detail_desc_goodsmatching_itempicwidth);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(this.l, this.m);
        } else {
            layoutParams.width = this.l;
            layoutParams.height = this.m;
        }
        this.h.setLayoutParams(layoutParams);
        this.i.getBackground().setAlpha(127);
        this.o = new d.a().b(R.drawable.tt_detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).a(R.drawable.tt_detail_img_load_fail).a(ImageView.ScaleType.CENTER_INSIDE).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    private View a(i.a aVar, boolean z, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7236a23", new Object[]{this, aVar, new Boolean(z), num});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f10821a);
        DetailImageView detailImageView = new DetailImageView(this.f10821a);
        detailImageView.setId(aVar.hashCode());
        detailImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i = this.n;
        detailImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        detailImageView.setTag(aVar.c);
        String str = aVar.f10876a;
        int i2 = this.n;
        a(detailImageView, str, new com.taobao.android.detail.ttdetail.widget.desc.image.g(i2, i2), null, this.o);
        detailImageView.setTag(R.id.tt_detail_goodsmatching_position, num);
        detailImageView.setOnClickListener(this);
        relativeLayout.addView(detailImageView);
        WavingSymbolView wavingSymbolView = new WavingSymbolView(this.f10821a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(5, detailImageView.getId());
        layoutParams.addRule(8, detailImageView.getId());
        layoutParams.leftMargin = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
        layoutParams.bottomMargin = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
        relativeLayout.addView(wavingSymbolView, layoutParams);
        if (!z) {
            return relativeLayout;
        }
        LinearLayout linearLayout = new LinearLayout(this.f10821a);
        linearLayout.setOrientation(1);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f10821a);
        tIconFontTextView.setGravity(1);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setText(this.c.getString(R.string.tt_detail_iconfont_add));
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        tIconFontTextView.setTextColor(-1);
        tIconFontTextView.setTextSize(1, 18.0f);
        tIconFontTextView.setPadding(0, com.taobao.android.detail.ttdetail.utils.f.a(9.0f), 0, com.taobao.android.detail.ttdetail.utils.f.a(9.0f));
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
            Object tag = view.getTag(R.id.tt_detail_goodsmatching_position);
            if (tag != null && (tag instanceof Integer)) {
                ((Integer) tag).intValue();
            }
            String obj = view.getTag().toString();
            if (StringUtils.isEmpty(obj)) {
                return;
            }
            com.taobao.android.t.a().a(this.f10821a).a(obj);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef757e1d", new Object[]{this, iVar});
        }
        if (iVar == null) {
            return this.g;
        }
        if (iVar.e > 0 && iVar.d > 0) {
            this.m = (this.l * iVar.d) / iVar.e;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.height = this.m;
            this.h.setLayoutParams(layoutParams);
        }
        a(this.h, iVar.b, new com.taobao.android.detail.ttdetail.widget.desc.image.g(this.l, this.m), null, new d.a().b(R.drawable.tt_detail_img_load_fail).a(R.drawable.tt_detail_img_load_fail).c(this.h.getScaleType()).a());
        if (StringUtils.isEmpty(iVar.f10874a)) {
            this.j.setVisibility(8);
        } else {
            this.j.setText(iVar.f10874a);
        }
        for (i.a aVar : iVar.c) {
            int indexOf = iVar.c.indexOf(aVar);
            if (indexOf == 0) {
                this.i.addView(a(aVar, false, Integer.valueOf(indexOf)));
            } else {
                this.i.addView(a(aVar, true, Integer.valueOf(indexOf)));
            }
        }
        return this.g;
    }
}
