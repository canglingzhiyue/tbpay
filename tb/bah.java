package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

@AURAExtensionImpl(code = "aura.impl.event.weex2")
/* loaded from: classes2.dex */
public final class bah extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "weex2FireEvent";
    public static final String KEY_INSTANCE_ID = "instanceId";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MESSAGE_ACTION = "messageAction";
    public static final String KEY_MESSAGE_DATA = "messageData";

    /* renamed from: a  reason: collision with root package name */
    private baf f25730a;

    static {
        kge.a(-176795793);
    }

    public static /* synthetic */ Object ipc$super(bah bahVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (this.f25730a == null) {
            arc.a().b("innerHandleEvent:mWeex2InstanceManager is null", arc.a.a().b("AURAWeex2FireEvent").a("AURA/core").b());
        } else {
            JSONObject c = aURAEventIO.getEventModel().c();
            if (c == null) {
                arc.a().b("innerHandleEvent:eventFields is null", arc.a.a().b("AURAWeex2FireEvent").a("AURA/core").b());
                return;
            }
            String string = c.getString("instanceId");
            if (TextUtils.isEmpty(string)) {
                arc.a().b("innerHandleEvent:instanceId is empty", arc.a.a().b("AURAWeex2FireEvent").a("AURA/core").b());
                return;
            }
            bag a2 = this.f25730a.a(string);
            if (a2 == null || a2.m() == null) {
                arc.a().b("innerHandleEvent:weexInstance or MUSInstance is null", arc.a.a().b("AURAWeex2FireEvent").a("AURA/core").b());
                return;
            }
            JSONObject jSONObject = c.getJSONObject("message");
            if (jSONObject == null) {
                arc.a().b("innerHandleEvent:message is null", arc.a.a().b("AURAWeex2FireEvent").a("AURA/core").b());
            } else {
                a2.m().fireEvent(1, c.getString(KEY_MESSAGE_ACTION), jSONObject);
            }
        }
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f25730a = (baf) aURAGlobalData.get("auraWeex2InstanceManager", baf.class);
    }
}
