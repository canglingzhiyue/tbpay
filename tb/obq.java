package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.b;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;
import tb.slk;

/* loaded from: classes5.dex */
public class obq implements obs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f31897a;
    private final IDataService b;
    private final Map<String, slk.a> c = new HashMap(1);

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1969216848);
        kge.a(-1020838575);
    }

    public static /* synthetic */ IDataService a(obq obqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDataService) ipChange.ipc$dispatch("db1fc80d", new Object[]{obqVar}) : obqVar.b;
    }

    public static /* synthetic */ Map b(obq obqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("778c6690", new Object[]{obqVar}) : obqVar.c;
    }

    public obq(FluidContext fluidContext) {
        this.f31897a = fluidContext;
        this.b = (IDataService) fluidContext.getService(IDataService.class);
    }

    @Override // tb.obs
    public void requestCollectionNextVideo(String str, final a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ad66e1", new Object[]{this, str, aVar});
            return;
        }
        spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】start, nextNid: " + str);
        b a3 = b.a(((ISceneConfigService) this.f31897a.getService(ISceneConfigService.class)).getSessionParams(), ((IDataService) this.f31897a.getService(IDataService.class)).getConfig().j()).f(this.b.getTransmission()).a(this.b.getDetailUnlikeRecorder()).a(jct.a(this.f31897a));
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.f31897a.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null && (a2 = currentMediaSetData.a()) != null) {
            a3.b(a2.k());
        }
        this.b.requestForCommendData(false, false, false, -1, str, a3, new com.taobao.android.fluid.core.a<slk.a>() { // from class: tb.obq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(slk.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17894309", new Object[]{this, aVar2});
                } else if (aVar2 == null) {
                    a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video failed, target is null");
                } else if (ogv.a(aVar2.f33700a)) {
                    a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.a();
                    }
                    spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video failed, target.list is null or empty");
                } else {
                    String currentContentId = obq.a(obq.this).getCurrentContentId();
                    if (currentContentId == null) {
                        a aVar5 = aVar;
                        if (aVar5 != null) {
                            aVar5.a();
                        }
                        spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】current content id is null");
                        return;
                    }
                    obq.b(obq.this).put(currentContentId, aVar2);
                    a aVar6 = aVar;
                    if (aVar6 != null) {
                        aVar6.b();
                    }
                    spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】request collection next video success");
                }
            }
        });
        spz.c("CollectionVideoPlayManager", "【requestCollectionNextVideo】end");
    }

    @Override // tb.obs
    public void playCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24bdfd", new Object[]{this});
            return;
        }
        spz.c("CollectionVideoPlayManager", "【playCollectionNextVideo】start");
        slk.a collectionNextVideo = getCollectionNextVideo();
        if (collectionNextVideo == null) {
            return;
        }
        String currentContentId = this.b.getCurrentContentId();
        if (currentContentId == null) {
            spz.c("CollectionVideoPlayManager", "【playCollectionNextVideo】current contentId is null ");
            return;
        }
        this.b.replaceDetail(collectionNextVideo, currentContentId);
        spz.c("CollectionVideoPlayManager", "【playCollectionNextVideo】replace current collection video, current contentId: " + currentContentId);
        clearCollectionNextVideo();
        spz.c("CollectionVideoPlayManager", "【playCollectionNextVideo】end");
    }

    @Override // tb.obs
    public slk.a getCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slk.a) ipChange.ipc$dispatch("8bd50afc", new Object[]{this});
        }
        if (!this.b.enableRecommendMtopNew()) {
            spz.c("CollectionVideoPlayManager", "【getCollectionNextVideo】THe new mtop api is not enable");
            return null;
        }
        String currentContentId = this.b.getCurrentContentId();
        if (currentContentId == null) {
            spz.c("CollectionVideoPlayManager", "【getCollectionNextVideo】current contentId is null ");
            return null;
        }
        slk.a aVar = this.c.get(currentContentId);
        if (aVar == null) {
            spz.c("CollectionVideoPlayManager", "【getCollectionNextVideo】collectionNextVideo is null");
            return null;
        } else if (!ogv.a(aVar.f33700a)) {
            return aVar;
        } else {
            spz.c("CollectionVideoPlayManager", "【getCollectionNextVideo】collectionNextVideo.list is null or empty");
            return null;
        }
    }

    @Override // tb.obs
    public void cancelPlayCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a393b23", new Object[]{this});
            return;
        }
        spz.c("CollectionVideoPlayManager", "【cancelPlayCollectionNextVideo】start");
        clearCollectionNextVideo();
        spz.c("CollectionVideoPlayManager", "【cancelPlayCollectionNextVideo】end");
    }

    @Override // tb.obs
    public void clearCollectionNextVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba26c4", new Object[]{this});
            return;
        }
        spz.c("CollectionVideoPlayManager", "【clearCollectionNextVideo】start");
        this.c.clear();
        spz.c("CollectionVideoPlayManager", "【clearCollectionNextVideo】end");
    }
}
