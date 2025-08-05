package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import com.taobao.uniinfra_kmp.common_utils.a;
import com.taobao.uniinfra_kmp.common_utils.b;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/taobao/live/liveroom/good/utils/TaoLiveGoodUtils;", "", "<init>", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "getTAG", "()Ljava/lang/String;", "isGrayOrDownShelf", "", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "liveIdCheck", "currLiveId", "isSpeaking", "getCurrentServiceTime", "", "isPreheatGood", "isDefaultTab", "tabName", "categoryId", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class tqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tqi INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String f34275a;

    private tqi() {
    }

    static {
        kge.a(1686174046);
        INSTANCE = new tqi();
        f34275a = "TaoLiveGoodUtils";
    }

    public final boolean a(LiveItem liveItem) {
        KMPJsonObject liveItemStatusData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34d0e5c", new Object[]{this, liveItem})).booleanValue();
        }
        if (liveItem == null || (liveItemStatusData = liveItem.getLiveItemStatusData()) == null) {
            return false;
        }
        return q.a((Object) liveItemStatusData.getBoolean("isGray"), (Object) true) || q.a((Object) liveItemStatusData.getBoolean("isDownShelf"), (Object) true);
    }

    public final boolean b(LiveItem liveItem) {
        KMPJsonObject liveItemStatusData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d82c1d", new Object[]{this, liveItem})).booleanValue();
        }
        if (liveItem != null && (liveItemStatusData = liveItem.getLiveItemStatusData()) != null) {
            return q.a((Object) liveItemStatusData.getBoolean("isSpeaking"), (Object) true);
        }
        return false;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : b.a(a.Companion);
    }

    public final boolean c(LiveItem liveItem) {
        KMPJsonObject extendVal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a6349de", new Object[]{this, liveItem})).booleanValue();
        }
        return q.a((Object) ((liveItem == null || (extendVal = liveItem.getExtendVal()) == null) ? null : extendVal.getString("itemBizType")), (Object) "preHeat");
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : q.a((Object) "全部", (Object) str) && q.a((Object) "0", (Object) str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if ((r9.length() == 0) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        if ((((java.lang.CharSequence) r10).length() == 0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
        if ((r1.length() == 0) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r9, com.taobao.live.liveroom.good.model.LiveItem r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tqi.a(java.lang.String, com.taobao.live.liveroom.good.model.LiveItem):boolean");
    }
}
