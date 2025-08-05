package tb;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public interface pbe {

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(int i, int i2);

        void b();
    }

    int getCurrentPoistion();

    int getDuration();

    View getPlayView();

    void initConfig(Context context, pbg pbgVar);

    boolean isPlaying();

    void release();

    void setListener(a aVar);

    void setMuted(boolean z);

    void setVideoPath(String str);

    void start();
}
