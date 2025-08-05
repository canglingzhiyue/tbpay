package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.manager.e;
import com.taobao.tbpoplayer.nativerender.d;
import com.taobao.tbpoplayer.nativerender.i;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class ipe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(785807971);
    }

    public ipe(Context context, WidgetContentData widgetContentData, ipc ipcVar) {
        a(context, widgetContentData, ipcVar);
    }

    public void a(Context context, WidgetContentData widgetContentData, final ipc ipcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fd3e50", new Object[]{this, context, widgetContentData, ipcVar});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(d.WIDGET_SWITCH_ENABLE_NEW_CORNER_RADIUS, String.valueOf(e.k(context)));
        hashMap.put(d.WIDGET_SWITCH_ENABLE_CORNER_RADIUS, String.valueOf(e.j(context)));
        new i(context, widgetContentData.getDslContent(), widgetContentData.getDataContent(), hashMap, new i.a() { // from class: tb.ipe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tbpoplayer.nativerender.i.a
            public void a(String str, List<String> list, int i, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ffffdc84", new Object[]{this, str, list, new Integer(i), new Long(j)});
                } else {
                    kif.a("[renderDsl] onRenderStart");
                }
            }

            @Override // com.taobao.tbpoplayer.nativerender.i.a
            public void a(View view, Bitmap bitmap, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71d432ce", new Object[]{this, view, bitmap, str});
                    return;
                }
                kif.a("[renderDsl] onRenderSuccess");
                ipc ipcVar2 = ipcVar;
                if (ipcVar2 == null) {
                    return;
                }
                ipcVar2.a(bitmap, str);
            }

            @Override // com.taobao.tbpoplayer.nativerender.i.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                kif.a("[renderDsl] onRenderFailed code:" + str + ",msg:" + str2);
                ipc ipcVar2 = ipcVar;
                if (ipcVar2 == null) {
                    return;
                }
                ipcVar2.a(str, str2);
            }
        }).a();
    }
}
