package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.a;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import com.taobao.ju.track.server.JTrackParams;
import java.util.Map;

/* loaded from: classes5.dex */
public class syu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIS_APPEAR = "disappear";
    public static final String OPEN_URL = "open_url";
    public static final String USER_TRACK = "user_track";
    public static final String UT_EXPOSURE = "ut_exposure";

    static {
        kge.a(1893752314);
    }

    public static a a(ActionModel actionModel, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6f2404e2", new Object[]{actionModel, jSONObject});
        }
        if (actionModel == null || TextUtils.isEmpty(actionModel.type)) {
            return null;
        }
        String str = actionModel.type;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -504306182) {
            if (hashCode != 1348838055) {
                if (hashCode == 1935670231 && str.equals("user_track")) {
                    c = 2;
                }
            } else if (str.equals("ut_exposure")) {
                c = 1;
            }
        } else if (str.equals("open_url")) {
            c = 0;
        }
        if (c == 0) {
            return new h(actionModel.type, actionModel.params, new RuntimeAbilityParam("appendURLParamsOnly", true));
        }
        if (c == 1) {
            return new h(actionModel.type, actionModel.params, new RuntimeAbilityParam[0]);
        }
        if (c != 2) {
            return null;
        }
        if (jSONObject != null && actionModel.params != null && (jSONObject2 = actionModel.params.getJSONObject(JTrackParams.TRACK_PARAMS)) != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(syx.a(jSONObject, entry.getValue()));
            }
        }
        return new h(actionModel.type, actionModel.params, new RuntimeAbilityParam[0]);
    }
}
