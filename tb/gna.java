package tb;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.weex.common.Constants;
import java.util.Map;

/* loaded from: classes5.dex */
public class gna extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTSEARCHFOCUS = 6535997198639430927L;

    static {
        kge.a(2000193962);
    }

    public static /* synthetic */ Object ipc$super(gna gnaVar, String str, Object... objArr) {
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
        final JSONObject fields;
        final EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        View v = dXRuntimeContext.v();
        DMComponent dMComponent = (DMComponent) ((Map) dXRuntimeContext.a()).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        bbz a2 = bdn.a(dXRuntimeContext);
        if (dMComponent == null || a2 == null || (fields = dMComponent.getFields()) == null || !fields.getBooleanValue(Constants.Event.FOCUS) || (editText = (EditText) v.findViewWithTag("editText")) == null) {
            return;
        }
        editText.post(new Runnable() { // from class: tb.gna.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                InputMethodManager inputMethodManager;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (editText.requestFocus() && (inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method")) != null) {
                    inputMethodManager.showSoftInput(editText, 1);
                }
                fields.put(Constants.Event.FOCUS, (Object) "false");
            }
        });
    }
}
