package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class atm implements atf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mBizCode;
    public Context mContext;
    private f mExtensionManager;
    public q mUserContext;

    static {
        kge.a(1387556031);
        kge.a(-2099803679);
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.mContext = this.mUserContext.e();
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.mBizCode = qVar.d();
        this.mUserContext = qVar;
        this.mContext = this.mUserContext.e();
        this.mExtensionManager = fVar;
    }

    public f getExtensionManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9e303cdf", new Object[]{this}) : this.mExtensionManager;
    }
}
