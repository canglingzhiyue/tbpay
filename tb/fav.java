package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.epl;

/* loaded from: classes5.dex */
public class fav extends b<fbk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private final int l;
    private ArrayList<b<epf>> m;

    static {
        kge.a(460830206);
    }

    public static /* synthetic */ Object ipc$super(fav favVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c53fee4f", new Object[]{this, fbkVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbk) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbkVar})).booleanValue() : c2(fbkVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbkVar}) : a2(fbkVar);
    }

    public fav(Activity activity) {
        super(activity);
        this.l = epo.b(2);
        this.m = new ArrayList<>();
        this.k = new LinearLayout(this.g);
        this.k.setOrientation(1);
        this.k.setPadding(0, 0, 0, this.l);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.VideoContainerViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b9f8194b", new Object[]{this, fbkVar});
        }
        if (!fbkVar.d().isEmpty()) {
            this.k.addView(d(fbkVar), new LinearLayout.LayoutParams(-1, -2));
        }
        return this.k;
    }

    private View d(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8b2720e", new Object[]{this, fbkVar});
        }
        View inflate = View.inflate(this.g, R.layout.x_detail_video_collection, null);
        if (fbkVar == null || fbkVar.d().size() < 3) {
            return inflate;
        }
        for (int i = 0; i < 3; i++) {
            a aVar = new a(this.g, i, inflate);
            aVar.d((a) fbkVar.d().get(i));
            this.m.add(aVar);
        }
        return inflate;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbk fbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bce7ca", new Object[]{this, fbkVar});
            return;
        }
        int size = fbkVar.d().size();
        for (int i = 0; i < size; i++) {
            b<epf> bVar = this.m.get(i);
            if (i <= size - 1) {
                bVar.e((b<epf>) fbkVar.d().get(i));
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<b<epf>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().a(z, z2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        Iterator<b<epf>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().G_();
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends b<fbl> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ITEM_LETF_VIEW = 0;
        public static final int ITEM_RIGHT1_VIEW = 1;
        public static final int ITEM_RIGHT2_VIEW = 2;
        public View k;
        public DetailImageView l;
        public TextView m;
        public int n;
        private final int o;
        private final int p;
        private final int q;
        private final int r;
        private final int s;

        static {
            kge.a(-16308807);
        }

        /* renamed from: c  reason: avoid collision after fix types in other method */
        public boolean c2(fbl fblVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c54062ae", new Object[]{this, fblVar})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
        public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
            } else {
                b((fbl) bVar);
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
        public /* synthetic */ boolean a(fbl fblVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fblVar})).booleanValue() : c2(fblVar);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
        public /* synthetic */ View c(fbl fblVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fblVar}) : a2(fblVar);
        }

        public a(Activity activity, int i, View view) {
            super(activity);
            this.o = epo.b(2);
            this.p = (int) Math.ceil(((epo.b / 3) << 1) - this.o);
            this.q = (int) Math.ceil((epo.b - this.p) - this.o);
            this.r = (int) Math.ceil((this.q << 1) + this.o);
            this.s = this.q;
            this.n = -1;
            if (i == 0) {
                this.k = a(view);
            } else if (i == 1) {
                this.k = b(view);
            } else if (i != 2) {
            } else {
                this.k = c(view);
            }
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public View a2(fbl fblVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("407dd3ea", new Object[]{this, fblVar}) : this.k;
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
        public void b(fbl fblVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6bd5c29", new Object[]{this, fblVar});
                return;
            }
            epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(this.l.getScaleType()).a(this.l.getScaleType()).a();
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            a(this.l, fblVar.c, new epm(layoutParams.width, layoutParams.height), null, a2);
            TextView textView = this.m;
            if (textView == null) {
                return;
            }
            textView.setText(fblVar.d);
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
            layoutParams.width = this.p;
            layoutParams.height = this.r;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.o;
            }
            findViewById.setLayoutParams(layoutParams);
            this.l = (DetailImageView) view.findViewById(R.id.des_first_video_c);
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
            layoutParams.width = this.q;
            layoutParams.height = this.s;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.o;
            }
            findViewById.setLayoutParams(layoutParams);
            this.l = (DetailImageView) view.findViewById(R.id.des_second_video_c);
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
            layoutParams.width = this.q;
            layoutParams.height = this.s;
            findViewById.setLayoutParams(layoutParams);
            this.l = (DetailImageView) view.findViewById(R.id.des_third_video_c);
            this.m = (TextView) view.findViewById(R.id.des_video_count);
            return findViewById;
        }
    }
}
