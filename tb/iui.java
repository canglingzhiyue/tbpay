package tb;

import android.view.View;

/* loaded from: classes6.dex */
public interface iui<BEEN, ROOT_VIEW extends View> extends iul {
    void bindWithData(BEEN been);

    void ensureView();

    ROOT_VIEW getView();
}
