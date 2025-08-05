package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.business.a;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes7.dex */
public interface mei {
    RecyclerView.LayoutManager a(Context context, meh<IMTOPDataObject> mehVar);

    meh<IMTOPDataObject> a();

    void a(String str);

    void a(List<IMTOPDataObject> list);

    boolean a(meh<IMTOPDataObject> mehVar);

    RecyclerView.ItemDecoration b();

    a c();

    BaseListRequest d();

    int e();

    int f();

    int g();
}
