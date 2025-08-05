package tb;

import android.content.Context;
import android.view.View;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.order.map.model.OrderMapBubbleModel;
import com.taobao.android.order.map.model.OrderMapLifeCycleModel;
import com.taobao.android.order.map.model.OrderMapStatusModel;
import java.util.List;

/* loaded from: classes6.dex */
public interface raa {
    View a(Context context, OrderMapBubbleModel orderMapBubbleModel, DXRuntimeContext dXRuntimeContext, rac racVar);

    List<OrderMapBubbleModel> a(Context context, DXRuntimeContext dXRuntimeContext);

    void a(OrderMapLifeCycleModel orderMapLifeCycleModel);

    void a(OrderMapStatusModel orderMapStatusModel);

    void a(String str, Object obj);

    Object b(String str);
}
