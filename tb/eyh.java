package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.i;
import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public class eyh implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "armakeup";

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?>[] f27645a;
    private Class b;
    private Constructor<? extends d> c;

    static {
        kge.a(-30630707);
        kge.a(1842823874);
        f27645a = new Class[]{Context.class, eyx.class, eyy.class, DataEntry[].class};
    }

    public eyh() {
        try {
            this.b = Class.forName("com.taobao.android.detail.industry.scene.weex2.TTDetailARWeex2Component");
            this.c = this.b.getConstructor(f27645a);
            this.c.setAccessible(true);
        } catch (Throwable th) {
            i.a("WeexVersion2ARMakeUpBuilder", "Weex2ARBuilderConstructorError", th);
        }
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        try {
            return this.c.newInstance(context, eyxVar, eyyVar, dataEntryArr);
        } catch (Throwable th) {
            i.a("WeexVersion2ARMakeUpBuilder", "Weex2ARBuilderBuildError", th);
            return null;
        }
    }
}
