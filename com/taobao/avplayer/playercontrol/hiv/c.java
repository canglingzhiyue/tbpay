package com.taobao.avplayer.playercontrol.hiv;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.aq;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LayoutInflater f16576a;
    private DWContext b;
    private ContentDetailData c;
    private List<ContentDetailData.RelatedItem> d;

    /* loaded from: classes6.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f16582a;
        public TextView b;
        public TextView c;
        public ImageView d;
        public ImageView e;
        public TextView f;
        public LinearLayout g;

        static {
            kge.a(255653510);
        }

        public a(View view) {
            super(view);
            this.f16582a = (ImageView) view.findViewById(R.id.img_pic);
            this.d = (ImageView) view.findViewById(R.id.img_addcart_icon);
            this.c = (TextView) view.findViewById(R.id.tv_price);
            this.b = (TextView) view.findViewById(R.id.tv_title);
            this.e = (ImageView) view.findViewById(R.id.img_promotion);
            this.f = (TextView) view.findViewById(R.id.good_price_name);
            this.g = (LinearLayout) view.findViewById(R.id.ll_price_part);
        }
    }

    static {
        kge.a(-639827864);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DWContext a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("267e0704", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ void a(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95aa7d", new Object[]{cVar, str, str2});
        } else {
            cVar.a(str, str2);
        }
    }

    public static /* synthetic */ List b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5fbc4dbf", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ ContentDetailData c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentDetailData) ipChange.ipc$dispatch("76b0fc05", new Object[]{cVar}) : cVar.c;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, aVar, new Integer(i)});
        } else {
            a(aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.avplayer.playercontrol.hiv.c$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public c(DWContext dWContext, ContentDetailData contentDetailData) {
        this.b = dWContext;
        this.c = contentDetailData;
        this.d = contentDetailData.getShopOrTalentRelatedItems();
        this.f16576a = (LayoutInflater) dWContext.getActivity().getSystemService("layout_inflater");
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3b573a60", new Object[]{this, viewGroup, new Integer(i)}) : new a(this.f16576a.inflate(R.layout.dw_hiv_pop_goods_item, viewGroup, false));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> b = j.b(this.b, this.c);
        b.put("item_id", str);
        j.a(this.b, str2, b);
    }

    public void a(a aVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ad4b7", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        List<ContentDetailData.RelatedItem> list = this.d;
        if (list == null || this.b == null || list.get(i) == null) {
            return;
        }
        final ContentDetailData.RelatedItem relatedItem = this.d.get(i);
        if (this.b.mDWImageAdapter != null) {
            if (!StringUtils.isEmpty(relatedItem.picUrl)) {
                this.b.mDWImageAdapter.a(relatedItem.picUrl, aVar.f16582a);
                aVar.f16582a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (c.a(c.this) == null || c.a(c.this).getDWEventAdapter() == null) {
                        } else {
                            c.a(c.this).getDWEventAdapter().a(((ContentDetailData.RelatedItem) c.b(c.this).get(i)).targetUrl);
                            c.a(c.this, relatedItem.itemId, "fullItemListClick");
                        }
                    }
                });
            }
            if (relatedItem.promotionPic != null && !StringUtils.isEmpty(relatedItem.promotionPic.pic)) {
                this.b.mDWImageAdapter.a(relatedItem.promotionPic.pic, aVar.e);
            }
        }
        if (StringUtils.isEmpty(relatedItem.promotionPrice)) {
            if (!StringUtils.isEmpty(relatedItem.price)) {
                TextView textView = aVar.c;
                textView.setText("￥" + relatedItem.price);
            }
        } else {
            TextView textView2 = aVar.c;
            textView2.setText("￥" + relatedItem.promotionPrice);
        }
        if (!StringUtils.isEmpty(relatedItem.title)) {
            aVar.b.setMaxWidth(kcl.a(this.b.getActivity(), 218.0f));
            aVar.b.setText(relatedItem.title);
        }
        if (relatedItem.promotionInfo != null) {
            if (!StringUtils.isEmpty(relatedItem.promotionInfo.promotionTitle)) {
                aVar.f.setText(relatedItem.promotionInfo.promotionTitle);
            }
            if (aVar != null) {
                final TextView textView3 = aVar.b;
                if (relatedItem.promotionInfo != null && !StringUtils.isEmpty(relatedItem.promotionInfo.pic)) {
                    View view = new View(this.b.getActivity());
                    if (relatedItem.promotionInfo.picHeight == 0) {
                        relatedItem.promotionInfo.picHeight = 26;
                    }
                    if (relatedItem.promotionInfo.picWidth == 0) {
                        relatedItem.promotionInfo.picWidth = 46;
                    }
                    view.setLayoutParams(new ViewGroup.LayoutParams(kcl.a(this.b.getActivity(), relatedItem.promotionInfo.picWidth / 2), kcl.a(this.b.getActivity(), relatedItem.promotionInfo.picHeight / 2)));
                    this.b.mDWImageLoaderAdapter.a(relatedItem.promotionInfo.pic, view, new aq.a() { // from class: com.taobao.avplayer.playercontrol.hiv.c.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.avplayer.aq.a
                        public boolean a(aq.b bVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("19c0e927", new Object[]{this, bVar})).booleanValue();
                            }
                            if (bVar != null && bVar.f16468a != null) {
                                SpannableString spannableString = new SpannableString("  " + relatedItem.title);
                                Drawable drawable = bVar.f16468a;
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                spannableString.setSpan(new ImageSpan(drawable, 1), 0, 1, 33);
                                textView3.setText(spannableString);
                            }
                            return true;
                        }
                    }, null);
                }
            }
        }
        if (!StringUtils.isEmpty(relatedItem.title) && aVar != null && aVar.b != null) {
            aVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (c.a(c.this) == null || c.a(c.this).getDWEventAdapter() == null) {
                    } else {
                        c.a(c.this).getDWEventAdapter().a(((ContentDetailData.RelatedItem) c.b(c.this).get(i)).targetUrl);
                        c.a(c.this, relatedItem.itemId, "fullItemListClick");
                    }
                }
            });
        }
        if (aVar != null && aVar.c != null) {
            aVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (c.a(c.this) == null || c.a(c.this).getDWEventAdapter() == null) {
                    } else {
                        c.a(c.this).getDWEventAdapter().a(((ContentDetailData.RelatedItem) c.b(c.this).get(i)).targetUrl);
                        c.a(c.this, relatedItem.itemId, "fullItemListClick");
                    }
                }
            });
        }
        if (aVar == null || aVar.d == null) {
            return;
        }
        aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", relatedItem.itemId);
                if (c.a(c.this) == null || c.a(c.this).getHivEventAdapter() == null) {
                    return;
                }
                c.a(c.this).getHivEventAdapter().a(c.a(c.this), hashMap, c.c(c.this));
                c.a(c.this, relatedItem.itemId, "fullItemListAddinCart");
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<ContentDetailData.RelatedItem> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
