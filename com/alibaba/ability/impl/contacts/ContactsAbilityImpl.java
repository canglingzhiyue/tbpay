package com.alibaba.ability.impl.contacts;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import com.alibaba.ability.impl.TransParentActivity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsContactsAbility;
import com.taobao.android.abilityidl.ability.ContactsQueryResult;
import com.taobao.android.abilityidl.ability.ContactsResult;
import com.taobao.android.abilityidl.ability.bh;
import com.taobao.android.abilityidl.ability.bi;
import com.taobao.android.abilityidl.ability.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class ContactsAbilityImpl extends AbsContactsAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(290137636);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContactsAbility
    public void choose(als context, bh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398aab35", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
        } else if (ActivityCompat.checkSelfPermission(f, "android.permission.READ_CONTACTS") != 0) {
            callback.a(new ErrorResult("NO_PERMISSION", "no permission", (Map) null, 4, (o) null));
        } else {
            TransParentActivity.Companion.a(new Intent(f, TransParentActivity.class), f, new c(callback));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContactsAbility
    public void query(als context, r queryParam, bi callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abfb9e0", new Object[]{this, context, queryParam, callback});
            return;
        }
        q.d(context, "context");
        q.d(queryParam, "queryParam");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            callback.a(a$a.Companion.b("context is null"));
        } else if (ActivityCompat.checkSelfPermission(f, "android.permission.READ_CONTACTS") != 0) {
            callback.a(new ErrorResult("NO_PERMISSION", "no permission", (Map) null, 4, (o) null));
        } else {
            String str = queryParam.f8893a;
            String str2 = queryParam.b;
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                String str4 = str2;
                if (str4 != null && str4.length() != 0) {
                    z = false;
                }
                if (z) {
                    a$a.a aVar = a$a.Companion;
                    callback.a(aVar.b("name:" + str + ",phone:" + str2));
                    return;
                }
            }
            List<a> a2 = b.a(f, null, str, str2, callback);
            if (a2 == null) {
                ContactsQueryResult contactsQueryResult = new ContactsQueryResult();
                contactsQueryResult.contacts = new ArrayList();
                t tVar = t.INSTANCE;
                callback.a(contactsQueryResult);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar2 : a2) {
                ContactsResult contactsResult = new ContactsResult();
                String str5 = aVar2.f1873a;
                if (str5 == null) {
                    str5 = "";
                }
                contactsResult.name = str5;
                String str6 = aVar2.b;
                if (str6 == null) {
                    str6 = "";
                }
                contactsResult.phone = str6;
                arrayList.add(contactsResult);
            }
            ContactsQueryResult contactsQueryResult2 = new ContactsQueryResult();
            contactsQueryResult2.contacts = arrayList;
            callback.a(contactsQueryResult2);
        }
    }
}
