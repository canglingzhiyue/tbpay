package com.taobao.infoflow.core.subservice.biz.rocketservice;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.lix;
import tb.ljs;
import tb.lks;

/* loaded from: classes.dex */
public class a implements lks.c<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String R_EXT_ANCHOR = "anchor";

    /* renamed from: a  reason: collision with root package name */
    private final IRocketSubService.a f17389a;
    private boolean b;
    private JSONObject c;
    private int d;
    private final IContainerDataService<?> e;
    private WeakReference<IContainerInnerDataModel<BaseSectionModel>> f;

    static {
        kge.a(-762846392);
        kge.a(439987723);
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public a(ljs ljsVar, IRocketSubService.a aVar) {
        this.f17389a = aVar;
        this.e = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i != 0) {
        } else {
            a(recyclerView);
        }
    }

    @Override // tb.lks.c
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            a(recyclerView);
        }
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            ldf.d("HomePage", "current layoutManager is " + layoutManager.getClass().getSimpleName());
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = b(recyclerView);
        ldf.e("RocketOnScrollListener", "isAtR4UNow use time : " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        if (this.b == b) {
            return;
        }
        this.b = b;
        this.f17389a.a(this.b);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    private boolean b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e101281b", new Object[]{this, recyclerView})).booleanValue() : a(((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPositions(null)) >= b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        IContainerDataService<?> iContainerDataService = this.e;
        if (iContainerDataService == null) {
            ldf.d("RocketOnScrollListener", "getRocketAnchorPosition dataService == null");
            return 0;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("RocketOnScrollListener", "getRocketAnchorPosition containerData == null");
            return 0;
        }
        WeakReference<IContainerInnerDataModel<BaseSectionModel>> weakReference = this.f;
        if ((weakReference == null ? null : weakReference.get()) == containerData.getBase()) {
            return this.d;
        }
        this.f = new WeakReference<>(containerData.getBase());
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("RocketOnScrollListener", "getRocketAnchorPosition base == null");
            return 0;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("RocketOnScrollListener", "getRocketAnchorPosition configTemp == null");
            return 0;
        }
        JSONArray jSONArray = ext.getJSONArray("jumpAnchor");
        List<BaseSectionModel> totalData = containerData.getTotalData();
        if (jSONArray == null || jSONArray.isEmpty() || totalData.isEmpty()) {
            return 0;
        }
        if (!ext.equals(this.c)) {
            this.c = ext;
            this.d = a(jSONArray, totalData);
        }
        return this.d;
    }

    private int a(JSONArray jSONArray, List<BaseSectionModel> list) {
        int a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38301274", new Object[]{this, jSONArray, list})).intValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next != null && (a2 = lix.a(next.toString(), list)) >= 0) {
                    i = a2 + 1;
                    break;
                }
            } else {
                break;
            }
        }
        this.d = i;
        return i;
    }

    private int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c198169", new Object[]{this, iArr})).intValue();
        }
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
