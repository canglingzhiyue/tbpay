package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.framework.domain.a;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;

/* loaded from: classes.dex */
public final class ryl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rxr errorCodeMappingAfterFilter;
    public static final ryg prefetchDuplexFilter;

    static {
        kge.a(531992602);
        errorCodeMappingAfterFilter = new rxr();
        prefetchDuplexFilter = new ryg();
    }

    public static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed0193", new Object[]{aVar});
            return;
        }
        final MtopResponse mtopResponse = aVar.c;
        if (mtopResponse == null) {
            return;
        }
        if (!(aVar.e instanceof MtopCallback.MtopFinishListener) && !(aVar.e instanceof MtopCallback.MtopStreamListener)) {
            return;
        }
        mtopResponse.setMtopStat(aVar.g);
        final MtopFinishEvent mtopFinishEvent = new MtopFinishEvent(mtopResponse);
        mtopFinishEvent.seqNo = aVar.h;
        FullTraceHelper.recordRspCbDispatch(aVar.g);
        prefetchDuplexFilter.a(aVar);
        errorCodeMappingAfterFilter.a(aVar);
        a(aVar.d.handler, new Runnable() { // from class: tb.ryl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a.this.g.serverTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.SERVER_TRACE_ID);
                    a.this.g.eagleEyeTraceId = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), "eagleeye-traceid");
                    a.this.g.statusCode = mtopResponse.getResponseCode();
                    a.this.g.retCode = mtopResponse.getRetCode();
                    a.this.g.mappingCode = mtopResponse.getMappingCode();
                    if (mtopResponse.isApiSuccess() && 3 == a.this.g.cacheHitType) {
                        a.this.g.statusCode = 304;
                    }
                    if (!(a.this.o instanceof MtopBusiness)) {
                        z = true;
                    }
                    if (z) {
                        FullTraceHelper.recordRspCbStart(a.this.g);
                    }
                    if (a.this.e instanceof MtopCallback.MtopFinishListener) {
                        ((MtopCallback.MtopFinishListener) a.this.e).onFinished(mtopFinishEvent, a.this.d.reqContext);
                    } else {
                        ((MtopCallback.MtopStreamListener) a.this.e).onFinish(mtopFinishEvent, a.this.d.reqContext);
                    }
                    a.this.g.onEndAndCommit();
                    if (!z) {
                        return;
                    }
                    FullTraceHelper.recordRspCbEnd(a.this.g);
                    a.this.g.commitFullTrace();
                } catch (Exception unused) {
                }
            }
        }, aVar.h.hashCode());
    }

    public static void a(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58856fad", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitCallbackTask(i, runnable);
        }
    }

    public static void b(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11fcfd4c", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitStreamCallbackTask(i, runnable);
        }
    }

    public static void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_RETCODE);
            mtopResponse.mappingCodeSuffix = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopResponse.getHeaderFields(), HttpHeaderConstant.X_MAPPING_CODE);
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                mtopResponse.setRetCode(singleHeaderFieldByKey);
            } else {
                mtopResponse.parseJsonByte();
            }
        }
    }

    public static void a(ryh ryhVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4aa0e2", new Object[]{ryhVar, aVar});
        } else if (ryhVar != null) {
        } else {
            MtopResponse mtopResponse = new MtopResponse(ErrorConstant.ERRCODE_MTOPSDK_INIT_ERROR, ErrorConstant.ERRMSG_MTOPSDK_INIT_ERROR);
            if (aVar.b != null) {
                mtopResponse.setApi(aVar.b.getApiName());
                mtopResponse.setV(aVar.b.getVersion());
            }
            aVar.c = mtopResponse;
            a(aVar);
        }
    }
}
