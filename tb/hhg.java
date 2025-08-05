package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class hhg extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVEROOMACTION = 1866926914385279377L;

    /* renamed from: a  reason: collision with root package name */
    private long f28646a;

    static {
        kge.a(253817924);
    }

    public static /* synthetic */ Object ipc$super(hhg hhgVar, String str, Object... objArr) {
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

    /* JADX WARN: Code restructure failed: missing block: B:280:0x05dd, code lost:
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().b(r34 == null ? null : r34.C(), r0) != false) goto L265;
     */
    @Override // tb.iot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.android.dinamicx.expression.event.DXEvent r31, java.lang.Object[] r32, com.taobao.android.dinamicx.DXRuntimeContext r33, final com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c r34) {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hhg.a(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c):void");
    }

    private void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            if (objArr.length >= 4 && (objArr[3] instanceof JSONObject)) {
                for (Map.Entry<String, Object> entry : ((JSONObject) objArr[3]).entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue() + "");
                }
            }
            if (objArr.length < 3 || !(objArr[2] instanceof String)) {
                return;
            }
            a.a().j().a((String) objArr[2], hashMap);
        } catch (Throwable th) {
            q.b("DXTbliveRoomActionEventHandler", th.getMessage());
        }
    }
}
