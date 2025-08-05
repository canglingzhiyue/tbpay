package android.taobao.windvane.extra.uc.pool;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroid/taobao/windvane/extra/uc/pool/PreCreateInfo;", "", "createStartTime", "", "createEndTime", "isFirst", "", "loadUrlStartTime", "loadUrlEndTime", "(JJZLjava/lang/Long;Ljava/lang/Long;)V", "getCreateEndTime", "()J", "getCreateStartTime", "()Z", "getLoadUrlEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLoadUrlStartTime", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class PreCreateInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long createEndTime;
    private final long createStartTime;
    private final boolean isFirst;
    private final Long loadUrlEndTime;
    private final Long loadUrlStartTime;

    static {
        kge.a(1907489816);
    }

    public PreCreateInfo(long j, long j2, boolean z, Long l, Long l2) {
        this.createStartTime = j;
        this.createEndTime = j2;
        this.isFirst = z;
        this.loadUrlStartTime = l;
        this.loadUrlEndTime = l2;
    }

    public final long getCreateStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("448f3478", new Object[]{this})).longValue() : this.createStartTime;
    }

    public final long getCreateEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8cde371", new Object[]{this})).longValue() : this.createEndTime;
    }

    public final boolean isFirst() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e18c131", new Object[]{this})).booleanValue() : this.isFirst;
    }

    public final Long getLoadUrlStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("4540df12", new Object[]{this}) : this.loadUrlStartTime;
    }

    public final Long getLoadUrlEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("ce340b39", new Object[]{this}) : this.loadUrlEndTime;
    }
}
