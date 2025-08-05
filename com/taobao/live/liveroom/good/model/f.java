package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.pqq;
import tb.tpu;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010.\u001a\u00020/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "", "goodLiveInfo", "Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;", "<init>", "(Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;)V", "getGoodLiveInfo", "()Lcom/taobao/live/liveroom/good/model/GoodLiveInfo;", "isMoveHighlight", "", "()Z", "setMoveHighlight", "(Z)V", "enablePcg", "getEnablePcg", "setEnablePcg", "enableRecIds", "getEnableRecIds", "setEnableRecIds", "landscape", "getLandscape", "setLandscape", "transParams", "", "getTransParams", "()Ljava/lang/String;", "setTransParams", "(Ljava/lang/String;)V", pqq.KEY_LIVE_SOURCE, "getLiveSource", "setLiveSource", "entryLiveSource", "getEntryLiveSource", "setEntryLiveSource", "CONFIG", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodConfigContainer;", "getCONFIG", "()Lcom/taobao/live/liveroom/good/model/TaoLiveGoodConfigContainer;", "isShowCaseCardShowing", "setShowCaseCardShowing", "dataCenter", "Lcom/taobao/live/liveroom/good/datacenter/TaoLiveGoodDataCenter;", "getDataCenter", "()Lcom/taobao/live/liveroom/good/datacenter/TaoLiveGoodDataCenter;", "setDataCenter", "(Lcom/taobao/live/liveroom/good/datacenter/TaoLiveGoodDataCenter;)V", "destroy", "", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final GoodLiveInfo f17789a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final e e;
    private boolean f;
    private tpu g;

    static {
        kge.a(-23774056);
    }

    public f(GoodLiveInfo goodLiveInfo) {
        q.d(goodLiveInfo, "goodLiveInfo");
        this.f17789a = goodLiveInfo;
        this.e = new e(this.f17789a);
    }

    public final GoodLiveInfo a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodLiveInfo) ipChange.ipc$dispatch("522cdae6", new Object[]{this}) : this.f17789a;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public final e e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("dfb4a138", new Object[]{this}) : this.e;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public final void a(tpu tpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78ebf", new Object[]{this, tpuVar});
        } else {
            this.g = tpuVar;
        }
    }
}
