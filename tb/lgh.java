package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBDefaultLoadMoreFooter;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBLoadMoreFooter;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class lgh implements ILoadMoreItemRender {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ID = "loading";

    /* renamed from: a  reason: collision with root package name */
    private TBLoadMoreFooter.LoadMoreState f30562a = TBLoadMoreFooter.LoadMoreState.LOADING;
    private WeakReference<TBLoadMoreFooter> b;
    private final IContainerDataService c;

    static {
        kge.a(-2136704805);
        kge.a(-915777436);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        return -3;
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void preRender(Context context, BaseSectionModel<?> baseSectionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23eb059f", new Object[]{this, context, baseSectionModel, new Boolean(z), new Integer(i)});
        }
    }

    public static /* synthetic */ void a(lgh lghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bc0d6b", new Object[]{lghVar});
        } else {
            lghVar.d();
        }
    }

    public lgh(ljs ljsVar) {
        this.c = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public View createView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97790b1e", new Object[]{this, viewGroup, new Integer(i)});
        }
        nuw.a("LoadMoreViewRender", "createView_loadView");
        TBDefaultLoadMoreFooter tBDefaultLoadMoreFooter = new TBDefaultLoadMoreFooter(viewGroup.getContext());
        tBDefaultLoadMoreFooter.setLoadMoreTips(a());
        tBDefaultLoadMoreFooter.setBackgroundColor(0);
        tBDefaultLoadMoreFooter.setOnClickListener(new View.OnClickListener() { // from class: tb.lgh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
                if (tBLoadMoreFooter.getCurrentState() != TBLoadMoreFooter.LoadMoreState.NONE) {
                    return;
                }
                tBLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
                lgh.a(lgh.this);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (tBDefaultLoadMoreFooter.getResources().getDisplayMetrics().density * 50.0f));
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        tBDefaultLoadMoreFooter.setLayoutParams(layoutParams);
        tBDefaultLoadMoreFooter.changeToState(TBLoadMoreFooter.LoadMoreState.LOADING);
        this.b = new WeakReference<>(tBDefaultLoadMoreFooter);
        nuw.b("LoadMoreViewRender", "createView_loadView");
        return tBDefaultLoadMoreFooter;
    }

    @Override // com.taobao.infoflow.protocol.view.item.b
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        nuw.a("LoadMoreViewRender", "bindData_loadView");
        a(view, this.f30562a);
        nuw.b("LoadMoreViewRender", "bindData_loadView");
    }

    @Override // com.taobao.infoflow.protocol.view.item.ILoadMoreItemRender
    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else {
            a(z, a(str));
        }
    }

    private TBLoadMoreFooter.LoadMoreState a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLoadMoreFooter.LoadMoreState) ipChange.ipc$dispatch("9ce86bf1", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.f30562a;
        }
        return TBLoadMoreFooter.LoadMoreState.valueOf(str);
    }

    private void a(boolean z, TBLoadMoreFooter.LoadMoreState loadMoreState) {
        WeakReference<TBLoadMoreFooter> weakReference;
        TBLoadMoreFooter tBLoadMoreFooter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa973f9", new Object[]{this, new Boolean(z), loadMoreState});
            return;
        }
        this.f30562a = loadMoreState;
        if (!z || (weakReference = this.b) == null || (tBLoadMoreFooter = weakReference.get()) == null) {
            return;
        }
        a(tBLoadMoreFooter, this.f30562a);
    }

    private void a(View view, TBLoadMoreFooter.LoadMoreState loadMoreState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e88a8f7", new Object[]{this, view, loadMoreState});
        } else if (!(view instanceof TBLoadMoreFooter)) {
        } else {
            TBLoadMoreFooter tBLoadMoreFooter = (TBLoadMoreFooter) view;
            tBLoadMoreFooter.setLoadMoreTips(a());
            tBLoadMoreFooter.changeToState(loadMoreState);
        }
    }

    private String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this});
        }
        lgg b = b();
        String a2 = b.a();
        String b2 = b.b();
        String[] strArr = new String[4];
        strArr[0] = b.a(R.string.taobao_app_1000_1_16712);
        strArr[1] = b.a(R.string.app_release_to_reload);
        if (StringUtils.isEmpty(a2)) {
            a2 = b.a(R.string.taobao_app_1000_1_16709);
        }
        strArr[2] = a2;
        if (StringUtils.isEmpty(b2)) {
            b2 = b.a(R.string.taobao_app_1000_1_16711);
        }
        strArr[3] = b2;
        return strArr;
    }

    private lgg b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgg) ipChange.ipc$dispatch("16b8f1b1", new Object[]{this});
        }
        JSONObject c = c();
        String str2 = null;
        if (c != null) {
            str2 = c.getString(lgg.R_EXT_LOAD_MORE_TITLE);
            str = c.getString(lgg.R_EXT_LOAD_MORE_ERROR_TITLE);
        } else {
            str = null;
        }
        return new lgg(str2, str);
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        IContainerDataService iContainerDataService = this.c;
        if (iContainerDataService == null) {
            ldf.d("LoadMoreViewRender", "getExt dataService is null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("LoadMoreViewRender", "getExt dataModel is null");
            return null;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("LoadMoreViewRender", "getExt Base is null");
            return null;
        }
        return base.getExt();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = this.c;
        if (iContainerDataService == null) {
            ldf.d("LoadMoreViewRender", "triggerLoadClick dataService is null");
        } else {
            iContainerDataService.triggerEvent("LoadingViewClick", null);
        }
    }
}
