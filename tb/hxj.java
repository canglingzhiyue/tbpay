package tb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.order.bundle.helper.b;
import com.taobao.android.order.bundle.helper.d;
import com.taobao.android.order.bundle.search.receiver.HistoryKeyReceiver;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class hxj implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f28831a;
    private EditText b;
    private BroadcastReceiver c = null;
    private hxk d;

    static {
        kge.a(510122829);
        kge.a(-1201612728);
    }

    public static /* synthetic */ hxk a(hxj hxjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hxk) ipChange.ipc$dispatch("223bc78d", new Object[]{hxjVar}) : hxjVar.d;
    }

    public hxj(Activity activity) {
        this.f28831a = activity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f28831a.setContentView(R.layout.babel_order_search_activity);
        e();
        d();
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<hxj> f28832a;

        static {
            kge.a(-521644316);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(hxj hxjVar) {
            this.f28832a = new WeakReference<>(hxjVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            hxj hxjVar = this.f28832a.get();
            if (hxjVar == null || message == null || message.what != 2 || hxj.a(hxjVar) == null) {
                return;
            }
            hxj.a(hxjVar).b();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = new HistoryKeyReceiver(new a(this));
        b.a(this.f28831a, this.c);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f28831a.findViewById(R.id.btn_searchOrder).setOnClickListener(this);
        this.b = (EditText) this.f28831a.findViewById(R.id.et_search);
        this.d = new hxk(this.f28831a);
        this.d.c();
        this.d.d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hxk hxkVar = this.d;
        if (hxkVar != null) {
            hxkVar.a();
        }
        hya.a(this.f28831a).a();
        b.b(this.f28831a, this.c);
        this.d = null;
        this.c = null;
        this.b = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.btn_searchOrder) {
        } else {
            String c = c();
            hyn.a("OrderSearchViewBuilder", "onClick", "searchKey:" + c);
            if (!TextUtils.isEmpty(c)) {
                hya.a(this.f28831a).a(c.length() > 4 ? c.substring(0, 4).trim() : c.trim());
            }
            d.b(this.f28831a, c, null);
            if (l.e((Context) this.f28831a)) {
                return;
            }
            this.f28831a.finish();
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.getText().toString();
    }
}
