package com.taobao.android.detail.mainpic.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, a> b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, AliUrlImageView> f10161a = new HashMap();

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1729695e", new Object[]{context});
        }
        if (context != null) {
            return a(c(context));
        }
        return null;
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d5a4924c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        a aVar = new a();
        b.put(str, aVar);
        return aVar;
    }

    private static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : context.toString();
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (context == null) {
        } else {
            b(c(context));
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || !b.containsKey(str)) {
        } else {
            b.get(str).a();
            b.remove(str);
        }
    }

    public AliUrlImageView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUrlImageView) ipChange.ipc$dispatch("b579a63f", new Object[]{this, context, str});
        }
        AliUrlImageView aliUrlImageView = this.f10161a.get(str);
        if (aliUrlImageView != null) {
            ViewGroup viewGroup = (ViewGroup) aliUrlImageView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(aliUrlImageView);
            }
            return aliUrlImageView;
        }
        AliUrlImageView aliUrlImageView2 = new AliUrlImageView(context);
        this.f10161a.put(str, aliUrlImageView2);
        return aliUrlImageView2;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f10161a.clear();
        }
    }
}
