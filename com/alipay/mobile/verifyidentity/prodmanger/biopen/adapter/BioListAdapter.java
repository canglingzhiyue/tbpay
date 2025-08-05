package com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioMenuData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes3.dex */
public class BioListAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<BioMenuData> f5951a;
    public OnProdItemClickListener b;
    public OnSwitchListener c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    private LayoutInflater h;
    private int i;

    /* loaded from: classes3.dex */
    public interface OnProdItemClickListener {
        void a(int i, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface OnSwitchListener {
        void a();
    }

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f5955a;
        public TextView b;
        public TextView c;
        public CheckBox d;
        public ImageView e;
        public ImageView f;
        public View g;

        private a() {
        }

        public /* synthetic */ a(BioListAdapter bioListAdapter, byte b) {
            this();
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public static /* synthetic */ OnProdItemClickListener a(BioListAdapter bioListAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnProdItemClickListener) ipChange.ipc$dispatch("1e18aa05", new Object[]{bioListAdapter}) : bioListAdapter.b;
    }

    public static /* synthetic */ void a(BioListAdapter bioListAdapter, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6466ace", new Object[]{bioListAdapter, new Integer(i), new Integer(i2)});
        } else {
            bioListAdapter.a(i, i2);
        }
    }

    public static /* synthetic */ boolean b(BioListAdapter bioListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1e733d1", new Object[]{bioListAdapter})).booleanValue();
        }
        bioListAdapter.e = true;
        return true;
    }

    public static /* synthetic */ OnSwitchListener c(BioListAdapter bioListAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnSwitchListener) ipChange.ipc$dispatch("3e6f339", new Object[]{bioListAdapter}) : bioListAdapter.c;
    }

    public BioListAdapter(Context context, List<BioMenuData> list) {
        this.f5951a = list;
        this.h = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<BioMenuData> list = this.f5951a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<BioMenuData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i <= getCount() && (list = this.f5951a) != null) {
            return list.get(i);
        }
        return null;
    }

    public final void a(List<BioMenuData> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
            return;
        }
        this.f5951a = list;
        this.i = i;
        notifyDataSetChanged();
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 < 0 || i2 >= this.f5951a.size()) {
        } else {
            this.f5951a.set(i, this.f5951a.get(i2));
            this.f5951a.set(i2, this.f5951a.get(i));
        }
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = this.h.inflate(R.layout.bio_menu_item, (ViewGroup) null);
            aVar = new a(this, (byte) 0);
            aVar.f5955a = (TextView) view.findViewById(R.id.tv_bio_title);
            aVar.b = (TextView) view.findViewById(R.id.tv_bio_des);
            aVar.c = (TextView) view.findViewById(R.id.tv_pay_tip);
            aVar.d = (CheckBox) view.findViewById(R.id.bio_checkbox);
            aVar.e = (ImageView) view.findViewById(R.id.up_arrow);
            aVar.f = (ImageView) view.findViewById(R.id.down_arrow);
            aVar.g = view.findViewById(R.id.divider);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        if (this.i <= 1) {
            aVar.c.setVisibility(8);
        }
        BioMenuData bioMenuData = this.f5951a.get(i);
        aVar.d.setOnCheckedChangeListener(null);
        aVar.f5955a.setText(bioMenuData.title);
        if (this.d) {
            aVar.b.setVisibility(8);
            aVar.c.setVisibility(8);
            aVar.d.setVisibility(8);
            aVar.e.setVisibility(0);
            aVar.f.setVisibility(0);
            if (i == 0) {
                aVar.e.setImageResource(R.drawable.up_unable);
                aVar.f.setImageResource(R.drawable.down_able);
                aVar.e.setClickable(false);
                aVar.f.setClickable(true);
            } else if (i == getCount() - 1) {
                aVar.e.setImageResource(R.drawable.up_able);
                aVar.f.setImageResource(R.drawable.down_unable);
                aVar.e.setClickable(true);
                aVar.f.setClickable(false);
            } else {
                aVar.e.setImageResource(R.drawable.up_able);
                aVar.f.setImageResource(R.drawable.down_able);
                aVar.e.setClickable(true);
                aVar.f.setClickable(true);
            }
        } else {
            aVar.d.setVisibility(0);
            if ("open".equalsIgnoreCase(bioMenuData.sliderStatus)) {
                aVar.d.setChecked(true);
                if (this.f) {
                    if (this.i > 1 && i == 0) {
                        aVar.c.setVisibility(0);
                        aVar.c.setText("");
                    } else {
                        aVar.c.setVisibility(8);
                    }
                } else if (this.i > 1) {
                    aVar.c.setVisibility(0);
                    aVar.c.setText(bioMenuData.tip);
                } else {
                    aVar.c.setVisibility(8);
                }
                aVar.b.setVisibility(8);
            } else if ("close".equalsIgnoreCase(bioMenuData.sliderStatus)) {
                aVar.d.setChecked(false);
                if (!TextUtils.isEmpty(bioMenuData.desc)) {
                    aVar.b.setVisibility(0);
                    aVar.b.setText(bioMenuData.desc);
                } else {
                    aVar.b.setVisibility(8);
                }
                aVar.c.setVisibility(8);
            }
            aVar.e.setVisibility(8);
            aVar.f.setVisibility(8);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aVar.g.getLayoutParams();
        if (i < this.f5951a.size() - 1) {
            layoutParams.setMargins(42, 0, 0, 0);
        } else {
            layoutParams.width = -1;
        }
        aVar.g.setLayoutParams(layoutParams);
        aVar.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else if (BioListAdapter.a(BioListAdapter.this) == null) {
                } else {
                    BioListAdapter.a(BioListAdapter.this).a(i, z);
                }
            }
        });
        aVar.d.setClickable(this.g);
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                BioListAdapter.b(BioListAdapter.this);
                BioListAdapter bioListAdapter = BioListAdapter.this;
                int i2 = i;
                BioListAdapter.a(bioListAdapter, i2, i2 - 1);
                BioListAdapter.this.notifyDataSetChanged();
                BioListAdapter.c(BioListAdapter.this).a();
            }
        });
        aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                BioListAdapter.b(BioListAdapter.this);
                BioListAdapter bioListAdapter = BioListAdapter.this;
                int i2 = i;
                BioListAdapter.a(bioListAdapter, i2, i2 + 1);
                BioListAdapter.this.notifyDataSetChanged();
                BioListAdapter.c(BioListAdapter.this).a();
            }
        });
        return view;
    }
}
