package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.b;
import com.taobao.android.tbsku.TBXSkuActivity;

/* loaded from: classes6.dex */
public class jdg extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2017215433);
    }

    public static /* synthetic */ Context a(jdg jdgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a4c78f43", new Object[]{jdgVar}) : jdgVar.f15189a;
    }

    public jdg(Context context) {
        super(context);
        a(new View.OnClickListener() { // from class: tb.jdg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    ((TBXSkuActivity) jdg.a(jdg.this)).onBackPressed();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.taobao.android.sku.presenter.b, com.taobao.android.sku.presenter.d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        try {
            ((TBXSkuActivity) this.f15189a).addSkuInRootContainer(this.b);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.sku.presenter.b, com.taobao.android.sku.presenter.d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        if (this.j != null) {
            this.j.a(this);
        }
        try {
            ((TBXSkuActivity) this.f15189a).finish();
        } catch (Throwable unused) {
        }
    }
}
