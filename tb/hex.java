package tb;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.framework.container.loading.LoadingDialog;
import com.taobao.android.litecreator.sdk.framework.container.ut.a;
import com.taobao.android.litecreator.sdk.framework.container.ut.c;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.litecreator.widgets.LCBubble;
import com.taobao.android.litecreator.widgets.b;
import java.util.HashMap;
import java.util.Stack;
import tb.ios;

/* loaded from: classes5.dex */
public class hex extends hew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private het f28578a;
    private LoadingDialog b;
    private ios.a c;
    private a e;
    private String f;
    private b g;
    private Stack<hez> d = new Stack<>();
    private heu h = new hev() { // from class: tb.hex.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.hev, tb.heu
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                hex.this.Y_();
            }
        }
    };

    static {
        kge.a(-1496158738);
    }

    @Override // tb.hew
    public hew C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hew) ipChange.ipc$dispatch("28341422", new Object[]{this});
        }
        return null;
    }

    public hex(Context context, String str, String str2) {
        this.r = context;
        HashMap hashMap = new HashMap();
        hashMap.put("model", bv_() ? "liteModel" : "normal");
        this.e = new c(str, str2, hashMap);
        this.f28578a = new com.taobao.android.litecreator.sdk.framework.container.panel.impl.a(context);
    }

    private boolean bv_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecec596", new Object[]{this})).booleanValue() : StringUtils.equals(Resource.TYPE_TEMPLATE_LITE, e.e(this.r));
    }

    @Override // tb.hew
    public MutableLiveData f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLiveData) ipChange.ipc$dispatch("e43e4290", new Object[]{this, str});
        }
        if (this.q.get(str) == null) {
            this.q.put(str, new MutableLiveData());
        }
        return this.q.get(str);
    }

    @Override // tb.hew
    public void a(hez hezVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd4aa9b", new Object[]{this, hezVar});
        } else {
            this.d.push(hezVar);
        }
    }

    @Override // tb.hew
    public void Z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee4654c", new Object[]{this});
        } else if (this.d.empty()) {
        } else {
            if (this.f28578a.a()) {
                this.f28578a.c();
                return;
            }
            hez pop = this.d.pop();
            if (pop == null) {
                return;
            }
            pop.Y_();
        }
    }

    @Override // tb.hew
    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.f28578a.a();
    }

    @Override // tb.hew
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : this.f28578a.b(view);
    }

    @Override // tb.hew
    public String P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this}) : this.f;
    }

    @Override // tb.hew
    public void a(LCBubble lCBubble, LCBubble.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d43442a", new Object[]{this, lCBubble, bVar});
        } else {
            this.g.a(lCBubble, bVar);
        }
    }

    @Override // tb.hew
    public boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue() : e.l(this.r);
    }

    @Override // tb.hew
    public a K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("76b01dfa", new Object[]{this}) : this.e;
    }

    @Override // tb.hew
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            hfj.a(this.r, str);
        }
    }

    @Override // tb.hew
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        M();
        if (!(this.r instanceof Activity) || ((Activity) this.r).isDestroyed()) {
            return;
        }
        if (this.b == null) {
            this.b = new LoadingDialog();
        }
        try {
            this.b.setCancelable(z);
            this.b.show(((FragmentActivity) this.r).getSupportFragmentManager(), "lc_loading_dialog");
        } catch (Throwable th) {
            u.d("LCContextImpl", "showLoading error. info:" + Log.getStackTraceString(th));
        }
    }

    @Override // tb.hew
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            d(false);
        }
    }

    @Override // tb.hew
    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        LoadingDialog loadingDialog = this.b;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setMessage(charSequence);
    }

    @Override // tb.hew
    public void M() {
        LoadingDialog loadingDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (!(this.r instanceof Activity) || ((Activity) this.r).isDestroyed() || (loadingDialog = this.b) == null) {
        } else {
            try {
                loadingDialog.dismissAllowingStateLoss();
            } catch (Throwable th) {
                u.d("LCContextImpl", "hideLoading error. info:" + Log.getStackTraceString(th));
            }
        }
    }

    @Override // tb.hew
    public void a(View view, heu heuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89b9c2", new Object[]{this, view, heuVar});
            return;
        }
        if (heuVar == null) {
            heuVar = this.h;
        }
        this.f28578a.a(view);
        this.f28578a.a(heuVar);
        this.f28578a.b();
    }

    @Override // tb.hew
    public void Y_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2f8cad", new Object[]{this});
        } else {
            this.f28578a.c();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.c = ios.a(str);
        this.f = str;
        this.g = new b();
    }

    @Override // tb.hew
    public ios.a N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ios.a) ipChange.ipc$dispatch("a246e547", new Object[]{this}) : this.c;
    }

    public static hex a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hex) ipChange.ipc$dispatch("34c4166b", new Object[]{context}) : a(context, "unknown", "unknown");
    }

    public static hex a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hex) ipChange.ipc$dispatch("5d3b72d7", new Object[]{context, str, str2}) : new hex(context, str, str2);
    }
}
