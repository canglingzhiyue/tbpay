package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;

/* loaded from: classes.dex */
public class lfd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETREQBIZPARAM = -3327440748624871211L;

    static {
        kge.a(491766031);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            try {
                String str = (String) objArr[0];
                String str2 = objArr.length >= 2 ? (String) objArr[1] : null;
                String str3 = objArr.length >= 3 ? (String) objArr[2] : null;
                ldf.d("DXDataParserHGetReqBizParam", "handleEvent containerId : " + str + ",key : " + str2 + ",mode : " + str3);
                if (StringUtils.isEmpty(str2)) {
                    ldf.d("DXDataParserHGetReqBizParam", "参数异常！");
                    return null;
                }
                ljs a2 = lfq.a(dXRuntimeContext);
                if (a2 == null) {
                    ldf.d("DXDataParserHGetReqBizParam", "infoFlowContext is null");
                    return null;
                }
                ICacheReqBizParamsService iCacheReqBizParamsService = (ICacheReqBizParamsService) a2.a(ICacheReqBizParamsService.class);
                if (iCacheReqBizParamsService == null) {
                    ldf.d("DXDataParserHGetReqBizParam", "cacheReqBizParamsService is null");
                    return null;
                }
                return iCacheReqBizParamsService.readReqBizParam(str2, null, lfr.a(str3));
            } catch (Throwable th) {
                ldf.d("DXDataParserHGetReqBizParam", "handleEvent error : " + th.getMessage());
            }
        }
        return null;
    }
}
