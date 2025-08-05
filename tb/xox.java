package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bi;
import com.taobao.android.tbtheme.c;
import com.taobao.android.tbtheme.p;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/ultron/dinamicX/MtbDarkModeStrategy;", "Lcom/taobao/android/dinamicx/IDXDarkModeInterface;", "()V", "disableDarkModeColorMap", "", "disableForceDark", "", "view", "Landroid/view/View;", "isDark", "context", "Landroid/content/Context;", "switchDarkModeColor", "", "drawType", "color", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xox implements bi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1966750586);
        kge.a(538507830);
    }

    @Override // com.taobao.android.dinamicx.bi
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.bi
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : p.a(context);
    }

    @Override // com.taobao.android.dinamicx.bi
    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0) {
            return c.a(0, i2);
        }
        if (i == 1) {
            return c.a(2, i2);
        }
        return c.a(3, i2);
    }
}
