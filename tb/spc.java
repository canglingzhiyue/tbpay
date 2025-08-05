package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import java.util.List;

/* loaded from: classes5.dex */
public interface spc {
    public static final String QUICK_OPEN_TAG = "quickOpenTag";

    RotateAnimation a();

    a a(FluidContext fluidContext);

    void a(FluidContext fluidContext, Context context, f fVar, ViewGroup viewGroup, boolean z);

    void a(FluidContext fluidContext, List<a> list, boolean z);

    void b(FluidContext fluidContext);
}
