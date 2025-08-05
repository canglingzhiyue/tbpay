package tb;

import anet.channel.session.dns.DnsNavConfigTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/live/liveroom/good/utils/TaoLiveSecKillHelper;", "", "<init>", "()V", "Companion", "SecKillInfoMatch", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqk {
    public static final a Companion;

    static {
        kge.a(-1596357049);
        Companion = new a(null);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lcom/taobao/live/liveroom/good/utils/TaoLiveSecKillHelper$Companion;", "", "<init>", "()V", "isSecKillGoodNew", "", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "secKillInfoMatch", "Lcom/taobao/live/liveroom/good/utils/TaoLiveSecKillHelper$SecKillInfoMatch;", "secKillJson", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "singleSecKillInfoMatch", "secKillInfo", "currTime", "", "isSeckillGood", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1540913969);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final boolean a(LiveItem liveItem) {
            KMPJsonObject extendVal;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c34d0e5c", new Object[]{this, liveItem})).booleanValue();
            }
            if (!b(liveItem)) {
                return false;
            }
            if (!tqh.INSTANCE.b()) {
                return true;
            }
            KMPJsonObject kMPJsonObject = null;
            if (liveItem != null && (extendVal = liveItem.getExtendVal()) != null && (string = extendVal.getString("secKillInfo")) != null) {
                Object a2 = com.taobao.uniinfra_kmp.common_utils.serialization.a.a(com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion, string);
                if (a2 instanceof KMPJsonObject) {
                    kMPJsonObject = (KMPJsonObject) a2;
                }
            }
            return a(kMPJsonObject).a() > 0;
        }

        private final b a(KMPJsonObject kMPJsonObject) {
            IpChange ipChange = $ipChange;
            int i = 2;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9ea19654", new Object[]{this, kMPJsonObject});
            }
            KMPJsonObject kMPJsonObject2 = null;
            if (kMPJsonObject == null) {
                return new b(0, null);
            }
            long a2 = tqi.INSTANCE.a();
            if (a(kMPJsonObject, a2)) {
                return new b(1, null);
            }
            KMPJsonArray jsonArray = kMPJsonObject.getJsonArray("nextActivityList");
            if (jsonArray == null || jsonArray.size() == 0) {
                return new b(0, null);
            }
            Long l = kMPJsonObject.getLong("showEndTime");
            long longValue = l != null ? l.longValue() : -1L;
            if (!a(jsonArray.getJsonObject(0), a2)) {
                i = 0;
            }
            if (a2 > longValue) {
                kMPJsonObject2 = jsonArray.getJsonObject(0);
            }
            return new b(i, kMPJsonObject2);
        }

        private final boolean a(KMPJsonObject kMPJsonObject, long j) {
            Long l;
            Long l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1754d8a2", new Object[]{this, kMPJsonObject, new Long(j)})).booleanValue();
            }
            long j2 = -1;
            long longValue = (kMPJsonObject == null || (l2 = kMPJsonObject.getLong("showStartTime")) == null) ? -1L : l2.longValue();
            if (kMPJsonObject != null && (l = kMPJsonObject.getLong("showEndTime")) != null) {
                j2 = l.longValue();
            }
            if (longValue <= 0 || j2 <= 0) {
                return true;
            }
            return longValue + 1 <= j && j < j2;
        }

        public final boolean b(LiveItem liveItem) {
            KMPJsonObject extendVal;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6d82c1d", new Object[]{this, liveItem})).booleanValue();
            }
            return q.a((Object) ((liveItem == null || (extendVal = liveItem.getExtendVal()) == null) ? null : extendVal.getString("itemBizType")), (Object) "secKill");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/live/liveroom/good/utils/TaoLiveSecKillHelper$SecKillInfoMatch;", "", DnsNavConfigTask.MatchType, "", "rightSecKillInfo", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "<init>", "(ILcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "getMatchType", "()I", "setMatchType", "(I)V", "getRightSecKillInfo", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setRightSecKillInfo", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f34276a;
        private KMPJsonObject b;

        static {
            kge.a(-618054651);
        }

        public b(int i, KMPJsonObject kMPJsonObject) {
            this.f34276a = i;
            this.b = kMPJsonObject;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f34276a;
        }
    }
}
