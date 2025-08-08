package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import java.util.List;

/* loaded from: classes8.dex */
public class pfz extends sig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE = 3022236499765514152L;

    static {
        kge.a(1253089201);
    }

    public static /* synthetic */ Object ipc$super(pfz pfzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(pfz pfzVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("be54cb5c", new Object[]{pfzVar, jSONArray}) : pfzVar.a(jSONArray);
    }

    public static /* synthetic */ JSONObject a(pfz pfzVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("493246fe", new Object[]{pfzVar, str}) : pfzVar.a(str);
    }

    public static /* synthetic */ void a(pfz pfzVar, JSONArray jSONArray, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4864a52d", new Object[]{pfzVar, jSONArray, list});
        } else {
            pfzVar.a(jSONArray, list);
        }
    }

    @Override // tb.sig
    public void a(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624b20cd", new Object[]{this, dXEvent, objArr, dXRuntimeContext, aVar});
            return;
        }
        Log.e("shuiyu", "收到回调" + dXEvent.getClass() + " args " + JSON.toJSONString(objArr));
        final DinamicXEngine b = dXRuntimeContext.C().b();
        pfg e = pfb.a(aVar).e();
        if (e == null || e.a() == null) {
            return;
        }
        e.a().a(new a.b() { // from class: tb.pfz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.a.b
            public void a(JSONObject jSONObject) {
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("model")) == null) {
                } else {
                    pfy.a(jSONObject);
                    JSONArray jSONArray = jSONObject2.getJSONArray("timeMovingList");
                    if (jSONArray.size() > 0) {
                        pfz pfzVar = pfz.this;
                        pfz.a(pfzVar, jSONArray, pfzVar.a(dXRuntimeContext));
                        b.a(dXRuntimeContext.s(), (Object) pfz.a(pfz.this, jSONArray));
                        if (jSONArray.size() > 0) {
                            b.a(dXRuntimeContext.s(), (Object) pfz.a(pfz.this, DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_END_STRING));
                            return;
                        }
                    }
                    b.a(dXRuntimeContext.s(), (Object) pfz.a(pfz.this, DXHighlightScrollableLayoutWidgetNode.LOAD_MORE_NO_DATA_STRING));
                }
            }
        });
    }

    private void a(JSONArray jSONArray, List<LiveTimemovingModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38301281", new Object[]{this, jSONArray, list});
        } else if (jSONArray != null && jSONArray.size() > 0 && list != null && list.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !StringUtils.isEmpty(jSONObject.getString("itemId"))) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (jSONObject.getString("itemId").equals(list.get(i2).itemId)) {
                            jSONArray.mo1572remove(i);
                        }
                    }
                }
            }
        }
    }

    public List<LiveTimemovingModel> a(DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        List<LiveTimemovingModel> parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2c96f4e", new Object[]{this, dXRuntimeContext});
        }
        JSONObject data = dXRuntimeContext.s().getData();
        if (data.getJSONObject("model") != null && (jSONArray = data.getJSONObject("model").getJSONArray("timeMovingList")) != null && jSONArray.size() > 0 && (parseArray = JSON.parseArray(jSONArray.toJSONString(), LiveTimemovingModel.class)) != null && parseArray.size() > 0) {
            return parseArray;
        }
        return null;
    }

    private JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("data", (Object) jSONArray);
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_appendData);
        return jSONObject;
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("params", (Object) jSONObject2);
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_updateLoadMoreStatus);
        jSONObject2.put("status", (Object) str);
        return jSONObject;
    }
}
