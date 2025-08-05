package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.purchase.inject.Implementation;
import com.taobao.tao.purchase.inject.InjectType;
import com.taobao.taobao.R;

@Implementation(injectType = InjectType.STATIC, target = {eib.class})
/* loaded from: classes5.dex */
public class feh implements ehz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1909590681);
        kge.a(618820066);
    }

    public feh() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.inject.TBViewProvider");
    }

    @Override // tb.ehz
    public eia a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eia) ipChange.ipc$dispatch("f042481", new Object[]{this}) : new eia() { // from class: tb.feh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eia
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context}) : View.inflate(context, R.layout.x_detail_view_loading, null);
            }
        };
    }

    @Override // tb.ehz
    public ehx c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehx) ipChange.ipc$dispatch("1e676e47", new Object[]{this}) : new ehx() { // from class: tb.feh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private View b;

            @Override // tb.eia
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context});
                }
                View inflate = View.inflate(context, R.layout.x_detail_view_error, null);
                this.b = inflate.findViewById(R.id.reloadButton);
                return inflate;
            }

            @Override // tb.ehx
            public void a(View.OnClickListener onClickListener) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
                } else {
                    this.b.setOnClickListener(onClickListener);
                }
            }
        };
    }

    @Override // tb.ehz
    public eia b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eia) ipChange.ipc$dispatch("16b5c9e0", new Object[]{this}) : new eia() { // from class: tb.feh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eia
            public View a(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("876fa4a2", new Object[]{this, context}) : View.inflate(context, R.layout.x_detail_view_empty, null);
            }
        };
    }
}
