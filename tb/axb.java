package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class axb extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEAURAVIDEOLIFECYCLE = -3234487430211822540L;

    static {
        kge.a(-436948056);
    }

    public static /* synthetic */ Object ipc$super(axb axbVar, String str, Object... objArr) {
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
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXEvent == null || dXRuntimeContext == null) {
            arc.a().b("DXHandleAURAVideoLifecycleEventHandler.handleEvent:event or runtimeContext is null");
        } else {
            Map<String, f> args = dXEvent.getArgs();
            if (args == null) {
                arc.a().b("DXHandleAURAVideoLifecycleEventHandler.handleEvent:eventArgs is null");
                return;
            }
            f fVar = args.get("action");
            if (fVar == null || !fVar.k()) {
                arc.a().b("DXHandleAURAVideoLifecycleEventHandler.handleEvent:action is invalid");
                return;
            }
            f fVar2 = args.get("videoPlayer");
            if (fVar2 == null || !(fVar2.j() instanceof awz)) {
                arc.a().b("DXHandleAURAVideoLifecycleEventHandler.handleEvent:videoPlayer is invalid");
                return;
            }
            awz awzVar = (awz) fVar2.j();
            if (!(dXRuntimeContext.a() instanceof art)) {
                arc.a().b("DXHandleAURAVideoLifecycleEventHandler.handleEvent:getDxUserContext is invalid");
                return;
            }
            List<axc> b = ((art) dXRuntimeContext.a()).c.b(axc.class);
            String i2 = fVar.i();
            char c = 65535;
            switch (i2.hashCode()) {
                case -2124458952:
                    if (i2.equals("onComplete")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1779618840:
                    if (i2.equals("onProgressChanged")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1349867671:
                    if (i2.equals("onError")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1340212393:
                    if (i2.equals("onPause")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1013260401:
                    if (i2.equals("onInit")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1013054029:
                    if (i2.equals("onPlay")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                for (axc axcVar : b) {
                    axcVar.a(awzVar, objArr, dXRuntimeContext);
                }
            } else if (c == 1) {
                for (axc axcVar2 : b) {
                    axcVar2.b(awzVar, objArr, dXRuntimeContext);
                }
            } else if (c == 2) {
                for (axc axcVar3 : b) {
                    axcVar3.c(awzVar, objArr, dXRuntimeContext);
                }
            } else if (c == 3) {
                f fVar3 = args.get("errorCode");
                if (fVar3 != null && fVar3.v()) {
                    i = (int) fVar3.w();
                }
                for (axc axcVar4 : b) {
                    axcVar4.a(awzVar, i, objArr, dXRuntimeContext);
                }
            } else if (c == 4) {
                for (axc axcVar5 : b) {
                    axcVar5.d(awzVar, objArr, dXRuntimeContext);
                }
            } else if (c == 5) {
                f fVar4 = args.get("playedTime");
                if (fVar4 != null && fVar4.v()) {
                    fVar4.w();
                }
                f fVar5 = args.get("totalTime");
                if (fVar5 != null && fVar5.v()) {
                    fVar5.w();
                }
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
