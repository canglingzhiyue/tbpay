package mtopsdk.mtop.common;

import tb.kge;

/* loaded from: classes9.dex */
public class MtopCallback {

    /* loaded from: classes9.dex */
    public interface MtopCacheListener extends MtopListener {
        void onCached(MtopCacheEvent mtopCacheEvent, Object obj);
    }

    /* loaded from: classes.dex */
    public interface MtopFinishListener extends MtopListener {
        void onFinished(MtopFinishEvent mtopFinishEvent, Object obj);
    }

    /* loaded from: classes.dex */
    public interface MtopHeaderListener extends MtopListener {
        void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj);
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public interface MtopProgressListener extends MtopListener {
        @Deprecated
        void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj);
    }

    /* loaded from: classes9.dex */
    public interface MtopStreamListener extends MtopListener {
        void onFinish(MtopFinishEvent mtopFinishEvent, Object obj);

        void onReceiveData(MtopFinishEvent mtopFinishEvent, Object obj);
    }

    static {
        kge.a(962502439);
    }
}
