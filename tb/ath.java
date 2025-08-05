package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import java.util.List;

/* loaded from: classes2.dex */
public interface ath extends atf {
    void a(View view, RecyclerView.State state);

    void a(AURAInputData<AURARenderIO> aURAInputData);

    void a(AURARenderComponent aURARenderComponent);

    void a(List<AURARenderComponent> list);

    void b(AURARenderComponent aURARenderComponent);
}
