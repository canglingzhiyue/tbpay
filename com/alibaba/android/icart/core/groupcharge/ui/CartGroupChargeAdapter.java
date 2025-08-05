package com.alibaba.android.icart.core.groupcharge.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.List;
import tb.bbz;
import tb.beq;
import tb.beu;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class CartGroupChargeAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnClickListener listener;
    private bbz mCartPresenter;
    private IDMComponent mComponent;
    private Context mContext;
    private List<com.alibaba.android.icart.core.groupcharge.a> mGroupDatas;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public View f2362a;
        public TextView b;
        public TextView c;
        public TextView d;
        public View e;

        static {
            kge.a(731400387);
        }
    }

    static {
        kge.a(53301234);
    }

    public static /* synthetic */ Object ipc$super(CartGroupChargeAdapter cartGroupChargeAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ bbz access$000(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("c33da498", new Object[]{cartGroupChargeAdapter}) : cartGroupChargeAdapter.mCartPresenter;
    }

    public static /* synthetic */ IDMComponent access$100(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("6f9e8c79", new Object[]{cartGroupChargeAdapter}) : cartGroupChargeAdapter.mComponent;
    }

    public static /* synthetic */ View.OnClickListener access$200(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("a1b5255f", new Object[]{cartGroupChargeAdapter}) : cartGroupChargeAdapter.listener;
    }

    public CartGroupChargeAdapter(bbz bbzVar, IDMComponent iDMComponent) {
        if (bbzVar == null) {
            throw new IllegalArgumentException("presenter can not be null");
        }
        this.mContext = bbzVar.m();
        this.mCartPresenter = bbzVar;
        this.mComponent = iDMComponent;
    }

    public void setGroupDatas(List<com.alibaba.android.icart.core.groupcharge.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ff2244", new Object[]{this, list});
        } else {
            this.mGroupDatas = list;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<com.alibaba.android.icart.core.groupcharge.a> list = this.mGroupDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<com.alibaba.android.icart.core.groupcharge.a> list = this.mGroupDatas;
        if (list != null && list.size() > i) {
            return this.mGroupDatas.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        final com.alibaba.android.icart.core.groupcharge.a aVar2 = this.mGroupDatas.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.icart_group_charge_listview_item, (ViewGroup) null);
            aVar = new a();
            aVar.f2362a = view;
            aVar.b = (TextView) view.findViewById(R.id.tv_group_title);
            aVar.c = (TextView) view.findViewById(R.id.tv_total_quantity);
            aVar.d = (TextView) view.findViewById(R.id.tv_total_price);
            aVar.e = view.findViewById(R.id.btn_charge);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.e.setTag(Integer.valueOf(i));
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.groupcharge.ui.CartGroupChargeAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                bmz a2 = CartGroupChargeAdapter.access$000(CartGroupChargeAdapter.this).F().a();
                a2.a("cartSubmit");
                a2.a(CartGroupChargeAdapter.access$100(CartGroupChargeAdapter.this));
                a2.c("");
                com.alibaba.android.icart.core.groupcharge.a aVar3 = aVar2;
                a2.a(aVar3 != null ? aVar3.g() : null);
                CartGroupChargeAdapter.access$000(CartGroupChargeAdapter.this).F().a(a2);
                if (CartGroupChargeAdapter.access$200(CartGroupChargeAdapter.this) == null) {
                    return;
                }
                CartGroupChargeAdapter.access$200(CartGroupChargeAdapter.this).onClick(view2);
            }
        });
        if (aVar2 != null) {
            aVar.c.setText(String.format(this.mContext.getResources().getString(R.string.cart_group_charge_quantity), String.valueOf(aVar2.d())));
            aVar.b.setText(aVar2.b());
            beq.a(aVar.d, aVar2.e(), aVar2.f());
        }
        applyStyle(aVar);
        return view;
    }

    private void applyStyle(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d92cb50a", new Object[]{this, aVar});
            return;
        }
        beu.a(aVar.b, "group_charge_item_group_title");
        beu.a(aVar.c, "group_charge_item_total_quantity");
        beu.a(aVar.e, "group_charge_item_btn_charge");
        beu.a(aVar.f2362a, "groupCharge_itemRoot");
    }

    public void setListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a1825c", new Object[]{this, onClickListener});
        } else {
            this.listener = onClickListener;
        }
    }
}
