package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class poo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BaseSectionModel<?> f32783a;
    private final WeakReference<View> b;

    static {
        kge.a(1360031818);
    }

    public poo(BaseSectionModel<?> baseSectionModel, View view) {
        this.f32783a = baseSectionModel;
        this.b = new WeakReference<>(view);
    }

    public BaseSectionModel<?> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("97068376", new Object[]{this}) : this.f32783a;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b.get();
    }
}
