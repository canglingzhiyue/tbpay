package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.b;
import com.taobao.android.fluid.framework.adapter.mtop.c;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.slk;
import tb.snn;
import tb.spy;

/* loaded from: classes5.dex */
public class slj implements slh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33688a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ArrayList<a> c = new ArrayList<>();
    private final ArrayList<a> d = new ArrayList<>();
    private final LinkedList<a> e = new LinkedList<>();
    private snn.a f;
    private long g;
    private int h;
    private boolean i;

    static {
        kge.a(-1267083370);
        kge.a(1265276129);
    }

    public static /* synthetic */ FluidContext a(slj sljVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("d6ffe1", new Object[]{sljVar}) : sljVar.f33688a;
    }

    public static /* synthetic */ ArrayList b(slj sljVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4acaae62", new Object[]{sljVar}) : sljVar.c;
    }

    public static /* synthetic */ LinkedList c(slj sljVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("ddfe16c5", new Object[]{sljVar}) : sljVar.e;
    }

    public static /* synthetic */ ArrayList d(slj sljVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("467a2664", new Object[]{sljVar}) : sljVar.d;
    }

    public slj(FluidContext fluidContext) {
        this.f33688a = fluidContext;
    }

    @Override // tb.slh
    public snn.a getOffsetPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snn.a) ipChange.ipc$dispatch("90b4e91d", new Object[]{this}) : this.f;
    }

    @Override // tb.slh
    public long getQuickSecondRefreshMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9235809", new Object[]{this})).longValue() : this.g;
    }

    @Override // tb.slh
    public void setAutoSlideForNextVideo(FluidContext fluidContext) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7d5cd8", new Object[]{this, fluidContext});
        } else if (((IDataService) this.f33688a.getService(IDataService.class)).getUnmodifiableMediaSetList() == null || ((IDataService) this.f33688a.getService(IDataService.class)).getUnmodifiableMediaSetList().size() <= 1 || (aVar = ((IDataService) this.f33688a.getService(IDataService.class)).getUnmodifiableMediaSetList().get(1)) == null || aVar.a() == null) {
        } else {
            spz.c("RecommendDataManager", "设置下一坑数据为autoSlide");
            aVar.a().b(true);
        }
    }

    @Override // tb.slh
    public void setMediaSet(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b141ebd8", new Object[]{this, list});
            return;
        }
        boolean isInQuickOpenMode = ((IQuickOpenService) this.f33688a.getService(IQuickOpenService.class)).isInQuickOpenMode();
        a(list, !isInQuickOpenMode);
        spz.c("RecommendDataManager", " PickPreloadControllerNew，setMediaSet()，将detail数据增加到list中，hookRequestRecommend：");
        ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getRecyclerView().scrollToPosition(0);
        ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
        if (isInQuickOpenMode) {
            return;
        }
        ((IDataService) this.f33688a.getService(IDataService.class)).postLoadDownRunnable();
        ((IDataService) this.f33688a.getService(IDataService.class)).postLoadUpRunnable();
    }

    @Override // tb.slh
    public void updateMediaSet(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81357bf", new Object[]{this, list});
            return;
        }
        spz.c(spc.QUICK_OPEN_TAG, "RecommendDataManager 瞬开二刷 PublicCardListController.updateMediaSet()");
        a(list, true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g = elapsedRealtime;
        ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getRecyclerView().scrollToPosition(0);
        ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemChanged(0, Long.valueOf(elapsedRealtime));
        ((IDataService) this.f33688a.getService(IDataService.class)).postLoadDownRunnable();
        ((IDataService) this.f33688a.getService(IDataService.class)).postLoadUpRunnable();
    }

    @Override // tb.slh
    public void clearListNextData() {
        LinearLayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513a36f", new Object[]{this});
            return;
        }
        IFeedsListService iFeedsListService = (IFeedsListService) this.f33688a.getService(IFeedsListService.class);
        if (iFeedsListService == null || (layoutManager = iFeedsListService.getLayoutManager()) == null || ogv.a(this.c)) {
            return;
        }
        this.i = true;
        int findLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition() + 1;
        if (findLastVisibleItemPosition >= this.c.size()) {
            return;
        }
        try {
            spz.c("RecommendDataManager", "clearListNextData,清除数据范围，nextPosition：" + findLastVisibleItemPosition + ",mMediaSetList.size():" + this.c.size());
            ArrayList<a> arrayList = this.c;
            arrayList.subList(findLastVisibleItemPosition, arrayList.size()).clear();
            sno mediaCardListAdapter = iFeedsListService.getMediaCardListAdapter();
            if (mediaCardListAdapter == null) {
                return;
            }
            if (this.c.size() >= findLastVisibleItemPosition) {
                i = this.c.size() - findLastVisibleItemPosition;
            }
            mediaCardListAdapter.notifyItemRangeRemoved(findLastVisibleItemPosition, i);
            iFeedsListService.getRecyclerView().requestLayout();
        } catch (Throwable th) {
            th.printStackTrace();
            spz.a("RecommendDataManager", "clearListNextData", th);
        }
    }

    @Override // tb.slh
    public int addDetailList(int i, slk.a aVar) {
        a next;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b326e0", new Object[]{this, new Integer(i), aVar})).intValue();
        }
        spz.c("RecommendDataManager", "addDetailList " + i);
        if (aVar == null) {
            return 0;
        }
        if ((!aVar.d() && !aVar.e()) || i < 0 || i > this.c.size()) {
            return 0;
        }
        if (aVar.e()) {
            this.e.addAll(convertToMediaSetDataList(aVar.d, aVar.e));
        }
        LinkedList<a> linkedList = null;
        if (aVar.d()) {
            linkedList = convertToMediaSetDataList(aVar.f33700a, aVar.c);
        }
        int findLastVisibleItemPosition = ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getLayoutManager().findLastVisibleItemPosition();
        StringBuilder sb = new StringBuilder();
        sb.append("recommend 插入数据，tempList ");
        String str = "null";
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : str);
        spz.c("RecommendDataManager", sb.toString());
        if (findLastVisibleItemPosition < 0 || i <= findLastVisibleItemPosition || this.e.isEmpty()) {
            if (linkedList == null) {
                return 0;
            }
            int size = this.c.size();
            try {
                if (i <= 0) {
                    this.d.addAll(0, linkedList);
                } else if (i >= this.c.size()) {
                    this.d.addAll(linkedList);
                } else {
                    this.d.addAll(this.d.indexOf(this.c.get(i - 1)) + 1, linkedList);
                }
            } catch (Exception e) {
                spz.a("RecommendDataManager", "", e);
            }
            this.c.addAll(i, linkedList);
            if (("(PreLoadManagerNew) end add detail at " + i + " " + linkedList) != null) {
                str = String.valueOf(linkedList.size());
            } else {
                if (("null curPosition:" + findLastVisibleItemPosition + " ; lastSize=" + size + " curSize=" + this.c) != null) {
                    str = String.valueOf(this.c.size());
                }
            }
            spz.c("RecommendDataManager", str);
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeInserted(i, linkedList.size());
            smi.b(this.f33688a);
            return linkedList.size();
        }
        int size2 = this.c.size();
        int i2 = findLastVisibleItemPosition + 1;
        int i3 = i2;
        while (i3 < this.c.size()) {
            a aVar2 = this.c.get(i3);
            if (a.a(aVar2) > 0) {
                aVar2.a(false);
                this.c.remove(i3);
                i3--;
            }
            i3++;
        }
        if (linkedList != null && !linkedList.isEmpty()) {
            if (i > this.c.size()) {
                i = this.c.size();
            }
            this.c.addAll(i, linkedList);
        }
        Iterator<a> it = this.e.iterator();
        while (it.hasNext() && (a2 = a.a((next = it.next()))) <= this.c.size()) {
            if (a2 > findLastVisibleItemPosition && !next.c() && (a2 >= this.c.size() || a.a(this.c.get(a2)) <= 0)) {
                next.a(true);
                this.c.add(a2, next);
            }
        }
        int size3 = this.c.size();
        int i4 = size3 - size2;
        spz.c("RecommendDataManager", "(PreLoadManagerNew) curSize:" + size3 + " lastSize:" + size2 + " insertSize:" + i4 + " curPosition:" + findLastVisibleItemPosition);
        if (i4 > 0) {
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeInserted(i2, i4);
        } else if (i4 < 0) {
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeRemoved(i2, i4);
        }
        int i5 = (size3 - findLastVisibleItemPosition) - 1;
        if (i5 > 0) {
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i2, i5);
        }
        smi.b(this.f33688a);
        return i4;
    }

    @Override // tb.slh
    public void refreshCurrentData(final a aVar, final spy.a aVar2, final ptk ptkVar) {
        final a.c a2;
        sps sessionParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c785fd", new Object[]{this, aVar, aVar2, ptkVar});
        } else if (aVar == null || (a2 = aVar.a()) == null || (sessionParams = ((ISceneConfigService) this.f33688a.getService(ISceneConfigService.class)).getSessionParams()) == null) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            final boolean a3 = skk.a(this.f33688a);
            spz.a("RecommendDataManager", "refreshCurrentData");
            b<MediaMixContentDetailResponse> bVar = new b<MediaMixContentDetailResponse>() { // from class: tb.slj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
                public void a(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                        return;
                    }
                    mtopResponse.setApi("refresh:" + mtopResponse.getApi());
                    pio.a(slj.a(slj.this), mtopResponse, currentTimeMillis, false);
                    if (aVar2 == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("refreshStatus", "failed");
                    hashMap.put("isLocked", "true");
                    aVar2.a(ptkVar, hashMap);
                }

                @Override // com.taobao.android.fluid.framework.adapter.mtop.b
                public void a(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e08a2d2c", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse});
                        return;
                    }
                    mtopResponse.setApi("refresh:" + mtopResponse.getApi());
                    if (jSONObject != null && mediaMixContentDetailResponse == null) {
                        mediaMixContentDetailResponse = slr.a(a3, jSONObject);
                    }
                    if (jSONObject == null || mediaMixContentDetailResponse == null || mediaMixContentDetailResponse.data == 0) {
                        pio.a(slj.a(slj.this), mtopResponse, currentTimeMillis, false);
                        return;
                    }
                    MediaContentDetailData mediaContentDetailData = (MediaContentDetailData) slm.a(((MediaMixContentDetail) mediaMixContentDetailResponse.data).list);
                    JSONObject jSONObject2 = null;
                    JSONArray a4 = slm.a(jSONObject, "data", sku.a(slj.a(slj.this)));
                    if (a4 != null && !a4.isEmpty()) {
                        jSONObject2 = a4.getJSONObject(0);
                    }
                    if (a.a(mediaContentDetailData) == -1 || jSONObject2 == null) {
                        pio.a(slj.a(slj.this), mtopResponse, currentTimeMillis, false);
                        return;
                    }
                    a.c cVar = a2;
                    cVar.d = jSONObject2;
                    cVar.a(mediaContentDetailData);
                    pio.a(slj.a(slj.this), mtopResponse, currentTimeMillis, true);
                    int indexOfList = ((IDataService) slj.a(slj.this).getService(IDataService.class)).getIndexOfList(aVar);
                    if (indexOfList == -1) {
                        spz.c("RecommendDataManager", "refreshCurrentData index==-1");
                        return;
                    }
                    if (aVar2 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("refreshStatus", "success");
                        if (a2.p() != null) {
                            hashMap.put("isLocked", String.valueOf(a2.p().locked));
                        } else {
                            hashMap.put("isLocked", "true");
                        }
                        aVar2.a(ptkVar, hashMap);
                    }
                    ((IFeedsListService) slj.a(slj.this).getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemChanged(indexOfList);
                }
            };
            IMTopAdapter.a<MediaMixContentDetailResponse> aVar3 = new IMTopAdapter.a<MediaMixContentDetailResponse>() { // from class: tb.slj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v5, types: [mtopsdk.mtop.domain.BaseOutDo, com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse] */
                @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.a
                public /* synthetic */ MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (BaseOutDo) ipChange2.ipc$dispatch("954600f8", new Object[]{this, bArr, cls}) : b(bArr, cls);
                }

                public MediaMixContentDetailResponse b(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (MediaMixContentDetailResponse) ipChange2.ipc$dispatch("55fce272", new Object[]{this, bArr, cls});
                    }
                    if (!skk.f()) {
                        return slr.a(a3, bArr);
                    }
                    return null;
                }
            };
            IMTOPRequest a4 = com.taobao.android.fluid.framework.data.remote.newmodel.a.a(this.f33688a, sessionParams, a2.g());
            HashMap hashMap = new HashMap();
            hashMap.put("asac", com.taobao.android.fluid.framework.data.remote.newmodel.b.ASAC_VALUE);
            c.a a5 = c.a.a().a(a4);
            if (!skk.g()) {
                hashMap = null;
            }
            FluidSDK.getMTopAdapter().send(a5.a(hashMap).a(bVar).a(aVar3).b(true).a(com.taobao.android.fluid.framework.data.remote.a.MTOP_BIZ_TOPIC_RELOAD_CELL).a(MediaMixContentDetailResponse.class).b());
        }
    }

    @Override // tb.slh
    public void replaceDetail(slk.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb0ec57", new Object[]{this, aVar, str});
        } else if (aVar == null || aVar.c() || TextUtils.isEmpty(str)) {
        } else {
            int i = 0;
            while (true) {
                if (i >= this.c.size()) {
                    i = -1;
                    break;
                }
                a.c a2 = this.c.get(i).a();
                if (a2 != null && str.equals(a2.g())) {
                    break;
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.e.size()) {
                    i2 = -1;
                    break;
                }
                a.c a3 = this.e.get(i2).a();
                if (a3 != null && str.equals(a3.g())) {
                    break;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.d.size()) {
                    i3 = -1;
                    break;
                }
                a.c a4 = this.d.get(i3).a();
                if (a4 != null && str.equals(a4.g())) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                spz.c("RecommendDataManager", "replace未找到数据:" + str);
                return;
            }
            new LinkedList();
            if (aVar.e() && i2 != -1) {
                LinkedList<a> convertToMediaSetDataList = convertToMediaSetDataList(aVar.d, aVar.e);
                this.e.remove(i2);
                this.e.addAll(i2, convertToMediaSetDataList);
            }
            LinkedList<a> linkedList = new LinkedList<>();
            if (aVar.d()) {
                linkedList = convertToMediaSetDataList(aVar.f33700a, aVar.c);
                this.c.remove(i);
                this.c.addAll(i, linkedList);
                if (i3 != -1) {
                    this.d.remove(i3);
                    this.d.addAll(i3, linkedList);
                }
            }
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i, linkedList.size());
            smi.b(this.f33688a);
            if (i != ((IDataService) this.f33688a.getService(IDataService.class)).getCurrentMediaPosition() + 1) {
                return;
            }
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().post(new Runnable() { // from class: tb.slj.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((IFeedsListService) slj.a(slj.this).getService(IFeedsListService.class)).preloadNext(((ICardService) slj.a(slj.this).getService(ICardService.class)).getActiveCard(), false);
                    }
                }
            });
        }
    }

    @Override // tb.slh
    public void insertDetailListAtCurrent(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c5a66", new Object[]{this, aVar});
            return;
        }
        Integer valueOf = Integer.valueOf(((ICardService) this.f33688a.getService(ICardService.class)).getActiveCard().r());
        if (aVar == null) {
            return;
        }
        int b = aVar.b();
        if (b == 0) {
            ((IDataService) this.f33688a.getService(IDataService.class)).addDetailList(valueOf.intValue() + 1, aVar);
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().post(new Runnable() { // from class: tb.slj.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((IFeedsListService) slj.a(slj.this).getService(IFeedsListService.class)).preloadNext(((ICardService) slj.a(slj.this).getService(ICardService.class)).getActiveCard(), false);
                    }
                }
            });
        } else if (b < 0) {
            int intValue = valueOf.intValue() + b + 1;
            if (intValue < 0) {
                intValue = 0;
            }
            ((IDataService) this.f33688a.getService(IDataService.class)).addDetailList(intValue, aVar);
        } else {
            int intValue2 = valueOf.intValue() + b;
            if (intValue2 > this.c.size()) {
                intValue2 = this.c.size();
            }
            ((IDataService) this.f33688a.getService(IDataService.class)).addDetailList(intValue2, aVar);
            if (b != 1) {
                return;
            }
            spz.a("PreLoadManagerNew", "insertDetailListAtCurrent preloadstatus---> insert index=" + intValue2 + " ");
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
            ((IDataService) this.f33688a.getService(IDataService.class)).getmPreloadNextHandler().post(new Runnable() { // from class: tb.slj.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((IFeedsListService) slj.a(slj.this).getService(IFeedsListService.class)).preloadNext(((IFeedsListService) slj.a(slj.this).getService(IFeedsListService.class)).getActiveCard(), false);
                    }
                }
            });
        }
    }

    @Override // tb.slh
    public void removeDetailListAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3da30", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.c.size()) {
        } else {
            if (this.c.get(i).a().u()) {
                ((IDataService) this.f33688a.getService(IDataService.class)).setTab3CacheEnable(false);
            }
            this.c.remove(i);
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRemoved(i);
            if (a()) {
                ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i, this.c.size());
            }
            smi.b(this.f33688a);
        }
    }

    @Override // tb.slh
    public void removeDetailListByIds(List<String> list) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd2cae6", new Object[]{this, list});
        } else if (this.c.size() <= 0 || list == null || list.isEmpty()) {
        } else {
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && !ogv.a(next.f12529a) && (a2 = next.a()) != null && list.contains(a2.g())) {
                    it.remove();
                }
            }
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
            smi.b(this.f33688a);
        }
    }

    @Override // tb.slh
    public void removeDetailListWithAuthor(String str) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59e7615", new Object[]{this, str});
        } else if (this.c.size() <= 0 || TextUtils.isEmpty(str)) {
        } else {
            Iterator<a> it = this.c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && !ogv.a(next.f12529a) && (a2 = next.a()) != null && str.equals(a2.d())) {
                    it.remove();
                }
            }
            ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
            smi.b(this.f33688a);
        }
    }

    @Override // tb.slh
    public a.c getCurrentMediaDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("bdcbea36", new Object[]{this});
        }
        int activePosition = ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getActivePosition();
        if (activePosition >= 0 && activePosition < this.c.size()) {
            return this.c.get(activePosition).a();
        }
        return null;
    }

    @Override // tb.slh
    public a getCurrentMediaSetData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3316160e", new Object[]{this});
        }
        int activePosition = ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getActivePosition();
        if (activePosition >= 0 && activePosition < this.c.size()) {
            return this.c.get(activePosition);
        }
        return null;
    }

    @Override // tb.slh
    public String getCurrentContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedca28", new Object[]{this});
        }
        a.c currentMediaDetail = ((IDataService) this.f33688a.getService(IDataService.class)).getCurrentMediaDetail();
        if (currentMediaDetail == null) {
            spz.c("RecommendDataManager", "【getCurrentContentId】current MediaDetail is null");
            return null;
        }
        return currentMediaDetail.g();
    }

    @Override // tb.slh
    public int getCurrentMediaPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fde0424", new Object[]{this})).intValue() : ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).getActivePosition();
    }

    @Override // tb.slh
    public int getIndexOfList(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef8dcb67", new Object[]{this, aVar})).intValue();
        }
        if (aVar != null) {
            return this.c.indexOf(aVar);
        }
        return -1;
    }

    @Override // tb.slh
    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue() : this.c.size();
    }

    @Override // tb.slh
    public List<a> getUnmodifiableMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("98383071", new Object[]{this}) : Collections.unmodifiableList(this.c);
    }

    @Override // tb.slh
    public ArrayList<a> getMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("e318faf3", new Object[]{this}) : this.c;
    }

    @Override // tb.slh
    public ArrayList<a> getUnRemoveMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("27e83b10", new Object[]{this}) : this.d;
    }

    @Override // tb.slh
    public int getCurrentDetailSuccessMtopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9b5b4c", new Object[]{this})).intValue() : this.h;
    }

    @Override // tb.slh
    public void appendDetailListAtLast(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b0afa", new Object[]{this, aVar});
        } else {
            addDetailList(getMediaSetList().size(), aVar);
        }
    }

    @Override // tb.slh
    public void appendDetailListAtFirst(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee3781c", new Object[]{this, aVar});
        } else {
            addDetailList(0, aVar);
        }
    }

    @Override // tb.slh
    public LinkedList<a> convertToMediaSetDataList(List<MediaContentDetailData> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("71484afa", new Object[]{this, list, jSONArray});
        }
        LinkedList<a> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.size(); i++) {
            MediaContentDetailData mediaContentDetailData = list.get(i);
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (-1 != a.a(mediaContentDetailData)) {
                linkedList.addLast(new a(mediaContentDetailData, jSONObject));
            }
        }
        return linkedList;
    }

    @Override // tb.slh
    public ArrayList<a> convertToMediaSetDataArrayList(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("80415e3", new Object[]{this, aVar});
        }
        if (!aVar.d()) {
            return new ArrayList<>();
        }
        ArrayList<a> arrayList = new ArrayList<>();
        List<MediaContentDetailData> list = aVar.f33700a;
        JSONArray jSONArray = aVar.c;
        for (int i = 0; i < jSONArray.size(); i++) {
            MediaContentDetailData mediaContentDetailData = list.get(i);
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (-1 != a.a(mediaContentDetailData)) {
                arrayList.add(new a(mediaContentDetailData, jSONObject));
            }
        }
        return arrayList;
    }

    @Override // tb.slh
    public Handler getmPreloadNextHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a3d7e1fa", new Object[]{this}) : this.b;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableRemoveCardRangeChange", true);
    }

    private void a(List<a> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        spz.a("changfeng", "VideoProcess PublicCardListController.setMediaSet(),PickPreloadControllerNew");
        if (ogv.a(list)) {
            return;
        }
        if (z) {
            this.h++;
        }
        this.c.clear();
        this.d.clear();
        ((IDataService) this.f33688a.getService(IDataService.class)).resetNoMoreDataFlag();
        ((IFeedsListService) this.f33688a.getService(IFeedsListService.class)).renderCacheVideo(null);
        final a a2 = a.a(list);
        if (a2 == null) {
            return;
        }
        this.c.addAll(list);
        if (((ICollectionService) this.f33688a.getService(ICollectionService.class)).isCollectionPagingEnable()) {
            a.c a3 = a2.a();
            if (a3 == null) {
                return;
            }
            ((ICollectionService) this.f33688a.getService(ICollectionService.class)).getCollectionMap().put(Integer.valueOf(obo.a(a2)), a2);
            ((ICollectionService) this.f33688a.getService(ICollectionService.class)).getContentIdMap().put(a3.g(), Integer.valueOf(obo.a(a2)));
        }
        this.d.addAll(list);
        this.e.clear();
        if (spj.c(this.f33688a)) {
            this.f = new snn.a() { // from class: tb.slj.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snn.a
                public int a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("4e800257", new Object[]{this, aVar})).intValue() : slj.b(slj.this).indexOf(a2);
                }
            };
        } else {
            this.f = new snn.a() { // from class: tb.slj.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snn.a
                public int a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("4e800257", new Object[]{this, aVar})).intValue();
                    }
                    if (!slj.c(slj.this).isEmpty()) {
                        return slj.b(slj.this).indexOf(aVar) - slj.b(slj.this).indexOf(a2);
                    }
                    if (slj.d(slj.this).contains(a2)) {
                        i = slj.d(slj.this).indexOf(a2);
                    }
                    return slj.d(slj.this).indexOf(aVar) - i;
                }
            };
        }
    }

    @Override // tb.slh
    public boolean canLoopOnceRequestRecommend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e61f7cd", new Object[]{this})).booleanValue() : this.i;
    }

    @Override // tb.slh
    public void setLoopOnceRequestRecommend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5890d8d9", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }
}
