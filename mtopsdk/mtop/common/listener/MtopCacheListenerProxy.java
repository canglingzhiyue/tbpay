package mtopsdk.mtop.common.listener;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopCacheListenerProxy extends MtopBaseListenerProxy implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopCacheListenerProxy";

    static {
        kge.a(-411296159);
        kge.a(-429814511);
    }

    public MtopCacheListenerProxy(MtopListener mtopListener) {
        super(mtopListener);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
        } else if (!(this.listener instanceof MtopCallback.MtopCacheListener)) {
        } else {
            ((MtopCallback.MtopCacheListener) this.listener).onCached(mtopCacheEvent, obj);
            this.isCached = true;
        }
    }
}
