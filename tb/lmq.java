package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.view.item.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;

/* loaded from: classes7.dex */
public class lmq implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ID = "error";

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30718a;
    private TBErrorView b;

    static {
        kge.a(961479574);
        kge.a(116126865);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void bindData(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public int getViewType(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        return -2;
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        }
    }

    public static /* synthetic */ ljs a(lmq lmqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("99e847a9", new Object[]{lmqVar}) : lmqVar.f30718a;
    }

    public static /* synthetic */ void a(lmq lmqVar, TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fff013", new Object[]{lmqVar, tBErrorView, new Boolean(z)});
        } else {
            lmqVar.a(tBErrorView, z);
        }
    }

    public static /* synthetic */ void a(lmq lmqVar, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4283963", new Object[]{lmqVar, ljsVar});
        } else {
            lmqVar.a(ljsVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public /* synthetic */ View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public lmq(ljs ljsVar) {
        this.f30718a = ljsVar;
    }

    public TBErrorView a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("f7b21395", new Object[]{this, viewGroup, new Integer(i)});
        }
        this.b = new TBErrorView(viewGroup.getContext());
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        a(this.b, true);
        this.b.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.b;
    }

    @Override // com.taobao.infoflow.protocol.view.item.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TBErrorView tBErrorView = this.b;
        if (tBErrorView == null) {
            return;
        }
        a(tBErrorView, z);
    }

    private void a(final TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3beab3", new Object[]{this, tBErrorView, new Boolean(z)});
        } else if (z) {
            tBErrorView.setTitle(b.a(R.string.taobao_app_1000_1_16165));
            tBErrorView.setSubTitle(b.a(R.string.app_please_wait));
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.app_loading), new View.OnClickListener() { // from class: tb.lmq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
        } else {
            tBErrorView.setTitle(b.a(R.string.app_network_crash));
            tBErrorView.setSubTitle(b.a(R.string.app_relax_and_reload));
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b.a(R.string.app_refresh), new View.OnClickListener() { // from class: tb.lmq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    lmq.a(lmq.this, tBErrorView, true);
                    lmq lmqVar = lmq.this;
                    lmq.a(lmqVar, lmq.a(lmqVar));
                }
            });
            tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
        }
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ErrorViewRender", "triggerErrorClick dataService == null");
        } else {
            iContainerDataService.triggerEvent("ErrorViewClick", null);
        }
    }
}
