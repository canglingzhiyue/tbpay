package com.taobao.android.detail.core.async;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface b {
        void a(View view, boolean z, int i);
    }

    static {
        kge.a(-1948834279);
    }

    public a() {
        emu.a("com.taobao.android.detail.core.async.AsyncLayoutInflater");
    }

    public void a(ArrayList<Integer> arrayList, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e68f6a", new Object[]{this, arrayList, bVar});
        } else {
            a(arrayList, false, bVar);
        }
    }

    public void a(ArrayList<Integer> arrayList, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f88d9fa", new Object[]{this, arrayList, new Boolean(z), bVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = arrayList.get(i).intValue();
            View view = null;
            try {
                view = new C0365a(new f(Globals.getApplication())).inflate(intValue, (ViewGroup) null, false);
            } catch (Throwable th) {
                String a2 = com.taobao.android.detail.core.performance.a.a("AsyncLayoutInflater");
                i.c(a2, "Layout异步加载失败，" + Log.getStackTraceString(th));
            }
            bVar.a(view, z, intValue);
            String a3 = com.taobao.android.detail.core.performance.a.a("AsyncLayoutInflater");
            i.c(a3, "Layout异步加载成功, layout=" + Globals.getApplication().getResources().getResourceEntryName(intValue));
        }
        String a4 = com.taobao.android.detail.core.performance.a.a("AsyncLayoutInflater");
        i.c(a4, "inflate total cost=" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: com.taobao.android.detail.core.async.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0365a extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f9373a;

        public static /* synthetic */ Object ipc$super(C0365a c0365a, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        static {
            kge.a(-2068469202);
            f9373a = new String[]{"android.widget.", "android.webkit.", "android.app."};
        }

        public C0365a(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context}) : new C0365a(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : f9373a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }
}
