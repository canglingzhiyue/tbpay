package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class fmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fml f28064a;

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        fml fmlVar = this.f28064a;
        if (fmlVar == null) {
            TLog.loge("AliNewDetailExtend", "PreLoadWeexManager", "preLoadWeexInstance preLoadWeexInstance is null!");
        } else {
            fmlVar.a(context);
        }
    }

    public void a(fml fmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d55833", new Object[]{this, fmlVar});
        } else {
            this.f28064a = fmlVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        fml fmlVar = this.f28064a;
        if (fmlVar == null) {
            TLog.loge("AliNewDetailExtend", "PreLoadWeexManager", "preLoadWeexInstance preLoadWeexInstance is null!");
            return false;
        }
        return fmlVar.a();
    }
}
