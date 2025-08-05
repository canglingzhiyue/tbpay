package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleConversationBaseInfoTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(813671279);
        kge.a(1437606424);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        SimpleConversation simpleConversation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        SimpleProfile simpleProfile = (SimpleProfile) sharedState.getProp("targetProfile", SimpleProfile.class, null);
        String displayName = simpleProfile != null ? simpleProfile.getDisplayName() : "";
        if (TextUtils.isEmpty(displayName) && (simpleConversation = (SimpleConversation) sharedState.getProp("conversation", SimpleConversation.class, null)) != null) {
            displayName = simpleConversation.getConversationContent().getConversationName();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SimpleProfile.KEY_DISPLAYNAME, (Object) displayName);
        HashMap hashMap = new HashMap();
        hashMap.put("conversationDisplayInfo", jSONObject);
        return sharedState.updateRuntimeData(hashMap);
    }
}
