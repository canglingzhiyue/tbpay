package com.alipay.android.msp.biz.substitute;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.track.MspTrackInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.phone.wallet.spmtracker.SpmTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import java.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class SpmHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AP_LINK_SPM_BECOME_ACTIVE = "a283.b16116.c305126.d311583";
    public static final String AP_LINK_SPM_FIRST_NET_RESPONSE = "a283.b16116.c39778.d308614";
    public static final String AP_LINK_SPM_ON_BACK_KEY_DOWN = "a283.b16116.c325595.d356869";
    public static final String AP_LINK_SPM_PAY_ACTION_END = "a283.b16116.c304038.d308300";
    public static final String AP_LINK_SPM_RESIGN_ACTIVE = "a283.b16116.c305126.d311582";
    public static final String AP_LINK_SPM_RPC_REQUEST = "a283.b16116.c360116.d438348";
    public static final String AP_LINK_SPM_SUBMIT_REQUEST = "a283.b16116.c304037.d308298";
    public static final String AP_LINK_SPM_SUBMIT_RESPONSE = "a283.b16116.c304037.d308299";
    public static final String NEW_BIE_SPM_ID = "a283.b4031";
    public static final String SWITCH_CHANNEL_SPM_ID = "a283.b4037";

    /* renamed from: com.alipay.android.msp.biz.substitute.SpmHelper$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4468a;
        public static final /* synthetic */ int[] b = new int[Page.values().length];

        static {
            try {
                b[Page.Subpay_Paycode.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4468a = new int[Control.values().length];
            try {
                f4468a[Control.Subpay_Channel_Close.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4468a[Control.Subpay_Channel_Friend.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4468a[Control.Subpay_Channel_Paycode.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4468a[Control.Subpay_Channel_Phone.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4468a[Control.Subpay_Channel_ShareToken.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4468a[Control.Subpay_Paycode_BACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4468a[Control.Subpay_Paycode_Download.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum Action {
        Exposure("spm_exposure"),
        Clicked("spm_clicked");
        
        private String mName;

        Action(String str) {
            this.mName = str;
        }

        public final String getName() {
            return this.mName;
        }
    }

    /* loaded from: classes3.dex */
    public enum Control {
        Subpay_Channel_Close,
        Subpay_Channel_Friend,
        Subpay_Channel_Paycode,
        Subpay_Channel_Phone,
        Subpay_Channel_ShareToken,
        Subpay_Paycode_BACK,
        Subpay_Paycode_Download
    }

    /* loaded from: classes3.dex */
    public enum Page {
        Subpay_Paycode
    }

    /* loaded from: classes3.dex */
    public enum PageState {
        Start("spm_page_monitor"),
        End("spm_page_monitor");
        
        private String mState;

        PageState(String str) {
            this.mState = str;
        }

        public final String getState() {
            return this.mState;
        }
    }

    public static void saveControlSpm(Control control, Action action, int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd58183", new Object[]{control, action, new Integer(i), mspWindowFrame});
        } else if (mspWindowFrame == null || action == null || control == null) {
        } else {
            try {
                MspTrackInfo.SpmInfo spmInfo = MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame);
                if (spmInfo == null) {
                    return;
                }
                String str = "-";
                int i2 = AnonymousClass1.f4468a[control.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    if (TextUtils.equals(spmInfo.spmId, NEW_BIE_SPM_ID)) {
                                        str = "a283.b4031.c12990.d23816";
                                    } else if (TextUtils.equals(spmInfo.spmId, SWITCH_CHANNEL_SPM_ID)) {
                                        str = "a283.b4037.c12991.d23821";
                                    }
                                }
                            } else if (TextUtils.equals(spmInfo.spmId, NEW_BIE_SPM_ID)) {
                                str = "a283.b4031.c12990.d23819";
                            } else if (TextUtils.equals(spmInfo.spmId, SWITCH_CHANNEL_SPM_ID)) {
                                str = "a283.b4037.c12991.d23824";
                            }
                        } else if (TextUtils.equals(spmInfo.spmId, NEW_BIE_SPM_ID)) {
                            str = "a283.b4031.c12990.d23818";
                        } else if (TextUtils.equals(spmInfo.spmId, SWITCH_CHANNEL_SPM_ID)) {
                            str = "a283.b4037.c12991.d23823";
                        }
                    } else if (TextUtils.equals(spmInfo.spmId, NEW_BIE_SPM_ID)) {
                        str = "a283.b4031.c12990.d23817";
                    } else if (TextUtils.equals(spmInfo.spmId, SWITCH_CHANNEL_SPM_ID)) {
                        str = "a283.b4037.c12991.d23822";
                    }
                } else if (TextUtils.equals(spmInfo.spmId, NEW_BIE_SPM_ID)) {
                    str = "a283.b4031.c12990.d23820";
                } else if (TextUtils.equals(spmInfo.spmId, SWITCH_CHANNEL_SPM_ID)) {
                    str = "a283.b4037.c12991.d23825";
                }
                if (action == Action.Clicked) {
                    SpmWrapper.onPageClick(mspWindowFrame, str, "pay", FeedbackStore.createSpmSessionId(i, mspWindowFrame), null, i);
                } else if (action != Action.Exposure) {
                } else {
                    SpmWrapper.onPageExposure(mspWindowFrame, str, "pay", null, FeedbackStore.createSpmSessionId(i, mspWindowFrame), null, i);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void saveNativeControlSpm(Activity activity, Control control, Action action, String str, int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974a8b42", new Object[]{activity, control, action, str, new Integer(i), mspWindowFrame});
        } else if (MspContextManager.getInstance().getTradeContextByBizId(i) == null || mspWindowFrame == null || action == null || control == null) {
        } else {
            try {
                if (MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame) == null) {
                    return;
                }
                String str2 = "-";
                int i2 = AnonymousClass1.f4468a[control.ordinal()];
                if (i2 == 6) {
                    str2 = "a283.b5824.c12844.d23535";
                } else if (i2 == 7) {
                    str2 = "a283.b5824.c12844.d23534";
                }
                PhoneCashierMspEngine.getMspUtils().bindSPMLog(activity);
                HashMap hashMap = new HashMap();
                SpmWrapper.updataParam4(i, hashMap);
                if (action == Action.Clicked) {
                    SpmTracker.click(activity, str2, "pay", 2, hashMap);
                } else if (action != Action.Exposure) {
                } else {
                    SpmTracker.expose(activity, str2, "pay", 2, hashMap);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void saveNativePageSpm(Activity activity, Page page, PageState pageState, String str, String str2, int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4088c76", new Object[]{activity, page, pageState, str, str2, new Integer(i), mspWindowFrame});
        } else if (MspContextManager.getInstance().getTradeContextByBizId(i) == null || mspWindowFrame == null || page == null || pageState == null) {
        } else {
            try {
                if (MspTrackInfo.getInstance().getSpmInfo(mspWindowFrame) == null) {
                    return;
                }
                String str3 = "-";
                if (AnonymousClass1.b[page.ordinal()] == 1) {
                    str3 = "a283.b5824";
                }
                PhoneCashierMspEngine.getMspUtils().bindSPMLog(activity);
                if (pageState == PageState.Start) {
                    SpmTracker.onPageCreate(activity, str3);
                    SpmTracker.onPageResume(activity, str3);
                } else if (pageState != PageState.End) {
                } else {
                    HashMap hashMap = new HashMap();
                    SpmWrapper.updataParam4(i, hashMap);
                    SpmTracker.onPagePause(activity, str3, "pay", hashMap);
                    SpmTracker.onPageDestroy(activity);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmExpSubmitRequest(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a36711", new Object[]{mspContext, str});
        } else if (mspContext == null) {
        } else {
            try {
                String apLinkToken = mspContext.getApLinkToken();
                Context context = mspContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("rpcMethod", str);
                }
                SpmTracker.expose(context, AP_LINK_SPM_SUBMIT_REQUEST, mspContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmExpSubmitRequest", "请求前: ".concat(String.valueOf(hashMap)));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmExpSubmitResponse(MspContext mspContext, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7ec33", new Object[]{mspContext, str, str2, str3, new Boolean(z)});
        } else if (mspContext == null) {
        } else {
            try {
                String apLinkToken = mspContext.getApLinkToken();
                Context context = mspContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("rpcMethod", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("rpcNetErr", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("resultEndCode", str3);
                }
                hashMap.put("isSync", String.valueOf(z));
                SpmTracker.expose(context, AP_LINK_SPM_SUBMIT_RESPONSE, mspContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmExpSubmitResponse", "请求前: ".concat(String.valueOf(hashMap)));
                if (FastStartActivityHelper.getBoolConfig(context, DrmKey.DEGRADE_SPM_REPORT_USE_PAYIMP_PAY_SUC)) {
                    return;
                }
                if (TextUtils.equals(str3, "9000") || TextUtils.equals(str3, Constant.CODE_GET_TOKEN_SUCCESS) || TextUtils.equals(str3, "6004")) {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
                mspContext.uploadLogForPayImp();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmExpPayActionEnd(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e161aaf1", new Object[]{mspContext, str});
        } else if (mspContext == null) {
        } else {
            try {
                String apLinkToken = mspContext.getApLinkToken();
                Context context = mspContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("resultEndCode", str);
                }
                if (!TextUtils.isEmpty("inner")) {
                    hashMap.put("resultBackType", "inner");
                }
                SpmTracker.expose(context, AP_LINK_SPM_PAY_ACTION_END, mspContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmExpPayActionEnd", "请求前: ".concat(String.valueOf(hashMap)));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmClickResignActive(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9474cb", new Object[]{mspTradeContext});
        } else if (mspTradeContext == null) {
        } else {
            try {
                String apLinkToken = mspTradeContext.getApLinkToken();
                String encode = URLEncoder.encode(mspTradeContext.getOrderInfo(), "utf8");
                Context context = mspTradeContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                if (!TextUtils.isEmpty(encode)) {
                    hashMap.put("orderStr", encode);
                }
                SpmTracker.click(context, AP_LINK_SPM_RESIGN_ACTIVE, mspTradeContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmExpResignActive", "请求前: ".concat(String.valueOf(hashMap)));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmClickBecomeActive(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a949e94", new Object[]{mspTradeContext});
        } else if (mspTradeContext == null) {
        } else {
            try {
                String apLinkToken = mspTradeContext.getApLinkToken();
                Context context = mspTradeContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                SpmTracker.click(context, AP_LINK_SPM_BECOME_ACTIVE, mspTradeContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmExpBecomeActive", "请求前: ".concat(String.valueOf(hashMap)));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: Throwable -> 0x00aa, TryCatch #1 {Throwable -> 0x00aa, blocks: (B:16:0x0032, B:18:0x0040, B:19:0x0048, B:21:0x0053, B:22:0x0058, B:24:0x005e, B:25:0x0064, B:27:0x006a, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:33:0x008f, B:15:0x002f), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: Throwable -> 0x00aa, TryCatch #1 {Throwable -> 0x00aa, blocks: (B:16:0x0032, B:18:0x0040, B:19:0x0048, B:21:0x0053, B:22:0x0058, B:24:0x005e, B:25:0x0064, B:27:0x006a, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:33:0x008f, B:15:0x002f), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: Throwable -> 0x00aa, TryCatch #1 {Throwable -> 0x00aa, blocks: (B:16:0x0032, B:18:0x0040, B:19:0x0048, B:21:0x0053, B:22:0x0058, B:24:0x005e, B:25:0x0064, B:27:0x006a, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:33:0x008f, B:15:0x002f), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: Throwable -> 0x00aa, TryCatch #1 {Throwable -> 0x00aa, blocks: (B:16:0x0032, B:18:0x0040, B:19:0x0048, B:21:0x0053, B:22:0x0058, B:24:0x005e, B:25:0x0064, B:27:0x006a, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:33:0x008f, B:15:0x002f), top: B:40:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[Catch: Throwable -> 0x00aa, TryCatch #1 {Throwable -> 0x00aa, blocks: (B:16:0x0032, B:18:0x0040, B:19:0x0048, B:21:0x0053, B:22:0x0058, B:24:0x005e, B:25:0x0064, B:27:0x006a, B:29:0x0071, B:30:0x0079, B:32:0x007f, B:33:0x008f, B:15:0x002f), top: B:40:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void spmExpFirstNetResponse(com.alipay.android.msp.core.context.MspTradeContext r8) {
        /*
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.msp.biz.substitute.SpmHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            if (r2 == 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r8
            java.lang.String r8 = "914803e"
            r1.ipc$dispatch(r8, r0)
            return
        L14:
            if (r8 != 0) goto L17
            return
        L17:
            java.lang.String r1 = r8.getOrderInfo()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "utf8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.lang.Throwable -> L2d
            int r2 = r8.getBizId()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector.getBizType(r2)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r1 = r0
        L2f:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r2)     // Catch: java.lang.Throwable -> Laa
        L32:
            java.util.Map r2 = r8.getClientLogData()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r8.getApLinkToken()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r5 = r8.getContext()     // Catch: java.lang.Throwable -> Laa
            if (r5 != 0) goto L48
            com.alipay.android.msp.framework.helper.GlobalHelper r5 = com.alipay.android.msp.framework.helper.GlobalHelper.getInstance()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r5 = r5.getContext()     // Catch: java.lang.Throwable -> Laa
        L48:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> Laa
            r6.<init>()     // Catch: java.lang.Throwable -> Laa
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Laa
            if (r7 != 0) goto L58
            java.lang.String r7 = "ap_link_token"
            r6.put(r7, r4)     // Catch: java.lang.Throwable -> Laa
        L58:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L64
            java.lang.String r4 = "orderStr"
            r6.put(r4, r1)     // Catch: java.lang.Throwable -> Laa
        L64:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto L6f
            java.lang.String r1 = "clientBizType"
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> Laa
        L6f:
            if (r2 == 0) goto L8f
            java.util.Set r0 = r2.keySet()     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Laa
        L79:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r4 = r2.get(r1)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Laa
            r6.put(r1, r4)     // Catch: java.lang.Throwable -> Laa
            goto L79
        L8f:
            java.lang.String r0 = "a283.b16116.c39778.d308614"
            java.lang.String r8 = r8.getBizCodeForKeySpm()     // Catch: java.lang.Throwable -> Laa
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.expose(r5, r0, r8, r3, r6)     // Catch: java.lang.Throwable -> Laa
            r8 = 2
            java.lang.String r0 = "SpmHelper#spmExpFirstNetResponse"
            java.lang.String r1 = "请求前: "
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> Laa
            com.alipay.android.msp.utils.LogUtil.record(r8, r0, r1)     // Catch: java.lang.Throwable -> Laa
            return
        Laa:
            r8 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.biz.substitute.SpmHelper.spmExpFirstNetResponse(com.alipay.android.msp.core.context.MspTradeContext):void");
    }

    public static void spmClickOnKeyBack(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ff54ac", new Object[]{mspContext});
        } else if (mspContext == null) {
        } else {
            try {
                String apLinkToken = mspContext.getApLinkToken();
                Context context = mspContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("ap_link_token", apLinkToken);
                }
                String str = "";
                if (mspContext.getMspUIClient() != null) {
                    MspWindowClient mspWindowClient = (MspWindowClient) mspContext.getMspUIClient();
                    MspWindowFrame currentWindowFrame = mspWindowClient != null ? mspWindowClient.getCurrentWindowFrame() : null;
                    if (currentWindowFrame != null && TextUtils.isEmpty(str)) {
                        str = currentWindowFrame.getTplId();
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("currentPage", str);
                }
                SpmTracker.click(context, AP_LINK_SPM_ON_BACK_KEY_DOWN, mspContext.getBizCodeForKeySpm(), 1, hashMap);
                LogUtil.record(2, "SpmHelper#spmClickOnKeyBack", "on back key: ".concat(String.valueOf(hashMap)));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static void spmClickRpcRequest(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d9efc9", new Object[]{mspContext, str});
        } else if (mspContext == null) {
        } else {
            try {
                Context context = mspContext.getContext();
                if (context == null) {
                    context = GlobalHelper.getInstance().getContext();
                }
                HashMap hashMap = new HashMap();
                String apLinkToken = mspContext.getApLinkToken();
                String globalSession = mspContext.getGlobalSession();
                if (!TextUtils.isEmpty(apLinkToken)) {
                    hashMap.put("apLinkToken", apLinkToken);
                }
                if (!TextUtils.isEmpty(globalSession)) {
                    hashMap.put("sessionId", globalSession);
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("actionName", str);
                }
                SpmTracker.click(context, AP_LINK_SPM_RPC_REQUEST, "", 1, hashMap);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
