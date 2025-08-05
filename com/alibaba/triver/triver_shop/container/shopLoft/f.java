package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.e;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import org.android.agoo.common.AgooConstants;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class f extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a d;
    private List<JSONObject> e;
    private ShopLoftComponentView.a f;
    private e.c g;
    private Bundle h;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3722a = true;
    private final Set<com.alibaba.triver.triver_shop.container.shopLoft.b> b = new HashSet();
    private final b.a c = new b.a();
    private final boolean i = cen.Companion.ab();
    private final long j = System.currentTimeMillis();
    private boolean l = true;
    private final ShopContentRecyclerView.b k = new b();

    static {
        kge.a(1689642093);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -1324657775) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ Set a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("514be554", new Object[]{fVar}) : fVar.b;
    }

    public static final /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9d494f", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.l = z;
        }
    }

    public static final /* synthetic */ void b(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c531610", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.a(z);
        }
    }

    public static final /* synthetic */ boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2764548", new Object[]{fVar})).booleanValue() : fVar.i;
    }

    public static final /* synthetic */ long c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f635c57", new Object[]{fVar})).longValue() : fVar.j;
    }

    public static final /* synthetic */ b.a d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("9bb59366", new Object[]{fVar}) : fVar.c;
    }

    public static final /* synthetic */ boolean e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("893d8aa5", new Object[]{fVar})).booleanValue() : fVar.l;
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

    /* JADX WARN: Type inference failed for: r4v6, types: [com.alibaba.triver.triver_shop.container.shopLoft.f$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, aVar});
        } else {
            b(aVar);
        }
    }

    public final a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6edf548", new Object[]{this}) : this.d;
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cb3108", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public final void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public final List<JSONObject> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.e;
    }

    public final void a(ShopLoftComponentView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5765c53", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final ShopLoftComponentView.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopLoftComponentView.a) ipChange.ipc$dispatch("3dd8d355", new Object[]{this}) : this.f;
    }

    public final void a(e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15174127", new Object[]{this, cVar});
        } else {
            this.g = cVar;
        }
    }

    public final e.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.c) ipChange.ipc$dispatch("e90ee76a", new Object[]{this}) : this.g;
    }

    public final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.h = bundle;
        }
    }

    public final Bundle e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("fa69e430", new Object[]{this}) : this.h;
    }

    private final void a(boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Bundle bundle = this.h;
        if (bundle != null && (string = bundle.getString("initMuteStatus")) != null) {
            this.l = q.a((Object) string, (Object) "true");
        } else {
            this.l = z ? com.alibaba.triver.triver_shop.newShop.ext.h.c() : com.alibaba.triver.triver_shop.newShop.ext.h.b();
        }
    }

    public a a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8efcc91c", new Object[]{this, parent, new Integer(i)});
        }
        q.d(parent, "parent");
        Context context = parent.getContext();
        q.b(context, "parent.context");
        View a2 = o.a(context, R.layout.view_second_floor_page_container);
        if (a2 != null) {
            a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        if (a2 != null) {
            a2.setBackgroundColor(-16777216);
        }
        return new a(this, a2);
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29b62fb", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        if (aVar != null) {
            List<JSONObject> list = this.e;
            aVar.a(list == null ? null : list.get(i), this.f3722a, i);
        }
        if (!this.f3722a) {
            return;
        }
        this.f3722a = false;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3723a;
        private com.alibaba.triver.triver_shop.container.shopLoft.b b;
        private String c;
        private JSONObject d;
        private View e;
        private FrameLayout f;
        private TUrlImageView g;
        private TextView h;
        private TextView i;
        private boolean j;
        private boolean k;

        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0129a implements b.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f3724a;
            public final /* synthetic */ a b;

            public C0129a(f fVar, a aVar) {
                this.f3724a = fVar;
                this.b = aVar;
            }

            @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.c
            public final void a(String str, JSONObject jSONObject) {
                ShopLoftComponentView.a c;
                String string;
                ShopLoftComponentView.a c2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
                } else if (str == null) {
                } else {
                    switch (str.hashCode()) {
                        case -1830782603:
                            if (!str.equals(b.c.EVENT_UT_PAGE_DIS_APPEAR)) {
                                return;
                            }
                            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.b.itemView.getContext());
                            return;
                        case -1603590909:
                            if (!str.equals(b.c.EVENT_UT_PAGE_APPEAR)) {
                                return;
                            }
                            UTAnalytics.getInstance().getDefaultTracker().pageAppear(this.b.itemView.getContext());
                            return;
                        case -1308497988:
                            if (!str.equals(b.c.EVENT_ON_SCROLL_DISABLE) || (c = this.f3724a.c()) == null) {
                                return;
                            }
                            c.b();
                            return;
                        case -1143385942:
                            if (!str.equals(b.c.EVENT_ON_MUTE_STATUS_CHANGED) || jSONObject == null || (string = jSONObject.getString("isMuted")) == null) {
                                return;
                            }
                            f.a(this.f3724a, q.a((Object) string, (Object) "true"));
                            return;
                        case -550425746:
                            if (!str.equals(b.c.EVENT_ON_SHOW_BAR)) {
                                return;
                            }
                            Intent intent = new Intent();
                            intent.setAction(ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT);
                            intent.putExtra("event", b.c.EVENT_ON_SHOW_BAR);
                            LocalBroadcastManager.getInstance(this.b.itemView.getContext()).sendBroadcastSync(intent);
                            return;
                        case 235531827:
                            if (!str.equals(b.c.EVENT_ON_HIDE_BAR)) {
                                return;
                            }
                            Intent intent2 = new Intent();
                            intent2.setAction(ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT);
                            intent2.putExtra("event", b.c.EVENT_ON_HIDE_BAR);
                            LocalBroadcastManager.getInstance(this.b.itemView.getContext()).sendBroadcastSync(intent2);
                            return;
                        case 821786159:
                            if (!str.equals(b.c.EVENT_ON_SCROLL_ENABLE) || (c2 = this.f3724a.c()) == null) {
                                return;
                            }
                            c2.a();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f3725a;
            public final /* synthetic */ FrameLayout b;

            public b(JSONObject jSONObject, FrameLayout frameLayout) {
                this.f3725a = jSONObject;
                this.b = frameLayout;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                String string = this.f3725a.getString("targetUrl");
                if (string == null) {
                    return;
                }
                Nav.from(this.b.getContext()).toUri(string);
            }
        }

        static {
            kge.a(790441954);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f this$0, View view) {
            super(view);
            q.d(this$0, "this$0");
            this.f3723a = this$0;
            TextView textView = null;
            this.e = view == null ? null : view.findViewById(R.id.second_floor_bottom_guid_container);
            this.f = view == null ? null : (FrameLayout) view.findViewById(R.id.second_floor_content_container);
            this.g = view == null ? null : (TUrlImageView) view.findViewById(R.id.second_floor_bottom_guid_image);
            this.h = view == null ? null : (TextView) view.findViewById(R.id.second_floor_bottom_guid_text_content_1);
            this.i = view != null ? (TextView) view.findViewById(R.id.second_floor_bottom_guid_text_content_2) : textView;
        }

        public static final /* synthetic */ void a(a aVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773dce6", new Object[]{aVar, str, str2, str3});
            } else {
                aVar.a(str, str2, str3);
            }
        }

        public final com.alibaba.triver.triver_shop.container.shopLoft.b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.b) ipChange.ipc$dispatch("7c53e469", new Object[]{this}) : this.b;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.d;
        }

        public final View d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.e;
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.j = z;
            }
        }

        public final void a(JSONObject jSONObject, boolean z, int i) {
            Object m2371constructorimpl;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ac5437", new Object[]{this, jSONObject, new Boolean(z), new Integer(i)});
            } else if (jSONObject == null) {
            } else {
                this.d = jSONObject;
                String a2 = a(jSONObject);
                JSONObject jSONObject3 = jSONObject;
                jSONObject3.put((JSONObject) "listInstanceId", (String) Long.valueOf(f.c(this.f3723a)));
                jSONObject3.put((JSONObject) "shareUrl", a2);
                Bundle e = this.f3723a.e();
                jSONObject3.put((JSONObject) "shopId", e == null ? null : e.getString("shop_id"));
                Bundle e2 = this.f3723a.e();
                jSONObject3.put((JSONObject) "sellerId", e2 == null ? null : e2.getString("seller_id"));
                Bundle e3 = this.f3723a.e();
                jSONObject3.put((JSONObject) "sellerid", e3 == null ? null : e3.getString("seller_id"));
                Bundle e4 = this.f3723a.e();
                jSONObject3.put((JSONObject) "widgetShareParams", e4 == null ? null : e4.getString("widgetShareParams"));
                Bundle e5 = this.f3723a.e();
                jSONObject3.put((JSONObject) "entrySpm", e5 == null ? null : e5.getString("entrySpm"));
                jSONObject3.put((JSONObject) "nativeIndex", (String) Integer.valueOf(getAdapterPosition()));
                this.c = ShopLoftViewManager.getTypeFromSceneId(jSONObject.getString("sceneId"));
                if (z) {
                    f.b(this.f3723a, q());
                }
                jSONObject3.put((JSONObject) "initMuteStatus", (String) Boolean.valueOf(f.e(this.f3723a)));
                if (q.a((Object) ShopLoftViewManager.TYPE_MARKET, (Object) this.c) && q.a((Object) AgooConstants.ACK_FLAG_NULL, (Object) jSONObject.getString("contentType"))) {
                    this.c = ShopLoftViewManager.TYPE_LIVE_CARD;
                } else if (q.a((Object) ShopLoftViewManager.TYPE_MARKET, (Object) this.c) && q.a((Object) "video", (Object) jSONObject.getString("marketType"))) {
                    this.c = ShopLoftViewManager.TYPE_MARKET_VIDEO;
                }
                this.b = ShopLoftViewManager.createShopLoftViewByType(this.c);
                if (this.b == null) {
                    return;
                }
                f fVar = this.f3723a;
                try {
                    Result.a aVar = Result.Companion;
                    ceg.Companion.a(q.a("init with data : ", (Object) jSONObject));
                    com.alibaba.triver.triver_shop.container.shopLoft.b a3 = a();
                    q.a(a3);
                    a3.initWithData(this.itemView.getContext(), jSONObject, new C0129a(fVar, this), f.d(fVar));
                    m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                } catch (Throwable th) {
                    Result.a aVar2 = Result.Companion;
                    m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
                }
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                if (m2374exceptionOrNullimpl != null) {
                    ceg.Companion.a("init with data error : ", m2374exceptionOrNullimpl);
                }
                com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
                q.a(bVar);
                View view = bVar.getView();
                if (view == null) {
                    ceg.a aVar3 = ceg.Companion;
                    aVar3.b("loftView null , type is = " + ((Object) this.c) + " , data is = " + jSONObject);
                    return;
                }
                FrameLayout frameLayout = this.f;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    if (q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_LIVE_CARD)) {
                        frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                    } else {
                        frameLayout.addView(view);
                    }
                    if (q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_VIDEO)) {
                        Context context = frameLayout.getContext();
                        q.b(context, "itemView.context");
                        frameLayout.setPadding(0, com.alibaba.triver.triver_shop.newShop.ext.b.a(context, o.a((Number) 14)), 0, 0);
                    } else {
                        frameLayout.setPadding(0, 0, 0, 0);
                    }
                    if (q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_LIVE) && !q.a((Object) "shop", (Object) jSONObject.getString("source")) && (jSONObject2 = jSONObject.getJSONObject("jumpButton")) != null) {
                        View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.view_shop_loft_back_to_shop_layout, (ViewGroup) null);
                        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.shop_loft_back_to_home_img);
                        TextView textView = (TextView) inflate.findViewById(R.id.shop_loft_back_to_home_text);
                        String string = jSONObject2.getString("iconUrl");
                        if (string != null) {
                            tUrlImageView.setImageUrl(string);
                        }
                        String string2 = jSONObject2.getString("name");
                        if (string2 != null) {
                            textView.setText(string2);
                        }
                        inflate.setOnClickListener(new b(jSONObject2, frameLayout));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o.a((Number) 79), o.a((Number) 25));
                        layoutParams.gravity = 8388627;
                        frameLayout.addView(inflate, layoutParams);
                    }
                }
                e();
                if (z) {
                    i();
                    g();
                    this.f3723a.a(this);
                }
                Set a4 = f.a(this.f3723a);
                com.alibaba.triver.triver_shop.container.shopLoft.b bVar2 = this.b;
                q.a(bVar2);
                a4.add(bVar2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e() {
            /*
                Method dump skipped, instructions count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.f.a.e():void");
        }

        private final void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            View view = this.e;
            if (view != null) {
                o.b(view);
            }
            TextView textView = this.h;
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            TUrlImageView tUrlImageView = this.g;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(str3);
            }
            TUrlImageView tUrlImageView2 = this.g;
            if (tUrlImageView2 == null) {
                return;
            }
            tUrlImageView2.setSkipAutoSize(true);
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar != null) {
                bVar.onDestroyed();
            }
            Set a2 = f.a(this.f3723a);
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar2 = this.b;
            if (a2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            x.c(a2).remove(bVar2);
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar != null) {
                bVar.didAppear();
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.mute(f.e(this.f3723a));
            }
            k();
            if (q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_LIVE)) {
                e.c d = this.f3723a.d();
                if (d == null) {
                    return;
                }
                d.b();
                return;
            }
            e.c d2 = this.f3723a.d();
            if (d2 == null) {
                return;
            }
            String str = this.c;
            if (str == null) {
                str = "";
            }
            d2.a(str);
        }

        public final void h() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar != null) {
                bVar.didDisappear();
            }
            l();
            JSONObject jSONObject = this.d;
            if (jSONObject == null) {
                return;
            }
            jSONObject.put("alreadyLeave", (Object) "true");
            if (q.a((Object) jSONObject.getString("keepTransitionCard"), (Object) "true") || (view = this.e) == null) {
                return;
            }
            o.e(view);
        }

        public final void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.willAppear();
        }

        public final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar == null) {
                return;
            }
            bVar.willDisappear();
        }

        public final void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
                return;
            }
            ceg.a aVar = ceg.Companion;
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            aVar.a(q.a("pageAppear , ", (Object) (bVar == null ? null : bVar.getUTPageName())));
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.itemView.getContext());
            Map<String, String> o = o();
            o.put("spm", "a2141.25663520.0.0");
            if (p()) {
                m.b("Page_Shop_2Fcontentfeed", "Page_Shop_2Fcontentfeed_video_exposure", o);
            }
            if (!q()) {
                return;
            }
            m.b("Page_Shop_2Fcontentfeed", "Page_Shop_2Fcontentfeed_live_exposure", o);
        }

        private final void n() {
            String string;
            JSONObject jSONObject;
            String string2;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            Map<String, String> uTProperties;
            Map<String, String> uTProperties2;
            String uTPageName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6239df5", new Object[]{this});
                return;
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            if (bVar != null && (uTPageName = bVar.getUTPageName()) != null) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), uTPageName);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar2 = this.b;
            if (bVar2 != null && (uTProperties2 = bVar2.getUTProperties()) != null) {
                uTProperties2.putAll(o());
                linkedHashMap.putAll(uTProperties2);
                a(uTProperties2.get("spm-cnt"));
            }
            if (p() && f.b(this.f3723a)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), "Page_Shop_2Fcontentfeed");
                HashMap hashMap = new HashMap();
                com.alibaba.triver.triver_shop.container.shopLoft.b bVar3 = this.b;
                if (bVar3 != null && (uTProperties = bVar3.getUTProperties()) != null) {
                    hashMap.putAll(uTProperties);
                }
                HashMap hashMap2 = hashMap;
                hashMap2.put("spm-cnt", "a2141.25663520.0.0");
                hashMap.putAll(o());
                linkedHashMap.putAll(hashMap2);
                a((String) hashMap.get("spm-cnt"));
            }
            JSONObject jSONObject4 = this.d;
            if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("spmParams")) != null && (jSONObject3 = jSONObject2.getJSONObject("args")) != null) {
                linkedHashMap.putAll(com.alibaba.triver.triver_shop.newShop.ext.b.c(jSONObject3));
            }
            JSONObject jSONObject5 = this.d;
            if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("spmParams")) != null && (string2 = jSONObject.getString("arg1")) != null) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.itemView.getContext(), string2);
            }
            linkedHashMap.put("uniqID", String.valueOf(f.c(this.f3723a)));
            linkedHashMap.put("is_back", this.j ? "1" : "0");
            String str = null;
            if (getAdapterPosition() == 0) {
                linkedHashMap.put("cardnum", "0");
                JSONObject jSONObject6 = this.d;
                linkedHashMap.put("entrySource", jSONObject6 == null ? null : jSONObject6.getString("source"));
            }
            JSONObject jSONObject7 = this.d;
            if (jSONObject7 != null && (string = jSONObject7.getString("clickid")) != null) {
                linkedHashMap.put("clickid", string);
            }
            JSONObject jSONObject8 = this.d;
            if (jSONObject8 != null) {
                str = jSONObject8.getString("entryUtParam");
            }
            linkedHashMap.put("entryUtParam", str);
            Context context = this.itemView.getContext();
            q.b(context, "itemView.context");
            m.a(context, linkedHashMap);
        }

        private final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(ai.c(kotlin.j.a("spm-url", str)));
            }
        }

        public final void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6076ef3", new Object[]{this});
                return;
            }
            n();
            ceg.a aVar = ceg.Companion;
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            aVar.a(q.a("pageDisappear , ", (Object) (bVar == null ? null : bVar.getUTPageName())));
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.itemView.getContext());
        }

        public final ShareContent m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareContent) ipChange.ipc$dispatch("9bbbd21a", new Object[]{this});
            }
            com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.b;
            String str = null;
            ShareContent shareContent = bVar == null ? null : bVar.getShareContent();
            if (shareContent == null) {
                return null;
            }
            HashMap hashMap = shareContent.extendParams;
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            JSONObject jSONObject = this.d;
            hashMap.put("id", jSONObject == null ? null : jSONObject.getString("id"));
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            hashMap.put("scene", str);
            shareContent.extendParams = hashMap;
            return shareContent;
        }

        private final String a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
            }
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
            Bundle e = this.f3723a.e();
            buildUpon.appendQueryParameter("seller_id", e == null ? null : e.getString("seller_id"));
            Bundle e2 = this.f3723a.e();
            buildUpon.appendQueryParameter("shop_id", e2 == null ? null : e2.getString("shop_id"));
            buildUpon.appendQueryParameter("first_media_scene", jSONObject.getString("sceneId"));
            buildUpon.appendQueryParameter("first_media_id", jSONObject.getString("id"));
            Bundle e3 = this.f3723a.e();
            if (e3 != null) {
                str = e3.getString("title");
            }
            buildUpon.appendQueryParameter("title", str);
            return buildUpon.build().toString();
        }

        private final Map<String, String> o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            Bundle e = this.f3723a.e();
            String str = null;
            hashMap.put("seller_id", e == null ? null : e.getString("seller_id"));
            Bundle e2 = this.f3723a.e();
            hashMap.put("shop_id", e2 == null ? null : e2.getString("shop_id"));
            Bundle e3 = this.f3723a.e();
            if (e3 != null) {
                str = e3.getString("entrySpm");
            }
            hashMap.put("entrySpm", str);
            return hashMap;
        }

        private final boolean p() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_VIDEO);
        }

        private final boolean q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : q.a((Object) this.c, (Object) ShopLoftViewManager.TYPE_LIVE);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (com.alibaba.triver.triver_shop.container.shopLoft.b bVar : this.b) {
            bVar.onPageStable();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ShopContentRecyclerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                f.this.f();
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.b
        public void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2872548", new Object[]{this, viewHolder, viewHolder2});
            } else if (viewHolder2 == f.this.a()) {
            } else {
                if (viewHolder == null) {
                    viewHolder = f.this.a();
                }
                if (viewHolder instanceof a) {
                    b(viewHolder);
                    ((a) viewHolder).h();
                }
                if (!(viewHolder2 instanceof a)) {
                    return;
                }
                a(viewHolder2);
                a aVar = (a) viewHolder2;
                aVar.g();
                f.this.a(aVar);
                if (viewHolder == null || aVar.getAdapterPosition() >= viewHolder.getAdapterPosition()) {
                    z = false;
                }
                aVar.a(z);
            }
        }

        public void a(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
            } else if (!(viewHolder instanceof a)) {
            } else {
                ((a) viewHolder).i();
            }
        }

        public void b(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
            } else if (!(viewHolder instanceof a)) {
            } else {
                ((a) viewHolder).j();
            }
        }
    }

    public final ShopContentRecyclerView.b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopContentRecyclerView.b) ipChange.ipc$dispatch("45ce928c", new Object[]{this}) : this.k;
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccefc67", new Object[]{this, aVar});
            return;
        }
        super.onViewRecycled(aVar);
        if (aVar != null) {
            aVar.f();
        }
        ceg.Companion.b("onViewRecycled");
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (com.alibaba.triver.triver_shop.container.shopLoft.b bVar : this.b) {
            try {
                bVar.onDestroyed();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.b.clear();
        this.c.a();
    }

    public final ShareContent i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("3f440e9e", new Object[]{this});
        }
        a aVar = this.d;
        if (aVar != null) {
            return aVar.m();
        }
        return null;
    }

    public final b.a j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("4d505695", new Object[]{this}) : this.c;
    }
}
