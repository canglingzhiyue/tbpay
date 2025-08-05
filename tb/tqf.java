package tb;

import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.message.GoodMsgNew;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¨\u0006\u001a"}, d2 = {"Lcom/taobao/live/liveroom/good/showcase/protocols/IGoodDataObserver;", "", "onMessageAddProduct", "", "msgNew", "Lcom/taobao/live/liveroom/good/model/message/GoodMsgNew;", "onMessageStopExplanation", "onMessageExplanation", "goodMsgNew", "onMessageGoodHotNum", "itemId", "", "total", "", "onMessageGoodHot", "onMessageExplanationDelete", "onGoodStateChange", "pmData", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "onUpdateItemFromPM", "onUpdateItem", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "resultCode", "", "source", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface tqf {
    void a(long j, int i);

    void a(LiveItem liveItem, String str, String str2);

    void a(GoodMsgNew goodMsgNew);

    void a(KMPJsonObject kMPJsonObject);

    void b(GoodMsgNew goodMsgNew);

    void c(GoodMsgNew goodMsgNew);

    void d(GoodMsgNew goodMsgNew);

    void e(GoodMsgNew goodMsgNew);
}
