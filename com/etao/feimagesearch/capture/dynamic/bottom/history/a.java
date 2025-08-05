package com.etao.feimagesearch.capture.dynamic.bottom.history;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.history.object.Product;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ads;
import tb.adt;
import tb.adu;
import tb.com;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c Companion;
    public static final int QR_CODE_TYPE_TEXT = 2;
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_MUS = 2;
    public static final int TYPE_TIME = 1;

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f6538a;
    private Activity b;
    private int c;
    private rul<? super AuctionItemVO, t> d;
    private rul<? super ScanDo, t> e;
    private adt f;
    private List<Object> g;
    private rul<? super ads, t> h;
    private boolean i;

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ScanDo b;

        public d(ScanDo scanDo) {
            this.b = scanDo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            rul<ScanDo, t> b = a.this.b();
            if (b == null) {
                return;
            }
            b.mo2421invoke(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AuctionItemVO b;

        public e(AuctionItemVO auctionItemVO) {
            this.b = auctionItemVO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            rul<AuctionItemVO, t> a2 = a.this.a();
            if (a2 == null) {
                return;
            }
            a2.mo2421invoke(this.b);
        }
    }

    static {
        kge.a(621192426);
        Companion = new c(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -955520525) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode != 1216347414) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
    }

    public final rul<AuctionItemVO, t> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("f0a3bb5", new Object[]{this}) : this.d;
    }

    public final rul<ScanDo, t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("16bbe114", new Object[]{this}) : this.e;
    }

    public a(Activity activity, int i, boolean z, rul<? super AuctionItemVO, t> rulVar, rul<? super ScanDo, t> rulVar2, rul<? super ads, t> rulVar3) {
        q.c(activity, "activity");
        this.b = activity;
        this.c = i;
        this.i = z;
        this.d = rulVar;
        this.e = rulVar2;
        this.h = rulVar3;
        this.f6538a = new ArrayList();
        this.g = new ArrayList();
    }

    /* loaded from: classes3.dex */
    public static final class c {
        static {
            kge.a(782562226);
        }

        private c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }
    }

    public final void a(List<Object> targetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, targetData});
            return;
        }
        q.c(targetData, "targetData");
        if (targetData.isEmpty()) {
            return;
        }
        this.g.clear();
        this.g.addAll(targetData);
        this.f6538a.clear();
        this.f6538a.addAll(a(this.g, this.f));
        notifyDataSetChanged();
    }

    public final void a(adt allowanceData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd1ec87", new Object[]{this, allowanceData});
            return;
        }
        q.c(allowanceData, "allowanceData");
        if (this.f != null || this.g.isEmpty()) {
            return;
        }
        this.f = allowanceData;
        this.f6538a.clear();
        this.f6538a.addAll(a(this.g, allowanceData));
        notifyDataSetChanged();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        adt adtVar = this.f;
        if (adtVar == null) {
            return;
        }
        this.f6538a.remove(adtVar);
        notifyDataSetChanged();
        this.f = null;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f6538a.clear();
        this.g.clear();
        this.f = null;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, parent, new Integer(i)});
        }
        q.c(parent, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.feis_item_history_time, parent, false);
            q.a((Object) inflate, "LayoutInflater.from(acti…tory_time, parent, false)");
            return new b(inflate, this.i);
        } else if (i == 2) {
            adu aduVar = new adu(this.b, parent, this.i);
            rul<? super ads, t> rulVar = this.h;
            if (rulVar != null) {
                rulVar.mo2421invoke(aduVar);
            }
            return aduVar;
        } else {
            View inflate2 = LayoutInflater.from(this.b).inflate(R.layout.feis_item_history, parent, false);
            q.a((Object) inflate2, "LayoutInflater.from(acti…rent, false\n            )");
            return new C0213a(inflate2, this.c, this.i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder == null) {
        } else {
            if (viewHolder instanceof b) {
                b bVar = (b) viewHolder;
                Object obj = this.f6538a.get(bVar.getAdapterPosition());
                if (!(obj instanceof String)) {
                    return;
                }
                bVar.a().setText((CharSequence) obj);
            } else if (viewHolder instanceof adu) {
                adu aduVar = (adu) viewHolder;
                Object obj2 = this.f6538a.get(aduVar.getAdapterPosition());
                if (!(obj2 instanceof adt)) {
                    return;
                }
                aduVar.a(aduVar.getAdapterPosition(), (adt) obj2);
            } else {
                View view = viewHolder.itemView;
                q.a((Object) view, "holder.itemView");
                view.setTag("item");
                Object obj3 = this.f6538a.get(viewHolder.getAdapterPosition());
                if (!(obj3 instanceof com.etao.feimagesearch.capture.dynamic.bottom.history.b)) {
                    return;
                }
                Object b2 = ((com.etao.feimagesearch.capture.dynamic.bottom.history.b) obj3).b();
                if (b2 instanceof AuctionItemVO) {
                    a((C0213a) viewHolder, (AuctionItemVO) b2);
                } else if (!(b2 instanceof ScanDo)) {
                } else {
                    a((C0213a) viewHolder, (ScanDo) b2);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f6538a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Object obj = this.f6538a.get(i);
        if (obj instanceof String) {
            return 1;
        }
        return obj instanceof adt ? 2 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof adu)) {
            return;
        }
        ((adu) viewHolder).e();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof adu)) {
            return;
        }
        ((adu) viewHolder).d();
    }

    private final List<Object> a(List<Object> list, adt adtVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66d5aacf", new Object[]{this, list, adtVar});
        }
        if (adtVar == null) {
            return list;
        }
        long j = -1;
        Iterator<Object> it = list.iterator();
        int i2 = 1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(next instanceof String)) {
                if (next instanceof com.etao.feimagesearch.capture.dynamic.bottom.history.b) {
                    Object b2 = ((com.etao.feimagesearch.capture.dynamic.bottom.history.b) next).b();
                    if (b2 instanceof AuctionItemVO) {
                        AuctionItemVO auctionItemVO = (AuctionItemVO) b2;
                        if (auctionItemVO.hasAllowance()) {
                            Long l = auctionItemVO.timeStr;
                            q.a((Object) l, "historyItem.timeStr");
                            j = l.longValue();
                            break;
                        }
                    }
                }
                i2++;
            }
            i++;
        }
        if (!com.etao.feimagesearch.util.b.a(Long.valueOf(j))) {
            return list;
        }
        int i3 = this.c;
        int i4 = i2 % i3;
        if (i4 == 0) {
            i++;
            i4 = i3;
        } else {
            int i5 = (i3 - i4) + 1;
            if (1 <= i5) {
                int i6 = 1;
                while (true) {
                    i++;
                    if (i > list.size() - 1 || (list.get(i) instanceof String) || i6 == i5) {
                        break;
                    }
                    i6++;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "spanCount", (String) Integer.valueOf(this.c));
        jSONObject2.put((JSONObject) "locateIndex", (String) Integer.valueOf(i4));
        adtVar.b(jSONObject);
        if (i > list.size()) {
            list.add(adtVar);
        } else {
            list.add(i, adtVar);
        }
        return list;
    }

    private final void a(C0213a c0213a, AuctionItemVO auctionItemVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f358bedc", new Object[]{this, c0213a, auctionItemVO});
            return;
        }
        c0213a.a().setVisibility(0);
        c0213a.d().setVisibility(8);
        if (auctionItemVO.isVideo) {
            c0213a.c().setVisibility(0);
            ImageView c2 = c0213a.c();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#99000000"));
            c2.setBackground(gradientDrawable);
            c0213a.c().setImageResource(R.drawable.feis_ic_history_video_hint);
            c0213a.b().setImageUrl(auctionItemVO.picPath.toString());
        } else {
            c0213a.b().setImageUrl(auctionItemVO.picPath.toString(), "180x180");
            c0213a.c().setVisibility(8);
        }
        c0213a.itemView.setOnClickListener(new e(auctionItemVO));
        String a2 = com.etao.feimagesearch.util.b.a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19906), auctionItemVO.timeStr);
        View view = c0213a.itemView;
        q.a((Object) view, "holder.itemView");
        StringBuilder sb = new StringBuilder();
        sb.append(com.alibaba.ability.localization.b.a(auctionItemVO.isVideo ? R.string.taobao_app_1007_item_video : R.string.taobao_app_1007_item_image));
        sb.append("，");
        if (TextUtils.isEmpty(a2)) {
            a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_unknown_time);
        }
        sb.append(a2);
        sb.append("，");
        sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_visit));
        view.setContentDescription(sb.toString());
    }

    private final void a(C0213a c0213a, ScanDo scanDo) {
        URL url;
        String localizationTitle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff9445b", new Object[]{this, c0213a, scanDo});
            return;
        }
        c0213a.itemView.setOnClickListener(new d(scanDo));
        String a2 = com.etao.feimagesearch.util.b.a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19906), Long.valueOf(scanDo.getTime()));
        View view = c0213a.itemView;
        q.a((Object) view, "holder.itemView");
        StringBuilder sb = new StringBuilder();
        sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_code_link));
        sb.append("，");
        if (TextUtils.isEmpty(a2)) {
            a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_unknown_time);
        }
        sb.append(a2);
        sb.append("，");
        sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_visit));
        view.setContentDescription(sb.toString());
        if (scanDo.getType() == 4) {
            c0213a.a().setVisibility(8);
            c0213a.d().setVisibility(0);
            ViewGroup.LayoutParams layoutParams = c0213a.e().getLayoutParams();
            int a3 = j.a(25.0f);
            layoutParams.height = a3;
            layoutParams.width = a3;
            c0213a.e().setLayoutParams(layoutParams);
            c0213a.f().setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18969));
            c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01Egikvh27OxTJ8lj4r_!!6000000007788-49-tps-112-112.webp");
        } else if (scanDo.getType() == 1) {
            if (scanDo.getProduct() != null) {
                Product product = scanDo.getProduct();
                q.a((Object) product, "item.product");
                if (!TextUtils.isEmpty(product.getPic())) {
                    c0213a.a().setVisibility(0);
                    c0213a.d().setVisibility(8);
                    c0213a.c().setVisibility(0);
                    ImageView c2 = c0213a.c();
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(Color.parseColor("#99000000"));
                    c2.setBackground(gradientDrawable);
                    c0213a.c().setImageResource(R.drawable.feis_ic_scan_hint);
                    TUrlImageView b2 = c0213a.b();
                    Product product2 = scanDo.getProduct();
                    q.a((Object) product2, "item.product");
                    b2.setImageUrl(product2.getPic());
                    return;
                }
            }
            c0213a.a().setVisibility(8);
            c0213a.d().setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = c0213a.e().getLayoutParams();
            layoutParams2.height = j.a(20.0f);
            layoutParams2.width = j.a(36.0f);
            c0213a.e().setLayoutParams(layoutParams2);
            c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01Egikvh27OxTJ8lj4r_!!6000000007788-49-tps-112-112.webp");
            TextView f = c0213a.f();
            if (TextUtils.isEmpty(scanDo.getTitle())) {
                localizationTitle = com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18912);
            } else {
                localizationTitle = scanDo.getLocalizationTitle();
            }
            f.setText(localizationTitle);
        } else if (scanDo.getType() == 2 || scanDo.getType() == 3) {
            c0213a.a().setVisibility(8);
            c0213a.d().setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = c0213a.e().getLayoutParams();
            int a4 = j.a(29.0f);
            layoutParams3.height = a4;
            layoutParams3.width = a4;
            c0213a.e().setLayoutParams(layoutParams3);
            if (scanDo.getType() == 3) {
                c0213a.f().setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18946));
                c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01TMxkha1WXX6ZH0z0N_!!6000000002798-49-tps-112-112.webp");
            }
            if (scanDo.getImage() == 2) {
                c0213a.f().setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18951));
                c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01V6My0l1czpGUV2Bbp_!!6000000003672-49-tps-112-112.webp");
                return;
            }
            try {
                url = new URL(scanDo.getLink());
            } catch (Exception unused) {
                url = null;
            }
            if (url == null) {
                c0213a.f().setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18930));
                c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01V6My0l1czpGUV2Bbp_!!6000000003672-49-tps-112-112.webp");
                return;
            }
            String link = scanDo.getLink();
            q.a((Object) link, "item.link");
            if (n.b((CharSequence) link, (CharSequence) "taobao", false, 2, (Object) null)) {
                c0213a.f().setText(url.getPath());
                c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01TMxkha1WXX6ZH0z0N_!!6000000002798-49-tps-112-112.webp");
                return;
            }
            c0213a.f().setText(scanDo.getLink());
            c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01V6My0l1czpGUV2Bbp_!!6000000003672-49-tps-112-112.webp");
        } else {
            c0213a.a().setVisibility(8);
            c0213a.d().setVisibility(0);
            ViewGroup.LayoutParams layoutParams4 = c0213a.e().getLayoutParams();
            int a5 = j.a(25.0f);
            layoutParams4.height = a5;
            layoutParams4.width = a5;
            c0213a.e().setLayoutParams(layoutParams4);
            c0213a.e().setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01V6My0l1czpGUV2Bbp_!!6000000003672-49-tps-112-112.webp");
            if (TextUtils.isEmpty(scanDo.getLink())) {
                c0213a.f().setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18930));
            } else {
                c0213a.f().setText(scanDo.getLink());
            }
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.history.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0213a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final View f6539a;
        private final TUrlImageView b;
        private final ImageView c;
        private final View d;
        private final TUrlImageView e;
        private final TextView f;

        static {
            kge.a(-1897627700);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0213a(View itemView, int i, boolean z) {
            super(itemView);
            q.c(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.fl_pic_container);
            q.a((Object) findViewById, "itemView.findViewById(R.id.fl_pic_container)");
            this.f6539a = findViewById;
            View findViewById2 = itemView.findViewById(R.id.iv_history);
            q.a((Object) findViewById2, "itemView.findViewById(R.id.iv_history)");
            this.b = (TUrlImageView) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.iv_hint);
            q.a((Object) findViewById3, "itemView.findViewById(R.id.iv_hint)");
            this.c = (ImageView) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.ll_code_container);
            q.a((Object) findViewById4, "itemView.findViewById(R.id.ll_code_container)");
            this.d = findViewById4;
            View findViewById5 = itemView.findViewById(R.id.iv_scan_hint);
            q.a((Object) findViewById5, "itemView.findViewById(R.id.iv_scan_hint)");
            this.e = (TUrlImageView) findViewById5;
            View findViewById6 = itemView.findViewById(R.id.tv_scan_title);
            TextView textView = (TextView) findViewById6;
            textView.setTextSize(1, z ? 16.0f : 12.0f);
            q.a((Object) findViewById6, "itemView.findViewById<Te…lder) 16f else 12f)\n    }");
            this.f = textView;
            itemView.setTag("pic");
            int b = (com.b(com.b()) - ((i - 1) * com.etao.feimagesearch.capture.dynamic.bottom.album.d.Companion.a())) / i;
            itemView.getLayoutParams().width = b;
            itemView.getLayoutParams().height = b;
        }

        public final View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f6539a;
        }

        public final TUrlImageView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4309e173", new Object[]{this}) : this.b;
        }

        public final ImageView c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3b72af66", new Object[]{this}) : this.c;
        }

        public final View d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.d;
        }

        public final TUrlImageView e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("46acda10", new Object[]{this}) : this.e;
        }

        public final TextView f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("9d1fd361", new Object[]{this}) : this.f;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final TextView f6540a;

        static {
            kge.a(-1707968762);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView, boolean z) {
            super(itemView);
            q.c(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.tv_time);
            TextView textView = (TextView) findViewById;
            textView.setTextSize(1, z ? 18.0f : 12.0f);
            q.a((Object) findViewById, "itemView.findViewById<Te…lder) 18f else 12f)\n    }");
            this.f6540a = textView;
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.f6540a;
        }
    }
}
