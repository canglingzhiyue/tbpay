package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.ptr.e;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eyv implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f27663a;
    private Context b;
    private int c;
    private View d;
    private TextView e;
    private String f = "滑动发现更多内容";
    private String g = "释放发现更多内容";

    static {
        kge.a(1795424762);
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
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        }
    }

    public eyv(Context context) {
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
            this.f27663a = a3.a(a2, R.layout.tt_detail_pull_end_tips, viewGroup, true);
        } else {
            this.f27663a = LayoutInflater.from(a2).inflate(R.layout.tt_detail_pull_end_tips, viewGroup, false);
        }
        this.d = this.f27663a.findViewById(R.id.iv_ptr_arrow);
        this.e = (TextView) this.f27663a.findViewById(R.id.tv_ptr_label);
        return this.f27663a;
    }

    @Override // com.taobao.ptr.e
    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        View view = this.f27663a;
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

    private float c(float f) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue();
        }
        View view = this.f27663a;
        if (view != null) {
            i = view.getWidth();
        }
        return Math.abs(f) / i;
    }

    @Override // com.taobao.ptr.e
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (c(f) < 1.0d) {
            TextView textView = this.e;
            if (textView == null) {
                return;
            }
            textView.setText(this.f);
        } else {
            TextView textView2 = this.e;
            if (textView2 == null) {
                return;
            }
            textView2.setText(this.g);
        }
    }

    @Override // com.taobao.ptr.e
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        TextView textView = this.e;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // com.taobao.ptr.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TextView textView = this.e;
        if (textView == null) {
            return;
        }
        textView.setText(this.f);
    }

    @Override // com.taobao.ptr.e
    public void a(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7013410", new Object[]{this, new Boolean(z), charSequence});
        } else if (z) {
            View view = this.d;
            if (view != null) {
                view.setVisibility(8);
            }
            TextView textView = this.e;
            if (textView == null) {
                return;
            }
            textView.setText(charSequence);
        } else {
            View view2 = this.d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TextView textView2 = this.e;
            if (textView2 == null) {
                return;
            }
            textView2.setText(this.f);
        }
    }
}
