package com.taobao.share.core;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.obl;

/* loaded from: classes8.dex */
public class ContactsApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHARE_MODULE = "share";
    private static final String STORAGE_PERMISSION_POINT = "share_write_storage_permission";

    static {
        kge.a(-1664939120);
    }

    public static /* synthetic */ Object ipc$super(ContactsApplication contactsApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TLog.loge("PanguApplication", "ContactsApplication onCreate");
        ShareBizAdapter.getInstance().getAppEnv().a(this);
        try {
            c.a("com.taobao.wangxin", null);
        } catch (Throwable th) {
            TLog.loge("ContactsApplication", th.toString());
        }
        final Context applicationContext = getApplicationContext();
        if (obl.a(new obl.a() { // from class: com.taobao.share.core.ContactsApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.obl.a
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ContextCompat.checkSelfPermission(applicationContext, str) == 0;
            }
        })) {
            AppMonitor.Alarm.commitSuccess("share", STORAGE_PERMISSION_POINT);
        } else {
            AppMonitor.Alarm.commitFail("share", STORAGE_PERMISSION_POINT, "", "");
        }
    }
}
