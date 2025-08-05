package tb;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.home.component.utils.m;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class ssp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean f = false;
    private float g = 0.0f;
    private boolean j = false;
    private final ljs k;
    private IMainFeedsViewService<?> l;

    static {
        kge.a(-1474487982);
    }

    public static /* synthetic */ void lambda$nQu30Y8SoyWhK1HCTOJvpQjZwZ0(String str, List list) {
        a(str, list);
    }

    public ssp(ljs ljsVar) {
        this.l = null;
        this.k = ljsVar;
        this.l = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = (JSONObject) m.a().a("uploadExposeLevel", JSONObject.class);
        if (jSONObject == null) {
            return;
        }
        this.j = true;
        this.f = jSONObject.getBooleanValue("enableExposeLevel");
        this.g = jSONObject.getFloatValue("cardExposeRatio");
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        if (!this.j) {
            a();
        }
        if (!this.f) {
            return;
        }
        String str = b() ? "statusFirstScreen" : "scrollStatusEnd";
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
        if (staggeredGridLayoutManager == null) {
            return;
        }
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
        int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < spanCount; i++) {
            for (int i2 = findFirstVisibleItemPositions[i]; i2 <= findLastVisibleItemPositions[i]; i2++) {
                if (!arrayList.contains(Integer.valueOf(i2))) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        if (this.g <= 0.0f) {
            ldf.d("RecyclerViewExposeLevelHandler", "曝光过滤比例参数异常");
        } else {
            a(recyclerView, arrayList, staggeredGridLayoutManager, str);
        }
    }

    private void a(RecyclerView recyclerView, List<Integer> list, StaggeredGridLayoutManager staggeredGridLayoutManager, String str) {
        BaseSectionModel<?> findItemDataByPosition;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765b4752", new Object[]{this, recyclerView, list, staggeredGridLayoutManager, str});
            return;
        }
        int b = gbg.b(recyclerView.getContext()) / 2;
        int c = gbg.c(recyclerView.getContext()) / 2;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            int intValue = num.intValue();
            View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(intValue);
            if (findViewByPosition != null) {
                int height = findViewByPosition.getHeight();
                Rect rect = new Rect();
                if (findViewByPosition.getGlobalVisibleRect(rect) && rect.height() / height > this.g && (a2 = stn.a((findItemDataByPosition = this.l.findItemDataByPosition(intValue)))) != null) {
                    BHXVisualCenterItem bHXVisualCenterItem = new BHXVisualCenterItem();
                    bHXVisualCenterItem.b = a(findViewByPosition, b, c);
                    bHXVisualCenterItem.f12314a = a2;
                    bHXVisualCenterItem.e = stn.c(findItemDataByPosition);
                    HashMap hashMap = new HashMap();
                    hashMap.put(aw.PARAM_PVID, stn.b(findItemDataByPosition));
                    bHXVisualCenterItem.c = hashMap;
                    bHXVisualCenterItem.d = liw.a(findViewByPosition);
                    arrayList.add(bHXVisualCenterItem);
                }
            }
        }
        a(arrayList, str);
    }

    private void a(final List<BHXVisualCenterItem> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (list.isEmpty()) {
        } else {
            ljd.a().a(new Runnable() { // from class: tb.-$$Lambda$ssp$nQu30Y8SoyWhK1HCTOJvpQjZwZ0
                @Override // java.lang.Runnable
                public final void run() {
                    ssp.lambda$nQu30Y8SoyWhK1HCTOJvpQjZwZ0(str, list);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (TextUtils.equals(str, "scrollStatusEnd")) {
            h.a("Page_Home", (List<BHXVisualCenterItem>) list, false);
        } else if (!TextUtils.equals(str, "statusFirstScreen")) {
        } else {
            h.a("Page_Home", (List<BHXVisualCenterItem>) list, true);
        }
    }

    private int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        if (view == null || i <= 0 || i2 <= 0) {
            return -1;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        return iArr[1] + (view.getHeight() / 2) < i2 ? width > i ? 2 : 1 : width > i ? 4 : 3;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.k.a(IRocketSubService.class);
        return iRocketSubService != null && !iRocketSubService.isOnRocketState();
    }
}
