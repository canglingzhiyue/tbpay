package tb;

import android.os.SystemClock;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.s;

/* loaded from: classes5.dex */
public final class hfd implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_CLICK_DELAY_TIME_LONG = 600;

    /* renamed from: a  reason: collision with root package name */
    private static final String f28583a;
    private int b;
    private long c;
    private View.OnClickListener d;

    static {
        kge.a(-1017908688);
        kge.a(-1201612728);
        f28583a = hfd.class.getName();
    }

    public hfd(View.OnClickListener onClickListener) {
        this(onClickListener, 300);
        int a2 = s.a();
        if (a2 >= 0) {
            a(a2);
        }
    }

    public hfd(View.OnClickListener onClickListener, int i) {
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
