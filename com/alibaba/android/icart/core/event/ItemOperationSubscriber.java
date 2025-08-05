package com.alibaba.android.icart.core.event;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.h;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bdo;
import tb.bdx;
import tb.beb;
import tb.bem;
import tb.bet;
import tb.bex;
import tb.bmz;
import tb.gbg;
import tb.ivv;
import tb.kge;

/* loaded from: classes2.dex */
public class ItemOperationSubscriber extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<ItemOperate> c;

    public static /* synthetic */ Object ipc$super(ItemOperationSubscriber itemOperationSubscriber, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f2c04271", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.e;
    }

    public static /* synthetic */ Context b(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b8eacb32", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.e;
    }

    public static /* synthetic */ Context c(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7f1553f3", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.e;
    }

    public static /* synthetic */ Context d(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("453fdcb4", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.e;
    }

    public static /* synthetic */ IDMComponent e(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c046f501", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ IDMComponent f(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("9a10c242", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz g(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("58972fad", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ IDMComponent h(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("4da45cc4", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz i(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("8d7921eb", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ bbz j(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("a7ea1b0a", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ IDMComponent k(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("db01c487", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz l(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("dccc0d48", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ bbz m(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("f73d0667", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ IDMComponent n(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("685f2c4a", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz o(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("2c1ef8a5", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ IDMComponent p(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("1bf2c6cc", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz q(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("6100eae3", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ IDMComponent r(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("cf86614e", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.h;
    }

    public static /* synthetic */ bbz s(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("95e2dd21", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.f25791a;
    }

    public static /* synthetic */ bcb t(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("b053d719", new Object[]{itemOperationSubscriber}) : itemOperationSubscriber.b;
    }

    static {
        kge.a(-1315563618);
        c = new ArrayList(Arrays.asList(new ItemOperate(com.alibaba.ability.localization.b.a(R.string.app_find_same_version), "findTheSameClick"), new ItemOperate(com.alibaba.ability.localization.b.a(R.string.app_find_similar), "similarClick"), new ItemOperate(com.alibaba.ability.localization.b.a(R.string.app_favorite), "addfavorClick"), new ItemOperate(com.alibaba.ability.localization.b.a(R.string.app_delete), "deleteClick")));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (this.h == null) {
            return;
        }
        a();
        final Dialog dialog = new Dialog(this.e, R.style.ItemOperateDialog);
        RecyclerView recyclerView = new RecyclerView(this.e);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.e, 1);
        dividerItemDecoration.setDrawable(this.e.getResources().getDrawable(R.drawable.icart_operate_divider));
        recyclerView.addItemDecoration(dividerItemDecoration);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.e);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        dialog.setContentView(recyclerView);
        final ArrayList<ItemOperate> f = f();
        ivv.a(f);
        recyclerView.setAdapter(new RecyclerView.Adapter() { // from class: com.alibaba.android.icart.core.event.ItemOperationSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.Adapter
            /* renamed from: onCreateViewHolder */
            public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RecyclerView.ViewHolder) ipChange2.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
                }
                View inflate = LayoutInflater.from(ItemOperationSubscriber.a(ItemOperationSubscriber.this)).inflate(R.layout.icart_dialog_item_operate_button, viewGroup, false);
                inflate.setLayoutParams(new ViewGroup.LayoutParams((int) bet.c(ItemOperationSubscriber.b(ItemOperationSubscriber.this)), gbg.a(ItemOperationSubscriber.c(ItemOperationSubscriber.this), 44.0f)));
                return new h.a(inflate);
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                    return;
                }
                View view = viewHolder.itemView;
                final ItemOperate itemOperate = (ItemOperate) f.get(i);
                TextView textView = (TextView) view.findViewById(R.id.cart_item_operate_button);
                textView.setText(itemOperate.text);
                textView.setTextColor(Color.parseColor(itemOperate.event.equals("deleteClick") ? "#FF5500" : "#333333"));
                view.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.android.icart.core.event.ItemOperationSubscriber.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        List<com.taobao.android.ultron.common.model.b> list;
                        bbz m;
                        Map<String, String> a2;
                        String str;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else if (!ivv.a(ItemOperationSubscriber.d(ItemOperationSubscriber.this), itemOperate.event, ItemOperationSubscriber.e(ItemOperationSubscriber.this)) && (list = ItemOperationSubscriber.f(ItemOperationSubscriber.this).getEventMap().get(itemOperate.event)) != null && !list.isEmpty()) {
                            for (com.taobao.android.ultron.common.model.b bVar : list) {
                                bmz a3 = ItemOperationSubscriber.g(ItemOperationSubscriber.this).F().a();
                                a3.a(bVar.getType());
                                a3.a(ItemOperationSubscriber.h(ItemOperationSubscriber.this));
                                a3.c(itemOperate.event);
                                a3.a(bVar);
                                ItemOperationSubscriber.i(ItemOperationSubscriber.this).F().a(a3);
                            }
                            dialog.dismiss();
                            if (!itemOperate.event.equals("deleteClick")) {
                                if (itemOperate.event.equals("addfavorClick")) {
                                    m = ItemOperationSubscriber.m(ItemOperationSubscriber.this);
                                    a2 = beb.a(ItemOperationSubscriber.n(ItemOperationSubscriber.this), ItemOperationSubscriber.o(ItemOperationSubscriber.this), new String[0]);
                                    str = "Page_ShoppingCart_Item_AddFavor";
                                }
                                Map<String, String> a4 = beb.a(ItemOperationSubscriber.p(ItemOperationSubscriber.this), ItemOperationSubscriber.q(ItemOperationSubscriber.this), new String[0]);
                                a4.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, bdo.a(ItemOperationSubscriber.r(ItemOperationSubscriber.this)));
                                bex.a(ItemOperationSubscriber.s(ItemOperationSubscriber.this), String.format("Page_ShoppingCart_ItemLongClick_%s", itemOperate.event), a4);
                            }
                            m = ItemOperationSubscriber.j(ItemOperationSubscriber.this);
                            a2 = beb.a(ItemOperationSubscriber.k(ItemOperationSubscriber.this), ItemOperationSubscriber.l(ItemOperationSubscriber.this), new String[0]);
                            str = "Page_ShoppingCart_Item_Delete";
                            bex.a(m, str, a2);
                            Map<String, String> a42 = beb.a(ItemOperationSubscriber.p(ItemOperationSubscriber.this), ItemOperationSubscriber.q(ItemOperationSubscriber.this), new String[0]);
                            a42.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, bdo.a(ItemOperationSubscriber.r(ItemOperationSubscriber.this)));
                            bex.a(ItemOperationSubscriber.s(ItemOperationSubscriber.this), String.format("Page_ShoppingCart_ItemLongClick_%s", itemOperate.event), a42);
                        }
                    }
                });
            }

            @Override // android.support.v7.widget.RecyclerView.Adapter
            public int getItemCount() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : f.size();
            }
        });
        dialog.show();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alibaba.android.icart.core.event.ItemOperationSubscriber.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                } else {
                    ItemOperationSubscriber.t(ItemOperationSubscriber.this).o().e(false);
                }
            }
        });
        this.b.o().e(true);
        bex.a(this.f25791a, "Page_ShoppingCart_Item_OpenOperate", beb.a(this.h, this.f25791a, new String[0]));
    }

    private ArrayList<ItemOperate> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3ffe8d47", new Object[]{this});
        }
        JSONArray a2 = bem.a(this.h, this.f25791a);
        if (a2.isEmpty()) {
            ArrayList<ItemOperate> arrayList = new ArrayList<>();
            for (ItemOperate itemOperate : c) {
                if (this.h.getEventMap().containsKey(itemOperate.event)) {
                    arrayList.add(itemOperate);
                }
            }
            return arrayList;
        }
        ArrayList<ItemOperate> arrayList2 = new ArrayList<>();
        Iterator<Object> it = a2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                ItemOperate itemOperate2 = new ItemOperate();
                itemOperate2.event = jSONObject.getString("event");
                if (!"shareClick".equals(itemOperate2.event)) {
                    itemOperate2.text = jSONObject.getString("text");
                    arrayList2.add(itemOperate2);
                }
            }
        }
        return arrayList2;
    }

    /* loaded from: classes2.dex */
    public static final class ItemOperate implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String event;
        public String text;

        static {
            kge.a(139632331);
            kge.a(1028243835);
        }

        public ItemOperate() {
        }

        public ItemOperate(String str, String str2) {
            this.text = str;
            this.event = str2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ItemOperate{text='" + this.text + "', event='" + this.event + "'}";
        }
    }
}
