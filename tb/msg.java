package tb;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.e;
import com.taobao.mrt.utils.a;
import java.io.File;

/* loaded from: classes7.dex */
public class msg extends msj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1377144098);
    }

    public msg(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    @Override // tb.msj
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(this.f31221a.resourceRootDirectory, this.f31221a.resourceName);
            if (file.exists()) {
                boolean d = e.d(file);
                a.c(RPCDataItems.SWITCH_TAG_LOG, "deleteRet:" + d);
            }
            e.a(new File(str), new File(this.f31221a.resourceRootDirectory));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.msj
    public boolean a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f31221a != null && (this.f31221a instanceof MRTCodeDescription)) {
            MRTCodeDescription mRTCodeDescription = (MRTCodeDescription) this.f31221a;
            File file = new File(mRTCodeDescription.resourceRootDirectory, mRTCodeDescription.resourceName);
            return file.isDirectory() && file.exists() && e.a(mRTCodeDescription.mmd5, file.getAbsolutePath());
        }
        return false;
    }
}
