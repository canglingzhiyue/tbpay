package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.e;
import java.io.File;

/* loaded from: classes7.dex */
public class msh extends msj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1563003528);
    }

    public msh(MRTResourceDescription mRTResourceDescription) {
        super(mRTResourceDescription);
    }

    @Override // tb.msj
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        File file = new File(this.f31221a.resourceRootDirectory, this.f31221a.resourceName);
        if (file.exists()) {
            e.d(file);
        }
        return e.a(new File(str), file);
    }

    @Override // tb.msj
    public boolean a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f31221a != null && (this.f31221a instanceof MRTFilesDescription)) {
            MRTFilesDescription mRTFilesDescription = (MRTFilesDescription) this.f31221a;
            File file = new File(this.f31221a.resourceRootDirectory + "/" + this.f31221a.resourceName);
            if (file.isDirectory() && file.exists()) {
                int size = mRTFilesDescription.files.size();
                int i = 0;
                for (String str : mRTFilesDescription.files.keySet()) {
                    if (!e.a(mRTFilesDescription.files.get(str), new File(file, str))) {
                        break;
                    }
                    i++;
                }
                if (i == size) {
                    return true;
                }
            }
        }
        return false;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (this.f31221a != null && (this.f31221a instanceof MRTFilesDescription)) {
            String str2 = this.f31221a.resourceRootDirectory + "/" + this.f31221a.resourceName + "/" + str;
            if (new File(str2).exists()) {
                return str2;
            }
        }
        return null;
    }
}
