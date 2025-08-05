package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler;

import android.graphics.Outline;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.remote.collectionpoplayer.Request.RelatedCollectionResult;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.PopupDialog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.kge;
import tb.kox;
import tb.ohd;
import tb.spz;

/* loaded from: classes5.dex */
public class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CORNER_RADIUS = 20;
    public static final String LIKE_URL = "https://gw.alicdn.com/imgextra/i1/O1CN01TUcAo71p1Rsm6zcwf_!!6000000005300-2-tps-33-33.png";
    public static final String LOCK_URL = "https://img.alicdn.com/imgextra/i3/O1CN01Kb8pzZ1xW9Sh5et6g_!!6000000006450-2-tps-120-48.png";
    public static final String TAG = "CollectionAdapter";
    public static final String UNLOCK_URL = "https://img.alicdn.com/imgextra/i4/O1CN01NvloPz29ICn30GVIj_!!6000000008044-2-tps-120-48.png";

    /* renamed from: a  reason: collision with root package name */
    private List<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> f12692a;
    private View$OnClickListenerC0498a.InterfaceC0499a b;
    private RelatedCollectionResult e;
    private RelatedCollectionResult f;
    private String g;
    private PopupDialog j;
    private FluidContext k;
    private String c = "-1";
    private int d = -1;
    private boolean h = false;
    private boolean i = false;

    /* loaded from: classes5.dex */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView f12695a;
        public RecyclerView b;
        public TextView c;
        public TextView d;

        static {
            kge.a(1966344337);
        }

        public b(View view) {
            super(view);
            this.f12695a = (RecyclerView) view.findViewById(R.id.footer_horizontal_recyclerview_first);
            this.b = (RecyclerView) view.findViewById(R.id.footer_horizontal_recyclerview_second);
            this.c = (TextView) view.findViewById(R.id.footer_title);
            this.d = (TextView) view.findViewById(R.id.footer_sub_title);
        }
    }

    static {
        kge.a(880876889);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(RelatedCollectionResult relatedCollectionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcfc991", new Object[]{this, relatedCollectionResult});
        } else {
            this.e = relatedCollectionResult;
        }
    }

    public void b(RelatedCollectionResult relatedCollectionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d78e92", new Object[]{this, relatedCollectionResult});
        } else {
            this.f = relatedCollectionResult;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
        } else {
            this.k = fluidContext;
        }
    }

    public void a(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52103f9f", new Object[]{this, popupDialog});
        } else {
            this.j = popupDialog;
        }
    }

    public a(List<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> list) {
        this.f12692a = list;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 2) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_remote_collection_dialog_related_footer, viewGroup, false));
        }
        return new View$OnClickListenerC0498a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_remote_collection_dialog_cell, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : (i == getItemCount() - 1 && this.f12692a.size() == getItemCount() - 1) ? 2 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.f12692a.size() <= 0) {
            return 0;
        }
        List<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> list = this.f12692a;
        int a2 = list.get(list.size() - 1).a();
        if (a2 == this.d && a2 > 0 && this.h && this.i) {
            return this.f12692a.size() + 1;
        }
        return this.f12692a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        List<com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b> list = this.f12692a;
        if (list == null || list.size() < i) {
            return;
        }
        if (viewHolder instanceof b) {
            kox.a(viewHolder, this.f, this.e, this.g, this.k, this.j);
        } else if (!(viewHolder instanceof View$OnClickListenerC0498a)) {
        } else {
            a((View$OnClickListenerC0498a) viewHolder, i);
        }
    }

    public void a(View$OnClickListenerC0498a.InterfaceC0499a interfaceC0499a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9026fb34", new Object[]{this, interfaceC0499a});
        } else {
            this.b = interfaceC0499a;
        }
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : this.f12692a.get(i).b() == this.c;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    private void a(View$OnClickListenerC0498a view$OnClickListenerC0498a, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c949d2", new Object[]{this, view$OnClickListenerC0498a, new Integer(i)});
            return;
        }
        com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.b bVar = this.f12692a.get(i);
        view$OnClickListenerC0498a.b.setText(bVar.d());
        TextView textView = view$OnClickListenerC0498a.c;
        textView.setText(bVar.e() + " |");
        spz.c(TAG, "onBindViewHolder: " + bVar);
        View$OnClickListenerC0498a.InterfaceC0499a interfaceC0499a = this.b;
        if (interfaceC0499a != null) {
            view$OnClickListenerC0498a.a(interfaceC0499a);
        }
        View findViewWithTag = view$OnClickListenerC0498a.g.findViewWithTag("customFreeImageView");
        if (findViewWithTag != null) {
            view$OnClickListenerC0498a.g.removeView(findViewWithTag);
        }
        String str = bVar.i;
        int b2 = ohd.b(view$OnClickListenerC0498a.g.getContext(), bVar.j);
        int b3 = ohd.b(view$OnClickListenerC0498a.g.getContext(), bVar.k);
        if ((TextUtils.isEmpty(str) || b2 <= 0 || b3 <= 0) && !bVar.g()) {
            str = bVar.h() ? LOCK_URL : UNLOCK_URL;
            b2 = ohd.b(view$OnClickListenerC0498a.g.getContext(), 40);
            b3 = ohd.b(view$OnClickListenerC0498a.g.getContext(), 16);
        }
        if (!TextUtils.isEmpty(str)) {
            TUrlImageView tUrlImageView = new TUrlImageView(view$OnClickListenerC0498a.g.getContext());
            tUrlImageView.setTag("customFreeImageView");
            tUrlImageView.setImageUrl(str);
            view$OnClickListenerC0498a.g.addView(tUrlImageView, new FrameLayout.LayoutParams(b2, b3));
        }
        if (bVar.f() != null) {
            TUrlImageView tUrlImageView2 = view$OnClickListenerC0498a.f12694a;
            view$OnClickListenerC0498a.f12694a.setImageUrl(bVar.f());
            tUrlImageView2.setClipToOutline(true);
            tUrlImageView2.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 20.0f);
                    }
                }
            });
        }
        view$OnClickListenerC0498a.d.setImageUrl(LIKE_URL);
        view$OnClickListenerC0498a.e.setText(bVar.c());
        view$OnClickListenerC0498a.a(b(i));
    }

    /* renamed from: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class View$OnClickListenerC0498a extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int SELECTED_COLOR = 352276480;
        public static final int UNSELECTED_COLOR = -1;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f12694a;
        public TextView b;
        public TextView c;
        public TUrlImageView d;
        public TextView e;
        private InterfaceC0499a f;
        public FrameLayout g;

        /* renamed from: com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC0499a {
            void a(int i);
        }

        static {
            kge.a(-144138118);
            kge.a(-1201612728);
        }

        public View$OnClickListenerC0498a(View view) {
            super(view);
            this.g = (FrameLayout) view.findViewById(R.id.collectioncell_image_layout);
            this.f12694a = (TUrlImageView) view.findViewById(R.id.collectioncell_image);
            this.b = (TextView) view.findViewById(R.id.titleTextView);
            this.c = (TextView) view.findViewById(R.id.subtitleTextView);
            this.d = (TUrlImageView) view.findViewById(R.id.cell_like_image);
            this.e = (TextView) view.findViewById(R.id.cell_like_num);
            view.setOnClickListener(this);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (z) {
                this.itemView.setBackgroundColor(SELECTED_COLOR);
            } else {
                this.itemView.setBackgroundColor(-1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC0499a interfaceC0499a;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (getAdapterPosition() < 0 || (interfaceC0499a = this.f) == null) {
            } else {
                interfaceC0499a.a(getAdapterPosition());
            }
        }

        public void a(InterfaceC0499a interfaceC0499a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9026fb34", new Object[]{this, interfaceC0499a});
            } else {
                this.f = interfaceC0499a;
            }
        }
    }
}
