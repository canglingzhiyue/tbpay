package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.f;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;

/* loaded from: classes.dex */
public class ojk extends ojj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ovm b;

    static {
        kge.a(499545400);
    }

    public static /* synthetic */ Object ipc$super(ojk ojkVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1982990220) {
            if (hashCode != 519462099) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.g((IHomeSubTabController) objArr[0]);
        }
        return super.b((String) objArr[0]);
    }

    public ojk(ovm ovmVar, ojl ojlVar) {
        super(ovmVar, ojlVar);
        this.b = ovmVar;
    }

    @Override // tb.ojj, com.taobao.tao.topmultitab.protocol.c
    public List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (!(this.b instanceof f)) {
            return super.b(str);
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1793320594) {
            if (hashCode != 1195314547) {
                if (hashCode == 2061403050 && str.equals("getRightTabWebUrl")) {
                    c = 2;
                }
            } else if (str.equals("getLeftTabWebUrl")) {
                c = 0;
            }
        } else if (str.equals("getLeftAndRightTabWebUrl")) {
            c = 1;
        }
        if (c == 0) {
            return ((f) this.b).a(true, false);
        }
        if (c == 1) {
            return ((f) this.b).a(true, true);
        }
        if (c == 2) {
            return ((f) this.b).a(false, true);
        }
        return null;
    }

    @Override // tb.ojj, com.taobao.tao.topmultitab.protocol.c
    public JSONObject g(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ef65cd3", new Object[]{this, iHomeSubTabController});
        }
        ovm ovmVar = this.b;
        if (!(ovmVar instanceof f)) {
            ldf.d("HomeMainLandInfoFlowCallBack", "不是MultiTabHelper");
            return super.g(iHomeSubTabController);
        }
        JSONObject b = ((f) ovmVar).b(iHomeSubTabController);
        if (b != null) {
            return b;
        }
        ldf.d("HomeMainLandInfoFlowCallBack", "selfTabInformation == null");
        return super.g(iHomeSubTabController);
    }
}
