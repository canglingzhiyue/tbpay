package com.taobao.share.clipboard;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nyy;
import tb.nzs;
import tb.nzz;
import tb.obe;
import tb.obm;

/* loaded from: classes8.dex */
public class TextTokenChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f19598a;
    private Handler c = new Handler(Looper.getMainLooper());
    private ShareReflowBizConfig b = (ShareReflowBizConfig) JSON.parseObject(obm.a("android_share", "newsharecheck"), ShareReflowBizConfig.class);

    /* renamed from: com.taobao.share.clipboard.TextTokenChecker$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19602a = new int[VerifyMode.values().length];

        static {
            try {
                f19602a[VerifyMode.judgeTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19602a[VerifyMode.passed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19602a[VerifyMode.regex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class ShareReflowBizConfig implements Serializable {
        @JSONField(name = "regexList")
        public List<String> list;
        @JSONField(name = "path")
        public String path;

        static {
            kge.a(-1436085324);
            kge.a(1028243835);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public enum VerifyMode {
        judgeTP,
        regex,
        passed
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a(Boolean bool);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f19598a;
    }

    public static /* synthetic */ void a(TextTokenChecker textTokenChecker, String str, VerifyMode verifyMode, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d96f086d", new Object[]{textTokenChecker, str, verifyMode, aVar});
        } else {
            textTokenChecker.a(str, verifyMode, aVar);
        }
    }

    public static /* synthetic */ void a(TextTokenChecker textTokenChecker, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02ec25f", new Object[]{textTokenChecker, new Boolean(z), aVar});
        } else {
            textTokenChecker.a(z, aVar);
        }
    }

    static {
        kge.a(-1485320411);
        f19598a = TextTokenChecker.class.getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.taobao.share.clipboard.TextTokenChecker$1] */
    public void a(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8256a7ad", new Object[]{this, str, aVar});
        } else if (StringUtils.isEmpty(str) || aVar == null) {
        } else {
            ShareReflowBizConfig shareReflowBizConfig = this.b;
            String str2 = shareReflowBizConfig != null ? shareReflowBizConfig.path : "0";
            final VerifyMode verifyMode = VerifyMode.judgeTP;
            if ("0".equals(str2)) {
                verifyMode = VerifyMode.judgeTP;
            } else if ("2".equals(str2)) {
                verifyMode = VerifyMode.regex;
            } else if ("3".equals(str2)) {
                verifyMode = VerifyMode.passed;
            }
            new AsyncTask<String, Void, Boolean>() { // from class: com.taobao.share.clipboard.TextTokenChecker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Boolean doInBackground(String[] strArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                }

                public Boolean a(String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Boolean) ipChange2.ipc$dispatch("af9a174", new Object[]{this, strArr});
                    }
                    TextTokenChecker.a(TextTokenChecker.this, str, verifyMode, aVar);
                    return true;
                }
            }.execute(str);
        }
    }

    private void a(String str, VerifyMode verifyMode, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148a6c19", new Object[]{this, str, verifyMode, aVar});
            return;
        }
        String str2 = f19598a;
        nyy.b(str2, "verify mode : " + verifyMode.name());
        int i = AnonymousClass4.f19602a[verifyMode.ordinal()];
        if (i == 1) {
            b(str, aVar);
        } else if (i == 2) {
            a(true, aVar);
        } else if (i == 3) {
            a(a(str), aVar);
        } else {
            a(false, aVar);
        }
    }

    private boolean b(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb370850", new Object[]{this, str, aVar})).booleanValue();
        }
        TLog.logd(f19598a, "judgeTaoPassword");
        nzs.a().a(ShareBizAdapter.getInstance().getAppEnv().b(), str, new nzz() { // from class: com.taobao.share.clipboard.TextTokenChecker.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzz
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                AppMonitor.Alarm.commitSuccess("share", "judgepassword", str);
                TextTokenChecker.a(TextTokenChecker.this, z, aVar);
            }

            @Override // tb.nzz
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                AppMonitor.Alarm.commitFail("share", "judgepassword", str2, str3, str);
                TextTokenChecker.a(TextTokenChecker.this, false, aVar);
            }
        });
        return false;
    }

    private void a(final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0ed33", new Object[]{this, new Boolean(z), aVar});
        } else if (aVar == null) {
        } else {
            this.c.post(new Runnable() { // from class: com.taobao.share.clipboard.TextTokenChecker.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = TextTokenChecker.a();
                    TLog.logd(a2, "isPassword : " + z);
                    aVar.a(Boolean.valueOf(z));
                }
            });
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        TLog.logd(f19598a, "regexCheck");
        ShareReflowBizConfig shareReflowBizConfig = this.b;
        if (shareReflowBizConfig != null && shareReflowBizConfig.list != null) {
            Iterator<String> it = this.b.list.iterator();
            while (it.hasNext() && !(z = obe.b(it.next(), str))) {
            }
        }
        return z;
    }
}
