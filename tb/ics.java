package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import com.taobao.android.buy.internal.status.g;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class ics extends dsv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f28909a;

    static {
        kge.a(1987993343);
    }

    public static /* synthetic */ Activity a(ics icsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("941dbe69", new Object[]{icsVar}) : icsVar.f28909a;
    }

    public ics(Activity activity) {
        this.f28909a = activity;
    }

    @Override // tb.dsv
    public e.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e.c) ipChange.ipc$dispatch("140cdb20", new Object[]{this}) : new g() { // from class: tb.ics.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1936925467) {
                    return super.a((Activity) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.buy.internal.status.g
            public ViewGroup a(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ViewGroup) ipChange2.ipc$dispatch("7373231b", new Object[]{this, activity});
                }
                ViewGroup viewGroup = (ViewGroup) ics.a(ics.this).findViewById(R.id.purchase_loading);
                return viewGroup != null ? viewGroup : super.a(activity);
            }
        };
    }
}
