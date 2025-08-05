package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class kqd<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kqh<T> f30233a;
    private List<T> b;

    public abstract View a(XRateFlowLayout xRateFlowLayout, int i, T t);

    public kqd(List<T> list) {
        this.b = list;
    }

    public void a(kqh<T> kqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1941fd6", new Object[]{this, kqhVar});
        } else {
            this.f30233a = kqhVar;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        List<T> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public T c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3204ff79", new Object[]{this, new Integer(i)});
        }
        List<T> list = this.b;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }
}
