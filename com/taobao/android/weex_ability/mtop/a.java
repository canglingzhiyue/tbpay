package com.taobao.android.weex_ability.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f15945a;
    private InterfaceC0616a b;

    /* renamed from: com.taobao.android.weex_ability.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0616a {
        b a(String str, JSONObject jSONObject);
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(JSONObject jSONObject);
    }

    private a() {
    }

    static {
        kge.a(784701562);
        f15945a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("39439ab3", new Object[0]) : f15945a;
    }

    public void a(InterfaceC0616a interfaceC0616a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a264c010", new Object[]{this, interfaceC0616a});
        } else {
            this.b = interfaceC0616a;
        }
    }

    public b a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("42053fdf", new Object[]{this, str, jSONObject});
        }
        InterfaceC0616a interfaceC0616a = this.b;
        if (interfaceC0616a == null) {
            return null;
        }
        return interfaceC0616a.a(str, jSONObject);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f15946a = null;
        private c b;

        static {
            kge.a(1974488893);
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a265a8ce", new Object[]{this, cVar});
            } else {
                this.b = cVar;
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f6c76fd4", new Object[]{this}) : this.b;
        }
    }
}
