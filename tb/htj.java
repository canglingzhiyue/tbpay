package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.structure.childpage.g;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class htj extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1138313992);
    }

    public static /* synthetic */ Object ipc$super(htj htjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 2087765241) {
            if (hashCode != 2099081368) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.b((String) objArr[0]);
        }
        return super.a((String) objArr[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htj(Activity activity, ium parent, iru<? extends b<a, MetaResult<a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public ise<irp, ? extends itn> a(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("7c70c4f9", new Object[]{this, type});
        }
        q.c(type, "type");
        if (q.a((Object) "sceneHeader", (Object) type)) {
            hte a2 = a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
            }
            return ((com.taobao.android.meta.srp.a) a2).ae();
        }
        return super.a(type);
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public ise<irp, ? extends ito> b(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("7d1d7098", new Object[]{this, type});
        }
        q.c(type, "type");
        if (q.a((Object) "sceneHeader", (Object) type)) {
            hte a2 = a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
            }
            return ((com.taobao.android.meta.srp.a) a2).af();
        }
        return super.b(type);
    }
}
