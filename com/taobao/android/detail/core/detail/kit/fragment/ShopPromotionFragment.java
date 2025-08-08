package com.taobao.android.detail.core.detail.kit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.b;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.view.widget.FilterImageView;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;
import tb.dzh;
import tb.emu;
import tb.enu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ShopPromotionFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GIFT_CONTENT_PADDING_DP = 10;
    private static final int GIFT_CONTENT_UI_ITEM_COUNT = 3;
    private static final String RIGHT_ARROW_ICON = "큚";
    private int density;
    private ShopPromotionAdapter shopPromotionAdapter;
    public List<ResourceNode.j> shopPromotionList;

    static {
        kge.a(-1148802032);
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

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment
    public void queryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b8c419", new Object[]{this});
        }
    }

    public static /* synthetic */ int access$000(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c11fa89", new Object[]{shopPromotionFragment})).intValue() : shopPromotionFragment.density;
    }

    public static /* synthetic */ Context access$101(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6f8b89d0", new Object[]{shopPromotionFragment}) : shopPromotionFragment.context;
    }

    public static /* synthetic */ Context access$201(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("73132cd1", new Object[]{shopPromotionFragment}) : shopPromotionFragment.context;
    }

    public static /* synthetic */ Context access$301(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("769acfd2", new Object[]{shopPromotionFragment}) : shopPromotionFragment.context;
    }

    public static void startFragment(FragmentActivity fragmentActivity, String str, List<ResourceNode.j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0807925", new Object[]{fragmentActivity, str, list});
        } else if (fragmentActivity == null || StringUtils.isEmpty(str) || list == null) {
        } else {
            startFragment(fragmentActivity, newInstance(str, list));
        }
    }

    public static ShopPromotionFragment newInstance(String str, List<ResourceNode.j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopPromotionFragment) ipChange.ipc$dispatch("d5635cbe", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        ShopPromotionFragment shopPromotionFragment = new ShopPromotionFragment();
        shopPromotionFragment.setShopPromotionList(list);
        shopPromotionFragment.setArguments(bundle);
        return shopPromotionFragment;
    }

    public ShopPromotionFragment() {
        emu.a("com.taobao.android.detail.core.detail.kit.fragment.ShopPromotionFragment");
    }

    public void setShopPromotionList(List<ResourceNode.j> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53702541", new Object[]{this, list});
        } else {
            this.shopPromotionList = list;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.density = (int) getResources().getDisplayMetrics().density;
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.x_detail_float_dialog, viewGroup, false);
    }

    @Override // com.taobao.android.detail.core.detail.kit.fragment.FloatFragment, android.support.v4.app.Fragment
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
        List<ResourceNode.j> list = this.shopPromotionList;
        if (list == null || list.size() != 1) {
            return;
        }
        this.lvData.setDivider(null);
    }

    /* loaded from: classes4.dex */
    public class ShopPromotionAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(282459254);
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
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 15, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 12, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 15);
            bindData2(i, viewGroup.getContext(), linearLayout);
            return linearLayout;
        }

        private void bindData2(int i, Context context, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19c58d76", new Object[]{this, new Integer(i), context, viewGroup});
                return;
            }
            ResourceNode.j jVar = ShopPromotionFragment.this.shopPromotionList.get(i);
            if (jVar.h != null && jVar.h.size() > 0) {
                handleWithGiftContent(viewGroup, jVar);
            } else {
                handleNoGiftContent(viewGroup, jVar);
            }
        }

        private void handleWithGiftContent(ViewGroup viewGroup, final ResourceNode.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d733c05d", new Object[]{this, viewGroup, jVar});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.x_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (jVar.f == null || "".equals(jVar.f)) {
                textView.setVisibility(8);
            } else {
                textView.setText(jVar.f);
            }
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!StringUtils.isEmpty(jVar.b)) {
                textView2.setVisibility(0);
                textView2.setText(jVar.b);
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) relativeLayout.findViewById(R.id.right_icon);
            if (!StringUtils.isEmpty(jVar.e)) {
                if (!c.b()) {
                    textView3.setText(ShopPromotionFragment.RIGHT_ARROW_ICON);
                }
                textView3.setVisibility(0);
                textView3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.ShopPromotionFragment.ShopPromotionAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        f.a(ShopPromotionFragment.access$101(ShopPromotionFragment.this), new enu(jVar.e));
                        dzh.l(ShopPromotionFragment.this.context);
                    }
                });
            } else {
                textView3.setVisibility(8);
            }
            if (jVar.g != null && jVar.g.size() > 0) {
                ((TextView) relativeLayout.findViewById(R.id.content)).setText(jVar.g.get(0));
            }
            viewGroup.addView(relativeLayout);
            if (jVar.g != null && jVar.g.size() > 0) {
                if (handleGift(jVar, 0, relativeLayout)) {
                    if (jVar.g.size() > 1) {
                        addDivision(relativeLayout, R.id.recommend_items);
                    }
                } else if (jVar.g.size() > 1) {
                    addDivision(relativeLayout, R.id.sub_container);
                }
            }
            if (jVar.g == null || jVar.g.size() <= 1) {
                return;
            }
            for (int i = 1; i < jVar.g.size(); i++) {
                handleMoreGiftContent(viewGroup, jVar, i);
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

        private void handleMoreGiftContent(ViewGroup viewGroup, ResourceNode.j jVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a54757d7", new Object[]{this, viewGroup, jVar, new Integer(i)});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.x_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (jVar.f == null || "".equals(jVar.f)) {
                textView.setVisibility(8);
            } else {
                textView.setText(jVar.f);
            }
            textView.setVisibility(4);
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!StringUtils.isEmpty(jVar.b)) {
                textView2.setVisibility(0);
                textView2.setText(jVar.b);
            } else {
                textView2.setVisibility(8);
            }
            relativeLayout.findViewById(R.id.right_icon).setVisibility(8);
            ((TextView) relativeLayout.findViewById(R.id.content)).setText(jVar.g.get(i));
            viewGroup.addView(relativeLayout);
            if (handleGift(jVar, i, relativeLayout)) {
                if (i >= jVar.g.size() - 1) {
                    return;
                }
                addDivision(relativeLayout, R.id.recommend_items);
            } else if (i >= jVar.g.size() - 1) {
            } else {
                addDivision(relativeLayout, R.id.sub_container);
            }
        }

        private boolean handleGift(ResourceNode.j jVar, int i, ViewGroup viewGroup) {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dcc25a07", new Object[]{this, jVar, new Integer(i), viewGroup})).booleanValue();
            }
            Iterator<ResourceNode.d> it = jVar.h.iterator();
            ResourceNode.d dVar = null;
            while (it.hasNext()) {
                ResourceNode.d next = it.next();
                if (next.f10003a == i) {
                    dVar = next;
                }
            }
            if (dVar == null || dVar.b == null || dVar.b.size() == 0) {
                return false;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.x_detail_main_shop_promotion_sub_item, viewGroup, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 6, 0, 0);
            layoutParams.addRule(3, R.id.sub_container);
            layoutParams.addRule(1, R.id.icon_text);
            inflate.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.recommend_items_container);
            int size = getSize();
            for (int i2 = 0; i2 < dVar.b.size(); i2++) {
                try {
                    final String str = dVar.b.get(i2).f10002a;
                    view = createGiftOfContentItemView(ShopPromotionFragment.this.context, dVar.b.get(i2), size, i2);
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.ShopPromotionFragment.ShopPromotionAdapter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                                return;
                            }
                            enu enuVar = new enu(ShopPromotionFragment.this.context.getString(R.string.detail_url, str));
                            dzh.n(ShopPromotionFragment.this.context);
                            f.a(ShopPromotionFragment.access$201(ShopPromotionFragment.this), enuVar);
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

        private View createGiftOfContentItemView(Context context, ResourceNode.c cVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("174ba5f4", new Object[]{this, context, cVar, new Integer(i), new Integer(i2)});
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FilterImageView filterImageView = new FilterImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.setMargins(0, 0, 0, ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 3);
            linearLayout.addView(filterImageView, layoutParams);
            com.taobao.android.detail.core.detail.kit.utils.f.a(context).a(filterImageView, cVar.b);
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(b.a(context, 2.0f), 0, 0, 0);
            textView.setMinLines(2);
            textView.setMaxLines(2);
            textView.setLineSpacing(ShopPromotionFragment.access$000(ShopPromotionFragment.this) * 2, 1.0f);
            textView.setEllipsize(StringUtils.TruncateAt.END);
            textView.setTextColor(context.getResources().getColor(R.color.detail_6));
            textView.setTextSize(12.0f);
            textView.setText(cVar.c);
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
            int a2 = (epo.b - (b.a(ShopPromotionFragment.this.context, 22.0f) << 1)) / 3;
            return a2 - (a2 / 6);
        }

        private void handleNoGiftContent(ViewGroup viewGroup, final ResourceNode.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4beab818", new Object[]{this, viewGroup, jVar});
                return;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.context).inflate(R.layout.x_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.icon_text);
            if (jVar.f == null || "".equals(jVar.f)) {
                textView.setVisibility(8);
            } else {
                textView.setText(jVar.f);
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.period);
            if (!StringUtils.isEmpty(jVar.b)) {
                textView2.setVisibility(0);
                textView2.setText(jVar.b);
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.right_icon);
            if (!StringUtils.isEmpty(jVar.e)) {
                textView3.setVisibility(0);
                if (!c.b()) {
                    textView3.setText(ShopPromotionFragment.RIGHT_ARROW_ICON);
                }
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.fragment.ShopPromotionFragment.ShopPromotionAdapter.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        enu enuVar = new enu(jVar.e);
                        dzh.m(ShopPromotionFragment.this.context);
                        f.a(ShopPromotionFragment.access$301(ShopPromotionFragment.this), enuVar);
                    }
                });
                inflate.setClickable(true);
            } else {
                textView3.setVisibility(8);
                inflate.setClickable(false);
            }
            StringBuilder sb = new StringBuilder();
            if (jVar.g != null) {
                for (int i = 0; i < jVar.g.size(); i++) {
                    sb.append(jVar.g.get(i));
                    if (i != jVar.g.size() - 1) {
                        sb.append(';');
                    }
                }
                ((TextView) inflate.findViewById(R.id.content)).setText(sb.toString());
            }
            viewGroup.addView(inflate);
        }
    }
}
