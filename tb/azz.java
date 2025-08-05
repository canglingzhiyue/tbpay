package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.e;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

@AURAExtensionImpl(code = "aura.impl.component.userMotion")
/* loaded from: classes2.dex */
public final class azz extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private s f25721a;
    private UserMotionConfig b;
    private JSONObject c;
    private bac d;

    static {
        kge.a(-815336472);
    }

    public static /* synthetic */ Object ipc$super(azz azzVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode == -362309544) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f25721a = qVar.b();
        azy azyVar = (azy) fVar.a(azy.class);
        if (azyVar == null) {
            return;
        }
        this.b = azyVar.a();
        this.c = azyVar.b();
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        aURAGlobalData.update("userMotionConfig", this.b);
        aURAGlobalData.update("userMotionCommonArgs", this.c);
        this.d = (bac) aURAGlobalData.get("userMotionRecorder", bac.class);
        if (this.d != null) {
            return;
        }
        this.d = new bac();
        aURAGlobalData.update("userMotionRecorder", this.d);
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        String c = aVar.c();
        if (TextUtils.isEmpty(c)) {
            return;
        }
        char c2 = 65535;
        if (c.hashCode() == -1296041770 && c.equals(e.CODE)) {
            c2 = 0;
        }
        if (c2 != 0) {
            return;
        }
        a(aURAInputData);
    }

    private void a(AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
            return;
        }
        Serializable data = aURAInputData.getData();
        if (!(data instanceof AURAEventIO)) {
            return;
        }
        AURAEventIO aURAEventIO = (AURAEventIO) data;
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.equals(eventType, "user_track") || TextUtils.equals(eventType, "userTrack")) {
            return;
        }
        bad.a(this.f25721a, this.b, d, this.c, eventType);
        a(d, eventType);
    }

    private void a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{this, aURARenderComponent, str});
            return;
        }
        c a2 = c.a(aURARenderComponent, str);
        bac bacVar = this.d;
        if (bacVar == null) {
            return;
        }
        bacVar.a(a2);
    }
}
