package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fap extends b<fbe> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private TextView l;
    private RecyclerView m;

    static {
        kge.a(1586164685);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c53d3415", new Object[]{this, fbeVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbe) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbeVar})).booleanValue() : c2(fbeVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbeVar}) : a2(fbeVar);
    }

    public fap(Activity activity) {
        super(activity);
        this.k = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_model_wear, null);
        this.l = (TextView) this.k.findViewById(R.id.container_title);
        this.m = (RecyclerView) this.k.findViewById(R.id.wear_dataColumn);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.ModelWearHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("92d5b991", new Object[]{this, fbeVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ba2d90", new Object[]{this, fbeVar});
            return;
        }
        this.l.setText(fbeVar.f27737a);
        eaf eafVar = new eaf(this.g);
        eafVar.setOrientation(0);
        this.m.setLayoutManager(eafVar);
        this.m.setAdapter(new fax(this.g, fbeVar.b));
    }
}
