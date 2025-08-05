package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.room.utils.n;

/* loaded from: classes5.dex */
public class xjr extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_BOTTOM_CARD_HIDE = "bottomCardHide";
    public static final String ACTION_BOTTOM_CARD_SWITCH = "bottomCardSwitch";
    public static final String ACTION_TRAIN_BOTTOM_CARD_CLICK = "trainBottomCardClick";
    public static final long DX_EVENT_TAOLIVEHOTRESERVATIONCARDACTION = -9013596898127648120L;

    static {
        kge.a(-1201031361);
    }

    public static /* synthetic */ Object ipc$super(xjr xjrVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return;
            }
            String str = (String) obj;
            a a2 = n.a();
            String G = a2 == null ? null : a2.G();
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1406795963) {
                if (hashCode != -433494083) {
                    if (hashCode == 352030447 && str.equals(ACTION_BOTTOM_CARD_SWITCH)) {
                        c = 0;
                    }
                } else if (str.equals(ACTION_BOTTOM_CARD_HIDE)) {
                    c = 1;
                }
            } else if (str.equals(ACTION_TRAIN_BOTTOM_CARD_CLICK)) {
                c = 2;
            }
            if (c == 0) {
                ddw.a().a(xkw.d, ACTION_BOTTOM_CARD_SWITCH, G);
            } else if (c == 1) {
                ddw.a().a(xkw.d, ACTION_BOTTOM_CARD_HIDE, G);
            } else if (c != 2 || objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) {
            } else {
                String string = ((JSONObject) objArr[1]).getString("jumpUrl");
                if (string != null) {
                    Nav.from(dXRuntimeContext.m()).toUri(string);
                }
                ddw.a().a(xkw.d, ACTION_TRAIN_BOTTOM_CARD_CLICK, G);
            }
        }
    }
}
