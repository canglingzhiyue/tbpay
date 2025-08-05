package com.alibaba.android.aura.taobao.adapter.extension.performance;

import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import java.util.HashMap;
import java.util.List;
import tb.art;
import tb.azl;
import tb.bbe;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID = -489609274268614298L;

    static {
        kge.a(-288942713);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        art artVar = (art) dXRuntimeContext.a();
        if (artVar == null) {
            return;
        }
        bbe.a("图片加载完成， " + ((DXImageWidgetNode.ImageLoadCompleteEvent) dXEvent).getImageUrl(), null);
        AURATraceUtil.b(1, "aura-image-complete");
        List<azl> b = artVar.c().b(azl.class);
        HashMap hashMap = new HashMap();
        hashMap.put("imageLoaderEndTime", "" + currentTimeMillis);
        for (azl azlVar : b) {
            azlVar.a(hashMap);
        }
        a(artVar, currentTimeMillis);
    }

    private void a(art artVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("324ff3cf", new Object[]{this, artVar, new Long(j)});
            return;
        }
        try {
            artVar.g().update("imageLoaderEndTime", Long.valueOf(j));
        } catch (Throwable unused) {
        }
    }
}
