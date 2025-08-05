package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bi extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(674705843);
        }

        public static void a(bi biVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5547b8c", new Object[]{biVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(biVar, result);
        }
    }

    void a(ContactsQueryResult contactsQueryResult);
}
