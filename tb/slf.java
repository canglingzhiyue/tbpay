package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.b;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.slk;

/* loaded from: classes5.dex */
public class slf implements slg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33684a;
    private final LinkedList<slk.a> b = new LinkedList<>();
    private final IDataService c;
    private final IFeedsListService d;
    private final ICollectionService e;
    private List<String> f;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f33687a;
        public int b;
        public List<com.taobao.android.fluid.framework.data.datamodel.a> c;

        static {
            kge.a(-1613917323);
        }

        public a(int i, String str, List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
            this.b = -1;
            this.c = null;
            this.b = i;
            this.f33687a = str;
            this.c = list;
        }
    }

    static {
        kge.a(-631639551);
        kge.a(-210359082);
    }

    public static /* synthetic */ FluidContext a(slf slfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("2aee66dd", new Object[]{slfVar}) : slfVar.f33684a;
    }

    public static /* synthetic */ LinkedList b(slf slfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("901d1ea2", new Object[]{slfVar}) : slfVar.b;
    }

    public slf(FluidContext fluidContext) {
        this.f33684a = fluidContext;
        this.e = (ICollectionService) this.f33684a.getService(ICollectionService.class);
        this.c = (IDataService) this.f33684a.getService(IDataService.class);
        this.d = (IFeedsListService) this.f33684a.getService(IFeedsListService.class);
    }

    @Override // tb.slg
    public boolean feedbackRequest(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d37eb3fe", new Object[]{this, bVar})).booleanValue() : ((IDataService) this.f33684a.getService(IDataService.class)).dynamicRecommend(bVar);
    }

    @Override // tb.slg
    public boolean reOrderTailUnExposeList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780399e2", new Object[]{this, list})).booleanValue();
        }
        try {
            a("before");
            ArrayList arrayList = new ArrayList(((IDataService) this.f33684a.getService(IDataService.class)).getMediaSetList());
            ArrayList arrayList2 = new ArrayList(((IDataService) this.f33684a.getService(IDataService.class)).getUnRemoveMediaSetList());
            a a2 = a(list, arrayList, null);
            if (a2.b != -1) {
                a a3 = a(list, arrayList2, a2.f33687a);
                if (a2.b != -1 && a3.b != -1) {
                    Collections.copy(((IDataService) this.f33684a.getService(IDataService.class)).getMediaSetList(), arrayList);
                    Collections.copy(((IDataService) this.f33684a.getService(IDataService.class)).getUnRemoveMediaSetList(), arrayList2);
                    a(JarvisConstant.TRIGGER_POINT_AFTER);
                    ((IFeedsListService) this.f33684a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(a2.b, ((IDataService) this.f33684a.getService(IDataService.class)).getMediaSetList().size() - a2.b);
                    smi.b(this.f33684a);
                    int currentMediaPosition = ((IDataService) this.f33684a.getService(IDataService.class)).getCurrentMediaPosition();
                    String g = ((IDataService) this.f33684a.getService(IDataService.class)).getMediaSetList().get(a2.b).a().g();
                    if (a2.b == currentMediaPosition + 1 && !a2.f33687a.equals(g)) {
                        ((IDataService) this.f33684a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
                        ((IDataService) this.f33684a.getService(IDataService.class)).getmPreloadNextHandler().post(new Runnable() { // from class: tb.slf.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ((IFeedsListService) slf.a(slf.this).getService(IFeedsListService.class)).preloadNext(((ICardService) slf.a(slf.this).getService(ICardService.class)).getActiveCard(), false);
                                }
                            }
                        });
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            spz.c("DynamicRecommendManager", "reOrderTailUnExposeList");
            return false;
        }
    }

    @Override // tb.slg
    public boolean dynamicRecommend(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("947d6f6b", new Object[]{this, bVar})).booleanValue() : ((IDataService) this.f33684a.getService(IDataService.class)).dynamicRecommend(bVar, new com.taobao.android.fluid.core.a<slk.a>() { // from class: tb.slf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(slk.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar});
                } else if (aVar == null) {
                    spz.c("DynamicRecommendManager", "requestForCommendData onCall target==null");
                } else if (aVar.f) {
                    spz.c("DynamicRecommendManager", "requestForCommendData onCall target isDetailLoading");
                } else {
                    if (((IFeedsListService) slf.a(slf.this).getService(IFeedsListService.class)).getRecyclerView().getScrollState() == 0) {
                        ((IDataService) slf.a(slf.this).getService(IDataService.class)).insertDetailListAtCurrent(aVar);
                    } else {
                        slf.b(slf.this).addLast(aVar);
                    }
                    spz.c("DynamicRecommendManager", "动态推荐完成:" + aVar.g);
                    if (!aVar.d() || !son.a(PerfConst.FEATURE_SAVE_CACHE_DYNAMIC_RECOMMEND, false) || son.a(PerfConst.FEATURE_RECOVER_CACHE_SAVE_GET_OPT, false)) {
                        return;
                    }
                    if (son.a(PerfConst.FEATURE_ONLY_CACHE_TAB3, false) && !((IUsePreloadService) slf.a(slf.this).getService(IUsePreloadService.class)).enableTab3UseCacheData()) {
                        return;
                    }
                    LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> convertToMediaSetDataList = ((IDataService) slf.a(slf.this).getService(IDataService.class)).convertToMediaSetDataList(aVar.f33700a, aVar.c);
                    sou.a(convertToMediaSetDataList);
                    spz.c("DynamicRecommendManager", "动态推荐完成插入cache:" + convertToMediaSetDataList.size());
                }
            }
        });
    }

    @Override // tb.slg
    public boolean dynamicRecommend(b bVar, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbfc9875", new Object[]{this, bVar, aVar})).booleanValue();
        }
        if (bVar == null || this.c.getLoadingState(false) || this.e.isCollectionPagingEnable() || ((IPublishInsertService) this.f33684a.getService(IPublishInsertService.class)).isPublishIInsertEnable() || this.c.getConfig().j().y || this.c.getConfig().j().o || this.d.getRecyclerView().getScrollState() != 0) {
            return false;
        }
        if (bVar.f12532a != null) {
            if (bVar.f12532a.b() != null) {
                return false;
            }
            String g = bVar.f12532a.a().g();
            if (!ogv.a(this.f) && this.f.contains(g)) {
                spz.c("DynamicRecommendManager", "disableDynamicRecommend 该内容禁用动态推荐 contentid=" + g);
                return false;
            }
        }
        ((IDataService) this.f33684a.getService(IDataService.class)).requestForCommendData(false, false, true, -1, null, bVar.f(((IDataService) this.f33684a.getService(IDataService.class)).getTransmission()).a(((IDataService) this.f33684a.getService(IDataService.class)).getDetailUnlikeRecorder()).a(jct.a(this.f33684a)).a(false), aVar);
        return true;
    }

    @Override // tb.slg
    public void updateNoDynamicRecContents(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65b6ae", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (z) {
            this.f.add(str);
        } else {
            this.f.remove(str);
        }
    }

    @Override // tb.slg
    public LinkedList<slk.a> getFeedbackList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("7e945bee", new Object[]{this}) : this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
        r14.removeAll(r6);
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
        if (r13.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
        r0 = r13.next();
        r1 = (com.taobao.android.fluid.framework.data.datamodel.a) r5.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
        if (r7.isEmpty() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
        r1.a().i().index = ((java.lang.Integer) r7.poll()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0159, code lost:
        r14.add(r5.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0161, code lost:
        r14.addAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0169, code lost:
        return new tb.slf.a(r3, r15, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.slf.a a(java.util.List<java.lang.String> r13, java.util.List<com.taobao.android.fluid.framework.data.datamodel.a> r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.slf.a(java.util.List, java.util.List, java.lang.String):tb.slf$a");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it = ((IDataService) this.f33684a.getService(IDataService.class)).getMediaSetList().iterator();
            while (it.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a next = it.next();
                if (next != null && next.a() != null) {
                    sb.append(next.a().g());
                    sb.append('-');
                }
            }
            sb.append("UnMove:");
            Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it2 = ((IDataService) this.f33684a.getService(IDataService.class)).getUnRemoveMediaSetList().iterator();
            while (it2.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a next2 = it2.next();
                if (next2 != null && next2.a() != null) {
                    sb.append(next2.a().g());
                    sb.append('-');
                }
            }
            spz.a("DynamicRecommendManager", "reOrderLog" + ((Object) sb));
        } catch (Throwable unused) {
            spz.c("DynamicRecommendManager", "reOrderLogError");
        }
    }
}
