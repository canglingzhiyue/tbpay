package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.d;
import com.taobao.android.protodb.e;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public class kks implements kkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LSDB f30127a = LSDB.open("downgrade", null);

    @Override // tb.kkt
    public boolean a(String str) {
        BusinessRule a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str != null && (a2 = kkq.a(str)) != null && a2.businessRuleName != null) {
            e eVar = new e(a2.businessRuleName);
            this.f30127a.delete(eVar);
            return com.taobao.downgrade.e.a(a2) && this.f30127a.insertString(eVar, str);
        }
        return false;
    }

    @Override // tb.kkt
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            return this.f30127a.insertString(new e("default"), str);
        }
        return false;
    }

    @Override // tb.kkt
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            return this.f30127a.insertString(new e("ava"), str);
        }
        return false;
    }

    @Override // tb.kkt
    public void d(String str) {
        AvailableBizRule c;
        Map<String, String> bizMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.f30127a.keyIterator() == null || str == null || (c = kkq.c(str)) == null || c.getBizMap() == null || (bizMap = c.getBizMap()) == null) {
        } else {
            Collection<String> values = bizMap.values();
            d<e> keyIterator = this.f30127a.keyIterator();
            while (true) {
                e a2 = keyIterator.a();
                if (a2 == null) {
                    return;
                }
                if (!"default".equals(a2.a()) && !values.contains(a2.a())) {
                    String str2 = "clean biz" + a2;
                    this.f30127a.delete(a2);
                }
            }
        }
    }

    @Override // tb.kkt
    public BusinessRule e(String str) {
        LSDB lsdb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BusinessRule) ipChange.ipc$dispatch("72bffbcd", new Object[]{this, str});
        }
        if (str != null && (lsdb = this.f30127a) != null) {
            return kkq.a(lsdb.getString(new e(str)));
        }
        return null;
    }

    @Override // tb.kkt
    public DefaultRule f(String str) {
        LSDB lsdb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("958042d1", new Object[]{this, str});
        }
        if (str != null && (lsdb = this.f30127a) != null) {
            return kkq.b(lsdb.getString(new e(str)));
        }
        return null;
    }
}
