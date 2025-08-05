package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RequestPoolManager;
import com.taobao.tao.remotebusiness.login.h;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.framework.domain.FilterResult;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.antiattack.AntiAttackHandler;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class rxp implements rxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1060118834);
        kge.a(-2079716300);
    }

    @Override // tb.rxo
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "mtopsdk.AntiAttackAfterFilter";
    }

    @Override // tb.rxm
    public String a(a aVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b93eb6d", new Object[]{this, aVar});
        }
        MtopResponse mtopResponse = aVar.c;
        if (419 != mtopResponse.getResponseCode()) {
            return FilterResult.CONTINUE;
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.BX_ACTION);
        MtopBuilder mtopBuilder = aVar.o;
        Mtop mtop = aVar.f25000a;
        String str = mtopBuilder.mtopProp.userInfo;
        if ("login".equals(singleHeaderFieldByKey) && ((z = mtopBuilder instanceof MtopBusiness))) {
            MtopBusiness mtopBusiness = (MtopBusiness) mtopBuilder;
            RequestPoolManager.a(RequestPoolManager.Type.SESSION).a(mtop, str, mtopBusiness);
            if (z && (mtopBusiness.listener instanceof IInteractingListener)) {
                ((IInteractingListener) mtopBusiness.listener).onInteract("login");
            }
            h.a(mtop, str, true, mtopBuilder);
            return "STOP";
        }
        String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, "location");
        String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_LOCATION_EXT);
        AntiAttackHandler antiAttackHandler = aVar.f25000a.getMtopConfig().antiAttackHandler;
        Context context = aVar.f25000a.getMtopConfig() != null ? aVar.f25000a.getMtopConfig().context : MtopUtils.getContext();
        if (antiAttackHandler != null && StringUtils.isNotBlank(singleHeaderFieldByKey2) && !MtopUtils.isCurrentProcessBackground(context)) {
            antiAttackHandler.handle(singleHeaderFieldByKey2, singleHeaderFieldByKey3);
            if (mtopBuilder instanceof MtopBusiness) {
                RequestPoolManager.a(RequestPoolManager.Type.ANTI).a(mtop, "", (MtopBusiness) mtopBuilder);
                return "STOP";
            }
        } else {
            TBSdkLog.e("mtopsdk.AntiAttackAfterFilter", aVar.h, "didn't register AntiAttackHandler.");
        }
        mtopResponse.setRetCode(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
        mtopResponse.setRetMsg(ErrorConstant.ERRMSG_API_41X_ANTI_ATTACK);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
            String str2 = aVar.h;
            TBSdkLog.w("mtopsdk.AntiAttackAfterFilter", str2, "[doAfter] execute AntiAttackAfterFilter apiKey=" + aVar.b.getKey());
        }
        ryl.a(aVar);
        return "STOP";
    }
}
