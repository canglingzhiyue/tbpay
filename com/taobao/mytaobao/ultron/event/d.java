package com.taobao.mytaobao.ultron.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import tb.gbg;
import tb.kge;
import tb.mww;
import tb.mxb;

/* loaded from: classes7.dex */
public class d extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTB_SCROLL_EXPOSE = -5425425327223746891L;

    /* renamed from: a  reason: collision with root package name */
    private float f18509a = 0.5f;

    static {
        kge.a(-470134438);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 3 && (objArr[0] instanceof String) && (objArr[1] instanceof String) && (objArr[2] instanceof JSONArray)) {
            try {
                int parseInt = Integer.parseInt((String) objArr[0]);
                String str = (String) objArr[1];
                JSONArray jSONArray = (JSONArray) objArr[2];
                String str2 = objArr.length > 3 ? (String) objArr[3] : "0";
                if (dXRuntimeContext == null || parseInt <= 0 || jSONArray == null || jSONArray.size() <= 0 || TextUtils.isEmpty(str)) {
                    return;
                }
                float b = gbg.b(dXRuntimeContext.m(), Float.valueOf(str).floatValue());
                float b2 = gbg.b(dXRuntimeContext.m(), Float.valueOf(str2).floatValue());
                if (!(dXEvent instanceof DXScrollEvent)) {
                    return;
                }
                float offsetX = ((DXScrollEvent) dXEvent).getOffsetX() - b2;
                int i = (int) (this.f18509a * b);
                if (offsetX <= i) {
                    return;
                }
                int i2 = (int) (offsetX / b);
                if (((int) (offsetX % b)) > i) {
                    i2++;
                }
                for (int i3 = 0; i3 < parseInt * i2; i3++) {
                    if (i3 < jSONArray.size() && jSONArray.getJSONObject(i3) != null && !jSONArray.getJSONObject(i3).getBooleanValue("hasExpose")) {
                        jSONArray.getJSONObject(i3).put("hasExpose", (Object) true);
                        mxb.b(mww.a(null, jSONArray.getJSONObject(i3)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
