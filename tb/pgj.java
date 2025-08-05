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
public class pgj extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32631a;
    private List<LiveItem.TimeMovingLabelInfos> b;
    private int c = -1;
    private String d;
    private pgi e;
    private com.taobao.alilive.aliliveframework.frame.a f;

    static {
        kge.a(-291222020);
    }

    public static /* synthetic */ Object ipc$super(pgj pgjVar, String str, Object... objArr) {
        if (str.hashCode() == -955520525) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ pgi a(pgj pgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pgi) ipChange.ipc$dispatch("138b632f", new Object[]{pgjVar}) : pgjVar.e;
    }

    public static /* synthetic */ String b(pgj pgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a18063a", new Object[]{pgjVar}) : pgjVar.d;
    }

    public static /* synthetic */ List c(pgj pgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5de089c0", new Object[]{pgjVar}) : pgjVar.b;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a d(pgj pgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("453256dd", new Object[]{pgjVar}) : pgjVar.f;
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

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.pgj$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, aVar});
        } else {
            a(aVar);
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

    public void a(List<LiveItem.TimeMovingLabelInfos> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public pgj(Context context, List<LiveItem.TimeMovingLabelInfos> list, pgi pgiVar, String str, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f32631a = context;
        this.d = str;
        this.e = pgiVar;
        this.b = list;
        this.f = aVar;
    }

    public a a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e9528ba", new Object[]{this, viewGroup, new Integer(i)}) : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_highligt_dx_timeshift_struct_item, (ViewGroup) null));
    }

    public void a(a aVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e086287b", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.b;
        if (list == null || i >= list.size()) {
            return;
        }
        if (this.b.get(i).hashCode() == this.c) {
            aVar.f32633a.setImageUrl("https://gw.alicdn.com/tfs/TB15HyZa_M11u4jSZPxXXahcXXa-48-48.gif");
            aVar.f32633a.setPadding(4, 4, 4, 4);
            aVar.b.setTypeface(Typeface.defaultFromStyle(1));
            aVar.b.setTextColor(-1);
        } else {
            aVar.f32633a.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01AFKT8r1iIfXX8rRGJ_!!6000000004390-2-tps-56-56.png");
            aVar.f32633a.setPadding(0, 0, 0, 0);
            aVar.b.setTypeface(Typeface.defaultFromStyle(0));
            aVar.b.setTextColor(Color.parseColor("#CCFFFFFF"));
        }
        aVar.b.setText(this.b.get(i).labelName);
        if (i == this.b.size() - 1) {
            aVar.d.setVisibility(8);
        } else {
            aVar.d.setVisibility(0);
        }
        aVar.c.setOnClickListener(new View.OnClickListener() { // from class: tb.pgj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (pgj.a(pgj.this) == null) {
                } else {
                    pgj.a(pgj.this).a(i);
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("item_id", pgj.b(pgj.this));
                        hashMap.put("feature_clicknumber", String.valueOf(i));
                        if (pgj.c(pgj.this) != null) {
                            hashMap.put("feature_amount", String.valueOf(pgj.c(pgj.this).size()));
                            if (pgj.c(pgj.this).size() > i) {
                                hashMap.put("feature_label", ((LiveItem.TimeMovingLabelInfos) pgj.c(pgj.this).get(i)).labelName);
                            }
                        }
                        o.a(pgj.d(pgj.this), "feature_dianji_new", (Map<String, String>) hashMap);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b1bb88", new Object[]{this, aVar});
            return;
        }
        super.onViewAttachedToWindow(aVar);
        try {
            int adapterPosition = aVar.getAdapterPosition();
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.d);
            hashMap.put("feature_viewnumber", String.valueOf(adapterPosition + 1));
            if (this.b != null) {
                hashMap.put("feature_amount", String.valueOf(this.b.size()));
                if (this.b.size() > adapterPosition) {
                    hashMap.put("feature_label", this.b.get(adapterPosition).labelName);
                }
            }
            o.a(this.f, "feature_baoguang", (HashMap<String, String>) hashMap);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.b.size();
    }

    /* loaded from: classes8.dex */
    public class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f32633a;
        public TextView b;
        public LinearLayout c;
        public ImageView d;

        static {
            kge.a(931753045);
        }

        public a(View view) {
            super(view);
            a(view);
        }

        private void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            this.c = (LinearLayout) view.findViewById(R.id.taolive_timeshift_dx_struct_item);
            this.f32633a = (TUrlImageView) view.findViewById(R.id.taolive_timeshift_dx_struct_item_image);
            this.f32633a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f32633a.setSkipAutoSize(true);
            this.b = (TextView) view.findViewById(R.id.taolive_timeshift_dx_struct_item_text);
            this.d = (ImageView) view.findViewById(R.id.taolive_higlight_decoration_img);
        }
    }
}
