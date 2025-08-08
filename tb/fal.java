package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;

/* loaded from: classes5.dex */
public class fal extends b<fbc> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailImageView k;

    static {
        kge.a(692541680);
        kge.a(-1201612728);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbc) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbc fbcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbcVar})).booleanValue() : c2(fbcVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbc fbcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbcVar}) : a2(fbcVar);
    }

    public fal(Activity activity) {
        super(activity);
        this.k = new DetailImageView(this.g);
        this.k.setOnClickListener(this);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.CustomModuleHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbc fbcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("85ca4453", new Object[]{this, fbcVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbc fbcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b944d2", new Object[]{this, fbcVar});
        } else {
            f.a(this.g).a(this.k, fbcVar.c);
        }
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbc fbcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c53c4b57", new Object[]{this, fbcVar})).booleanValue() : StringUtils.isEmpty(fbcVar.c);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (StringUtils.isEmpty(((fbc) this.c).d)) {
        } else {
            com.taobao.android.trade.event.f.a(this.g, new enu(((fbc) this.c).d));
            dzh.a(this.g, ((fbc) this.c).t);
        }
    }
}
