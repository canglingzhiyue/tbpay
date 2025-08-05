package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class ovq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBErrorView f32463a;
    private final a b;
    private boolean c = true;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(1180734724);
    }

    public static /* synthetic */ a a(ovq ovqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c519c791", new Object[]{ovqVar}) : ovqVar.b;
    }

    public ovq(a aVar) {
        this.b = aVar;
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        ksp.c("SubscribeDefaultSubTabController", "SubscribeDefaultViewPresenter createSubscribeView isLoading " + this.c);
        this.f32463a = b(context);
        a(this.c);
        return this.f32463a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        TBErrorView tBErrorView = this.f32463a;
        if (tBErrorView == null) {
            return;
        }
        if (z) {
            tBErrorView.setTitle("正在加载中");
            this.f32463a.setSubTitle("请稍后...");
            this.f32463a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "加载中", new View.OnClickListener() { // from class: tb.ovq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            this.f32463a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
            return;
        }
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        this.f32463a.setSubTitle("别紧张，试试看刷新页面~");
        this.f32463a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: tb.ovq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ovq.this.a(true);
                ovq.a(ovq.this).a();
            }
        });
        this.f32463a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    private TBErrorView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("2f7d1f18", new Object[]{this, context});
        }
        this.f32463a = new TBErrorView(context);
        this.f32463a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f32463a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        this.f32463a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.f32463a;
    }
}
