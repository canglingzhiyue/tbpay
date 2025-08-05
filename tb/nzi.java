package tb;

import android.app.Activity;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.List;

/* loaded from: classes8.dex */
public interface nzi {

    /* loaded from: classes8.dex */
    public interface a {
        void onFriendsProvider(Object obj, Object obj2, int i, int i2);
    }

    String a();

    void a(@ShareBizAdapter.FriendsType int i, a aVar);

    void a(Activity activity);

    void a(String str, int i, int i2, String str2, int i3, String str3);

    boolean a(String str, TBShareContent tBShareContent, Object obj, List<String> list, List<String> list2);

    void b();
}
