package com.taobao.share.ui.engine.friend;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTACTS_HANDLER_CLASS_NAME = "com.taobao.tao.contact.ContactsInfoHandler";
    public static final String CONTACTS_INFO_EMPTY_STATUS = "exception";
    public static final String CONTACTS_INFO_KEY = "contacstInfo";
    public static final String CONTACTS_INFO_NOT_EMPTY_STATUS = "drawable";
    public static final String CONTACTS_INFO_STATUS_KEY = "dataStatus";

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0811a f19664a;
    private WVCallBackContext b;

    /* renamed from: com.taobao.share.ui.engine.friend.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0811a {
        void getContactsInfo();
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f19665a;

        static {
            kge.a(-1818523177);
            f19665a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("42a2dff4", new Object[0]) : f19665a;
        }
    }

    static {
        kge.a(-1903313520);
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("42a2dff4", new Object[0]) : b.a();
    }

    public void b() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f19664a == null) {
            this.f19664a = (InterfaceC0811a) Class.forName(CONTACTS_HANDLER_CLASS_NAME).newInstance();
        }
        InterfaceC0811a interfaceC0811a = this.f19664a;
        if (interfaceC0811a != null) {
            interfaceC0811a.getContactsInfo();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        r rVar = new r();
        rVar.a(CONTACTS_INFO_KEY, str);
        if (TextUtils.isEmpty(str)) {
            rVar.a(CONTACTS_INFO_STATUS_KEY, "exception");
        } else {
            rVar.a(CONTACTS_INFO_STATUS_KEY, CONTACTS_INFO_NOT_EMPTY_STATUS);
        }
        rVar.b();
        this.b.success(rVar);
        nyy.b("ContactsInfoManager", "callback wvCallbackContext not null, data: " + rVar.d());
    }

    public void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
        } else {
            this.b = wVCallBackContext;
        }
    }
}
