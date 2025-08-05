package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class pfl extends RecyclerView.Adapter<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32589a;
    private List<LiveItem.TimeMovingLabelInfos> b;
    private int c;
    private String d;
    private com.taobao.alilive.aliliveframework.frame.a e;
    private a f;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-715093854);
    }

    public static /* synthetic */ Object ipc$super(pfl pflVar, String str, Object... objArr) {
        if (str.hashCode() == -955520525) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a a(pfl pflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("595a9211", new Object[]{pflVar}) : pflVar.f;
    }

    public static /* synthetic */ String b(pfl pflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc4369d", new Object[]{pflVar}) : pflVar.d;
    }

    public static /* synthetic */ List c(pfl pflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("119376e3", new Object[]{pflVar}) : pflVar.b;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a d(pfl pflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("b93e009a", new Object[]{pflVar}) : pflVar.e;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
        } else {
            a(bVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.pfl$b, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public b a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7e87fa16", new Object[]{this, viewGroup, new Integer(i)}) : new b(LayoutInflater.from(this.f32589a).inflate(R.layout.taolive_timeshift_progress_item_highlight, (ViewGroup) null));
    }

    public void a(b bVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27f899f", new Object[]{this, bVar, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.b;
        if (list == null || i >= list.size()) {
            return;
        }
        if (this.b.get(i).hashCode() == this.c) {
            bVar.c.setBackground(this.f32589a.getResources().getDrawable(R.drawable.taolive_timeshift_structure_select_bg_highlight));
            bVar.f32591a.setImageUrl("https://img.alicdn.com/tfs/TB1gBycyHr1gK0jSZR0XXbP8XXa-48-48.png");
            bVar.b.setTypeface(Typeface.defaultFromStyle(1));
            bVar.b.setTextColor(Color.parseColor("#FF0036"));
        } else {
            bVar.c.setBackground(this.f32589a.getResources().getDrawable(R.drawable.taolive_timeshift_structure_bg_highlight));
            bVar.f32591a.setImageUrl("https://img.alicdn.com/tfs/TB1oFmfF1L2gK0jSZFmXXc7iXXa-36-36.png");
            bVar.b.setTypeface(Typeface.defaultFromStyle(0));
            bVar.b.setTextColor(-1);
        }
        bVar.b.setText(this.b.get(i).labelName);
        bVar.c.setOnClickListener(new View.OnClickListener() { // from class: tb.pfl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (pfl.a(pfl.this) == null) {
                } else {
                    pfl.a(pfl.this).a(i);
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("item_id", pfl.b(pfl.this));
                        hashMap.put("feature_clicknumber", String.valueOf(i));
                        if (pfl.c(pfl.this) != null) {
                            hashMap.put("feature_amount", String.valueOf(pfl.c(pfl.this).size()));
                            if (pfl.c(pfl.this).size() > i) {
                                hashMap.put("feature_label", ((LiveItem.TimeMovingLabelInfos) pfl.c(pfl.this).get(i)).labelName);
                            }
                        }
                        o.a(pfl.d(pfl.this), "feature_dianji_new", (Map<String, String>) hashMap);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.b.size();
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a435a5e4", new Object[]{this, bVar});
            return;
        }
        super.onViewAttachedToWindow(bVar);
        try {
            int adapterPosition = bVar.getAdapterPosition();
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.d);
            hashMap.put("feature_viewnumber", String.valueOf(adapterPosition + 1));
            if (this.b != null) {
                hashMap.put("feature_amount", String.valueOf(this.b.size()));
                if (this.b.size() > adapterPosition) {
                    hashMap.put("feature_label", this.b.get(adapterPosition).labelName);
                }
            }
            o.a(this.e, "feature_baoguang", (HashMap<String, String>) hashMap);
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes8.dex */
    public class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f32591a;
        public TextView b;
        public LinearLayout c;

        static {
            kge.a(-674484369);
        }

        public b(View view) {
            super(view);
            a(view);
        }

        private void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            this.f32591a = (TUrlImageView) view.findViewById(R.id.taolive_timeshift_struct_item_image);
            this.f32591a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f32591a.setSkipAutoSize(true);
            this.b = (TextView) view.findViewById(R.id.taolive_timeshift_struct_item_text);
            this.c = (LinearLayout) view.findViewById(R.id.taolive_timeshift_struct_item);
        }
    }
}
