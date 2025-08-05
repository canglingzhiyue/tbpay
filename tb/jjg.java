package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jjg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jjf f29580a;
    public View.OnClickListener b;

    static {
        kge.a(-91788561);
        kge.a(-1201612728);
    }

    public jjg(View.OnClickListener onClickListener, jjf jjfVar) {
        this.b = onClickListener;
        this.f29580a = jjfVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        jjf jjfVar = this.f29580a;
        if (jjfVar != null) {
            z = jjfVar.a(this, view);
        }
        if (z || (onClickListener = this.b) == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
