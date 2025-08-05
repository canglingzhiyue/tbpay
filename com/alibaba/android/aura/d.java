package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, List<IAURAInputField>> f2122a = new ConcurrentHashMap();

    static {
        kge.a(838548723);
    }

    public <DATA> void a(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb68a486", new Object[]{this, iAURAInputField});
            return;
        }
        Class targetClass = iAURAInputField.getTargetClass();
        List<IAURAInputField> list = this.f2122a.get(targetClass);
        if (list == null) {
            list = new ArrayList<>();
            this.f2122a.put(targetClass, list);
        }
        Iterator<IAURAInputField> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IAURAInputField next = it.next();
            if (next.getClass() == iAURAInputField.getClass()) {
                list.remove(next);
                ard a2 = arc.a();
                a2.a("AURAExtInputPool", "push", "remove duplicate,sourceInputField=" + iAURAInputField.getFieldName());
                break;
            }
        }
        list.add(iAURAInputField);
    }

    public IAURAInputField a(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAInputField) ipChange.ipc$dispatch("6139c175", new Object[]{this, cls, str});
        }
        List<IAURAInputField> list = this.f2122a.get(cls);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (IAURAInputField iAURAInputField : list) {
            if (str.equals(iAURAInputField.getFieldName())) {
                return iAURAInputField;
            }
        }
        return null;
    }
}
