package com.taobao.mytaobao.newsetting;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.c;
import com.taobao.tao.Globals;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(294498917);
    }

    public void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        application.getSharedPreferences("fontSetting", 0);
        com.taobao.android.dinamicx.monitor.c.a().a(new c.a() { // from class: com.taobao.mytaobao.newsetting.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.monitor.c.a
            public double a(double d) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a82180c4", new Object[]{this, new Double(d)})).doubleValue() : FontSetting.a(d);
            }

            @Override // com.taobao.android.dinamicx.monitor.c.a
            public int a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : FontSetting.c(application);
            }

            @Override // com.taobao.android.dinamicx.monitor.c.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    FontSetting.setFontCofficient(Globals.getApplication(), i, "DX_preview_page");
                }
            }
        });
    }
}
