package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.a;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.b;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.model.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ltc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ltb f30912a;

    static {
        kge.a(-152118771);
    }

    public ltc(List<Class<? extends DXWidgetNode>> list) {
        this.f30912a = new ltb(list);
    }

    public List<b> a(List<View> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd1e2ddb", new Object[]{this, list, aVar});
        }
        ArrayList arrayList = new ArrayList();
        for (View view : list) {
            List<b> a2 = a(view, aVar);
            if (a2 != null && !a2.isEmpty()) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }

    public List<b> a(View view, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("82fa1bac", new Object[]{this, view, aVar}) : b(this.f30912a.a(view), aVar);
    }

    private List<b> b(List<IVideoPlayControllerService.b> list, a aVar) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96e7fb1c", new Object[]{this, list, aVar});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IVideoPlayControllerService.b bVar : list) {
            if (bVar.a() && (a2 = a(bVar, aVar)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private b a(IVideoPlayControllerService.b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a9e58072", new Object[]{this, bVar, aVar});
        }
        if (!(bVar instanceof DXWidgetNode)) {
            return null;
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) bVar;
        View view = dXWidgetNode.getWRView() == null ? null : dXWidgetNode.getWRView().get();
        if (view != null) {
            return new b(bVar, b(view, aVar));
        }
        return null;
    }

    private c b(View view, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a93024f", new Object[]{this, view, aVar});
        }
        Rect a2 = ltj.a(view);
        if (aVar == null) {
            return new c(-1.0f, a2);
        }
        float a3 = a(aVar.a(), a2);
        ldf.d("VideoPlayControllerItemFinder", "exposureRatio : " + a3);
        return new c(a3, a2);
    }

    private float a(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd251a38", new Object[]{this, rect, rect2})).floatValue();
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom || rect2.right < rect.left || rect2.left > rect.right) {
            return 0.0f;
        }
        if (rect.contains(rect2)) {
            return 1.0f;
        }
        if (rect2.top < rect.top) {
            return (rect2.bottom - rect.top) / (rect2.bottom - rect2.top);
        }
        if (rect2.bottom <= rect.bottom) {
            return 1.0f;
        }
        return (rect.bottom - rect2.top) / (rect2.bottom - rect2.top);
    }
}
