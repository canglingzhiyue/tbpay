package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kzi extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SETCARDMODELEXTEVENTHANDER = -2193526156955095466L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2) {
            c.a("SetCardModelExt ", "dx args is null");
        } else {
            kyu b = b.b(dXRuntimeContext);
            IPopData c = b.c(dXRuntimeContext);
            if (b == null || c == null) {
                c.a("SetCardModelExt ", "engine or popData is null");
                return;
            }
            String str = null;
            String obj = objArr[0] == null ? null : objArr[0].toString();
            String obj2 = objArr[1] == null ? null : objArr[1].toString();
            if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2)) {
                c.a("SetCardModelExt ", "args key or sectionBizCode is null");
                return;
            }
            if (objArr.length > 2 && objArr[2] != null) {
                str = objArr[2].toString();
            }
            b.d().a(obj, obj2, str);
            c.a("SetCardModelExt ", "set " + obj + ", key=" + obj2 + ", value=" + str);
        }
    }
}
