package tb;

import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class hsh implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f28754a;
    private int b;
    private long c;
    private final View.OnClickListener d;

    static {
        kge.a(-1886010796);
        kge.a(-1201612728);
        f28754a = hsh.class.getName();
    }

    public hsh(View.OnClickListener onClickListener) {
        this(onClickListener, 400);
    }

    public hsh(View.OnClickListener onClickListener, int i) {
        if (onClickListener == null) {
            throw new IllegalArgumentException("clickListener can not be null");
        }
        a(i);
        this.d = onClickListener;
        this.c = 0L;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.c <= this.b) {
            return;
        }
        this.c = uptimeMillis;
        this.d.onClick(view);
    }
}
