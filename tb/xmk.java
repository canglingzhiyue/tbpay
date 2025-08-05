package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes6.dex */
public class xmk {
    static {
        kge.a(57691530);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f34370a;
        private ViewGroup b;
        private View c;
        private int d;
        private int e;
        private PopupWindow f;
        private final Runnable g = new Runnable() { // from class: tb.xmk.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.a(a.this) != null) {
                    a.a(a.this).dismiss();
                } else {
                    q.b("CustomViewToast", "dismiss PopupWindow失败");
                }
            }
        };
        private Handler h;

        static {
            kge.a(2062619351);
        }

        public static /* synthetic */ PopupWindow a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("7c3d46ef", new Object[]{aVar}) : aVar.f;
        }

        public a(ViewGroup viewGroup, int i) {
            this.b = viewGroup;
            if (this.b == null) {
                q.b("CustomViewToast", "parentLayout为空");
                return;
            }
            this.f34370a = viewGroup.getContext();
            a(i);
            b(hin.a(this.f34370a, 50.0f));
            this.h = new Handler(Looper.getMainLooper());
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (view == null) {
            } else {
                this.c = view;
                this.f = new PopupWindow(this.c, -2, -2, false);
                this.f.setTouchable(false);
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public void a() {
            Handler handler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c == null || this.b == null || (handler = this.h) == null || this.f == null) {
                q.b("CustomViewToast", "显示失败：" + this.c + " " + this.b + " " + this.h + " " + this.f);
            } else {
                try {
                    handler.removeCallbacks(this.g);
                    this.f.showAtLocation(this.b, 81, 0, this.e);
                    this.h.postDelayed(this.g, this.d);
                } catch (Exception e) {
                    q.b("CustomViewToast", e.toString());
                }
            }
        }
    }
}
