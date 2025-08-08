package tb;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ebx f27862a;
    private feq b;
    private feo c;
    private fen d = new fen();
    private final List<fel> e = new ArrayList();
    private HashMap<String, String> f = new HashMap<>();

    static {
        kge.a(842527860);
    }

    public fem() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.mainParams.MainRequestExParams");
    }

    public fem a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fem) ipChange.ipc$dispatch("34c32c58", new Object[]{this, context}) : a(context, null);
    }

    public fem a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fem) ipChange.ipc$dispatch("d9e305fb", new Object[]{this, context, intent});
        }
        d();
        b(context, intent);
        this.b.a(this.f27862a);
        String a2 = this.b.a();
        if (!StringUtils.isEmpty(a2)) {
            this.c.a(a2);
        }
        for (fel felVar : this.e) {
            Map<String, String> a3 = felVar.a(context);
            if (a3 != null) {
                this.f.putAll(a3);
            }
        }
        Map<String, String> a4 = this.d.a();
        if (a4 != null && !a4.isEmpty()) {
            this.f.putAll(a4);
        }
        return this;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = new feq();
        this.e.add(this.b);
        this.c = new feo();
        this.e.add(this.c);
        this.e.add(new fep());
    }

    private void b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e54abc", new Object[]{this, context, intent});
            return;
        }
        this.f27862a = new ebx();
        dyz dyzVar = new dyz();
        if (intent != null) {
            this.c.a(true);
            this.f27862a.a(context, intent, dyzVar);
            this.f.putAll(this.f27862a.b());
        } else if (!(context instanceof DetailCoreActivity)) {
        } else {
            this.f27862a = ((DetailCoreActivity) context).f9411a;
            this.f.putAll(this.f27862a.b());
        }
    }

    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.f;
    }

    public fen b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fen) ipChange.ipc$dispatch("16b630ce", new Object[]{this}) : this.d;
    }

    public ebx c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ebx) ipChange.ipc$dispatch("1e6757c1", new Object[]{this}) : this.f27862a;
    }
}
