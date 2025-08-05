package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.split.k;
import com.alibaba.android.split.manager.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;

/* loaded from: classes2.dex */
public class bgr implements bgo<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bhg f25884a;

    static {
        kge.a(-1330789189);
        kge.a(503218550);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, java.lang.Object] */
    @Override // tb.bgo
    public /* synthetic */ View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    public bgr(bhg bhgVar) {
        this.f25884a = bhgVar;
    }

    public View a() {
        View view;
        try {
            if (this.f25884a.b() != null && this.f25884a.b().get() != null && !TextUtils.isEmpty(this.f25884a.d())) {
                ((a) k.a()).c().a(this.f25884a.b().get(), this.f25884a.d());
            }
            Class<?> cls = Class.forName(this.f25884a.a());
            if (this.f25884a.g() != null && this.f25884a.h().length != 0) {
                view = (View) cls.getDeclaredConstructor(this.f25884a.g()).newInstance(this.f25884a.h());
                if (view != null && this.f25884a.f() != null) {
                    this.f25884a.f().a((bhc.b<View>) view, this.f25884a.e());
                }
                return view;
            }
            view = (View) cls.getDeclaredConstructor(Context.class).newInstance(this.f25884a.b().get());
            if (view != null) {
                this.f25884a.f().a((bhc.b<View>) view, this.f25884a.e());
            }
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f25884a.f() == null) {
                return null;
            }
            this.f25884a.f().a(e.getMessage(), this.f25884a.e());
            return null;
        }
    }
}
