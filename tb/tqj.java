package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.EnterGoodsData;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.live.liveroom.good.model.message.GoodMsgNew;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/taobao/live/liveroom/good/utils/TaoLiveModelUtils;", "", "<init>", "()V", "parseLiveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "jsonString", "", "parseEnterGoodsData", "Lcom/taobao/live/liveroom/good/model/EnterGoodsData;", "parseGoodMsgNew", "Lcom/taobao/live/liveroom/good/model/message/GoodMsgNew;", "parseItemListv1", "", "Lcom/taobao/live/liveroom/good/repository/TaoLiveItemlistV2ResponseData$ItemListv1;", "parseItemIdentifier", "Lcom/taobao/live/liveroom/good/model/ItemIdentifier;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tqj INSTANCE;

    static {
        kge.a(-920667938);
        INSTANCE = new tqj();
    }

    private tqj() {
    }

    public final LiveItem a(String jsonString) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem) ipChange.ipc$dispatch("7734aed4", new Object[]{this, jsonString});
        }
        q.d(jsonString, "jsonString");
        try {
            Result.a aVar = Result.Companion;
            b.a aVar2 = b.Companion;
            m2371constructorimpl = Result.m2371constructorimpl((LiveItem) ((Serializable) JSONObject.parseObject(jsonString, LiveItem.class)));
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
            m2371constructorimpl = null;
        }
        return (LiveItem) m2371constructorimpl;
    }

    public final EnterGoodsData b(String jsonString) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnterGoodsData) ipChange.ipc$dispatch("8012850a", new Object[]{this, jsonString});
        }
        q.d(jsonString, "jsonString");
        try {
            Result.a aVar = Result.Companion;
            b.a aVar2 = b.Companion;
            m2371constructorimpl = Result.m2371constructorimpl((EnterGoodsData) ((Serializable) JSONObject.parseObject(jsonString, EnterGoodsData.class)));
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
            m2371constructorimpl = null;
        }
        return (EnterGoodsData) m2371constructorimpl;
    }

    public final GoodMsgNew c(String jsonString) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodMsgNew) ipChange.ipc$dispatch("5a8dca4d", new Object[]{this, jsonString});
        }
        q.d(jsonString, "jsonString");
        try {
            Result.a aVar = Result.Companion;
            b.a aVar2 = b.Companion;
            m2371constructorimpl = Result.m2371constructorimpl((GoodMsgNew) ((Serializable) JSONObject.parseObject(jsonString, GoodMsgNew.class)));
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
            m2371constructorimpl = null;
        }
        return (GoodMsgNew) m2371constructorimpl;
    }
}
