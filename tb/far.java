package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class far extends b<fbh> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout k;
    private DetailImageView l;
    private DetailImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private DetailImageView q;
    private RelativeLayout r;

    static {
        kge.a(1957746577);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbh) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbh fbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbhVar})).booleanValue() : c2(fbhVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbh fbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbhVar}) : a2(fbhVar);
    }

    public far(Activity activity) {
        super(activity);
        this.k = (FrameLayout) View.inflate(activity, R.layout.x_detail_desc_offline_store, null);
        this.l = (DetailImageView) this.k.findViewById(R.id.itemPic);
        this.m = (DetailImageView) this.k.findViewById(R.id.itemPic_shaper);
        this.n = (TextView) this.k.findViewById(R.id.tvTitle);
        this.o = (TextView) this.k.findViewById(R.id.tvSubTitle);
        this.p = (TextView) this.k.findViewById(R.id.tvBtnTitle);
        this.q = (DetailImageView) this.k.findViewById(R.id.tvBtnTitleIv);
        this.r = (RelativeLayout) this.k.findViewById(R.id.offline_title_btn_rt);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.OffLineStoreHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbh fbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("2666e96e", new Object[]{this, fbhVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbh fbhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bb8aad", new Object[]{this, fbhVar});
            return;
        }
        int i = epo.b;
        if (fbhVar.g > 1) {
            i = (i << 2) / 5;
        }
        this.n.setText(fbhVar.f27745a);
        this.o.setText(fbhVar.c);
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i / 2;
        this.l.setLayoutParams(layoutParams);
        this.m.setLayoutParams(layoutParams);
        if (fbhVar.b != null) {
            f.a(this.g).a(this.l, fbhVar.b);
        }
        if (StringUtils.isEmpty(fbhVar.h) && StringUtils.isEmpty(fbhVar.i)) {
            this.r.setVisibility(8);
        }
        if (!StringUtils.isEmpty(fbhVar.h)) {
            this.q.setVisibility(0);
            f.a(this.g).a(this.q, fbhVar.h);
        }
        this.p.setText(fbhVar.i);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbh fbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c53e9132", new Object[]{this, fbhVar})).booleanValue() : StringUtils.isEmpty(fbhVar.b);
    }
}
