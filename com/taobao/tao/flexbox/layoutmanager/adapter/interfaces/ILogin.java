package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class ILogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface LoginCallback {
        public static final int LOGIN_CANCEL = 3;
        public static final int LOGIN_FAILED = 2;
        public static final int LOGIN_SUCCESS = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes8.dex */
        public @interface LoginStatus {
        }

        void a(int i);
    }

    static {
        kge.a(1344438796);
    }

    public abstract a a();

    public abstract void a(LoginCallback loginCallback);

    public abstract void b(LoginCallback loginCallback);

    public abstract boolean b();

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f19967a;
        public String b;
        public String c;

        static {
            kge.a(1639748483);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return TextUtils.equals(this.f19967a, ((a) obj).f19967a);
        }

        public static boolean a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eac777f8", new Object[]{aVar, aVar2})).booleanValue();
            }
            if (aVar == aVar2) {
                return true;
            }
            if (aVar != null && aVar2 != null) {
                return aVar.equals(aVar2);
            }
            return false;
        }
    }
}
