package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.umf.datamodel.b;

/* loaded from: classes2.dex */
public interface brj extends bqg {
    View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer);

    String a();

    String a(AURARenderComponent aURARenderComponent);

    void a(AURARenderComponent aURARenderComponent, View view, int i);

    @Deprecated
    void a(b bVar, brk brkVar);
}
