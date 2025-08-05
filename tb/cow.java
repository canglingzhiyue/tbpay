package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class cow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<RectF> f26363a;
    private RectF b;

    static {
        kge.a(-1625114890);
    }

    public void a(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f26363a = list;
        }
    }

    public void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
        } else {
            this.b = rectF;
        }
    }

    public List<RectF> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f26363a;
    }

    public RectF b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("e8a87f5e", new Object[]{this}) : this.b;
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (f != 1.0f || f2 != 1.0f) {
            RectF rectF = this.b;
            if (rectF != null) {
                rectF.top *= f2;
                this.b.bottom *= f2;
                this.b.left *= f;
                this.b.right *= f;
            }
            List<RectF> list = this.f26363a;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (RectF rectF2 : this.f26363a) {
                rectF2.top *= f2;
                rectF2.bottom *= f2;
                rectF2.left *= f2;
                rectF2.right *= f2;
            }
        }
    }
}
