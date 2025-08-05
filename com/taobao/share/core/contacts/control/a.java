package com.taobao.share.core.contacts.control;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.common.ContactsListController;
import com.taobao.contacts.common.ContactsMgr;
import com.taobao.contacts.data.member.ContactMember;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f19614a;
    private ContactsMgr b;
    private ContactsListController c;
    private boolean d = true;

    static {
        kge.a(-2083886030);
    }

    public a(Context context) {
        this.f19614a = context;
        this.b = ContactsMgr.instance(context.getApplicationContext());
        this.c = new ContactsListController(context.getApplicationContext(), this.b);
    }

    public void a(ArrayList<ContactMember> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        } else {
            this.c.saveRecentShare(arrayList);
        }
    }
}
