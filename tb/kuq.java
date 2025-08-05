package tb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class kuq extends kuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a b;

    static {
        kge.a(557951848);
    }

    @Override // tb.kuj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "bottomButton";
    }

    public static /* synthetic */ a a(kuq kuqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aa36d666", new Object[]{kuqVar}) : kuqVar.b;
    }

    public kuq(c cVar) {
        super(cVar);
        this.b = cVar.C();
    }

    @Override // tb.kuj
    public g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("64e5757e", new Object[]{this, new Integer(i)});
        }
        View inflate = LayoutInflater.from(this.f30327a.f()).inflate(R.layout.taolive_goods_item_bottom_button_flexalocal, (ViewGroup) null);
        g gVar = new g(inflate);
        if (inflate == null) {
            return gVar;
        }
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: tb.kuq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("SwitchTab_PreviewItem", null);
                }
                ddw.a().a("com.taobao.taolive.goods.preheat.tab", null, kuq.a(kuq.this) == null ? null : kuq.a(kuq.this).G());
            }
        });
        return gVar;
    }
}
