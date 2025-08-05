package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bcn extends bcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1762221982);
    }

    @Override // tb.bcj
    public void a(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e40d2", new Object[]{this, jnyVar, requestConfig});
        }
    }

    public bcn(bcb bcbVar) {
        super(bcbVar);
    }

    @Override // tb.bcj
    public void b(jny jnyVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f413", new Object[]{this, jnyVar, requestConfig});
        } else if (this.f25799a.w() == null || this.f25799a.w().e()) {
        } else {
            final String b = bem.b(this.f25799a);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            final bcf bcfVar = new bcf(this.f25799a.n());
            this.f25799a.n().x().s().post(new Runnable() { // from class: tb.bcn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bcfVar.a(b);
                    }
                }
            });
        }
    }
}
