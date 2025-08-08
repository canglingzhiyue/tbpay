package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.szp;

/* loaded from: classes5.dex */
public class ProductInfoViewHolder extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_NAME = "detail";
    private int g;
    private int h;
    private LinearLayout i;
    private ArrayList<q.a> j;
    private ProductInfoAdapter k;
    private int l;
    private com.taobao.android.detail.ttdetail.widget.desc.image.g m;
    private TextView n;
    private com.taobao.android.detail.ttdetail.widget.desc.image.d o;
    private int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private ImageStrategyConfig w;
    private View.OnClickListener x;

    static {
        kge.a(-254596275);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q qVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a10458", new Object[]{this, qVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("432e771f", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.p;
    }

    public static /* synthetic */ int a(ProductInfoViewHolder productInfoViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22a0e14a", new Object[]{productInfoViewHolder, new Integer(i)})).intValue();
        }
        productInfoViewHolder.p = i;
        return i;
    }

    public static /* synthetic */ ProductInfoAdapter b(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProductInfoAdapter) ipChange.ipc$dispatch("b3f9aad1", new Object[]{productInfoViewHolder}) : productInfoViewHolder.k;
    }

    public static /* synthetic */ ArrayList c(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2e9a60c4", new Object[]{productInfoViewHolder}) : productInfoViewHolder.j;
    }

    public static /* synthetic */ int d(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40a2253c", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.g;
    }

    public static /* synthetic */ int e(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fc8b49b", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.h;
    }

    public static /* synthetic */ int f(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eef43fa", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.t;
    }

    public static /* synthetic */ int g(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e15d359", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.l;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.widget.desc.image.g h(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.widget.desc.image.g) ipChange.ipc$dispatch("42b6be93", new Object[]{productInfoViewHolder}) : productInfoViewHolder.m;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.widget.desc.image.d i(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.widget.desc.image.d) ipChange.ipc$dispatch("7c440ff7", new Object[]{productInfoViewHolder}) : productInfoViewHolder.o;
    }

    public static /* synthetic */ ImageStrategyConfig j(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("38ff93e6", new Object[]{productInfoViewHolder}) : productInfoViewHolder.w;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, qVar})).booleanValue() : b2(qVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, qVar}) : a2(qVar);
    }

    public ProductInfoViewHolder(Context context) {
        super(context);
        this.g = 8;
        this.h = 5;
        this.i = null;
        this.j = null;
        this.k = null;
        this.q = 0;
        this.r = 1;
        this.s = 2;
        this.t = com.taobao.android.detail.ttdetail.utils.f.a(56.0f);
        this.u = com.taobao.android.detail.ttdetail.utils.f.a(18.0f);
        this.v = com.taobao.android.detail.ttdetail.utils.f.a(25.0f);
        this.w = ImageStrategyConfig.a("detail", 15).f(false).a();
        this.x = new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.ProductInfoViewHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (2 == ProductInfoViewHolder.a(ProductInfoViewHolder.this)) {
                    ProductInfoViewHolder.b(ProductInfoViewHolder.this).showlist.clear();
                    for (int i = 0; i < ProductInfoViewHolder.b(ProductInfoViewHolder.this).shownumber; i++) {
                        ProductInfoViewHolder.b(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.c(ProductInfoViewHolder.this).get(i));
                    }
                    if (ProductInfoViewHolder.c(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.b(ProductInfoViewHolder.this).shownumber) {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 1);
                    }
                } else if (1 == ProductInfoViewHolder.a(ProductInfoViewHolder.this)) {
                    for (int i2 = ProductInfoViewHolder.b(ProductInfoViewHolder.this).shownumber; i2 < ProductInfoViewHolder.c(ProductInfoViewHolder.this).size(); i2++) {
                        ProductInfoViewHolder.b(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.c(ProductInfoViewHolder.this).get(i2));
                    }
                    if (ProductInfoViewHolder.c(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.d(ProductInfoViewHolder.this)) {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 2);
                    } else {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 0);
                    }
                }
                ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
                productInfoViewHolder.a(ProductInfoViewHolder.b(productInfoViewHolder));
            }
        };
        this.l = ((((com.taobao.android.detail.ttdetail.utils.f.a(context) - this.t) - this.u) - this.v) - 2) / 3;
        int i = this.l;
        this.m = new com.taobao.android.detail.ttdetail.widget.desc.image.g(i, i);
        this.i = new LinearLayout(this.f10821a);
        this.i.setOrientation(1);
        this.i.setBackgroundColor(this.f10821a.getResources().getColor(R.color.tt_detail_desc_normal_background));
        this.o = new d.a().b(R.drawable.tt_detail_img_load_fail).a(R.drawable.tt_detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    public void a(BaseAdapter baseAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30359e44", new Object[]{this, baseAdapter});
            return;
        }
        int count = baseAdapter.getCount();
        this.i.removeAllViews();
        for (int i = 0; i < count; i++) {
            View view = baseAdapter.getView(i, null, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
            if (view instanceof TextView) {
                layoutParams.gravity = 1;
            }
            if (i == count - 1) {
                layoutParams.bottomMargin = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
            }
            this.i.addView(view, layoutParams);
        }
        int i2 = this.p;
        if (i2 == 1) {
            TextView textView = this.n;
            if (textView == null) {
                a(this.c.getString(R.string.tt_detail_desc_see_more), this.x);
            } else {
                textView.setText(this.c.getString(R.string.tt_detail_desc_see_more));
            }
            this.i.addView(this.n);
        } else if (i2 == 2) {
            TextView textView2 = this.n;
            if (textView2 == null) {
                a(this.c.getString(R.string.tt_detail_desc_pack_up), this.x);
            } else {
                textView2.setText(this.c.getString(R.string.tt_detail_desc_pack_up));
            }
            this.i.addView(this.n);
        }
    }

    public LinearLayout a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("568ede7f", new Object[]{this, view, view2});
        }
        LinearLayout linearLayout = new LinearLayout(this.f10821a);
        linearLayout.setOrientation(0);
        view2.setPadding(this.v, 0, 0, 0);
        linearLayout.setPadding(this.u, 0, 0, 0);
        linearLayout.addView(view);
        linearLayout.addView(view2);
        return linearLayout;
    }

    public LinearLayout a(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("89fb5899", new Object[]{this, arrayList});
        }
        LinearLayout linearLayout = new LinearLayout(this.f10821a);
        linearLayout.setOrientation(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                int i2 = this.l;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                View view = arrayList.get(i);
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
            } else {
                int i3 = this.l;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
                View view2 = arrayList.get(i);
                layoutParams2.setMargins(com.taobao.android.detail.ttdetail.utils.f.a(3.0f), 0, 0, 0);
                view2.setLayoutParams(layoutParams2);
                linearLayout.addView(view2);
            }
        }
        return linearLayout;
    }

    /* loaded from: classes5.dex */
    public class ProductInfoAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ArrayList<q.a> list;
        public ArrayList<q.a> showlist;
        public int shownumber;

        static {
            kge.a(1694204201);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public ProductInfoAdapter(ArrayList<q.a> arrayList) {
            this.list = null;
            this.showlist = null;
            this.shownumber = ProductInfoViewHolder.e(ProductInfoViewHolder.this);
            this.list = arrayList;
            this.showlist = new ArrayList<>();
            int size = arrayList.size();
            this.shownumber = size > ProductInfoViewHolder.e(ProductInfoViewHolder.this) ? ProductInfoViewHolder.e(ProductInfoViewHolder.this) : size;
            for (int i = 0; i < this.shownumber; i++) {
                this.showlist.add(arrayList.get(i));
            }
            if (size > ProductInfoViewHolder.e(ProductInfoViewHolder.this)) {
                ProductInfoViewHolder.a(ProductInfoViewHolder.this, 1);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.showlist.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.showlist.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            q.a aVar = this.showlist.get(i);
            TextView textView = new TextView(ProductInfoViewHolder.this.f10821a);
            textView.setIncludeFontPadding(false);
            textView.setTextColor(ProductInfoViewHolder.this.c.getColor(R.color.tt_detail_desc_product_key));
            textView.setTextSize(1, 14.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.f(ProductInfoViewHolder.this), -2));
            textView.setGravity(48);
            textView.setText(aVar.f10890a);
            if (aVar.b != null) {
                TextView textView2 = new TextView(ProductInfoViewHolder.this.f10821a);
                textView2.setText(aVar.b);
                textView2.setTextColor(ProductInfoViewHolder.this.c.getColor(R.color.tt_detail_desc_normal_text));
                textView2.setIncludeFontPadding(false);
                textView2.setTextSize(1, 14.0f);
                return ProductInfoViewHolder.this.a(textView, textView2);
            }
            ArrayList<View> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < aVar.c.size(); i2++) {
                final DetailImageView detailImageView = new DetailImageView(ProductInfoViewHolder.this.f10821a);
                detailImageView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.g(ProductInfoViewHolder.this), ProductInfoViewHolder.g(ProductInfoViewHolder.this)));
                final String str = aVar.c.get(i2);
                ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
                productInfoViewHolder.a(detailImageView, str, ProductInfoViewHolder.h(productInfoViewHolder), null, ProductInfoViewHolder.i(ProductInfoViewHolder.this));
                detailImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.ProductInfoViewHolder.ProductInfoAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        com.taobao.android.detail.ttdetail.widget.desc.picgallery.c cVar = new com.taobao.android.detail.ttdetail.widget.desc.picgallery.c();
                        cVar.f11018a = true;
                        cVar.c = 0;
                        cVar.f = detailImageView;
                        cVar.e.add(str);
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(ImageStrategyDecider.decideUrl(str, 430, 430, ProductInfoViewHolder.j(ProductInfoViewHolder.this)));
                        cVar.a(arrayList2);
                        com.taobao.android.detail.ttdetail.communication.c.a(ProductInfoViewHolder.this.f10821a, new szp(cVar));
                    }
                });
                arrayList.add(detailImageView);
            }
            ProductInfoViewHolder productInfoViewHolder2 = ProductInfoViewHolder.this;
            return productInfoViewHolder2.a(textView, productInfoViewHolder2.a(arrayList));
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23a35315", new Object[]{this, qVar});
        }
        if (qVar.f10887a > 0) {
            this.g = qVar.f10887a;
        }
        if (qVar.b > 0) {
            this.h = qVar.b;
        }
        int i = this.h;
        if (i >= this.g) {
            this.g = i;
        }
        this.j = qVar.c;
        ArrayList<q.a> arrayList = this.j;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f10821a);
        }
        this.k = new ProductInfoAdapter(this.j);
        a(this.k);
        return this.i;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (StringUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f10821a);
        }
        if (this.n == null) {
            this.n = new TextView(this.f10821a);
            this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.n.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.n.setPadding(0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), 0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f));
            this.n.setGravity(17);
            this.n.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.n.setTextSize(1, 14.0f);
        }
        this.n.setText(str);
        this.n.setOnClickListener(onClickListener);
        return this.n;
    }
}
