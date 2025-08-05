package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class nsc implements iuj<FrameLayout, nsb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f31709a;

    static {
        kge.a(373957160);
        kge.a(1621305585);
    }

    @Override // tb.iuj
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        }
    }

    @Override // tb.iuj
    public /* bridge */ /* synthetic */ void a(nsb nsbVar, imn imnVar) {
    }

    @Override // tb.iuj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        this.f31709a = new FrameLayout(context);
        this.f31709a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f31709a.setBackgroundColor(context.getResources().getColor(R.color.tbsearch_shop_search_bg));
        return this.f31709a;
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : this.f31709a;
    }
}
