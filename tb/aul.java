package tb;

import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aty;

/* loaded from: classes2.dex */
public class aul extends aum<bln> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final aty f25611a = new aty(new aty.a() { // from class: tb.aul.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.aty.a
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            aul aulVar = aul.this;
            return aulVar.a(aul.a(aulVar), str, str2);
        }
    });
    private Map<String, Object> b;

    static {
        kge.a(-566110930);
    }

    public static /* synthetic */ Object ipc$super(aul aulVar, String str, Object... objArr) {
        if (str.hashCode() == 101150451) {
            super.l();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.auh
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.aua
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "sticky";
    }

    @Override // tb.auh
    public /* synthetic */ c a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2815820f", new Object[]{this, new Integer(i), map}) : b(i, map);
    }

    public static /* synthetic */ Map a(aul aulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2d7355", new Object[]{aulVar}) : aulVar.b;
    }

    public bln b(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bln) ipChange.ipc$dispatch("e8aebf37", new Object[]{this, new Integer(i), map});
        }
        this.b = map;
        return this.f25611a.a();
    }

    @Override // tb.aum, tb.aua
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        super.l();
        this.f25611a.b();
    }
}
