package com.taobao.android.preview;

import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.expression.event.DXCheckBoxEvent;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import tb.fxa;
import tb.kge;

/* loaded from: classes6.dex */
public class DXPreviewInterfaceImpl implements DXTemplatePreviewActivity.DXPreviewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1776325505);
        kge.a(1293529562);
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(final bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
            return;
        }
        Log.e("shandian", "反射调用previewEngineDidInitialized");
        bdVar.a(fxa.a("test"), new h() { // from class: com.taobao.android.preview.DXPreviewInterfaceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
            public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                if (dXEvent instanceof DXCheckBoxEvent) {
                    String str = "checked=" + ((DXCheckBoxEvent) dXEvent).isChecked();
                }
                String str2 = null;
                if (objArr != null) {
                    str2 = objArr.toString();
                }
                Toast.makeText(bd.e(), "收到点击 参数为: " + str2, 0).show();
            }
        });
    }
}
