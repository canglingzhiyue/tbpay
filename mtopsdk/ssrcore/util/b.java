package mtopsdk.ssrcore.util;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import mtopsdk.ssrcore.callback.SsrFinishEvent;
import mtopsdk.ssrcore.d;
import tb.mtc;
import tb.mtj;
import tb.mtk;
import tb.ryi;
import tb.rzn;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_REDIRECT_TIMES = 10;

    public static boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{new Integer(i), new Integer(i2)})).booleanValue() : i2 >= 300 && i2 < 400 && i2 != 304 && i < 10;
    }

    public static void a(final mtopsdk.ssrcore.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49767ef1", new Object[]{cVar});
            return;
        }
        try {
            final mtk mtkVar = cVar.f;
            if (mtkVar == null || !(cVar.k instanceof SsrCallbackImpl)) {
                return;
            }
            final SsrFinishEvent ssrFinishEvent = new SsrFinishEvent(mtkVar);
            ssrFinishEvent.statistics = cVar.d;
            a(cVar.f25036a.handler, new Runnable() { // from class: mtopsdk.ssrcore.util.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mtopsdk.ssrcore.c.this.d.K = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopsdk.ssrcore.c.this.f.d, HttpHeaderConstant.SERVER_TRACE_ID);
                    mtopsdk.ssrcore.c.this.d.L = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtopsdk.ssrcore.c.this.f.d, "eagleeye-traceid");
                    mtopsdk.ssrcore.c.this.d.q = mtkVar.f31246a;
                    if (TextUtils.isEmpty(mtkVar.b)) {
                        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(mtkVar.d, "x-sec-reason");
                        if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                            mtopsdk.ssrcore.c.this.d.r = singleHeaderFieldByKey;
                        }
                    } else {
                        mtopsdk.ssrcore.c.this.d.r = mtkVar.b;
                    }
                    d.d(mtopsdk.ssrcore.c.this.d);
                    mtopsdk.ssrcore.c.this.d.t = 1;
                    ((SsrCallbackImpl) mtopsdk.ssrcore.c.this.k).onFinish(ssrFinishEvent);
                    String str = mtopsdk.ssrcore.c.this.b;
                    TBSdkLog.e("ssr.SsrFilterUtils", str, "[handleExceptionCallBack].code=" + mtkVar.f31246a + ", retCode = " + mtkVar.b + ", msg = " + mtkVar.c);
                    mtopsdk.ssrcore.c.this.d.b();
                }
            }, cVar.b.hashCode());
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrFilterUtils", cVar.b, "[handleExceptionCallBack]", th);
        }
    }

    public static void a(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58856fad", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitSsrCallbackTask(i, runnable);
        }
    }

    public static void a(ryi ryiVar, mtopsdk.ssrcore.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdee3403", new Object[]{ryiVar, cVar});
        } else if (ryiVar != null) {
        } else {
            cVar.f = new mtk.a().a(417).a("SSRE_MTOPSDK_INIT_ERROR").b(ErrorConstant.ERRMSG_MTOPSDK_INIT_ERROR).a();
            a(cVar);
        }
    }

    public static void a(final mtj mtjVar, final mtc mtcVar, Handler handler, final mtk mtkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4030a5", new Object[]{mtjVar, mtcVar, handler, mtkVar});
            return;
        }
        Runnable runnable = new Runnable() { // from class: mtopsdk.ssrcore.util.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mtc mtcVar2 = mtc.this;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onError(mtjVar, mtkVar);
            }
        };
        if (handler != null) {
            handler.post(runnable);
        } else {
            rzn.a().post(runnable);
        }
    }
}
