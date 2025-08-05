package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.b;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.mediaplay.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class sou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33780a;

    static {
        kge.a(-1386787150);
        f33780a = false;
    }

    public static void a(FluidContext fluidContext, a aVar) {
        a.d E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb920272", new Object[]{fluidContext, aVar});
            return;
        }
        ISceneConfigService iSceneConfigService = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        if (iSceneConfigService == null) {
            return;
        }
        sps sessionParams = iSceneConfigService.getSessionParams();
        if (sessionParams == null || aVar == null || aVar.a() == null) {
            spz.c("PickPreloadController_InternalDetailCacheController", "preLoadNextVideo不满足条件，直接返回__");
            return;
        }
        a.c a2 = aVar.a();
        if (a(a2, b())) {
            spz.c("PickPreloadController_InternalDetailCacheController", "[cachevideo]saveMediaDataAndDownloadVideo, 广告内容，不缓存. " + a2.I());
            return;
        }
        b.a().a(a(aVar));
        if (son.a(PerfConst.FEATURE_EXPOSEDATA_NOT_DOWNLLOAD, false) || (E = a2.E()) == null || TextUtils.isEmpty(E.i())) {
            return;
        }
        a(fluidContext.getContext(), a2.I(), sessionParams.c, E.i());
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        spz.c("PickPreloadController_InternalDetailCacheController", "[cachevideo]exposedDeleteCacheData, contentId=" + str);
        b.b().a(str);
    }

    private static void a(Context context, final String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else if (!soq.c()) {
        } else {
            soo b = sop.a().b();
            if (b.c <= 0) {
                spz.c("PickPreloadController_InternalDetailCacheController", "预下载大小小于0 return");
            } else {
                sos.a(context, str2, b.c, str3, new d() { // from class: tb.sou.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.mediaplay.d
                    public void a(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                            return;
                        }
                        spz.c("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent IPreDownloadListener.onstart id=" + str + " s=" + str4);
                    }

                    @Override // com.taobao.mediaplay.d
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                            return;
                        }
                        spz.c("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent =====>" + str + " onfinish size=" + i);
                        if (i > 0) {
                            return;
                        }
                        spz.c("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent 下载失败，清除缓存后return");
                    }

                    @Override // com.taobao.mediaplay.d
                    public void b(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                            return;
                        }
                        spz.a("PickPreloadController_InternalDetailCacheController", "preDownloadCurrent ------" + str + " onProgress。 i = " + i);
                    }
                });
            }
        }
    }

    public static boolean a(a.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7d2133", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        if (cVar == null || cVar.i() == null || !cVar.w() || !"VIDEO".equalsIgnoreCase(cVar.i().type)) {
            return true;
        }
        if (z && !ogv.a(cVar.i().contentAdParams) && !ogv.a(cVar.i().utPairs) && TextUtils.equals(String.valueOf(cVar.i().utPairs.get("is_ad")), "1")) {
            spz.c("PickPreloadController_InternalDetailCacheController", "PickPreloadControllerNew，当前视频是广告，跳过，contentid=" + cVar.g());
            return true;
        }
        a.d E = cVar.E();
        if (E != null) {
            if (TextUtils.equals(E.p(), "url")) {
                return true;
            }
            String i = E.i();
            if (TextUtils.isEmpty(i) || TextUtils.equals(i, "null")) {
                return true;
            }
        }
        return false;
    }

    public static void a(List<a> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{list, new Integer(i)});
        } else if (list == null || list.size() <= i || i < 0 || !a(list.subList(i, list.size())) || f33780a) {
        } else {
            ohh.b("TAB2_VIDEO_PRELOAD_STAGE", "cachedDetail");
            f33780a = true;
        }
    }

    public static boolean a(List<a> list) {
        DetailCacheData a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (ogv.b(list)) {
            ArrayList arrayList = new ArrayList();
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = list.get(size);
                a.c a3 = aVar.a();
                if (a3 != null && !a(a3, b()) && !a3.i().hasExposed && (a2 = a(aVar)) != null) {
                    arrayList.add(a2);
                    spz.c("PickPreloadController_InternalDetailCacheController", "[cachevideo]updateUnExposeDetailCache, newdata contentid:" + a2.contentId);
                }
            }
            b.b().a(arrayList);
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static DetailCacheData a(a aVar) {
        a.c a2;
        a.d E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("a41cbfc2", new Object[]{aVar});
        }
        if (aVar == null || (a2 = aVar.a()) == null || (E = a2.E()) == null) {
            return null;
        }
        DetailCacheData.a a3 = new DetailCacheData.a().a().b(a2.I()).a(E.i()).c(E.g()).d(b.b().a()).a(aVar);
        if (sjt.y()) {
            a3.a(a2.i()).b(a2.d);
        }
        return a3.b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableFilterUnexposedADVideo", true);
    }
}
