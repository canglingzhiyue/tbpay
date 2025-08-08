package com.taobao.share.aidl;

import android.content.Context;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.clipboard.a;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class ShareCopy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShareCopy";

    static {
        kge.a(296728088);
    }

    @Deprecated
    public static boolean copyToClipboard(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d36dd67", new Object[]{context, str, str2, str3, str4})).booleanValue() : doCopy(context, str, str2, str3, str4);
    }

    public static boolean doCopy(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe5c5ad", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        String tbsForItemCopy = tbsForItemCopy(str, str3, str4);
        if (!StringUtils.isEmpty(str4)) {
            e.b().a(str4);
        } else {
            e.b().a("other");
        }
        return doCopyDirectory(context, str, str2, tbsForItemCopy);
    }

    @Deprecated
    public static boolean doCopy(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316d25a3", new Object[]{context, str, str2, str3})).booleanValue();
        }
        String tbsForItemCopy = tbsForItemCopy(str, str3, null);
        if (StringUtils.isEmpty(str2)) {
            nyy.a(TAG, b.a(R.string.taobao_app_1010_1_18296));
            return false;
        }
        return doCopyDirectory(context, str, str2, tbsForItemCopy);
    }

    public static String tbsForItemCopy(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e1288f", new Object[]{str, str2, str3});
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

    public static boolean doCopyDirectory(final Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36408376", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (StringUtils.isEmpty(str3)) {
            a.a(context, str2);
            ShareBizAdapter.getInstance().getAppEnv().b(str2);
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.taobao.share.aidl.ShareCopy.1
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
