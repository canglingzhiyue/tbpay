package com.taobao.mytaobao.homepage.busniess.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    static {
        kge.a(-1672549091);
    }

    /* renamed from: com.taobao.mytaobao.homepage.busniess.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0733a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ID_ORDER_DELIVER = 2;
        public static final int ID_ORDER_PAY = 1;
        public static final int ID_ORDER_RATE = 4;
        public static final int ID_ORDER_RECEIVE = 3;
        public static final int ID_ORDER_REFUND = 5;
        public static final String KEY_ORDER_DELIVER = "order2Deliver";
        public static final String KEY_ORDER_PAY = "order2Pay";
        public static final String KEY_ORDER_RATE = "order2Rate";
        public static final String KEY_ORDER_RECEIVE = "order2Receive";
        public static final String KEY_ORDER_REFUND = "order2Refund";

        /* renamed from: a  reason: collision with root package name */
        public final int f18378a;
        public String b;

        static {
            kge.a(-1258566936);
        }

        public C0733a(int i, String str) {
            this.f18378a = i;
            this.b = str;
        }

        public static ArrayList<C0733a> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[0]);
            }
            ArrayList<C0733a> arrayList = new ArrayList<>();
            arrayList.add(new C0733a(1, KEY_ORDER_PAY));
            arrayList.add(new C0733a(2, KEY_ORDER_DELIVER));
            arrayList.add(new C0733a(3, KEY_ORDER_RECEIVE));
            arrayList.add(new C0733a(4, KEY_ORDER_RATE));
            arrayList.add(new C0733a(5, KEY_ORDER_REFUND));
            return arrayList;
        }
    }
}
