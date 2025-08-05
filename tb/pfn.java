package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowResponseData;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.movehighlight.utils.e;
import com.taobao.taolive.movehighlight.utils.f;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class pfn implements ibq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32597a;
    private DXRootView b;
    private a c;
    private TBLiveDataModel d;

    static {
        kge.a(-1426491917);
        kge.a(-1580083194);
    }

    public static /* synthetic */ JSONObject a(pfn pfnVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("11db1383", new Object[]{pfnVar, new Integer(i)}) : pfnVar.c(i);
    }

    public static /* synthetic */ JSONObject a(pfn pfnVar, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("38c632f9", new Object[]{pfnVar, str, new Integer(i)}) : pfnVar.a(str, i);
    }

    public static /* synthetic */ JSONObject b(pfn pfnVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cb52a122", new Object[]{pfnVar, new Integer(i)}) : pfnVar.d(i);
    }

    public pfn(Context context, DXRootView dXRootView, a aVar, TBLiveDataModel tBLiveDataModel) {
        this.f32597a = context;
        this.b = dXRootView;
        this.c = aVar;
        this.d = tBLiveDataModel;
    }

    @Override // tb.ibq
    public void a(LiveTimemovingModel liveTimemovingModel, int i, DXRuntimeContext dXRuntimeContext) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6017a50", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        } else if (liveTimemovingModel == null) {
        } else {
            if (liveTimemovingModel.extendVal != null && !TextUtils.isEmpty(liveTimemovingModel.extendVal.timeMovingPlayInfo) && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null) {
                HashMap<String, String> a2 = pfk.a(timeMovingPlayInfo, liveTimemovingModel.extendVal.playUrl, this.c);
                f.a().a(System.currentTimeMillis());
                f.a().a(f.e);
                d.a(a2, this.f32597a, this.c);
                e.a(this.c, this.d, liveTimemovingModel);
            }
            b(liveTimemovingModel, i, dXRuntimeContext);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", liveTimemovingModel.itemId);
            hashMap.put("timemove_item_type", (liveTimemovingModel.extendVal == null || liveTimemovingModel.extendVal.secKillInfo == null) ? "1" : "2");
            o.a(this.c, "timeshiftlayer-toitem", (Map<String, String>) hashMap);
        }
    }

    public HighlightRowResponseData a() {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighlightRowResponseData) ipChange.ipc$dispatch("bf6bb8c3", new Object[]{this});
        }
        DXRootView dXRootView = this.b;
        if (dXRootView != null && (data = dXRootView.getData()) != null) {
            return (HighlightRowResponseData) JSONObject.parseObject(data.toJSONString(), HighlightRowResponseData.class);
        }
        return null;
    }

    public List<LiveTimemovingModel> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        HighlightRowResponseData a2 = a();
        if (a2 != null && a2.model != null) {
            return a2.model.timeMovingList;
        }
        return null;
    }

    public void b(LiveTimemovingModel liveTimemovingModel, final int i, final DXRuntimeContext dXRuntimeContext) {
        final DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c06a51", new Object[]{this, liveTimemovingModel, new Integer(i), dXRuntimeContext});
        } else if (liveTimemovingModel == null || dXRuntimeContext == null || i == -1 || dXRuntimeContext.C() == null || (b = dXRuntimeContext.C().b()) == null || dXRuntimeContext.s() == null) {
        } else {
            if (liveTimemovingModel.extendVal != null && liveTimemovingModel.extendVal.timeMovingPlayInfo != null) {
                b(liveTimemovingModel.extendVal.timeMovingPlayInfo);
            }
            a(liveTimemovingModel.itemId, i, dXRuntimeContext, b);
            dXRuntimeContext.s().post(new Runnable() { // from class: tb.pfn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(dXRuntimeContext.s(), (Object) pfn.a(pfn.this, i));
                    }
                }
            });
            a(liveTimemovingModel);
        }
    }

    @Override // tb.ibq
    public void a(String str, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aaa423", new Object[]{this, str, dXRuntimeContext});
            return;
        }
        final int a2 = a(str, (String) null);
        if (a2 == -1 || dXRuntimeContext == null || dXRuntimeContext.C() == null) {
            return;
        }
        final DinamicXEngine b = dXRuntimeContext.C().b();
        dXRuntimeContext.s().post(new Runnable() { // from class: tb.pfn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(dXRuntimeContext.s(), (Object) pfn.b(pfn.this, a2));
                }
            }
        });
    }

    public void a(final int i) {
        final DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXRootView dXRootView = this.b;
        if (dXRootView == null || dXRootView.getExpandWidgetNode() == null || (dXRuntimeContext = this.b.getExpandWidgetNode().getDXRuntimeContext()) == null || dXRuntimeContext.C() == null) {
            return;
        }
        final DinamicXEngine b = dXRuntimeContext.C().b();
        if (dXRuntimeContext.s() == null) {
            return;
        }
        dXRuntimeContext.s().post(new Runnable() { // from class: tb.pfn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(dXRuntimeContext.s(), (Object) pfn.a(pfn.this, i));
                }
            }
        });
    }

    public void a(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4c8664", new Object[]{this, liveTimemovingModel});
            return;
        }
        c(liveTimemovingModel);
        b(liveTimemovingModel);
        if (pfa.a(this.c).b() == null) {
            return;
        }
        pfa.a(this.c).b().a(this.c, this.f32597a);
    }

    private void c(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7af5aa2", new Object[]{this, liveTimemovingModel});
            return;
        }
        pfb a2 = pfb.a(this.c);
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
        if (a2.h() == null) {
            return;
        }
        a2.h().a(timeMovingPlayInfo);
    }

    private void b(String str) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(str, LiveItem.TimeMovingPlayInfo.class);
        DXRootView dXRootView = this.b;
        if (dXRootView == null || dXRootView.getExpandWidgetNode() == null || timeMovingPlayInfo == null || (data = this.b.getData()) == null) {
            return;
        }
        data.put("itemIsSpeaking", (Object) Boolean.valueOf(timeMovingPlayInfo.isSpeaking));
        if (pfy.a(JSONObject.toJSONString(timeMovingPlayInfo)).size() != 0) {
            z = false;
        }
        data.put("hideStructList", (Object) Boolean.valueOf(z));
    }

    @Override // tb.ibq
    public void a(String str, Map<String, String> map, final DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437d5b44", new Object[]{this, str, map, dXRuntimeContext});
            return;
        }
        final int a2 = a(str, (String) null);
        if (a2 == -1 || dXRuntimeContext == null || dXRuntimeContext.C() == null) {
            return;
        }
        JSONObject data = this.b.getData();
        if (data != null && (jSONObject = data.getJSONObject("model")) != null && (jSONArray = jSONObject.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0 && (jSONObject2 = (JSONObject) jSONArray.get(a2)) != null && (jSONObject3 = jSONObject2.getJSONObject("personalityData")) != null) {
            jSONObject3.putAll(map);
        }
        final DinamicXEngine b = dXRuntimeContext.C().b();
        dXRuntimeContext.s().post(new Runnable() { // from class: tb.pfn.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a(dXRuntimeContext.s(), (Object) pfn.b(pfn.this, a2));
                }
            }
        });
    }

    public void b(LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fdf083", new Object[]{this, liveTimemovingModel});
        } else if (liveTimemovingModel == null || liveTimemovingModel.extendVal == null || TextUtils.isEmpty(liveTimemovingModel.extendVal.timeMovingPlayInfo)) {
        } else {
            d.c = liveTimemovingModel.itemId;
            LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class);
            if (timeMovingPlayInfo == null) {
                return;
            }
            poy.g(timeMovingPlayInfo.timeMovingId, this.c);
            if (!d.f21479a) {
                return;
            }
            poz.T(timeMovingPlayInfo.timeMovingId, n.b(this.c));
        }
    }

    public void b(int i) {
        List<LiveTimemovingModel> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i < 0 || (b = b()) == null) {
        } else {
            LiveTimemovingModel liveTimemovingModel = b.get(i);
            DXRootView dXRootView = this.b;
            if (dXRootView == null || dXRootView.getExpandWidgetNode() == null) {
                return;
            }
            b(liveTimemovingModel, i, this.b.getExpandWidgetNode().getDXRuntimeContext());
        }
    }

    private void a(final String str, final int i, final DXRuntimeContext dXRuntimeContext, final DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460e8f3", new Object[]{this, str, new Integer(i), dXRuntimeContext, dinamicXEngine});
        } else {
            dXRuntimeContext.s().post(new Runnable() { // from class: tb.pfn.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dinamicXEngine.a(dXRuntimeContext.s(), (Object) pfn.a(pfn.this, str, i));
                    }
                }
            });
        }
    }

    private JSONObject a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52c1d431", new Object[]{this, str, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) str);
        jSONObject2.put("subDataIndex", (Object) Integer.valueOf(i));
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_change_selected_data);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    private JSONObject c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b1984bf9", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) Integer.valueOf(i));
        jSONObject2.put("targetId", (Object) "loadMoreWidget");
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_scroll_refreshData);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    private JSONObject d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12eae898", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "General");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("subDataIndex", (Object) Integer.valueOf(i));
        jSONObject2.put("method", (Object) DXHighlightScrollableLayoutWidgetNode.MSG_METHOD_UPDATE_SELETED_DATA);
        jSONObject.put("params", (Object) jSONObject2);
        return jSONObject;
    }

    public void a(String str) {
        DXRuntimeContext dXRuntimeContext;
        DinamicXEngine b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        DXRootView dXRootView = this.b;
        if (dXRootView == null || dXRootView.getExpandWidgetNode() == null || (dXRuntimeContext = this.b.getExpandWidgetNode().getDXRuntimeContext()) == null || dXRuntimeContext.C() == null || (b = dXRuntimeContext.C().b()) == null) {
            return;
        }
        b.a(this.b, (Object) c(str));
    }

    private JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{this, str});
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

    public int a(String str, String str2) {
        List<LiveTimemovingModel> b;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) && (b = b()) != null) {
            if (!TextUtils.isEmpty(str)) {
                while (i < b.size()) {
                    if (str.equals(b.get(i).itemId)) {
                        return i;
                    }
                    i++;
                }
            } else if (!TextUtils.isEmpty(str2)) {
                while (i < b.size()) {
                    LiveTimemovingModel liveTimemovingModel = b.get(i);
                    if (liveTimemovingModel.extendVal != null && liveTimemovingModel.extendVal.timeMovingPlayInfo != null && (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveTimemovingModel.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) != null && str2.equals(timeMovingPlayInfo.timeMovingId)) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }
}
