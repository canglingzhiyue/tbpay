package tb;

import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public interface lmj {

    /* loaded from: classes7.dex */
    public interface a {
        public static final int LIVE_PLAY_ERROR = 4;
        public static final int MEDIA_PLAY_CLOSE = 3;
        public static final int MEDIA_PLAY_ERROR = 2;
        public static final int MEDIA_PREPARE_ERROR = 1;

        void a(int i, String str);
    }

    void a(DXRuntimeContext dXRuntimeContext);

    void a(DXRuntimeContext dXRuntimeContext, lmk lmkVar);

    void a(a aVar);
}
