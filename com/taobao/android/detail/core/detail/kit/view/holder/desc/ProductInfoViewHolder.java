package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.desc.j;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.dzh;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ProductInfoViewHolder extends b<com.taobao.android.detail.core.model.viewmodel.desc.j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnClickListener A;
    private int k;
    private int l;
    private LinearLayout m;
    private ArrayList<j.a> n;
    private ProductInfoAdapter o;
    private int p;
    private epm q;
    private TextView r;
    private epl s;
    private int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    static {
        kge.a(1411865595);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.core.model.viewmodel.desc.j jVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.core.model.viewmodel.desc.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9467e09a", new Object[]{this, jVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ProductInfoViewHolder";
    }

    public static /* synthetic */ int a(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9132636f", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.t;
    }

    public static /* synthetic */ int a(ProductInfoViewHolder productInfoViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("951a7efa", new Object[]{productInfoViewHolder, new Integer(i)})).intValue();
        }
        productInfoViewHolder.t = i;
        return i;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b b(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("cfcd6421", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b c(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("d9e25200", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    public static /* synthetic */ ProductInfoAdapter d(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProductInfoAdapter) ipChange.ipc$dispatch("8fee6a95", new Object[]{productInfoViewHolder}) : productInfoViewHolder.o;
    }

    public static /* synthetic */ ArrayList e(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("33d04c5a", new Object[]{productInfoViewHolder}) : productInfoViewHolder.n;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b f(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("f8211b9d", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b g(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("236097c", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    public static /* synthetic */ int h(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96e3dc36", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.k;
    }

    public static /* synthetic */ int i(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56aed77", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.l;
    }

    public static /* synthetic */ int j(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73f1feb8", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.x;
    }

    public static /* synthetic */ int k(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2790ff9", new Object[]{productInfoViewHolder})).intValue() : productInfoViewHolder.p;
    }

    public static /* synthetic */ epm l(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epm) ipChange.ipc$dispatch("f8c4227d", new Object[]{productInfoViewHolder}) : productInfoViewHolder.q;
    }

    public static /* synthetic */ epl m(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epl) ipChange.ipc$dispatch("c88455fd", new Object[]{productInfoViewHolder}) : productInfoViewHolder.s;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b n(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("48c88a95", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b o(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("52dd7874", new Object[]{productInfoViewHolder}) : productInfoViewHolder.c;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, jVar})).booleanValue() : b2(jVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, jVar}) : a2(jVar);
    }

    public ProductInfoViewHolder(Activity activity) {
        super(activity);
        this.k = 8;
        this.l = 5;
        this.m = null;
        this.n = null;
        this.o = null;
        this.u = 0;
        this.v = 1;
        this.w = 2;
        this.x = epo.b(56);
        this.y = epo.b(18);
        this.z = epo.b(25);
        this.A = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.ProductInfoViewHolder.1
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
                    dzh.e(ProductInfoViewHolder.this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.b(ProductInfoViewHolder.this)).y, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.c(ProductInfoViewHolder.this)).z);
                    ProductInfoViewHolder.d(ProductInfoViewHolder.this).showlist.clear();
                    for (int i = 0; i < ProductInfoViewHolder.d(ProductInfoViewHolder.this).shownumber; i++) {
                        ProductInfoViewHolder.d(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.e(ProductInfoViewHolder.this).get(i));
                    }
                    if (ProductInfoViewHolder.e(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.d(ProductInfoViewHolder.this).shownumber) {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 1);
                    }
                } else if (1 == ProductInfoViewHolder.a(ProductInfoViewHolder.this)) {
                    dzh.d(ProductInfoViewHolder.this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.f(ProductInfoViewHolder.this)).y, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.g(ProductInfoViewHolder.this)).z);
                    for (int i2 = ProductInfoViewHolder.d(ProductInfoViewHolder.this).shownumber; i2 < ProductInfoViewHolder.e(ProductInfoViewHolder.this).size(); i2++) {
                        ProductInfoViewHolder.d(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.e(ProductInfoViewHolder.this).get(i2));
                    }
                    if (ProductInfoViewHolder.e(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.h(ProductInfoViewHolder.this)) {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 2);
                    } else {
                        ProductInfoViewHolder.a(ProductInfoViewHolder.this, 0);
                    }
                }
                ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
                productInfoViewHolder.a(ProductInfoViewHolder.d(productInfoViewHolder));
            }
        };
        this.p = ((((epo.b - this.x) - this.y) - this.z) - 2) / 3;
        int i = this.p;
        this.q = new epm(i, i);
        this.m = new LinearLayout(this.g);
        this.m.setOrientation(1);
        this.m.setBackgroundColor(this.g.getResources().getColor(R.color.detail_desc_normal_background));
        this.s = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
    }

    public void a(BaseAdapter baseAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30359e44", new Object[]{this, baseAdapter});
            return;
        }
        int count = baseAdapter.getCount();
        this.m.removeAllViews();
        for (int i = 0; i < count; i++) {
            View view = baseAdapter.getView(i, null, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = epo.b(12);
            if (view instanceof TextView) {
                layoutParams.gravity = 1;
            }
            if (i == count - 1) {
                layoutParams.bottomMargin = epo.b(12);
            }
            this.m.addView(view, layoutParams);
        }
        int i2 = this.t;
        if (i2 == 1) {
            TextView textView = this.r;
            if (textView == null) {
                a(this.i.getString(R.string.detail_desc_see_more), this.A);
            } else {
                textView.setText(this.i.getString(R.string.detail_desc_see_more));
            }
            this.m.addView(this.r);
        } else if (i2 == 2) {
            TextView textView2 = this.r;
            if (textView2 == null) {
                a(this.i.getString(R.string.detail_desc_pack_up), this.A);
            } else {
                textView2.setText(this.i.getString(R.string.detail_desc_pack_up));
            }
            this.m.addView(this.r);
        }
    }

    public LinearLayout a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("568ede7f", new Object[]{this, view, view2});
        }
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setOrientation(0);
        view2.setPadding(this.z, 0, 0, 0);
        linearLayout.setPadding(this.y, 0, 0, 0);
        linearLayout.addView(view);
        linearLayout.addView(view2);
        return linearLayout;
    }

    public LinearLayout a(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("89fb5899", new Object[]{this, arrayList});
        }
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setOrientation(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                int i2 = this.p;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                View view = arrayList.get(i);
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
            } else {
                int i3 = this.p;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
                View view2 = arrayList.get(i);
                layoutParams2.setMargins((int) (epo.f27511a * 3.0f), 0, 0, 0);
                view2.setLayoutParams(layoutParams2);
                linearLayout.addView(view2);
            }
        }
        return linearLayout;
    }

    /* loaded from: classes4.dex */
    public class ProductInfoAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ArrayList<j.a> list;
        public ArrayList<j.a> showlist;
        public int shownumber;

        static {
            kge.a(1096353211);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public ProductInfoAdapter(ArrayList<j.a> arrayList) {
            this.list = null;
            this.showlist = null;
            this.shownumber = ProductInfoViewHolder.i(ProductInfoViewHolder.this);
            this.list = arrayList;
            this.showlist = new ArrayList<>();
            int size = arrayList.size();
            this.shownumber = size > ProductInfoViewHolder.i(ProductInfoViewHolder.this) ? ProductInfoViewHolder.i(ProductInfoViewHolder.this) : size;
            for (int i = 0; i < this.shownumber; i++) {
                this.showlist.add(arrayList.get(i));
            }
            if (size > ProductInfoViewHolder.i(ProductInfoViewHolder.this)) {
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
            j.a aVar = this.showlist.get(i);
            TextView textView = new TextView(ProductInfoViewHolder.this.g);
            textView.setIncludeFontPadding(false);
            textView.setTextColor(ProductInfoViewHolder.this.i.getColor(R.color.detail_desc_product_key));
            textView.setTextSize(1, 14.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.j(ProductInfoViewHolder.this), -2));
            textView.setGravity(48);
            textView.setText(aVar.f9758a);
            if (aVar.b != null) {
                TextView textView2 = new TextView(ProductInfoViewHolder.this.g);
                textView2.setText(aVar.b);
                textView2.setTextColor(ProductInfoViewHolder.this.i.getColor(R.color.detail_desc_normal_text));
                textView2.setIncludeFontPadding(false);
                textView2.setTextSize(1, 14.0f);
                return ProductInfoViewHolder.this.a(textView, textView2);
            }
            ArrayList<View> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < aVar.c.size(); i2++) {
                final DetailImageView detailImageView = new DetailImageView(ProductInfoViewHolder.this.g);
                detailImageView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.k(ProductInfoViewHolder.this), ProductInfoViewHolder.k(ProductInfoViewHolder.this)));
                final String str = aVar.c.get(i2);
                ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
                productInfoViewHolder.a(detailImageView, str, ProductInfoViewHolder.l(productInfoViewHolder), null, ProductInfoViewHolder.m(ProductInfoViewHolder.this));
                detailImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.ProductInfoViewHolder.ProductInfoAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        com.taobao.android.detail.core.event.params.c cVar = new com.taobao.android.detail.core.event.params.c();
                        cVar.f9716a = true;
                        cVar.c = 0;
                        cVar.f = detailImageView;
                        cVar.e.add(str);
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(com.taobao.android.detail.core.detail.kit.utils.g.a(ProductInfoViewHolder.this.g, str, 430));
                        cVar.a(arrayList2);
                        com.taobao.android.trade.event.f.a(ProductInfoViewHolder.this.g, new com.taobao.android.detail.core.event.basic.o(cVar));
                        dzh.g(ProductInfoViewHolder.this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.n(ProductInfoViewHolder.this)).y, ((com.taobao.android.detail.core.model.viewmodel.desc.j) ProductInfoViewHolder.o(ProductInfoViewHolder.this)).z);
                    }
                });
                arrayList.add(detailImageView);
            }
            ProductInfoViewHolder productInfoViewHolder2 = ProductInfoViewHolder.this;
            return productInfoViewHolder2.a(textView, productInfoViewHolder2.a(arrayList));
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f826db9", new Object[]{this, jVar});
        }
        if (jVar.f9755a > 0) {
            this.k = jVar.f9755a;
        }
        if (jVar.b > 0) {
            this.l = jVar.b;
        }
        int i = this.l;
        if (i >= this.k) {
            this.k = i;
        }
        this.n = jVar.c;
        ArrayList<j.a> arrayList = this.n;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.g);
        }
        this.o = new ProductInfoAdapter(this.n);
        a(this.o);
        return this.m;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.g);
        }
        if (this.r == null) {
            this.r = new TextView(this.g);
            this.r.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.r.setBackgroundColor(this.i.getColor(R.color.detail_white));
            this.r.setPadding(0, epo.b(10), 0, epo.b(10));
            this.r.setGravity(17);
            this.r.setTextColor(this.i.getColor(R.color.taodetail_gray));
            this.r.setTextSize(1, 14.0f);
        }
        this.r.setText(str);
        this.r.setOnClickListener(onClickListener);
        return this.r;
    }
}
