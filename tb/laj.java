package tb;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.util.List;

/* loaded from: classes7.dex */
public interface laj {

    /* loaded from: classes7.dex */
    public interface a {
        void a(List<IPopData> list);
    }

    View a(View view, int i, IPopData iPopData);

    View a(View view, String str, IPopData iPopData);

    View a(ViewGroup viewGroup, IPopData iPopData, kyu kyuVar);

    void a();

    void a(ViewGroup viewGroup, View view, int i);

    void a(kyu kyuVar, List<IPopData> list, a aVar);

    boolean a(View view, IPopData iPopData);

    void b();
}
