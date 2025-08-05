package tb;

import android.taobao.windvane.export.prerender.a;
import android.taobao.windvane.export.prerender.b;
import android.taobao.windvane.extra.uc.pool.PreCreateInfo;

/* loaded from: classes2.dex */
public interface hvw {
    void addPrerenderAttachEventListener(a aVar);

    void addPrerenderSuccessEventListener(b bVar);

    void addWebViewPageModel(dqn dqnVar);

    String getCustomMegaBizId();

    PreCreateInfo getPreCreateInfo();

    String getRealUrl();

    dqn getWebViewPageModel();

    boolean isClientPrerender();

    boolean isHitSnapshot();

    void notifyPrerenderSuccess();

    void removePrerenderAttachEventListener();

    void setCustomMegaBizId(String str);

    void setHitSnapshot(boolean z);

    void setIsClientPrerender(boolean z);

    void setPreCreateInfo(PreCreateInfo preCreateInfo);

    void setRealUrl(String str);
}
