package tb;

import android.graphics.Outline;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;

/* loaded from: classes5.dex */
public class kov extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CELL_WIDTH = 115;
    public static final double HW_RATIO = 1.38d;
    public static final double IMAGE_RATIO = 0.92d;

    /* renamed from: a  reason: collision with root package name */
    private List<kow> f30203a;
    private a.InterfaceC1146a b;
    private boolean c = false;

    static {
        kge.a(282930884);
    }

    public List<kow> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f30203a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public kov(List<kow> list) {
        this.f30203a = list;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_remote_collection_dialog_related_cell, viewGroup, false));
    }

    public void a(a.InterfaceC1146a interfaceC1146a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea484e8c", new Object[]{this, interfaceC1146a});
        } else {
            this.b = interfaceC1146a;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        a aVar = (a) viewHolder;
        kow kowVar = this.f30203a.get(i);
        aVar.b.setText(kowVar.e());
        aVar.c.setText(kowVar.f());
        if (this.c) {
            int i2 = aVar.f30205a.getResources().getDisplayMetrics().widthPixels;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.d.getLayoutParams();
            layoutParams.width = (int) ((i2 * 0.92d) / 3.0d);
            spz.c("RelatedAdapter", "onBindViewHolder" + layoutParams.width);
            aVar.d.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = aVar.f30205a.getLayoutParams();
            layoutParams2.height = (int) (((double) layoutParams.width) * 1.38d);
            aVar.f30205a.setLayoutParams(layoutParams2);
        }
        if (kowVar.g() != null) {
            TUrlImageView tUrlImageView = aVar.f30205a;
            tUrlImageView.setImageUrl(kowVar.g());
            tUrlImageView.setClipToOutline(true);
            tUrlImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: tb.kov.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ohd.b(view.getContext(), 20));
                    }
                }
            });
        }
        aVar.f30205a.setImageUrl(kowVar.g());
        a.InterfaceC1146a interfaceC1146a = this.b;
        if (interfaceC1146a == null) {
            return;
        }
        aVar.a(interfaceC1146a);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f30203a.size();
    }

    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f30205a;
        public TextView b;
        public TextView c;
        public RelativeLayout d;
        private InterfaceC1146a e;

        /* renamed from: tb.kov$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC1146a {
            void a(int i);
        }

        static {
            kge.a(-1186679492);
            kge.a(-1201612728);
        }

        public a(View view) {
            super(view);
            this.d = (RelativeLayout) view.findViewById(R.id.relate_collectioncell_layout);
            this.f30205a = (TUrlImageView) view.findViewById(R.id.relate_collectioncell_image);
            this.b = (TextView) view.findViewById(R.id.relate_title_textView);
            this.c = (TextView) view.findViewById(R.id.relate_subtitle_textView);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC1146a interfaceC1146a;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (getAdapterPosition() < 0 || (interfaceC1146a = this.e) == null) {
            } else {
                interfaceC1146a.a(getAdapterPosition());
            }
        }

        public void a(InterfaceC1146a interfaceC1146a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea484e8c", new Object[]{this, interfaceC1146a});
            } else {
                this.e = interfaceC1146a;
            }
        }
    }
}
