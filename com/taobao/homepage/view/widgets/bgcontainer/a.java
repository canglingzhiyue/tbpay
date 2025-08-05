package com.taobao.homepage.view.widgets.bgcontainer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.j;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_COMPLEX_TEXTURE = "isComplexTexture";

    static {
        kge.a(-426492177);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : j.b() && com.taobao.tao.homepage.revision.a.a().e();
    }

    public static boolean b() {
        ThemeData b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!a() || (b = j.a().b("homepage")) == null) {
            return false;
        }
        return Boolean.parseBoolean(b.isComplexTexture);
    }
}
