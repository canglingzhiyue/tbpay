package tb;

import android.app.Activity;
import android.text.Html;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.epl;

/* loaded from: classes5.dex */
public class faj extends b<fba> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private TextView l;
    private TextView m;
    private DetailImageView n;
    private epl o;

    static {
        kge.a(796316642);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fba) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fba fbaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbaVar})).booleanValue() : c2(fbaVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fba fbaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbaVar}) : a2(fbaVar);
    }

    public faj(Activity activity) {
        super(activity);
        this.k = (RelativeLayout) this.h.inflate(R.layout.x_detail_desc_charity, (ViewGroup) null);
        this.l = (TextView) this.k.findViewById(R.id.title);
        this.m = (TextView) this.k.findViewById(R.id.text);
        this.n = (DetailImageView) this.k.findViewById(R.id.image);
        this.o = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a();
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.CharityViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fba fbaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("78becf15", new Object[]{this, fbaVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fba fbaVar) {
        TextView textView;
        TextView textView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b85c14", new Object[]{this, fbaVar});
        } else if (fbaVar == null) {
        } else {
            String str = fbaVar.f27731a;
            String str2 = fbaVar.b;
            String str3 = fbaVar.c;
            if (!StringUtils.isEmpty(str) && (textView2 = this.l) != null) {
                textView2.setText(str);
                this.l.setVisibility(0);
            }
            if (!StringUtils.isEmpty(str2) && (textView = this.m) != null) {
                textView.setText(Html.fromHtml(str2));
                this.m.setVisibility(0);
            }
            a(this.n, str3, null, null, this.o);
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fba fbaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c53b6299", new Object[]{this, fbaVar})).booleanValue() : fbaVar.a();
    }
}
