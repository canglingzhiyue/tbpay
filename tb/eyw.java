package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.ptr.e;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eyw implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f27664a;
    private Context b;
    private int c;

    static {
        kge.a(-1889381485);
        kge.a(127538407);
    }

    @Override // com.taobao.ptr.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.ptr.e
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.taobao.ptr.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
        }
    }

    @Override // com.taobao.ptr.e
    public void a(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7013410", new Object[]{this, new Boolean(z), charSequence});
        }
    }

    @Override // com.taobao.ptr.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.ptr.e
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        }
    }

    public eyw(Context context) {
        this.b = context;
    }

    @Override // com.taobao.ptr.e
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        Context a2 = y.a(viewGroup);
        d a3 = d.a(a2);
        if (a3 != null) {
            this.f27664a = a3.a(a2, R.layout.tt_detail_pull_start_holder, viewGroup, true);
        } else {
            this.f27664a = LayoutInflater.from(a2).inflate(R.layout.tt_detail_pull_start_holder, viewGroup, false);
        }
        return this.f27664a;
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        View view = this.f27664a;
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    @Override // com.taobao.ptr.e
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
