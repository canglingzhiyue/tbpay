package com.taobao.share.core.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.share.aidl.IShareCopy;
import com.taobao.share.clipboard.a;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import tb.kge;
import tb.nym;

/* loaded from: classes8.dex */
public class ShareCopyService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IShareCopy.Stub f19618a;

    static {
        kge.a(-1689379771);
    }

    public ShareCopyService() {
        f.a("com.taobao.clipboard_share", "com.taobao.share.core.services.ShareCopyService");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
        this.f19618a = new IShareCopy.Stub() { // from class: com.taobao.share.core.services.ShareCopyService.1
            @Override // com.taobao.share.aidl.IShareCopy
            public boolean copyToClipboard(String str, String str2, String str3, String str4) throws RemoteException {
                return ShareCopyService.a(nym.a().getApplicationContext(), str, str2, str3, str4);
            }
        };
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.f19618a;
    }

    public static boolean a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fc748c", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        String a2 = a(str, str3, str4);
        if (!StringUtils.isEmpty(str4)) {
            e.b().a(str4);
        } else {
            e.b().a("other");
        }
        return a(context, str, str2, a2);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (!StringUtils.isEmpty(str2)) {
            str2 = ShareServiceApi.urlBackFlow(str, "GoodsTitleURL", str2);
        }
        if ("item".equals(str3) || (!StringUtils.isEmpty(str2) && str2.contains("sourceType=item"))) {
            TBS.Ext.commitEvent(5002, str, "GoodsTitleURL", str2);
        } else {
            StringUtils.isEmpty(str2);
        }
        return str2;
    }

    public static boolean a(final Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f3f1e42", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (StringUtils.isEmpty(str3)) {
            a.a(context, str2);
            ShareBizAdapter.getInstance().getAppEnv().b(str2);
            Handler handler = new Handler(context.getMainLooper());
            if (!StringUtils.isEmpty(str) && str.contains("noToast")) {
                return true;
            }
            handler.post(new Runnable() { // from class: com.taobao.share.core.services.ShareCopyService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(context, b.a(R.string.app_copy_success), 0).show();
                    }
                }
            });
        } else {
            com.taobao.share.taopassword.genpassword.model.a aVar = new com.taobao.share.taopassword.genpassword.model.a();
            aVar.a(str);
            aVar.c(str3.replace(" ", ""));
            aVar.d("copy");
            aVar.e(e.b().c());
            aVar.b(str2);
            ShareBizAdapter.getInstance().getShareEngine().getShareBizEngine().a(aVar);
        }
        return true;
    }
}
