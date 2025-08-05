package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionActionType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "alidetail.impl.motion.userTrack.args")
/* loaded from: classes4.dex */
public final class ely implements axy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1817774924);
        kge.a(-29106604);
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
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

    public ely() {
        emu.a("com.taobao.android.detail.core.standard.userMotion.AliDetailUserMotionUTArgsExtension");
    }

    @Override // tb.axy
    public Map<String, String> a(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4924304", new Object[]{this, ayaVar});
        }
        HashMap hashMap = new HashMap();
        if (!b(ayaVar)) {
            return hashMap;
        }
        if (a(ayaVar.f25682a, "image")) {
            a(ayaVar.f25682a, hashMap);
        } else if (a(ayaVar.f25682a, "video")) {
            b(ayaVar.f25682a, hashMap);
        }
        return hashMap;
    }

    private boolean b(aya ayaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf743d94", new Object[]{this, ayaVar})).booleanValue();
        }
        if (ayaVar == null || !TextUtils.equals(String.valueOf(ayaVar.c), "19997")) {
            return false;
        }
        return TextUtils.equals(ayaVar.e, UserMotionActionType.COMPONENT_APPEAR) || TextUtils.equals(ayaVar.e, UserMotionActionType.COMPONENT_CLICK) || TextUtils.equals(ayaVar.e, UserMotionActionType.COMPONENT_DISAPPEAR) || TextUtils.equals(ayaVar.e, UserMotionActionType.COMPONENT_SCROLL);
    }

    private boolean a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a501ee1", new Object[]{this, aURARenderComponent, str})).booleanValue();
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && !TextUtils.isEmpty(str)) {
            Object obj = aURARenderComponent.data.fields.get("type");
            if ((obj instanceof String) && TextUtils.equals((String) obj, str)) {
                return true;
            }
        }
        return false;
    }

    private void a(AURARenderComponent aURARenderComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c823752", new Object[]{this, aURARenderComponent, map});
        } else if (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.fields == null || map == null) {
        } else {
            Object obj = aURARenderComponent.data.fields.get("url");
            if (!(obj instanceof String)) {
                return;
            }
            map.put("motionUrl", (String) obj);
        }
    }

    private void b(AURARenderComponent aURARenderComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3fe1113", new Object[]{this, aURARenderComponent, map});
        } else if (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.fields == null || map == null) {
        } else {
            Map<String, Object> map2 = aURARenderComponent.data.fields;
            Object obj = map2.get("videoId");
            if (obj instanceof String) {
                map.put("motionVideoId", (String) obj);
            }
            Object obj2 = map2.get("thumbnailUrl");
            if (!(obj2 instanceof String)) {
                return;
            }
            map.put("motionVideoThumbnailUrl", (String) obj2);
        }
    }
}
