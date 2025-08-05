package tb;

import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;

/* loaded from: classes2.dex */
public interface bse {

    /* loaded from: classes2.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(boolean z);
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    /* loaded from: classes2.dex */
    public interface d {
    }

    void addOnCloseListener(a aVar);

    void destroy();

    boolean dismissFloat();

    void onScreenChanged(int i, Configuration configuration);

    void setBackgroundAnimation(brz brzVar);

    void setConfigBuilder(NUTFloatViewManager.Builder builder, bsq bsqVar);

    void setContentRender(bsm bsmVar);

    void setContentViewAnimation(brz brzVar);

    void setOnDismissListener(b bVar);

    void setOnShowListener(d dVar);

    boolean showFloat(Context context);
}
