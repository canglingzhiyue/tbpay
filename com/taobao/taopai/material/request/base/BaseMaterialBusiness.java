package com.taobao.taopai.material.request.base;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taopai.material.MaterialRequestStrategy;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import java.io.File;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.pzc;
import tb.qbu;
import tb.qcf;
import tb.qcg;

/* loaded from: classes8.dex */
public abstract class BaseMaterialBusiness<T> implements IRemoteBaseListener, b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "material_request";
    private qbu mFailListener;
    private boolean mIsRequestingCache;
    private a mParams;
    public boolean mIsReturnData = false;
    public MaterialRequestStrategy mRequestStrategy = MaterialRequestStrategy.CACHE_NET;
    private Runnable mTimeOutRunnable = new Runnable() { // from class: com.taobao.taopai.material.request.base.BaseMaterialBusiness.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            BaseMaterialBusiness.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (BaseMaterialBusiness.access$000(BaseMaterialBusiness.this) == null || BaseMaterialBusiness.this.mIsReturnData) {
            } else {
                BaseMaterialBusiness.access$000(BaseMaterialBusiness.this).a("-1001", "timeout");
                BaseMaterialBusiness.this.mIsReturnData = true;
            }
        }
    };
    private long mStartTime = SystemClock.elapsedRealtime();

    static {
        kge.a(552940884);
        kge.a(208067611);
        kge.a(-525336021);
    }

    public abstract String getCacheFilePath();

    public abstract String getUtRequestKey();

    public abstract void handleCacheLoaded(T t);

    /* renamed from: parseCacheData */
    public abstract T mo1426parseCacheData(String str);

    public static /* synthetic */ qbu access$000(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qbu) ipChange.ipc$dispatch("fb4b0a70", new Object[]{baseMaterialBusiness}) : baseMaterialBusiness.mFailListener;
    }

    public static /* synthetic */ Object access$100(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ba53a03f", new Object[]{baseMaterialBusiness}) : baseMaterialBusiness.readFromCache();
    }

    public static /* synthetic */ boolean access$202(BaseMaterialBusiness baseMaterialBusiness, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbdf4f42", new Object[]{baseMaterialBusiness, new Boolean(z)})).booleanValue();
        }
        baseMaterialBusiness.mIsRequestingCache = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed5c659", new Object[]{baseMaterialBusiness})).booleanValue() : baseMaterialBusiness.isOnlyUseCache();
    }

    public static /* synthetic */ void access$400(BaseMaterialBusiness baseMaterialBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2755d6", new Object[]{baseMaterialBusiness});
        } else {
            baseMaterialBusiness.statSuccessFromCache();
        }
    }

    public BaseMaterialBusiness(a aVar, qbu qbuVar) {
        this.mParams = aVar;
        this.mFailListener = qbuVar;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        pzc.b(this.mTimeOutRunnable);
        this.mIsReturnData = true;
    }

    public void saveCache(final T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51562e8", new Object[]{this, t});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.taopai.material.request.base.-$$Lambda$BaseMaterialBusiness$SVPWhZBBjKdkAljHJIOS3ipEX18
                {
                    BaseMaterialBusiness.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMaterialBusiness.this.lambda$saveCache$0$BaseMaterialBusiness(t);
                }
            });
        }
    }

    public /* synthetic */ void lambda$saveCache$0$BaseMaterialBusiness(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ffef97", new Object[]{this, obj});
            return;
        }
        String cacheFilePath = getCacheFilePath();
        if (TextUtils.isEmpty(cacheFilePath)) {
            return;
        }
        try {
            qcg.c(cacheFilePath, JSON.toJSONString(obj));
        } catch (Exception e) {
            Log.e(TAG, "save cache fail " + e.toString());
        }
    }

    public void request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
        } else if (this.mParams.a()) {
            requestCache();
        } else {
            requestNet();
        }
    }

    public void requestCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec8413a", new Object[]{this});
        } else if (this.mIsRequestingCache) {
        } else {
            this.mIsRequestingCache = true;
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new AnonymousClass2());
        }
    }

    /* renamed from: com.taobao.taopai.material.request.base.BaseMaterialBusiness$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: lambda$mWz8Gj51tQpG-pfXGd0CYAG2mII */
        public static /* synthetic */ void m1411lambda$mWz8Gj51tQpGpfXGd0CYAG2mII(AnonymousClass2 anonymousClass2, Object obj) {
            anonymousClass2.a(obj);
        }

        public static /* synthetic */ void lambda$zExLWcIgmmoN3CUIFfuNrcwKL64(AnonymousClass2 anonymousClass2) {
            anonymousClass2.a();
        }

        public AnonymousClass2() {
            BaseMaterialBusiness.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final Object access$100 = BaseMaterialBusiness.access$100(BaseMaterialBusiness.this);
            BaseMaterialBusiness.access$202(BaseMaterialBusiness.this, false);
            if (access$100 == null) {
                if (BaseMaterialBusiness.access$300(BaseMaterialBusiness.this)) {
                    pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.base.-$$Lambda$BaseMaterialBusiness$2$zExLWcIgmmoN3CUIFfuNrcwKL64
                        {
                            BaseMaterialBusiness.AnonymousClass2.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseMaterialBusiness.AnonymousClass2.lambda$zExLWcIgmmoN3CUIFfuNrcwKL64(BaseMaterialBusiness.AnonymousClass2.this);
                        }
                    });
                    return;
                } else {
                    BaseMaterialBusiness.this.requestNet();
                    return;
                }
            }
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.base.-$$Lambda$BaseMaterialBusiness$2$mWz8Gj51tQpG-pfXGd0CYAG2mII
                {
                    BaseMaterialBusiness.AnonymousClass2.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMaterialBusiness.AnonymousClass2.m1411lambda$mWz8Gj51tQpGpfXGd0CYAG2mII(BaseMaterialBusiness.AnonymousClass2.this, access$100);
                }
            });
            BaseMaterialBusiness.access$400(BaseMaterialBusiness.this);
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                BaseMaterialBusiness.access$000(BaseMaterialBusiness.this).a("-1000", "cache_empty");
            }
        }

        public /* synthetic */ void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                BaseMaterialBusiness.this.handleCacheLoaded(obj);
            }
        }
    }

    private T readFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca355c9", new Object[]{this});
        }
        String cacheFilePath = getCacheFilePath();
        if (isCacheInvalid(cacheFilePath)) {
            return null;
        }
        try {
            String d = qcg.d(cacheFilePath);
            if (!TextUtils.isEmpty(d)) {
                return mo1426parseCacheData(d);
            }
        } catch (Exception e) {
            Log.e(TAG, "parseCacheData fail " + e.toString());
        }
        return null;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        pzc.b(this.mTimeOutRunnable);
        statSuccessFromNet();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        pzc.b(this.mTimeOutRunnable);
        statFail(mtopResponse);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        pzc.b(this.mTimeOutRunnable);
        statFail(mtopResponse);
    }

    private boolean isOnlyUseCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4201545c", new Object[]{this})).booleanValue() : this.mRequestStrategy == MaterialRequestStrategy.ONLY;
    }

    public long getCacheTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd97d6b4", new Object[]{this})).longValue() : this.mParams.c() * 1000;
    }

    private void statFail(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b1e89e", new Object[]{this, mtopResponse});
            return;
        }
        String str = "";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        qcf.a(this.mParams.b(), getUtRequestKey(), this.mParams.toString(), retCode, str, SystemClock.elapsedRealtime() - this.mStartTime);
    }

    private void statSuccessFromNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3805320b", new Object[]{this});
        } else {
            qcf.a(this.mParams.b(), getUtRequestKey(), SystemClock.elapsedRealtime() - this.mStartTime);
        }
    }

    private void statSuccessFromCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3017bfb0", new Object[]{this});
        } else {
            qcf.a(this.mParams.b(), getUtRequestKey());
        }
    }

    private boolean isCacheInvalid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50434fb4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        return !file.exists() || System.currentTimeMillis() - file.lastModified() > getCacheTime();
    }
}
