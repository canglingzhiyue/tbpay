package com.taobao.android.detail.core.detail.fragment.desc.templated.specs;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class SpecsAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    public ArrayList<Pair<String, String>> propList;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f9493a;
        public TextView b;

        static {
            kge.a(452270314);
        }
    }

    static {
        kge.a(1976635947);
    }

    public static /* synthetic */ Object ipc$super(SpecsAdapter specsAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return 0L;
    }

    public void setData(ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9909d7", new Object[]{this, arrayList});
            return;
        }
        this.propList = arrayList;
        notifyDataSetChanged();
    }

    public SpecsAdapter(Context context) {
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.templated.specs.SpecsAdapter");
    }

    public SpecsAdapter(Context context, ArrayList<Pair<String, String>> arrayList) {
        this.mContext = context;
        this.propList = arrayList;
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.templated.specs.SpecsAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        ArrayList<Pair<String, String>> arrayList = this.propList;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        ArrayList<Pair<String, String>> arrayList = this.propList;
        if (arrayList != null && arrayList.size() > i) {
            return this.propList.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (view == null) {
            view = from.inflate(R.layout.x_detail_specs_itemview, viewGroup, false);
            view.setTag(view2holder(view));
        }
        a aVar = (a) view.getTag();
        Pair<String, String> pair = this.propList.get(i);
        aVar.f9493a.setText((CharSequence) pair.first);
        aVar.b.setText((CharSequence) pair.second);
        return view;
    }

    private a view2holder(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("650ed96b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        a aVar = new a();
        aVar.f9493a = (TextView) view.findViewById(R.id.detail_specs_itemview_specname);
        aVar.b = (TextView) view.findViewById(R.id.detail_specs_itemview_specvalue);
        return aVar;
    }
}
