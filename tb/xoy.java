package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.homepage.busniess.model.SkinData;
import com.taobao.tao.Globals;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J)\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/mytaobao/util/SkinUtils;", "", "()V", "getGlobalHeightAp", "", SkinData.KEY_GLOBAL_BG_HEIGHT, "", SkinData.KEY_GLOBAL_HORIZONTAL_BG_HEIGHT, Constants.Name.DEFAULT_HEIGHT, "getGlobalHeightApV2", "(Ljava/lang/Integer;Ljava/lang/Integer;I)I", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xoy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xoy INSTANCE;

    static {
        kge.a(-1588300663);
        INSTANCE = new xoy();
    }

    private xoy() {
    }

    @JvmStatic
    public static final int a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        Integer num = null;
        Integer d = str != null ? n.d(str) : null;
        if (str2 != null) {
            num = n.d(str2);
        }
        return a(d, num, i);
    }

    @JvmStatic
    public static final int a(Integer num, Integer num2, int i) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3598ceee", new Object[]{num, num2, new Integer(i)})).intValue();
        }
        if (c.c()) {
            if (c.e() && num2 != null) {
                return num2.intValue();
            }
            if (num != null) {
                i = num.intValue();
            }
        } else if (c.q()) {
            if (num2 != null) {
                intValue = num2.intValue() + 55;
            } else {
                intValue = num != null ? num.intValue() : i;
            }
            if (num != null) {
                i = num.intValue() + 200;
            }
            int i2 = i;
            Application application = Globals.getApplication();
            return l.q(application) == 0 ? gbg.b(application) > gbg.c(application) ? intValue + 20 : intValue : i2;
        } else if (num != null) {
            i = num.intValue();
        }
        return i;
    }
}
