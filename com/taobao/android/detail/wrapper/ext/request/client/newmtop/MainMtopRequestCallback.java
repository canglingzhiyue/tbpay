package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.o;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.fef;
import tb.fgx;
import tb.jqm;
import tb.kge;

/* loaded from: classes5.dex */
public class MainMtopRequestCallback extends MtopRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_FROM = "from";
    private static final String TAG = "MainMtopRequestCallback";
    private String fromSource;
    private String itemId;

    static {
        kge.a(2122751677);
    }

    public static /* synthetic */ Object ipc$super(MainMtopRequestCallback mainMtopRequestCallback, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MainMtopRequestCallback(Context context, MainRequestParams mainRequestParams, RemoteBusiness remoteBusiness, String str, WeakReference<MtopRequestListener<String>> weakReference, String str2) {
        super(context, mainRequestParams, remoteBusiness, str, weakReference, str2);
        this.itemId = this.mParams.mItemNumId;
        if (this.mParams.mExParams != null) {
            this.fromSource = this.mParams.mExParams.get("from");
        }
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.MainMtopRequestCallback");
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        i.c(j.a(TAG), "主接口非预请求回调，mtop onSuccess start");
        long uptimeMillis = SystemClock.uptimeMillis();
        o.a(this.mIntentFlag, uptimeMillis);
        if (mtopResponse != null && mtopResponse.getMtopStat() != null) {
            o.a(this.mIntentFlag, mtopResponse.getMtopStat());
        }
        mtopSuccess(mtopResponse);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.mContext instanceof DetailCoreActivity) {
            h.r((DetailCoreActivity) this.mContext, uptimeMillis2);
        }
        String a2 = j.a(TAG);
        i.c(a2, "主接口非预请求回调，mtop onSuccess end, time=" + uptimeMillis2);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.c(j.a(TAG), "主接口非预请求回调，onError");
        mtopError(mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.c(j.a(TAG), "主接口非预请求回调，onSystemError");
        mtopSystemError(mtopResponse);
    }

    @Override // com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopRequestCallback
    public boolean hitPrefetch() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fb5635", new Object[]{this})).booleanValue();
        }
        if (!(this.mContext instanceof DetailCoreActivity) || (map = this.mParams.mExParams) == null) {
            return false;
        }
        fef.b a2 = fef.a(this.mRequestID);
        if (a2 == null) {
            i.a(k.a(TAG), "prefetchInfo is null, resend request");
            return false;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.mContext;
        trackStartPrefetchRequest(detailCoreActivity);
        String a3 = fef.a(map);
        if (!TextUtils.equals("true", a3)) {
            return handleHitPrefetchFail(a2, detailCoreActivity, a3);
        }
        return handleHitPrefetch(a2, detailCoreActivity);
    }

    private boolean handleHitPrefetchFail(fef.b bVar, DetailCoreActivity detailCoreActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f63777", new Object[]{this, bVar, detailCoreActivity, str})).booleanValue();
        }
        fef.c cVar = bVar.b;
        if (cVar == null) {
            i.a(k.a(TAG), "prefetchRequest is null, resend request");
            return false;
        }
        trackHitPrefetchRequestFail(detailCoreActivity, str, bVar.d);
        i.c(k.a(TAG), "命中失败，丢弃预请求，重发请求");
        if (TextUtils.equals(cVar.d, "finish")) {
            fef.b(this.mRequestID);
            i.c(k.a(TAG), "abandon prefetchResponse");
            return false;
        }
        if (TextUtils.equals(cVar.d, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE)) {
            cancelRequest(cVar);
        }
        cVar.d = BaseFBPlugin.VERIFY_STATUS.abort;
        i.c(k.a(TAG), "prefetchRequest is aborted");
        return false;
    }

    private boolean handleHitPrefetch(fef.b bVar, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("825f2c6b", new Object[]{this, bVar, detailCoreActivity})).booleanValue();
        }
        fef.c cVar = bVar.b;
        if (cVar == null) {
            i.a(k.a(TAG), "prefetchRequest is null, resend request");
            return false;
        }
        h.g(detailCoreActivity, cVar.f, cVar.g);
        if (TextUtils.equals(cVar.d, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE)) {
            i.c(k.a(TAG), "参数对比相同，预请求已经执行，但结果还未返回，等待回调");
            trackHitPrefetchRequest(detailCoreActivity);
            return true;
        } else if (TextUtils.equals(cVar.d, "default") || TextUtils.equals(cVar.d, "start")) {
            cVar.d = BaseFBPlugin.VERIFY_STATUS.abort;
            i.c(k.a(TAG), "参数对比相同，预请求还未执行，直接舍弃");
            return false;
        } else if (!TextUtils.equals(cVar.d, "finish")) {
            return false;
        } else {
            return hitPrefetchWhenFinish(bVar, detailCoreActivity);
        }
    }

    private boolean hitPrefetchWhenFinish(fef.b bVar, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362f39b6", new Object[]{this, bVar, detailCoreActivity})).booleanValue();
        }
        fef.d dVar = bVar.c;
        if (dVar == null || dVar.f27852a == null) {
            i.a(k.a(TAG), "参数对比相同，预请求结果已返回，但为null");
            return false;
        }
        MtopResponse mtopResponse = dVar.f27852a;
        if (TextUtils.equals(dVar.b, "success")) {
            if (mtopResponse != null && mtopResponse.getMtopStat() != null) {
                o.a(this.mIntentFlag, mtopResponse.getMtopStat());
            }
            mtopSuccess(mtopResponse);
            if (dVar.c != 0) {
                o.a(this.mIntentFlag, dVar.c);
                long uptimeMillis = SystemClock.uptimeMillis() - dVar.c;
                h.r(detailCoreActivity, uptimeMillis);
                String a2 = j.a(TAG);
                i.c(a2, "mtopOnSuccessTime=" + uptimeMillis);
            }
            i.c(j.a(TAG), "主接口预请求回调，mtop onSuccess end");
            fgx.b(detailCoreActivity);
        } else if (TextUtils.equals(dVar.b, "error")) {
            mtopError(mtopResponse);
            fgx.a(detailCoreActivity, false);
        } else {
            mtopSystemError(mtopResponse);
            fgx.a(detailCoreActivity, true);
        }
        fef.b(this.mRequestID);
        trackHitPrefetchRequest(detailCoreActivity);
        i.c(k.a(TAG), "参数对比相同，预请求结果已返回，取缓存回调业务层处理后clear prefetchInfo");
        return true;
    }

    private void cancelRequest(fef.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58de65e6", new Object[]{this, cVar});
            return;
        }
        ApiID apiID = cVar.f27851a;
        if (apiID == null) {
            return;
        }
        apiID.cancelApiCall();
    }

    private void trackStartPrefetchRequest(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24389d93", new Object[]{this, detailCoreActivity});
        } else {
            fgx.a(detailCoreActivity, this.itemId, this.fromSource);
        }
    }

    private void trackHitPrefetchRequest(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9728e344", new Object[]{this, detailCoreActivity});
        } else {
            fgx.a(detailCoreActivity);
        }
    }

    private void trackHitPrefetchRequestFail(DetailCoreActivity detailCoreActivity, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0bef81", new Object[]{this, detailCoreActivity, str, list});
            return;
        }
        if (jqm.a()) {
            Toast.makeText(detailCoreActivity, str, 0).show();
        }
        fgx.a(detailCoreActivity, str, list);
        fgx.d(detailCoreActivity);
    }
}
