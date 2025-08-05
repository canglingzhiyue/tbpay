package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class sym extends syl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<m.a> e;
    private int f;

    static {
        kge.a(-1623118326);
    }

    public static /* synthetic */ Object ipc$super(sym symVar, String str, Object... objArr) {
        if (str.hashCode() == 275888298) {
            super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public sym(Context context, ArrayList<m.a> arrayList) {
        super(context);
        this.e = arrayList;
        this.f = this.f33955a.getResources().getColor(R.color.tt_detail_transparent);
    }

    public void a(ArrayList<m.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else {
            this.e = arrayList;
        }
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(LayoutInflater.from(this.f33955a).inflate(R.layout.tt_detail_desc_packing_list_item, (ViewGroup) null));
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(viewHolder, i);
        TextView a2 = ((a) viewHolder).a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.e.get(i).f10883a);
        if (this.e.get(i).b > 0) {
            stringBuffer.append(riy.BRACKET_START_STR);
            stringBuffer.append(this.e.get(i).b);
            stringBuffer.append(riy.BRACKET_END_STR);
        }
        a2.setText(stringBuffer.toString());
    }

    @Override // tb.syl, android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<m.a> arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TextView b;

        static {
            kge.a(2068517357);
        }

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.item_tv);
        }

        public TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.b;
        }
    }
}
