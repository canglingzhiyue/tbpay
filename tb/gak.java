package tb;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBRefreshHeader;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;

/* loaded from: classes5.dex */
public class gak extends gai {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TBAbsRefreshHeader e;

    static {
        kge.a(1194642558);
    }

    public static /* synthetic */ Object ipc$super(gak gakVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public gak(Context context) {
        this(context, null);
    }

    public gak(Context context, TBAbsRefreshHeader tBAbsRefreshHeader) {
        this.e = tBAbsRefreshHeader == null ? new TBRefreshHeader(context) : tBAbsRefreshHeader;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.e.setLayoutParams(layoutParams);
    }

    @Override // tb.gal
    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : this.e;
    }

    @Override // tb.gai, tb.gal
    public void a(boolean z, float f, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d9dc4f", new Object[]{this, new Boolean(z), new Float(f), new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.e.setProgress(f);
        }
    }

    @Override // tb.gas
    public void a(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d917981", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
            return;
        }
        this.e.changeToState(a(dXRefreshState2));
        if (this.f28250a == null) {
            return;
        }
        this.f28250a.a(dXRefreshLayout, dXRefreshState, dXRefreshState2);
    }

    private TBAbsRefreshHeader.RefreshState a(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBAbsRefreshHeader.RefreshState) ipChange.ipc$dispatch("8f5878a4", new Object[]{this, dXRefreshState}) : gaw.a(dXRefreshState, this.e.getCurrentState());
    }
}
