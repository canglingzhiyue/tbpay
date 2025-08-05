package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.FilterImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.i;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class ShopPromotionFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GIFT_CONTENT_PADDING_DP = 10;
    private static final int GIFT_CONTENT_UI_ITEM_COUNT = 3;
    private static final String RIGHT_ARROW_ICON = "큚";
    private int density;
    private eyx mDetailContext;
    private ShopPromotionAdapter shopPromotionAdapter;
    public List<Resource.g> shopPromotionList;

    /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 extends JSONObject {
        public final /* synthetic */ String val$url;

        public AnonymousClass1(String str) {
            this.val$url = str;
            put("type", "openUrl");
            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.1.1
                {
                    put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.1.1.1
                        {
                            put("url", (Object) AnonymousClass1.this.val$url);
                        }
                    });
                }
            });
        }
    }

    static {
        kge.a(683185750);
    }

    public static /* synthetic */ Object ipc$super(ShopPromotionFragment shopPromotionFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ int access$000(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b57f6287", new Object[]{shopPromotionFragment})).intValue() : shopPromotionFragment.density;
    }

    public static /* synthetic */ void access$100(ShopPromotionFragment shopPromotionFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efd4fbd", new Object[]{shopPromotionFragment, str});
        } else {
            shopPromotionFragment.openUrlByAbility(str);
        }
    }

    public static /* synthetic */ eyx access$200(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("9493edb0", new Object[]{shopPromotionFragment}) : shopPromotionFragment.mDetailContext;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, List<Resource.g> list, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9d0dd1", new Object[]{fragmentActivity, str, list, eyxVar});
        } else if (fragmentActivity == null || TextUtils.isEmpty(str) || list == null) {
        } else {
            ShopPromotionFragment newInstance = newInstance(str, list);
            newInstance.setDetailContext(eyxVar);
            startFragment(fragmentActivity, newInstance);
        }
    }

    public static ShopPromotionFragment newInstance(String str, List<Resource.g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopPromotionFragment) ipChange.ipc$dispatch("d0d68072", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        ShopPromotionFragment shopPromotionFragment = new ShopPromotionFragment();
        shopPromotionFragment.setShopPromotionList(list);
        shopPromotionFragment.setArguments(bundle);
        return shopPromotionFragment;
    }

    public void setShopPromotionList(List<Resource.g> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53702541", new Object[]{this, list});
        } else {
            this.shopPromotionList = list;
        }
    }

    private void setDetailContext(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f4380f", new Object[]{this, eyxVar});
        } else {
            this.mDetailContext = eyxVar;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.density = (int) getResources().getDisplayMetrics().density;
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.tt_detail_float_dialog, viewGroup, false);
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.shopPromotionAdapter != null) {
            return;
        }
        this.shopPromotionAdapter = new ShopPromotionAdapter();
        this.lvData.setAdapter((ListAdapter) this.shopPromotionAdapter);
        List<Resource.g> list = this.shopPromotionList;
        if (list == null || list.size() != 1) {
            return;
        }
        this.lvData.setDivider(null);
    }

    /* loaded from: classes5.dex */
    public class ShopPromotionAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$ShopPromotionAdapter$3  reason: invalid class name */
        /* loaded from: classes5.dex */
        public class AnonymousClass3 implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Resource.g f10752a;

            /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$ShopPromotionAdapter$3$1  reason: invalid class name */
            /* loaded from: classes5.dex */
            public class AnonymousClass1 extends JSONObject {
                public AnonymousClass1() {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.3.1.1
                        {
                            put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.3.1.1.1
                                {
                                    put("url", (Object) AnonymousClass3.this.f10752a.b());
                                }
                            });
                        }
                    });
                }
            }

            public AnonymousClass3(Resource.g gVar) {
                this.f10752a = gVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ShopPromotionFragment.access$200(ShopPromotionFragment.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new AnonymousClass1()), new RuntimeAbilityParam[0]);
                }
            }
        }

        static {
            kge.a(-2123671056);
        }

        public static /* synthetic */ Object ipc$super(ShopPromotionAdapter shopPromotionAdapter, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public ShopPromotionAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ShopPromotionFragment.this.shopPromotionList != null) {
                return ShopPromotionFragment.this.shopPromotionList.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : ShopPromotionFragment.this.shopPromotionList.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            LinearLayout linearLayout = new LinearLayout(y.a(viewGroup));
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 15, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 15);
            bindData2(i, y.a(viewGroup), linearLayout);
            return linearLayout;
        }

        private void bindData2(int i, Context context, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19c58d76", new Object[]{this, new Integer(i), context, viewGroup});
                return;
            }
            Resource.g gVar = ShopPromotionFragment.this.shopPromotionList.get(i);
            if (gVar.e() != null && gVar.e().size() > 0) {
                handleWithGiftContent(viewGroup, gVar);
            } else {
                handleNoGiftContent(viewGroup, gVar);
            }
        }

        private void handleWithGiftContent(ViewGroup viewGroup, final Resource.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ea478d7", new Object[]{this, viewGroup, gVar});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (gVar.c() == null || "".equals(gVar.c())) {
                textView.setVisibility(8);
            } else {
                textView.setText(gVar.c());
            }
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!TextUtils.isEmpty(gVar.a())) {
                textView2.setVisibility(0);
                textView2.setText(gVar.a());
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) relativeLayout.findViewById(R.id.right_icon);
            if (!TextUtils.isEmpty(gVar.b())) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            ShopPromotionFragment.access$100(ShopPromotionFragment.this, gVar.b());
                        }
                    }
                });
            } else {
                textView3.setVisibility(8);
            }
            if (gVar.d() != null && gVar.d().size() > 0) {
                ((TextView) relativeLayout.findViewById(R.id.content)).setText(gVar.d().get(0));
            }
            viewGroup.addView(relativeLayout);
            if (gVar.d() != null && gVar.d().size() > 0) {
                if (handleGift(gVar, 0, relativeLayout)) {
                    if (gVar.d().size() > 1) {
                        addDivision(relativeLayout, R.id.recommend_items);
                    }
                } else if (gVar.d().size() > 1) {
                    addDivision(relativeLayout, R.id.sub_container);
                }
            }
            if (gVar.d() == null || gVar.d().size() <= 1) {
                return;
            }
            for (int i = 1; i < gVar.d().size(); i++) {
                handleMoreGiftContent(viewGroup, gVar, i);
            }
        }

        private void addDivision(RelativeLayout relativeLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45935758", new Object[]{this, relativeLayout, new Integer(i)});
                return;
            }
            View view = new View(ShopPromotionFragment.this.context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
            layoutParams.setMargins(0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12, 0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12);
            view.setBackgroundColor(436207616);
            layoutParams.addRule(1, R.id.icon_text);
            layoutParams.addRule(3, i);
            view.setLayoutParams(layoutParams);
            relativeLayout.addView(view);
        }

        private void handleMoreGiftContent(ViewGroup viewGroup, Resource.g gVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abc4505d", new Object[]{this, viewGroup, gVar, new Integer(i)});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (gVar.c() == null || "".equals(gVar.c())) {
                textView.setVisibility(8);
            } else {
                textView.setText(gVar.c());
            }
            textView.setVisibility(4);
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!TextUtils.isEmpty(gVar.a())) {
                textView2.setVisibility(0);
                textView2.setText(gVar.a());
            } else {
                textView2.setVisibility(8);
            }
            relativeLayout.findViewById(R.id.right_icon).setVisibility(8);
            ((TextView) relativeLayout.findViewById(R.id.content)).setText(gVar.d().get(i));
            viewGroup.addView(relativeLayout);
            if (handleGift(gVar, i, relativeLayout)) {
                if (i >= gVar.d().size() - 1) {
                    return;
                }
                addDivision(relativeLayout, R.id.recommend_items);
            } else if (i >= gVar.d().size() - 1) {
            } else {
                addDivision(relativeLayout, R.id.sub_container);
            }
        }

        private boolean handleGift(Resource.g gVar, int i, ViewGroup viewGroup) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("262f934d", new Object[]{this, gVar, new Integer(i), viewGroup})).booleanValue();
            }
            Iterator<Resource.e> it = gVar.e().iterator();
            Resource.e eVar = null;
            while (it.hasNext()) {
                Resource.e next = it.next();
                if (next.f10621a == i) {
                    eVar = next;
                }
            }
            if (eVar == null || eVar.b == null || eVar.b.size() == 0) {
                return false;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.tt_detail_main_shop_promotion_sub_item, viewGroup, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 6, 0, 0);
            layoutParams.addRule(3, R.id.sub_container);
            layoutParams.addRule(1, R.id.icon_text);
            inflate.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.recommend_items_container);
            int size = getSize();
            for (int i2 = 0; i2 < eVar.b.size(); i2++) {
                try {
                    final String a2 = eVar.b.get(i2).a();
                    view = createGiftOfContentItemView(ShopPromotionFragment.this.context, eVar.b.get(i2), size, i2);
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            } else {
                                ShopPromotionFragment.access$100(ShopPromotionFragment.this, ShopPromotionFragment.this.context.getString(R.string.tt_detail_url, a2));
                            }
                        }
                    });
                } catch (Exception unused) {
                    view = null;
                }
                linearLayout.addView(view);
            }
            viewGroup.addView(inflate);
            return true;
        }

        private View createGiftOfContentItemView(Context context, Resource.d dVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a3e4496a", new Object[]{this, context, dVar, new Integer(i), new Integer(i2)});
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FilterImageView filterImageView = new FilterImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.setMargins(0, 0, 0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 3);
            linearLayout.addView(filterImageView, layoutParams);
            i.a().a(dVar.b(), filterImageView);
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(f.a(context, 2.0f), 0, 0, 0);
            textView.setMinLines(2);
            textView.setMaxLines(2);
            textView.setLineSpacing(ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 2, 1.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(context.getResources().getColor(R.color.tt_detail_6));
            textView.setTextSize(12.0f);
            textView.setText(dVar.c());
            linearLayout.addView(textView, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            if (i2 > 0) {
                layoutParams3.setMargins(ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 3, 0, 0, 0);
            }
            linearLayout.setLayoutParams(layoutParams3);
            return linearLayout;
        }

        private int getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
            }
            int a2 = (f.a(y.a(ShopPromotionFragment.this)) - (f.a(ShopPromotionFragment.this.context, 22.0f) << 1)) / 3;
            return a2 - (a2 / 6);
        }

        private void handleNoGiftContent(ViewGroup viewGroup, Resource.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ec3c3d2", new Object[]{this, viewGroup, gVar});
                return;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.icon_text);
            if (gVar.c() == null || "".equals(gVar.c())) {
                textView.setVisibility(8);
            } else {
                textView.setText(gVar.c());
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.period);
            if (!TextUtils.isEmpty(gVar.a())) {
                textView2.setVisibility(0);
                textView2.setText(gVar.a());
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.right_icon);
            if (!TextUtils.isEmpty(gVar.b())) {
                textView3.setVisibility(0);
                inflate.setOnClickListener(new AnonymousClass3(gVar));
                inflate.setClickable(true);
            } else {
                textView3.setVisibility(8);
                inflate.setClickable(false);
            }
            StringBuilder sb = new StringBuilder();
            if (gVar.d() != null) {
                for (int i = 0; i < gVar.d().size(); i++) {
                    sb.append(gVar.d().get(i));
                    if (i != gVar.d().size() - 1) {
                        sb.append(';');
                    }
                }
                ((TextView) inflate.findViewById(R.id.content)).setText(sb.toString());
            }
            viewGroup.addView(inflate);
        }
    }

    private void openUrlByAbility(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f95f9f", new Object[]{this, str});
        } else {
            this.mDetailContext.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new AnonymousClass1(str)), new RuntimeAbilityParam[0]);
        }
    }
}
