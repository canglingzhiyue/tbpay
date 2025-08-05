package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/mytaobao/basement/utils/UpdateViewportHelper;", "", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "mtbBasementContainerView", "Lcom/taobao/mytaobao/basement/MTBBasementContainerView;", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;Lcom/taobao/mytaobao/basement/MTBBasementContainerView;)V", "THRESHOLD", "", "hasSendFirstVerifyFlag", "", "getHasSendFirstVerifyFlag", "()Z", "setHasSendFirstVerifyFlag", "(Z)V", "isBasement", "setBasement", "lastUpdateTimeMillis", "", "considerSendUpdateViewportEvent", "", "ignoreFrequencyLimit", "sendUpdateViewportEvent", "currentMillis", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class mub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f31264a;
    private long b;
    private boolean c;
    private boolean d;
    private final MTBBasementContainerView e;
    private final MTPtrRecyclerView g;

    static {
        kge.a(-140073415);
    }

    public mub(MTPtrRecyclerView rv, MTBBasementContainerView mtbBasementContainerView) {
        q.c(rv, "rv");
        q.c(mtbBasementContainerView, "mtbBasementContainerView");
        this.g = rv;
        this.e = mtbBasementContainerView;
        this.f31264a = 300;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            a(currentTimeMillis);
        } else if (currentTimeMillis - this.b < this.f31264a || this.c) {
        } else {
            a(currentTimeMillis);
        }
    }

    private final void a(long j) {
        p mInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        BasementWeexView weexView = this.e.getWeexView();
        if (weexView == null || (mInstance = weexView.getMInstance()) == null) {
            return;
        }
        mInstance.updateViewport();
        this.b = j;
    }
}
