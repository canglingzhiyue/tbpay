package com.taobao.mytaobao.ultron.event;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.gbg;
import tb.kge;
import tb.mww;
import tb.mxb;
import tb.mxj;

/* loaded from: classes7.dex */
public class s extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTB_TOOLSSCROLLEXPOSE = -4027356617499343157L;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18518a = mxj.a("enableToolsScrollExpose", true);

    static {
        kge.a(-351195901);
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    private int a(Context context, Object obj) throws Exception {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1434fc2f", new Object[]{this, context, obj})).intValue();
        }
        if (obj instanceof Number) {
            parseInt = ((Number) obj).intValue();
        } else {
            parseInt = Integer.parseInt(obj.toString());
        }
        return gbg.b(context, parseInt);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_MyTaobao", 19999, "Page_MyTaobao_toolbar_scroll", "", "", new HashMap()).build());
        if (!this.f18518a || objArr == null || objArr.length < 4 || !(dXEvent instanceof DXScrollEvent)) {
            return;
        }
        try {
            if (!(objArr[3] instanceof JSONArray)) {
                return;
            }
            JSONArray jSONArray = (JSONArray) objArr[3];
            if (jSONArray.size() == 0) {
                return;
            }
            int a2 = a(dXRuntimeContext.m(), objArr[0]);
            int a3 = a(dXRuntimeContext.m(), objArr[1]);
            int a4 = a(dXRuntimeContext.m(), objArr[2]);
            DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
            int offsetX = dXScrollEvent.getOffsetX();
            int min = Math.min(dXScrollEvent.getOffsetX() + dXScrollEvent.getScrollerSize().f11827a, dXScrollEvent.getContentSize().f11827a);
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (!jSONObject3.getBooleanValue("hasExpose") && (jSONObject = jSONObject3.getJSONObject("fields")) != null && (jSONObject2 = jSONObject.getJSONObject("args")) != null && (integer = jSONObject2.getInteger("itemIndex")) != null) {
                    double intValue = (integer.intValue() * (a4 + a3)) + a2 + (a4 * 0.5d);
                    if (offsetX < intValue && intValue < min) {
                        mxb.b(mww.a(null, jSONObject3));
                        jSONObject3.put("hasExpose", (Object) true);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
