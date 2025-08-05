package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.i;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* loaded from: classes7.dex */
public class sdk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INFOFLOWCARDWIDTH = -8936854687533104177L;

    /* renamed from: a  reason: collision with root package name */
    private IDynamicLayoutService f33494a;
    private final boolean b;

    static {
        kge.a(-83706497);
    }

    public static /* synthetic */ Object ipc$super(sdk sdkVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public sdk() {
        this.b = lcz.a() != null && (l.b(lcz.a()) || l.d(lcz.a()));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.D() == null) {
            return Integer.valueOf(gbg.b(lcz.a(), 171.0f));
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            return Integer.valueOf(gbg.b(lcz.a(), 171.0f));
        }
        if (!this.b && !b(a2)) {
            return Integer.valueOf(gbg.b(lcz.a(), 171.0f));
        }
        DinamicXEngine D = dXRuntimeContext.D();
        Context m = dXRuntimeContext.m();
        BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
        int a3 = b != null ? gbg.a(D, m, b.getExt().getIntValue("marginSide") / 2) : 0;
        int a4 = gbg.a(D, m, a(a2) / 2);
        if (a4 <= 0) {
            return Integer.valueOf(gbg.b(lcz.a(), 171.0f));
        }
        int a5 = sdl.a(D, a3);
        if (a5 != sdl.f33495a) {
            return Integer.valueOf(a5);
        }
        int a6 = a(a2, m);
        if (a6 <= 0) {
            ldf.d("DXDataParserInfoFlowCardWidth", "column less zero");
            return Integer.valueOf(gbg.a(D, m, 171.0f));
        }
        int a7 = a(m, a2);
        int round = Math.round(((a7 - (a3 << 1)) - ((a6 - 1) * a4)) / a6);
        sdl.a(D, a3, round);
        ldf.d("DXDataParserInfoFlowCardWidth", "info flow card width: " + round + " screenWidth: " + a7 + " marginSide: " + a3 + " column: " + a6 + " space: " + a4);
        return Integer.valueOf(Math.max(round, 0));
    }

    private int a(ljs ljsVar, Context context) {
        IFoldDeviceAndPadService iFoldDeviceAndPadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72f5b118", new Object[]{this, ljsVar, context})).intValue();
        }
        if (!this.b || (iFoldDeviceAndPadService = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class)) == null) {
            return 2;
        }
        return iFoldDeviceAndPadService.getInfoFlowAdaptiveColumn(context);
    }

    private int a(ljs ljsVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2eb53f6", new Object[]{this, ljsVar})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (ext = base.getExt()) == null) {
            return 0;
        }
        try {
            return ext.getIntValue("cardSpace");
        } catch (Exception unused) {
            return 0;
        }
    }

    private int a(Context context, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8500d3ee", new Object[]{this, context, ljsVar})).intValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed()) {
                activity = c(ljsVar);
            }
            if (activity == null) {
                return h.a().a(context);
            }
            return i.a(activity).width();
        }
        return h.a().a(context);
    }

    private Activity c(ljs ljsVar) {
        lkc i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c741bec3", new Object[]{this, ljsVar});
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null || (i = iHostService.getInvokeCallback().i()) == null) {
            return null;
        }
        Context b = i.b();
        if (!(b instanceof Activity)) {
            return null;
        }
        return (Activity) b;
    }

    private boolean b(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16e5a88", new Object[]{this, ljsVar})).booleanValue();
        }
        if (this.f33494a == null) {
            this.f33494a = (IDynamicLayoutService) ljsVar.a(IDynamicLayoutService.class);
        }
        IDynamicLayoutService iDynamicLayoutService = this.f33494a;
        if (iDynamicLayoutService != null) {
            return iDynamicLayoutService.dynamicLayoutEnable();
        }
        return false;
    }
}
