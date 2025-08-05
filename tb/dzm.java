package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.core.event.params.c;
import com.taobao.android.detail.core.model.viewmodel.desc.QualityViewModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dzm extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27136a;
    private List<QualityViewModel.QualityContentModel> b;
    private List<String> c;
    private QualityViewModel d;
    private final List<String> e = new ArrayList();
    private final Map<String, String> f = new HashMap();
    private final Map<String, String> g = new HashMap();
    private int[] h;

    /* loaded from: classes4.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public DetailImageView f27138a;
        public TextView b;

        static {
            kge.a(296157328);
        }

        public a(View view) {
            super(view);
            this.f27138a = (DetailImageView) view.findViewById(R.id.iv_desc_quality_item);
            this.b = (TextView) view.findViewById(R.id.iv_desc_quality_item_title);
        }
    }

    static {
        kge.a(-1032265199);
    }

    public static /* synthetic */ Context a(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d27f58d9", new Object[]{dzmVar}) : dzmVar.f27136a;
    }

    public static /* synthetic */ QualityViewModel b(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QualityViewModel) ipChange.ipc$dispatch("e9ec3d6", new Object[]{dzmVar}) : dzmVar.d;
    }

    public static /* synthetic */ List c(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("60b71604", new Object[]{dzmVar}) : dzmVar.e;
    }

    public static /* synthetic */ Map d(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2bebf399", new Object[]{dzmVar}) : dzmVar.f;
    }

    public static /* synthetic */ Map e(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("653d045a", new Object[]{dzmVar}) : dzmVar.g;
    }

    public static /* synthetic */ int[] f(dzm dzmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("479b403e", new Object[]{dzmVar}) : dzmVar.h;
    }

    public dzm(Context context, QualityViewModel qualityViewModel) {
        this.f27136a = context;
        this.b = qualityViewModel.b;
        this.d = qualityViewModel;
        emu.a("com.taobao.android.detail.core.detail.kit.view.adapter.desc.QualityViewAdapter");
        List<QualityViewModel.QualityContentModel> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.c = qualityViewModel.f9742a;
        this.h = new int[this.b.size()];
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.h[i2] = i;
            QualityViewModel.QualityContentModel qualityContentModel = this.b.get(i2);
            a(qualityContentModel);
            i += qualityContentModel.images == null ? 0 : qualityContentModel.images.size();
        }
    }

    private void a(QualityViewModel.QualityContentModel qualityContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c33c81f", new Object[]{this, qualityContentModel});
        } else if (qualityContentModel != null && qualityContentModel.images != null) {
            String str = null;
            List<String> list = this.c;
            if (list != null && !list.isEmpty()) {
                str = eqh.a(this.c, "    ");
            }
            for (String str2 : qualityContentModel.images) {
                this.e.add(str2);
                this.f.put(str2, qualityContentModel.desc);
                if (!TextUtils.isEmpty(str)) {
                    this.g.put(str2, str);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(View.inflate(this.f27136a, R.layout.x_detail_desc_quality_item, null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        List<QualityViewModel.QualityContentModel> list;
        QualityViewModel.QualityContentModel qualityContentModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!(viewHolder instanceof a) || (list = this.b) == null || i >= list.size() || (qualityContentModel = this.b.get(i)) == null) {
        } else {
            a aVar = (a) viewHolder;
            if (!TextUtils.isEmpty(qualityContentModel.desc)) {
                aVar.b.setText(qualityContentModel.desc);
                aVar.b.setVisibility(0);
            } else {
                aVar.b.setVisibility(8);
            }
            if (qualityContentModel.images == null || qualityContentModel.images.isEmpty()) {
                return;
            }
            f.a(this.f27136a).a(aVar.f27138a, qualityContentModel.images.get(0));
            aVar.f27138a.setOnClickListener(new View.OnClickListener() { // from class: tb.dzm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    dzh.c(dzm.a(dzm.this), dzm.b(dzm.this).y, dzm.b(dzm.this).z);
                    c cVar = new c();
                    cVar.b = false;
                    cVar.d = new ArrayList<>(dzm.c(dzm.this));
                    cVar.e = new ArrayList<>(dzm.c(dzm.this));
                    cVar.h = new HashMap<>(dzm.d(dzm.this));
                    cVar.i = new HashMap<>(dzm.e(dzm.this));
                    cVar.c = dzm.f(dzm.this)[i];
                    cVar.f = view;
                    com.taobao.android.trade.event.f.a(dzm.a(dzm.this), new o(cVar));
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<QualityViewModel.QualityContentModel> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
