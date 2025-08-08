package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.homepage.utils.c;

/* loaded from: classes.dex */
public class kvd extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETREQBIZPARAM = 9068808819005234401L;

    /* renamed from: a  reason: collision with root package name */
    private final String f30335a = "DXHSetReqBizParamEventHandler";
    private final int b = 3;

    static {
        kge.a(764796120);
    }

    public static /* synthetic */ Object ipc$super(kvd kvdVar, String str, Object... objArr) {
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
        } else if (objArr == null || objArr.length < 3) {
        } else {
            try {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                ksp.c("DXHSetReqBizParamEventHandler", "handleEvent containerId : " + str + ",key : " + str2 + ",value : " + str3);
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                    c.a(str, str2, str3);
                }
            } catch (Throwable th) {
                ksp.c("DXHSetReqBizParamEventHandler", "handleEvent error : " + th.getMessage());
            }
        }
    }
}
