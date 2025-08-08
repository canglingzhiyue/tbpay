package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.lnv;

/* loaded from: classes7.dex */
public class lnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f30763a;
    private final IContainerDataService<?> b;
    private final lnt c;
    private final ljs d;
    private WeakReference<Context> e;
    private lnv f;

    static {
        kge.a(-471899312);
    }

    public static /* synthetic */ View a(lnz lnzVar, lnv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a1997301", new Object[]{lnzVar, aVar}) : lnzVar.b(aVar);
    }

    public static /* synthetic */ void a(lnz lnzVar, lnv.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ff35f3", new Object[]{lnzVar, aVar, view});
        } else {
            lnzVar.a(aVar, view);
        }
    }

    public lnz(ljs ljsVar, lnt lntVar) {
        this.d = ljsVar;
        this.f30763a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.c = lntVar;
    }

    public void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
            return;
        }
        this.e = new WeakReference<>(context);
        lnv lnvVar = this.f;
        if (lnvVar != null) {
            lnvVar.c();
        }
        lnv.a a2 = a(jSONObject);
        Context context2 = this.e.get();
        if (a2 != null && context2 != null) {
            this.f = new lnw(context2, a2);
        }
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lnv lnvVar = this.f;
        if (lnvVar == null) {
            return;
        }
        lnvVar.c();
        ldf.d("UpgradeIconAnimeTrigger", "cancel animation task");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lnv lnvVar = this.f;
        if (lnvVar == null) {
            return;
        }
        this.c.b(lnvVar.b().e());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lnv lnvVar = this.f;
        if (lnvVar == null || lnvVar.a()) {
            ldf.d("UpgradeIconAnimeTrigger", "playAnime mAnimeTask == null");
            return;
        }
        lnv.a b = this.f.b();
        if (!b.a()) {
            ldf.d("UpgradeIconAnimeTrigger", "Invalidate config:config" + b);
            return;
        }
        View b2 = b(b);
        if (b2 == null) {
            ldf.d("UpgradeIconAnimeTrigger", "finalTargetView ==null compensateAnime");
            a(b);
            return;
        }
        a(b, b2);
    }

    private void a(final lnv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf2ce47", new Object[]{this, aVar});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.lnz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    View a2 = lnz.a(lnz.this, aVar);
                    if (a2 == null) {
                        return;
                    }
                    ldf.d("UpgradeIconAnimeTrigger", "compensateAnime start");
                    lnz.a(lnz.this, aVar, a2);
                }
            }, 300L);
        }
    }

    private void a(lnv.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef9f2b", new Object[]{this, aVar, view});
        } else if (this.f == null) {
            ldf.d("UpgradeIconAnimeTrigger", "startAnime mAnimeTask == null");
        } else {
            Bitmap a2 = this.c.a(aVar.e());
            if (a2 == null || a2.isRecycled()) {
                this.f = null;
                ldf.d("UpgradeIconAnimeTrigger", "No legal bitmap can be use" + aVar);
                return;
            }
            TUrlImageView a3 = a(a2);
            if (a3 == null) {
                ldf.d("UpgradeIconAnimeTrigger", "startAnime imageView == null");
                return;
            }
            this.f.a(a3);
            this.f.b(view);
            this.f.d();
            this.f.a(false, 0L);
        }
    }

    private lnv.a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lnv.a) ipChange.ipc$dispatch("f673206d", new Object[]{this, jSONObject});
        }
        if (!b(jSONObject)) {
            return null;
        }
        lnv.a aVar = new lnv.a();
        aVar.a(jSONObject.getString(lnv.a.ICON_CONTAINER_SECTION_BIZ_CODE));
        aVar.c(jSONObject.getString(lnv.a.DEFAULT_SECTION_BIZ_CODE));
        aVar.b(jSONObject.getString(lnv.a.TARGET_MINI_APP_ID));
        aVar.d(jSONObject.getString(lnv.a.ICON_ANIME_PARENT_IMG));
        if (jSONObject.containsKey(lnv.a.ICON_ANIME_DURATION)) {
            if (jSONObject.getLongValue(lnv.a.ICON_ANIME_DURATION) > 0) {
                aVar.a(jSONObject.getLongValue(lnv.a.ICON_ANIME_DURATION));
            } else {
                ldf.d("UpgradeIconAnimeTrigger", "Illegal duration:" + aVar.f());
            }
        }
        return aVar;
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        return ((((double) (((float) (globalVisibleRect ? rect.width() : 0)) / ((float) view.getWidth()))) > 0.5d ? 1 : (((double) (((float) (globalVisibleRect ? rect.width() : 0)) / ((float) view.getWidth()))) == 0.5d ? 0 : -1)) > 0 && (((double) (((float) (globalVisibleRect ? rect.height() : 0)) / ((float) view.getHeight()))) > 0.5d ? 1 : (((double) (((float) (globalVisibleRect ? rect.height() : 0)) / ((float) view.getHeight()))) == 0.5d ? 0 : -1)) > 0) && ((float) rect.centerY()) > d();
    }

    private float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        IHostService iHostService = (IHostService) this.d.a(IHostService.class);
        if (iHostService == null) {
            return 0.0f;
        }
        return iHostService.getInvokeCallback().c().a();
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && jSONObject.containsKey(lnv.a.TARGET_MINI_APP_ID) && jSONObject.containsKey(lnv.a.ICON_CONTAINER_SECTION_BIZ_CODE) && jSONObject.containsKey(lnv.a.DEFAULT_SECTION_BIZ_CODE) && jSONObject.containsKey(lnv.a.ICON_ANIME_PARENT_IMG);
    }

    private TUrlImageView a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("1855f776", new Object[]{this, bitmap});
        }
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (!(context instanceof Activity)) {
            return null;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(((Activity) context).getResources(), bitmap);
        create.setCornerRadius(24.0f);
        tUrlImageView.setImageDrawable(create);
        tUrlImageView.setMaxHeight(gbg.c(context));
        tUrlImageView.setMaxWidth(gbg.b(context));
        return tUrlImageView;
    }

    private View b(lnv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb2beca", new Object[]{this, aVar});
        }
        DXRootView a2 = a(aVar.b());
        if (a2 == null) {
            return null;
        }
        View a3 = a(a2, aVar.c());
        if (a3 != null && a(a3)) {
            return a3;
        }
        View a4 = a(a2, aVar.d());
        if (a4 != null && a(a4)) {
            return a4;
        }
        return null;
    }

    private View a(DXRootView dXRootView, String str) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff49bcf5", new Object[]{this, dXRootView, str});
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str + "_frame");
        if (queryWidgetNodeByUserId != null && (dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext()) != null) {
            return dXRuntimeContext.v();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private DXRootView a(String str) {
        View findItemViewByPosition;
        DXRootView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("671fa565", new Object[]{this, str});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null || this.f30763a == null) {
            ldf.d("UpgradeIconAnimeTrigger", "containerDataService == null");
            return null;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            return null;
        }
        List totalData = containerData.getTotalData();
        for (int i = 0; i < totalData.size(); i++) {
            if (StringUtils.equals(str, ((SectionModel) totalData.get(i)).getSectionBizCode()) && (findItemViewByPosition = this.f30763a.findItemViewByPosition(i)) != null && findItemViewByPosition.getVisibility() == 0 && (b = b(findItemViewByPosition)) != null) {
                return b;
            }
        }
        return null;
    }

    private DXRootView b(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f094636e", new Object[]{this, view});
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                return (DXRootView) childAt;
            }
            i++;
        }
    }
}
