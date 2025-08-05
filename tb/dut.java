package tb;

import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.b;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class dut<INPUT extends UMFBaseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final INPUT f27002a;
    private final String b;
    private List<IAURAInputField> c;
    private a d;

    /* loaded from: classes4.dex */
    public interface a<OUTPUT extends Serializable> {
        void onComplete();

        void onData(OUTPUT output);

        void onError(String str, String str2, b bVar);
    }

    static {
        kge.a(-1068740360);
    }

    public dut(String str, INPUT input, a aVar) {
        this.f27002a = input;
        this.b = str;
        this.d = aVar;
    }

    public INPUT a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INPUT) ipChange.ipc$dispatch("141c27e6", new Object[]{this}) : this.f27002a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public List<IAURAInputField> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }

    public a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("322ff3b", new Object[]{this}) : this.d;
    }
}
