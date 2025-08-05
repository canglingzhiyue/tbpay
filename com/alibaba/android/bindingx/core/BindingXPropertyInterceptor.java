package com.alibaba.android.bindingx.core;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.android.bindingx.core.i;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class BindingXPropertyInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BindingXPropertyInterceptor sInstance;
    private final Handler sUIHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<a> mPropertyInterceptors = new CopyOnWriteArrayList<>();

    /* loaded from: classes2.dex */
    public interface a {
    }

    public static /* synthetic */ CopyOnWriteArrayList access$000(BindingXPropertyInterceptor bindingXPropertyInterceptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("c07768ef", new Object[]{bindingXPropertyInterceptor}) : bindingXPropertyInterceptor.mPropertyInterceptors;
    }

    static {
        kge.a(-635587992);
        sInstance = new BindingXPropertyInterceptor();
    }

    private BindingXPropertyInterceptor() {
    }

    public static BindingXPropertyInterceptor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BindingXPropertyInterceptor) ipChange.ipc$dispatch("f9f755db", new Object[0]) : sInstance;
    }

    public void addInterceptor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0605091", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.mPropertyInterceptors.add(aVar);
        }
    }

    public boolean removeInterceptor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2beb1278", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        return this.mPropertyInterceptors.remove(aVar);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mPropertyInterceptors.clear();
        }
    }

    public void performIntercept(final View view, final String str, final Object obj, final i.b bVar, final Map<String, Object> map, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b4fb2b", new Object[]{this, view, str, obj, bVar, map, objArr});
        } else if (this.mPropertyInterceptors.isEmpty()) {
        } else {
            this.sUIHandler.post(new j(new Runnable() { // from class: com.alibaba.android.bindingx.core.BindingXPropertyInterceptor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = BindingXPropertyInterceptor.access$000(BindingXPropertyInterceptor.this).iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }));
        }
    }

    public void clearCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273508", new Object[]{this});
        } else {
            this.sUIHandler.removeCallbacksAndMessages(null);
        }
    }

    public List<a> getInterceptors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ce4b9afc", new Object[]{this}) : Collections.unmodifiableList(this.mPropertyInterceptors);
    }
}
