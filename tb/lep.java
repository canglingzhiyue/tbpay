package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Map;

/* loaded from: classes.dex */
public class lep extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HPAGECHANGEEXPOSE = -5738105571919564880L;

    static {
        kge.a(-1675716742);
    }

    public static /* synthetic */ Object ipc$super(lep lepVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(lep lepVar, int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b40714f", new Object[]{lepVar, new Integer(i), objArr}) : lepVar.a(i, objArr);
    }

    public static /* synthetic */ void a(lep lepVar, BaseSectionModel baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720d0de7", new Object[]{lepVar, baseSectionModel, jSONObject});
        } else {
            lepVar.a(baseSectionModel, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || !(objArr[0] instanceof JSONObject)) {
            ldf.d("DXHPageChangeExposeEventHandler", "args == null");
        } else {
            int a2 = a(dXEvent, dXRuntimeContext);
            if (a2 == -1) {
                ldf.d("DXHPageChangeExposeEventHandler", "pageIndex is -1");
                return;
            }
            a(dXRuntimeContext, a2, objArr);
            a(dXEvent, objArr, dXRuntimeContext, a2);
        }
    }

    private void a(final DXRuntimeContext dXRuntimeContext, final int i, final Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9988aaa7", new Object[]{this, dXRuntimeContext, new Integer(i), objArr});
        } else {
            ljd.a().d(new Runnable() { // from class: tb.lep.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
                    if (b == null) {
                        ldf.d("DXHPageChangeExposeEventHandler", "sectionModel is null");
                        return;
                    }
                    JSONObject a2 = lep.a(lep.this, i, objArr);
                    if (a2 == null) {
                        ldf.d("DXHPageChangeExposeEventHandler", "pageSection is null");
                        return;
                    }
                    ljh.a((BaseSectionModel<?>) b.createBaseSectionModel(a2), (JSONObject) null);
                    lep.a(lep.this, b, a2);
                }
            });
        }
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0ea70b", new Object[]{this, dXEvent, objArr, dXRuntimeContext, new Integer(i)});
        } else if (objArr.length <= 1 || !(objArr[1] instanceof String)) {
        } else {
            new ler().handleEvent(dXEvent, new Object[]{String.valueOf(objArr[1]), a(i)}, dXRuntimeContext);
        }
    }

    private JSONObject a(int i, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8794b6d6", new Object[]{this, new Integer(i), objArr}) : ((JSONObject) objArr[0]).getJSONObject(a(i));
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        try {
            return String.valueOf(i);
        } catch (Exception e) {
            ldf.d("DXHPageChangeExposeEventHandler", "index parse error: " + e);
            return null;
        }
    }

    private int a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24d3ed0e", new Object[]{this, dXEvent, dXRuntimeContext})).intValue();
        }
        if (dXEvent instanceof DXPageChangeEvent) {
            return ((DXPageChangeEvent) dXEvent).pageIndex;
        }
        if (!(dXRuntimeContext.d() instanceof DXSliderLayout)) {
            return -1;
        }
        return ((DXSliderLayout) dXRuntimeContext.d()).getPageIndex();
    }

    private void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22760340", new Object[]{this, baseSectionModel, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            ldf.d("DXHPageChangeExposeEventHandler", "independentExpose, itemList is empty");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            ljh.a((BaseSectionModel<?>) baseSectionModel.createBaseSectionModel((JSONObject) entry.getValue()), (JSONObject) null);
        }
    }
}
