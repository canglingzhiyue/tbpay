package com.taobao.android.detail2.core.framework.secondpage;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class SecondPageFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<SecondPageType, Class<? extends a>> b;

    /* renamed from: a  reason: collision with root package name */
    private Context f11563a;
    private Map<SecondPageType, a> c = new HashMap();

    /* loaded from: classes5.dex */
    public enum SecondPageType {
        GG_PROFILE
    }

    static {
        kge.a(-1052615077);
        b = new HashMap();
    }

    public SecondPageFactory(Context context) {
        this.f11563a = context;
    }

    public static void a(SecondPageType secondPageType, Class<? extends a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8851944a", new Object[]{secondPageType, cls});
        } else if (secondPageType == null || cls == null) {
        } else {
            fjt.a(fjt.TAG_SECOND_PAGE, "注册二级页类，二级页类型" + secondPageType + "，二级页类名" + cls.getName());
            b.put(secondPageType, cls);
        }
    }

    public a a(SecondPageType secondPageType) {
        a aVar;
        if (secondPageType == null) {
            return null;
        }
        a aVar2 = this.c.get(secondPageType);
        if (aVar2 != null) {
            return aVar2;
        }
        Class<? extends a> cls = b.get(secondPageType);
        if (cls == null) {
            return null;
        }
        try {
            aVar = cls.getConstructor(Context.class).newInstance(this.f11563a);
            try {
                this.c.put(secondPageType, aVar);
            } catch (Exception e) {
                e = e;
                fjt.a("new_detail异常", "创建二级页对象异常", e);
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e2) {
            e = e2;
            aVar = aVar2;
        }
        return aVar;
    }
}
