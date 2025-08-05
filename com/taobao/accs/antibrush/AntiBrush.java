package com.taobao.accs.antibrush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.concurrent.ScheduledFuture;
import tb.kge;

/* loaded from: classes.dex */
public class AntiBrush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    private static final String ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    public static final int STATUS_BRUSH = 419;
    private static final String TAG = "AntiBrush";
    private static String mHost;
    private static volatile boolean mIsInCheckCodeActivity;
    private static ScheduledFuture<?> mTimeoutTask;
    private BroadcastReceiver mAntiAttackReceiver = null;
    private Context mContext;

    public static /* synthetic */ Context access$000(AntiBrush antiBrush) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("174da46b", new Object[]{antiBrush}) : antiBrush.mContext;
    }

    static {
        kge.a(317921367);
        mIsInCheckCodeActivity = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(3:19|20|(4:22|(1:24)(1:38)|25|(2:27|(9:29|(1:31)|32|(1:34)(1:37)|35|9|10|(1:14)|16))))|8|9|10|(2:12|14)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        r8 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkAntiBrush(java.net.URL r8, java.util.Map<java.lang.Integer, java.lang.String> r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.accs.antibrush.AntiBrush.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "7e950e33"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1f:
            java.lang.String r0 = "AntiBrush"
            if (r9 == 0) goto La8
            android.content.Context r1 = r7.mContext     // Catch: java.lang.Throwable -> La5
            boolean r1 = com.taobao.accs.utl.UtilityImpl.isForeground(r1)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto La8
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r1 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_STATUS     // Catch: java.lang.Throwable -> La5
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La5
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L43
            r1 = 0
            goto L4b
        L43:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La5
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> La5
        L4b:
            r4 = 419(0x1a3, float:5.87E-43)
            if (r1 != r4) goto La8
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r1 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_LOCATION     // Catch: java.lang.Throwable -> La5
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> La5
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> La5
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> La5
            if (r1 != 0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
            r1.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "start anti bursh location:"
            r1.append(r4)     // Catch: java.lang.Throwable -> La5
            r1.append(r9)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La5
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            com.taobao.accs.utl.ALog.e(r0, r1, r4)     // Catch: java.lang.Throwable -> La5
            r7.handleantiBrush(r9)     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.ScheduledFuture<?> r9 = com.taobao.accs.antibrush.AntiBrush.mTimeoutTask     // Catch: java.lang.Throwable -> La5
            r1 = 0
            if (r9 == 0) goto L8b
            java.util.concurrent.ScheduledFuture<?> r9 = com.taobao.accs.antibrush.AntiBrush.mTimeoutTask     // Catch: java.lang.Throwable -> La5
            r9.cancel(r2)     // Catch: java.lang.Throwable -> La5
            com.taobao.accs.antibrush.AntiBrush.mTimeoutTask = r1     // Catch: java.lang.Throwable -> La5
        L8b:
            com.taobao.accs.antibrush.AntiBrush$1 r9 = new com.taobao.accs.antibrush.AntiBrush$1     // Catch: java.lang.Throwable -> La5
            r9.<init>()     // Catch: java.lang.Throwable -> La5
            r4 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.ScheduledFuture r9 = com.taobao.accs.common.a.a(r9, r4, r6)     // Catch: java.lang.Throwable -> La5
            com.taobao.accs.antibrush.AntiBrush.mTimeoutTask = r9     // Catch: java.lang.Throwable -> La5
            if (r8 != 0) goto L9e
            goto La2
        L9e:
            java.lang.String r1 = r8.getHost()     // Catch: java.lang.Throwable -> La5
        La2:
            com.taobao.accs.antibrush.AntiBrush.mHost = r1     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r8 = move-exception
            r2 = 0
            goto Lcb
        La8:
            r2 = 0
        La9:
            java.lang.String r8 = com.taobao.accs.client.GlobalClientInfo.mCookieSec     // Catch: java.lang.Throwable -> Lca
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lca
            if (r8 != 0) goto Ld2
            java.lang.String r8 = com.taobao.accs.antibrush.AntiBrush.mHost     // Catch: java.lang.Throwable -> Lca
            java.lang.String r8 = com.taobao.accs.antibrush.a.a(r8)     // Catch: java.lang.Throwable -> Lca
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Lca
            if (r8 == 0) goto Ld2
            java.lang.String r8 = "cookie invalid, clear"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lca
            com.taobao.accs.utl.ALog.e(r0, r8, r9)     // Catch: java.lang.Throwable -> Lca
            android.content.Context r8 = r7.mContext     // Catch: java.lang.Throwable -> Lca
            com.taobao.accs.utl.UtilityImpl.clearCookie(r8)     // Catch: java.lang.Throwable -> Lca
            goto Ld2
        Lca:
            r8 = move-exception
        Lcb:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r1 = "checkAntiBrush error"
            com.taobao.accs.utl.ALog.e(r0, r1, r8, r9)
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.antibrush.AntiBrush.checkAntiBrush(java.net.URL, java.util.Map):boolean");
    }

    public AntiBrush(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static void onResult(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c22faf", new Object[]{context, new Boolean(z)});
            return;
        }
        mIsInCheckCodeActivity = false;
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", 104);
        intent.putExtra(Constants.KEY_ANTI_BRUSH_RET, z);
        c.a().b(context, intent);
        ScheduledFuture<?> scheduledFuture = mTimeoutTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            mTimeoutTask = null;
        }
        String str = mHost;
        if (str == null) {
            return;
        }
        UtilityImpl.storeCookie(context, a.a(str));
    }

    private void handleantiBrush(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3842e61", new Object[]{this, str});
        } else if (mIsInCheckCodeActivity) {
            ALog.e(TAG, "handleantiBrush return", "mIsInCheckCodeActivity", Boolean.valueOf(mIsInCheckCodeActivity));
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction(ANTI_ATTACK_ACTION);
                intent.setPackage(this.mContext.getPackageName());
                intent.setFlags(268435456);
                intent.putExtra(HttpConstant.LOCATION, str);
                ALog.e(TAG, "handleAntiBrush:", new Object[0]);
                this.mContext.startActivity(intent);
                mIsInCheckCodeActivity = true;
                if (this.mAntiAttackReceiver == null) {
                    this.mAntiAttackReceiver = new AntiReceiver();
                }
                this.mContext.registerReceiver(this.mAntiAttackReceiver, new IntentFilter(ANTI_ATTACK_RESULT_ACTION));
            } catch (Throwable th) {
                ALog.e(TAG, "handleantiBrush", th, new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class AntiReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-352372034);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    String stringExtra = intent.getStringExtra("Result");
                    ALog.e(AntiBrush.TAG, "anti onReceive result: " + stringExtra, new Object[0]);
                    AntiBrush.onResult(GlobalClientInfo.getContext(), stringExtra.equalsIgnoreCase("success"));
                } catch (Exception e) {
                    ALog.e(AntiBrush.TAG, "anti onReceive", e, new Object[0]);
                    AntiBrush.onResult(GlobalClientInfo.getContext(), false);
                }
            } catch (Throwable th) {
                AntiBrush.onResult(GlobalClientInfo.getContext(), false);
                throw th;
            }
        }
    }
}
