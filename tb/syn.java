package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.b;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.QualityViewModel;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.i;
import com.taobao.android.detail.ttdetail.widget.desc.picgallery.c;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class syn extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33957a;
    private List<QualityViewModel.QualityContentModel> b;
    private List<String> c;
    private QualityViewModel d;
    private final List<String> e = new ArrayList();
    private final Map<String, String> f = new HashMap();
    private final Map<String, String> g = new HashMap();
    private int[] h;

    /* loaded from: classes5.dex */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public DetailImageView f33959a;
        public TextView b;

        static {
            kge.a(869246988);
        }

        public a(View view) {
            super(view);
            this.f33959a = (DetailImageView) view.findViewById(R.id.iv_desc_quality_item);
            this.b = (TextView) view.findViewById(R.id.iv_desc_quality_item_title);
        }
    }

    static {
        kge.a(1446268557);
    }

    public static /* synthetic */ List a(syn synVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2213f537", new Object[]{synVar}) : synVar.e;
    }

    public static /* synthetic */ Map b(syn synVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("42ace206", new Object[]{synVar}) : synVar.f;
    }

    public static /* synthetic */ Map c(syn synVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7bfdf2c7", new Object[]{synVar}) : synVar.g;
    }

    public static /* synthetic */ int[] d(syn synVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("9bb664b1", new Object[]{synVar}) : synVar.h;
    }

    public static /* synthetic */ Context e(syn synVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f2bdd80c", new Object[]{synVar}) : synVar.f33957a;
    }

    public syn(Context context, QualityViewModel qualityViewModel) {
        this.f33957a = context;
        this.b = qualityViewModel.b;
        this.d = qualityViewModel;
        List<QualityViewModel.QualityContentModel> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.c = qualityViewModel.f10866a;
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
            ipChange.ipc$dispatch("d0c0037c", new Object[]{this, qualityContentModel});
        } else if (qualityContentModel != null && qualityContentModel.images != null) {
            String str = null;
            List<String> list = this.c;
            if (list != null && !list.isEmpty()) {
                str = b.a(this.c, "    ");
            }
            for (String str2 : qualityContentModel.images) {
                this.e.add(str2);
                this.f.put(str2, qualityContentModel.desc);
                if (!StringUtils.isEmpty(str)) {
                    this.g.put(str2, str);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(LayoutInflater.from(this.f33957a).inflate(R.layout.tt_detail_desc_quality_item, (ViewGroup) null));
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
            if (!StringUtils.isEmpty(qualityContentModel.desc)) {
                aVar.b.setText(qualityContentModel.desc);
                aVar.b.setVisibility(0);
            } else {
                aVar.b.setVisibility(8);
            }
            if (qualityContentModel.images == null || qualityContentModel.images.isEmpty()) {
                return;
            }
            i.a().a(qualityContentModel.images.get(0), aVar.f33959a);
            aVar.f33959a.setOnClickListener(new View.OnClickListener() { // from class: tb.syn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    c cVar = new c();
                    cVar.b = false;
                    cVar.d = new ArrayList<>(syn.a(syn.this));
                    cVar.e = new ArrayList<>(syn.a(syn.this));
                    cVar.h = new HashMap<>(syn.b(syn.this));
                    cVar.i = new HashMap<>(syn.c(syn.this));
                    cVar.c = syn.d(syn.this)[i];
                    cVar.f = view;
                    com.taobao.android.detail.ttdetail.communication.c.a(syn.e(syn.this), new szp(cVar));
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
