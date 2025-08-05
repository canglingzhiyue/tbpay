package com.android.taobao.safeclean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public interface c<T> {

    /* loaded from: classes3.dex */
    public static class b implements c<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1157194206);
            kge.a(-984496938);
        }

        @Override // com.android.taobao.safeclean.c
        public boolean a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
            }
            return false;
        }
    }

    boolean a(T t, T t2);

    /* renamed from: com.android.taobao.safeclean.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0206c implements c<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1656327698);
            kge.a(-984496938);
        }

        @Override // com.android.taobao.safeclean.c
        public boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements c<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1617874616);
            kge.a(-984496938);
        }

        @Override // com.android.taobao.safeclean.c
        public boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2);
        }
    }
}
