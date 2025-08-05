package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hsd implements hse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f28753a;

    static {
        kge.a(-994466193);
        kge.a(-1489794729);
    }

    public hsd(Context context) {
        this.f28753a = LayoutInflater.from(context);
    }

    @Override // tb.hse
    public View a(int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fc2349c", new Object[]{this, new Integer(i), viewGroup}) : this.f28753a.inflate(i, viewGroup, false);
    }
}
