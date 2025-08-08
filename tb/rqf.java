package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Vector;

@Deprecated
/* loaded from: classes9.dex */
public class rqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rqf c;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f33318a = new Vector();
    private int b = 1000;

    static {
        kge.a(1164417613);
        c = new rqf();
    }

    private rqf() {
    }

    public static rqf getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rqf) ipChange.ipc$dispatch("20148c0d", new Object[0]) : c;
    }

    public String getOperationHistory(int i, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5198dd", new Object[]{this, new Integer(i), str});
        }
        StringBuffer stringBuffer = new StringBuffer(500);
        if (StringUtils.isEmpty(str)) {
            str = ",";
        }
        if (i <= 0) {
            return null;
        }
        if (i >= this.f33318a.size()) {
            for (String str2 : this.f33318a) {
                if (!z) {
                    stringBuffer.append(str);
                }
                stringBuffer.append(str2);
                z = false;
            }
        } else {
            int size = (this.f33318a.size() - i) - 1;
            int i2 = size;
            while (size < this.f33318a.size()) {
                String str3 = this.f33318a.get(i2);
                if (!StringUtils.isEmpty(str3)) {
                    if (!z) {
                        stringBuffer.append(str);
                    }
                    stringBuffer.append(str3);
                    z = false;
                }
                i2++;
            }
        }
        return stringBuffer.toString();
    }

    public void addAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad69cd88", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.f33318a.size() >= this.b) {
                this.f33318a.remove(0);
            }
            this.f33318a.add(str);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        List<String> list = this.f33318a;
        if (list == null) {
            return;
        }
        list.clear();
    }
}
