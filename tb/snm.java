package tb;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;

/* loaded from: classes5.dex */
public interface snm {
    psw getActiveCard();

    int getActivePosition();

    View getContentView();

    LinearLayoutManager getLayoutManager();

    sno getMediaCardListAdapter();

    LockableRecycerView getRecyclerView();

    boolean isFastScroll();

    boolean isPublicAutoCut();

    boolean isPublicTheLastOne();

    void notifyItemChanged(int i);

    void preloadNext(psw pswVar, boolean z);

    void publicNextVideo();

    void publicPreVideo();

    void renderList(Context context);

    void scrollToItem(String str);

    void setAutoLock(boolean z);

    void setPublicAutoCut(boolean z);

    void setScrollLockedExternal(boolean z);

    void smoothScrollToPosition(int i);
}
