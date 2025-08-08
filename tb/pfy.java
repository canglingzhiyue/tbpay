package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class pfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-950698117);
    }

    public static List<LiveItem.TimeMovingLabelInfos> a(String str) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        List<LiveItem.TimeMovingLabelInfos> list = null;
        if (!StringUtils.isEmpty(str) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) JSON.parseObject(str, LiveItem.TimeMovingPlayInfo.class)) != null) {
            if (timeMovingPlayInfo.spfPlayVideo != null) {
                list = timeMovingPlayInfo.spfPlayVideo.timeMovingLabelInfos;
            } else if (timeMovingPlayInfo.timeMovingLabelInfos != null) {
                list = timeMovingPlayInfo.timeMovingLabelInfos;
            }
        }
        return list == null ? new ArrayList() : list;
    }

    public static LiveItem.TimeMovingPlayInfo a(LiveTimemovingModel liveTimemovingModel) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveItem.TimeMovingPlayInfo) ipChange.ipc$dispatch("8744c0a8", new Object[]{liveTimemovingModel});
        }
        if (liveTimemovingModel != null && liveTimemovingModel.extendVal != null && !StringUtils.isEmpty(liveTimemovingModel.extendVal.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) JSON.parseObject(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
            return timeMovingPlayInfo;
        }
        return null;
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("model")) != null && (jSONArray = jSONObject2.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject("extendVal")) != null) {
                    String string = jSONObject3.getString("secKillInfo");
                    if (!StringUtils.isEmpty(string)) {
                        jSONObject3.put("secKillInfo", (Object) JSONObject.parseObject(string));
                    }
                }
            }
        }
    }
}
