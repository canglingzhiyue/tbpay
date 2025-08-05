package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.i;
import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public class eye implements eyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "triverwidget";

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?>[] f27644a;
    private Class b;
    private Constructor<? extends d> c;

    static {
        kge.a(1587589071);
        kge.a(1842823874);
        f27644a = new Class[]{Context.class, eyx.class, eyy.class, DataEntry[].class};
    }

    public eye() {
        try {
            this.b = Class.forName("com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent");
            this.c = this.b.getConstructor(f27644a);
            this.c.setAccessible(true);
        } catch (Throwable th) {
            i.a("NativeTriverWidgetBuilder", "TriverWidgetBuilderConstructorError", th);
        }
    }

    @Override // tb.eyp
    public d a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        try {
            return this.c.newInstance(context, eyxVar, eyyVar, dataEntryArr);
        } catch (Throwable th) {
            i.a("NativeTriverWidgetBuilder", "TriverWidgetBuilderBuildError", th);
            return null;
        }
    }
}
