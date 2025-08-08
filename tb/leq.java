package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* loaded from: classes.dex */
public class leq extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETREQBIZPARAM = 9068808819005234401L;

    static {
        kge.a(2038847789);
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
                String str4 = objArr.length >= 4 ? (String) objArr[3] : null;
                ldf.d("DXHSetReqBizParamEventHandler", "handleEvent containerId : " + str + ",key : " + str2 + ",value : " + str3 + ",mode : " + str4);
                if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                    ljs a2 = lfq.a(dXRuntimeContext);
                    if (a2 == null) {
                        ldf.d("DXHSetReqBizParamEventHandler", "infoFlowContext is null");
                        return;
                    }
                    ICacheReqBizParamsService iCacheReqBizParamsService = (ICacheReqBizParamsService) a2.a(ICacheReqBizParamsService.class);
                    if (iCacheReqBizParamsService == null) {
                        ldf.d("DXHSetReqBizParamEventHandler", "cacheReqBizParamsService is null");
                        return;
                    } else {
                        iCacheReqBizParamsService.saveReqBizParam(str2, str3, lfr.a(str4));
                        return;
                    }
                }
                ldf.d("DXHSetReqBizParamEventHandler", "参数异常！");
            } catch (Throwable th) {
                ldf.d("DXHSetReqBizParamEventHandler", "handleEvent error : " + th.getMessage());
            }
        }
    }
}
