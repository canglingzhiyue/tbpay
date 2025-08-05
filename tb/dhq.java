package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes4.dex */
public class dhq extends dho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List f26765a;
    private IMTOPDataObject b;
    private Class<?> c;
    private Map<String, String> d;

    static {
        kge.a(1435651524);
        f26765a = Arrays.asList(ErrorConstant.ERRCODE_NO_NETWORK, "ANDROID_SYS_NETWORK_ERROR");
    }

    public dhq(String str, dhm dhmVar, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        this(str, dhmVar, iMTOPDataObject, null, cls);
    }

    public dhq(String str, dhm dhmVar, IMTOPDataObject iMTOPDataObject, Map<String, String> map, Class<?> cls) {
        super(str, dhmVar);
        this.b = iMTOPDataObject;
        this.c = cls;
        this.d = map;
    }

    public IMTOPDataObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMTOPDataObject) ipChange.ipc$dispatch("89383106", new Object[]{this}) : this.b;
    }

    public Map<String, String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this}) : this.d;
    }

    public Class<?> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("c24bd91d", new Object[]{this}) : this.c;
    }

    @Override // tb.dho
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "SUCCESS".equals(str);
    }

    @Override // tb.dho
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : f26765a.contains(str);
    }
}
