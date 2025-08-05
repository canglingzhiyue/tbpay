package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.ItemModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import tb.lnv;

/* loaded from: classes7.dex */
public class lnx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<ViewGroup> f30758a;
    private final IContainerDataService<?> b;
    private final lnt c;
    private WeakReference<Context> d;
    private lnv e;

    static {
        kge.a(725785669);
    }

    public lnx(ljs ljsVar, lnt lntVar) {
        this.f30758a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.c = lntVar;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        lnv lnvVar = this.e;
        if (lnvVar != null) {
            lnvVar.c();
        }
        if (this.d == null) {
            return;
        }
        lnv.a b = b(jSONObject);
        Context context = this.d.get();
        if (b == null || context == null) {
            return;
        }
        this.e = new lnw(context, b);
    }

    private lnv.a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lnv.a) ipChange.ipc$dispatch("6bed46ae", new Object[]{this, jSONObject});
        }
        if (!c(jSONObject)) {
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
                ldf.d("IconAnimeTrigger", "Illegal duration:" + aVar.f());
            }
        }
        return aVar;
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && jSONObject.containsKey(lnv.a.TARGET_MINI_APP_ID) && jSONObject.containsKey(lnv.a.ICON_CONTAINER_SECTION_BIZ_CODE) && jSONObject.containsKey(lnv.a.DEFAULT_SECTION_BIZ_CODE) && jSONObject.containsKey(lnv.a.ICON_ANIME_PARENT_IMG);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.d = new WeakReference<>(context);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lnv lnvVar = this.e;
        if (lnvVar == null || lnvVar.a()) {
            return;
        }
        lnv.a b = this.e.b();
        if (!b.a()) {
            ldf.c("IconAnimeTrigger", "Invalidate config:config" + b.toString());
            return;
        }
        View a2 = a(b, a(b));
        if (a2 == null) {
            this.e = null;
            ldf.c("IconAnimeTrigger", "No visible TargetView found:target" + b.toString());
            return;
        }
        Bitmap a3 = this.c.a(b.e());
        if (a3 == null || a3.isRecycled()) {
            this.e = null;
            ldf.c("IconAnimeTrigger", "No legal bitmap can be use" + b.toString());
            return;
        }
        TUrlImageView a4 = a(a3);
        if (a4 == null) {
            ldf.c("IconAnimeTrigger", "imageView == null");
            return;
        }
        lnv lnvVar2 = this.e;
        if (lnvVar2 == null) {
            return;
        }
        lnvVar2.a(a4);
        this.e.b(a2);
        this.e.d();
    }

    private TUrlImageView a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("1855f776", new Object[]{this, bitmap});
        }
        WeakReference<Context> weakReference = this.d;
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

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        lnv lnvVar = this.e;
        if (lnvVar == null) {
            return;
        }
        lnvVar.a(z, 300L);
    }

    private View a(lnv.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("53c0a46f", new Object[]{this, aVar, new Boolean(z)});
        }
        DXRootView a2 = a(aVar.b());
        if (a2 == null) {
            return null;
        }
        View a3 = a(a2, aVar.c());
        return (z || a3 == null) ? a(a2, aVar.d()) : a3;
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

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private DXRootView a(String str) {
        View findItemViewByPosition;
        DXRootView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("671fa565", new Object[]{this, str});
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            ldf.d("IconAnimeTrigger", "containerDataService == null");
            return null;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            return null;
        }
        List totalData = containerData.getTotalData();
        for (int i = 0; i < totalData.size(); i++) {
            if (TextUtils.equals(str, ((SectionModel) totalData.get(i)).getSectionBizCode()) && (findItemViewByPosition = this.f30758a.findItemViewByPosition(i)) != null && findItemViewByPosition.getVisibility() == 0 && (a2 = a(findItemViewByPosition)) != null) {
                return a2;
            }
        }
        return null;
    }

    private DXRootView a(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{this, view});
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

    private boolean a(lnv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcf2ce4b", new Object[]{this, aVar})).booleanValue() : a(aVar.b(), aVar.c()) >= 10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            ldf.d("IconAnimeTrigger", "containerDataService == null");
            return -1;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            return -1;
        }
        for (BaseSectionModel<?> baseSectionModel : containerData.getTotalData()) {
            if (TextUtils.equals(str, baseSectionModel.getSectionBizCode())) {
                return a(str2, baseSectionModel);
            }
        }
        return -1;
    }

    private int a(String str, BaseSectionModel<?> baseSectionModel) {
        int i;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14ae486d", new Object[]{this, str, baseSectionModel})).intValue();
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        Iterator<String> it = mo1098getSubSection.keySet().iterator();
        int i2 = -1;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            String next = it.next();
            ItemModel mo1097getItem = new SectionModel(mo1098getSubSection.getJSONObject(next)).mo1097getItem();
            if (mo1097getItem != null) {
                Iterator<String> it2 = mo1097getItem.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next2 = it2.next();
                        JSONObject jSONObject2 = mo1097getItem.getJSONObject(next2);
                        if (jSONObject2 != null && jSONObject2.containsKey("content") && (jSONObject = jSONObject2.getJSONObject("content")) != null && TextUtils.equals(str, jSONObject.getString("miniAppId"))) {
                            i2 = b(next2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 >= 0) {
                    i = b(next);
                    break;
                }
            }
        }
        if (i2 >= 0 && i >= 0) {
            return (i << 1) + i2;
        }
        return -1;
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            ldf.d("IconAnimeTrigger", "find icon index failed,check icon protocol.");
            return -1;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lnv lnvVar = this.e;
        if (lnvVar == null) {
            return;
        }
        lnvVar.c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lnv lnvVar = this.e;
        if (lnvVar == null) {
            return;
        }
        this.c.b(lnvVar.b().e());
    }
}
