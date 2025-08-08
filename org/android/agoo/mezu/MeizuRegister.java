package org.android.agoo.mezu;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.PushManager;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes.dex */
public class MeizuRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MeizuPush";
    private static Context mContext;

    public static void register(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e89372", new Object[]{context, str, str2});
        } else if (context == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            try {
                if (!checkDevice(context)) {
                    ALog.i(TAG, "not meizu return", new Object[0]);
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                mContext = applicationContext;
                if (!UtilityImpl.isMainProcess(applicationContext)) {
                    ALog.i(TAG, "not in main process, return", new Object[0]);
                    return;
                }
                BaseNotifyClickActivity.addNotifyListener(new MeizuMsgParseImpl());
                PushManager.register(mContext, str, str2);
            } catch (Throwable th) {
                ALog.e(TAG, "register", th, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        return android.os.SystemProperties.get("ro.product.other.brand").equalsIgnoreCase("Unisoc");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkDevice(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = org.android.agoo.mezu.MeizuRegister.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r4 = "f20f6c67"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1a:
            java.lang.String r0 = "ro.meizu.product.model"
            java.lang.String r0 = android.os.SystemProperties.get(r0)     // Catch: java.lang.Throwable -> L4e
            boolean r0 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L3e
            java.lang.String r0 = "meizu"
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L3e
            java.lang.String r0 = "22c4185e"
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r2 = 0
        L3e:
            if (r2 != 0) goto L4d
            java.lang.String r0 = "ro.product.other.brand"
            java.lang.String r0 = android.os.SystemProperties.get(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "Unisoc"
            boolean r2 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L4e
        L4d:
            return r2
        L4e:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "MeizuPush"
            java.lang.String r3 = "checkDevice"
            com.taobao.accs.utl.ALog.e(r2, r3, r0, r1)
            boolean r4 = com.meizu.cloud.pushsdk.util.MzSystemUtils.isBrandMeizu(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.mezu.MeizuRegister.checkDevice(android.content.Context):boolean");
    }

    /* loaded from: classes.dex */
    public static class MeizuMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String getMsgSource() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fdc22e73", new Object[]{this}) : "meizu";
        }

        @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
        public String parseMsgFromIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1fcbdd08", new Object[]{this, intent});
            }
            String str = null;
            if (intent == null) {
                ALog.e(MeizuRegister.TAG, "parseMsgFromIntent null", new Object[0]);
                return null;
            }
            try {
                str = intent.getStringExtra(AgooConstants.MESSAGE_MEIZU_PAYLOAD);
                ALog.i(MeizuRegister.TAG, "parseMsgFromIntent", "msg", str);
                return str;
            } catch (Throwable th) {
                ALog.e(MeizuRegister.TAG, "parseMsgFromIntent", th, new Object[0]);
                return str;
            }
        }
    }
}
