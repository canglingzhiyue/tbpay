package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.clipboard.TextTokenChecker;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.picturepassword.c;
import com.taobao.share.taopassword.busniess.model.d;
import com.taobao.share.taopassword.busniess.model.g;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordCheckRequest;
import com.taobao.taobao.R;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class nzr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBShare#PasswordCheckBusiness";

    /* renamed from: a  reason: collision with root package name */
    private PasswordCheckRequest f31856a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static nzr f31861a;

        static {
            kge.a(-80591792);
            f31861a = new nzr();
        }

        public static /* synthetic */ nzr a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (nzr) ipChange.ipc$dispatch("f087db8", new Object[0]) : f31861a;
        }
    }

    static {
        kge.a(2025010557);
    }

    public static /* synthetic */ PasswordCheckRequest a(nzr nzrVar, PasswordCheckRequest passwordCheckRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PasswordCheckRequest) ipChange.ipc$dispatch("805b2d4e", new Object[]{nzrVar, passwordCheckRequest});
        }
        nzrVar.f31856a = passwordCheckRequest;
        return passwordCheckRequest;
    }

    public static /* synthetic */ boolean a(nzr nzrVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16999a40", new Object[]{nzrVar, str})).booleanValue() : nzrVar.a(str);
    }

    public static nzr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzr) ipChange.ipc$dispatch("f087db8", new Object[0]) : a.a();
    }

    private nzr() {
    }

    public void a(final Context context, final d dVar, final nzv nzvVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536f0d59", new Object[]{this, context, dVar, nzvVar});
        } else if (nzvVar == null || dVar == null) {
        } else {
            if (dVar.f19658a != null) {
                if (nyg.g()) {
                    try {
                        oam.a().a(context, dVar, new oas() { // from class: tb.nzr.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.oas
                            public void a(boolean z2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                                    return;
                                }
                                if (!z2 && nzr.a(nzr.this, dVar.f19658a)) {
                                    dVar.b = g.MIAO;
                                    z2 = true;
                                }
                                if (!z2) {
                                    nyy.a(nzr.TAG, "return: isPassword false");
                                    nzvVar.a();
                                    return;
                                }
                                try {
                                    nzr.this.b(context, dVar, nzvVar);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        z = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        nyy.c(TAG, "isWxAgainstModeCheckErr: " + e.getMessage());
                    }
                }
                if (z) {
                    return;
                }
                new TextTokenChecker().a(dVar.f19658a, new TextTokenChecker.a() { // from class: tb.nzr.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.share.clipboard.TextTokenChecker.a
                    public void a(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                            return;
                        }
                        if (!bool.booleanValue() && nzr.a(nzr.this, dVar.f19658a)) {
                            dVar.b = g.MIAO;
                            bool = true;
                        }
                        if (!bool.booleanValue()) {
                            nyy.a(nzr.TAG, "return: isPassword false");
                            nzvVar.a();
                            return;
                        }
                        try {
                            nzr.this.b(context, dVar, nzvVar);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
                return;
            }
            c.a(context, new c.a() { // from class: tb.nzr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.picturepassword.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AppMonitor.Alarm.commitFail("share", "querypassword", "", b.a(R.string.taobao_app_1010_1_18128));
                    }
                }

                @Override // com.taobao.share.picturepassword.c.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    nyy.b(nzr.TAG, b.a(R.string.taobao_app_1010_1_18114));
                    if (StringUtils.equals(obc.b(context, obc.TAO_PASSWORD_FROM_PIC_SAVE_KEY), str)) {
                        nyy.a(nzr.TAG, b.a(R.string.taobao_app_1010_1_18138));
                        return;
                    }
                    if (str != null) {
                        d dVar2 = dVar;
                        dVar2.f19658a = str;
                        dVar2.b = "pic";
                    }
                    if (nyg.a(nyg.KEY_CHECK_PWD_URL_VALIDATE, false) && !oad.a(str)) {
                        AppMonitor.Alarm.commitFail("share", "querypassword", "", b.a(R.string.taobao_app_1010_1_18107));
                        nyy.a(nzr.TAG, b.a(R.string.taobao_app_1010_1_18127));
                        return;
                    }
                    try {
                        nzr.this.b(context, dVar, nzvVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        nyy.c(nzr.TAG, "getTaoPassword" + e2.getMessage());
                        AppMonitor.Alarm.commitFail("share", "querypassword", "", e2.getLocalizedMessage());
                    }
                }
            });
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            return Pattern.compile(OrangeConfig.getInstance().getConfig("android_share", "taopassword_js", "")).matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void b(Context context, d dVar, nzv nzvVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b7ada", new Object[]{this, context, dVar, nzvVar});
        } else if (StringUtils.isEmpty(dVar.f19658a)) {
        } else {
            b();
            c(context, dVar, nzvVar);
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            ShareBizAdapter.getInstance().getShareWeexSdk().c();
        }
    }

    private void c(Context context, d dVar, final nzv nzvVar) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c347e85b", new Object[]{this, context, dVar, nzvVar});
            return;
        }
        if (dVar != null) {
            str = dVar.f19658a + "," + dVar.b;
        } else {
            str = "";
        }
        nzy nzyVar = new nzy() { // from class: tb.nzr.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzy
            public void a(com.taobao.share.taopassword.busniess.model.c cVar, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("843e59c8", new Object[]{this, cVar, obj});
                    return;
                }
                com.taobao.android.share.resource.a.a().a(com.taobao.android.share.resource.a.KEY_SHAREBACKGETPASSWORDMTOPEND);
                nzr.a(nzr.this, (PasswordCheckRequest) null);
                nzvVar.a((nzv) cVar, obj);
                AppMonitor.Alarm.commitSuccess("share", "querypassword", str);
                nyy.a("mtop.taobao.sharepassword.querypassword success");
            }

            @Override // tb.nzy
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                nzvVar.a(str2, str3);
                nyy.a("mtop.taobao.sharepassword.querypassword failed :" + str3);
                AppMonitor.Alarm.commitFail("share", "querypassword", str2, str3, str);
            }
        };
        if (nzvVar == null || StringUtils.isEmpty(dVar.f19658a)) {
            return;
        }
        this.f31856a = new PasswordCheckRequest();
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPARSERMATCHSTART);
        if (tdw.a().b()) {
            List<String> c = tdw.a().c(dVar.f19658a);
            boolean d = tdw.a().d();
            a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKPARSERMATCHEND);
            a2.a(com.taobao.android.share.resource.a.KEY_SHAREBACKGETPASSWORDMTOPSTART);
            if (c == null || c.size() <= 0) {
                return;
            }
            this.f31856a.request(context, new PasswordCheckRequest.a(JSONObject.toJSONString(c), dVar.b, c, d), nzyVar);
            return;
        }
        this.f31856a.request(context, new PasswordCheckRequest.a(dVar.f19658a, dVar.b), nzyVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        PasswordCheckRequest passwordCheckRequest = this.f31856a;
        if (passwordCheckRequest == null) {
            return;
        }
        passwordCheckRequest.cancel();
    }
}
