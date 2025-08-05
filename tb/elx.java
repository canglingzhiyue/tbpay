package tb;

import android.content.Context;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alidetail.impl.userMotion.config")
/* loaded from: classes4.dex */
public final class elx implements azy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UserMotionConfig f27425a;
    private JSONObject b;

    static {
        kge.a(1537883182);
        kge.a(-1811697848);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public elx() {
        emu.a("com.taobao.android.detail.core.standard.userMotion.AliDetailUserMotionConfigExtension");
    }

    @Override // tb.azy
    public UserMotionConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserMotionConfig) ipChange.ipc$dispatch("df473a8", new Object[]{this}) : this.f27425a;
    }

    @Override // tb.azy
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        Context e = qVar.e();
        this.f27425a = elz.a(e);
        this.b = elz.b(e);
    }
}
