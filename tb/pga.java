package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowResponseData;
import com.taobao.taolive.movehighlight.utils.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pga extends sig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HIGHLIGHTTRACKUTILS = -5783209636750125903L;

    static {
        kge.a(-548568810);
    }

    @Override // tb.sig
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, a aVar) {
        LiveTimemovingModel liveTimemovingModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624b20cd", new Object[]{this, dXEvent, objArr, dXRuntimeContext, aVar});
            return;
        }
        JSONObject data = dXRuntimeContext.s().getData();
        HashMap hashMap = null;
        HighlightRowResponseData highlightRowResponseData = data != null ? (HighlightRowResponseData) JSON.parseObject(JSONObject.toJSONString(data), HighlightRowResponseData.class) : null;
        try {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            if (objArr[2] != null && !TextUtils.isEmpty(String.valueOf(objArr[2]))) {
                hashMap = (HashMap) JSON.parseObject(String.valueOf(objArr[2]), HashMap.class);
            }
            if ("trackBtnWithExtras".equals(valueOf)) {
                o.a(aVar, valueOf2, (Map<String, String>) hashMap);
            } else if ("trackShow".equals(valueOf)) {
                o.a(aVar, valueOf2, (HashMap<String, String>) hashMap);
            } else if ("trackCustom".equals(valueOf)) {
                o.a(aVar, 19999, valueOf2, hashMap);
            } else if (!"ChatViewTrackShow".equals(valueOf) || highlightRowResponseData == null || highlightRowResponseData.model == null || highlightRowResponseData.model.timeMovingList == null || (liveTimemovingModel = highlightRowResponseData.model.timeMovingList.get(highlightRowResponseData.selectedItemIndex)) == null) {
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("item_id", liveTimemovingModel.itemId);
                hashMap2.put("assess_type", liveTimemovingModel.commentsList != null ? "1" : "0");
                o.a(aVar, valueOf2, (HashMap<String, String>) hashMap2);
            }
        } catch (Exception unused) {
        }
    }
}
