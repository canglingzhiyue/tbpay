package tb;

import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

@TableName("ap_stat")
/* loaded from: classes.dex */
public class btl extends bth {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("detail")
    public int e;

    static {
        kge.a(-1992127098);
    }

    public static /* synthetic */ Object ipc$super(btl btlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e == 1;
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.add(str);
        arrayList.add(str2);
        return a(arrayList);
    }

    private boolean a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfaf7e46", new Object[]{this, arrayList})).booleanValue();
        }
        if (arrayList == null || arrayList.size() == 0) {
            return a();
        }
        String remove = arrayList.remove(0);
        if (a(remove)) {
            return ((btl) c(remove)).a(arrayList);
        }
        return a();
    }
}
