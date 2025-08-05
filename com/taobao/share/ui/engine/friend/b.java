package com.taobao.share.ui.engine.friend;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_HANDLER_CLASS_NAME = "com.taobao.tao.contact.ShareToContactHandler";

    /* renamed from: a  reason: collision with root package name */
    private a f19666a;

    /* loaded from: classes8.dex */
    public interface a {
        void shareToContact(ContactInfo contactInfo);
    }

    /* renamed from: com.taobao.share.ui.engine.friend.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0812b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f19667a;

        static {
            kge.a(-1342767342);
            f19667a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("42a2e013", new Object[0]) : f19667a;
        }
    }

    static {
        kge.a(1575252107);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("42a2e013", new Object[0]) : C0812b.a();
    }

    public void a(ContactInfo contactInfo) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f19666a == null) {
            this.f19666a = (a) Class.forName(SHARE_HANDLER_CLASS_NAME).newInstance();
        }
        a aVar = this.f19666a;
        if (aVar != null) {
            aVar.shareToContact(contactInfo);
        }
    }
}
