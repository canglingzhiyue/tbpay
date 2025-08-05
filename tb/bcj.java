package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public abstract class bcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bcb f25799a;

    static {
        kge.a(-1546341056);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void a(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b97d4c", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        }
    }

    public abstract void a(jny jnyVar, RequestConfig requestConfig);

    public void b(IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bd48ab", new Object[]{this, iDMComponent, new Integer(i), new Integer(i2)});
        }
    }

    public abstract void b(jny jnyVar, RequestConfig requestConfig);

    public bcj(bcb bcbVar) {
        this.f25799a = bcbVar;
    }
}
