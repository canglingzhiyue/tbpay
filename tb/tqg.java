package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.live.liveroom.good.repository.TaoLiveItemlistV2ResponseData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.t;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001,J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000bH&J\n\u0010 \u001a\u0004\u0018\u00010\u000bH&J&\u0010!\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0#H&J\u0010\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H&J\u001e\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*H&J\b\u0010+\u001a\u00020\u0003H&¨\u0006-"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate;", "", "hideContainer", "", "showContainer", "startAuctionShowAnimation", "startAuctionCloseAnimation", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate$AnimationListener;", "refreshCard", "liveItem", "", "oldItemInfo", "Lcom/taobao/live/liveroom/good/showcase/model/TaoLiveShowcaseItemModel;", "renderNormalCard", "destroyDXAnim", "addItemUUid", "uuid", "hideAtmosphere", "highAtmosphereSetCount", "itemId", "", "total", "", "atmosphereSetVisibility", "visible", "", "initSabAtmosphere", "item", "postEventToEventCenter", "event", "uniqueIdentifi", "getUniqueIdentification", "showcaseShow", "extParams", "", "getTopItemList", "", "Lcom/taobao/live/liveroom/good/repository/TaoLiveItemlistV2ResponseData$ItemListv1;", "postDelayed", com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS, com.taobao.android.weex_framework.util.a.ATOM_EXT_block, "Lkotlin/Function0;", "removeDelayTask", "AnimationListener", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface tqg {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/protocols/IShowcaseControllerDelegate$AnimationListener;", "", "onAnimationStart", "", "onAnimationEnd", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface a {
        void a();

        void b();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-938969061);
        }

        public static /* synthetic */ void a(tqg tqgVar, String str, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45bb51bd", new Object[]{tqgVar, str, str2, new Integer(i), obj});
            } else if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postEventToEventCenter");
            } else {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                tqgVar.a(str, str2);
            }
        }
    }

    void a(long j, int i);

    void a(long j, ruk<t> rukVar);

    void a(String str);

    void a(String str, com.taobao.live.liveroom.good.showcase.model.a aVar);

    void a(String str, String str2);

    void a(String str, Map<String, String> map);

    void a(a aVar);

    void b(String str);

    void b(boolean z);

    void c();

    void c(String str);

    void d();

    void e();

    void f();

    void g();

    String h();

    List<TaoLiveItemlistV2ResponseData.ItemListv1> i();

    void j();
}
