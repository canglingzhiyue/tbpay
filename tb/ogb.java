package tb;

import android.util.Pair;
import android.view.MotionEvent;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public interface ogb extends ogc {
    oga<?> findSecPageWrapper();

    void onPageSelected(int i);

    void slideSecondPage(Object obj, String str);

    Pair<Boolean, Pair<Boolean, aa>> supportSecondPage(MotionEvent motionEvent);
}
