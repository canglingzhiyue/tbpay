package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.y;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes5.dex */
public class x extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private final int h;
    private ArrayList<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> i;

    static {
        kge.a(-16559432);
    }

    public static /* synthetic */ Object ipc$super(x xVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35525db2", new Object[]{this, xVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, xVar})).booleanValue() : c2(xVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, xVar}) : a2(xVar);
    }

    public x(Context context) {
        super(context);
        this.h = com.taobao.android.detail.ttdetail.utils.f.a(2.0f);
        this.i = new ArrayList<>();
        this.g = new LinearLayout(this.f10821a);
        this.g.setOrientation(1);
        this.g.setPadding(0, 0, 0, this.h);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d14b6d6e", new Object[]{this, xVar});
        }
        if (!xVar.f().isEmpty()) {
            this.g.addView(d(xVar), new LinearLayout.LayoutParams(-1, -2));
        }
        return this.g;
    }

    private View d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("824d82f1", new Object[]{this, xVar});
        }
        View inflate = LayoutInflater.from(this.f10821a).inflate(R.layout.tt_detail_video_collection, (ViewGroup) null);
        if (xVar == null || xVar.f().size() < 3) {
            return inflate;
        }
        for (int i = 0; i < 3; i++) {
            a aVar = new a(this.f10821a, i, inflate);
            aVar.d(xVar.f().get(i));
            this.i.add(aVar);
        }
        return inflate;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a432ed", new Object[]{this, xVar});
            return;
        }
        int size = xVar.f().size();
        for (int i = 0; i < size; i++) {
            e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> eVar = this.i.get(i);
            if (i <= size - 1) {
                eVar.e(xVar.f().get(i));
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().b(z, z2);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void cG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
            return;
        }
        Iterator<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().cG_();
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends e<y> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ITEM_LETF_VIEW = 0;
        public static final int ITEM_RIGHT1_VIEW = 1;
        public static final int ITEM_RIGHT2_VIEW = 2;
        public View g;
        public DetailImageView h;
        public TextView i;
        public int j;
        private final int k;
        private final int l;
        private final int m;
        private final int n;
        private final int o;

        static {
            kge.a(198123891);
        }

        /* renamed from: c  reason: avoid collision after fix types in other method */
        public boolean c2(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3552d211", new Object[]{this, yVar})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
        public /* synthetic */ boolean a(y yVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, yVar})).booleanValue() : c2(yVar);
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
        public /* synthetic */ View c(y yVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, yVar}) : a2(yVar);
        }

        public a(Context context, int i, View view) {
            super(context);
            this.k = com.taobao.android.detail.ttdetail.utils.f.a(2.0f);
            this.l = (int) Math.ceil(((com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) / 3) << 1) - this.k);
            this.m = (int) Math.ceil((com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) - this.l) - this.k);
            this.n = (int) Math.ceil((this.m << 1) + this.k);
            this.o = this.m;
            this.j = -1;
            if (i == 0) {
                this.g = a(view);
            } else if (i == 1) {
                this.g = b(view);
            } else if (i != 2) {
            } else {
                this.g = c(view);
            }
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public View a2(y yVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("57d1280d", new Object[]{this, yVar}) : this.g;
        }

        @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
        public void b(y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a4a74c", new Object[]{this, yVar});
                return;
            }
            com.taobao.android.detail.ttdetail.widget.desc.image.d a2 = new d.a().b(R.drawable.tt_detail_img_load_fail).a(R.drawable.tt_detail_img_load_fail).c(this.h.getScaleType()).a(this.h.getScaleType()).a();
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            a(this.h, yVar.c, new com.taobao.android.detail.ttdetail.widget.desc.image.g(layoutParams.width, layoutParams.height), null, a2);
            TextView textView = this.i;
            if (textView == null) {
                return;
            }
            textView.setText(yVar.d);
        }

        private View a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.dec_video_left_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.l;
            layoutParams.height = this.n;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.k;
            }
            findViewById.setLayoutParams(layoutParams);
            this.h = (DetailImageView) view.findViewById(R.id.des_first_video_c);
            return findViewById;
        }

        private View b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a3df6a4b", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.video_right1_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.m;
            layoutParams.height = this.o;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.k;
            }
            findViewById.setLayoutParams(layoutParams);
            this.h = (DetailImageView) view.findViewById(R.id.des_second_video_c);
            return findViewById;
        }

        private View c(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("ab449f6a", new Object[]{this, view});
            }
            View findViewById = view.findViewById(R.id.video_right2_layout);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            layoutParams.width = this.m;
            layoutParams.height = this.o;
            findViewById.setLayoutParams(layoutParams);
            this.h = (DetailImageView) view.findViewById(R.id.des_third_video_c);
            this.i = (TextView) view.findViewById(R.id.des_video_count);
            return findViewById;
        }
    }
}
