package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class pky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-828234508);
    }

    public void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
        } else if (!ply.L() || chatMessage.mExtraParams == null) {
        } else {
            try {
                JSONObject jSONObject = (JSONObject) chatMessage.mExtraParams.get("ext");
                if (jSONObject.get(aw.PARAM_CHAT_RENDERS_ENHANCE) == null) {
                    return;
                }
                String str = (String) jSONObject.get(aw.PARAM_CHAT_RENDERS_ENHANCE);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (chatMessage.renders == null) {
                    chatMessage.renders = new HashMap<>();
                }
                chatMessage.renders.put(aw.PARAM_CHAT_RENDERS_ENHANCE, str);
                if (jSONObject.get("backgroundStyle") != null) {
                    chatMessage.renders.put("backgroundStyle", ((JSONObject) jSONObject.get("backgroundStyle")).toString());
                }
                if (jSONObject.get("content") == null) {
                    return;
                }
                chatMessage.mContent = jSONObject.getString("content");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
